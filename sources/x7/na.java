package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f45552a;
    public final float f45553b;
    public final String f45554c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f45552a = str;
        this.f45553b = f7;
        this.f45554c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f45552a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f45553b);
        w7.e0.l(parcel, 3, this.f45554c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
