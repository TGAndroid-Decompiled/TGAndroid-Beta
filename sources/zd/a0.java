package zd;
public abstract class a0 extends id.a implements id.e {
    public static final z f47985b = new z(id.d.f10564a, y.f48065b);

    public a0() {
        super(id.d.f10564a);
    }

    public abstract void c(id.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    @Override
    public final id.f get(id.g key) {
        id.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            id.g gVar = this.f10561a;
            if ((gVar != zVar && zVar.f48068b != gVar) || (fVar = (id.f) zVar.f48067a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (id.d.f10564a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final id.h minusKey(id.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: zd.a0.minusKey(id.g):id.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
