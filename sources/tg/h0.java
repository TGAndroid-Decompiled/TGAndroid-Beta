package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 extends TLObject {
    public static final int f55719j = 0;
    public int f55720a;
    public String f55721b;
    public String f55722c;
    public TLRPC.WebPage d;
    public boolean f55723e;
    public boolean f55724f = true;
    public int f55725i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10;
        int readInt32 = inputSerializedData.readInt32(z9);
        this.f55720a = readInt32;
        boolean z11 = false;
        if ((readInt32 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f55723e = z10;
        if ((readInt32 & 16) != 0) {
            z11 = true;
        }
        this.f55724f = z11;
        this.f55722c = inputSerializedData.readString(z9);
        if ((this.f55720a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.f55720a & 2) != 0) {
            this.f55721b = inputSerializedData.readString(z9);
        }
        if ((this.f55720a & 4) != 0) {
            this.f55725i = inputSerializedData.readInt32(z9);
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
            i7 = this.f55720a | 1;
        } else {
            i7 = this.f55720a & (-2);
        }
        this.f55720a = i7;
        if (!TextUtils.isEmpty(this.f55721b)) {
            i10 = this.f55720a | 2;
        } else {
            i10 = this.f55720a & (-3);
        }
        this.f55720a = i10;
        if (this.f55723e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f55720a = i11;
        if (this.f55724f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f55720a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f55722c);
        if ((this.f55720a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f55720a & 2) != 0) {
            outputSerializedData.writeString(this.f55721b);
        }
        if ((this.f55720a & 4) != 0) {
            outputSerializedData.writeInt32(this.f55725i);
        }
    }
}
