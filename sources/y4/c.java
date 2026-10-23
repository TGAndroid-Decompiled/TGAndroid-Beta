package y4;

import a0.f;
import a0.l;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f49953f;
    public final int f49954g;
    public final String h;
    public int f49955i;
    public int f49956j;
    public int f49957k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f49956j;
        if (i10 == this.f49953f) {
            i10 = this.f49954g;
        }
        return new c(parcel, dataPosition, i10, g.s(new StringBuilder(), this.h, "  "), this.f49950a, this.f49951b, this.f49952c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f49956j < this.f49954g) {
            int i11 = this.f49957k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f49956j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f49957k = parcel.readInt();
                    this.f49956j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f49957k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f49955i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f49955i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f49955i = -1;
        this.f49957k = -1;
        this.e = parcel;
        this.f49953f = i10;
        this.f49954g = i11;
        this.f49956j = i10;
        this.h = str;
    }
}
