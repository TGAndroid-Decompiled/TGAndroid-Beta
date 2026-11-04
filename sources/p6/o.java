package p6;

import android.os.Parcel;
import android.os.Parcelable;
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new n8.g(22);
    public final int f53296a;
    public final boolean f53297b;
    public final boolean f53298c;
    public final int d;
    public final int f53299e;

    public o(int i3, int i10, int i11, boolean z10, boolean z11) {
        this.f53296a = i3;
        this.f53297b = z10;
        this.f53298c = z11;
        this.d = i10;
        this.f53299e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53296a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f53297b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f53298c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f53299e);
        j8.a.t(parcel, s6);
    }
}
