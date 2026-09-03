package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(3);
    public final b7.w0 f44677a;
    public final String f44678b;
    public final String f44679c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        b6.m.h(bArr);
        this.f44677a = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        this.f44678b = str;
        this.f44679c = str2;
        b6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (b6.m.l(this.f44677a, b0Var.f44677a) && b6.m.l(this.f44678b, b0Var.f44678b) && b6.m.l(this.f44679c, b0Var.f44679c) && b6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44677a, this.f44678b, this.f44679c, this.d});
    }

    public final String toString() {
        StringBuilder t6 = android.support.v4.media.a.t("PublicKeyCredentialUserEntity{\n id=", i6.b.c(this.f44677a.u()), ", \n name='");
        t6.append(this.f44678b);
        t6.append("', \n icon='");
        t6.append(this.f44679c);
        t6.append("', \n displayName='");
        return android.support.v4.media.a.r(t6, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.f44677a.u());
        g5.l(parcel, 3, this.f44678b);
        g5.l(parcel, 4, this.f44679c);
        g5.l(parcel, 5, this.d);
        g5.r(parcel, q10);
    }
}
