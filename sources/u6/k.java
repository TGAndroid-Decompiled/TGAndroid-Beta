package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new c0(26);
    public final Bundle f45236a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f45236a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.b(dest, 1, this.f45236a);
        f5.r(dest, q10);
    }
}
