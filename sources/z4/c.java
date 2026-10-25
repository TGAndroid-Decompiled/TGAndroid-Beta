package z4;

import a0.f;
import a0.l;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f52670f;
    public final int f52671g;
    public final String h;
    public int f52672i;
    public int f52673j;
    public int f52674k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f52673j;
        if (i10 == this.f52670f) {
            i10 = this.f52671g;
        }
        return new c(parcel, dataPosition, i10, g.s(new StringBuilder(), this.h, "  "), this.f52667a, this.f52668b, this.f52669c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f52673j < this.f52671g) {
            int i11 = this.f52674k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f52673j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f52674k = parcel.readInt();
                    this.f52673j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f52674k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f52672i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f52672i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f52672i = -1;
        this.f52674k = -1;
        this.e = parcel;
        this.f52670f = i10;
        this.f52671g = i11;
        this.f52673j = i10;
        this.h = str;
    }
}
