package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v8.s;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(16);
    public String f48922a;
    public String f48923b;
    public ArrayList f48924c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48922a);
        f0.l(parcel, 3, this.f48923b);
        f0.p(parcel, 4, this.f48924c);
        f0.r(parcel, q6);
    }
}
