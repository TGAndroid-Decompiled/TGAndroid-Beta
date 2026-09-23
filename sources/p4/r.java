package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40593c = new r(new Bundle(), null);
    public final Bundle f40594a;
    public List f40595b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40594a = bundle;
        this.f40595b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40595b == null) {
            ArrayList<String> stringArrayList = this.f40594a.getStringArrayList("controlCategories");
            this.f40595b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40595b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40595b);
    }

    public final boolean d() {
        a();
        return this.f40595b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40595b.equals(rVar.f40595b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40595b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
