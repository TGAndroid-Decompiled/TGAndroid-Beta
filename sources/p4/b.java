package p4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f45211a = new ArrayList();
    public final ArrayList f45212b = new ArrayList();
    public final e f45213c;

    public b(e eVar) {
        this.f45213c = eVar;
    }

    public static void a(u uVar, int i10, Object obj, int i11) {
        w wVar;
        w wVar2;
        boolean z10;
        y yVar = uVar.f45325a;
        t tVar = uVar.f45326b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    tVar.l((a0) obj);
                    return;
                }
                return;
            }
            v vVar = (v) obj;
            switch (i10) {
                case 513:
                    tVar.a();
                    return;
                case 514:
                    tVar.c();
                    return;
                case 515:
                    tVar.b();
                    return;
                default:
                    return;
            }
        }
        if (i10 != 264 && i10 != 262) {
            wVar = (w) obj;
        } else {
            wVar = (w) ((q0.b) obj).f45844b;
        }
        if (i10 != 264 && i10 != 262) {
            wVar2 = null;
        } else {
            wVar2 = (w) ((q0.b) obj).f45843a;
        }
        if (wVar != null) {
            boolean z11 = true;
            if ((uVar.d & 2) == 0 && !wVar.h(uVar.f45327c)) {
                a0 a0Var = y.c().f45237u;
                if (a0Var == null) {
                    z10 = false;
                } else {
                    z10 = a0Var.d;
                }
                z11 = (z10 && wVar.d() && i10 == 262 && i11 == 3 && wVar2 != null) ? true ^ wVar2.d() : false;
            }
            if (z11) {
                switch (i10) {
                    case 257:
                        tVar.d(wVar);
                        return;
                    case 258:
                        tVar.f(wVar);
                        return;
                    case 259:
                        tVar.e(wVar);
                        return;
                    case 260:
                        tVar.k(wVar);
                        return;
                    case 261:
                        tVar.getClass();
                        return;
                    case 262:
                        tVar.h(yVar, wVar, i11);
                        return;
                    case 263:
                        tVar.j(yVar, wVar, i11);
                        return;
                    case 264:
                        tVar.h(yVar, wVar, i11);
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
        ArrayList arrayList = this.f45211a;
        e eVar = this.f45213c;
        ArrayList arrayList2 = eVar.f45225i;
        k0 k0Var = eVar.f45235s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().f45343c.equals(((w) obj).f45343c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.f45212b;
        if (i10 != 262) {
            if (i10 != 264) {
                switch (i10) {
                    case 257:
                        k0Var.v((w) obj);
                        break;
                    case 258:
                        k0Var.w((w) obj);
                        break;
                    case 259:
                        w wVar = (w) obj;
                        k0Var.getClass();
                        if (wVar.c() != k0Var && (q6 = k0Var.q(wVar)) >= 0) {
                            k0Var.C((j0) k0Var.H.get(q6));
                            break;
                        }
                        break;
                }
            } else {
                w wVar2 = (w) ((q0.b) obj).f45844b;
                arrayList3.add(wVar2);
                k0Var.v(wVar2);
                k0Var.x(wVar2);
            }
        } else {
            w wVar3 = (w) ((q0.b) obj).f45844b;
            k0Var.x(wVar3);
            if (eVar.v != null && wVar3.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    k0Var.w((w) obj2);
                }
                arrayList3.clear();
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    y yVar = (y) ((WeakReference) arrayList2.get(size2)).get();
                    if (yVar == null) {
                        arrayList2.remove(size2);
                    } else {
                        arrayList.addAll(yVar.f45363b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((u) obj3, i10, obj, i11);
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
