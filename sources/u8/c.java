package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f58516a;
    public String f58517b;
    public String f58518c;
    public String d;
    public String f58519e;
    public b f58520f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58516a);
        bc.l(parcel, 3, this.f58517b);
        bc.l(parcel, 4, this.f58518c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f58519e);
        bc.k(parcel, 7, this.f58520f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
