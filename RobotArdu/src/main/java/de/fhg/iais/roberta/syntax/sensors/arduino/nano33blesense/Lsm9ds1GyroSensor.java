package de.fhg.iais.roberta.syntax.sensors.arduino.nano33blesense;

import de.fhg.iais.roberta.syntax.lang.expr.Expr;
import de.fhg.iais.roberta.syntax.sensor.InternalSensor;
import de.fhg.iais.roberta.transformer.forClass.NepoExpr;
import de.fhg.iais.roberta.transformer.forField.NepoValue;
import de.fhg.iais.roberta.typecheck.BlocklyType;
import de.fhg.iais.roberta.util.ast.BlocklyProperties;

@NepoExpr(category = "SENSOR", blocklyNames = {"robsensors_lsm9ds1_gyro_getDataAvailableSample"}, name = "LSM9DS1_GYRO", blocklyType = BlocklyType.BOOLEAN)
public final class Lsm9ds1GyroSensor extends InternalSensor {

    @NepoValue(name = "VARIABLE_X", type = BlocklyType.NUMBER_INT)
    public final Expr x;

    @NepoValue(name = "VARIABLE_Y", type = BlocklyType.NUMBER_INT)
    public final Expr y;

    @NepoValue(name = "VARIABLE_Z", type = BlocklyType.NUMBER_INT)
    public final Expr z;

    public Lsm9ds1GyroSensor(BlocklyProperties properties, Expr x, Expr y, Expr z) {
        super(properties, null);
        this.x = x;
        this.y = y;
        this.z = z;
        setReadOnly();
    }
}