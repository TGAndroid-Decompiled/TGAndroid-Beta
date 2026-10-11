package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f45597a;
    public final boolean f45598b;
    public final String f45599c;
    public final String d;
    public final byte[] f45600e;
    public final boolean f45601f;

    public a() {
        this.f45597a = 0;
        this.f45598b = true;
        this.f45599c = null;
        this.d = null;
        this.f45600e = null;
        this.f45601f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f45597a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f45598b);
        sb2.append("' } ");
        String str = this.f45599c;
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
        byte[] bArr = this.f45600e;
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
        sb2.append(this.f45601f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f45597a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f45598b ? 1 : 0);
        d0.l(parcel, 3, this.f45599c);
        d0.l(parcel, 4, this.d);
        d0.c(parcel, 5, this.f45600e);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45601f ? 1 : 0);
        d0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f45597a = i10;
        this.f45598b = z10;
        this.f45599c = str;
        this.d = str2;
        this.f45600e = bArr;
        this.f45601f = z11;
    }
}
