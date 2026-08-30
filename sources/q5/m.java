package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f42829a;
    public String f42830b;
    public List f42831c;
    public List d;
    public double e;

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f42829a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f42830b)) {
                jSONObject.put("title", this.f42830b);
            }
            List list = this.f42831c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f42831c) {
                    jSONArray.put(lVar.g());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", v5.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f42829a == mVar.f42829a && TextUtils.equals(this.f42830b, mVar.f42830b) && b6.m.l(this.f42831c, mVar.f42831c) && b6.m.l(this.d, mVar.d) && this.e == mVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42829a), this.f42830b, this.f42831c, this.d, Double.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f42829a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f42830b);
        List list = this.f42831c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        f5.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        f5.p(parcel, 5, list2);
        double d = this.e;
        f5.s(parcel, 6, 8);
        parcel.writeDouble(d);
        f5.r(parcel, q10);
    }
}
