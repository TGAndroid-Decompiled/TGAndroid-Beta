package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class s {
    public static final s f45310c = new s(new Bundle(), null);
    public final Bundle f45311a;
    public List f45312b;

    public s(Bundle bundle, ArrayList arrayList) {
        this.f45311a = bundle;
        this.f45312b = arrayList;
    }

    public static s b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new s(bundle, null);
    }

    public final void a() {
        if (this.f45312b == null) {
            ArrayList<String> stringArrayList = this.f45311a.getStringArrayList("controlCategories");
            this.f45312b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f45312b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f45312b);
    }

    public final boolean d() {
        a();
        return this.f45312b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            a();
            sVar.a();
            return this.f45312b.equals(sVar.f45312b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45312b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
