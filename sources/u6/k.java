package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new c0(26);
    public final Bundle f48467a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f48467a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.b(dest, 1, this.f48467a);
        g5.r(dest, q10);
    }
}
