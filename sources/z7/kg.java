package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends o6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f54179a;
    public final boolean f54180b;
    public final boolean f54181c;
    public final boolean d;
    public final boolean f54182e;

    public kg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f54179a = z10;
        this.f54180b = z11;
        this.f54181c = z12;
        this.d = z13;
        this.f54182e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f54179a ? 1 : 0);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f54180b ? 1 : 0);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f54181c ? 1 : 0);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f54182e ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
