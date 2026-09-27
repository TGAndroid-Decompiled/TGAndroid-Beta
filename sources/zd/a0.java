package zd;
public abstract class a0 extends id.a implements id.e {
    public static final z f49182b = new z(id.d.f11073a, y.f49262b);

    public a0() {
        super(id.d.f11073a);
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
            id.g gVar = this.f11070a;
            if ((gVar != zVar && zVar.f49265b != gVar) || (fVar = (id.f) zVar.f49264a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (id.d.f11073a != key) {
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
