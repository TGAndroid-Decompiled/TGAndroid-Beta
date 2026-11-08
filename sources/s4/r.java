package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f54882c = new r(new Bundle(), null);
    public final Bundle f54883a;
    public List f54884b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f54883a = bundle;
        this.f54884b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f54884b == null) {
            ArrayList<String> stringArrayList = this.f54883a.getStringArrayList("controlCategories");
            this.f54884b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f54884b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f54884b);
    }

    public final boolean d() {
        a();
        return this.f54884b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f54884b.equals(rVar.f54884b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54884b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
