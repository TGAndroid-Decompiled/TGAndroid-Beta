package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f54791c = new r(new Bundle(), null);
    public final Bundle f54792a;
    public List f54793b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f54792a = bundle;
        this.f54793b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f54793b == null) {
            ArrayList<String> stringArrayList = this.f54792a.getStringArrayList("controlCategories");
            this.f54793b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f54793b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f54793b);
    }

    public final boolean d() {
        a();
        return this.f54793b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f54793b.equals(rVar.f54793b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54793b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
