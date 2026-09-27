package y4;

import a0.f;
import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f46637f;
    public final int f46638g;
    public final String h;
    public int f46639i;
    public int f46640j;
    public int f46641k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f46640j;
        if (i10 == this.f46637f) {
            i10 = this.f46638g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.f46634a, this.f46635b, this.f46636c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f46640j < this.f46638g) {
            int i11 = this.f46641k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f46640j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f46641k = parcel.readInt();
                    this.f46640j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f46641k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f46639i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f46639i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f46639i = -1;
        this.f46641k = -1;
        this.e = parcel;
        this.f46637f = i10;
        this.f46638g = i11;
        this.f46640j = i10;
        this.h = str;
    }
}
