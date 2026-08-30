package ph;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class za extends TLObject {
    public double f42673a;
    public double f42674b;
    public String f42675c;
    public float d;

    public final String a() {
        if (ab.b()) {
            return Math.round(this.d) + "°C";
        }
        return android.support.v4.media.a.m((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f42673a);
        outputSerializedData.writeDouble(this.f42674b);
        outputSerializedData.writeString(this.f42675c);
        outputSerializedData.writeFloat(this.d);
    }
}
