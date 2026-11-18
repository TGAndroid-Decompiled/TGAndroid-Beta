package zd;
public abstract class x extends id.a implements id.e {
    public static final w f61901b = new w(id.d.f16228a, new gb.o(2));

    public x() {
        super(id.d.f16228a);
    }

    public abstract void c(id.h hVar, Runnable runnable);

    public boolean d(id.h hVar) {
        return !(this instanceof z1);
    }

    public x f(int i7) {
        ee.a.a(i7);
        return new ee.g(this, i7);
    }

    @Override
    public final id.f get(id.g key) {
        id.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof w) {
            w wVar = (w) key;
            id.g gVar = this.f16225a;
            if ((gVar != wVar && wVar.f61897b != gVar) || (fVar = (id.f) wVar.f61896a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (id.d.f16228a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final id.h minusKey(id.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: zd.x.minusKey(id.g):id.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this);
    }
}
