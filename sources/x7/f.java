package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import u6.p;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new p(17);
    public final String f46910a;

    public f(String str) {
        m.i(str, "json must not be null");
        this.f46910a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f46910a);
        f5.r(parcel, q10);
    }
}
