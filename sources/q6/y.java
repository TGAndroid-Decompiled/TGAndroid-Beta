package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new r0(1);
    public final String f42987a;
    public final String f42988b;
    public final String f42989c;

    public y(String str, String str2, String str3) {
        b6.m.h(str);
        this.f42987a = str;
        b6.m.h(str2);
        this.f42988b = str2;
        this.f42989c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!b6.m.l(this.f42987a, yVar.f42987a) || !b6.m.l(this.f42988b, yVar.f42988b) || !b6.m.l(this.f42989c, yVar.f42989c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42987a, this.f42988b, this.f42989c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.f42987a);
        sb.append("', \n name='");
        sb.append(this.f42988b);
        sb.append("', \n icon='");
        return android.support.v4.media.a.r(sb, this.f42989c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42987a);
        f5.l(parcel, 3, this.f42988b);
        f5.l(parcel, 4, this.f42989c);
        f5.r(parcel, q10);
    }
}
