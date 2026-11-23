package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f61822a;
    public d f61823b;
    public f f61824c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61822a);
        bc.k(parcel, 3, this.f61823b, i7);
        bc.k(parcel, 5, this.f61824c, i7);
        bc.s(parcel, r10);
    }
}
