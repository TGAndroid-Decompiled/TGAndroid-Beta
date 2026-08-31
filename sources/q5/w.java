package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f44633a;
    public final float f44634b;
    public final float f44635c;

    public w(float f10, float f11, float f12) {
        this.f44633a = f10;
        this.f44634b = f11;
        this.f44635c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f44633a == wVar.f44633a && this.f44634b == wVar.f44634b && this.f44635c == wVar.f44635c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44633a), Float.valueOf(this.f44634b), Float.valueOf(this.f44635c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeFloat(this.f44633a);
        g5.s(parcel, 3, 4);
        parcel.writeFloat(this.f44634b);
        g5.s(parcel, 4, 4);
        parcel.writeFloat(this.f44635c);
        g5.r(parcel, q10);
    }
}
