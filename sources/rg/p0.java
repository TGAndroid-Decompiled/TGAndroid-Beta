package rg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p0 extends TLObject {
    public static final int f44444j = 0;
    public int f44445a;
    public String f44446b;
    public String f44447c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f44448f = true;
    public int f44449i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f44445a = readInt32;
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
        this.f44448f = z12;
        this.f44447c = inputSerializedData.readString(z10);
        if ((this.f44445a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f44445a & 2) != 0) {
            this.f44446b = inputSerializedData.readString(z10);
        }
        if ((this.f44445a & 4) != 0) {
            this.f44449i = inputSerializedData.readInt32(z10);
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
            i10 = this.f44445a | 1;
        } else {
            i10 = this.f44445a & (-2);
        }
        this.f44445a = i10;
        if (!TextUtils.isEmpty(this.f44446b)) {
            i11 = this.f44445a | 2;
        } else {
            i11 = this.f44445a & (-3);
        }
        this.f44445a = i11;
        if (this.e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f44445a = i12;
        if (this.f44448f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f44445a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f44447c);
        if ((this.f44445a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f44445a & 2) != 0) {
            outputSerializedData.writeString(this.f44446b);
        }
        if ((this.f44445a & 4) != 0) {
            outputSerializedData.writeInt32(this.f44449i);
        }
    }
}
