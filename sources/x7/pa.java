package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float f45872a;
    public final int f45873b;

    public pa(float f7, int i10) {
        this.f45872a = f7;
        this.f45873b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeFloat(this.f45872a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45873b);
        w7.f0.r(parcel, q6);
    }
}
