package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList f48184a;
    public String f48185b;
    public String f48186c;
    public ArrayList d;
    public boolean f48187e;
    public String f48188f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.h(parcel, 2, this.f48184a);
        g0.l(parcel, 4, this.f48185b);
        g0.l(parcel, 5, this.f48186c);
        g0.h(parcel, 6, this.d);
        boolean z10 = this.f48187e;
        g0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 8, this.f48188f);
        g0.r(parcel, q6);
    }
}
