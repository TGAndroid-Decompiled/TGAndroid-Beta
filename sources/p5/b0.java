package p5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class b0 extends a6.a {
    public static final Parcelable.Creator<b0> CREATOR = new w0(8);
    public final int f45622a;

    public b0(int i10) {
        this.f45622a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f45622a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
