package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f57909a;
    public String f57910b;
    public String f57911c;
    public String d;
    public String f57912e;
    public b f57913f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f57909a);
        yb.l(parcel, 3, this.f57910b);
        yb.l(parcel, 4, this.f57911c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f57912e);
        yb.k(parcel, 7, this.f57913f, i7);
        yb.k(parcel, 8, this.h, i7);
        yb.s(parcel, r10);
    }
}
