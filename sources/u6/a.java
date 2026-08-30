package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new c0(15);
    public final boolean f45157a;

    public a(boolean z4) {
        this.f45157a = z4;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.s(dest, 1, 4);
        dest.writeInt(this.f45157a ? 1 : 0);
        f5.r(dest, q10);
    }
}
