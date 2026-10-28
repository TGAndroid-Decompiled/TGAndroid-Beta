package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class r {
    public static final r f46783c = new r(new Bundle(), null);
    public final Bundle f46784a;
    public List f46785b;

    public r(Bundle bundle, ArrayList arrayList) {
        this.f46784a = bundle;
        this.f46785b = arrayList;
    }

    public static r b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new r(bundle, null);
    }

    public final void a() {
        if (this.f46785b == null) {
            ArrayList<String> stringArrayList = this.f46784a.getStringArrayList("controlCategories");
            this.f46785b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f46785b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f46785b);
    }

    public final boolean d() {
        a();
        return this.f46785b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            a();
            rVar.a();
            return this.f46785b.equals(rVar.f46785b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f46785b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
