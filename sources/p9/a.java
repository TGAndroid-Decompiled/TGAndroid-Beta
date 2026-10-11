package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f45563a;
    public final boolean f45564b;
    public final String f45565c;
    public final String d;
    public final byte[] f45566e;
    public final boolean f45567f;

    public a() {
        this.f45563a = 0;
        this.f45564b = true;
        this.f45565c = null;
        this.d = null;
        this.f45566e = null;
        this.f45567f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f45563a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f45564b);
        sb2.append("' } ");
        String str = this.f45565c;
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
        byte[] bArr = this.f45566e;
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
        sb2.append(this.f45567f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f45563a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f45564b ? 1 : 0);
        d0.l(parcel, 3, this.f45565c);
        d0.l(parcel, 4, this.d);
        d0.c(parcel, 5, this.f45566e);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45567f ? 1 : 0);
        d0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f45563a = i10;
        this.f45564b = z10;
        this.f45565c = str;
        this.d = str2;
        this.f45566e = bArr;
        this.f45567f = z11;
    }
}
