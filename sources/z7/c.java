package z7;

import java.util.Map;
public final class c extends x7.d {
    public final Object f51215b;
    public int f51216c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f51233c;
        objArr.getClass();
        this.f51215b = objArr[i10];
        this.f51216c = i10;
    }

    public final void a() {
        int i10 = this.f51216c;
        Object obj = this.f51215b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f51216c;
            Object[] objArr = dVar.f51233c;
            objArr.getClass();
            if (w7.g9.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f51230s;
        this.f51216c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f51215b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f51215b);
        }
        a();
        int i10 = this.f51216c;
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
        Object obj2 = this.f51215b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f51216c;
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
