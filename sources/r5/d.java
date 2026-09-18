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
import b2.l1;
import c5.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import e9.a1;
import e9.f0;
import e9.i0;
import j2.j;
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
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wo0;
import r0.m1;
import r0.n;
import r0.s0;
import rg.k;
import rg.w1;
import s5.h;
import tg.c0;
import tg.t0;
import tg.z0;
import x2.f;
import x2.m;
import xh.j0;
import xh.r1;
import yh.a4;
import yh.e0;
import yh.m3;
import yh.s7;
import yh.t5;
import yh.v7;
import za.a0;
import za.b0;
public final class d implements t5.b, t0.e, pa.a, a2, ll0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, d5, le.d, Utilities.Callback5, wo0, i5.e {
    public final int f42303a;
    public final Object f42304b;

    public d(Object obj, int i10) {
        this.f42303a = i10;
        this.f42304b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        View view = ((a4) this.f42304b).f47184b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f42304b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f47314r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public m1 Q0(View view, m1 m1Var) {
        ((j0) this.f42304b).h.i(m1Var);
        return m1.f42108b;
    }

    @Override
    public void a(int i10) {
        switch (this.f42303a) {
            case 24:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42304b;
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
                m0 m0Var = (m0) this.f42304b;
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
                m80 m80Var = (m80) this.f42304b;
                if (i10 == 1) {
                    m80Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    m80Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        ((w3.b) this.f42304b).getClass();
        String J = b0.f49002b.J((a0) obj);
        i.d(J, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(J));
        byte[] bytes = J.getBytes(xd.a.f45993a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f42304b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f3091a; i11++) {
            u10.b(new f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z0.Q((z0) this.f42304b, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(long j3) {
        switch (this.f42303a) {
            case 14:
                ((xh.d) this.f42304b).a(j3, true);
                return;
            default:
                ((m3) this.f42304b).h();
                return;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42303a) {
            case 5:
                ((t0) this.f42304b).run();
                return;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f42304b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    c0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 7:
                ((t2) this.f42304b).run();
                return;
            case 8:
                ((t0) this.f42304b).run();
                return;
            case 15:
                ((l8) this.f42304b).run();
                return;
            default:
                ((Utilities.Callback) this.f42304b).run(b2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        t9.a aVar = (t9.a) this.f42304b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f43307b.set((t9.a) bVar.get());
    }

    @Override
    public Object h() {
        SQLiteDatabase a2;
        switch (this.f42303a) {
            case 0:
                h hVar = (h) ((s5.d) this.f42304b);
                long q6 = hVar.f43112b.q() - hVar.d.d;
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i10 = rawQuery.getInt(0);
                        hVar.e(i10, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 1:
                h hVar2 = (h) ((s5.c) ((da.b) this.f42304b).f7585i);
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar2.f43112b.q()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } finally {
                }
            default:
                t tVar = (t) this.f42304b;
                for (l5.i iVar : (Iterable) ((h) ((s5.d) tVar.f7346c)).c(new s0(29))) {
                    ((lf.i) tVar.d).V(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        s sVar = (s) this.f42304b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f43258a.d();
                Parcelable parcelable = (Parcelable) iVar.f43258a.l();
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
        t0.h hVar = iVar.f43258a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f42078b = clipData;
            eVar.f42079c = 2;
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
    public void o(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.f42304b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f44055r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        r1 r1Var = (r1) this.f42304b;
        ArrayList arrayList = r1Var.f46352n0;
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
            ((k) obj2).f42594g = j3;
        }
        AndroidUtilities.runOnUIThread(new w1(r1Var, 14));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42303a) {
            case 23:
                t5.b((t5) this.f42304b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                s7 s7Var = (s7) this.f42304b;
                x51 x51Var = (x51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                s7Var.getClass();
                if (x51Var.G instanceof TL_stars.StarsTransaction) {
                    v7.h1(s7Var.getContext(), false, 0L, s7Var.f48020c, (TL_stars.StarsTransaction) x51Var.G, s7Var.f48019b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f42304b).countDown();
        return null;
    }

    @Override
    public void C(float f7, int i10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
