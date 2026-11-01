package vh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class k9 extends TLObject {
    public double f51453a;
    public double f51454b;
    public String f51455c;
    public float d;

    public final String a() {
        if (l9.a()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.p(new StringBuilder(), (int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F");
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f51453a);
        outputSerializedData.writeDouble(this.f51454b);
        outputSerializedData.writeString(this.f51455c);
        outputSerializedData.writeFloat(this.d);
    }
}
