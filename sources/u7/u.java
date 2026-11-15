package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
public final class u extends r6.a implements com.google.android.gms.common.api.r {
    public static final Parcelable.Creator<u> CREATOR = new n(2);
    public final Status f57900a;

    public u(Status status) {
        this.f57900a = status;
    }

    @Override
    public final Status a() {
        return this.f57900a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f57900a, i7);
        yb.s(parcel, r10);
    }
}
