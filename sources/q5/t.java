package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f44627a;
    public final String f44628b;

    public t(String str, String str2) {
        this.f44627a = str;
        this.f44628b = str2;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f44627a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f44628b;
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
        if (u5.a.d(this.f44627a, tVar.f44627a) && u5.a.d(this.f44628b, tVar.f44628b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44627a, this.f44628b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44627a);
        g5.l(parcel, 3, this.f44628b);
        g5.r(parcel, q10);
    }
}
