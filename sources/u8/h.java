package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f58542a;
    public String f58543b;
    public String f58544c;
    public String d;
    public String f58545e;
    public String f58546f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58542a);
        bc.l(parcel, 3, this.f58543b);
        bc.l(parcel, 4, this.f58544c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f58545e);
        bc.l(parcel, 7, this.f58546f);
        bc.l(parcel, 8, this.h);
        bc.s(parcel, r10);
    }
}
