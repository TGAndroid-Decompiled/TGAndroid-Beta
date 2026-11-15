package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f55372a;
    public List f55373b;

    public p(int i7, List list) {
        this.f55372a = i7;
        this.f55373b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55372a);
        yb.p(parcel, 2, this.f55373b);
        yb.s(parcel, r10);
    }
}
