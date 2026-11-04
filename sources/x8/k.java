package x8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new w8.b(6);
    public int f58559a;
    public String f58560b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f58559a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f58560b);
        j8.a.t(parcel, s6);
    }
}
