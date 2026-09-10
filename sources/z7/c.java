package z7;

import java.util.Map;
public final class c extends x7.d {
    public final Object f47305b;
    public int f47306c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f47324c;
        objArr.getClass();
        this.f47305b = objArr[i10];
        this.f47306c = i10;
    }

    public final void a() {
        int i10 = this.f47306c;
        Object obj = this.f47305b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f47306c;
            Object[] objArr = dVar.f47324c;
            objArr.getClass();
            if (w7.i9.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f47321s;
        this.f47306c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f47305b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f47305b);
        }
        a();
        int i10 = this.f47306c;
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
        Object obj2 = this.f47305b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f47306c;
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
