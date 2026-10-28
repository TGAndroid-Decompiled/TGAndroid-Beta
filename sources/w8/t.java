package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class t extends p6.a {
    public static final Parcelable.Creator<t> CREATOR = new s(3);
    public String f51194a;
    public Bundle f51195b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51194a);
        df.b(parcel, 3, this.f51195b);
        df.r(parcel, q5);
    }
}
