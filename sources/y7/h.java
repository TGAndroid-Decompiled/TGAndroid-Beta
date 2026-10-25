package y7;

import a8.eh;
import java.util.Map;
public final class h extends eh {
    public final Object f52161b;
    public int f52162c;
    public final i d;

    public h(i iVar, int i10) {
        super(1, false);
        this.d = iVar;
        Object[] objArr = iVar.f52171c;
        objArr.getClass();
        this.f52161b = objArr[i10];
        this.f52162c = i10;
    }

    public final void a() {
        int i10 = this.f52162c;
        Object obj = this.f52161b;
        i iVar = this.d;
        if (i10 != -1 && i10 < iVar.size()) {
            int i11 = this.f52162c;
            Object[] objArr = iVar.f52171c;
            objArr.getClass();
            if (w7.g5.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = i.f52168s;
        this.f52162c = iVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f52161b;
    }

    @Override
    public final Object getValue() {
        i iVar = this.d;
        Map a2 = iVar.a();
        if (a2 != null) {
            return a2.get(this.f52161b);
        }
        a();
        int i10 = this.f52162c;
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
        Object obj2 = this.f52161b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f52162c;
        if (i10 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f52162c;
        Object[] objArr2 = iVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
