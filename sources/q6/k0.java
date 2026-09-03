package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
public final class k0 extends c6.a {
    public static final Parcelable.Creator<k0> CREATOR = new r0(11);
    public final List f42958a;

    public k0(ArrayList arrayList) {
        this.f42958a = arrayList;
    }

    public final JSONArray e() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f42958a;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    l0 l0Var = (l0) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l0Var.f42961c);
                    jSONArray2.put((int) l0Var.f42960b);
                    jSONArray2.put((int) l0Var.f42961c);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        List list = ((k0) obj).f42958a;
        List list2 = this.f42958a;
        if (list2 == null && list == null) {
            return true;
        }
        if (list2 == null || list == null || !list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashSet hashSet;
        List list = this.f42958a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.p(parcel, 1, this.f42958a);
        f5.r(parcel, q10);
    }
}
