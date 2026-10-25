package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w8.s;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(16);
    public String f51682a;
    public String f51683b;
    public ArrayList f51684c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51682a);
        df.l(parcel, 3, this.f51683b);
        df.p(parcel, 4, this.f51684c);
        df.r(parcel, q5);
    }
}
