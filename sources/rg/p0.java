package rg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p0 extends TLObject {
    public static final int f45434j = 0;
    public int f45435a;
    public String f45436b;
    public String f45437c;
    public TLRPC.WebPage d;
    public boolean f45438e;
    public boolean f45439f = true;
    public int f45440i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f45435a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45438e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f45439f = z12;
        this.f45437c = inputSerializedData.readString(z10);
        if ((this.f45435a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f45435a & 2) != 0) {
            this.f45436b = inputSerializedData.readString(z10);
        }
        if ((this.f45435a & 4) != 0) {
            this.f45440i = inputSerializedData.readInt32(z10);
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
            i10 = this.f45435a | 1;
        } else {
            i10 = this.f45435a & (-2);
        }
        this.f45435a = i10;
        if (!TextUtils.isEmpty(this.f45436b)) {
            i11 = this.f45435a | 2;
        } else {
            i11 = this.f45435a & (-3);
        }
        this.f45435a = i11;
        if (this.f45438e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f45435a = i12;
        if (this.f45439f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f45435a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f45437c);
        if ((this.f45435a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f45435a & 2) != 0) {
            outputSerializedData.writeString(this.f45436b);
        }
        if ((this.f45435a & 4) != 0) {
            outputSerializedData.writeInt32(this.f45440i);
        }
    }
}
