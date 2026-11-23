package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f58546a;
    public String f58547b;
    public String f58548c;
    public String d;
    public String f58549e;
    public String f58550f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58546a);
        bc.l(parcel, 3, this.f58547b);
        bc.l(parcel, 4, this.f58548c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f58549e);
        bc.l(parcel, 7, this.f58550f);
        bc.l(parcel, 8, this.h);
        bc.s(parcel, r10);
    }
}
