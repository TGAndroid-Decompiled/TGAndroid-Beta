package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f57148c = new r(new Bundle(), null);
    public final Bundle f57149a;
    public List f57150b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f57149a = bundle;
        this.f57150b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f57150b == null) {
            ArrayList<String> stringArrayList = this.f57149a.getStringArrayList("controlCategories");
            this.f57150b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f57150b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f57150b);
    }

    public final boolean d() {
        a();
        return this.f57150b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f57150b.equals(rVar.f57150b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57150b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
