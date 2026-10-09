package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f45420c = new r(new Bundle(), null);
    public final Bundle f45421a;
    public List f45422b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f45421a = bundle;
        this.f45422b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f45422b == null) {
            ArrayList<String> stringArrayList = this.f45421a.getStringArrayList("controlCategories");
            this.f45422b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f45422b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f45422b);
    }

    public final boolean d() {
        a();
        return this.f45422b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f45422b.equals(rVar.f45422b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45422b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
