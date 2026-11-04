package x8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new w8.b(16);
    public String f58521a;
    public String f58522b;
    public int f58523c;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f58521a);
        j8.a.m(parcel, 3, this.f58522b);
        int i10 = this.f58523c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.t(parcel, s6);
    }
}
