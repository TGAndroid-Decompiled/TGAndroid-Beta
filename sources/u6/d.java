package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(18);
    public final boolean f48414a;

    public d(boolean z4) {
        this.f48414a = z4;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.s(dest, 1, 4);
        dest.writeInt(this.f48414a ? 1 : 0);
        g5.r(dest, q10);
    }
}
