package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(8);
    public String f61772a;
    public String f61773b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61772a);
        bc.l(parcel, 3, this.f61773b);
        bc.s(parcel, r10);
    }
}
