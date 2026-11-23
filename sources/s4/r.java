package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f57032c = new r(new Bundle(), null);
    public final Bundle f57033a;
    public List f57034b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f57033a = bundle;
        this.f57034b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f57034b == null) {
            ArrayList<String> stringArrayList = this.f57033a.getStringArrayList("controlCategories");
            this.f57034b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f57034b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f57034b);
    }

    public final boolean d() {
        a();
        return this.f57034b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f57034b.equals(rVar.f57034b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57034b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
