package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float f50959a;
    public final int f50960b;

    public pa(float f7, int i10) {
        this.f50959a = f7;
        this.f50960b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeFloat(this.f50959a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f50960b);
        w7.d0.r(parcel, q6);
    }
}
