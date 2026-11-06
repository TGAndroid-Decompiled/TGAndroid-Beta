package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f55340a;
    public final boolean f55341b;
    public final String f55342c;
    public final String d;
    public final byte[] f55343e;
    public final boolean f55344f;

    public a() {
        this.f55340a = 0;
        this.f55341b = true;
        this.f55342c = null;
        this.d = null;
        this.f55343e = null;
        this.f55344f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f55340a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f55341b);
        sb2.append("' } ");
        String str = this.f55342c;
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
        byte[] bArr = this.f55343e;
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
        sb2.append(this.f55344f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f55340a;
        wb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f55341b ? 1 : 0);
        wb.l(parcel, 3, this.f55342c);
        wb.l(parcel, 4, this.d);
        wb.c(parcel, 5, this.f55343e);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f55344f ? 1 : 0);
        wb.s(parcel, r10);
    }

    public a(int i7, boolean z9, String str, String str2, byte[] bArr, boolean z10) {
        this.f55340a = i7;
        this.f55341b = z9;
        this.f55342c = str;
        this.d = str2;
        this.f55343e = bArr;
        this.f55344f = z10;
    }
}
