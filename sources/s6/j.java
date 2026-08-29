package s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new i(1);
    public final Bundle f47661a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f47661a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.b(dest, 1, this.f47661a);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
