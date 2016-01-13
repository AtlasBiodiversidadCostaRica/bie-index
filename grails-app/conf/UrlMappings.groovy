class UrlMappings {

    static mappings = {


        "/species"(controller: "search", action: "taxon")
        "/species/"(controller: "search", action: "taxon")
        "/species/$id**"(controller: "search", action: "taxon")
        "/species/$id**.json"(controller: "search", action: "taxon")
        "/species/lookup/bulk(.$format)?"(controller: "search", action: "speciesLookupBulk")
        "/species/shortProfile/$id**"(controller: "search", action: "shortProfile")
        "/species/shortProfile/$id**.json"(controller: "search", action: "shortProfile")
        "/taxon/$id**"(controller: "search", action: "taxon")
        "/guid/$name"(controller: "search", action: "guid")
        "/guid/batch(.$format)"(controller: "search", action: "getSpeciesForNames")
        "/auto"(controller: "search", action: "auto")
        "/search/auto(.$format)?"(controller: "search", action: "auto")
        "/search(.$format)?"(controller: "search", action: "search")
        "/classification/"(controller: "search", action: "classification")
        "/classification/$id**"(controller: "search", action: "classification")
        "/childConcepts/$id**"(controller: "search", action: "childConcepts")
        "/imageSearch/$id**"(controller: "search", action: "imageSearch")
        "/imageSearch/"(controller: "search", action: "imageSearch")
        "/imageSearch"(controller: "search", action: "imageSearch")
        "/species/guids/bulklookup(.$format)?"(controller: "search", action: "bulkGuidLookup")
        "/download"(controller: "search", action: "download")
        "/habitats"(controller: "search", action: "habitats")
        "/habitats/tree"(controller: "search", action: "habitatTree")
        "/habitat/ids/$guid**"(controller: "search", action: "getHabitatIDs")
        "/habitat/$guid**"(controller: "search", action: "getHabitat")

        "/ranks"(controller: "import", action: "ranks")

        "/admin"(controller: "admin")
        "/admin/"(controller: "admin")
        "/admin/indexFields(.$format)?"(controller: "admin", action: "indexFields")

        "/admin/import/$action?/$id?(.$format)?"(controller: "import")

        "/"(view: "/index")
        "500"(view: '/error')
    }
}
