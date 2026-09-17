package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f43901c = new r(new Bundle(), null);
    public final Bundle f43902a;
    public List f43903b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f43902a = bundle;
        this.f43903b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f43903b == null) {
            ArrayList<String> stringArrayList = this.f43902a.getStringArrayList("controlCategories");
            this.f43903b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f43903b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f43903b);
    }

    public final boolean d() {
        a();
        return this.f43903b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f43903b.equals(rVar.f43903b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43903b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
