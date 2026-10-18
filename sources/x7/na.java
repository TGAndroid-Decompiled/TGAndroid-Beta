package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f49485a;
    public final float f49486b;
    public final String f49487c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f49485a = str;
        this.f49486b = f7;
        this.f49487c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49485a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f49486b);
        w7.f0.l(parcel, 3, this.f49487c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
