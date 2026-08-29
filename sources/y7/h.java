package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new k(12);
    public final int f50509a;
    public final boolean f50510b;

    public h(int i10, boolean z10) {
        this.f50509a = i10;
        this.f50510b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f50509a);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f50510b ? 1 : 0);
        o.r(parcel, q6);
    }
}
