package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f57635a;
    public final boolean f57636b;
    public final String f57637c;
    public final String d;
    public final byte[] f57638e;
    public final boolean f57639f;

    public a() {
        this.f57635a = 0;
        this.f57636b = true;
        this.f57637c = null;
        this.d = null;
        this.f57638e = null;
        this.f57639f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f57635a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f57636b);
        sb2.append("' } ");
        String str = this.f57637c;
        if (str != null) {
            sb2.append("{ completionToken: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb2.append("{ accountName: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        byte[] bArr = this.f57638e;
        if (bArr != null) {
            sb2.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(b10));
                sb2.append(" ");
            }
            sb2.append("] } ");
        }
        sb2.append("{ contextOnly: '");
        sb2.append(this.f57639f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f57635a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f57636b ? 1 : 0);
        cc.l(parcel, 3, this.f57637c);
        cc.l(parcel, 4, this.d);
        cc.c(parcel, 5, this.f57638e);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f57639f ? 1 : 0);
        cc.s(parcel, r10);
    }

    public a(int i7, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f57635a = i7;
        this.f57636b = z10;
        this.f57637c = str;
        this.d = str2;
        this.f57638e = bArr;
        this.f57639f = z11;
    }
}
