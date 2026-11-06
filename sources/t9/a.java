package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f55365a;
    public final boolean f55366b;
    public final String f55367c;
    public final String d;
    public final byte[] f55368e;
    public final boolean f55369f;

    public a() {
        this.f55365a = 0;
        this.f55366b = true;
        this.f55367c = null;
        this.d = null;
        this.f55368e = null;
        this.f55369f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f55365a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f55366b);
        sb2.append("' } ");
        String str = this.f55367c;
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
        byte[] bArr = this.f55368e;
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
        sb2.append(this.f55369f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f55365a;
        wb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f55366b ? 1 : 0);
        wb.l(parcel, 3, this.f55367c);
        wb.l(parcel, 4, this.d);
        wb.c(parcel, 5, this.f55368e);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f55369f ? 1 : 0);
        wb.s(parcel, r10);
    }

    public a(int i7, boolean z9, String str, String str2, byte[] bArr, boolean z10) {
        this.f55365a = i7;
        this.f55366b = z9;
        this.f55367c = str;
        this.d = str2;
        this.f55368e = bArr;
        this.f55369f = z10;
    }
}
