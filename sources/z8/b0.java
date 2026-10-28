package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class b0 extends p6.a {
    public static final Parcelable.Creator<b0> CREATOR = new d(22);
    public final int f52756a;
    public final String f52757b;

    public b0(int i10, String str) {
        this.f52756a = i10;
        this.f52757b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52756a);
        df.l(parcel, 3, this.f52757b);
        df.r(parcel, q5);
    }
}
