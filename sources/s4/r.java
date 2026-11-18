package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f57022c = new r(new Bundle(), null);
    public final Bundle f57023a;
    public List f57024b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f57023a = bundle;
        this.f57024b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f57024b == null) {
            ArrayList<String> stringArrayList = this.f57023a.getStringArrayList("controlCategories");
            this.f57024b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f57024b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f57024b);
    }

    public final boolean d() {
        a();
        return this.f57024b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f57024b.equals(rVar.f57024b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57024b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
