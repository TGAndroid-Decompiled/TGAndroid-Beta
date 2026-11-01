package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float f53312a;
    public final int f53313b;

    public pa(float f7, int i10) {
        this.f53312a = f7;
        this.f53313b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeFloat(this.f53312a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f53313b);
        w7.h0.r(parcel, q6);
    }
}
