package p8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
import o6.u;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(22);
    public final int f46822a;
    public final u f46823b;

    public g(int i10, u uVar) {
        this.f46822a = i10;
        this.f46823b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f46822a);
        df.k(parcel, 2, this.f46823b, i10);
        df.r(parcel, q5);
    }
}
