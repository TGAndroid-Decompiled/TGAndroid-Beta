package p2;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.yh;
public final class m {
    public final String f44159a;
    public final JSONObject f44160b;
    public final String f44161c;
    public final String d;
    public final String f44162e;
    public final String f44163f;
    public final String f44164g;
    public final ArrayList h;
    public final ArrayList f44165i;

    public m(String str) {
        ArrayList arrayList;
        this.f44159a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f44160b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f44161c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f44162e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f44163f = jSONObject.optString("skuDetailsToken");
                this.f44164g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new l(optJSONArray.getJSONObject(i10)));
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
                JSONObject optJSONObject = this.f44160b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f44160b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new j(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f44165i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new j(optJSONObject));
                    this.f44165i = arrayList3;
                    return;
                } else {
                    this.f44165i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final j a() {
        ArrayList arrayList = this.f44165i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (j) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return TextUtils.equals(this.f44159a, ((m) obj).f44159a);
    }

    public final int hashCode() {
        return this.f44159a.hashCode();
    }

    public final String toString() {
        String obj = this.f44160b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        yh.w(sb, this.f44159a, "', parsedJson=", obj, ", productId='");
        sb.append(this.f44161c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.f44162e);
        sb.append("', productDetailsToken='");
        sb.append(this.f44163f);
        sb.append("', subscriptionOfferDetails=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
