package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(13);
    public final k0 f44671a;
    public final u0 f44672b;
    public final h f44673c;
    public final v0 d;
    public final String f44674e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f44671a = k0Var;
        this.f44672b = u0Var;
        this.f44673c = hVar;
        this.d = v0Var;
        this.f44674e = str;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f44673c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f44675a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e6) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e6);
                }
            }
            k0 k0Var = this.f44671a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.e());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.e());
            }
            String str = this.f44674e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!b6.m.l(this.f44671a, gVar.f44671a) || !b6.m.l(this.f44672b, gVar.f44672b) || !b6.m.l(this.f44673c, gVar.f44673c) || !b6.m.l(this.d, gVar.d) || !b6.m.l(this.f44674e, gVar.f44674e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44671a, this.f44672b, this.f44673c, this.d, this.f44674e});
    }

    public final String toString() {
        return android.support.v4.media.a.o("AuthenticationExtensionsClientOutputs{", e().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f44671a, i10);
        g5.k(parcel, 2, this.f44672b, i10);
        g5.k(parcel, 3, this.f44673c, i10);
        g5.k(parcel, 4, this.d, i10);
        g5.l(parcel, 5, this.f44674e);
        g5.r(parcel, q10);
    }
}
