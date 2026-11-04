package s9;

import android.os.Parcel;
import android.os.Parcelable;
import q8.i;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new i(10);
    public int f54678a;
    public final boolean f54679b;
    public final String f54680c;
    public final String d;
    public final byte[] f54681e;
    public final boolean f54682f;

    public a() {
        this.f54678a = 0;
        this.f54679b = true;
        this.f54680c = null;
        this.d = null;
        this.f54681e = null;
        this.f54682f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f54678a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f54679b);
        sb2.append("' } ");
        String str = this.f54680c;
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
        byte[] bArr = this.f54681e;
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
        sb2.append(this.f54682f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f54678a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f54679b ? 1 : 0);
        j8.a.m(parcel, 3, this.f54680c);
        j8.a.m(parcel, 4, this.d);
        j8.a.d(parcel, 5, this.f54681e);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f54682f ? 1 : 0);
        j8.a.t(parcel, s6);
    }

    public a(int i3, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f54678a = i3;
        this.f54679b = z10;
        this.f54680c = str;
        this.d = str2;
        this.f54681e = bArr;
        this.f54682f = z11;
    }
}
