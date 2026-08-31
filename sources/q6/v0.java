package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends c6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(17);
    public final boolean f44742a;
    public final b7.w0 f44743b;

    public v0(boolean z4, b7.w0 w0Var) {
        this.f44742a = z4;
        this.f44743b = w0Var;
    }

    public final JSONObject e() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f44742a) {
                jSONObject.put("enabled", true);
            }
            b7.w0 w0Var = this.f44743b;
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
        } catch (JSONException e6) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f44742a != v0Var.f44742a || !b6.m.l(this.f44743b, v0Var.f44743b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44742a), this.f44743b});
    }

    public final String toString() {
        return android.support.v4.media.a.o("AuthenticationExtensionsPrfOutputs{", e().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44742a ? 1 : 0);
        b7.w0 w0Var = this.f44743b;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        g5.c(parcel, 2, u10);
        g5.r(parcel, q10);
    }
}
