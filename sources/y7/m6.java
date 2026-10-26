package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class m6 extends p6.a {
    public static final Parcelable.Creator<m6> CREATOR = new m5(1);
    public final int f52233a;
    public final float f52234b;
    public final int f52235c;

    public m6(int i10, int i11, float f7, int i12) {
        if (i10 == 1) {
            this.f52233a = i11;
            this.f52234b = f7;
            this.f52235c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(1);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52233a);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.f52234b);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.f52235c);
        df.r(parcel, q5);
    }
}
