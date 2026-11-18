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
public final class wc1 implements OnSuccessListener, org.telegram.ui.ActionBar.r1, p4.l0, h2.j, p4.c1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, ll0, ww, f3.r {
    public final int f53026a;
    public final Object f53027b;
    public final Object f53028c;

    public wc1(int i7, Object obj, Object obj2) {
        this.f53026a = i7;
        this.f53027b = obj;
        this.f53028c = obj2;
    }

    @Override
    public boolean G() {
        switch (this.f53026a) {
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P(cx cxVar) {
        switch (this.f53026a) {
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(ji.j jVar) {
        switch (this.f53026a) {
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sv0((SpannableString) this.f53027b, jVar, (oi.s2) this.f53028c, 25));
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sv0((SpannableString) this.f53027b, jVar, (di.o9) this.f53028c, 26));
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f53026a) {
            case 6:
                p4.e1 e1Var = (p4.e1) this.f53027b;
                e2.q1 q1Var = (e2.q1) this.f53028c;
                p4.i1 i1Var = (p4.i1) obj;
                e1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.h2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) e1Var.d.f14067n.get(n1Var.f10552a.f10525b);
                        if (m1Var != null && n1Var.f10552a.f10524a == m1Var.f10524a) {
                            c10.a(new e2.n1(m1Var, n1Var.f10553b));
                        } else {
                            c10.a(n1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                i1Var.q0(q1Var);
                return;
            case 7:
                p4.v vVar = (p4.v) this.f53028c;
                p4.i1 i1Var2 = (p4.i1) obj;
                p4.d0 d0Var = (p4.d0) ((p4.e1) this.f53027b).f55209a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    return;
                }
                return;
            case 8:
                p4.e1 e1Var2 = (p4.e1) this.f53027b;
                Surface surface = (Surface) this.f53028c;
                p4.i1 i1Var3 = (p4.i1) obj;
                ((p4.d0) e1Var2.f55209a.get()).getClass();
                if (surface == null) {
                    i1Var3.S(null);
                    e1Var2.f55214i = null;
                    return;
                }
                p4.d1 d1Var = new p4.d1(surface);
                e1Var2.f55214i = d1Var;
                i1Var3.S(d1Var);
                return;
            default:
                a8.xa xaVar = (a8.xa) this.f53027b;
                ((x2.k0) obj).b(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.c0) this.f53028c);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.d[] values;
        v5.g gVar = (v5.g) this.f53027b;
        o5.i iVar = (o5.i) this.f53028c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f59274b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.f21713c) {
                int size = aVar.f59274b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).f59277a);
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
            long j10 = bVar.f59277a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.f59279c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f59280a, fVar.f59281b);
                }
                listIterator.set(new v5.b(j10, bVar.f59278b, c10.b()));
            }
        }
        return d;
    }

    @Override
    public void b(ua.b bVar) {
        ((ua.a) this.f53027b).b(bVar);
        ((ua.a) this.f53028c).b(bVar);
    }

    @Override
    public int c(Object obj) {
        Context context = (Context) this.f53027b;
        e2.u uVar = (e2.u) this.f53028c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.f58339b;
        if ((!str.equals(uVar.f10766s) && !str.equals(u2.w.c(uVar))) || !oVar.c(context, uVar, false) || !oVar.d(uVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void call() {
        int i7 = CarAppNotificationBroadcastReceiver.f2044a;
        ((IStartCarApp) this.f53027b).startCarApp((Intent) this.f53028c);
    }

    @Override
    public void d(int i7) {
        switch (this.f53026a) {
            case 23:
                wg.v vVar = (wg.v) this.f53027b;
                wg.v vVar2 = (wg.v) this.f53028c;
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
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f53027b;
                org.telegram.messenger.x10 x10Var2 = (org.telegram.messenger.x10) this.f53028c;
                if (i7 == 1) {
                    x10Var.a(null);
                    return;
                } else if (i7 != 3) {
                    x10Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public f3.o[] e(Uri uri, Map map) {
        f3.o aVar;
        x2.q qVar = (x2.q) this.f53027b;
        e2.u uVar = (e2.u) this.f53028c;
        if (qVar.f60202c.H(uVar)) {
            aVar = new c4.h(qVar.f60202c.j(uVar), null);
        } else {
            aVar = new n3.a(uVar);
        }
        return new f3.o[]{aVar};
    }

    @Override
    public void f(p4.v vVar) {
        switch (this.f53026a) {
            case 4:
                ((p4.d) this.f53028c).f(((p4.m0) this.f53027b).h.f55195t);
                return;
            default:
                p4.m0 m0Var = (p4.m0) this.f53027b;
                m0Var.getClass();
                String str = ((q4.h) this.f53028c).f55795a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                p4.i1 i1Var = m0Var.h.f55195t;
                if (!i1Var.p0(17)) {
                    h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                e2.l1 y02 = i1Var.y0();
                e2.k1 k1Var = new e2.k1();
                for (int i7 = 0; i7 < y02.o(); i7++) {
                    if (TextUtils.equals(y02.m(i7, k1Var, 0L).f10477c.f10500a, str)) {
                        i1Var.Q(i7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object g() {
        switch (this.f53026a) {
            case 15:
                Iterable iterable = (Iterable) this.f53028c;
                v5.g gVar = (v5.g) ((v5.d) ((ia.c) this.f53027b).f16190c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ia.c cVar = (ia.c) this.f53027b;
                for (Map.Entry entry : ((HashMap) this.f53028c).entrySet()) {
                    ((v5.g) ((v5.c) cVar.f16194i)).e(((Integer) entry.getValue()).intValue(), r5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f53026a) {
            case 1:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.f53027b, (HashSet) this.f53028c);
                return;
            case 2:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f53027b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.mp.u1(v0Var.N).s1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.m1(v0Var, (String[]) this.f53028c, u1Var, 23));
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f53027b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f53028c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 18:
                ug.l0 l0Var = (ug.l0) this.f53027b;
                ArrayList arrayList = (ArrayList) this.f53028c;
                l0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(l0Var.f30187a).sendRequest(tL_channels_updateUsername, new ug.u(l0Var, 1), 64);
                }
                return;
            case 21:
                ((AtomicBoolean) this.f53027b).set(true);
                ((wg.r0) this.f53028c).run();
                return;
            default:
                ((wg.v) this.f53027b).a((TLRPC.TL_premiumGiftCodeOption) this.f53028c);
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f53026a) {
            case 9:
                p4.c1 c1Var = (p4.c1) this.f53027b;
                p4.r0 r0Var = (p4.r0) this.f53028c;
                if (d0Var.j()) {
                    return c8.t9.b(new p4.o1(-100));
                }
                return h2.l0.g0((m9.y) c1Var.k(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, r0Var, 10));
            default:
                p4.c1 c1Var2 = (p4.c1) this.f53027b;
                p4.b1 b1Var = (p4.b1) this.f53028c;
                if (d0Var.j()) {
                    return c8.t9.b(new p4.o1(-100));
                }
                return h2.l0.g0((m9.y) c1Var2.k(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, b1Var, 11));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.f53027b;
        Bitmap bitmap = (Bitmap) this.f53028c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new p4.o0(11, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f53027b).d));
        ((hi.d) this.f53028c).setLoading(false);
        yc1.d = null;
        org.telegram.ui.ActionBar.x2 x2Var = yc1.f54117c;
        if (x2Var != null) {
            x2Var.dismiss();
            yc1.f54117c = null;
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        switch (this.f53026a) {
            case 25:
                wg.g0 g0Var = (wg.g0) this.f53027b;
                String str = (String) this.f53028c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((org.telegram.messenger.sr) arrayList.get(i11)).f26845a;
                    g0Var.f39538s1.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                cxVar.finishFragment();
                wg.h.h(j3);
                return true;
            default:
                xg.e eVar = (xg.e) this.f53027b;
                String str2 = (String) this.f53028c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).f26845a;
                    eVar.f60486e.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                cxVar.finishFragment();
                wg.h.h(j10);
                return true;
        }
    }
}
