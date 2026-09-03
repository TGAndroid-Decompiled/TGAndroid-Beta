package p2;

import android.text.TextUtils;
import org.json.JSONObject;
public final class s {
    public final String f41039a;
    public final String f41040b;
    public final String f41041c;
    public final int d;

    public s(String str) {
        int i10;
        this.f41039a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f41040b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f41041c = optString;
        if (jSONObject.has("statusCode")) {
            i10 = jSONObject.optInt("statusCode");
        } else {
            i10 = 0;
        }
        this.d = i10;
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.optString("serializedDocid");
            return;
        }
        throw new IllegalArgumentException("Product type cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return TextUtils.equals(this.f41039a, ((s) obj).f41039a);
    }

    public final int hashCode() {
        return this.f41039a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f41040b);
        sb.append("', productType='");
        sb.append(this.f41041c);
        sb.append("', statusCode=");
        return android.support.v4.media.a.m(this.d, "}", sb);
    }
}
