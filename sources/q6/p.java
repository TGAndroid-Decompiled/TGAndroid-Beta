package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f53936a;
    public List f53937b;

    public p(int i7, List list) {
        this.f53936a = i7;
        this.f53937b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53936a);
        xb.p(parcel, 2, this.f53937b);
        xb.s(parcel, r10);
    }
}
