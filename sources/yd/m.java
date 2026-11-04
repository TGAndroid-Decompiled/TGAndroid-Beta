package yd;

import k2.p1;
public final class m extends c {
    public final a f59413w;

    public m(int i3, a aVar) {
        super(i3);
        this.f59413w = aVar;
        if (aVar != a.f59374a) {
            if (i3 >= 1) {
                return;
            }
            throw new IllegalArgumentException(p1.j(i3, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
    }

    public final java.lang.Object C(java.lang.Object r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: yd.m.C(java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final Object a(fd.c cVar, Object obj) {
        if (!(C(obj, true) instanceof h)) {
            return dd.k.f8801a;
        }
        throw o();
    }

    @Override
    public final Object b(Object obj) {
        return C(obj, false);
    }

    @Override
    public final boolean s() {
        if (this.f59413w == a.f59375b) {
            return true;
        }
        return false;
    }
}
