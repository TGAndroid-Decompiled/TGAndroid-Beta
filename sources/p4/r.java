package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40669c = new r(new Bundle(), null);
    public final Bundle f40670a;
    public List f40671b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40670a = bundle;
        this.f40671b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40671b == null) {
            ArrayList<String> stringArrayList = this.f40670a.getStringArrayList("controlCategories");
            this.f40671b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40671b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40671b);
    }

    public final boolean d() {
        a();
        return this.f40671b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40671b.equals(rVar.f40671b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40671b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
