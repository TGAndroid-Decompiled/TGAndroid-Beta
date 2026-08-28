package tg;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g7.t8;
import java.util.Collections;
import java.util.HashSet;
import y8.j;
import y8.r;
public final class b {
    public int f47915a;
    public int f47916b;
    public Object f47917c;
    public final Object d;
    public final Object f47918e;
    public Object f47919f;
    public final Object f47920g;

    public b(Class cls, Class[] clsArr) {
        this.f47917c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f47918e = new HashSet();
        this.f47915a = 0;
        this.f47916b = 0;
        this.f47920g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            t8.a(cls2, "Null interface");
            ((HashSet) this.d).add(r.a(cls2));
        }
    }

    public void a(j jVar) {
        if (!((HashSet) this.d).contains(jVar.f49642a)) {
            ((HashSet) this.f47918e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public y8.a b() {
        boolean z10;
        if (((y8.d) this.f47919f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new y8.a((String) this.f47917c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f47918e), this.f47915a, this.f47916b, (y8.d) this.f47919f, (HashSet) this.f47920g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i9) {
        boolean z10;
        if (this.f47915a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f47915a = i9;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public b(r rVar, r[] rVarArr) {
        this.f47917c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f47918e = new HashSet();
        this.f47915a = 0;
        this.f47916b = 0;
        this.f47920g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            t8.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, rVarArr);
    }

    public b() {
        this.f47917c = new RectF();
        this.f47919f = new Path();
        this.d = new RectF();
        this.f47918e = new RectF();
        this.f47920g = new PointF();
    }
}
