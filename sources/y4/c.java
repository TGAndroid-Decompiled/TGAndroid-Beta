package y4;

import a0.f;
import a0.l;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f49538e;
    public final int f49539f;
    public final int f49540g;
    public final String h;
    public int f49541i;
    public int f49542j;
    public int f49543k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f49538e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f49542j;
        if (i10 == this.f49539f) {
            i10 = this.f49540g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.f49535a, this.f49536b, this.f49537c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f49542j < this.f49540g) {
            int i11 = this.f49543k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f49542j;
                    Parcel parcel = this.f49538e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f49543k = parcel.readInt();
                    this.f49542j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f49543k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f49541i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f49538e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f49541i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f49541i = -1;
        this.f49543k = -1;
        this.f49538e = parcel;
        this.f49539f = i10;
        this.f49540g = i11;
        this.f49542j = i10;
        this.h = str;
    }
}
