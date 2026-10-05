package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.g0;
public final class v extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f45885a;

    public v(Status status) {
        this.f45885a = status;
    }

    @Override
    public final Status i() {
        return this.f45885a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f45885a, i10);
        g0.r(parcel, q6);
    }
}
