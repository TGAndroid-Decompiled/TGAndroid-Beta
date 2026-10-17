package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new s(0);
    public final String f48328a;
    public final String f48329b;
    public final int f48330c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f48328a = str;
        this.f48329b = str2;
        this.f48330c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48328a);
        f0.l(parcel, 3, this.f48329b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f48330c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
    }
}
