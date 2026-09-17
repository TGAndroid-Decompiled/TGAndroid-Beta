package r5;

import ai.l8;
import ai.m0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.j51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xo0;
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
import yh.c4;
import yh.e0;
import yh.o3;
import yh.v5;
import yh.v7;
import yh.y7;
import za.a0;
import za.b0;
public final class d implements t5.b, f, pa.a, b2, bl0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, b5, le.d, Utilities.Callback5, xo0, i5.e {
    public final int f42070a;
    public final Object f42071b;

    public d(Object obj, int i10) {
        this.f42070a = i10;
        this.f42071b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        View view = ((c4) this.f42071b).f47060b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f42071b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f47118r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        ((j0) this.f42071b).h.i(l1Var);
        return l1.f41876b;
    }

    @Override
    public void a(int i10) {
        switch (this.f42070a) {
            case 24:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42071b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 25:
                m0 m0Var = (m0) this.f42071b;
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
                d80 d80Var = (d80) this.f42071b;
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
        ((ia) this.f42071b).getClass();
        String e = b0.f48771b.e((a0) obj);
        i.d(e, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(e));
        byte[] bytes = e.getBytes(xd.a.f45765a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f42071b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f3091a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        tg.a1.Q((tg.a1) this.f42071b, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(long j3) {
        switch (this.f42070a) {
            case 14:
                ((xh.d) this.f42071b).a(j3, true);
                return;
            default:
                ((o3) this.f42071b).h();
                return;
        }
    }

    @Override
    public void f(c2 c2Var, int i10) {
        switch (this.f42070a) {
            case 5:
                ((u0) this.f42071b).run();
                return;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f42071b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    d0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 7:
                ((t2) this.f42071b).run();
                return;
            case 8:
                ((u0) this.f42071b).run();
                return;
            case 15:
                ((l8) this.f42071b).run();
                return;
            default:
                ((Utilities.Callback) this.f42071b).run(c2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public boolean h(j jVar, int i10, Bundle bundle) {
        r0.d dVar;
        s sVar = (s) this.f42071b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f43023a.d();
                Parcelable parcelable = (Parcelable) jVar.f43023a.l();
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
        t0.i iVar = jVar.f43023a;
        ClipData clipData = new ClipData(iVar.getDescription(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f41847b = clipData;
            eVar.f41848c = 2;
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
        SQLiteDatabase a2;
        switch (this.f42070a) {
            case 0:
                g gVar = (g) ((s5.d) this.f42071b);
                long q6 = gVar.f42877b.q() - gVar.d.d;
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i10 = rawQuery.getInt(0);
                        gVar.e(i10, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 1:
                g gVar2 = (g) ((s5.c) ((da.b) this.f42071b).f7586i);
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar2.f42877b.q()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } finally {
                }
            default:
                t tVar = (t) this.f42071b;
                for (l5.i iVar : (Iterable) ((g) ((s5.d) tVar.f7353c)).c(new r9.i(27))) {
                    ((lf.i) tVar.d).V(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void j(pa.b bVar) {
        t9.a aVar = (t9.a) this.f42071b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f43072b.set((t9.a) bVar.get());
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        int i10;
        q1 q1Var = (q1) this.f42071b;
        ArrayList arrayList = q1Var.f46111n0;
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
                    if (kVar.h() != null && kVar.h().equals(oVar.f3917c)) {
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
            ((k) obj2).f42362g = j3;
        }
        AndroidUtilities.runOnUIThread(new w1(q1Var, 14));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.f42071b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f43820r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42070a) {
            case 23:
                v5.b((v5) this.f42071b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                v7 v7Var = (v7) this.f42071b;
                j51 j51Var = (j51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                v7Var.getClass();
                if (j51Var.G instanceof TL_stars.StarsTransaction) {
                    y7.h1(v7Var.getContext(), false, 0L, v7Var.f47944c, (TL_stars.StarsTransaction) j51Var.G, v7Var.f47943b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f42071b).countDown();
        return null;
    }

    @Override
    public void C(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
