package qg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 extends TLObject {
    public static final int f45200j = 0;
    public int f45201a;
    public String f45202b;
    public String f45203c;
    public TLRPC.WebPage d;
    public boolean f45204e;
    public boolean f45205f = true;
    public int f45206i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f45201a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45204e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f45205f = z12;
        this.f45203c = inputSerializedData.readString(z10);
        if ((this.f45201a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f45201a & 2) != 0) {
            this.f45202b = inputSerializedData.readString(z10);
        }
        if ((this.f45201a & 4) != 0) {
            this.f45206i = inputSerializedData.readInt32(z10);
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
            i10 = this.f45201a | 1;
        } else {
            i10 = this.f45201a & (-2);
        }
        this.f45201a = i10;
        if (!TextUtils.isEmpty(this.f45202b)) {
            i11 = this.f45201a | 2;
        } else {
            i11 = this.f45201a & (-3);
        }
        this.f45201a = i11;
        if (this.f45204e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f45201a = i12;
        if (this.f45205f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f45201a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f45203c);
        if ((this.f45201a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f45201a & 2) != 0) {
            outputSerializedData.writeString(this.f45202b);
        }
        if ((this.f45201a & 4) != 0) {
            outputSerializedData.writeInt32(this.f45206i);
        }
    }
}
