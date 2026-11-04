package x8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new w8.b(8);
    public final String f58580a;
    public final String f58581b;
    public final int f58582c;
    public final int d;

    public r(int i3, int i10, String str, String str2) {
        this.f58580a = str;
        this.f58581b = str2;
        this.f58582c = i3;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f58580a);
        j8.a.m(parcel, 3, this.f58581b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f58582c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
