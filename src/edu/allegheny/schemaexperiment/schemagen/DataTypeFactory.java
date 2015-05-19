package edu.allegheny.schemaexperiment.schemagen;

import org.schemaanalyst.sqlrepresentation.*;
import org.schemaanalyst.sqlrepresentation.datatype.*;

public class DataTypeFactory {

    public static final int numSupportedTypes = 2;

    public static BooleanDataType getBooleanDataType(){
        return (new BooleanDataType());
    }
    
    public static CharDataType getCharDataType(){
        return (new CharDataType());
    }

}