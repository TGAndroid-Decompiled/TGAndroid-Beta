package x7;

import java.util.Map;
public final class i extends d {
    public final Object f50797b;
    public int f50798c;
    public final j d;

    public i(j jVar, int i10) {
        super(0, false);
        this.d = jVar;
        Object[] objArr = jVar.f50817c;
        objArr.getClass();
        this.f50797b = objArr[i10];
        this.f50798c = i10;
    }

    public final void a() {
        int i10 = this.f50798c;
        Object obj = this.f50797b;
        j jVar = this.d;
        if (i10 != -1 && i10 < jVar.size()) {
            int i11 = this.f50798c;
            Object[] objArr = jVar.f50817c;
            objArr.getClass();
            if (w7.l8.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = j.f50814s;
        this.f50798c = jVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f50797b;
    }

    @Override
    public final Object getValue() {
        j jVar = this.d;
        Map a2 = jVar.a();
        if (a2 != null) {
            return a2.get(this.f50797b);
        }
        a();
        int i10 = this.f50798c;
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
        Object obj2 = this.f50797b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f50798c;
        if (i10 == -1) {
            jVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = jVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f50798c;
        Object[] objArr2 = jVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
