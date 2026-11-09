package p7;

import c8.hb;
public final class c extends e {
    public final transient e f53498c;

    public c(e eVar) {
        this.f53498c = eVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f53498c.contains(obj);
    }

    @Override
    public final Object get(int i7) {
        e eVar = this.f53498c;
        hb.a(i7, eVar.size());
        return eVar.get((eVar.size() - 1) - i7);
    }

    @Override
    public final int indexOf(Object obj) {
        e eVar = this.f53498c;
        int lastIndexOf = eVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (eVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final e l() {
        return this.f53498c;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        e eVar = this.f53498c;
        int indexOf = eVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (eVar.size() - 1) - indexOf;
    }

    @Override
    public final e subList(int i7, int i10) {
        e eVar = this.f53498c;
        hb.b(i7, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i7).l();
    }

    @Override
    public final int size() {
        return this.f53498c.size();
    }
}
