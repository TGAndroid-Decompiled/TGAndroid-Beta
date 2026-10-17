package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f44205c = new r(new Bundle(), null);
    public final Bundle f44206a;
    public List f44207b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f44206a = bundle;
        this.f44207b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f44207b == null) {
            ArrayList<String> stringArrayList = this.f44206a.getStringArrayList("controlCategories");
            this.f44207b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f44207b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f44207b);
    }

    public final boolean d() {
        a();
        return this.f44207b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f44207b.equals(rVar.f44207b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44207b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
