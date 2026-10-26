package y7;

import a8.eh;
import java.util.Map;
public final class h extends eh {
    public final Object f52164b;
    public int f52165c;
    public final i d;

    public h(i iVar, int i10) {
        super(1, false);
        this.d = iVar;
        Object[] objArr = iVar.f52174c;
        objArr.getClass();
        this.f52164b = objArr[i10];
        this.f52165c = i10;
    }

    public final void a() {
        int i10 = this.f52165c;
        Object obj = this.f52164b;
        i iVar = this.d;
        if (i10 != -1 && i10 < iVar.size()) {
            int i11 = this.f52165c;
            Object[] objArr = iVar.f52174c;
            objArr.getClass();
            if (w7.g5.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = i.f52171s;
        this.f52165c = iVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f52164b;
    }

    @Override
    public final Object getValue() {
        i iVar = this.d;
        Map a2 = iVar.a();
        if (a2 != null) {
            return a2.get(this.f52164b);
        }
        a();
        int i10 = this.f52165c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        i iVar = this.d;
        Map a2 = iVar.a();
        Object obj2 = this.f52164b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f52165c;
        if (i10 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f52165c;
        Object[] objArr2 = iVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
