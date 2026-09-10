package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f43285a;
    public final String f43286b;
    public final int f43287c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f43285a = str;
        this.f43286b = str2;
        this.f43287c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43285a);
        e0.l(parcel, 3, this.f43286b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f43287c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }
}
