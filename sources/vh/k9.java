package vh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class k9 extends TLObject {
    public double f51438a;
    public double f51439b;
    public String f51440c;
    public float d;

    public final String a() {
        if (l9.a()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.p(new StringBuilder(), (int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F");
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f51438a);
        outputSerializedData.writeDouble(this.f51439b);
        outputSerializedData.writeString(this.f51440c);
        outputSerializedData.writeFloat(this.d);
    }
}
