package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String f53236a;
    public final String f53237b;
    public final float f53238c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.f53237b = str2;
        this.f53238c = f7;
        this.f53236a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.f53237b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeFloat(this.f53238c);
        w7.h0.l(parcel, 4, this.f53236a);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
