package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(21);
    public final String f48458a;
    public final Bundle f48459b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f48458a = type;
        this.f48459b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.l(dest, 1, this.f48458a);
        g5.b(dest, 2, this.f48459b);
        g5.r(dest, q10);
    }
}
