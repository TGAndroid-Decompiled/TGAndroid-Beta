package y4;

import a0.f;
import a0.l;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f49949f;
    public final int f49950g;
    public final String h;
    public int f49951i;
    public int f49952j;
    public int f49953k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f49952j;
        if (i10 == this.f49949f) {
            i10 = this.f49950g;
        }
        return new c(parcel, dataPosition, i10, g.s(new StringBuilder(), this.h, "  "), this.f49946a, this.f49947b, this.f49948c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f49952j < this.f49950g) {
            int i11 = this.f49953k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f49952j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f49953k = parcel.readInt();
                    this.f49952j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f49953k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f49951i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f49951i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f49951i = -1;
        this.f49953k = -1;
        this.e = parcel;
        this.f49949f = i10;
        this.f49950g = i11;
        this.f49952j = i10;
        this.h = str;
    }
}
