package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f49613a;
    public final String f49614b;
    public final byte[] f49615c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f49613a = i10;
        this.f49614b = str;
        this.f49615c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f49615c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f49613a);
        sb2.append(",");
        sb2.append(this.f49614b);
        sb2.append(", size=");
        return a4.a.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49613a);
        w7.e0.l(parcel, 3, this.f49614b);
        w7.e0.c(parcel, 4, this.f49615c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
