package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new l4.j(25);
    public final b7.w0 f42941a;
    public final b7.w0 f42942b;
    public final b7.w0 f42943c;
    public final int d;

    public p0(b7.w0 w0Var, b7.w0 w0Var2, b7.w0 w0Var3, int i10) {
        this.f42941a = w0Var;
        this.f42942b = w0Var2;
        this.f42943c = w0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!b6.m.l(this.f42941a, p0Var.f42941a) || !b6.m.l(this.f42942b, p0Var.f42942b) || !b6.m.l(this.f42943c, p0Var.f42943c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42941a, this.f42942b, this.f42943c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        b7.w0 w0Var = this.f42941a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        String c3 = i6.b.c(u10);
        b7.w0 w0Var2 = this.f42942b;
        if (w0Var2 == null) {
            u11 = null;
        } else {
            u11 = w0Var2.u();
        }
        String c10 = i6.b.c(u11);
        b7.w0 w0Var3 = this.f42943c;
        if (w0Var3 != null) {
            bArr = w0Var3.u();
        }
        String c11 = i6.b.c(bArr);
        StringBuilder m9 = yh.m("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c10, ", saltAuth=");
        m9.append(c11);
        m9.append(", getPinUvAuthProtocol=");
        return android.support.v4.media.a.m(this.d, "}", m9);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        byte[] u11;
        int q10 = f5.q(parcel, 20293);
        byte[] bArr = null;
        b7.w0 w0Var = this.f42941a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 1, u10);
        b7.w0 w0Var2 = this.f42942b;
        if (w0Var2 == null) {
            u11 = null;
        } else {
            u11 = w0Var2.u();
        }
        f5.c(parcel, 2, u11);
        b7.w0 w0Var3 = this.f42943c;
        if (w0Var3 != null) {
            bArr = w0Var3.u();
        }
        f5.c(parcel, 3, bArr);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
