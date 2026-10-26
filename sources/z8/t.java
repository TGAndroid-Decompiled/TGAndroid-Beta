package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class t extends p6.a {
    public static final Parcelable.Creator<t> CREATOR = new d(14);
    public final int f52776a;
    public final boolean f52777b;

    public t(int i10, boolean z10) {
        this.f52776a = i10;
        this.f52777b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52776a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52777b ? 1 : 0);
        df.r(parcel, q5);
    }
}
