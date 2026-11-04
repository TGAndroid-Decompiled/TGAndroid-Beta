package q8;

import android.os.Parcel;
import android.os.Parcelable;
import p6.x;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final int f53819a;
    public final m6.a f53820b;
    public final x f53821c;

    public h(int i3, m6.a aVar, x xVar) {
        this.f53819a = i3;
        this.f53820b = aVar;
        this.f53821c = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53819a);
        j8.a.l(parcel, 2, this.f53820b, i3);
        j8.a.l(parcel, 3, this.f53821c, i3);
        j8.a.t(parcel, s6);
    }
}
