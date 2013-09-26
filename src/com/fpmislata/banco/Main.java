/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.math.BigDecimal;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //entidades
        
        EntidadBancaria entidadBanc1= new EntidadBancaria();
        entidadBanc1.setCif("Whatever");
        entidadBanc1.setCodigoEntidad(123456);
        entidadBanc1.setIdEntidad(1);
        entidadBanc1.setNombreEntidad("MalaMadre");
        entidadBanc1.setTipoEntidadBancaria(TipoEntidadBancaria.Banco);
        
        //sucursales
        
        SucursalBancaria sucursal1=new SucursalBancaria();
        sucursal1.setCodigoSucursal(654321);
        sucursal1.setEntidadBancaria(entidadBanc1);
        sucursal1.setIdSucursalBancaria(1);
        sucursal1.setNombre("Palomino");
        
        entidadBanc1.anyadirSucursal(sucursal1);
        
        SucursalBancaria sucursal2=new SucursalBancaria();
        sucursal1.setCodigoSucursal(8952314);
        sucursal1.setEntidadBancaria(entidadBanc1);
        sucursal1.setIdSucursalBancaria(2);
        sucursal1.setNombre("Ranita");
        
        entidadBanc1.anyadirSucursal(sucursal2);
        
        //cuentas
        
        CuentaBancaria cuentaB=new CuentaBancaria();
        cuentaB.setCif("145ert");
        cuentaB.setDc(7);
        cuentaB.setNumeroCuenta(147852369);
        cuentaB.setSaldo(6000);
        cuentaB.setSucursalBancaria(sucursal1);
        
        sucursal1.anyadirCuenta(cuentaB);
        
        
        CuentaBancaria cuentaB2=new CuentaBancaria();
        cuentaB.setCif("54h7yt65");
        cuentaB.setDc(12);
        cuentaB.setNumeroCuenta(787965214);
        cuentaB.setSaldo(2000);
        cuentaB.setSucursalBancaria(sucursal1);
        
        sucursal1.anyadirCuenta(cuentaB2);
        
        //movimientos
        
         MovimientoBancario movimiento1=new MovimientoBancario();
         movimiento1.setFecha("12-12-1234");
         movimiento1.setConcepto("Trabajo");
         movimiento1.setIdMovimientoBancario(1);
         movimiento1.setImporte(new BigDecimal(30));
         movimiento1.setSaldoTotal(new BigDecimal(5000));
         movimiento1.setTipoMovimientoBancario(TipoMovimientoBancario.Haber);
         
         cuentaB.anyadirMovimiento(movimiento1);
         
         
         MovimientoBancario movimiento2=new MovimientoBancario();
         movimiento1.setFecha("12-03-2013");
         movimiento1.setConcepto("Ocio");
         movimiento1.setIdMovimientoBancario(2);
         movimiento1.setImporte(new BigDecimal(90));
         movimiento1.setSaldoTotal(new BigDecimal(5000));
         movimiento1.setTipoMovimientoBancario(TipoMovimientoBancario.Debe);
         
         cuentaB.anyadirMovimiento(movimiento1);
                
    }
}
