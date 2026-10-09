package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f49498a;
    public final String f49499b;
    public final int f49500c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f49498a = str;
        this.f49499b = str2;
        this.f49500c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49498a);
        d0.l(parcel, 3, this.f49499b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f49500c);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        d0.r(parcel, q6);
    }
}
