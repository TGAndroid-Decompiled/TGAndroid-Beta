package p6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h0 extends q6.a {
    public static final Parcelable.Creator<h0> CREATOR = new n8.g(24);
    public Bundle f53261a;
    public m6.c[] f53262b;
    public int f53263c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.c(parcel, 1, this.f53261a);
        j8.a.p(parcel, 2, this.f53262b, i3);
        int i10 = this.f53263c;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i10);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.t(parcel, s6);
    }
}
