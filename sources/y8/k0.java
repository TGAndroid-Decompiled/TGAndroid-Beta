package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f50509a;
    public final String f50510b;
    public final byte[] f50511c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f50509a = i10;
        this.f50510b = str;
        this.f50511c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f50511c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f50509a);
        sb2.append(",");
        sb2.append(this.f50510b);
        sb2.append(", size=");
        return a4.a.t(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50509a);
        w7.g0.l(parcel, 3, this.f50510b);
        w7.g0.c(parcel, 4, this.f50511c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.r(parcel, q6);
    }
}
