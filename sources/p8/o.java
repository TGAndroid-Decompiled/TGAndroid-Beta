package p8;

import java.util.Map;

public final class o extends j {

    public final Object f45563a;

    public int f45564b;

    public final p f45565c;

    public o(p pVar, int i10) {
        this.f45565c = pVar;
        Object obj = p.f45567s;
        this.f45563a = pVar.i()[i10];
        this.f45564b = i10;
    }

    public final void a() {
        int i10 = this.f45564b;
        Object obj = this.f45563a;
        p pVar = this.f45565c;
        if (i10 != -1 && i10 < pVar.size()) {
            if (h7.e0.a(obj, pVar.i()[this.f45564b])) {
                return;
            }
        }
        Object obj2 = p.f45567s;
        this.f45564b = pVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f45563a;
    }

    @Override
    public final Object getValue() {
        p pVar = this.f45565c;
        Map mapB = pVar.b();
        if (mapB != null) {
            return mapB.get(this.f45563a);
        }
        a();
        int i10 = this.f45564b;
        if (i10 == -1) {
            return null;
        }
        return pVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        p pVar = this.f45565c;
        Map mapB = pVar.b();
        Object obj2 = this.f45563a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i10 = this.f45564b;
        if (i10 == -1) {
            pVar.put(obj2, obj);
            return null;
        }
        Object obj3 = pVar.j()[i10];
        pVar.j()[this.f45564b] = obj;
        return obj3;
    }
}
