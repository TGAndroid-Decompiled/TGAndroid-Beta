package p4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f39670a = new ArrayList();
    public final ArrayList f39671b = new ArrayList();
    public final e f39672c;

    public b(e eVar) {
        this.f39672c = eVar;
    }

    public static void a(t tVar, int i10, Object obj, int i11) {
        v vVar;
        v vVar2;
        boolean z10;
        x xVar = tVar.f39780a;
        s sVar = tVar.f39781b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    sVar.l((z) obj);
                    return;
                }
                return;
            }
            u uVar = (u) obj;
            switch (i10) {
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
        if (i10 != 264 && i10 != 262) {
            vVar = (v) obj;
        } else {
            vVar = (v) ((q0.b) obj).f40453b;
        }
        if (i10 != 264 && i10 != 262) {
            vVar2 = null;
        } else {
            vVar2 = (v) ((q0.b) obj).f40452a;
        }
        if (vVar != null) {
            boolean z11 = true;
            if ((tVar.d & 2) == 0 && !vVar.h(tVar.f39782c)) {
                z zVar = x.c().f39694u;
                if (zVar == null) {
                    z10 = false;
                } else {
                    z10 = zVar.d;
                }
                z11 = (z10 && vVar.d() && i10 == 262 && i11 == 3 && vVar2 != null) ? true ^ vVar2.d() : false;
            }
            if (z11) {
                switch (i10) {
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
                        sVar.h(xVar, vVar, i11);
                        return;
                    case 263:
                        sVar.j(xVar, vVar, i11);
                        return;
                    case 264:
                        sVar.h(xVar, vVar, i11);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i10, Object obj) {
        obtainMessage(i10, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int q6;
        ArrayList arrayList = this.f39670a;
        e eVar = this.f39672c;
        ArrayList arrayList2 = eVar.f39682i;
        j0 j0Var = eVar.f39692s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().f39790c.equals(((v) obj).f39790c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.f39671b;
        if (i10 != 262) {
            if (i10 != 264) {
                switch (i10) {
                    case 257:
                        j0Var.v((v) obj);
                        break;
                    case 258:
                        j0Var.w((v) obj);
                        break;
                    case 259:
                        v vVar = (v) obj;
                        j0Var.getClass();
                        if (vVar.c() != j0Var && (q6 = j0Var.q(vVar)) >= 0) {
                            j0Var.C((i0) j0Var.H.get(q6));
                            break;
                        }
                        break;
                }
            } else {
                v vVar2 = (v) ((q0.b) obj).f40453b;
                arrayList3.add(vVar2);
                j0Var.v(vVar2);
                j0Var.x(vVar2);
            }
        } else {
            v vVar3 = (v) ((q0.b) obj).f40453b;
            j0Var.x(vVar3);
            if (eVar.v != null && vVar3.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
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
                        arrayList.addAll(xVar.f39809b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((t) obj3, i10, obj, i11);
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
