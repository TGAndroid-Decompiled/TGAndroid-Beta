package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new s(0);
    public final String f48353a;
    public final String f48354b;
    public final int f48355c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f48353a = str;
        this.f48354b = str2;
        this.f48355c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48353a);
        f0.l(parcel, 3, this.f48354b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f48355c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
    }
}
