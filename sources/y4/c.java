package y4;

import a0.f;
import a0.l;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f54203f;
    public final int f54204g;
    public final String h;
    public int f54205i;
    public int f54206j;
    public int f54207k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f54206j;
        if (i10 == this.f54203f) {
            i10 = this.f54204g;
        }
        return new c(parcel, dataPosition, i10, g.r(new StringBuilder(), this.h, "  "), this.f54200a, this.f54201b, this.f54202c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f54206j < this.f54204g) {
            int i11 = this.f54207k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f54206j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f54207k = parcel.readInt();
                    this.f54206j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f54207k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f54205i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f54205i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f54205i = -1;
        this.f54207k = -1;
        this.e = parcel;
        this.f54203f = i10;
        this.f54204g = i11;
        this.f54206j = i10;
        this.h = str;
    }
}
