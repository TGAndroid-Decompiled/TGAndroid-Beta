package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ma extends q6.a {
    public static final Parcelable.Creator<ma> CREATOR = new n5(3);
    public final float f59958a;
    public final int f59959b;

    public ma(float f10, int i3) {
        this.f59958a = f10;
        this.f59959b = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeFloat(this.f59958a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f59959b);
        j8.a.t(parcel, s6);
    }
}
