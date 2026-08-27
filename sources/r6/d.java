package r6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(22);

    public final boolean f46833a;

    public d(boolean z10) {
        this.f46833a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.s(dest, 1, 4);
        dest.writeInt(this.f46833a ? 1 : 0);
        r8.r(dest, iQ);
    }
}
