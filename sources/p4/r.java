package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40638c = new r(new Bundle(), null);
    public final Bundle f40639a;
    public List f40640b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40639a = bundle;
        this.f40640b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40640b == null) {
            ArrayList<String> stringArrayList = this.f40639a.getStringArrayList("controlCategories");
            this.f40640b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40640b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40640b);
    }

    public final boolean d() {
        a();
        return this.f40640b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40640b.equals(rVar.f40640b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40640b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
