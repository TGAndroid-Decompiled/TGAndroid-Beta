package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 extends TLObject {
    public static final int f57319j = 0;
    public int f57320a;
    public String f57321b;
    public String f57322c;
    public TLRPC.WebPage d;
    public boolean f57323e;
    public boolean f57324f = true;
    public int f57325i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f57320a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57323e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f57324f = z12;
        this.f57322c = inputSerializedData.readString(z10);
        if ((this.f57320a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f57320a & 2) != 0) {
            this.f57321b = inputSerializedData.readString(z10);
        }
        if ((this.f57320a & 4) != 0) {
            this.f57325i = inputSerializedData.readInt32(z10);
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
            i7 = this.f57320a | 1;
        } else {
            i7 = this.f57320a & (-2);
        }
        this.f57320a = i7;
        if (!TextUtils.isEmpty(this.f57321b)) {
            i10 = this.f57320a | 2;
        } else {
            i10 = this.f57320a & (-3);
        }
        this.f57320a = i10;
        if (this.f57323e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f57320a = i11;
        if (this.f57324f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f57320a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f57322c);
        if ((this.f57320a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f57320a & 2) != 0) {
            outputSerializedData.writeString(this.f57321b);
        }
        if ((this.f57320a & 4) != 0) {
            outputSerializedData.writeInt32(this.f57325i);
        }
    }
}
