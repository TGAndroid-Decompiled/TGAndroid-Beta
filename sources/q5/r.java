package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f42886a;
    public String f42887b;
    public final JSONObject f42888c;

    public r(k kVar, JSONObject jSONObject) {
        this.f42886a = kVar;
        this.f42888c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!i6.c.a(this.f42888c, rVar.f42888c)) {
            return false;
        }
        return b6.m.l(this.f42886a, rVar.f42886a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42886a, String.valueOf(this.f42888c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42888c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f42887b = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42886a, i10);
        f5.l(parcel, 3, this.f42887b);
        f5.r(parcel, q10);
    }
}
