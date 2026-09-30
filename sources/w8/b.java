package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f45276a;
    public String f45277b;
    public ArrayList f45278c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45276a);
        f0.l(parcel, 3, this.f45277b);
        f0.p(parcel, 4, this.f45278c);
        f0.r(parcel, q6);
    }
}
