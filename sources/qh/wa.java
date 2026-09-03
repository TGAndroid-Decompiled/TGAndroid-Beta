package qh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class wa extends TLObject {
    public double f46281a;
    public double f46282b;
    public String f46283c;
    public float d;

    public final String a() {
        if (xa.b()) {
            return Math.round(this.d) + "°C";
        }
        return android.support.v4.media.a.m((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f46281a);
        outputSerializedData.writeDouble(this.f46282b);
        outputSerializedData.writeString(this.f46283c);
        outputSerializedData.writeFloat(this.d);
    }
}
