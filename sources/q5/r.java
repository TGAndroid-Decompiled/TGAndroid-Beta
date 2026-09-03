package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f44645a;
    public String f44646b;
    public final JSONObject f44647c;

    public r(k kVar, JSONObject jSONObject) {
        this.f44645a = kVar;
        this.f44647c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!i6.c.a(this.f44647c, rVar.f44647c)) {
            return false;
        }
        return b6.m.l(this.f44645a, rVar.f44645a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44645a, String.valueOf(this.f44647c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f44647c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f44646b = jSONObject;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44645a, i10);
        g5.l(parcel, 3, this.f44646b);
        g5.r(parcel, q10);
    }
}
