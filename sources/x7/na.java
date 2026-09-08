package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f49138a;
    public final float f49139b;
    public final String f49140c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f49138a = str;
        this.f49139b = f7;
        this.f49140c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f49138a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f49139b);
        w7.e0.l(parcel, 3, this.f49140c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
