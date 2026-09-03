package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(21);
    public final String f45228a;
    public final Bundle f45229b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f45228a = type;
        this.f45229b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.l(dest, 1, this.f45228a);
        f5.b(dest, 2, this.f45229b);
        f5.r(dest, q10);
    }
}
