package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import h7.r8;

public final class g extends z5.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new r6.l(7);

    public final Status f46862a;

    public final h f46863b;

    public g(Status status, h hVar) {
        this.f46862a = status;
        this.f46863b = hVar;
    }

    @Override
    public final Status i() {
        return this.f46862a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f46862a, i10);
        r8.k(parcel, 2, this.f46863b, i10);
        r8.r(parcel, iQ);
    }
}
