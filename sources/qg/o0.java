package qg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o0 extends TLObject {
    public static final int f41872j = 0;
    public int f41873a;
    public String f41874b;
    public String f41875c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f41876f = true;
    public int f41877i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f41873a = readInt32;
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
        this.f41876f = z12;
        this.f41875c = inputSerializedData.readString(z10);
        if ((this.f41873a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f41873a & 2) != 0) {
            this.f41874b = inputSerializedData.readString(z10);
        }
        if ((this.f41873a & 4) != 0) {
            this.f41877i = inputSerializedData.readInt32(z10);
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
            i10 = this.f41873a | 1;
        } else {
            i10 = this.f41873a & (-2);
        }
        this.f41873a = i10;
        if (!TextUtils.isEmpty(this.f41874b)) {
            i11 = this.f41873a | 2;
        } else {
            i11 = this.f41873a & (-3);
        }
        this.f41873a = i11;
        if (this.e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f41873a = i12;
        if (this.f41876f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f41873a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f41875c);
        if ((this.f41873a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f41873a & 2) != 0) {
            outputSerializedData.writeString(this.f41874b);
        }
        if ((this.f41873a & 4) != 0) {
            outputSerializedData.writeInt32(this.f41877i);
        }
    }
}
