package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f57051a;
    public final boolean f57052b;
    public final String f57053c;
    public final String d;
    public final byte[] f57054e;
    public final boolean f57055f;

    public a() {
        this.f57051a = 0;
        this.f57052b = true;
        this.f57053c = null;
        this.d = null;
        this.f57054e = null;
        this.f57055f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f57051a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f57052b);
        sb2.append("' } ");
        String str = this.f57053c;
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
        byte[] bArr = this.f57054e;
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
        sb2.append(this.f57055f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57051a;
        yb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f57052b ? 1 : 0);
        yb.l(parcel, 3, this.f57053c);
        yb.l(parcel, 4, this.d);
        yb.c(parcel, 5, this.f57054e);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f57055f ? 1 : 0);
        yb.s(parcel, r10);
    }

    public a(int i7, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f57051a = i7;
        this.f57052b = z10;
        this.f57053c = str;
        this.d = str2;
        this.f57054e = bArr;
        this.f57055f = z11;
    }
}
