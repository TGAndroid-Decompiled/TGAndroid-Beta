package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import q6.r0;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(29);
    public final int f43377a;

    public b0(int i10) {
        this.f43377a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f43377a);
        f5.r(parcel, q10);
    }
}
