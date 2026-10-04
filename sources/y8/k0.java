package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f50493a;
    public final String f50494b;
    public final byte[] f50495c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.f50493a = i10;
        this.f50494b = str;
        this.f50495c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f50495c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f50493a);
        sb2.append(",");
        sb2.append(this.f50494b);
        sb2.append(", size=");
        return a4.a.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50493a);
        w7.g0.l(parcel, 3, this.f50494b);
        w7.g0.c(parcel, 4, this.f50495c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.r(parcel, q6);
    }
}
