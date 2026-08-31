package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new c0(15);
    public final boolean f48412a;

    public a(boolean z4) {
        this.f48412a = z4;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.s(dest, 1, 4);
        dest.writeInt(this.f48412a ? 1 : 0);
        g5.r(dest, q10);
    }
}
