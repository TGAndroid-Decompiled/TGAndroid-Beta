package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f59277a;
    public String f59278b;
    public String f59279c;
    public ArrayList d;
    public boolean f59280e;
    public String f59281f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.h(parcel, 2, this.f59277a);
        xb.l(parcel, 4, this.f59278b);
        xb.l(parcel, 5, this.f59279c);
        xb.h(parcel, 6, this.d);
        boolean z9 = this.f59280e;
        xb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 8, this.f59281f);
        xb.s(parcel, r10);
    }
}
