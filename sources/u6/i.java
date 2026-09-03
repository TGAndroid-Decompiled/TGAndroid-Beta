package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new c0(23);
    public final Bundle f45234a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f45234a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.b(dest, 1, this.f45234a);
        f5.r(dest, q10);
    }
}
