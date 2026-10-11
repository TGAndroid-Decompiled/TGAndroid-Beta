package y4;

import a0.f;
import a0.m;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f51837e;
    public final int f51838f;
    public final int f51839g;
    public final String h;
    public int f51840i;
    public int f51841j;
    public int f51842k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f51837e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f51841j;
        if (i10 == this.f51838f) {
            i10 = this.f51839g;
        }
        return new c(parcel, dataPosition, i10, g.t(new StringBuilder(), this.h, "  "), this.f51834a, this.f51835b, this.f51836c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f51841j < this.f51839g) {
            int i11 = this.f51842k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f51841j;
                    Parcel parcel = this.f51837e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f51842k = parcel.readInt();
                    this.f51841j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f51842k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f51840i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f51837e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f51840i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f51840i = -1;
        this.f51842k = -1;
        this.f51837e = parcel;
        this.f51838f = i10;
        this.f51839g = i11;
        this.f51841j = i10;
        this.h = str;
    }
}
