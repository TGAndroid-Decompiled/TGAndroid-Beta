package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f40735a;
    public final boolean f40736b;
    public final String f40737c;
    public final String d;
    public final byte[] e;
    public final boolean f40738f;

    public a() {
        this.f40735a = 0;
        this.f40736b = true;
        this.f40737c = null;
        this.d = null;
        this.e = null;
        this.f40738f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f40735a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f40736b);
        sb2.append("' } ");
        String str = this.f40737c;
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
        sb2.append(this.f40738f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f40735a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f40736b ? 1 : 0);
        e0.l(parcel, 3, this.f40737c);
        e0.l(parcel, 4, this.d);
        e0.c(parcel, 5, this.e);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f40738f ? 1 : 0);
        e0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f40735a = i10;
        this.f40736b = z10;
        this.f40737c = str;
        this.d = str2;
        this.e = bArr;
        this.f40738f = z11;
    }
}
