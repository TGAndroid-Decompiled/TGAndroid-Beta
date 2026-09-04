package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f44007a;
    public final boolean f44008b;
    public final String f44009c;
    public final String d;
    public final byte[] f44010e;
    public final boolean f44011f;

    public a() {
        this.f44007a = 0;
        this.f44008b = true;
        this.f44009c = null;
        this.d = null;
        this.f44010e = null;
        this.f44011f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f44007a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f44008b);
        sb2.append("' } ");
        String str = this.f44009c;
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
        byte[] bArr = this.f44010e;
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
        sb2.append(this.f44011f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f44007a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f44008b ? 1 : 0);
        e0.l(parcel, 3, this.f44009c);
        e0.l(parcel, 4, this.d);
        e0.c(parcel, 5, this.f44010e);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f44011f ? 1 : 0);
        e0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f44007a = i10;
        this.f44008b = z10;
        this.f44009c = str;
        this.d = str2;
        this.f44010e = bArr;
        this.f44011f = z11;
    }
}
