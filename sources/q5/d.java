package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(13);
    public final String f46376a;
    public final int f46377b;
    public final String f46378c;

    public d(String str, int i10, String str2) {
        this.f46376a = str;
        this.f46377b = i10;
        this.f46378c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f46376a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f46377b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f46378c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
