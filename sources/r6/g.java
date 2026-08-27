package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w0(25);

    public final String f46841a;

    public final Bundle f46842b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f46841a = type;
        this.f46842b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.l(dest, 1, this.f46841a);
        r8.b(dest, 2, this.f46842b);
        r8.r(dest, iQ);
    }
}
