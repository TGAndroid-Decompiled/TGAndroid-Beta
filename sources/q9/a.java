package q9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(3);
    public int f43074a;
    public final boolean f43075b;
    public final String f43076c;
    public final String d;
    public final byte[] e;
    public final boolean f43077f;

    public a() {
        this.f43074a = 0;
        this.f43075b = true;
        this.f43076c = null;
        this.d = null;
        this.e = null;
        this.f43077f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f43074a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f43075b);
        sb2.append("' } ");
        String str = this.f43076c;
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
        sb2.append(this.f43077f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f43074a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f43075b ? 1 : 0);
        f0.l(parcel, 3, this.f43076c);
        f0.l(parcel, 4, this.d);
        f0.c(parcel, 5, this.e);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f43077f ? 1 : 0);
        f0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f43074a = i10;
        this.f43075b = z10;
        this.f43076c = str;
        this.d = str2;
        this.e = bArr;
        this.f43077f = z11;
    }
}
