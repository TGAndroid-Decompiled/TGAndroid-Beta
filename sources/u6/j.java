package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new c0(24);
    public final Bundle f48466a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f48466a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.b(dest, 1, this.f48466a);
        g5.r(dest, q10);
    }
}
