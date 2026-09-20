package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f44563a;
    public final String f44564b;
    public final int f44565c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f44563a = str;
        this.f44564b = str2;
        this.f44565c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44563a);
        f0.l(parcel, 3, this.f44564b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f44565c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
    }
}
