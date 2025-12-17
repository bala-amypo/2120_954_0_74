package com.example.demo.service;
import java.util.Collection;
import java.uti.HashMap;
import java.uti.Map;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studententity;
@Servicepublic class Studententity{
    private Map<Integer,Studententity>details=new HashMap<>();
    public  Studententity saveData(Studenentity st){
        details.put(st.getId(),st);
        return st;
    }
    public Collection<Studententity>getAll(){
        return details.values();
    }
        public Studententity getById(int id){
            return details.get(id);
            public Studententity update(int id,Studententity st){
                details.put(id,st);
                return st;
            }
        }
    