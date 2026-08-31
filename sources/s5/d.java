package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(4);
    public final String f47030a;
    public final int f47031b;
    public final String f47032c;

    public d(String str, int i10, String str2) {
        this.f47030a = str;
        this.f47031b = i10;
        this.f47032c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f47030a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f47031b);
        g5.l(parcel, 4, this.f47032c);
        g5.r(parcel, q10);
    }
}
