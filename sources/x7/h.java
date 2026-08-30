package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import u6.p;
public class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(19);
    public final int f46854a;
    public final Float f46855b;

    public h(int i10, Float f10) {
        boolean z4 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z4 = false;
        }
        m.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z4);
        this.f46854a = i10;
        this.f46855b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f46854a == hVar.f46854a && m.l(this.f46855b, hVar.f46855b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46854a), this.f46855b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f46854a + " length=" + this.f46855b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f46854a);
        f5.e(parcel, 3, this.f46855b);
        f5.r(parcel, q10);
    }
}
