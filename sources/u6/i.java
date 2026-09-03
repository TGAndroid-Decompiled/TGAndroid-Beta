package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new c0(23);
    public final Bundle f48465a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f48465a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.b(dest, 1, this.f48465a);
        g5.r(dest, q10);
    }
}
