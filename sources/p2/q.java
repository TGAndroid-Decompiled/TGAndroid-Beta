package p2;

import android.text.TextUtils;
import org.json.JSONObject;
public final class q {
    public final String f45482a;
    public final String f45483b;
    public final String f45484c;
    public final int d;

    public q(String str) {
        int i10;
        this.f45482a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f45483b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f45484c = optString;
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
        if (!(obj instanceof q)) {
            return false;
        }
        return TextUtils.equals(this.f45482a, ((q) obj).f45482a);
    }

    public final int hashCode() {
        return this.f45482a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f45483b);
        sb2.append("', productType='");
        sb2.append(this.f45484c);
        sb2.append("', statusCode=");
        return a4.w.l(this.d, "}", sb2);
    }
}
