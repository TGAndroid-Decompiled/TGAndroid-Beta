package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new w0(28);

    public final Bundle f46849a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f46849a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.b(dest, 1, this.f46849a);
        r8.r(dest, iQ);
    }
}
