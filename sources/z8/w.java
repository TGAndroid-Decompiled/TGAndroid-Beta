package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class w extends p6.a {
    public static final Parcelable.Creator<w> CREATOR = new d(17);
    public final int f52791a;
    public final String f52792b;

    public w(int i10, String str) {
        this.f52791a = i10;
        this.f52792b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52791a);
        df.l(parcel, 3, this.f52792b);
        df.r(parcel, q5);
    }
}
