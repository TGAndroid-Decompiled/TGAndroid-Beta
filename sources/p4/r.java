package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f43928c = new r(new Bundle(), null);
    public final Bundle f43929a;
    public List f43930b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f43929a = bundle;
        this.f43930b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f43930b == null) {
            ArrayList<String> stringArrayList = this.f43929a.getStringArrayList("controlCategories");
            this.f43930b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f43930b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f43930b);
    }

    public final boolean d() {
        a();
        return this.f43930b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f43930b.equals(rVar.f43930b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43930b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
