package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f42868a;
    public final String f42869b;

    public t(String str, String str2) {
        this.f42868a = str;
        this.f42869b = str2;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f42868a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f42869b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (u5.a.d(this.f42868a, tVar.f42868a) && u5.a.d(this.f42869b, tVar.f42869b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42868a, this.f42869b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42868a);
        f5.l(parcel, 3, this.f42869b);
        f5.r(parcel, q10);
    }
}
