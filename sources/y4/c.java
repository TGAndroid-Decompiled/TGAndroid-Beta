package y4;

import a0.f;
import a0.m;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f51803e;
    public final int f51804f;
    public final int f51805g;
    public final String h;
    public int f51806i;
    public int f51807j;
    public int f51808k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f51803e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f51807j;
        if (i10 == this.f51804f) {
            i10 = this.f51805g;
        }
        return new c(parcel, dataPosition, i10, g.t(new StringBuilder(), this.h, "  "), this.f51800a, this.f51801b, this.f51802c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f51807j < this.f51805g) {
            int i11 = this.f51808k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f51807j;
                    Parcel parcel = this.f51803e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f51808k = parcel.readInt();
                    this.f51807j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f51808k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f51806i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f51803e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f51806i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f51806i = -1;
        this.f51808k = -1;
        this.f51803e = parcel;
        this.f51804f = i10;
        this.f51805g = i11;
        this.f51807j = i10;
        this.h = str;
    }
}
