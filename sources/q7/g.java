package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import g7.p8;
public final class g extends y5.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new o5.p(29);
    public final Status f46102a;
    public final h f46103b;

    public g(Status status, h hVar) {
        this.f46102a = status;
        this.f46103b = hVar;
    }

    @Override
    public final Status i() {
        return this.f46102a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f46102a, i9);
        p8.k(parcel, 2, this.f46103b, i9);
        p8.r(parcel, q10);
    }
}
