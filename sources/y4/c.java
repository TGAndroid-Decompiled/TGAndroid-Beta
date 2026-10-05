package y4;

import a0.f;
import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f50435e;
    public final int f50436f;
    public final int f50437g;
    public final String h;
    public int f50438i;
    public int f50439j;
    public int f50440k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f50435e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f50439j;
        if (i10 == this.f50436f) {
            i10 = this.f50437g;
        }
        return new c(parcel, dataPosition, i10, a4.a.t(new StringBuilder(), this.h, "  "), this.f50432a, this.f50433b, this.f50434c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f50439j < this.f50437g) {
            int i11 = this.f50440k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f50439j;
                    Parcel parcel = this.f50435e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f50440k = parcel.readInt();
                    this.f50439j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f50440k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f50438i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f50435e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f50438i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f50438i = -1;
        this.f50440k = -1;
        this.f50435e = parcel;
        this.f50436f = i10;
        this.f50437g = i11;
        this.f50439j = i10;
        this.h = str;
    }
}
