package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f57749a;
    public final boolean f57750b;
    public final String f57751c;
    public final String d;
    public final byte[] f57752e;
    public final boolean f57753f;

    public a() {
        this.f57749a = 0;
        this.f57750b = true;
        this.f57751c = null;
        this.d = null;
        this.f57752e = null;
        this.f57753f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f57749a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f57750b);
        sb2.append("' } ");
        String str = this.f57751c;
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
        byte[] bArr = this.f57752e;
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
        sb2.append(this.f57753f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f57749a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f57750b ? 1 : 0);
        cc.l(parcel, 3, this.f57751c);
        cc.l(parcel, 4, this.d);
        cc.c(parcel, 5, this.f57752e);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f57753f ? 1 : 0);
        cc.s(parcel, r10);
    }

    public a(int i7, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f57749a = i7;
        this.f57750b = z10;
        this.f57751c = str;
        this.d = str2;
        this.f57752e = bArr;
        this.f57753f = z11;
    }
}
