package q6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new o5.p(11);
    public final boolean f46072a;

    public a(boolean z10) {
        this.f46072a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.s(dest, 1, 4);
        dest.writeInt(this.f46072a ? 1 : 0);
        p8.r(dest, q10);
    }
}
