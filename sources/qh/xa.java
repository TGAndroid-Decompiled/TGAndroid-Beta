package qh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class xa extends TLObject {
    public double f46308a;
    public double f46309b;
    public String f46310c;
    public float d;

    public final String a() {
        if (ya.b()) {
            return Math.round(this.d) + "°C";
        }
        return android.support.v4.media.a.m((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f46308a);
        outputSerializedData.writeDouble(this.f46309b);
        outputSerializedData.writeString(this.f46310c);
        outputSerializedData.writeFloat(this.d);
    }
}
