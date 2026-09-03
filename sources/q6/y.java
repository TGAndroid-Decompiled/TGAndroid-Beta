package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new r0(1);
    public final String f43017a;
    public final String f43018b;
    public final String f43019c;

    public y(String str, String str2, String str3) {
        b6.m.h(str);
        this.f43017a = str;
        b6.m.h(str2);
        this.f43018b = str2;
        this.f43019c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!b6.m.l(this.f43017a, yVar.f43017a) || !b6.m.l(this.f43018b, yVar.f43018b) || !b6.m.l(this.f43019c, yVar.f43019c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43017a, this.f43018b, this.f43019c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.f43017a);
        sb.append("', \n name='");
        sb.append(this.f43018b);
        sb.append("', \n icon='");
        return android.support.v4.media.a.r(sb, this.f43019c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f43017a);
        f5.l(parcel, 3, this.f43018b);
        f5.l(parcel, 4, this.f43019c);
        f5.r(parcel, q10);
    }
}
