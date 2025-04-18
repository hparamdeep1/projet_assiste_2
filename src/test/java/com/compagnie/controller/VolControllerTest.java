package com.compagnie.controller;

import com.compagnie.model.Vol;
import com.compagnie.repository.VolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class VolControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private VolRepository volRepository;

    @Test
    public void testGetAllVols() throws Exception {
        mockMvc.perform(get("/api/vols"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testAddVol() throws Exception {
        String newVolJson = """
            {
              "origine": "TestVille",
              "destination": "TestDestination",
              "dateHeureDepart": "2025-05-10T12:00",
              "dateHeureArrivee": "2025-05-10T14:00"
            }
        """;

        mockMvc.perform(post("/api/vols")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newVolJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.origine").value("TestVille"))
                .andExpect(jsonPath("$.destination").value("TestDestination"));
    }
}
