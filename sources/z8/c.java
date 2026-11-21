package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f61818a;
    public d f61819b;
    public f f61820c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61818a);
        bc.k(parcel, 3, this.f61819b, i7);
        bc.k(parcel, 5, this.f61820c, i7);
        bc.s(parcel, r10);
    }
}
