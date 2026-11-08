package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f60001a;
    public String f60002b;
    public ArrayList f60003c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60001a);
        xb.l(parcel, 3, this.f60002b);
        xb.p(parcel, 4, this.f60003c);
        xb.s(parcel, r10);
    }
}
