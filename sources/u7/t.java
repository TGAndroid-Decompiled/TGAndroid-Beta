package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
public final class t extends r6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status f56390a;

    public t(Status status) {
        this.f56390a = status;
    }

    @Override
    public final Status a() {
        return this.f56390a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f56390a, i7);
        xb.s(parcel, r10);
    }
}
