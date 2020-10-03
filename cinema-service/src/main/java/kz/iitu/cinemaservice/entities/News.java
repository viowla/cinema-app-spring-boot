package kz.iitu.cinemaservice.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "news")
@Getter
@Setter
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newsId;

    private String newsTitle;
    private String newsContent;
    private Date newsPublishedDate;

    public News() {
    }

    public News(String title, String contentText,  Date datePublished) {
        this.newsTitle = title;
        this.newsContent = contentText;
        this.newsPublishedDate = datePublished;
    }

}
