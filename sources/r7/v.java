package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.g0;
public final class v extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f43974a;

    public v(Status status) {
        this.f43974a = status;
    }

    @Override
    public final Status h() {
        return this.f43974a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f43974a, i10);
        g0.r(parcel, q6);
    }
}
