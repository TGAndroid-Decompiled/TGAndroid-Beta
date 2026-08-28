package xf;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.wk0;
import yf.j2;
import yf.m2;
import yf.x1;
import zf.z1;
public final class o0 implements Runnable {
    public final int f49286a;
    public final Object f49287b;
    public final Object f49288c;

    public o0(int i9, Object obj, Object obj2) {
        this.f49286a = i9;
        this.f49287b = obj;
        this.f49288c = obj2;
    }

    private final void a() {
        y8.o oVar = (y8.o) this.f49287b;
        x9.b bVar = (x9.b) this.f49288c;
        synchronized (oVar) {
            try {
                if (oVar.f49652b == null) {
                    oVar.f49651a.add(bVar);
                } else {
                    oVar.f49652b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        x9.a aVar;
        int i9;
        switch (this.f49286a) {
            case 0:
                q0 q0Var = (q0) this.f49287b;
                q0Var.v = true;
                RectF f10 = q0Var.f();
                Object obj = q0Var.f49310a.f17378b;
                q0Var.f49329w = new a6.a((ByteBuffer) q0Var.h(q0Var.f(), true, false, false).f48762c, 0, f10);
                q0Var.a(false);
                ((x0) this.f49288c).run();
                return;
            case 1:
                Runnable runnable = (Runnable) this.f49288c;
                a1 a1Var = ((c1) this.f49287b).d;
                if (a1Var != null && a1Var.f49163f) {
                    a1.b(a1Var);
                    runnable.run();
                    return;
                }
                return;
            case 2:
                y8.p pVar = (y8.p) this.f49287b;
                x9.b bVar = (x9.b) this.f49288c;
                if (pVar.f49655b == y8.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f49654a;
                        pVar.f49654a = null;
                        pVar.f49655b = bVar;
                    }
                    aVar.e(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 3:
                a();
                return;
            case 4:
                x1 x1Var = (x1) this.f49288c;
                x1Var.m();
                ((yf.l0) this.f49287b).r0(x1Var, true);
                return;
            case 5:
                ((x1) this.f49287b).s((Bitmap) this.f49288c);
                return;
            case 6:
                m2 m2Var = (m2) this.f49287b;
                m2Var.C = false;
                j2[] j2VarArr = (j2[]) ((ArrayList) this.f49288c).toArray(new j2[0]);
                m2Var.D = j2VarArr;
                if (j2VarArr.length > 0) {
                    m2Var.U.setScaleX(0.3f);
                    m2Var.U.setScaleY(0.3f);
                    m2Var.U.setAlpha(0.0f);
                    m2Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(gr.f28844f).start();
                    return;
                }
                return;
            case 7:
                z8.a aVar2 = (z8.a) this.f49287b;
                Runnable runnable2 = (Runnable) this.f49288c;
                Process.setThreadPriority(aVar2.f50361c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 8:
                Callable callable = (Callable) this.f49287b;
                z8.h hVar = (z8.h) ((n5.a0) this.f49288c).f18462b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 9:
                zf.j0 j0Var = (zf.j0) this.f49287b;
                TLObject tLObject = (TLObject) this.f49288c;
                ArrayList arrayList = j0Var.f50536e0;
                wk0 wk0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.E0 = false;
                    j0Var.F0.b(j0Var.f50541j0 + 4);
                    int i10 = 0;
                    while (true) {
                        if (i10 < wk0Var.getChildCount()) {
                            if (wk0Var.getChildAt(i10) instanceof zf.i0) {
                                i9 = wk0Var.getChildAt(i10).getTop();
                            } else {
                                i10++;
                            }
                        } else {
                            i9 = 0;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.f50539h0 >= 0 && i9 != 0) {
                        ((f2.m0) wk0Var.getLayoutManager()).h1(j0Var.f50539h0 + 1, i9);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.I0.f870b);
                j0Var.f50550t0.g(max, false);
                j0Var.f50550t0.setBagePosition(max / j0Var.I0.f871c);
                zf.h0 h0Var = j0Var.f50550t0;
                h0Var.D = true;
                h0Var.requestLayout();
                return;
            case 10:
                ((zf.j0) this.f49287b).m1((o80) this.f49288c, true);
                return;
            case 11:
                z1 z1Var = (z1) this.f49287b;
                AndroidUtilities.runOnUIThread(new o0(12, z1Var, FileLoader.getInstance(z1Var.f50810s).getPathToAttach((TLRPC.Document) this.f49288c)));
                return;
            default:
                z1 z1Var2 = (z1) this.f49287b;
                z1Var2.f50806e = (File) this.f49288c;
                z1Var2.a();
                return;
        }
    }
}
