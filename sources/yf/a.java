package yf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f47044a;
    public long f47045b;
    public TLRPC.InputStorePaymentPurpose f47046c;

    public static a a(SerializedData serializedData, int i10) {
        TLObject tLObject;
        if (i10 != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (a) TLObject.TLdeserialize(a.class, tLObject, serializedData, i10, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f47044a = inputSerializedData.readInt32(z10);
        this.f47045b = inputSerializedData.readInt64(z10);
        if ((this.f47044a & 1) != 0) {
            this.f47046c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f47044a);
        outputSerializedData.writeInt64(this.f47045b);
        if ((this.f47044a & 1) != 0) {
            this.f47046c.serializeToStream(outputSerializedData);
        }
    }
}
