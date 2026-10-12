package p9;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(5);
    public int f45420a;
    public final boolean f45421b;
    public final String f45422c;
    public final String d;
    public final byte[] f45423e;
    public final boolean f45424f;

    public a() {
        this.f45420a = 0;
        this.f45421b = true;
        this.f45422c = null;
        this.d = null;
        this.f45423e = null;
        this.f45424f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f45420a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f45421b);
        sb2.append("' } ");
        String str = this.f45422c;
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
        byte[] bArr = this.f45423e;
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
        sb2.append(this.f45424f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f45420a;
        c0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f45421b ? 1 : 0);
        c0.l(parcel, 3, this.f45422c);
        c0.l(parcel, 4, this.d);
        c0.c(parcel, 5, this.f45423e);
        c0.s(parcel, 6, 4);
        parcel.writeInt(this.f45424f ? 1 : 0);
        c0.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f45420a = i10;
        this.f45421b = z10;
        this.f45422c = str;
        this.d = str2;
        this.f45423e = bArr;
        this.f45424f = z11;
    }
}
