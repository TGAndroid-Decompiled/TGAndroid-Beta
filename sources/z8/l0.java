package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends p6.a implements y8.g {
    public static final Parcelable.Creator<l0> CREATOR = new d(27);
    public final int f52743a;
    public final String f52744b;
    public final byte[] f52745c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
        this.f52743a = i10;
        this.f52744b = str;
        this.f52745c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f52745c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f52743a);
        sb2.append(",");
        sb2.append(this.f52744b);
        sb2.append(", size=");
        return a1.g.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52743a);
        df.l(parcel, 3, this.f52744b);
        df.c(parcel, 4, this.f52745c);
        df.l(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
