package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class z extends p6.a {
    public static final Parcelable.Creator<z> CREATOR = new d(20);
    public final int f52801a;
    public final List f52802b;

    public z(int i10, ArrayList arrayList) {
        this.f52801a = i10;
        this.f52802b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52801a);
        df.p(parcel, 3, this.f52802b);
        df.r(parcel, q5);
    }
}
