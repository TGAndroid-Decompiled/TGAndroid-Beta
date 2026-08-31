package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class u extends c6.a {
    public final int f44629a;
    public final int f44630b;
    public final int f44631c;
    public static final u5.b d = new u5.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f44629a = i10;
        this.f44630b = i11;
        this.f44631c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f44630b == uVar.f44630b && this.f44629a == uVar.f44629a && this.f44631c == uVar.f44631c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44630b), Integer.valueOf(this.f44629a), Integer.valueOf(this.f44631c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f44629a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f44630b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44631c);
        g5.r(parcel, q10);
    }
}
