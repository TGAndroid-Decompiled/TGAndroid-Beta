package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean f44924a;
    public final int f44925b;

    public a(int i10, boolean z10) {
        this.f44924a = z10;
        this.f44925b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44924a ? 1 : 0);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f44925b);
        e0.r(parcel, q6);
    }
}
