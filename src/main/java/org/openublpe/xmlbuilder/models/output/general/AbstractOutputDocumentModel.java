package org.openublpe.xmlbuilder.models.output.general;

import org.openublpe.xmlbuilder.models.output.ClienteOutputModel;
import org.openublpe.xmlbuilder.models.output.FirmanteOutputModel;
import org.openublpe.xmlbuilder.models.output.ProveedorOutputModel;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

public class AbstractOutputDocumentModel {

    @NotNull
    @Min(0)
    @Max(1)
    private BigDecimal igv;

    @NotNull
    @Min(0)
    @Max(100)
    private BigDecimal igvPercent;

    @NotBlank
    private String serieNumero;

    @NotBlank
    private String fechaEmision;

    @NotBlank
    private String horaEmision;

    @NotBlank
    private String moneda;

    @Valid
    private FirmanteOutputModel firmante;

    @Valid
    @NotNull
    private ProveedorOutputModel proveedor;

    @Valid
    @NotNull
    private ClienteOutputModel cliente;

    @NotNull
    @Min(1)
    private Integer detalleSize;

    @Valid
    @NotEmpty
    private List<DetalleOutputModel> detalle;

    public String getSerieNumero() {
        return serieNumero;
    }

    public void setSerieNumero(String serieNumero) {
        this.serieNumero = serieNumero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public FirmanteOutputModel getFirmante() {
        return firmante;
    }

    public void setFirmante(FirmanteOutputModel firmante) {
        this.firmante = firmante;
    }

    public ProveedorOutputModel getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorOutputModel proveedor) {
        this.proveedor = proveedor;
    }

    public ClienteOutputModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteOutputModel cliente) {
        this.cliente = cliente;
    }

    public Integer getDetalleSize() {
        return detalleSize;
    }

    public void setDetalleSize(Integer detalleSize) {
        this.detalleSize = detalleSize;
    }

    public List<DetalleOutputModel> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleOutputModel> detalle) {
        this.detalle = detalle;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getIgvPercent() {
        return igvPercent;
    }

    public void setIgvPercent(BigDecimal igvPercent) {
        this.igvPercent = igvPercent;
    }
}