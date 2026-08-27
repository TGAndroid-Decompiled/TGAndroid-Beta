package z7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import y5.v;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w7.f(25);

    public final int f50215a;

    public final v5.a f50216b;

    public final v f50217c;

    public h(int i10, v5.a aVar, v vVar) {
        this.f50215a = i10;
        this.f50216b = aVar;
        this.f50217c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f50215a);
        r8.k(parcel, 2, this.f50216b, i10);
        r8.k(parcel, 3, this.f50217c, i10);
        r8.r(parcel, iQ);
    }
}
