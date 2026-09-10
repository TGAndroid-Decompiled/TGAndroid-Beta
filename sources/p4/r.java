package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f39767c = new r(new Bundle(), null);
    public final Bundle f39768a;
    public List f39769b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f39768a = bundle;
        this.f39769b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f39769b == null) {
            ArrayList<String> stringArrayList = this.f39768a.getStringArrayList("controlCategories");
            this.f39769b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f39769b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f39769b);
    }

    public final boolean d() {
        a();
        return this.f39769b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f39769b.equals(rVar.f39769b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f39769b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
