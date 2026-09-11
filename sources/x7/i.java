package x7;

import java.util.Map;
public final class i extends d {
    public final Object f49023b;
    public int f49024c;
    public final j d;

    public i(j jVar, int i10) {
        super(0, false);
        this.d = jVar;
        Object[] objArr = jVar.f49046c;
        objArr.getClass();
        this.f49023b = objArr[i10];
        this.f49024c = i10;
    }

    public final void a() {
        int i10 = this.f49024c;
        Object obj = this.f49023b;
        j jVar = this.d;
        if (i10 != -1 && i10 < jVar.size()) {
            int i11 = this.f49024c;
            Object[] objArr = jVar.f49046c;
            objArr.getClass();
            if (w7.l8.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = j.f49043s;
        this.f49024c = jVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f49023b;
    }

    @Override
    public final Object getValue() {
        j jVar = this.d;
        Map a2 = jVar.a();
        if (a2 != null) {
            return a2.get(this.f49023b);
        }
        a();
        int i10 = this.f49024c;
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
        Object obj2 = this.f49023b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f49024c;
        if (i10 == -1) {
            jVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = jVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f49024c;
        Object[] objArr2 = jVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
