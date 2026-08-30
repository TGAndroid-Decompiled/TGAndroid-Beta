package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(14);
    public final s f42900a;
    public final x0 f42901b;
    public final i0 f42902c;
    public final z0 d;
    public final m0 e;
    public final n0 f42903f;
    public final y0 h;
    public final o0 f42904n;
    public final t f42905r;
    public final q0 f42906s;
    public final s0 v;
    public final p0 f42907w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f42900a = sVar;
        this.f42902c = i0Var;
        this.f42901b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f42903f = n0Var;
        this.h = y0Var;
        this.f42904n = o0Var;
        this.f42905r = tVar;
        this.f42906s = q0Var;
        this.v = s0Var;
        this.f42907w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!b6.m.l(this.f42900a, fVar.f42900a) || !b6.m.l(this.f42901b, fVar.f42901b) || !b6.m.l(this.f42902c, fVar.f42902c) || !b6.m.l(this.d, fVar.d) || !b6.m.l(this.e, fVar.e) || !b6.m.l(this.f42903f, fVar.f42903f) || !b6.m.l(this.h, fVar.h) || !b6.m.l(this.f42904n, fVar.f42904n) || !b6.m.l(this.f42905r, fVar.f42905r) || !b6.m.l(this.f42906s, fVar.f42906s) || !b6.m.l(this.v, fVar.v) || !b6.m.l(this.f42907w, fVar.f42907w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42900a, this.f42901b, this.f42902c, this.d, this.e, this.f42903f, this.h, this.f42904n, this.f42905r, this.f42906s, this.v, this.f42907w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42900a);
        String valueOf2 = String.valueOf(this.f42901b);
        String valueOf3 = String.valueOf(this.f42902c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f42903f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f42904n);
        String valueOf9 = String.valueOf(this.f42905r);
        String valueOf10 = String.valueOf(this.f42906s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder m9 = yh.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        yh.x(m9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        yh.x(m9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        yh.x(m9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        yh.x(m9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return android.support.v4.media.a.r(m9, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42900a, i10);
        f5.k(parcel, 3, this.f42901b, i10);
        f5.k(parcel, 4, this.f42902c, i10);
        f5.k(parcel, 5, this.d, i10);
        f5.k(parcel, 6, this.e, i10);
        f5.k(parcel, 7, this.f42903f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.k(parcel, 9, this.f42904n, i10);
        f5.k(parcel, 10, this.f42905r, i10);
        f5.k(parcel, 11, this.f42906s, i10);
        f5.k(parcel, 12, this.v, i10);
        f5.k(parcel, 13, this.f42907w, i10);
        f5.r(parcel, q10);
    }
}
