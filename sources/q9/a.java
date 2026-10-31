package q9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new n(2);
    public int f45496a;
    public final boolean f45497b;
    public final String f45498c;
    public final String d;
    public final byte[] e;
    public final boolean f45499f;

    public a() {
        this.f45496a = 0;
        this.f45497b = true;
        this.f45498c = null;
        this.d = null;
        this.e = null;
        this.f45499f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f45496a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f45497b);
        sb2.append("' } ");
        String str = this.f45498c;
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
        byte[] bArr = this.e;
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
        sb2.append(this.f45499f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f45496a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f45497b ? 1 : 0);
        h0.l(parcel, 3, this.f45498c);
        h0.l(parcel, 4, this.d);
        h0.c(parcel, 5, this.e);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.f45499f ? 1 : 0);
        h0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f45496a = i10;
        this.f45497b = z10;
        this.f45498c = str;
        this.d = str2;
        this.e = bArr;
        this.f45499f = z11;
    }
}
