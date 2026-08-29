package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import s6.i;
import z5.l;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new i(26);
    public final String f49449a;

    public e(String str) {
        l.i(str, "json must not be null");
        this.f49449a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f49449a);
        o.r(parcel, q6);
    }
}
