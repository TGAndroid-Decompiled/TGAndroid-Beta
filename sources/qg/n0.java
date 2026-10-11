package qg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 extends TLObject {
    public static final int f46499j = 0;
    public int f46500a;
    public String f46501b;
    public String f46502c;
    public TLRPC.WebPage d;
    public boolean f46503e;
    public boolean f46504f = true;
    public int f46505i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f46500a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46503e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f46504f = z12;
        this.f46502c = inputSerializedData.readString(z10);
        if ((this.f46500a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f46500a & 2) != 0) {
            this.f46501b = inputSerializedData.readString(z10);
        }
        if ((this.f46500a & 4) != 0) {
            this.f46505i = inputSerializedData.readInt32(z10);
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
            i10 = this.f46500a | 1;
        } else {
            i10 = this.f46500a & (-2);
        }
        this.f46500a = i10;
        if (!TextUtils.isEmpty(this.f46501b)) {
            i11 = this.f46500a | 2;
        } else {
            i11 = this.f46500a & (-3);
        }
        this.f46500a = i11;
        if (this.f46503e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f46500a = i12;
        if (this.f46504f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f46500a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f46502c);
        if ((this.f46500a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f46500a & 2) != 0) {
            outputSerializedData.writeString(this.f46501b);
        }
        if ((this.f46500a & 4) != 0) {
            outputSerializedData.writeInt32(this.f46505i);
        }
    }
}
