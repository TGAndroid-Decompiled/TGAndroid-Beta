package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class i0 extends o6.a {
    public static final Parcelable.Creator<i0> CREATOR = new c(27);
    public final int f54253a;
    public final String f54254b;
    public final byte[] f54255c;
    public final String d;

    public i0(int i10, String str, String str2, byte[] bArr) {
        this.f54253a = i10;
        this.f54254b = str;
        this.f54255c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f54255c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f54253a);
        sb2.append(",");
        sb2.append(this.f54254b);
        sb2.append(", size=");
        return a1.g.r(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54253a);
        w7.h0.l(parcel, 3, this.f54254b);
        w7.h0.c(parcel, 4, this.f54255c);
        w7.h0.l(parcel, 5, this.d);
        w7.h0.r(parcel, q6);
    }
}
