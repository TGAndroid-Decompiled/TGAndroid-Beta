package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f56448c = new r(new Bundle(), null);
    public final Bundle f56449a;
    public List f56450b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f56449a = bundle;
        this.f56450b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f56450b == null) {
            ArrayList<String> stringArrayList = this.f56449a.getStringArrayList("controlCategories");
            this.f56450b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f56450b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f56450b);
    }

    public final boolean d() {
        a();
        return this.f56450b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f56450b.equals(rVar.f56450b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f56450b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
