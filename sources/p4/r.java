package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f46748c = new r(new Bundle(), null);
    public final Bundle f46749a;
    public List f46750b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f46749a = bundle;
        this.f46750b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f46750b == null) {
            ArrayList<String> stringArrayList = this.f46749a.getStringArrayList("controlCategories");
            this.f46750b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f46750b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f46750b);
    }

    public final boolean d() {
        a();
        return this.f46750b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f46750b.equals(rVar.f46750b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f46750b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
