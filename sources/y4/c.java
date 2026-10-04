package y4;

import a0.f;
import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f50428e;
    public final int f50429f;
    public final int f50430g;
    public final String h;
    public int f50431i;
    public int f50432j;
    public int f50433k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m(0), new m(0), new m(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f50428e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f50432j;
        if (i10 == this.f50429f) {
            i10 = this.f50430g;
        }
        return new c(parcel, dataPosition, i10, a4.a.t(new StringBuilder(), this.h, "  "), this.f50425a, this.f50426b, this.f50427c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f50432j < this.f50430g) {
            int i11 = this.f50433k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f50432j;
                    Parcel parcel = this.f50428e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f50433k = parcel.readInt();
                    this.f50432j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f50433k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f50431i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f50428e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f50431i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f50431i = -1;
        this.f50433k = -1;
        this.f50428e = parcel;
        this.f50429f = i10;
        this.f50430g = i11;
        this.f50432j = i10;
        this.h = str;
    }
}
