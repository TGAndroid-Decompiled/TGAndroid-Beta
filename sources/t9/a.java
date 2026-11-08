package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
    public int f55456a;
    public final boolean f55457b;
    public final String f55458c;
    public final String d;
    public final byte[] f55459e;
    public final boolean f55460f;

    public a() {
        this.f55456a = 0;
        this.f55457b = true;
        this.f55458c = null;
        this.d = null;
        this.f55459e = null;
        this.f55460f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f55456a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f55457b);
        sb2.append("' } ");
        String str = this.f55458c;
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
        byte[] bArr = this.f55459e;
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
        sb2.append(this.f55460f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f55456a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f55457b ? 1 : 0);
        xb.l(parcel, 3, this.f55458c);
        xb.l(parcel, 4, this.d);
        xb.c(parcel, 5, this.f55459e);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f55460f ? 1 : 0);
        xb.s(parcel, r10);
    }

    public a(int i7, boolean z9, String str, String str2, byte[] bArr, boolean z10) {
        this.f55456a = i7;
        this.f55457b = z9;
        this.f55458c = str;
        this.d = str2;
        this.f55459e = bArr;
        this.f55460f = z10;
    }
}
