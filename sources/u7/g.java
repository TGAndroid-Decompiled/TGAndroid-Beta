package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.g5;
public final class g extends c6.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new u6.p(3);
    public final Status f48443a;
    public final h f48444b;

    public g(Status status, h hVar) {
        this.f48443a = status;
        this.f48444b = hVar;
    }

    @Override
    public final Status i() {
        return this.f48443a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f48443a, i10);
        g5.k(parcel, 2, this.f48444b, i10);
        g5.r(parcel, q10);
    }
}
