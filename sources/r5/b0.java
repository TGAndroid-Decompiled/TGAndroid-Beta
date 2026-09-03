package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import q6.r0;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(29);
    public final int f46732a;

    public b0(int i10) {
        this.f46732a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f46732a);
        g5.r(parcel, q10);
    }
}
