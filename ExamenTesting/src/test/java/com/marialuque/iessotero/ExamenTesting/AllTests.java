package com.marialuque.iessotero.ExamenTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cuentas.Cuenta;
import empleado.Empleado;

@RunWith(Suite.class)
@SuiteClasses({Cuenta.class,Empleado.class})
public class AllTests {

}
