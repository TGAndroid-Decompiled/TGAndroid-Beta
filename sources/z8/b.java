package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f61209a;
    public String f61210b;
    public ArrayList f61211c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61209a);
        yb.l(parcel, 3, this.f61210b);
        yb.p(parcel, 4, this.f61211c);
        yb.s(parcel, r10);
    }
}
