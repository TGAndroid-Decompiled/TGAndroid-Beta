package s4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f54688a = new ArrayList();
    public final ArrayList f54689b = new ArrayList();
    public final e f54690c;

    public b(e eVar) {
        this.f54690c = eVar;
    }

    public static void a(t tVar, int i7, Object obj, int i10) {
        v vVar;
        v vVar2;
        boolean z9;
        x xVar = tVar.f54800a;
        s sVar = tVar.f54801b;
        int i11 = 65280 & i7;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i7 == 769) {
                    sVar.l((z) obj);
                    return;
                }
                return;
            }
            u uVar = (u) obj;
            switch (i7) {
                case 513:
                    sVar.a();
                    return;
                case 514:
                    sVar.c();
                    return;
                case 515:
                    sVar.b();
                    return;
                default:
                    return;
            }
        }
        if (i7 != 264 && i7 != 262) {
            vVar = (v) obj;
        } else {
            vVar = (v) ((q0.b) obj).f53585b;
        }
        if (i7 != 264 && i7 != 262) {
            vVar2 = null;
        } else {
            vVar2 = (v) ((q0.b) obj).f53584a;
        }
        if (vVar != null) {
            boolean z10 = true;
            if ((tVar.d & 2) == 0 && !vVar.h(tVar.f54802c)) {
                z zVar = x.c().f54713u;
                if (zVar == null) {
                    z9 = false;
                } else {
                    z9 = zVar.d;
                }
                z10 = (z9 && vVar.d() && i7 == 262 && i10 == 3 && vVar2 != null) ? true ^ vVar2.d() : false;
            }
            if (z10) {
                switch (i7) {
                    case 257:
                        sVar.d(vVar);
                        return;
                    case 258:
                        sVar.f(vVar);
                        return;
                    case 259:
                        sVar.e(vVar);
                        return;
                    case 260:
                        sVar.k(vVar);
                        return;
                    case 261:
                        sVar.getClass();
                        return;
                    case 262:
                        sVar.h(xVar, vVar, i10);
                        return;
                    case 263:
                        sVar.j(xVar, vVar, i10);
                        return;
                    case 264:
                        sVar.h(xVar, vVar, i10);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i7, Object obj) {
        obtainMessage(i7, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.f54688a;
        e eVar = this.f54690c;
        ArrayList arrayList2 = eVar.f54701i;
        j0 j0Var = eVar.f54711s;
        int i7 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        if (i7 == 259 && eVar.e().f54810c.equals(((v) obj).f54810c)) {
            eVar.o(true);
        }
        int i11 = 0;
        ArrayList arrayList3 = this.f54689b;
        if (i7 != 262) {
            if (i7 != 264) {
                switch (i7) {
                    case 257:
                        j0Var.v((v) obj);
                        break;
                    case 258:
                        j0Var.w((v) obj);
                        break;
                    case 259:
                        v vVar = (v) obj;
                        j0Var.getClass();
                        if (vVar.c() != j0Var && (q10 = j0Var.q(vVar)) >= 0) {
                            j0Var.C((i0) j0Var.H.get(q10));
                            break;
                        }
                        break;
                }
            } else {
                v vVar2 = (v) ((q0.b) obj).f53585b;
                arrayList3.add(vVar2);
                j0Var.v(vVar2);
                j0Var.x(vVar2);
            }
        } else {
            v vVar3 = (v) ((q0.b) obj).f53585b;
            j0Var.x(vVar3);
            if (eVar.v != null && vVar3.d()) {
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    j0Var.w((v) obj2);
                }
                arrayList3.clear();
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    x xVar = (x) ((WeakReference) arrayList2.get(size2)).get();
                    if (xVar == null) {
                        arrayList2.remove(size2);
                    } else {
                        arrayList.addAll(xVar.f54830b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((t) obj3, i7, obj, i10);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
