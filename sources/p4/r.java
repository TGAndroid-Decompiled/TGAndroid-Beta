package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f44605c = new r(new Bundle(), null);
    public final Bundle f44606a;
    public List f44607b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f44606a = bundle;
        this.f44607b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f44607b == null) {
            ArrayList<String> stringArrayList = this.f44606a.getStringArrayList("controlCategories");
            this.f44607b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f44607b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f44607b);
    }

    public final boolean d() {
        a();
        return this.f44607b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f44607b.equals(rVar.f44607b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44607b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
