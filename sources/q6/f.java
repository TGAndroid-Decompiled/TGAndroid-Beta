package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(14);
    public final s f42930a;
    public final x0 f42931b;
    public final i0 f42932c;
    public final z0 d;
    public final m0 e;
    public final n0 f42933f;
    public final y0 h;
    public final o0 f42934n;
    public final t f42935r;
    public final q0 f42936s;
    public final s0 v;
    public final p0 f42937w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f42930a = sVar;
        this.f42932c = i0Var;
        this.f42931b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f42933f = n0Var;
        this.h = y0Var;
        this.f42934n = o0Var;
        this.f42935r = tVar;
        this.f42936s = q0Var;
        this.v = s0Var;
        this.f42937w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!b6.m.l(this.f42930a, fVar.f42930a) || !b6.m.l(this.f42931b, fVar.f42931b) || !b6.m.l(this.f42932c, fVar.f42932c) || !b6.m.l(this.d, fVar.d) || !b6.m.l(this.e, fVar.e) || !b6.m.l(this.f42933f, fVar.f42933f) || !b6.m.l(this.h, fVar.h) || !b6.m.l(this.f42934n, fVar.f42934n) || !b6.m.l(this.f42935r, fVar.f42935r) || !b6.m.l(this.f42936s, fVar.f42936s) || !b6.m.l(this.v, fVar.v) || !b6.m.l(this.f42937w, fVar.f42937w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42930a, this.f42931b, this.f42932c, this.d, this.e, this.f42933f, this.h, this.f42934n, this.f42935r, this.f42936s, this.v, this.f42937w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42930a);
        String valueOf2 = String.valueOf(this.f42931b);
        String valueOf3 = String.valueOf(this.f42932c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f42933f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f42934n);
        String valueOf9 = String.valueOf(this.f42935r);
        String valueOf10 = String.valueOf(this.f42936s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder l10 = ai.l("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        ai.w(l10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        ai.w(l10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        ai.w(l10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        ai.w(l10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return android.support.v4.media.a.r(l10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42930a, i10);
        f5.k(parcel, 3, this.f42931b, i10);
        f5.k(parcel, 4, this.f42932c, i10);
        f5.k(parcel, 5, this.d, i10);
        f5.k(parcel, 6, this.e, i10);
        f5.k(parcel, 7, this.f42933f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.k(parcel, 9, this.f42934n, i10);
        f5.k(parcel, 10, this.f42935r, i10);
        f5.k(parcel, 11, this.f42936s, i10);
        f5.k(parcel, 12, this.v, i10);
        f5.k(parcel, 13, this.f42937w, i10);
        f5.r(parcel, q10);
    }
}
