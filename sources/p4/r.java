package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f40957c = new r(new Bundle(), null);
    public final Bundle f40958a;
    public List f40959b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f40958a = bundle;
        this.f40959b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f40959b == null) {
            ArrayList<String> stringArrayList = this.f40958a.getStringArrayList("controlCategories");
            this.f40959b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f40959b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f40959b);
    }

    public final boolean d() {
        a();
        return this.f40959b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f40959b.equals(rVar.f40959b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40959b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
