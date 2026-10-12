package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String f49726a;
    public final String f49727b;
    public final int f49728c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.f49726a = str;
        this.f49727b = str2;
        this.f49728c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49726a);
        c0.l(parcel, 3, this.f49727b);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f49728c);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        c0.r(parcel, q6);
    }
}
