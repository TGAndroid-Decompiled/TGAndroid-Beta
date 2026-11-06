package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 extends TLObject {
    public static final int f55615j = 0;
    public int f55616a;
    public String f55617b;
    public String f55618c;
    public TLRPC.WebPage d;
    public boolean f55619e;
    public boolean f55620f = true;
    public int f55621i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10;
        int readInt32 = inputSerializedData.readInt32(z9);
        this.f55616a = readInt32;
        boolean z11 = false;
        if ((readInt32 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f55619e = z10;
        if ((readInt32 & 16) != 0) {
            z11 = true;
        }
        this.f55620f = z11;
        this.f55618c = inputSerializedData.readString(z9);
        if ((this.f55616a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.f55616a & 2) != 0) {
            this.f55617b = inputSerializedData.readString(z9);
        }
        if ((this.f55616a & 4) != 0) {
            this.f55621i = inputSerializedData.readInt32(z9);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        int i11;
        int i12;
        outputSerializedData.writeInt32(-625858389);
        if (this.d != null) {
            i7 = this.f55616a | 1;
        } else {
            i7 = this.f55616a & (-2);
        }
        this.f55616a = i7;
        if (!TextUtils.isEmpty(this.f55617b)) {
            i10 = this.f55616a | 2;
        } else {
            i10 = this.f55616a & (-3);
        }
        this.f55616a = i10;
        if (this.f55619e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f55616a = i11;
        if (this.f55620f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f55616a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f55618c);
        if ((this.f55616a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f55616a & 2) != 0) {
            outputSerializedData.writeString(this.f55617b);
        }
        if ((this.f55616a & 4) != 0) {
            outputSerializedData.writeInt32(this.f55621i);
        }
    }
}
