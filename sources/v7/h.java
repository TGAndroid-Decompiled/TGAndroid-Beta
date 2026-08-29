package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import s6.i;
import z5.l;
public class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(28);
    public final int f49462a;
    public final Float f49463b;

    public h(int i10, Float f9) {
        boolean z10 = true;
        if (i10 != 1 && (f9 == null || f9.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f9, z10);
        this.f49462a = i10;
        this.f49463b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f49462a == hVar.f49462a && l.l(this.f49463b, hVar.f49463b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49462a), this.f49463b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f49462a + " length=" + this.f49463b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f49462a);
        o.e(parcel, 3, this.f49463b);
        o.r(parcel, q6);
    }
}
