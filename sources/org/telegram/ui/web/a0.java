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
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import bi.f2;
import bi.l5;
import c8.s9;
import com.google.android.gms.tasks.OnFailureListener;
import h9.h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.up0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gl0;
import org.telegram.ui.qw;
import org.telegram.ui.v91;
import org.telegram.ui.ww;
public final class a0 implements org.telegram.ui.ActionBar.r1, p4.l0, h2.j, p4.a1, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, gl0, qw, f3.r, l5 {
    public final int f51078a;
    public final Object f51079b;
    public final Object f51080c;

    public a0(int i7, Object obj, Object obj2) {
        this.f51078a = i7;
        this.f51079b = obj;
        this.f51080c = obj2;
    }

    @Override
    public boolean G() {
        switch (this.f51078a) {
            case 22:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean N(ww wwVar) {
        switch (this.f51078a) {
            case 22:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        zh.a2 a2Var = (zh.a2) this.f51079b;
        up0 up0Var = a2Var.f60105a;
        a2Var.f60108e.f4915l.remove((TL_stars.SavedStarGift) this.f51080c);
        a2Var.f(true);
        int i7 = a2Var.f60106b;
        if (j3 == p10.i(i7).e()) {
            hc a02 = hc.a0(up0Var.f60211a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = hd.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            cc O = a02.O(document, M0, hd.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
            O.f32522r = false;
            O.j();
        } else {
            cc O2 = hc.a0(up0Var.f60211a).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(i7, j3)));
            O2.f32522r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41289v0.c(true);
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f51078a) {
            case 5:
                p4.c1 c1Var = (p4.c1) this.f51079b;
                e2.q1 q1Var = (e2.q1) this.f51080c;
                p4.g1 g1Var = (p4.g1) obj;
                c1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) c1Var.d.f14393n.get(n1Var.f10401a.f10374b);
                        if (m1Var != null && n1Var.f10401a.f10373a == m1Var.f10373a) {
                            c10.a(new e2.n1(m1Var, n1Var.f10402b));
                        } else {
                            c10.a(n1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q0(q1Var);
                return;
            case 6:
                p4.v vVar = (p4.v) this.f51080c;
                p4.g1 g1Var2 = (p4.g1) obj;
                p4.d0 d0Var = (p4.d0) ((p4.c1) this.f51079b).f53089a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    return;
                }
                return;
            case 7:
                p4.c1 c1Var2 = (p4.c1) this.f51079b;
                Surface surface = (Surface) this.f51080c;
                p4.g1 g1Var3 = (p4.g1) obj;
                ((p4.d0) c1Var2.f53089a.get()).getClass();
                if (surface == null) {
                    g1Var3.S(null);
                    c1Var2.f53094i = null;
                    return;
                }
                p4.b1 b1Var = new p4.b1(surface);
                c1Var2.f53094i = b1Var;
                g1Var3.S(b1Var);
                return;
            default:
                wa waVar = (wa) this.f51079b;
                ((x2.k0) obj).d(waVar.f700b, (x2.g0) waVar.f701c, (x2.c0) this.f51080c);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.d[] values;
        v5.g gVar = (v5.g) this.f51079b;
        o5.i iVar = (o5.i) this.f51080c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f57128b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.f20825c) {
                int size = aVar.f57128b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).f57131a);
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
            long j10 = bVar.f57131a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.f57133c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f57134a, fVar.f57135b);
                }
                listIterator.set(new v5.b(j10, bVar.f57132b, c10.b()));
            }
        }
        return d;
    }

    @Override
    public void b(int i7) {
        switch (this.f51078a) {
            case 20:
                wg.v vVar = (wg.v) this.f51079b;
                wg.v vVar2 = (wg.v) this.f51080c;
                if (i7 == 1) {
                    vVar.a(null);
                    return;
                } else if (i7 != 3) {
                    vVar2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                c20 c20Var = (c20) this.f51079b;
                c20 c20Var2 = (c20) this.f51080c;
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
        ((ua.a) this.f51079b).c(bVar);
        ((ua.a) this.f51080c).c(bVar);
    }

    @Override
    public void call() {
        int i7 = CarAppNotificationBroadcastReceiver.f2101a;
        ((IStartCarApp) this.f51079b).startCarApp((Intent) this.f51080c);
    }

    @Override
    public int d(Object obj) {
        Context context = (Context) this.f51079b;
        e2.u uVar = (e2.u) this.f51080c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.f56171b;
        if ((!str.equals(uVar.f10615s) && !str.equals(u2.w.c(uVar))) || !oVar.c(context, uVar, false) || !oVar.d(uVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public f3.o[] e(Uri uri, Map map) {
        f3.o aVar;
        x2.q qVar = (x2.q) this.f51079b;
        e2.u uVar = (e2.u) this.f51080c;
        if (qVar.f58346c.w(uVar)) {
            aVar = new c4.h(qVar.f58346c.l(uVar), null);
        } else {
            aVar = new n3.a(uVar);
        }
        return new f3.o[]{aVar};
    }

    @Override
    public void f(p4.v vVar) {
        switch (this.f51078a) {
            case 3:
                ((p4.d) this.f51080c).f(((p4.m0) this.f51079b).h.f53124t);
                return;
            default:
                p4.m0 m0Var = (p4.m0) this.f51079b;
                m0Var.getClass();
                String str = ((q4.h) this.f51080c).f53679a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                p4.g1 g1Var = m0Var.h.f53124t;
                if (!g1Var.p0(17)) {
                    h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                e2.l1 y02 = g1Var.y0();
                e2.k1 k1Var = new e2.k1();
                for (int i7 = 0; i7 < y02.o(); i7++) {
                    if (TextUtils.equals(y02.m(i7, k1Var, 0L).f10326c.f10349a, str)) {
                        g1Var.Q(i7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51078a) {
            case 0:
                x0 x0Var = (x0) this.f51079b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = qp.s1(x0Var.M).q1(x0Var.U);
                ConnectionsManager.getInstance(x0Var.M).sendRequest(allowsendmessage, new f2(x0Var, (String[]) this.f51080c, u1Var, 20));
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f51079b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f51080c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 2:
                vf.c.q((Context) this.f51079b, Uri.parse((String) this.f51080c), true, false);
                return;
            case 15:
                ug.i0 i0Var = (ug.i0) this.f51079b;
                ArrayList arrayList = (ArrayList) this.f51080c;
                i0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = qp.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i0Var.f28613a).sendRequest(tL_channels_updateUsername, new ug.u(i0Var, 1), 64);
                }
                return;
            case 18:
                ((AtomicBoolean) this.f51079b).set(true);
                ((wg.r0) this.f51080c).run();
                return;
            case 19:
                ((wg.v) this.f51079b).a((TLRPC.TL_premiumGiftCodeOption) this.f51080c);
                return;
            case 27:
                zh.m mVar = (zh.m) this.f51079b;
                z5 z5Var = (z5) this.f51080c;
                try {
                    int parseInt = Integer.parseInt(z5Var.getText().toString().trim());
                    mVar.g1(parseInt);
                    mVar.U1.setValue(parseInt);
                    u1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.F3(z5Var);
                    a8.g(th2, true);
                    return;
                }
            default:
                zh.o1 o1Var = (zh.o1) this.f51079b;
                c20 c20Var = (c20) this.f51080c;
                String obj = o1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    c20Var.a(obj);
                    u1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.F3(o1Var);
                return;
        }
    }

    @Override
    public Object h() {
        switch (this.f51078a) {
            case 12:
                Iterable iterable = (Iterable) this.f51080c;
                v5.g gVar = (v5.g) ((v5.d) ((ia.c) this.f51079b).f15417c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ia.c cVar = (ia.c) this.f51079b;
                for (Map.Entry entry : ((HashMap) this.f51080c).entrySet()) {
                    ((v5.g) ((v5.c) cVar.f15421i)).e(((Integer) entry.getValue()).intValue(), r5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f51078a) {
            case 8:
                p4.a1 a1Var = (p4.a1) this.f51079b;
                p4.r0 r0Var = (p4.r0) this.f51080c;
                if (d0Var.j()) {
                    return s9.b(new p4.m1(-100));
                }
                return h2.m0.g0((m9.y) a1Var.i(d0Var, vVar, i7), new hr(d0Var, vVar, r0Var, 9));
            default:
                p4.a1 a1Var2 = (p4.a1) this.f51079b;
                p4.z0 z0Var = (p4.z0) this.f51080c;
                if (d0Var.j()) {
                    return s9.b(new p4.m1(-100));
                }
                return h2.m0.g0((m9.y) a1Var2.i(d0Var, vVar, i7), new hr(d0Var, vVar, z0Var, 10));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.f51079b;
        Bitmap bitmap = (Bitmap) this.f51080c;
        n1Var.B0 = false;
        a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new w(26, n1Var, bitmap), 2000L);
        } else {
            n1Var.C0 = true;
        }
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        switch (this.f51078a) {
            case 22:
                wg.g0 g0Var = (wg.g0) this.f51079b;
                String str = (String) this.f51080c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((xr) arrayList.get(i11)).f26513a;
                    g0Var.f36263o1.getSendMessagesHelper().r0(ez.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                wwVar.finishFragment();
                wg.h.h(j3);
                return true;
            default:
                xg.f fVar = (xg.f) this.f51079b;
                String str2 = (String) this.f51080c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((xr) arrayList.get(i12)).f26513a;
                    fVar.f58631e.getSendMessagesHelper().r0(ez.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    fVar = fVar;
                }
                wwVar.finishFragment();
                wg.h.h(j10);
                return true;
        }
    }
}
