package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f51790a;
    public final String f51791b;
    public final byte[] f51792c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f51790a = i10;
        this.f51791b = str;
        this.f51792c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f51792c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f51790a);
        sb2.append(",");
        sb2.append(this.f51791b);
        sb2.append(", size=");
        return a1.g.t(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51790a);
        w7.d0.l(parcel, 3, this.f51791b);
        w7.d0.c(parcel, 4, this.f51792c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.r(parcel, q6);
    }
}
