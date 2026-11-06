package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f53774a;
    public final boolean f53775b;
    public final boolean f53776c;
    public final int[] d;
    public final int f53777e;
    public final int[] f53778f;

    public f(o oVar, boolean z9, boolean z10, int[] iArr, int i7, int[] iArr2) {
        this.f53774a = oVar;
        this.f53775b = z9;
        this.f53776c = z10;
        this.d = iArr;
        this.f53777e = i7;
        this.f53778f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f53774a, i7);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f53775b ? 1 : 0);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53776c ? 1 : 0);
        wb.g(parcel, 4, this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f53777e);
        wb.g(parcel, 6, this.f53778f);
        wb.s(parcel, r10);
    }
}
