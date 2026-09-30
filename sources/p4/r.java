package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40911c = new r(new Bundle(), null);
    public final Bundle f40912a;
    public List f40913b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40912a = bundle;
        this.f40913b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40913b == null) {
            ArrayList<String> stringArrayList = this.f40912a.getStringArrayList("controlCategories");
            this.f40913b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40913b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40913b);
    }

    public final boolean d() {
        a();
        return this.f40913b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40913b.equals(rVar.f40913b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40913b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
