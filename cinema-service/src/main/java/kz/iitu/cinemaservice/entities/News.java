package kz.iitu.cinemaservice.entities;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "news")
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

    @Column(name = "news_title")
    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    @Column(name = "news_content")
    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Column(name = "news_date")
    public Date getNewsPublishedDate() {
        return newsPublishedDate;
    }

    public void setNewsPublishedDate(Date newsPublishedDate) {
        this.newsPublishedDate = newsPublishedDate;
    }
}
