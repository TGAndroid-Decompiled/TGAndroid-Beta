package tg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 extends TLObject {
    public static final int f55590j = 0;
    public int f55591a;
    public String f55592b;
    public String f55593c;
    public TLRPC.WebPage d;
    public boolean f55594e;
    public boolean f55595f = true;
    public int f55596i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10;
        int readInt32 = inputSerializedData.readInt32(z9);
        this.f55591a = readInt32;
        boolean z11 = false;
        if ((readInt32 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f55594e = z10;
        if ((readInt32 & 16) != 0) {
            z11 = true;
        }
        this.f55595f = z11;
        this.f55593c = inputSerializedData.readString(z9);
        if ((this.f55591a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.f55591a & 2) != 0) {
            this.f55592b = inputSerializedData.readString(z9);
        }
        if ((this.f55591a & 4) != 0) {
            this.f55596i = inputSerializedData.readInt32(z9);
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
            i7 = this.f55591a | 1;
        } else {
            i7 = this.f55591a & (-2);
        }
        this.f55591a = i7;
        if (!TextUtils.isEmpty(this.f55592b)) {
            i10 = this.f55591a | 2;
        } else {
            i10 = this.f55591a & (-3);
        }
        this.f55591a = i10;
        if (this.f55594e) {
            i11 = i10 | 8;
        } else {
            i11 = i10 & (-9);
        }
        this.f55591a = i11;
        if (this.f55595f) {
            i12 = i11 | 16;
        } else {
            i12 = i11 & (-17);
        }
        this.f55591a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f55593c);
        if ((this.f55591a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f55591a & 2) != 0) {
            outputSerializedData.writeString(this.f55592b);
        }
        if ((this.f55591a & 4) != 0) {
            outputSerializedData.writeInt32(this.f55596i);
        }
    }
}
