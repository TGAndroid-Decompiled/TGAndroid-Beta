package pg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 extends TLObject {
    public static final int f40166j = 0;
    public int f40167a;
    public String f40168b;
    public String f40169c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f40170f = true;
    public int f40171i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f40167a = readInt32;
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
        this.f40170f = z12;
        this.f40169c = inputSerializedData.readString(z10);
        if ((this.f40167a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f40167a & 2) != 0) {
            this.f40168b = inputSerializedData.readString(z10);
        }
        if ((this.f40167a & 4) != 0) {
            this.f40171i = inputSerializedData.readInt32(z10);
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
            i10 = this.f40167a | 1;
        } else {
            i10 = this.f40167a & (-2);
        }
        this.f40167a = i10;
        if (!TextUtils.isEmpty(this.f40168b)) {
            i11 = this.f40167a | 2;
        } else {
            i11 = this.f40167a & (-3);
        }
        this.f40167a = i11;
        if (this.e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f40167a = i12;
        if (this.f40170f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f40167a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f40169c);
        if ((this.f40167a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f40167a & 2) != 0) {
            outputSerializedData.writeString(this.f40168b);
        }
        if ((this.f40167a & 4) != 0) {
            outputSerializedData.writeInt32(this.f40171i);
        }
    }
}
