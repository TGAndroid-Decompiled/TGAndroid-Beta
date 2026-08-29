package z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(25);
    public int f50784a;
    public final boolean f50785b;
    public final String f50786c;
    public final String d;
    public final byte[] f50787e;
    public final boolean f50788f;

    public a() {
        this.f50784a = 0;
        this.f50785b = true;
        this.f50786c = null;
        this.d = null;
        this.f50787e = null;
        this.f50788f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f50784a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f50785b);
        sb2.append("' } ");
        String str = this.f50786c;
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
        byte[] bArr = this.f50787e;
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
        sb2.append(this.f50788f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f50784a;
        o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f50785b ? 1 : 0);
        o.l(parcel, 3, this.f50786c);
        o.l(parcel, 4, this.d);
        o.c(parcel, 5, this.f50787e);
        o.s(parcel, 6, 4);
        parcel.writeInt(this.f50788f ? 1 : 0);
        o.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f50784a = i10;
        this.f50785b = z10;
        this.f50786c = str;
        this.d = str2;
        this.f50787e = bArr;
        this.f50788f = z11;
    }
}
