package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new l4.j(25);
    public final b7.w0 f42971a;
    public final b7.w0 f42972b;
    public final b7.w0 f42973c;
    public final int d;

    public p0(b7.w0 w0Var, b7.w0 w0Var2, b7.w0 w0Var3, int i10) {
        this.f42971a = w0Var;
        this.f42972b = w0Var2;
        this.f42973c = w0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!b6.m.l(this.f42971a, p0Var.f42971a) || !b6.m.l(this.f42972b, p0Var.f42972b) || !b6.m.l(this.f42973c, p0Var.f42973c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42971a, this.f42972b, this.f42973c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        b7.w0 w0Var = this.f42971a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        String c3 = i6.b.c(u10);
        b7.w0 w0Var2 = this.f42972b;
        if (w0Var2 == null) {
            u11 = null;
        } else {
            u11 = w0Var2.u();
        }
        String c10 = i6.b.c(u11);
        b7.w0 w0Var3 = this.f42973c;
        if (w0Var3 != null) {
            bArr = w0Var3.u();
        }
        String c11 = i6.b.c(bArr);
        StringBuilder l10 = ai.l("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c10, ", saltAuth=");
        l10.append(c11);
        l10.append(", getPinUvAuthProtocol=");
        return android.support.v4.media.a.m(this.d, "}", l10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        byte[] u11;
        int q10 = f5.q(parcel, 20293);
        byte[] bArr = null;
        b7.w0 w0Var = this.f42971a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 1, u10);
        b7.w0 w0Var2 = this.f42972b;
        if (w0Var2 == null) {
            u11 = null;
        } else {
            u11 = w0Var2.u();
        }
        f5.c(parcel, 2, u11);
        b7.w0 w0Var3 = this.f42973c;
        if (w0Var3 != null) {
            bArr = w0Var3.u();
        }
        f5.c(parcel, 3, bArr);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
