package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f51801a;
    public final int f51802b;

    public n(int i10, int i11) {
        this.f51801a = i10;
        this.f51802b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51801a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51802b);
        w7.d0.r(parcel, q6);
    }
}
