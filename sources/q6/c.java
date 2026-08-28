package q6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new o5.p(13);
    public final boolean f46073a;

    public c(boolean z10) {
        this.f46073a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.s(dest, 1, 4);
        dest.writeInt(this.f46073a ? 1 : 0);
        p8.r(dest, q10);
    }
}
