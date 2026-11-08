package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f54883c = new r(new Bundle(), null);
    public final Bundle f54884a;
    public List f54885b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f54884a = bundle;
        this.f54885b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f54885b == null) {
            ArrayList<String> stringArrayList = this.f54884a.getStringArrayList("controlCategories");
            this.f54885b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f54885b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f54885b);
    }

    public final boolean d() {
        a();
        return this.f54885b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f54885b.equals(rVar.f54885b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54885b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
