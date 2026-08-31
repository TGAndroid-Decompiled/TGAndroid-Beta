package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import u6.p;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new p(17);
    public final String f50448a;

    public e(String str) {
        m.i(str, "json must not be null");
        this.f50448a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f50448a);
        g5.r(parcel, q10);
    }
}
