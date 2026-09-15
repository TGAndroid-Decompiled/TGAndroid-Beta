package y4;

import a0.f;
import a0.l;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f46313f;
    public final int f46314g;
    public final String h;
    public int f46315i;
    public int f46316j;
    public int f46317k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f46316j;
        if (i10 == this.f46313f) {
            i10 = this.f46314g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.f46310a, this.f46311b, this.f46312c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f46316j < this.f46314g) {
            int i11 = this.f46317k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f46316j;
                    Parcel parcel = this.e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f46317k = parcel.readInt();
                    this.f46316j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f46317k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f46315i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f46315i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f46315i = -1;
        this.f46317k = -1;
        this.e = parcel;
        this.f46313f = i10;
        this.f46314g = i11;
        this.f46316j = i10;
        this.h = str;
    }
}
