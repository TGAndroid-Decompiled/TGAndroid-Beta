package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f49612a;
    public final String f49613b;
    public final byte[] f49614c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f49612a = i10;
        this.f49613b = str;
        this.f49614c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f49614c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f49612a);
        sb2.append(",");
        sb2.append(this.f49613b);
        sb2.append(", size=");
        return a4.a.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49612a);
        w7.e0.l(parcel, 3, this.f49613b);
        w7.e0.c(parcel, 4, this.f49614c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
