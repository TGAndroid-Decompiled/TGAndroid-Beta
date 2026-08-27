package zf;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class m0 extends TLObject {

    public static final int f50567j = 0;

    public int f50568a;

    public String f50569b;

    public String f50570c;
    public TLRPC.WebPage d;

    public boolean f50571e;

    public boolean f50572f = true;

    public int f50573i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int int32 = inputSerializedData.readInt32(z10);
        this.f50568a = int32;
        this.f50571e = (int32 & 8) != 0;
        this.f50572f = (int32 & 16) != 0;
        this.f50570c = inputSerializedData.readString(z10);
        if ((this.f50568a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f50568a & 2) != 0) {
            this.f50569b = inputSerializedData.readString(z10);
        }
        if ((this.f50568a & 4) != 0) {
            this.f50573i = inputSerializedData.readInt32(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-625858389);
        this.f50568a = this.d != null ? this.f50568a | 1 : this.f50568a & (-2);
        int i10 = !TextUtils.isEmpty(this.f50569b) ? this.f50568a | 2 : this.f50568a & (-3);
        this.f50568a = i10;
        int i11 = this.f50571e ? i10 | 8 : i10 & (-9);
        this.f50568a = i11;
        int i12 = this.f50572f ? i11 | 16 : i11 & (-17);
        this.f50568a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.f50570c);
        if ((this.f50568a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f50568a & 2) != 0) {
            outputSerializedData.writeString(this.f50569b);
        }
        if ((this.f50568a & 4) != 0) {
            outputSerializedData.writeInt32(this.f50573i);
        }
    }
}
