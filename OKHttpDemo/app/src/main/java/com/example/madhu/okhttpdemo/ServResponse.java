package com.example.madhu.okhttpdemo;

import java.util.List;

/**
 * Created by MADHU on 12-12-2016.
 */
public class ServResponse
{

    /**
     * Search : [{"Title":"Batman: Mask of the Phantasm","Year":"1993","imdbID":"tt0106364","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMzODU0NTYxN15BMl5BanBnXkFtZTcwNDUxNzUyMQ@@._V1_SX300.jpg"},{"Title":"Batman: The Killing Joke","Year":"2016","imdbID":"tt4853102","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BODcxYTc5NmQtZTZjNS00MjRiLTgxMjQtN2VhYjY2YjdmMzYzXkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_SX300.jpg"},{"Title":"Batman: The Movie","Year":"1966","imdbID":"tt0060153","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTkzODAyMjg2Ml5BMl5BanBnXkFtZTgwMzI4NzM1MjE@._V1_SX300.jpg"},{"Title":"Batman: Year One","Year":"2011","imdbID":"tt1672723","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI0NjM0MDQxMF5BMl5BanBnXkFtZTgwNzQzOTAwNzE@._V1_SX300.jpg"},{"Title":"Batman: Gotham Knight","Year":"2008","imdbID":"tt1117563","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ1NjExODcyNl5BMl5BanBnXkFtZTcwMTk0MDc4MQ@@._V1_SX300.jpg"},{"Title":"Batman: Assault on Arkham","Year":"2014","imdbID":"tt3139086","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTllYjcyMjQtZGY0Mi00ZjI0LThiYmYtZWI2MDUyMmY0OWE5XkEyXkFqcGdeQXVyNTAyNDQ2NjI@._V1_SX300.jpg"},{"Title":"Batman: Arkham City","Year":"2011","imdbID":"tt1568322","Type":"game","Poster":"http://ia.media-imdb.com/images/M/MV5BZDhjZTVkZGYtNWFmMC00MDU5LWIxZjEtNzQ4NjU1OTNlNTJlXkEyXkFqcGdeQXVyNTM3NzExMDQ@._V1_SX300.jpg"},{"Title":"Batman Beyond","Year":"1999\u20132001","imdbID":"tt0147746","Type":"series","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTA3MjkzNDM0OTBeQTJeQWpwZ15BbWU3MDk3ODM5MjE@._V1._CR1,0,208,299_SY132_CR1,0,89,132_AL_.jpg_V1_SX300.jpg"},{"Title":"Superman/Batman: Apocalypse","Year":"2010","imdbID":"tt1673430","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYzMDU0MjEwOF5BMl5BanBnXkFtZTcwOTA5ODc2Mw@@._V1_SX300.jpg"},{"Title":"Batman Beyond: Return of the Joker","Year":"2000","imdbID":"tt0233298","Type":"movie","Poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4MDQwMDUxNF5BMl5BanBnXkFtZTcwODY2NDEyMQ@@._V1_SX300.jpg"}]
     * totalResults : 323
     * Response : True
     */

    private String totalResults;
    private String Response;
    private List<Search> Search;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public List<Search> getSearch() {
        return Search;
    }

    public void setSearch(List<Search> Search) {
        this.Search = Search;
    }

    public static class Search {
        /**
         * Title : Batman: Mask of the Phantasm
         * Year : 1993
         * imdbID : tt0106364
         * Type : movie
         * Poster : https://images-na.ssl-images-amazon.com/images/M/MV5BMTMzODU0NTYxN15BMl5BanBnXkFtZTcwNDUxNzUyMQ@@._V1_SX300.jpg
         */

        private String Title;
        private String Year;
        private String imdbID;
        private String Type;
        private String Poster;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String Year) {
            this.Year = Year;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public String getPoster() {
            return Poster;
        }

        public void setPoster(String Poster) {
            this.Poster = Poster;
        }
    }
}