package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.s;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(16);
    public String f47489a;
    public String f47490b;
    public ArrayList f47491c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f47489a);
        g0.l(parcel, 3, this.f47490b);
        g0.p(parcel, 4, this.f47491c);
        g0.r(parcel, q6);
    }
}
