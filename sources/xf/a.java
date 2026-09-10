package xf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f45091a;
    public long f45092b;
    public TLRPC.InputStorePaymentPurpose f45093c;

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
        this.f45091a = inputSerializedData.readInt32(z10);
        this.f45092b = inputSerializedData.readInt64(z10);
        if ((this.f45091a & 1) != 0) {
            this.f45093c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f45091a);
        outputSerializedData.writeInt64(this.f45092b);
        if ((this.f45091a & 1) != 0) {
            this.f45093c.serializeToStream(outputSerializedData);
        }
    }
}
