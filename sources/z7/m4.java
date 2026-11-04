package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class m4 extends q6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String f59950a;
    public final String f59951b;
    public final float f59952c;
    public final int d;

    public m4(float f10, int i3, String str, String str2) {
        this.f59951b = str2;
        this.f59952c = f10;
        this.f59950a = str;
        this.d = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59951b);
        j8.a.r(parcel, 3, 4);
        parcel.writeFloat(this.f59952c);
        j8.a.m(parcel, 4, this.f59950a);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
