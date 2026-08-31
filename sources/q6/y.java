package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new r0(1);
    public final String f44753a;
    public final String f44754b;
    public final String f44755c;

    public y(String str, String str2, String str3) {
        b6.m.h(str);
        this.f44753a = str;
        b6.m.h(str2);
        this.f44754b = str2;
        this.f44755c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!b6.m.l(this.f44753a, yVar.f44753a) || !b6.m.l(this.f44754b, yVar.f44754b) || !b6.m.l(this.f44755c, yVar.f44755c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44753a, this.f44754b, this.f44755c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.f44753a);
        sb.append("', \n name='");
        sb.append(this.f44754b);
        sb.append("', \n icon='");
        return android.support.v4.media.a.r(sb, this.f44755c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44753a);
        g5.l(parcel, 3, this.f44754b);
        g5.l(parcel, 4, this.f44755c);
        g5.r(parcel, q10);
    }
}
