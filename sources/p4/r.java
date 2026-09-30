package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f41008c = new r(new Bundle(), null);
    public final Bundle f41009a;
    public List f41010b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f41009a = bundle;
        this.f41010b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f41010b == null) {
            ArrayList<String> stringArrayList = this.f41009a.getStringArrayList("controlCategories");
            this.f41010b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f41010b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f41010b);
    }

    public final boolean d() {
        a();
        return this.f41010b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f41010b.equals(rVar.f41010b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f41010b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
