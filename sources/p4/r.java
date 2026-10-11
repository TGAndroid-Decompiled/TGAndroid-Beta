package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f45490c = new r(new Bundle(), null);
    public final Bundle f45491a;
    public List f45492b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f45491a = bundle;
        this.f45492b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f45492b == null) {
            ArrayList<String> stringArrayList = this.f45491a.getStringArrayList("controlCategories");
            this.f45492b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f45492b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f45492b);
    }

    public final boolean d() {
        a();
        return this.f45492b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f45492b.equals(rVar.f45492b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45492b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
