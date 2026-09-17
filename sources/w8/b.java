package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.r;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(18);
    public String f44910a;
    public String f44911b;
    public ArrayList f44912c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44910a);
        e0.l(parcel, 3, this.f44911b);
        e0.p(parcel, 4, this.f44912c);
        e0.r(parcel, q6);
    }
}
