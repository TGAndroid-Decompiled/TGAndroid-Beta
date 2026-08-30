package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(21);
    public final c f42932a;
    public final Boolean f42933b;
    public final j0 f42934c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a2;
        j0 a10;
        e0 e0Var = null;
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = c.a(str);
            } catch (b | d0 | t0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f42932a = a2;
        this.f42933b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f42934c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 e() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f42933b;
            if (bool == null || !bool.booleanValue()) {
                return null;
            }
            return e0.RESIDENT_KEY_REQUIRED;
        }
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!b6.m.l(this.f42932a, mVar.f42932a) || !b6.m.l(this.f42933b, mVar.f42933b) || !b6.m.l(this.f42934c, mVar.f42934c) || !b6.m.l(e(), mVar.e())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42932a, this.f42933b, this.f42934c, e()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42932a);
        String valueOf2 = String.valueOf(this.f42934c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder t6 = android.support.v4.media.a.t("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        t6.append(this.f42933b);
        t6.append(", \n requireUserVerification=");
        t6.append(valueOf2);
        t6.append(", \n residentKeyRequirement=");
        return android.support.v4.media.a.r(t6, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q10 = f5.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f42932a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f42890a;
        }
        f5.l(parcel, 2, str);
        f5.a(parcel, 3, this.f42933b);
        j0 j0Var = this.f42934c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f42924a;
        }
        f5.l(parcel, 4, str2);
        e0 e = e();
        if (e != null) {
            str3 = e.f42899a;
        }
        f5.l(parcel, 5, str3);
        f5.r(parcel, q10);
    }
}
