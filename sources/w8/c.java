package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(6);
    public ArrayList f51135a;
    public boolean f51136b;
    public boolean f51137c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.h(parcel, 1, this.f51135a);
        boolean z10 = this.f51136b;
        df.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f51137c;
        df.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.r(parcel, q5);
    }
}
