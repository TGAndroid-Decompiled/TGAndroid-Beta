package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f57063c = new r(new Bundle(), null);
    public final Bundle f57064a;
    public List f57065b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f57064a = bundle;
        this.f57065b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f57065b == null) {
            ArrayList<String> stringArrayList = this.f57064a.getStringArrayList("controlCategories");
            this.f57065b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f57065b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f57065b);
    }

    public final boolean d() {
        a();
        return this.f57065b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f57065b.equals(rVar.f57065b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57065b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
