package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f46531a;
    public final String f46532b;
    public final byte[] f46533c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f46531a = i10;
        this.f46532b = str;
        this.f46533c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f46533c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f46531a);
        sb2.append(",");
        sb2.append(this.f46532b);
        sb2.append(", size=");
        return a4.a.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46531a);
        w7.e0.l(parcel, 3, this.f46532b);
        w7.e0.c(parcel, 4, this.f46533c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
