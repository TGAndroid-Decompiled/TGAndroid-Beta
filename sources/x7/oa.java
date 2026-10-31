package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String f53279a;
    public final float f53280b;
    public final String f53281c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.f53279a = str;
        this.f53280b = f7;
        this.f53281c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 1, this.f53279a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeFloat(this.f53280b);
        w7.h0.l(parcel, 3, this.f53281c);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
