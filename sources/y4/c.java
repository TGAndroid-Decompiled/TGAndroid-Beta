package y4;

import a0.f;
import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f50419e;
    public final int f50420f;
    public final int f50421g;
    public final String h;
    public int f50422i;
    public int f50423j;
    public int f50424k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f50419e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f50423j;
        if (i10 == this.f50420f) {
            i10 = this.f50421g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.f50416a, this.f50417b, this.f50418c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f50423j < this.f50421g) {
            int i11 = this.f50424k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f50423j;
                    Parcel parcel = this.f50419e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f50424k = parcel.readInt();
                    this.f50423j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f50424k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f50422i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f50419e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f50422i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f50422i = -1;
        this.f50424k = -1;
        this.f50419e = parcel;
        this.f50420f = i10;
        this.f50421g = i11;
        this.f50423j = i10;
        this.h = str;
    }
}
