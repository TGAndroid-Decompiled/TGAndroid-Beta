package xa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final Bundle f53569a;
    public a0.f f53570b;

    public l(Bundle bundle) {
        this.f53569a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.b(parcel, 2, this.f53569a);
        h0.r(parcel, q6);
    }
}
