package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40907c = new r(new Bundle(), null);
    public final Bundle f40908a;
    public List f40909b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40908a = bundle;
        this.f40909b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40909b == null) {
            ArrayList<String> stringArrayList = this.f40908a.getStringArrayList("controlCategories");
            this.f40909b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40909b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40909b);
    }

    public final boolean d() {
        a();
        return this.f40909b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40909b.equals(rVar.f40909b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40909b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
