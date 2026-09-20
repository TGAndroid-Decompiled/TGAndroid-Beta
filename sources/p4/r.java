package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40936c = new r(new Bundle(), null);
    public final Bundle f40937a;
    public List f40938b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40937a = bundle;
        this.f40938b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40938b == null) {
            ArrayList<String> stringArrayList = this.f40937a.getStringArrayList("controlCategories");
            this.f40938b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40938b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40938b);
    }

    public final boolean d() {
        a();
        return this.f40938b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40938b.equals(rVar.f40938b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40938b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
