package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class n6 extends q6.a {
    public static final Parcelable.Creator<n6> CREATOR = new n5(1);
    public final int f59978a;
    public final float f59979b;
    public final int f59980c;

    public n6(int i3, int i10, float f10, int i11) {
        if (i3 == 1) {
            this.f59978a = i10;
            this.f59979b = f10;
            this.f59980c = i11;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(1);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f59978a);
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(this.f59979b);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f59980c);
        j8.a.t(parcel, s6);
    }
}
