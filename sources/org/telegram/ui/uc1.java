package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uc1 implements OnSuccessListener, org.telegram.ui.ActionBar.q1, p4.m0, h2.j, p4.b1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, jl0, vw, f3.r {
    public final int f52636a;
    public final Object f52637b;
    public final Object f52638c;

    public uc1(int i7, Object obj, Object obj2) {
        this.f52636a = i7;
        this.f52637b = obj;
        this.f52638c = obj2;
    }

    @Override
    public boolean F() {
        switch (this.f52636a) {
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O(bx bxVar) {
        switch (this.f52636a) {
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int a(Object obj) {
        Context context = (Context) this.f52637b;
        e2.u uVar = (e2.u) this.f52638c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.f58464b;
        if ((!str.equals(uVar.f10759s) && !str.equals(u2.w.c(uVar))) || !oVar.c(context, uVar, false) || !oVar.d(uVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52636a) {
            case 6:
                p4.d1 d1Var = (p4.d1) this.f52637b;
                e2.q1 q1Var = (e2.q1) this.f52638c;
                p4.h1 h1Var = (p4.h1) obj;
                d1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) d1Var.d.f14049n.get(n1Var.f10545a.f10518b);
                        if (m1Var != null && n1Var.f10545a.f10517a == m1Var.f10517a) {
                            c10.a(new e2.n1(m1Var, n1Var.f10546b));
                        } else {
                            c10.a(n1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                h1Var.r0(q1Var);
                return;
            case 7:
                p4.v vVar = (p4.v) this.f52638c;
                p4.h1 h1Var2 = (p4.h1) obj;
                p4.d0 d0Var = (p4.d0) ((p4.d1) this.f52637b).f55330a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    return;
                }
                return;
            case 8:
                p4.d1 d1Var2 = (p4.d1) this.f52637b;
                Surface surface = (Surface) this.f52638c;
                p4.h1 h1Var3 = (p4.h1) obj;
                ((p4.d0) d1Var2.f55330a.get()).getClass();
                if (surface == null) {
                    h1Var3.T(null);
                    d1Var2.f55335i = null;
                    return;
                }
                p4.c1 c1Var = new p4.c1(surface);
                d1Var2.f55335i = c1Var;
                h1Var3.T(c1Var);
                return;
            default:
                a8.xa xaVar = (a8.xa) this.f52637b;
                ((x2.k0) obj).i(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.c0) this.f52638c);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.d[] values;
        v5.g gVar = (v5.g) this.f52637b;
        o5.i iVar = (o5.i) this.f52638c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f59398b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.f21806c) {
                int size = aVar.f59398b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).f59401a);
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
            long j10 = bVar.f59401a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.f59403c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f59404a, fVar.f59405b);
                }
                listIterator.set(new v5.b(j10, bVar.f59402b, c10.b()));
            }
        }
        return d;
    }

    @Override
    public void b(ua.b bVar) {
        ((ua.a) this.f52637b).b(bVar);
        ((ua.a) this.f52638c).b(bVar);
    }

    @Override
    public f3.o[] c(Uri uri, Map map) {
        f3.o aVar;
        x2.q qVar = (x2.q) this.f52637b;
        e2.u uVar = (e2.u) this.f52638c;
        if (qVar.f60330c.G(uVar)) {
            aVar = new c4.h(qVar.f60330c.f(uVar), null);
        } else {
            aVar = new n3.a(uVar);
        }
        return new f3.o[]{aVar};
    }

    @Override
    public void call() {
        int i7 = CarAppNotificationBroadcastReceiver.f2015a;
        ((IStartCarApp) this.f52637b).startCarApp((Intent) this.f52638c);
    }

    @Override
    public void d(j6.k kVar) {
        switch (this.f52636a) {
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0((SpannableString) this.f52637b, kVar, (n2.c0) this.f52638c, 27));
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0((SpannableString) this.f52637b, kVar, (di.p9) this.f52638c, 28));
                return;
        }
    }

    @Override
    public void e(int i7) {
        switch (this.f52636a) {
            case 23:
                wg.u uVar = (wg.u) this.f52637b;
                wg.u uVar2 = (wg.u) this.f52638c;
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
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f52637b;
                org.telegram.messenger.w10 w10Var2 = (org.telegram.messenger.w10) this.f52638c;
                if (i7 == 1) {
                    w10Var.a(null);
                    return;
                } else if (i7 != 3) {
                    w10Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void f(p4.v vVar) {
        switch (this.f52636a) {
            case 4:
                ((p4.d) this.f52638c).f(((p4.n0) this.f52637b).h.f55324t);
                return;
            default:
                p4.n0 n0Var = (p4.n0) this.f52637b;
                n0Var.getClass();
                String str = ((q4.h) this.f52638c).f55918a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                p4.h1 h1Var = n0Var.h.f55324t;
                if (!h1Var.q0(17)) {
                    h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                e2.l1 z02 = h1Var.z0();
                e2.k1 k1Var = new e2.k1();
                for (int i7 = 0; i7 < z02.o(); i7++) {
                    if (TextUtils.equals(z02.m(i7, k1Var, 0L).f10470c.f10493a, str)) {
                        h1Var.R(i7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h() {
        switch (this.f52636a) {
            case 15:
                Iterable iterable = (Iterable) this.f52638c;
                v5.g gVar = (v5.g) ((v5.d) ((ia.c) this.f52637b).f16281c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ia.c cVar = (ia.c) this.f52637b;
                for (Map.Entry entry : ((HashMap) this.f52638c).entrySet()) {
                    ((v5.g) ((v5.c) cVar.f16285i)).e(((Integer) entry.getValue()).intValue(), r5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52636a) {
            case 1:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.f52637b, (HashSet) this.f52638c);
                return;
            case 2:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f52637b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.mp.u1(v0Var.N).s1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.q1(v0Var, (String[]) this.f52638c, t1Var, 23));
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f52637b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f52638c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 18:
                ug.k0 k0Var = (ug.k0) this.f52637b;
                ArrayList arrayList = (ArrayList) this.f52638c;
                k0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(k0Var.f30223a).sendRequest(tL_channels_updateUsername, new ug.u(k0Var, 1), 64);
                }
                return;
            case 21:
                ((AtomicBoolean) this.f52637b).set(true);
                ((wg.q0) this.f52638c).run();
                return;
            default:
                ((wg.u) this.f52637b).a((TLRPC.TL_premiumGiftCodeOption) this.f52638c);
                return;
        }
    }

    @Override
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f52636a) {
            case 9:
                p4.b1 b1Var = (p4.b1) this.f52637b;
                p4.r0 r0Var = (p4.r0) this.f52638c;
                if (d0Var.j()) {
                    return c8.u9.b(new p4.n1(-100));
                }
                return h2.l0.g0((m9.y) b1Var.j(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, r0Var, 10));
            default:
                p4.b1 b1Var2 = (p4.b1) this.f52637b;
                p4.a1 a1Var = (p4.a1) this.f52638c;
                if (d0Var.j()) {
                    return c8.u9.b(new p4.n1(-100));
                }
                return h2.l0.g0((m9.y) b1Var2.j(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, a1Var, 11));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        tg.s1 s1Var = (tg.s1) this.f52637b;
        Bitmap bitmap = (Bitmap) this.f52638c;
        s1Var.D0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && s1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.t1(17, s1Var, bitmap), 2000L);
        } else {
            s1Var.E0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f52637b).d));
        ((hi.e) this.f52638c).setLoading(false);
        wc1.d = null;
        org.telegram.ui.ActionBar.w2 w2Var = wc1.f53298c;
        if (w2Var != null) {
            w2Var.dismiss();
            wc1.f53298c = null;
        }
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        switch (this.f52636a) {
            case 25:
                wg.f0 f0Var = (wg.f0) this.f52637b;
                String str = (String) this.f52638c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((org.telegram.messenger.sr) arrayList.get(i11)).f26946a;
                    f0Var.f39250s1.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                bxVar.finishFragment();
                wg.h.h(j3);
                return true;
            default:
                xg.e eVar = (xg.e) this.f52637b;
                String str2 = (String) this.f52638c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).f26946a;
                    eVar.f60614e.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                bxVar.finishFragment();
                wg.h.h(j10);
                return true;
        }
    }
}
