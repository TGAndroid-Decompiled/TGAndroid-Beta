package z3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import g7.s6;
import java.util.Arrays;
import java.util.List;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();
    public final b[] f50288a;
    public final long f50289b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(c cVar) {
        if (cVar != null) {
            b[] bVarArr = cVar.f50288a;
            if (bVarArr.length != 0) {
                int i9 = f0.f4349a;
                b[] bVarArr2 = this.f50288a;
                Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                return new c(this.f50289b, (b[]) copyOf);
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
            if (Arrays.equals(this.f50288a, cVar.f50288a) && this.f50289b == cVar.f50289b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return s6.a(this.f50289b) + (Arrays.hashCode(this.f50288a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f50288a));
        long j10 = this.f50289b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        b[] bVarArr = this.f50288a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f50289b);
    }

    public c(long j10, b... bVarArr) {
        this.f50289b = j10;
        this.f50288a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f50288a = new b[parcel.readInt()];
        int i9 = 0;
        while (true) {
            b[] bVarArr = this.f50288a;
            if (i9 < bVarArr.length) {
                bVarArr[i9] = (b) parcel.readParcelable(b.class.getClassLoader());
                i9++;
            } else {
                this.f50289b = parcel.readLong();
                return;
            }
        }
    }
}
