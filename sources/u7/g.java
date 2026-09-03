package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
public final class g extends c6.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new u6.p(3);
    public final Status f45247a;
    public final h f45248b;

    public g(Status status, h hVar) {
        this.f45247a = status;
        this.f45248b = hVar;
    }

    @Override
    public final Status i() {
        return this.f45247a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f45247a, i10);
        f5.k(parcel, 2, this.f45248b, i10);
        f5.r(parcel, q10);
    }
}
