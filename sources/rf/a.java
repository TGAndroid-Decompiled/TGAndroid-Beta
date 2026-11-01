package rf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f46499a;
    public long f46500b;
    public TLRPC.InputStorePaymentPurpose f46501c;

    public static a a(int i10, SerializedData serializedData) {
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
        this.f46499a = inputSerializedData.readInt32(z10);
        this.f46500b = inputSerializedData.readInt64(z10);
        if ((this.f46499a & 1) != 0) {
            this.f46501c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f46499a);
        outputSerializedData.writeInt64(this.f46500b);
        if ((this.f46499a & 1) != 0) {
            this.f46501c.serializeToStream(outputSerializedData);
        }
    }
}
