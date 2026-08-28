package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.List;
public final class o extends y5.a {
    public static final Parcelable.Creator<o> CREATOR = new w7.i(3);
    public final int f48961a;
    public List f48962b;

    public o(int i9, List list) {
        this.f48961a = i9;
        this.f48962b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48961a);
        p8.p(parcel, 2, this.f48962b);
        p8.r(parcel, q10);
    }
}
