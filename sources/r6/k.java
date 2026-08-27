package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new l(0);

    public final Bundle f46850a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f46850a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.b(dest, 1, this.f46850a);
        r8.r(dest, iQ);
    }
}
