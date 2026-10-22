package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f49972a;
    public final String f49973b;

    public a0(int i10, String str) {
        this.f49972a = i10;
        this.f49973b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49972a);
        w7.f0.l(parcel, 3, this.f49973b);
        w7.f0.r(parcel, q6);
    }
}
