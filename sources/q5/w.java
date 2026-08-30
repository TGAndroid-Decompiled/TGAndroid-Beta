package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f42874a;
    public final float f42875b;
    public final float f42876c;

    public w(float f10, float f11, float f12) {
        this.f42874a = f10;
        this.f42875b = f11;
        this.f42876c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f42874a == wVar.f42874a && this.f42875b == wVar.f42875b && this.f42876c == wVar.f42876c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f42874a), Float.valueOf(this.f42875b), Float.valueOf(this.f42876c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeFloat(this.f42874a);
        f5.s(parcel, 3, 4);
        parcel.writeFloat(this.f42875b);
        f5.s(parcel, 4, 4);
        parcel.writeFloat(this.f42876c);
        f5.r(parcel, q10);
    }
}
