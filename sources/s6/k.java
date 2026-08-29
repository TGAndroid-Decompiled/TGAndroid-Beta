package s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends a6.a {
    public static final Parcelable.Creator<k> CREATOR = new i(2);
    public final Bundle f47662a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f47662a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.b(dest, 1, this.f47662a);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
