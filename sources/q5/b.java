package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new w0(12);
    public final int f46362a;
    public final int f46363b;
    public final int f46364c;

    public b(int i10, int i11, int i12) {
        this.f46362a = i10;
        this.f46363b = i11;
        this.f46364c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f46362a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f46363b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f46364c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
