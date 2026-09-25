package y4;

import a0.f;
import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f46593f;
    public final int f46594g;
    public final String h;
    public int f46595i;
    public int f46596j;
    public int f46597k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f46596j;
        if (i10 == this.f46593f) {
            i10 = this.f46594g;
        }
        return new c(parcel, dataPosition, i10, a4.a.t(new StringBuilder(), this.h, "  "), this.f46590a, this.f46591b, this.f46592c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f46596j < this.f46594g) {
            int i11 = this.f46597k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f46596j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f46597k = parcel.readInt();
                    this.f46596j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f46597k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f46595i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f46595i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f46595i = -1;
        this.f46597k = -1;
        this.e = parcel;
        this.f46593f = i10;
        this.f46594g = i11;
        this.f46596j = i10;
        this.h = str;
    }
}
