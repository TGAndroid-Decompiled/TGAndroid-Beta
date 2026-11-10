package org.telegram.ui.web;

import a8.wa;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import bi.f2;
import bi.l5;
import c8.s9;
import com.google.android.gms.tasks.OnFailureListener;
import h9.h2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jl0;
import org.telegram.ui.tl0;
import org.telegram.ui.tw;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
import zh.c2;
public final class a0 implements org.telegram.ui.ActionBar.r1, p4.l0, h2.j, p4.a1, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, jl0, tw, f3.r, l5, a20 {
    public final int f51020a;
    public final Object f51021b;
    public final Object f51022c;

    public a0(int i7, Object obj, Object obj2) {
        this.f51020a = i7;
        this.f51021b = obj;
        this.f51022c = obj2;
    }

    @Override
    public boolean G() {
        switch (this.f51020a) {
            case 21:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean N(zw zwVar) {
        switch (this.f51020a) {
            case 21:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        zh.z1 z1Var = (zh.z1) this.f51021b;
        up0 up0Var = z1Var.f60651a;
        z1Var.f60654e.f4914l.remove((TL_stars.SavedStarGift) this.f51022c);
        z1Var.f(true);
        int i7 = z1Var.f60652b;
        if (j3 == p10.i(i7).e()) {
            gc a02 = gc.a0(up0Var.f60294a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = id.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            bc O = a02.O(document, M0, id.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
            O.f32211r = false;
            O.j();
        } else {
            bc O2 = gc.a0(up0Var.f60294a).O(tL_starGiftUnique.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(i7, j3)));
            O2.f32211r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41291v0.c(true);
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f51020a) {
            case 4:
                p4.c1 c1Var = (p4.c1) this.f51021b;
                e2.q1 q1Var = (e2.q1) this.f51022c;
                p4.g1 g1Var = (p4.g1) obj;
                c1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) c1Var.d.f14395n.get(n1Var.f10406a.f10379b);
                        if (m1Var != null && n1Var.f10406a.f10378a == m1Var.f10378a) {
                            c10.a(new e2.n1(m1Var, n1Var.f10407b));
                        } else {
                            c10.a(n1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q0(q1Var);
                return;
            case 5:
                p4.v vVar = (p4.v) this.f51022c;
                p4.g1 g1Var2 = (p4.g1) obj;
                p4.d0 d0Var = (p4.d0) ((p4.c1) this.f51021b).f53194a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    return;
                }
                return;
            case 6:
                p4.c1 c1Var2 = (p4.c1) this.f51021b;
                Surface surface = (Surface) this.f51022c;
                p4.g1 g1Var3 = (p4.g1) obj;
                ((p4.d0) c1Var2.f53194a.get()).getClass();
                if (surface == null) {
                    g1Var3.S(null);
                    c1Var2.f53199i = null;
                    return;
                }
                p4.b1 b1Var = new p4.b1(surface);
                c1Var2.f53199i = b1Var;
                g1Var3.S(b1Var);
                return;
            default:
                wa waVar = (wa) this.f51021b;
                ((x2.j0) obj).d(waVar.f700b, (x2.f0) waVar.f701c, (x2.b0) this.f51022c);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.d[] values;
        v5.g gVar = (v5.g) this.f51021b;
        o5.i iVar = (o5.i) this.f51022c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f57229b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.f20833c) {
                int size = aVar.f57229b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).f57232a);
            if (i7 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new v5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            v5.b bVar = (v5.b) listIterator.next();
            long j10 = bVar.f57232a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.f57234c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f57235a, fVar.f57236b);
                }
                listIterator.set(new v5.b(j10, bVar.f57233b, c10.b()));
            }
        }
        return d;
    }

    @Override
    public void b(int i7) {
        switch (this.f51020a) {
            case 19:
                wg.u uVar = (wg.u) this.f51021b;
                wg.u uVar2 = (wg.u) this.f51022c;
                if (i7 == 1) {
                    uVar.a(null);
                    return;
                } else if (i7 != 3) {
                    uVar2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                c20 c20Var = (c20) this.f51021b;
                c20 c20Var2 = (c20) this.f51022c;
                if (i7 == 1) {
                    c20Var.a(null);
                    return;
                } else if (i7 != 3) {
                    c20Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void c(ua.b bVar) {
        ((ua.a) this.f51021b).c(bVar);
        ((ua.a) this.f51022c).c(bVar);
    }

    @Override
    public void call() {
        int i7 = CarAppNotificationBroadcastReceiver.f2101a;
        ((IStartCarApp) this.f51021b).startCarApp((Intent) this.f51022c);
    }

    @Override
    public int d(Object obj) {
        Context context = (Context) this.f51021b;
        e2.u uVar = (e2.u) this.f51022c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.f56272b;
        if ((!str.equals(uVar.f10620s) && !str.equals(u2.w.c(uVar))) || !oVar.c(context, uVar, false) || !oVar.d(uVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public f3.o[] e(Uri uri, Map map) {
        f3.o aVar;
        x2.p pVar = (x2.p) this.f51021b;
        e2.u uVar = (e2.u) this.f51022c;
        if (pVar.f58448c.w(uVar)) {
            aVar = new c4.h(pVar.f58448c.l(uVar), null);
        } else {
            aVar = new n3.a(uVar);
        }
        return new f3.o[]{aVar};
    }

    @Override
    public void f(p4.v vVar) {
        switch (this.f51020a) {
            case 2:
                ((p4.d) this.f51022c).f(((p4.m0) this.f51021b).h.f53229t);
                return;
            default:
                p4.m0 m0Var = (p4.m0) this.f51021b;
                m0Var.getClass();
                String str = ((q4.h) this.f51022c).f53784a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                p4.g1 g1Var = m0Var.h.f53229t;
                if (!g1Var.p0(17)) {
                    h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                e2.l1 y02 = g1Var.y0();
                e2.k1 k1Var = new e2.k1();
                for (int i7 = 0; i7 < y02.o(); i7++) {
                    if (TextUtils.equals(y02.m(i7, k1Var, 0L).f10331c.f10354a, str)) {
                        g1Var.Q(i7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51020a) {
            case 0:
                x0 x0Var = (x0) this.f51021b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = qp.s1(x0Var.M).q1(x0Var.U);
                ConnectionsManager.getInstance(x0Var.M).sendRequest(allowsendmessage, new f2(x0Var, (String[]) this.f51022c, u1Var, 20));
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f51021b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f51022c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 14:
                ug.i0 i0Var = (ug.i0) this.f51021b;
                ArrayList arrayList = (ArrayList) this.f51022c;
                i0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = qp.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i0Var.f28669a).sendRequest(tL_channels_updateUsername, new ug.u(i0Var, 1), 64);
                }
                return;
            case 17:
                ((AtomicBoolean) this.f51021b).set(true);
                ((wg.r0) this.f51022c).run();
                return;
            case 18:
                ((wg.u) this.f51021b).a((TLRPC.TL_premiumGiftCodeOption) this.f51022c);
                return;
            case 26:
                zh.l lVar = (zh.l) this.f51021b;
                z5 z5Var = (z5) this.f51022c;
                try {
                    int parseInt = Integer.parseInt(z5Var.getText().toString().trim());
                    lVar.g1(parseInt);
                    lVar.X1.setValue(parseInt);
                    u1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.F3(z5Var);
                    a8.g(th2, true);
                    return;
                }
            default:
                zh.n1 n1Var = (zh.n1) this.f51021b;
                c20 c20Var = (c20) this.f51022c;
                String obj = n1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    c20Var.a(obj);
                    u1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.F3(n1Var);
                return;
        }
    }

    @Override
    public Object h() {
        switch (this.f51020a) {
            case 11:
                Iterable iterable = (Iterable) this.f51022c;
                v5.g gVar = (v5.g) ((v5.d) ((ia.c) this.f51021b).f15422c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ia.c cVar = (ia.c) this.f51021b;
                for (Map.Entry entry : ((HashMap) this.f51022c).entrySet()) {
                    ((v5.g) ((v5.c) cVar.f15426i)).e(((Integer) entry.getValue()).intValue(), r5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z9;
        boolean z10;
        c2 c2Var = (c2) this.f51021b;
        fi.d dVar = (fi.d) this.f51022c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j3 = ((TL_stars.SavedStarGift) ((x31) obj).G).gift.f27189id;
        if (c2Var.l1 == j3) {
            c2Var.l1 = 0L;
        } else {
            c2Var.l1 = j3;
        }
        if (c2Var.l1 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.setEnabled(z9);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof tl0) {
                    tl0 tl0Var = (tl0) childAt;
                    if (c2Var.l1 == tl0Var.getGiftId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tl0Var.b(z10, true);
                }
            }
        }
    }

    @Override
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f51020a) {
            case 7:
                p4.a1 a1Var = (p4.a1) this.f51021b;
                p4.r0 r0Var = (p4.r0) this.f51022c;
                if (d0Var.j()) {
                    return s9.b(new p4.m1(-100));
                }
                return h2.m0.g0((m9.y) a1Var.l(d0Var, vVar, i7), new gr(d0Var, vVar, r0Var, 9));
            default:
                p4.a1 a1Var2 = (p4.a1) this.f51021b;
                p4.z0 z0Var = (p4.z0) this.f51022c;
                if (d0Var.j()) {
                    return s9.b(new p4.m1(-100));
                }
                return h2.m0.g0((m9.y) a1Var2.l(d0Var, vVar, i7), new gr(d0Var, vVar, z0Var, 10));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.f51021b;
        Bitmap bitmap = (Bitmap) this.f51022c;
        n1Var.B0 = false;
        a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new s(22, n1Var, bitmap), 2000L);
        } else {
            n1Var.C0 = true;
        }
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        switch (this.f51020a) {
            case 21:
                wg.g0 g0Var = (wg.g0) this.f51021b;
                String str = (String) this.f51022c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((xr) arrayList.get(i11)).f26524a;
                    g0Var.f35905r1.getSendMessagesHelper().r0(ez.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                zwVar.finishFragment();
                wg.h.h(j3);
                return true;
            default:
                xg.f fVar = (xg.f) this.f51021b;
                String str2 = (String) this.f51022c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((xr) arrayList.get(i12)).f26524a;
                    fVar.f58734e.getSendMessagesHelper().r0(ez.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    fVar = fVar;
                }
                zwVar.finishFragment();
                wg.h.h(j10);
                return true;
        }
    }
}
