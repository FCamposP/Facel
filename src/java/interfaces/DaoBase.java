/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author fabry
 * @param <T>
 * @param <K>
 */
public interface DaoBase<T,K> {
    
    void insertar(T a) throws Exception;
    void modificar (T a) throws Exception;
    void eliminar (T a) throws Exception;
    List<T> obtenerRegistros() throws Exception;
    T obtener (K id) throws Exception;
}
