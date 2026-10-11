package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f45456c = new r(new Bundle(), null);
    public final Bundle f45457a;
    public List f45458b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f45457a = bundle;
        this.f45458b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f45458b == null) {
            ArrayList<String> stringArrayList = this.f45457a.getStringArrayList("controlCategories");
            this.f45458b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f45458b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f45458b);
    }

    public final boolean d() {
        a();
        return this.f45458b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f45458b.equals(rVar.f45458b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45458b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
