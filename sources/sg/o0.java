package sg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o0 extends TLObject {
    public static final int f48393j = 0;
    public int f48394a;
    public String f48395b;
    public String f48396c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f48397f = true;
    public int f48398i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f48394a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f48397f = z12;
        this.f48396c = inputSerializedData.readString(z10);
        if ((this.f48394a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f48394a & 2) != 0) {
            this.f48395b = inputSerializedData.readString(z10);
        }
        if ((this.f48394a & 4) != 0) {
            this.f48398i = inputSerializedData.readInt32(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        int i11;
        int i12;
        int i13;
        outputSerializedData.writeInt32(-625858389);
        if (this.d != null) {
            i10 = this.f48394a | 1;
        } else {
            i10 = this.f48394a & (-2);
        }
        this.f48394a = i10;
        if (!TextUtils.isEmpty(this.f48395b)) {
            i11 = this.f48394a | 2;
        } else {
            i11 = this.f48394a & (-3);
        }
        this.f48394a = i11;
        if (this.e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f48394a = i12;
        if (this.f48397f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f48394a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f48396c);
        if ((this.f48394a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f48394a & 2) != 0) {
            outputSerializedData.writeString(this.f48395b);
        }
        if ((this.f48394a & 4) != 0) {
            outputSerializedData.writeInt32(this.f48398i);
        }
    }
}
