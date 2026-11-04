package r4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f54346c = new r(new Bundle(), null);
    public final Bundle f54347a;
    public List f54348b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f54347a = bundle;
        this.f54348b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f54348b == null) {
            ArrayList<String> stringArrayList = this.f54347a.getStringArrayList("controlCategories");
            this.f54348b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f54348b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f54348b);
    }

    public final boolean d() {
        a();
        return this.f54348b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f54348b.equals(rVar.f54348b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54348b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
