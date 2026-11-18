package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f58500a;
    public String f58501b;
    public String f58502c;
    public String d;
    public String f58503e;
    public String f58504f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58500a);
        bc.l(parcel, 3, this.f58501b);
        bc.l(parcel, 4, this.f58502c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f58503e);
        bc.l(parcel, 7, this.f58504f);
        bc.l(parcel, 8, this.h);
        bc.s(parcel, r10);
    }
}
