package com.example.madhu.mapsdemo;

import java.util.List;

/**
 * Created by MADHU on 27-12-2016.
 */

public class ServResponse
{

    /**
     * html_attributions : []
     * results : [{"geometry":{"location":{"lat":12.9825214,"lng":77.60705519999999},"viewport":{"northeast":{"lat":12.9826432,"lng":77.6071083},"southwest":{"lat":12.9824808,"lng":77.60703749999999}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"11e242bc605f6cbb0e954131afe08b767c3c2641","name":"DBS ATM","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":670,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104242800355532420355/photos\">Simple Life<\/a>"],"photo_reference":"CoQBdwAAACFKHknC2ot6o2o0egAicQ68LcbBi2GFNGe2urNn4CKdB3RkGhzczoFFmwKc9kuWoJfFqZFlnmd6N8ily2MHCzsUr5opkaWH-sOVwXGjD67ehgZBHY0bdjYAwyN5OQsEvb4VZeXf8o2GPAARL4_eVyaFYmGBOyUOSup2KqL-7kVGEhBsm40VAa0WtpF8ICur8e4oGhRM7Xpso3bE_2NHUUvyY2bbMOLl6g","width":1280}],"place_id":"ChIJfRGVNIgWrjsREDNRLULqaP4","reference":"CmRSAAAAV-0I72eEtj0gir3buNHNWh9xqDO2B16ty6N3hjPg7uqRVrXSsM0SiHxfy6gn8z7moAerzP_-he0n0NfjYAXj9CpEYuKBHrqE1NL54cO_LMitvaEjAlp-o-0mAsxrBQQ0EhBI9r_uOu1kDu73lDBbuZCfGhQ7UppDye5hRgjIP45-FSkz4I_T2Q","scope":"GOOGLE","types":["atm","finance","point_of_interest","establishment"],"vicinity":"next police station, Commercial Street, Tasker Town, Shivaji Nagar, Bengaluru"},{"geometry":{"location":{"lat":12.9311848,"lng":77.5837279},"viewport":{"northeast":{"lat":12.93118545,"lng":77.58393534999999},"southwest":{"lat":12.93118285,"lng":77.58365875}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"eb88effd35a775997a2566564ea9505f266d96bd","name":"DBS Bank ATM","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJTRiaa5gVrjsRoyA-LJdUChc","reference":"CmRRAAAA7liLtnVFW1k8e7eK-hMTctZnVC0Ul8JvqT-c0E1sc7lq_WvgpwWpFQoGoUA9Yfq2NtI_fxfuxTkgdu6yRnQ-EgXT0DOZJb7cEQpjTKPR35NFJRuYtP9ROU83HYiJwNQFEhClVrxX-BjDhe4msCRBVeEEGhQiBkdpftFtzTR5YGMmqZoZ5Y34CA","scope":"GOOGLE","types":["atm","finance","point_of_interest","establishment"],"vicinity":"9th Main Road, Jayanagar East, Jaya Nagar East, Banashankari, Bengaluru"},{"geometry":{"location":{"lat":12.9609144,"lng":77.5751176},"viewport":{"northeast":{"lat":12.96104115,"lng":77.575162},"southwest":{"lat":12.96087215,"lng":77.5751028}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"70c985cedd976d095a23e6525085804d671237f4","name":"Digibank DBS ATM","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3072,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107336188543999441135/photos\">devanand subbaraj<\/a>"],"photo_reference":"CoQBdwAAAG0sR61pMIsaFCVdbjTpIRg33PNjWLG5m-0_rbfZQk9krhxY3xUf-TjsyobZl5w1QU4XOokTfjkRY6wVeKaOcExDJFJhrr283utfNlV7aRk-GUiQn56UHNG4lTofOKbP_d6X1c2VG0PPb8Q0ymB5MHspuIadMqYsfThQFHWKjRZEEhATpnHYJWQQAlGhYtq2_WyxGhSfNndpEz16oT4lGxxrr2cq6guduQ","width":4096}],"place_id":"ChIJc4BIYeMVrjsROFx-Sda7Az4","reference":"CmRRAAAAk5UYb9NTvamZnQurK-nMdMWiA0zVB_SwvFaMy_zLfMX1WYQVwf1JQGeTQWqEZGz9CLkYGwSAyiLaR1om5F5UEITN9NiN4VKrjgyeYF5Yu2UPhQRSaLofH_12WLcfrpjPEhB0PMvPFdCCJrOhJkjMeJ_9GhQntRjRMcKq9N2L7T37cmohSmvGeQ","scope":"GOOGLE","types":["atm","finance","point_of_interest","establishment"],"vicinity":"34,, KR Road, Tata Silk Farm, Kalasipalya, Bengaluru"}]
     * status : OK
     */

    private String status;
    private List<?> html_attributions;
    private List<Results> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public static class Results {
        /**
         * geometry : {"location":{"lat":12.9825214,"lng":77.60705519999999},"viewport":{"northeast":{"lat":12.9826432,"lng":77.6071083},"southwest":{"lat":12.9824808,"lng":77.60703749999999}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png
         * id : 11e242bc605f6cbb0e954131afe08b767c3c2641
         * name : DBS ATM
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * photos : [{"height":670,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104242800355532420355/photos\">Simple Life<\/a>"],"photo_reference":"CoQBdwAAACFKHknC2ot6o2o0egAicQ68LcbBi2GFNGe2urNn4CKdB3RkGhzczoFFmwKc9kuWoJfFqZFlnmd6N8ily2MHCzsUr5opkaWH-sOVwXGjD67ehgZBHY0bdjYAwyN5OQsEvb4VZeXf8o2GPAARL4_eVyaFYmGBOyUOSup2KqL-7kVGEhBsm40VAa0WtpF8ICur8e4oGhRM7Xpso3bE_2NHUUvyY2bbMOLl6g","width":1280}]
         * place_id : ChIJfRGVNIgWrjsREDNRLULqaP4
         * reference : CmRSAAAAV-0I72eEtj0gir3buNHNWh9xqDO2B16ty6N3hjPg7uqRVrXSsM0SiHxfy6gn8z7moAerzP_-he0n0NfjYAXj9CpEYuKBHrqE1NL54cO_LMitvaEjAlp-o-0mAsxrBQQ0EhBI9r_uOu1kDu73lDBbuZCfGhQ7UppDye5hRgjIP45-FSkz4I_T2Q
         * scope : GOOGLE
         * types : ["atm","finance","point_of_interest","establishment"]
         * vicinity : next police station, Commercial Street, Tasker Town, Shivaji Nagar, Bengaluru
         */

        private Geometry geometry;
        private String icon;
        private String id;
        private String name;
        private OpeningHours opening_hours;
        private String place_id;
        private String reference;
        private String scope;
        private String vicinity;
        private List<Photos> photos;
        private List<String> types;

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHours getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHours opening_hours) {
            this.opening_hours = opening_hours;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public List<Photos> getPhotos() {
            return photos;
        }

        public void setPhotos(List<Photos> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class Geometry {
            /**
             * location : {"lat":12.9825214,"lng":77.60705519999999}
             * viewport : {"northeast":{"lat":12.9826432,"lng":77.6071083},"southwest":{"lat":12.9824808,"lng":77.60703749999999}}
             */

            private Location location;
            private Viewport viewport;

            public Location getLocation() {
                return location;
            }

            public void setLocation(Location location) {
                this.location = location;
            }

            public Viewport getViewport() {
                return viewport;
            }

            public void setViewport(Viewport viewport) {
                this.viewport = viewport;
            }

            public static class Location {
                /**
                 * lat : 12.9825214
                 * lng : 77.60705519999999
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class Viewport {
                /**
                 * northeast : {"lat":12.9826432,"lng":77.6071083}
                 * southwest : {"lat":12.9824808,"lng":77.60703749999999}
                 */

                private Northeast northeast;
                private Southwest southwest;

                public Northeast getNortheast() {
                    return northeast;
                }

                public void setNortheast(Northeast northeast) {
                    this.northeast = northeast;
                }

                public Southwest getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(Southwest southwest) {
                    this.southwest = southwest;
                }

                public static class Northeast {
                    /**
                     * lat : 12.9826432
                     * lng : 77.6071083
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class Southwest {
                    /**
                     * lat : 12.9824808
                     * lng : 77.60703749999999
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHours {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class Photos{
            /**
             * height : 670
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/104242800355532420355/photos\">Simple Life<\/a>"]
             * photo_reference : CoQBdwAAACFKHknC2ot6o2o0egAicQ68LcbBi2GFNGe2urNn4CKdB3RkGhzczoFFmwKc9kuWoJfFqZFlnmd6N8ily2MHCzsUr5opkaWH-sOVwXGjD67ehgZBHY0bdjYAwyN5OQsEvb4VZeXf8o2GPAARL4_eVyaFYmGBOyUOSup2KqL-7kVGEhBsm40VAa0WtpF8ICur8e4oGhRM7Xpso3bE_2NHUUvyY2bbMOLl6g
             * width : 1280
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}
