package yf;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 extends TLObject {
    public static final int f49974j = 0;
    public int f49975a;
    public String f49976b;
    public String f49977c;
    public TLRPC.WebPage d;
    public boolean f49978e;
    public boolean f49979f = true;
    public int f49980i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f49975a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49978e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f49979f = z12;
        this.f49977c = inputSerializedData.readString(z10);
        if ((this.f49975a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f49975a & 2) != 0) {
            this.f49976b = inputSerializedData.readString(z10);
        }
        if ((this.f49975a & 4) != 0) {
            this.f49980i = inputSerializedData.readInt32(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i9;
        int i10;
        int i11;
        int i12;
        outputSerializedData.writeInt32(-625858389);
        if (this.d != null) {
            i9 = this.f49975a | 1;
        } else {
            i9 = this.f49975a & (-2);
        }
        this.f49975a = i9;
        if (!TextUtils.isEmpty(this.f49976b)) {
            i10 = this.f49975a | 2;
        } else {
            i10 = this.f49975a & (-3);
        }
        this.f49975a = i10;
        if (this.f49978e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f49975a = i11;
        if (this.f49979f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f49975a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f49977c);
        if ((this.f49975a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f49975a & 2) != 0) {
            outputSerializedData.writeString(this.f49976b);
        }
        if ((this.f49975a & 4) != 0) {
            outputSerializedData.writeInt32(this.f49980i);
        }
    }
}
