package r9;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(3);
    public int f47308a;
    public final boolean f47309b;
    public final String f47310c;
    public final String d;
    public final byte[] e;
    public final boolean f47311f;

    public a() {
        this.f47308a = 0;
        this.f47309b = true;
        this.f47310c = null;
        this.d = null;
        this.e = null;
        this.f47311f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f47308a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f47309b);
        sb2.append("' } ");
        String str = this.f47310c;
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
        sb2.append(this.f47311f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47308a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f47309b ? 1 : 0);
        df.l(parcel, 3, this.f47310c);
        df.l(parcel, 4, this.d);
        df.c(parcel, 5, this.e);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f47311f ? 1 : 0);
        df.r(parcel, q5);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f47308a = i10;
        this.f47309b = z10;
        this.f47310c = str;
        this.d = str2;
        this.e = bArr;
        this.f47311f = z11;
    }
}
