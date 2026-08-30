package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(13);
    public final k0 f42910a;
    public final u0 f42911b;
    public final h f42912c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f42910a = k0Var;
        this.f42911b = u0Var;
        this.f42912c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f42912c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f42913a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            k0 k0Var = this.f42910a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.e());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.e());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e6) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!b6.m.l(this.f42910a, gVar.f42910a) || !b6.m.l(this.f42911b, gVar.f42911b) || !b6.m.l(this.f42912c, gVar.f42912c) || !b6.m.l(this.d, gVar.d) || !b6.m.l(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42910a, this.f42911b, this.f42912c, this.d, this.e});
    }

    public final String toString() {
        return android.support.v4.media.a.o("AuthenticationExtensionsClientOutputs{", e().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f42910a, i10);
        f5.k(parcel, 2, this.f42911b, i10);
        f5.k(parcel, 3, this.f42912c, i10);
        f5.k(parcel, 4, this.d, i10);
        f5.l(parcel, 5, this.e);
        f5.r(parcel, q10);
    }
}
