package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends p6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f52785a;
    public final long f52786b;
    public final List f52787c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.f52785a = i10;
        this.f52786b = j10;
        this.f52787c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52785a);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f52786b);
        df.p(parcel, 4, this.f52787c);
        df.r(parcel, q5);
    }
}
