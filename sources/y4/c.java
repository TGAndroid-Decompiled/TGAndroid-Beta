package y4;

import a0.f;
import a0.l;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f49567e;
    public final int f49568f;
    public final int f49569g;
    public final String h;
    public int f49570i;
    public int f49571j;
    public int f49572k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f49567e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f49571j;
        if (i10 == this.f49568f) {
            i10 = this.f49569g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.f49564a, this.f49565b, this.f49566c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f49571j < this.f49569g) {
            int i11 = this.f49572k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f49571j;
                    Parcel parcel = this.f49567e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f49572k = parcel.readInt();
                    this.f49571j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f49572k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f49570i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f49567e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f49570i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f49570i = -1;
        this.f49572k = -1;
        this.f49567e = parcel;
        this.f49568f = i10;
        this.f49569g = i11;
        this.f49571j = i10;
        this.h = str;
    }
}
