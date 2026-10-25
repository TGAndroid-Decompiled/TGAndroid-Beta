package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
public final class zg1 implements org.telegram.ui.ActionBar.b2, OnSuccessListener, r2.v, u5.b, ra.a, OnFailureListener, t5.e, c3.r, e2.j, androidx.car.app.utils.c, oo0, ux, s9.d, bi.i5 {
    public final int f46286a;
    public final Object f46287b;
    public final Object f46288c;

    public zg1(int i10, Object obj, Object obj2) {
        this.f46286a = i10;
        this.f46287b = obj;
        this.f46288c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f46286a) {
            case 23:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K(cy cyVar) {
        switch (this.f46286a) {
            case 23:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f46286a) {
            case 21:
                vg.v vVar = (vg.v) this.f46287b;
                vg.v vVar2 = (vg.v) this.f46288c;
                if (i10 == 1) {
                    vVar.run(null);
                    return;
                } else if (i10 != 3) {
                    vVar2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f46287b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f46288c;
                if (i10 == 1) {
                    callback.run(null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void accept(Object obj) {
        a8.ng ngVar = (a8.ng) this.f46287b;
        ((u2.k0) obj).d(ngVar.f639b, (u2.g0) ngVar.f640c, (u2.c0) this.f46288c);
    }

    @Override
    public Object apply(Object obj) {
        j5.d[] values;
        t5.g gVar = (t5.g) this.f46287b;
        m5.i iVar = (m5.i) this.f46288c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        t5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f48696b);
        for (j5.d dVar : j5.d.values()) {
            if (dVar != iVar.f18335c) {
                int size = aVar.f48696b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((t5.b) d.get(i10)).f48698a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new t5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            t5.b bVar = (t5.b) listIterator.next();
            long j11 = bVar.f48698a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                aa.m0 c10 = bVar.f48700c.c();
                for (t5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.f48701a, fVar.f48702b);
                }
                listIterator.set(new t5.b(j11, bVar.f48699b, c10.h()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        zh.m2 m2Var = (zh.m2) this.f46287b;
        org.telegram.ui.Components.vs0 vs0Var = m2Var.f53140a;
        m2Var.e.f5471l.remove((TL_stars.SavedStarGift) this.f46288c);
        m2Var.f(true);
        int i10 = m2Var.f53141b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(vs0Var.f53227a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            org.telegram.ui.Components.qc O = b02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2)));
            O.f31896s = false;
            O.j();
        } else {
            org.telegram.ui.Components.qc O2 = org.telegram.ui.Components.wc.b0(vs0Var.f53227a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f31896s = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35564x0.c(true);
        }
    }

    @Override
    public int c(Object obj) {
        Context context = (Context) this.f46287b;
        b2.x xVar = (b2.x) this.f46288c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f47222b;
        if ((!str.equals(xVar.f3586s) && !str.equals(r2.w.c(xVar))) || !oVar.c(context, xVar, false) || !oVar.d(xVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2360a;
        ((IStartCarApp) this.f46287b).startCarApp((Intent) this.f46288c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.q qVar = (u2.q) this.f46287b;
        b2.x xVar = (b2.x) this.f46288c;
        if (qVar.f49403c.i1(xVar)) {
            aVar = new z3.h(qVar.f49403c.f0(xVar), null);
        } else {
            aVar = new k3.a(xVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public Object d1(a8.me meVar) {
        String valueOf;
        String str = (String) this.f46287b;
        Context context = (Context) meVar.a(Context.class);
        switch (((m4.x0) this.f46288c).f18298a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 13:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 14:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    valueOf = "auto";
                    break;
                } else {
                    if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                        valueOf = "embedded";
                        break;
                    }
                    valueOf = "";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new za.a(str, valueOf);
    }

    @Override
    public Object f() {
        switch (this.f46286a) {
            case 10:
                Iterable iterable = (Iterable) this.f46288c;
                t5.g gVar = (t5.g) ((t5.d) ((aa.b0) this.f46287b).f1034f);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + t5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                aa.b0 b0Var = (aa.b0) this.f46287b;
                for (Map.Entry entry : ((HashMap) this.f46288c).entrySet()) {
                    ((t5.g) ((t5.c) b0Var.f1036i)).e(((Integer) entry.getValue()).intValue(), p5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46286a) {
            case 0:
                ph1 ph1Var = (ph1) this.f46287b;
                ph1Var.getClass();
                ((boolean[]) this.f46288c)[0] = true;
                ph1Var.f42538p0 = 17;
                Intent intent = new Intent(ph1Var.f42510b, VoIPService.class);
                intent.putExtra("user_id", ph1Var.d.f22174id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ph1Var.f42507a);
                try {
                    ph1Var.f42510b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 2:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) this.f46287b;
                h8Var.getClass();
                e2Var.dismiss();
                org.telegram.ui.Wallet.w7 w7Var = new org.telegram.ui.Wallet.w7();
                w7Var.f37444r = !((Boolean) this.f46288c).booleanValue();
                h8Var.presentFragment(w7Var);
                return;
            case 3:
                ((Runnable) this.f46287b).run();
                ((org.telegram.ui.ActionBar.k3) this.f46288c).dismiss();
                return;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f46288c;
                qf.c h = e2Var.h(i10, true, true);
                h.d();
                org.telegram.ui.Wallet.d8 d8Var = new org.telegram.ui.Wallet.d8((org.telegram.ui.Wallet.h8) this.f46287b, h, 1);
                org.telegram.ui.Wallet.l0.F("disableBackupWithoutUpdatingPhrase");
                l0Var.j0(new e2.p0((Object) l0Var, (Object) new org.telegram.ui.Components.oy(28, l0Var, d8Var), true, false, 3));
                return;
            case 6:
                org.telegram.ui.web.p.Z((org.telegram.ui.web.p) this.f46287b, (HashSet) this.f46288c);
                return;
            case 7:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f46287b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.M).getInputUser(a1Var.U);
                ConnectionsManager.getInstance(a1Var.M).sendRequest(allowsendmessage, new bi.h2(a1Var, (String[]) this.f46288c, e2Var, 20));
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.f46288c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f46287b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 15:
                tg.j0.Q((tg.j0) this.f46287b, (ArrayList) this.f46288c);
                return;
            case 19:
                ((AtomicBoolean) this.f46287b).set(true);
                ((vg.t0) this.f46288c).run();
                return;
            case 20:
                ((vg.v) this.f46287b).run((TLRPC.TL_premiumGiftCodeOption) this.f46288c);
                return;
            case 27:
                zh.m mVar = (zh.m) this.f46287b;
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) this.f46288c;
                try {
                    int parseInt = Integer.parseInt(g6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f53111c0.setValue(parseInt);
                    e2Var.dismiss();
                    return;
                } catch (Throwable th3) {
                    AndroidUtilities.shakeView(g6Var);
                    FileLog.e(th3);
                    return;
                }
            default:
                zh.y1 y1Var = (zh.y1) this.f46287b;
                Utilities.Callback callback = (Utilities.Callback) this.f46288c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    e2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(y1Var);
                return;
        }
    }

    @Override
    public void i(ra.b bVar) {
        ((ra.a) this.f46287b).i(bVar);
        ((ra.a) this.f46288c).i(bVar);
    }

    @Override
    public void onFailure(Exception exc) {
        sg.z1 z1Var = (sg.z1) this.f46287b;
        Bitmap bitmap = (Bitmap) this.f46288c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ob.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new sg.u(z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((a8.me) this.f46287b).f616c));
        ((fi.d) this.f46288c).setLoading(false);
        ii1.d = null;
        org.telegram.ui.ActionBar.k3 k3Var = ii1.f40249c;
        if (k3Var != null) {
            k3Var.dismiss();
            ii1.f40249c = null;
        }
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        switch (this.f46286a) {
            case 23:
                vg.g0 g0Var = (vg.g0) this.f46287b;
                String str = (String) this.f46288c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.f26809n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                cyVar.finishFragment();
                vg.j.h(j10);
                return true;
            default:
                wg.e eVar = (wg.e) this.f46287b;
                String str2 = (String) this.f46288c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                cyVar.finishFragment();
                vg.j.h(j11);
                return true;
        }
    }

    public zg1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f46286a = 8;
        this.f46288c = zArr;
        this.f46287b = jsPromptResult;
    }
}
