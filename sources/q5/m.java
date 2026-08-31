package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f44583a;
    public String f44584b;
    public List f44585c;
    public List d;
    public double f44586e;

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f44583a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f44584b)) {
                jSONObject.put("title", this.f44584b);
            }
            List list = this.f44585c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f44585c) {
                    jSONArray.put(lVar.g());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", v5.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f44586e);
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
        if (this.f44583a == mVar.f44583a && TextUtils.equals(this.f44584b, mVar.f44584b) && b6.m.l(this.f44585c, mVar.f44585c) && b6.m.l(this.d, mVar.d) && this.f44586e == mVar.f44586e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44583a), this.f44584b, this.f44585c, this.d, Double.valueOf(this.f44586e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f44583a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f44584b);
        List list = this.f44585c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g5.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        g5.p(parcel, 5, list2);
        double d = this.f44586e;
        g5.s(parcel, 6, 8);
        parcel.writeDouble(d);
        g5.r(parcel, q10);
    }
}
