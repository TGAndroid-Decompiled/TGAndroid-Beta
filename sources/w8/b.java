package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f48348a;
    public String f48349b;
    public ArrayList f48350c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f48348a);
        e0.l(parcel, 3, this.f48349b);
        e0.p(parcel, 4, this.f48350c);
        e0.r(parcel, q6);
    }
}
