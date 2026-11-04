package p6;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new n8.g(25);
    public final o f53243a;
    public final boolean f53244b;
    public final boolean f53245c;
    public final int[] d;
    public final int f53246e;
    public final int[] f53247f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i3, int[] iArr2) {
        this.f53243a = oVar;
        this.f53244b = z10;
        this.f53245c = z11;
        this.d = iArr;
        this.f53246e = i3;
        this.f53247f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f53243a, i3);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f53244b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f53245c ? 1 : 0);
        j8.a.h(parcel, 4, this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f53246e);
        j8.a.h(parcel, 6, this.f53247f);
        j8.a.t(parcel, s6);
    }
}
