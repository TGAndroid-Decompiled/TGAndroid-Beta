package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float f51003a;
    public final int f51004b;

    public pa(float f7, int i10) {
        this.f51003a = f7;
        this.f51004b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeFloat(this.f51003a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51004b);
        w7.d0.r(parcel, q6);
    }
}
