package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(2);
    public final String f44216a;
    public final String f44217b;
    public final int f44218c;
    public final int d;

    public t(int i10, int i11, String str, String str2) {
        this.f44216a = str;
        this.f44217b = str2;
        this.f44218c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44216a);
        e0.l(parcel, 3, this.f44217b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f44218c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }
}
