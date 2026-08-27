package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new w0(27);

    public final Bundle f46848a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f46848a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.b(dest, 1, this.f46848a);
        r8.r(dest, iQ);
    }
}
