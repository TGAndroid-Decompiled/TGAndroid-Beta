package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(14);
    public final s f44660a;
    public final x0 f44661b;
    public final i0 f44662c;
    public final z0 d;
    public final m0 f44663e;
    public final n0 f44664f;
    public final y0 h;
    public final o0 f44665n;
    public final t f44666r;
    public final q0 f44667s;
    public final s0 v;
    public final p0 f44668w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f44660a = sVar;
        this.f44662c = i0Var;
        this.f44661b = x0Var;
        this.d = z0Var;
        this.f44663e = m0Var;
        this.f44664f = n0Var;
        this.h = y0Var;
        this.f44665n = o0Var;
        this.f44666r = tVar;
        this.f44667s = q0Var;
        this.v = s0Var;
        this.f44668w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!b6.m.l(this.f44660a, fVar.f44660a) || !b6.m.l(this.f44661b, fVar.f44661b) || !b6.m.l(this.f44662c, fVar.f44662c) || !b6.m.l(this.d, fVar.d) || !b6.m.l(this.f44663e, fVar.f44663e) || !b6.m.l(this.f44664f, fVar.f44664f) || !b6.m.l(this.h, fVar.h) || !b6.m.l(this.f44665n, fVar.f44665n) || !b6.m.l(this.f44666r, fVar.f44666r) || !b6.m.l(this.f44667s, fVar.f44667s) || !b6.m.l(this.v, fVar.v) || !b6.m.l(this.f44668w, fVar.f44668w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44660a, this.f44661b, this.f44662c, this.d, this.f44663e, this.f44664f, this.h, this.f44665n, this.f44666r, this.f44667s, this.v, this.f44668w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44660a);
        String valueOf2 = String.valueOf(this.f44661b);
        String valueOf3 = String.valueOf(this.f44662c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f44663e);
        String valueOf6 = String.valueOf(this.f44664f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f44665n);
        String valueOf9 = String.valueOf(this.f44666r);
        String valueOf10 = String.valueOf(this.f44667s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder m9 = yh.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        yh.w(m9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        yh.w(m9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        yh.w(m9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        yh.w(m9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return android.support.v4.media.a.r(m9, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44660a, i10);
        g5.k(parcel, 3, this.f44661b, i10);
        g5.k(parcel, 4, this.f44662c, i10);
        g5.k(parcel, 5, this.d, i10);
        g5.k(parcel, 6, this.f44663e, i10);
        g5.k(parcel, 7, this.f44664f, i10);
        g5.k(parcel, 8, this.h, i10);
        g5.k(parcel, 9, this.f44665n, i10);
        g5.k(parcel, 10, this.f44666r, i10);
        g5.k(parcel, 11, this.f44667s, i10);
        g5.k(parcel, 12, this.v, i10);
        g5.k(parcel, 13, this.f44668w, i10);
        g5.r(parcel, q10);
    }
}
