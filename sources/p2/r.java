package p2;

import android.text.TextUtils;
import org.json.JSONObject;
public final class r {
    public final String f44170a;
    public final String f44171b;
    public final String f44172c;
    public final int d;

    public r(String str) {
        int i10;
        this.f44170a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f44171b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f44172c = optString;
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
        if (!(obj instanceof r)) {
            return false;
        }
        return TextUtils.equals(this.f44170a, ((r) obj).f44170a);
    }

    public final int hashCode() {
        return this.f44170a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f44171b);
        sb.append("', productType='");
        sb.append(this.f44172c);
        sb.append("', statusCode=");
        return android.support.v4.media.a.m(this.d, "}", sb);
    }
}
