package model;

public class UnZipFileModel {
    private String pathZipFile;
    private String pathExtract;

    public UnZipFileModel() {
    }

    public UnZipFileModel(String pathZipFile, String pathExtract) {
        this.pathZipFile = pathZipFile;
        this.pathExtract = pathExtract;
    }

    public String getPathZipFile() {
        return pathZipFile;
    }

    public void setPathZipFile(String pathZipFile) {
        this.pathZipFile = pathZipFile;
    }

    public String getPathExtract() {
        return pathExtract;
    }

    public void setPathExtract(String pathExtract) {
        this.pathExtract = pathExtract;
    }
    
}
