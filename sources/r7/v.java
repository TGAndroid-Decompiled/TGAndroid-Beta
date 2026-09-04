package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.e0;
public final class v extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f44970a;

    public v(Status status) {
        this.f44970a = status;
    }

    @Override
    public final Status i() {
        return this.f44970a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f44970a, i10);
        e0.r(parcel, q6);
    }
}
