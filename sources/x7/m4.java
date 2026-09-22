package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String f45818a;
    public final String f45819b;
    public final float f45820c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.f45819b = str2;
        this.f45820c = f7;
        this.f45818a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f45819b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f45820c);
        w7.f0.l(parcel, 4, this.f45818a);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
