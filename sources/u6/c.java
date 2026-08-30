package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(17);
    public final boolean f45158a;

    public c(boolean z4) {
        this.f45158a = z4;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.s(dest, 1, 4);
        dest.writeInt(this.f45158a ? 1 : 0);
        f5.r(dest, q10);
    }
}
