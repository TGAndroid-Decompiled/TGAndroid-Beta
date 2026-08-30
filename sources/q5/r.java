package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f42856a;
    public String f42857b;
    public final JSONObject f42858c;

    public r(k kVar, JSONObject jSONObject) {
        this.f42856a = kVar;
        this.f42858c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!i6.c.a(this.f42858c, rVar.f42858c)) {
            return false;
        }
        return b6.m.l(this.f42856a, rVar.f42856a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42856a, String.valueOf(this.f42858c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42858c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f42857b = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42856a, i10);
        f5.l(parcel, 3, this.f42857b);
        f5.r(parcel, q10);
    }
}
