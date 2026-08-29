package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new k(8);
    public final String f50504a;

    public e(String str) {
        this.f50504a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f50504a);
        o.r(parcel, q6);
    }
}
