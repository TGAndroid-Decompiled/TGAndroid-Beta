package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new s(0);
    public final String f46921a;
    public final String f46922b;
    public final int f46923c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f46921a = str;
        this.f46922b = str2;
        this.f46923c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f46921a);
        g0.l(parcel, 3, this.f46922b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f46923c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g0.r(parcel, q6);
    }
}
