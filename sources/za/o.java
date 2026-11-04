package za;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new y8.i(9);
    public final Bundle f60308a;
    public a0.f f60309b;

    public o(Bundle bundle) {
        this.f60308a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.c(parcel, 2, this.f60308a);
        j8.a.t(parcel, s6);
    }
}
