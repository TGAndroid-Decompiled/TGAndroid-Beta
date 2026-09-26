package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f45167a;
    public String f45168b;
    public ArrayList f45169c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45167a);
        f0.l(parcel, 3, this.f45168b);
        f0.p(parcel, 4, this.f45169c);
        f0.r(parcel, q6);
    }
}
