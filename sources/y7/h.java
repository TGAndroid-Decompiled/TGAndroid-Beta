package y7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import w7.i;
import x5.v;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new i(17);
    public final int f49618a;
    public final u5.a f49619b;
    public final v f49620c;

    public h(int i9, u5.a aVar, v vVar) {
        this.f49618a = i9;
        this.f49619b = aVar;
        this.f49620c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f49618a);
        p8.k(parcel, 2, this.f49619b, i9);
        p8.k(parcel, 3, this.f49620c, i9);
        p8.r(parcel, q10);
    }
}
