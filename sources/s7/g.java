package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class g extends a6.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new s6.i(11);
    public final Status f47674a;
    public final h f47675b;

    public g(Status status, h hVar) {
        this.f47674a = status;
        this.f47675b = hVar;
    }

    @Override
    public final Status i() {
        return this.f47674a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f47674a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f47675b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
