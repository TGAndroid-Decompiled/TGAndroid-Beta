package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f51970a;
    public final String f51971b;

    public a0(int i10, String str) {
        this.f51970a = i10;
        this.f51971b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f51970a);
        w7.c0.l(parcel, 3, this.f51971b);
        w7.c0.r(parcel, q6);
    }
}
