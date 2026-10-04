package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f44348a;
    public final boolean f44349b;
    public final String f44350c;
    public final String d;
    public final byte[] f44351e;
    public final boolean f44352f;

    public a() {
        this.f44348a = 0;
        this.f44349b = true;
        this.f44350c = null;
        this.d = null;
        this.f44351e = null;
        this.f44352f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f44348a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f44349b);
        sb2.append("' } ");
        String str = this.f44350c;
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
        byte[] bArr = this.f44351e;
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
        sb2.append(this.f44352f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f44348a;
        g0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f44349b ? 1 : 0);
        g0.l(parcel, 3, this.f44350c);
        g0.l(parcel, 4, this.d);
        g0.c(parcel, 5, this.f44351e);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f44352f ? 1 : 0);
        g0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f44348a = i10;
        this.f44349b = z10;
        this.f44350c = str;
        this.d = str2;
        this.f44351e = bArr;
        this.f44352f = z11;
    }
}
