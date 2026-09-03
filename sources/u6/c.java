package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(17);
    public final boolean f48449a;

    public c(boolean z4) {
        this.f48449a = z4;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.s(dest, 1, 4);
        dest.writeInt(this.f48449a ? 1 : 0);
        g5.r(dest, q10);
    }
}
