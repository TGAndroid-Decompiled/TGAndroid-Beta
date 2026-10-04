package r2;

import ai.m0;
import ai.m8;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.v50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ro0;
import r0.l1;
import rg.s1;
import tg.c0;
import tg.t0;
import tg.z0;
import xh.j0;
import xh.q1;
import yh.e0;
import yh.l3;
import yh.t5;
import yh.u7;
import yh.x7;
import yh.z3;
public final class s implements w, t5.b, t0.e, pa.a, a2, nl0, uh.a, Continuation, x2.m, yf.m, r0.n, BillingController.ProductDetailsResponseListenerLegacy, d5, le.d, Utilities.Callback5, ro0 {
    public final int f45772a;
    public final Object f45773b;

    public s(Object obj, int i10) {
        this.f45772a = i10;
        this.f45773b = obj;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f45773b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f51214r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        ((j0) this.f45773b).h.i(l1Var);
        return l1.f45609b;
    }

    @Override
    public void a(int i10) {
        switch (this.f45772a) {
            case 26:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f45773b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 27:
                m0 m0Var = (m0) this.f45773b;
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
                r80 r80Var = (r80) this.f45773b;
                if (i10 == 1) {
                    r80Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    r80Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        View view = ((z3) this.f45773b).f52310b;
        if (view instanceof w0) {
            ((w0) view).I();
        } else {
            view.invalidate();
        }
    }

    @Override
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f45773b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f3336a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z0.O((z0) this.f45773b, view);
    }

    @Override
    public int d(Object obj) {
        b2.s sVar = (b2.s) this.f45773b;
        o oVar = (o) obj;
        String str = oVar.f45731b;
        if ((!str.equals(sVar.f3564r) && !str.equals(x.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void e(long j3) {
        switch (this.f45772a) {
            case 16:
                ((xh.d) this.f45773b).a(j3, true);
                return;
            default:
                ((l3) this.f45773b).h();
                return;
        }
    }

    @Override
    public void f(pa.b bVar) {
        t9.a aVar = (t9.a) this.f45773b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f46936b.set((t9.a) bVar.get());
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f45772a) {
            case 7:
                ((t0) this.f45773b).run();
                return;
            case 8:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f45773b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    c0.R(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 9:
                ((t2) this.f45773b).run();
                return;
            case 10:
                ((t0) this.f45773b).run();
                return;
            case 17:
                ((m8) this.f45773b).run();
                return;
            default:
                ((Utilities.Callback) this.f45773b).run(b2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public Object h() {
        SQLiteDatabase a2;
        int i10 = this.f45772a;
        Object obj = this.f45773b;
        switch (i10) {
            case 1:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.f17116e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
                sVar.f7922c = null;
                sVar.d = new ArrayList();
                sVar.f7923e = null;
                sVar.f7921b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new v50(gVar, hashMap, sVar, 9));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 2:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long q6 = gVar2.f46725b.q() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 3:
                s5.g gVar3 = (s5.g) ((s5.c) ((da.b) obj).f8185i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f46725b.q()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar2.f7922c)).c(new s0.b(18))) {
                    ((la.h) sVar2.d).V(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public boolean l(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f45773b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f46881a.d();
                Parcelable parcelable = (Parcelable) iVar.f46881a.l();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        t0.h hVar = iVar.f46881a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f45576b = clipData;
            eVar.f45577c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.i(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        q1 q1Var = (q1) this.f45773b;
        ArrayList arrayList = q1Var.f50192n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    rg.k kVar = (rg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f4228c)) {
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
            ((rg.k) obj2).f46143g = j3;
        }
        AndroidUtilities.runOnUIThread(new s1(q1Var, 15));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.f45773b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f47734r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f45772a) {
            case 25:
                t5.b((t5) this.f45773b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                u7 u7Var = (u7) this.f45773b;
                g61 g61Var = (g61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                u7Var.getClass();
                if (g61Var.G instanceof TL_stars.StarsTransaction) {
                    x7.n1(u7Var.getContext(), false, 0L, u7Var.f52105c, (TL_stars.StarsTransaction) g61Var.G, u7Var.f52104b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f45773b).countDown();
        return null;
    }

    @Override
    public void V(float f7, int i10) {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
