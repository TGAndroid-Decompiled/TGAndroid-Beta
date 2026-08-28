package x8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import w7.i;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new i(13);
    public int f49084a;
    public final boolean f49085b;
    public final String f49086c;
    public final String d;
    public final byte[] f49087e;
    public final boolean f49088f;

    public a() {
        this.f49084a = 0;
        this.f49085b = true;
        this.f49086c = null;
        this.d = null;
        this.f49087e = null;
        this.f49088f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f49084a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f49085b);
        sb2.append("' } ");
        String str = this.f49086c;
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
        byte[] bArr = this.f49087e;
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
        sb2.append(this.f49088f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f49084a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f49085b ? 1 : 0);
        p8.l(parcel, 3, this.f49086c);
        p8.l(parcel, 4, this.d);
        p8.c(parcel, 5, this.f49087e);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f49088f ? 1 : 0);
        p8.r(parcel, q10);
    }

    public a(int i9, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f49084a = i9;
        this.f49085b = z10;
        this.f49086c = str;
        this.d = str2;
        this.f49087e = bArr;
        this.f49088f = z11;
    }
}
