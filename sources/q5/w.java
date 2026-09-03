package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f42904a;
    public final float f42905b;
    public final float f42906c;

    public w(float f10, float f11, float f12) {
        this.f42904a = f10;
        this.f42905b = f11;
        this.f42906c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f42904a == wVar.f42904a && this.f42905b == wVar.f42905b && this.f42906c == wVar.f42906c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f42904a), Float.valueOf(this.f42905b), Float.valueOf(this.f42906c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeFloat(this.f42904a);
        f5.s(parcel, 3, 4);
        parcel.writeFloat(this.f42905b);
        f5.s(parcel, 4, 4);
        parcel.writeFloat(this.f42906c);
        f5.r(parcel, q10);
    }
}
