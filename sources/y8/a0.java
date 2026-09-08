package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f49589a;
    public final String f49590b;

    public a0(int i10, String str) {
        this.f49589a = i10;
        this.f49590b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49589a);
        w7.e0.l(parcel, 3, this.f49590b);
        w7.e0.r(parcel, q6);
    }
}
