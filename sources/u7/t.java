package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
public final class t extends r6.a implements com.google.android.gms.common.api.r {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status f58591a;

    public t(Status status) {
        this.f58591a = status;
    }

    @Override
    public final Status a() {
        return this.f58591a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f58591a, i7);
        cc.s(parcel, r10);
    }
}
