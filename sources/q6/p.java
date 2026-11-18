package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f55946a;
    public List f55947b;

    public p(int i7, List list) {
        this.f55946a = i7;
        this.f55947b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f55946a);
        bc.p(parcel, 2, this.f55947b);
        bc.s(parcel, r10);
    }
}
