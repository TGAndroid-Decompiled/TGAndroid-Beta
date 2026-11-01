package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.h0;
public final class t extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status f46376a;

    public t(Status status) {
        this.f46376a = status;
    }

    @Override
    public final Status a() {
        return this.f46376a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f46376a, i10);
        h0.r(parcel, q6);
    }
}
