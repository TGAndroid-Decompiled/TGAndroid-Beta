package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class la extends q6.a {
    public static final Parcelable.Creator<la> CREATOR = new n5(2);
    public final String f59942a;
    public final float f59943b;
    public final String f59944c;
    public final int d;

    public la(float f10, int i3, String str, String str2) {
        this.f59942a = str;
        this.f59943b = f10;
        this.f59944c = str2;
        this.d = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f59942a);
        j8.a.r(parcel, 2, 4);
        parcel.writeFloat(this.f59943b);
        j8.a.m(parcel, 3, this.f59944c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
