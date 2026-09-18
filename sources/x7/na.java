package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String f45780a;
    public final float f45781b;
    public final String f45782c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.f45780a = str;
        this.f45781b = f7;
        this.f45782c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f45780a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f45781b);
        w7.f0.l(parcel, 3, this.f45782c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
