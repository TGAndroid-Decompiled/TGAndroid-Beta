package p2;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.th;
public final class l {
    public final String f45471a;
    public final JSONObject f45472b;
    public final String f45473c;
    public final String d;
    public final String f45474e;
    public final String f45475f;
    public final String f45476g;
    public final ArrayList h;
    public final ArrayList f45477i;

    public l(String str) {
        ArrayList arrayList;
        this.f45471a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f45472b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f45473c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f45474e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f45475f = jSONObject.optString("skuDetailsToken");
                this.f45476g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new k(optJSONArray.getJSONObject(i10)));
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
                JSONObject optJSONObject = this.f45472b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f45472b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new i(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f45477i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new i(optJSONObject));
                    this.f45477i = arrayList3;
                    return;
                } else {
                    this.f45477i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final i a() {
        ArrayList arrayList = this.f45477i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (i) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return TextUtils.equals(this.f45471a, ((l) obj).f45471a);
    }

    public final int hashCode() {
        return this.f45471a.hashCode();
    }

    public final String toString() {
        String obj = this.f45472b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        th.w(sb2, this.f45471a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f45473c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f45474e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f45475f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
