package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(21);
    public final c f44695a;
    public final Boolean f44696b;
    public final j0 f44697c;
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
            } catch (b | d0 | t0 e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        this.f44695a = a2;
        this.f44696b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f44697c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 e() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f44696b;
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
        if (!b6.m.l(this.f44695a, mVar.f44695a) || !b6.m.l(this.f44696b, mVar.f44696b) || !b6.m.l(this.f44697c, mVar.f44697c) || !b6.m.l(e(), mVar.e())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44695a, this.f44696b, this.f44697c, e()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44695a);
        String valueOf2 = String.valueOf(this.f44697c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder t6 = android.support.v4.media.a.t("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        t6.append(this.f44696b);
        t6.append(", \n requireUserVerification=");
        t6.append(valueOf2);
        t6.append(", \n residentKeyRequirement=");
        return android.support.v4.media.a.r(t6, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q10 = g5.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f44695a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f44650a;
        }
        g5.l(parcel, 2, str);
        g5.a(parcel, 3, this.f44696b);
        j0 j0Var = this.f44697c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f44687a;
        }
        g5.l(parcel, 4, str2);
        e0 e6 = e();
        if (e6 != null) {
            str3 = e6.f44659a;
        }
        g5.l(parcel, 5, str3);
        g5.r(parcel, q10);
    }
}
