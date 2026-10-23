package z7;

import java.util.Map;
public final class c extends x7.d {
    public final Object f50754b;
    public int f50755c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f50770c;
        objArr.getClass();
        this.f50754b = objArr[i10];
        this.f50755c = i10;
    }

    public final void a() {
        int i10 = this.f50755c;
        Object obj = this.f50754b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f50755c;
            Object[] objArr = dVar.f50770c;
            objArr.getClass();
            if (w7.g9.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f50767s;
        this.f50755c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f50754b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f50754b);
        }
        a();
        int i10 = this.f50755c;
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
        Object obj2 = this.f50754b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f50755c;
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
