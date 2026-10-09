package y4;

import a0.f;
import a0.m;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f51716e;
    public final int f51717f;
    public final int f51718g;
    public final String h;
    public int f51719i;
    public int f51720j;
    public int f51721k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f51716e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f51720j;
        if (i10 == this.f51717f) {
            i10 = this.f51718g;
        }
        return new c(parcel, dataPosition, i10, g.t(new StringBuilder(), this.h, "  "), this.f51713a, this.f51714b, this.f51715c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f51720j < this.f51718g) {
            int i11 = this.f51721k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f51720j;
                    Parcel parcel = this.f51716e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f51721k = parcel.readInt();
                    this.f51720j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f51721k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f51719i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f51716e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f51719i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f51719i = -1;
        this.f51721k = -1;
        this.f51716e = parcel;
        this.f51717f = i10;
        this.f51718g = i11;
        this.f51720j = i10;
        this.h = str;
    }
}
