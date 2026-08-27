package r6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w0(19);

    public final boolean f46831a;

    public a(boolean z10) {
        this.f46831a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.s(dest, 1, 4);
        dest.writeInt(this.f46831a ? 1 : 0);
        r8.r(dest, iQ);
    }
}
