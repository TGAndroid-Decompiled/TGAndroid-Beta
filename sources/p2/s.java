package p2;

import android.text.TextUtils;
import org.json.JSONObject;
public final class s {
    public final String f41017a;
    public final String f41018b;
    public final String f41019c;
    public final int d;

    public s(String str) {
        int i10;
        this.f41017a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f41018b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f41019c = optString;
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
        return TextUtils.equals(this.f41017a, ((s) obj).f41017a);
    }

    public final int hashCode() {
        return this.f41017a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f41018b);
        sb.append("', productType='");
        sb.append(this.f41019c);
        sb.append("', statusCode=");
        return android.support.v4.media.a.m(this.d, "}", sb);
    }
}
