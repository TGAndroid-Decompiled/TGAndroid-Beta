package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class s {
    public static final s f44813c = new s(new Bundle(), null);
    public final Bundle f44814a;
    public List f44815b;

    public s(Bundle bundle, ArrayList arrayList) {
        this.f44814a = bundle;
        this.f44815b = arrayList;
    }

    public static s b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new s(bundle, null);
    }

    public final void a() {
        if (this.f44815b == null) {
            ArrayList<String> stringArrayList = this.f44814a.getStringArrayList("controlCategories");
            this.f44815b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f44815b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f44815b);
    }

    public final boolean d() {
        a();
        return this.f44815b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            a();
            sVar.a();
            return this.f44815b.equals(sVar.f44815b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44815b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
