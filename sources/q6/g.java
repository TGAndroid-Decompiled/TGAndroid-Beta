package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new o5.p(17);
    public final String f46082a;
    public final Bundle f46083b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        this.f46082a = type;
        this.f46083b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.l(dest, 1, this.f46082a);
        p8.b(dest, 2, this.f46083b);
        p8.r(dest, q10);
    }
}
