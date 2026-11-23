package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 extends TLObject {
    public static final int f58071j = 0;
    public int f58072a;
    public String f58073b;
    public String f58074c;
    public TLRPC.WebPage d;
    public boolean f58075e;
    public boolean f58076f = true;
    public int f58077i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f58072a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f58075e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f58076f = z12;
        this.f58074c = inputSerializedData.readString(z10);
        if ((this.f58072a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f58072a & 2) != 0) {
            this.f58073b = inputSerializedData.readString(z10);
        }
        if ((this.f58072a & 4) != 0) {
            this.f58077i = inputSerializedData.readInt32(z10);
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
            i7 = this.f58072a | 1;
        } else {
            i7 = this.f58072a & (-2);
        }
        this.f58072a = i7;
        if (!TextUtils.isEmpty(this.f58073b)) {
            i10 = this.f58072a | 2;
        } else {
            i10 = this.f58072a & (-3);
        }
        this.f58072a = i10;
        if (this.f58075e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f58072a = i11;
        if (this.f58076f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f58072a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f58074c);
        if ((this.f58072a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f58072a & 2) != 0) {
            outputSerializedData.writeString(this.f58073b);
        }
        if ((this.f58072a & 4) != 0) {
            outputSerializedData.writeInt32(this.f58077i);
        }
    }
}
