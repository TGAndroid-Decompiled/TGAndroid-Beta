package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f48628a;
    public final String f48629b;
    public final byte[] f48630c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f48628a = i10;
        this.f48629b = str;
        this.f48630c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f48630c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f48628a);
        sb2.append(",");
        sb2.append(this.f48629b);
        sb2.append(", size=");
        return a1.g.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48628a);
        w7.f0.l(parcel, 3, this.f48629b);
        w7.f0.c(parcel, 4, this.f48630c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
