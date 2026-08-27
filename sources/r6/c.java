package r6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new w0(21);

    public final boolean f46832a;

    public c(boolean z10) {
        this.f46832a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.s(dest, 1, 4);
        dest.writeInt(this.f46832a ? 1 : 0);
        r8.r(dest, iQ);
    }
}
