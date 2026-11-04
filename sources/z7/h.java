package z7;

import b8.bh;
import java.util.Map;
public final class h extends bh {
    public final Object f59888b;
    public int f59889c;
    public final i d;

    public h(i iVar, int i3) {
        super(1, false);
        this.d = iVar;
        Object[] objArr = iVar.f59907c;
        objArr.getClass();
        this.f59888b = objArr[i3];
        this.f59889c = i3;
    }

    public final void a() {
        int i3 = this.f59889c;
        Object obj = this.f59888b;
        i iVar = this.d;
        if (i3 != -1 && i3 < iVar.size()) {
            int i10 = this.f59889c;
            Object[] objArr = iVar.f59907c;
            objArr.getClass();
            if (x7.w6.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = i.f59904s;
        this.f59889c = iVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f59888b;
    }

    @Override
    public final Object getValue() {
        i iVar = this.d;
        Map b10 = iVar.b();
        if (b10 != null) {
            return b10.get(this.f59888b);
        }
        a();
        int i3 = this.f59889c;
        if (i3 == -1) {
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        return objArr[i3];
    }

    @Override
    public final Object setValue(Object obj) {
        i iVar = this.d;
        Map b10 = iVar.b();
        Object obj2 = this.f59888b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i3 = this.f59889c;
        if (i3 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        Object obj3 = objArr[i3];
        int i10 = this.f59889c;
        Object[] objArr2 = iVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
