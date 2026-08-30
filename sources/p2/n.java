package p2;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.yh;
public final class n {
    public final String f41007a;
    public final JSONObject f41008b;
    public final String f41009c;
    public final String d;
    public final String e;
    public final String f41010f;
    public final String f41011g;
    public final ArrayList h;
    public final ArrayList f41012i;

    public n(String str) {
        ArrayList arrayList;
        this.f41007a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f41008b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f41009c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f41010f = jSONObject.optString("skuDetailsToken");
                this.f41011g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new m(optJSONArray.getJSONObject(i10)));
                    }
                    this.h = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.h = arrayList;
                }
                JSONObject optJSONObject = this.f41008b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f41008b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new k(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f41012i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new k(optJSONObject));
                    this.f41012i = arrayList3;
                    return;
                } else {
                    this.f41012i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final k a() {
        ArrayList arrayList = this.f41012i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (k) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return TextUtils.equals(this.f41007a, ((n) obj).f41007a);
    }

    public final int hashCode() {
        return this.f41007a.hashCode();
    }

    public final String toString() {
        String obj = this.f41008b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        yh.x(sb, this.f41007a, "', parsedJson=", obj, ", productId='");
        sb.append(this.f41009c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        sb.append(this.f41010f);
        sb.append("', subscriptionOfferDetails=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
