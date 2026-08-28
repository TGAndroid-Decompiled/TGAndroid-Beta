package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new o5.p(19);
    public final Bundle f46089a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f46089a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.b(dest, 1, this.f46089a);
        p8.r(dest, q10);
    }
}
