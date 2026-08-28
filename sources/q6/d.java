package q6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new o5.p(14);
    public final boolean f46074a;

    public d(boolean z10) {
        this.f46074a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.s(dest, 1, 4);
        dest.writeInt(this.f46074a ? 1 : 0);
        p8.r(dest, q10);
    }
}
