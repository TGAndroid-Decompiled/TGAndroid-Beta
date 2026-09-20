package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f46728a;
    public final String f46729b;

    public v(int i10, String str) {
        this.f46728a = i10;
        this.f46729b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46728a);
        w7.f0.l(parcel, 3, this.f46729b);
        w7.f0.r(parcel, q6);
    }
}
