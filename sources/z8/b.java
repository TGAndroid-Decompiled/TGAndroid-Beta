package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f59908a;
    public String f59909b;
    public ArrayList f59910c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59908a);
        xb.l(parcel, 3, this.f59909b);
        xb.p(parcel, 4, this.f59910c);
        xb.s(parcel, r10);
    }
}
