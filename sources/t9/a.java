package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f57627a;
    public final boolean f57628b;
    public final String f57629c;
    public final String d;
    public final byte[] f57630e;
    public final boolean f57631f;

    public a() {
        this.f57627a = 0;
        this.f57628b = true;
        this.f57629c = null;
        this.d = null;
        this.f57630e = null;
        this.f57631f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f57627a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f57628b);
        sb2.append("' } ");
        String str = this.f57629c;
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
        byte[] bArr = this.f57630e;
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
        sb2.append(this.f57631f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f57627a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f57628b ? 1 : 0);
        bc.l(parcel, 3, this.f57629c);
        bc.l(parcel, 4, this.d);
        bc.c(parcel, 5, this.f57630e);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f57631f ? 1 : 0);
        bc.s(parcel, r10);
    }

    public a(int i7, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f57627a = i7;
        this.f57628b = z10;
        this.f57629c = str;
        this.d = str2;
        this.f57630e = bArr;
        this.f57631f = z11;
    }
}
