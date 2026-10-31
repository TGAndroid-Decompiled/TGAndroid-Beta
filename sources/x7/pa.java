package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float f53294a;
    public final int f53295b;

    public pa(float f7, int i10) {
        this.f53294a = f7;
        this.f53295b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeFloat(this.f53294a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f53295b);
        w7.h0.r(parcel, q6);
    }
}
