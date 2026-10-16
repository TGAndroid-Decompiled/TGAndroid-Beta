package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f42795c = new r(new Bundle(), null);
    public final Bundle f42796a;
    public List f42797b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f42796a = bundle;
        this.f42797b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f42797b == null) {
            ArrayList<String> stringArrayList = this.f42796a.getStringArrayList("controlCategories");
            this.f42797b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f42797b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f42797b);
    }

    public final boolean d() {
        a();
        return this.f42797b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f42797b.equals(rVar.f42797b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f42797b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
