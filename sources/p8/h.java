package p8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
import o6.v;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(23);
    public final int f46824a;
    public final l6.a f46825b;
    public final v f46826c;

    public h(int i10, l6.a aVar, v vVar) {
        this.f46824a = i10;
        this.f46825b = aVar;
        this.f46826c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f46824a);
        df.k(parcel, 2, this.f46825b, i10);
        df.k(parcel, 3, this.f46826c, i10);
        df.r(parcel, q5);
    }
}
