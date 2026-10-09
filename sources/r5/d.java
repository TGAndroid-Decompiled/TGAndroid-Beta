package r5;

import ai.n8;
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
import com.google.firebase.messaging.s;
import e2.h;
import e9.a1;
import e9.f0;
import e9.i0;
import j2.j;
import java.util.ArrayList;
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
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uo0;
import qh.r;
import r0.k1;
import r0.n;
import rg.k;
import rg.x1;
import tg.t0;
import tg.z0;
import x2.f;
import x2.i;
import x2.m;
import xh.l0;
import xh.r1;
import yh.c0;
import yh.h3;
import yh.m5;
import yh.m7;
import yh.p7;
import yh.u3;
import z3.g;
public final class d implements t5.b, t0.e, pa.a, a2, fm0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, f5, me.d, Utilities.Callback5, uo0, h {
    public final int f46984a;
    public final Object f46985b;

    public d(Object obj, int i10) {
        this.f46984a = i10;
        this.f46985b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        c0 c0Var = (c0) this.f46985b;
        if (z10) {
            long j3 = i10;
            if (c0Var.I != j3) {
                c0Var.I = j3;
                c0Var.f52327r.setText(c0.q(j3));
            }
            c0Var.p(true);
        }
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        ((l0) this.f46985b).h.k(k1Var);
        return k1.f46774b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f46984a) {
            case 24:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f46985b;
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
                r rVar = (r) this.f46985b;
                if (i10 == 1) {
                    rVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    rVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                f90 f90Var = (f90) this.f46985b;
                if (i10 == 1) {
                    f90Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    f90Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f46984a) {
            case 28:
                z3.h hVar = (z3.h) this.f46985b;
                z3.a aVar = (z3.a) obj;
                g gVar = new g(aVar.f53487b, na.d.l3(aVar.f53486a, aVar.f53488c));
                hVar.f53497c.add(gVar);
                long j3 = hVar.f53502j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.b(gVar);
                    return;
                }
                return;
            default:
                ((f0) this.f46985b).b((z3.a) obj);
                return;
        }
    }

    @Override
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        i iVar = (i) this.f46985b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f3415a; i11++) {
            u10.b(new f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        z0.R((z0) this.f46985b, view);
    }

    @Override
    public void e(long j3) {
        switch (this.f46984a) {
            case 14:
                ((xh.e) this.f46985b).a(j3, true);
                return;
            default:
                ((h3) this.f46985b).h();
                return;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f46984a) {
            case 5:
                ((t0) this.f46985b).run();
                return;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f46985b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    tg.c0.U(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 7:
                ((t2) this.f46985b).run();
                return;
            case 8:
                ((t0) this.f46985b).run();
                return;
            case 15:
                ((n8) this.f46985b).run();
                return;
            default:
                ((Utilities.Callback) this.f46985b).run(b2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        t9.a aVar = (t9.a) this.f46985b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f48242b.set((t9.a) bVar.get());
    }

    @Override
    public Object i() {
        SQLiteDatabase a2;
        switch (this.f46984a) {
            case 0:
                s5.g gVar = (s5.g) ((s5.d) this.f46985b);
                long Z = gVar.f47843b.Z() - gVar.d.d;
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(Z)};
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
                s5.g gVar2 = (s5.g) ((s5.c) ((da.c) this.f46985b).f8238i);
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar2.f47843b.Z()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } finally {
                }
            default:
                s sVar = (s) this.f46985b;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar.f7972c)).c(new s0.b(3))) {
                    ((la.h) sVar.d).W(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f46985b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48189a.d();
                Parcelable parcelable = (Parcelable) iVar.f48189a.i();
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
        t0.h hVar = iVar.f48189a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f46742b = clipData;
            eVar.f46743c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        View view = ((u3) this.f46985b).f53262b;
        if (view instanceof w0) {
            ((w0) view).N();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        r1 r1Var = (r1) this.f46985b;
        ArrayList arrayList = r1Var.f51489n0;
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
                    if (kVar.h() != null && kVar.h().equals(oVar.f4279c)) {
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
            ((k) obj2).f47303g = j3;
        }
        AndroidUtilities.runOnUIThread(new x1(r1Var, 18));
    }

    @Override
    public void q(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.f46985b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f49005r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f46984a) {
            case 23:
                m5.b((m5) this.f46985b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                m7 m7Var = (m7) this.f46985b;
                p61 p61Var = (p61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                m7Var.getClass();
                if (p61Var.G instanceof TL_stars.StarsTransaction) {
                    p7.i1(m7Var.getContext(), false, 0L, m7Var.f52905c, (TL_stars.StarsTransaction) p61Var.G, m7Var.f52904b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f46985b).countDown();
        return null;
    }

    @Override
    public void A(float f7, int i10) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
