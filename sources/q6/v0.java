package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends c6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(17);
    public final boolean f42976a;
    public final b7.w0 f42977b;

    public v0(boolean z4, b7.w0 w0Var) {
        this.f42976a = z4;
        this.f42977b = w0Var;
    }

    public final JSONObject e() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f42976a) {
                jSONObject.put("enabled", true);
            }
            b7.w0 w0Var = this.f42977b;
            if (w0Var == null) {
                u10 = null;
            } else {
                u10 = w0Var.u();
            }
            if (u10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(u10, 32), 11));
                if (u10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(u10, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f42976a != v0Var.f42976a || !b6.m.l(this.f42977b, v0Var.f42977b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42976a), this.f42977b});
    }

    public final String toString() {
        return android.support.v4.media.a.o("AuthenticationExtensionsPrfOutputs{", e().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42976a ? 1 : 0);
        b7.w0 w0Var = this.f42977b;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 2, u10);
        f5.r(parcel, q10);
    }
}
