package td;
public abstract class a0 extends cd.a implements cd.e {
    public static final z f48598b = new z(cd.d.f4122a, y.f48679b);

    public a0() {
        super(cd.d.f4122a);
    }

    public abstract void c(cd.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    @Override
    public final cd.f get(cd.g key) {
        cd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            cd.g gVar = this.f4119a;
            if ((gVar != zVar && zVar.f48682b != gVar) || (fVar = (cd.f) zVar.f48681a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (cd.d.f4122a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final cd.h minusKey(cd.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: td.a0.minusKey(cd.g):cd.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
