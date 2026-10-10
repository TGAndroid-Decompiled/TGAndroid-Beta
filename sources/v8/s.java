package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f49542a;
    public final String f49543b;
    public final int f49544c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f49542a = str;
        this.f49543b = str2;
        this.f49544c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49542a);
        d0.l(parcel, 3, this.f49543b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f49544c);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        d0.r(parcel, q6);
    }
}
