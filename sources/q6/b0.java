package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(3);
    public final b7.w0 f42886a;
    public final String f42887b;
    public final String f42888c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        b6.m.h(bArr);
        this.f42886a = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        this.f42887b = str;
        this.f42888c = str2;
        b6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (b6.m.l(this.f42886a, b0Var.f42886a) && b6.m.l(this.f42887b, b0Var.f42887b) && b6.m.l(this.f42888c, b0Var.f42888c) && b6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42886a, this.f42887b, this.f42888c, this.d});
    }

    public final String toString() {
        StringBuilder t6 = android.support.v4.media.a.t("PublicKeyCredentialUserEntity{\n id=", i6.b.c(this.f42886a.u()), ", \n name='");
        t6.append(this.f42887b);
        t6.append("', \n icon='");
        t6.append(this.f42888c);
        t6.append("', \n displayName='");
        return android.support.v4.media.a.r(t6, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.f42886a.u());
        f5.l(parcel, 3, this.f42887b);
        f5.l(parcel, 4, this.f42888c);
        f5.l(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
