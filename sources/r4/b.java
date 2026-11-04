package r4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f54249a = new ArrayList();
    public final ArrayList f54250b = new ArrayList();
    public final e f54251c;

    public b(e eVar) {
        this.f54251c = eVar;
    }

    public static void a(t tVar, int i3, Object obj, int i10) {
        w wVar;
        w wVar2;
        boolean z10;
        y yVar = tVar.f54360a;
        s sVar = tVar.f54361b;
        int i11 = 65280 & i3;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i3 == 769) {
                    sVar.l((a0) obj);
                    return;
                }
                return;
            }
            v vVar = (v) obj;
            switch (i3) {
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
        if (i3 != 264 && i3 != 262) {
            wVar = (w) obj;
        } else {
            wVar = (w) ((q0.b) obj).f53628b;
        }
        if (i3 != 264 && i3 != 262) {
            wVar2 = null;
        } else {
            wVar2 = (w) ((q0.b) obj).f53627a;
        }
        if (wVar != null) {
            boolean z11 = true;
            if ((tVar.d & 2) == 0 && !wVar.h(tVar.f54362c)) {
                a0 a0Var = y.c().f54275u;
                if (a0Var == null) {
                    z10 = false;
                } else {
                    z10 = a0Var.d;
                }
                z11 = (z10 && wVar.d() && i3 == 262 && i10 == 3 && wVar2 != null) ? true ^ wVar2.d() : false;
            }
            if (z11) {
                switch (i3) {
                    case 257:
                        sVar.d(wVar);
                        return;
                    case 258:
                        sVar.f(wVar);
                        return;
                    case 259:
                        sVar.e(wVar);
                        return;
                    case 260:
                        sVar.k(wVar);
                        return;
                    case 261:
                        sVar.getClass();
                        return;
                    case 262:
                        sVar.h(yVar, wVar, i10);
                        return;
                    case 263:
                        sVar.j(yVar, wVar, i10);
                        return;
                    case 264:
                        sVar.h(yVar, wVar, i10);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i3, Object obj) {
        obtainMessage(i3, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.f54249a;
        e eVar = this.f54251c;
        ArrayList arrayList2 = eVar.f54263i;
        k0 k0Var = eVar.f54273s;
        int i3 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        if (i3 == 259 && eVar.e().f54374c.equals(((w) obj).f54374c)) {
            eVar.o(true);
        }
        int i11 = 0;
        ArrayList arrayList3 = this.f54250b;
        if (i3 != 262) {
            if (i3 != 264) {
                switch (i3) {
                    case 257:
                        k0Var.v((w) obj);
                        break;
                    case 258:
                        k0Var.w((w) obj);
                        break;
                    case 259:
                        w wVar = (w) obj;
                        k0Var.getClass();
                        if (wVar.c() != k0Var && (q10 = k0Var.q(wVar)) >= 0) {
                            k0Var.C((j0) k0Var.I.get(q10));
                            break;
                        }
                        break;
                }
            } else {
                w wVar2 = (w) ((q0.b) obj).f53628b;
                arrayList3.add(wVar2);
                k0Var.v(wVar2);
                k0Var.x(wVar2);
            }
        } else {
            w wVar3 = (w) ((q0.b) obj).f53628b;
            k0Var.x(wVar3);
            if (eVar.v != null && wVar3.d()) {
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
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
                        arrayList.addAll(yVar.f54394b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((t) obj3, i3, obj, i10);
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
