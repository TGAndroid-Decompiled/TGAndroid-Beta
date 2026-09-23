package x7;

import java.util.Map;
public final class i extends d {
    public final Object f45401b;
    public int f45402c;
    public final j d;

    public i(j jVar, int i10) {
        super(0, false);
        this.d = jVar;
        Object[] objArr = jVar.f45422c;
        objArr.getClass();
        this.f45401b = objArr[i10];
        this.f45402c = i10;
    }

    public final void a() {
        int i10 = this.f45402c;
        Object obj = this.f45401b;
        j jVar = this.d;
        if (i10 != -1 && i10 < jVar.size()) {
            int i11 = this.f45402c;
            Object[] objArr = jVar.f45422c;
            objArr.getClass();
            if (w7.l8.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = j.f45419s;
        this.f45402c = jVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f45401b;
    }

    @Override
    public final Object getValue() {
        j jVar = this.d;
        Map a2 = jVar.a();
        if (a2 != null) {
            return a2.get(this.f45401b);
        }
        a();
        int i10 = this.f45402c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = jVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        j jVar = this.d;
        Map a2 = jVar.a();
        Object obj2 = this.f45401b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f45402c;
        if (i10 == -1) {
            jVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = jVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f45402c;
        Object[] objArr2 = jVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
