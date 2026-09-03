package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(14);
    public final s f44691a;
    public final x0 f44692b;
    public final i0 f44693c;
    public final z0 d;
    public final m0 f44694e;
    public final n0 f44695f;
    public final y0 h;
    public final o0 f44696n;
    public final t f44697r;
    public final q0 f44698s;
    public final s0 v;
    public final p0 f44699w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f44691a = sVar;
        this.f44693c = i0Var;
        this.f44692b = x0Var;
        this.d = z0Var;
        this.f44694e = m0Var;
        this.f44695f = n0Var;
        this.h = y0Var;
        this.f44696n = o0Var;
        this.f44697r = tVar;
        this.f44698s = q0Var;
        this.v = s0Var;
        this.f44699w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!b6.m.l(this.f44691a, fVar.f44691a) || !b6.m.l(this.f44692b, fVar.f44692b) || !b6.m.l(this.f44693c, fVar.f44693c) || !b6.m.l(this.d, fVar.d) || !b6.m.l(this.f44694e, fVar.f44694e) || !b6.m.l(this.f44695f, fVar.f44695f) || !b6.m.l(this.h, fVar.h) || !b6.m.l(this.f44696n, fVar.f44696n) || !b6.m.l(this.f44697r, fVar.f44697r) || !b6.m.l(this.f44698s, fVar.f44698s) || !b6.m.l(this.v, fVar.v) || !b6.m.l(this.f44699w, fVar.f44699w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44691a, this.f44692b, this.f44693c, this.d, this.f44694e, this.f44695f, this.h, this.f44696n, this.f44697r, this.f44698s, this.v, this.f44699w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44691a);
        String valueOf2 = String.valueOf(this.f44692b);
        String valueOf3 = String.valueOf(this.f44693c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f44694e);
        String valueOf6 = String.valueOf(this.f44695f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f44696n);
        String valueOf9 = String.valueOf(this.f44697r);
        String valueOf10 = String.valueOf(this.f44698s);
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
        g5.k(parcel, 2, this.f44691a, i10);
        g5.k(parcel, 3, this.f44692b, i10);
        g5.k(parcel, 4, this.f44693c, i10);
        g5.k(parcel, 5, this.d, i10);
        g5.k(parcel, 6, this.f44694e, i10);
        g5.k(parcel, 7, this.f44695f, i10);
        g5.k(parcel, 8, this.h, i10);
        g5.k(parcel, 9, this.f44696n, i10);
        g5.k(parcel, 10, this.f44697r, i10);
        g5.k(parcel, 11, this.f44698s, i10);
        g5.k(parcel, 12, this.v, i10);
        g5.k(parcel, 13, this.f44699w, i10);
        g5.r(parcel, q10);
    }
}
