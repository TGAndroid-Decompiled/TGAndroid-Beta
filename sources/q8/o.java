package q8;

import i7.o6;
import java.util.Map;
public final class o extends j {
    public final Object f46470a;
    public int f46471b;
    public final p f46472c;

    public o(p pVar, int i10) {
        this.f46472c = pVar;
        Object obj = p.f46474s;
        this.f46470a = pVar.i()[i10];
        this.f46471b = i10;
    }

    public final void a() {
        int i10 = this.f46471b;
        Object obj = this.f46470a;
        p pVar = this.f46472c;
        if (i10 != -1 && i10 < pVar.size()) {
            if (o6.a(obj, pVar.i()[this.f46471b])) {
                return;
            }
        }
        Object obj2 = p.f46474s;
        this.f46471b = pVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f46470a;
    }

    @Override
    public final Object getValue() {
        p pVar = this.f46472c;
        Map b10 = pVar.b();
        if (b10 != null) {
            return b10.get(this.f46470a);
        }
        a();
        int i10 = this.f46471b;
        if (i10 == -1) {
            return null;
        }
        return pVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        p pVar = this.f46472c;
        Map b10 = pVar.b();
        Object obj2 = this.f46470a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f46471b;
        if (i10 == -1) {
            pVar.put(obj2, obj);
            return null;
        }
        Object obj3 = pVar.j()[i10];
        pVar.j()[this.f46471b] = obj;
        return obj3;
    }
}
