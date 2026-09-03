package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import u6.p;
public class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(19);
    public final int f50498a;
    public final Float f50499b;

    public h(int i10, Float f10) {
        boolean z4 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z4 = false;
        }
        m.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z4);
        this.f50498a = i10;
        this.f50499b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f50498a == hVar.f50498a && m.l(this.f50499b, hVar.f50499b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50498a), this.f50499b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f50498a + " length=" + this.f50499b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f50498a);
        g5.e(parcel, 3, this.f50499b);
        g5.r(parcel, q10);
    }
}
