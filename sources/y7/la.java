package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class la extends p6.a {
    public static final Parcelable.Creator<la> CREATOR = new m5(3);
    public final float f52215a;
    public final int f52216b;

    public la(float f7, int i10) {
        this.f52215a = f7;
        this.f52216b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeFloat(this.f52215a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52216b);
        df.r(parcel, q5);
    }
}
