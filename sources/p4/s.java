package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class s {
    public static final s f45315c = new s(new Bundle(), null);
    public final Bundle f45316a;
    public List f45317b;

    public s(Bundle bundle, ArrayList arrayList) {
        this.f45316a = bundle;
        this.f45317b = arrayList;
    }

    public static s b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new s(bundle, null);
    }

    public final void a() {
        if (this.f45317b == null) {
            ArrayList<String> stringArrayList = this.f45316a.getStringArrayList("controlCategories");
            this.f45317b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f45317b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f45317b);
    }

    public final boolean d() {
        a();
        return this.f45317b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            a();
            sVar.a();
            return this.f45317b.equals(sVar.f45317b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45317b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
