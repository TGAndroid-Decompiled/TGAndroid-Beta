package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f48629a;
    public final String f48630b;
    public final byte[] f48631c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f48629a = i10;
        this.f48630b = str;
        this.f48631c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f48631c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f48629a);
        sb2.append(",");
        sb2.append(this.f48630b);
        sb2.append(", size=");
        return a1.g.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48629a);
        w7.g0.l(parcel, 3, this.f48630b);
        w7.g0.c(parcel, 4, this.f48631c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.r(parcel, q6);
    }
}
