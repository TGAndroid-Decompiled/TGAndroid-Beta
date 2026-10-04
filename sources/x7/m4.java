package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String f49558a;
    public final String f49559b;
    public final float f49560c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.f49559b = str2;
        this.f49560c = f7;
        this.f49558a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f49559b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeFloat(this.f49560c);
        w7.g0.l(parcel, 4, this.f49558a);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.g0.r(parcel, q6);
    }
}
