package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.kg1;
import org.telegram.ui.mp0;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import org.telegram.ui.zo0;
import yh.e4;
import yh.f4;
import yh.p2;
import zh.r3;
public final class o0 implements org.telegram.ui.ActionBar.z1, r2.v, t5.b, qa.a, OnFailureListener, s5.e, c3.r, e2.j, zo0, sy, androidx.car.app.utils.d, r9.d, zh.f2, Utilities.Callback5, bm0, bh1 {
    public final int f41141a;
    public final Object f41142b;
    public final Object f41143c;

    public o0(int i10, Object obj, Object obj2) {
        this.f41141a = i10;
        this.f41142b = obj;
        this.f41143c = obj2;
    }

    @Override
    public boolean D() {
        switch (this.f41141a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean L(yy yyVar) {
        switch (this.f41141a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f41141a) {
            case 13:
                ug.v vVar = (ug.v) this.f41142b;
                ug.v vVar2 = (ug.v) this.f41143c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f41142b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f41143c;
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
        a5.a aVar = (a5.a) this.f41142b;
        ((u2.k0) obj).e(aVar.f281b, (u2.g0) aVar.f282c, (u2.c0) this.f41143c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f41142b;
        l5.i iVar = (l5.i) this.f41143c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f45016b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f14582c) {
                int size = aVar.f45016b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f45018a);
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
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.f45018a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.m c10 = bVar.f45020c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.c(fVar.f45021a, fVar.f45022b);
                }
                listIterator.set(new s5.b(j11, bVar.f45019b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        yh.m2 m2Var = (yh.m2) this.f41142b;
        ns0 ns0Var = m2Var.f48993a;
        m2Var.e.f50510l.remove((TL_stars.SavedStarGift) this.f41143c);
        m2Var.f(true);
        int i10 = m2Var.f48994b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            zc a02 = zc.a0(ns0Var.f49088a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            sc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2)));
            O.f28813r = false;
            O.j();
        } else {
            sc O2 = zc.a0(ns0Var.f49088a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f28813r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31849x0.c(true);
        }
    }

    @Override
    public int c(Object obj) {
        Context context = (Context) this.f41142b;
        b2.x xVar = (b2.x) this.f41143c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f43604b;
        if ((!str.equals(xVar.f2523s) && !str.equals(r2.w.c(xVar))) || !oVar.c(context, xVar, false) || !oVar.d(xVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f1296a;
        ((IStartCarApp) this.f41142b).startCarApp((Intent) this.f41143c);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        f4.R((f4) this.f41142b, (e4) this.f41143c, i10);
    }

    @Override
    public c3.o[] e(Uri uri, Map map) {
        c3.o aVar;
        u2.q qVar = (u2.q) this.f41142b;
        b2.x xVar = (b2.x) this.f41143c;
        if (qVar.f46024c.a0(xVar)) {
            aVar = new z3.i(qVar.f46024c.y(xVar), null);
        } else {
            aVar = new k3.a(xVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public Object f() {
        switch (this.f41141a) {
            case 2:
                Iterable iterable = (Iterable) this.f41143c;
                s5.g gVar = (s5.g) ((s5.d) ((ea.b) this.f41142b).f8668c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ea.b bVar = (ea.b) this.f41142b;
                for (Map.Entry entry : ((HashMap) this.f41143c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f8671i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41141a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f41142b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f41143c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 8:
                sg.j0.R((sg.j0) this.f41142b, (ArrayList) this.f41143c);
                return;
            case 11:
                ((AtomicBoolean) this.f41142b).set(true);
                ((ug.t0) this.f41143c).run();
                return;
            case 12:
                ((ug.v) this.f41142b).run((TLRPC.TL_premiumGiftCodeOption) this.f41143c);
                return;
            case 19:
                yh.n nVar = (yh.n) this.f41142b;
                c6 c6Var = (c6) this.f41143c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    nVar.Y(parseInt);
                    nVar.f49008c0.setValue(parseInt);
                    a2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 20:
                yh.y1 y1Var = (yh.y1) this.f41142b;
                Utilities.Callback callback = (Utilities.Callback) this.f41143c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(y1Var);
                return;
            default:
                r3 r3Var = (r3) this.f41142b;
                pf.c g10 = a2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                o0 o0Var = new o0(26, r3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f32584b0 = o0Var;
                twoStepVerificationActivity.f32582a0 = r3Var.D1();
                g10.d();
                twoStepVerificationActivity.s0(new pi.g(r3Var, (ug.m1[]) this.f41143c, g10, twoStepVerificationActivity, 25));
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        ((qa.a) this.f41142b).h(bVar);
        ((qa.a) this.f41143c).h(bVar);
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41141a) {
            case 24:
                ((zh.g) this.f41142b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f41143c);
                return;
            default:
                ((r3) this.f41142b).N1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f41143c);
                return;
        }
    }

    @Override
    public Object n2(z5 z5Var) {
        String valueOf;
        String str = (String) this.f41142b;
        Context context = (Context) z5Var.a(Context.class);
        switch (((k2.y0) this.f41143c).f14062a) {
            case 3:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 4:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 5:
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
        return new ya.a(str, valueOf);
    }

    @Override
    public void onFailure(Exception exc) {
        rg.z1 z1Var = (rg.z1) this.f41142b;
        Bitmap bitmap = (Bitmap) this.f41143c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new v(22, z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        p2 p2Var = (p2) this.f41142b;
        di.d dVar = (di.d) this.f41143c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        p2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((m61) obj).G).gift.f19141id;
        if (p2Var.f49076b == j10) {
            p2Var.f49076b = 0L;
        } else {
            p2Var.f49076b = j10;
        }
        if (p2Var.f49076b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof mp0) {
                    mp0 mp0Var = (mp0) childAt;
                    if (p2Var.f49076b == mp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        switch (this.f41141a) {
            case 15:
                ug.g0 g0Var = (ug.g0) this.f41142b;
                String str = (String) this.f41143c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.f24070n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                yyVar.finishFragment();
                ug.j.h(j10);
                return true;
            default:
                vg.e eVar = (vg.e) this.f41142b;
                String str2 = (String) this.f41143c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                yyVar.finishFragment();
                ug.j.h(j11);
                return true;
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
