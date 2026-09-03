package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f44664a;
    public final float f44665b;
    public final float f44666c;

    public w(float f10, float f11, float f12) {
        this.f44664a = f10;
        this.f44665b = f11;
        this.f44666c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f44664a == wVar.f44664a && this.f44665b == wVar.f44665b && this.f44666c == wVar.f44666c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44664a), Float.valueOf(this.f44665b), Float.valueOf(this.f44666c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeFloat(this.f44664a);
        g5.s(parcel, 3, 4);
        parcel.writeFloat(this.f44665b);
        g5.s(parcel, 4, 4);
        parcel.writeFloat(this.f44666c);
        g5.r(parcel, q10);
    }
}
