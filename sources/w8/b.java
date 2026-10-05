package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f48909a;
    public String f48910b;
    public ArrayList f48911c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48909a);
        g0.l(parcel, 3, this.f48910b);
        g0.p(parcel, 4, this.f48911c);
        g0.r(parcel, q6);
    }
}
