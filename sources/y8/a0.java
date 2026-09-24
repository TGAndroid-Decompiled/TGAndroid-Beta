package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f46601a;
    public final String f46602b;

    public a0(int i10, String str) {
        this.f46601a = i10;
        this.f46602b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46601a);
        w7.f0.l(parcel, 3, this.f46602b);
        w7.f0.r(parcel, q6);
    }
}
