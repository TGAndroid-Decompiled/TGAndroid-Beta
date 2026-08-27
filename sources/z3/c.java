package z3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import h7.v6;
import java.util.Arrays;
import java.util.List;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    public final b[] f50188a;

    public final long f50189b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(c cVar) {
        if (cVar != null) {
            b[] bVarArr = cVar.f50188a;
            if (bVarArr.length != 0) {
                int i10 = g0.f4795a;
                b[] bVarArr2 = this.f50188a;
                Object[] objArrCopyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                System.arraycopy(bVarArr, 0, objArrCopyOf, bVarArr2.length, bVarArr.length);
                return new c(this.f50189b, (b[]) objArrCopyOf);
            }
        }
        return this;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f50188a, cVar.f50188a) && this.f50189b == cVar.f50189b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v6.a(this.f50189b) + (Arrays.hashCode(this.f50188a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f50188a));
        long j10 = this.f50189b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        b[] bVarArr = this.f50188a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f50189b);
    }

    public c(long j10, b... bVarArr) {
        this.f50189b = j10;
        this.f50188a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f50188a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f50188a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f50189b = parcel.readLong();
                return;
            }
        }
    }
}
