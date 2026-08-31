package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f44614a;
    public String f44615b;
    public final JSONObject f44616c;

    public r(k kVar, JSONObject jSONObject) {
        this.f44614a = kVar;
        this.f44616c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!i6.c.a(this.f44616c, rVar.f44616c)) {
            return false;
        }
        return b6.m.l(this.f44614a, rVar.f44614a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44614a, String.valueOf(this.f44616c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f44616c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f44615b = jSONObject;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44614a, i10);
        g5.l(parcel, 3, this.f44615b);
        g5.r(parcel, q10);
    }
}
