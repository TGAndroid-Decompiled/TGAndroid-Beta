package wd;
public abstract class x extends fd.a implements fd.e {
    public static final w f57548b = new w(fd.d.f11566a, new db.o(2));

    public x() {
        super(fd.d.f11566a);
    }

    public abstract void c(fd.h hVar, Runnable runnable);

    public boolean e(fd.h hVar) {
        return !(this instanceof z1);
    }

    public x f(int i3) {
        be.a.a(i3);
        return new be.g(this, i3);
    }

    @Override
    public final fd.f get(fd.g key) {
        fd.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof w) {
            w wVar = (w) key;
            fd.g gVar = this.f11563a;
            if ((gVar != wVar && wVar.f57544b != gVar) || (fVar = (fd.f) wVar.f57543a.invoke(this)) == null) {
                return null;
            }
            return fVar;
        } else if (fd.d.f11566a != key) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final fd.h minusKey(fd.g r3) {
        throw new UnsupportedOperationException("Method not decompiled: wd.x.minusKey(fd.g):fd.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this);
    }
}
