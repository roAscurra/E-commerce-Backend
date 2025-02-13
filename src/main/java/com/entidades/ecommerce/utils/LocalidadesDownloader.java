package com.entidades.ecommerce.utils;

//
//@Component
//class LocalidadesDownloader implements CommandLineRunner {
//
//    @Autowired
//    private LocalidadRepository localidadRepository;
//
//    @Autowired
//    private ProvinciaRepository provinciaRepository;
//
//    @Autowired
//    private PaisRepository paisRepository;
//
//    @Override
//    public void run(String... args) {
//        RestTemplate restTemplate = new RestTemplate();
//        String jsonResponse = restTemplate.getForObject("https://infra.datos.gob.ar/georef/departamentos.json", String.class);
//        JSONObject jsonObject = new JSONObject(jsonResponse);
//        JSONArray departamentosArray = jsonObject.getJSONArray("departamentos");
//
//// Obtener el país
//        Pais pais = paisRepository.findById(1L).orElseGet(() -> {
//            Pais newPais = new Pais();
//            newPais.setId(1L);
//            newPais.setNombre("Argentina");
//            return paisRepository.save(newPais);
//        });
//
//        localidadRepository.deleteAll();
//
//        List<Localidad> localidadList = new ArrayList<>();
//
//        departamentosArray.forEach(obj -> {
//            JSONObject departamentoJson = (JSONObject) obj;
//
//            Long localidadId = Long.parseLong(departamentoJson.getString("id"));
//            String localidadNombre = departamentoJson.getString("nombre");
//
//            JSONObject provinciaJson = departamentoJson.getJSONObject("provincia");
//            Long provinciaId = Long.parseLong(provinciaJson.getString("id"));
//            String provinciaNombre = provinciaJson.getString("nombre");
//
//            // Verificar si la provincia ya existe por nombre, si no, crearla y guardarla
//            Provincia provincia = provinciaRepository.findByNombre(provinciaNombre);
//            if (provincia == null) {
//                provincia = new Provincia();
//                provincia.setId(provinciaId);
//                provincia.setNombre(provinciaNombre);
//                provincia.setPais(pais);
//                provincia = provinciaRepository.save(provincia);
//            }
//
//            Localidad localidad = new Localidad();
//            localidad.setId(localidadId);
//            localidad.setNombre(localidadNombre);
//            localidad.setProvincia(provincia);
//
//            localidadList.add(localidad);
//        });
//
//        localidadRepository.saveAll(localidadList);
//    }
//}