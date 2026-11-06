package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f59174a;
    public boolean f59175b;
    public c f59176c;
    public boolean d;
    public m f59177e;
    public ArrayList f59178f;
    public l h;
    public n f59179n;
    public boolean f59180r;
    public String f59181s;
    public Bundle f59182w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        boolean z9 = this.f59174a;
        wb.q(parcel, 1, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f59175b;
        wb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        wb.k(parcel, 3, this.f59176c, i7);
        boolean z11 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        wb.k(parcel, 5, this.f59177e, i7);
        wb.h(parcel, 6, this.f59178f);
        wb.k(parcel, 7, this.h, i7);
        wb.k(parcel, 8, this.f59179n, i7);
        boolean z12 = this.f59180r;
        wb.q(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        wb.l(parcel, 10, this.f59181s);
        wb.b(parcel, 11, this.f59182w);
        wb.s(parcel, r10);
    }
}
