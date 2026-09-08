package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f43927c = new r(new Bundle(), null);
    public final Bundle f43928a;
    public List f43929b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f43928a = bundle;
        this.f43929b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f43929b == null) {
            ArrayList<String> stringArrayList = this.f43928a.getStringArrayList("controlCategories");
            this.f43929b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f43929b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f43929b);
    }

    public final boolean d() {
        a();
        return this.f43929b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f43929b.equals(rVar.f43929b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43929b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
