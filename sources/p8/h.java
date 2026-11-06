package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(22);
    public final int f53413a;
    public final boolean f53414b;

    public h(int i7, boolean z9) {
        this.f53413a = i7;
        this.f53414b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f53413a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53414b ? 1 : 0);
        wb.s(parcel, r10);
    }
}
