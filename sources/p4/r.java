package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f44187c = new r(new Bundle(), null);
    public final Bundle f44188a;
    public List f44189b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f44188a = bundle;
        this.f44189b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f44189b == null) {
            ArrayList<String> stringArrayList = this.f44188a.getStringArrayList("controlCategories");
            this.f44189b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f44189b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f44189b);
    }

    public final boolean d() {
        a();
        return this.f44189b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f44189b.equals(rVar.f44189b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44189b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
