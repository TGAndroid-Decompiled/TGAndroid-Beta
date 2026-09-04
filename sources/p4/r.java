package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f43900c = new r(new Bundle(), null);
    public final Bundle f43901a;
    public List f43902b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f43901a = bundle;
        this.f43902b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f43902b == null) {
            ArrayList<String> stringArrayList = this.f43901a.getStringArrayList("controlCategories");
            this.f43902b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f43902b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f43902b);
    }

    public final boolean d() {
        a();
        return this.f43902b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f43902b.equals(rVar.f43902b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43902b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
