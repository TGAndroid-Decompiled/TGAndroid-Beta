package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class i extends q6.a {
    public static final Parcelable.Creator<i> CREATOR = new q8.i(24);
    public int f55020a;
    public String f55021b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f55020a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f55021b);
        j8.a.t(parcel, s6);
    }
}
