package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new d(5);
    public final int f52739a;

    public j(int i10) {
        this.f52739a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52739a);
        df.r(parcel, q5);
    }
}
