package p6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class p extends q6.a {
    public static final Parcelable.Creator<p> CREATOR = new n8.g(17);
    public final int f53300a;
    public List f53301b;

    public p(int i3, List list) {
        this.f53300a = i3;
        this.f53301b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53300a);
        j8.a.q(parcel, 2, this.f53301b);
        j8.a.t(parcel, s6);
    }
}
