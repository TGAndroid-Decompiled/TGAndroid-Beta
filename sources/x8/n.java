package x8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends q6.a {
    public static final Parcelable.Creator<n> CREATOR = new w8.b(10);
    public int f58564a;
    public String f58565b;
    public String f58566c;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f58564a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 2, this.f58565b);
        j8.a.m(parcel, 3, this.f58566c);
        j8.a.t(parcel, s6);
    }
}
