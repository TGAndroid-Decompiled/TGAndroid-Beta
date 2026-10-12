package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.c0;
public final class v extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f47259a;

    public v(Status status) {
        this.f47259a = status;
    }

    @Override
    public final Status i() {
        return this.f47259a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f47259a, i10);
        c0.r(parcel, q6);
    }
}
