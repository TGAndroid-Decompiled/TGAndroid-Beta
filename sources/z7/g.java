package z7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import y5.u;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w7.f(24);

    public final int f50213a;

    public final u f50214b;

    public g(int i10, u uVar) {
        this.f50213a = i10;
        this.f50214b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f50213a);
        r8.k(parcel, 2, this.f50214b, i10);
        r8.r(parcel, iQ);
    }
}
