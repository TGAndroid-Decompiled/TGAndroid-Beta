package r5;

import ai.l8;
import ai.m0;
import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import c5.h;
import c5.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.i;
import m.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.i51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vo0;
import r0.l1;
import r0.n;
import rg.k;
import rg.w1;
import s5.g;
import t0.f;
import t0.j;
import tg.d0;
import tg.u0;
import x2.m;
import xh.j0;
import xh.q1;
import yh.b4;
import yh.e0;
import yh.n3;
import yh.u5;
import yh.u7;
import yh.x7;
import za.a0;
import za.b0;
public final class e implements t5.b, f, pa.a, a2, al0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, b5, le.d, Utilities.Callback5, vo0, i5.e {
    public final int f42047a;
    public final Object f42048b;

    public e(Object obj, int i10) {
        this.f42047a = i10;
        this.f42048b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        View view = ((b4) this.f42048b).f46945b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f42048b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f47035r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        ((j0) this.f42048b).h.i(l1Var);
        return l1.f41850b;
    }

    @Override
    public void a(int i10) {
        switch (this.f42047a) {
            case 23:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42048b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 24:
                m0 m0Var = (m0) this.f42048b;
                if (i10 == 1) {
                    m0Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    m0Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                d80 d80Var = (d80) this.f42048b;
                if (i10 == 1) {
                    d80Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    d80Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        ((ia) this.f42048b).getClass();
        String e = b0.f48741b.e((a0) obj);
        i.d(e, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(e));
        byte[] bytes = e.getBytes(xd.a.f45738a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f42048b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f3088a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        tg.a1.Q((tg.a1) this.f42048b, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(long j3) {
        switch (this.f42047a) {
            case 13:
                ((xh.d) this.f42048b).a(j3, true);
                return;
            default:
                ((n3) this.f42048b).h();
                return;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42047a) {
            case 4:
                ((u0) this.f42048b).run();
                return;
            case 5:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f42048b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    d0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 6:
                ((t2) this.f42048b).run();
                return;
            case 7:
                ((u0) this.f42048b).run();
                return;
            case 14:
                ((l8) this.f42048b).run();
                return;
            default:
                ((Utilities.Callback) this.f42048b).run(b2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public boolean h(j jVar, int i10, Bundle bundle) {
        r0.d dVar;
        s sVar = (s) this.f42048b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f42997a.d();
                Parcelable parcelable = (Parcelable) jVar.f42997a.l();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.i iVar = jVar.f42997a;
        ClipData clipData = new ClipData(iVar.getDescription(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f41821b = clipData;
            eVar.f41822c = 2;
            dVar = eVar;
        }
        dVar.b(iVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.i(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public Object i() {
        switch (this.f42047a) {
            case 0:
                g gVar = (g) ((s5.c) ((da.b) this.f42048b).f7583i);
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar.f42851b.q()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } catch (Throwable th2) {
                    a2.endTransaction();
                    throw th2;
                }
            default:
                t tVar = (t) this.f42048b;
                for (l5.i iVar : (Iterable) ((g) ((s5.d) tVar.f7350c)).c(new r9.i(26))) {
                    ((lf.i) tVar.d).V(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void j(pa.b bVar) {
        t9.a aVar = (t9.a) this.f42048b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f43046b.set((t9.a) bVar.get());
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        int i10;
        q1 q1Var = (q1) this.f42048b;
        ArrayList arrayList = q1Var.f46084n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            o oVar = (o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k kVar = (k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f3914c)) {
                        kVar.h = oVar;
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((k) obj2).f42336g = j3;
        }
        AndroidUtilities.runOnUIThread(new w1(q1Var, 14));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.f42048b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f43793r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42047a) {
            case 22:
                u5.b((u5) this.f42048b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                u7 u7Var = (u7) this.f42048b;
                i51 i51Var = (i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                u7Var.getClass();
                if (i51Var.G instanceof TL_stars.StarsTransaction) {
                    x7.h1(u7Var.getContext(), false, 0L, u7Var.f47827c, (TL_stars.StarsTransaction) i51Var.G, u7Var.f47826b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f42048b).countDown();
        return null;
    }

    @Override
    public void C(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
