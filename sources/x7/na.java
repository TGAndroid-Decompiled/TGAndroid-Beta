package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f45529a;
    public final float f45530b;
    public final String f45531c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f45529a = str;
        this.f45530b = f7;
        this.f45531c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f45529a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f45530b);
        w7.e0.l(parcel, 3, this.f45531c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
