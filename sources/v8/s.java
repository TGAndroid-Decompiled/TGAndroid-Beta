package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f48231a;
    public final String f48232b;
    public final int f48233c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f48231a = str;
        this.f48232b = str2;
        this.f48233c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48231a);
        g0.l(parcel, 3, this.f48232b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f48233c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g0.r(parcel, q6);
    }
}
