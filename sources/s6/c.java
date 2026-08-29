package s6;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new w0(25);
    public final boolean f47644a;

    public c(boolean z10) {
        this.f47644a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.s(dest, 1, 4);
        dest.writeInt(this.f47644a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
