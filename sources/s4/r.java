package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f57067c = new r(new Bundle(), null);
    public final Bundle f57068a;
    public List f57069b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f57068a = bundle;
        this.f57069b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f57069b == null) {
            ArrayList<String> stringArrayList = this.f57068a.getStringArrayList("controlCategories");
            this.f57069b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f57069b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f57069b);
    }

    public final boolean d() {
        a();
        return this.f57069b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f57069b.equals(rVar.f57069b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57069b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
