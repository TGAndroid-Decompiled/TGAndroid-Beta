package ug;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h7.v8;
import java.util.Collections;
import java.util.HashSet;
import z8.q;

public final class b {

    public int f48637a;

    public int f48638b;

    public Object f48639c;
    public final Object d;

    public final Object f48640e;

    public Object f48641f;

    public final Object f48642g;

    public b(Class cls, Class[] clsArr) {
        this.f48639c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f48640e = new HashSet();
        this.f48637a = 0;
        this.f48638b = 0;
        this.f48642g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            v8.a(cls2, "Null interface");
            ((HashSet) this.d).add(q.a(cls2));
        }
    }

    public void a(z8.i iVar) {
        if (((HashSet) this.d).contains(iVar.f50238a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f48640e).add(iVar);
    }

    public z8.a b() {
        if (((z8.d) this.f48641f) != null) {
            return new z8.a((String) this.f48639c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f48640e), this.f48637a, this.f48638b, (z8.d) this.f48641f, (HashSet) this.f48642g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.f48637a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f48637a = i10;
    }

    public b(q qVar, q[] qVarArr) {
        this.f48639c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f48640e = new HashSet();
        this.f48637a = 0;
        this.f48638b = 0;
        this.f48642g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            v8.a(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, qVarArr);
    }

    public b() {
        this.f48639c = new RectF();
        this.f48641f = new Path();
        this.d = new RectF();
        this.f48640e = new RectF();
        this.f48642g = new PointF();
    }
}
