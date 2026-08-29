package s6;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new w0(23);
    public final boolean f47643a;

    public a(boolean z10) {
        this.f47643a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.s(dest, 1, 4);
        dest.writeInt(this.f47643a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
