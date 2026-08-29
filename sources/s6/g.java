package s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new w0(29);
    public final String f47653a;
    public final Bundle f47654b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f47653a = type;
        this.f47654b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.l(dest, 1, this.f47653a);
        com.google.android.gms.internal.cast.o.b(dest, 2, this.f47654b);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
