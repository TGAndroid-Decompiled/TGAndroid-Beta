package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
public final class t extends r6.a implements com.google.android.gms.common.api.r {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status f58507a;

    public t(Status status) {
        this.f58507a = status;
    }

    @Override
    public final Status a() {
        return this.f58507a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f58507a, i7);
        bc.s(parcel, r10);
    }
}
