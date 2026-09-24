package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f46668a;
    public final b f46669b;

    public p(int i10, b bVar) {
        this.f46668a = i10;
        this.f46669b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46668a);
        w7.f0.k(parcel, 3, this.f46669b, i10);
        w7.f0.r(parcel, q6);
    }
}
