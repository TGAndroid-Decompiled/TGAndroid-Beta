package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new w8.b(14);
    public ArrayList f58518a;
    public boolean f58519b;
    public boolean f58520c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.i(parcel, 1, this.f58518a);
        boolean z10 = this.f58519b;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f58520c;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.t(parcel, s6);
    }
}
