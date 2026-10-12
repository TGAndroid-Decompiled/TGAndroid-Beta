package qg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 extends TLObject {
    public static final int f46364j = 0;
    public int f46365a;
    public String f46366b;
    public String f46367c;
    public TLRPC.WebPage d;
    public boolean f46368e;
    public boolean f46369f = true;
    public int f46370i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f46365a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46368e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f46369f = z12;
        this.f46367c = inputSerializedData.readString(z10);
        if ((this.f46365a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f46365a & 2) != 0) {
            this.f46366b = inputSerializedData.readString(z10);
        }
        if ((this.f46365a & 4) != 0) {
            this.f46370i = inputSerializedData.readInt32(z10);
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
            i10 = this.f46365a | 1;
        } else {
            i10 = this.f46365a & (-2);
        }
        this.f46365a = i10;
        if (!TextUtils.isEmpty(this.f46366b)) {
            i11 = this.f46365a | 2;
        } else {
            i11 = this.f46365a & (-3);
        }
        this.f46365a = i11;
        if (this.f46368e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f46365a = i12;
        if (this.f46369f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f46365a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f46367c);
        if ((this.f46365a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f46365a & 2) != 0) {
            outputSerializedData.writeString(this.f46366b);
        }
        if ((this.f46365a & 4) != 0) {
            outputSerializedData.writeInt32(this.f46370i);
        }
    }
}
