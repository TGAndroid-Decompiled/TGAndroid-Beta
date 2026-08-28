package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new o5.p(20);
    public final Bundle f46090a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f46090a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.b(dest, 1, this.f46090a);
        p8.r(dest, q10);
    }
}
