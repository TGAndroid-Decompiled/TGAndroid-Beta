package z7;

import java.util.Map;
public final class c extends x7.d {
    public final Object f54679b;
    public int f54680c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f54697c;
        objArr.getClass();
        this.f54679b = objArr[i10];
        this.f54680c = i10;
    }

    public final void a() {
        int i10 = this.f54680c;
        Object obj = this.f54679b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f54680c;
            Object[] objArr = dVar.f54697c;
            objArr.getClass();
            if (w7.s9.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f54694s;
        this.f54680c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f54679b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f54679b);
        }
        a();
        int i10 = this.f54680c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map a2 = dVar.a();
        Object obj2 = this.f54679b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f54680c;
        if (i10 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }
}
