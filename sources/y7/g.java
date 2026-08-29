package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new k(11);
    public final String f50508a;

    public g(String str) {
        this.f50508a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f50508a);
        o.r(parcel, q6);
    }
}
