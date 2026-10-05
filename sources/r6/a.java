package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f45839a;
    public final int f45840b;

    public a(int i10, boolean z10) {
        this.f45839a = z10;
        this.f45840b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f45839a ? 1 : 0);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f45840b);
        g0.r(parcel, q6);
    }
}
