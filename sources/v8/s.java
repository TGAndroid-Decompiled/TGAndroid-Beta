package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f44548a;
    public final String f44549b;
    public final int f44550c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f44548a = str;
        this.f44549b = str2;
        this.f44550c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44548a);
        f0.l(parcel, 3, this.f44549b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f44550c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
    }
}
