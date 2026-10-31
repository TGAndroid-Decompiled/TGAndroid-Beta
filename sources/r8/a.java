package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.n(6);
    public int f46366a;
    public String[] f46367b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f46366a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.m(parcel, 3, this.f46367b);
        h0.r(parcel, q6);
    }
}
