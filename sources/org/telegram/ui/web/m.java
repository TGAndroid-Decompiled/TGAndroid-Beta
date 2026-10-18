package org.telegram.ui.web;

import ai.m5;
import ai.q2;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fo0;
import org.telegram.ui.so0;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
import yh.f4;
import yh.g4;
import yh.p2;
public final class m implements org.telegram.ui.ActionBar.a2, r2.v, t5.b, qa.a, OnFailureListener, s5.e, c3.r, e2.j, fo0, xx, androidx.car.app.utils.b, r9.d, m5, Utilities.Callback5, xl0, CameraView.CameraViewDelegate {
    public final int f42696a;
    public final Object f42697b;
    public final Object f42698c;

    public m(int i10, Object obj, Object obj2) {
        this.f42696a = i10;
        this.f42697b = obj;
        this.f42698c = obj2;
    }

    @Override
    public boolean D() {
        switch (this.f42696a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K(ey eyVar) {
        switch (this.f42696a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        yh.m2 m2Var = (yh.m2) this.f42697b;
        is0 is0Var = m2Var.f50419a;
        m2Var.e.f2498l.remove((TL_stars.SavedStarGift) this.f42698c);
        m2Var.f(true);
        int i10 = m2Var.f50420b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            xc a02 = xc.a0(is0Var.f50517a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2)));
            O.f29653r = false;
            O.j();
        } else {
            qc O2 = xc.a0(is0Var.f50517a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f29653r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f33194x0.c(true);
        }
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f42697b;
        ((u2.j0) obj).e(aVar.f280b, (u2.f0) aVar.f281c, (u2.b0) this.f42698c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f42697b;
        l5.i iVar = (l5.i) this.f42698c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f46136b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15923c) {
                int size = aVar.f46136b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f46138a);
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
            long j11 = bVar.f46138a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.l c10 = bVar.f46140c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.c(fVar.f46141a, fVar.f46142b);
                }
                listIterator.set(new s5.b(j11, bVar.f46139b, c10.h()));
            }
        }
        return d;
    }

    @Override
    public int b(Object obj) {
        Context context = (Context) this.f42697b;
        b2.w wVar = (b2.w) this.f42698c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f44980b;
        if ((!str.equals(wVar.f4132s) && !str.equals(r2.w.c(wVar))) || !oVar.c(context, wVar, false) || !oVar.d(wVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void c(int i10) {
        switch (this.f42696a) {
            case 15:
                ug.u uVar = (ug.u) this.f42697b;
                ug.u uVar2 = (ug.u) this.f42698c;
                if (i10 == 1) {
                    uVar.run(null);
                    return;
                } else if (i10 != 3) {
                    uVar2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f42697b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f42698c;
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
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2914a;
        ((IStartCarApp) this.f42697b).startCarApp((Intent) this.f42698c);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        g4.R((g4) this.f42697b, (f4) this.f42698c, i10);
    }

    @Override
    public c3.o[] e(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f42697b;
        b2.w wVar = (b2.w) this.f42698c;
        if (pVar.f47451c.a0(wVar)) {
            aVar = new z3.h(pVar.f47451c.y(wVar), null);
        } else {
            aVar = new k3.a(wVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42696a) {
            case 0:
                p.Y((p) this.f42697b, (HashSet) this.f42698c);
                return;
            case 1:
                a1 a1Var = (a1) this.f42697b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.M).getInputUser(a1Var.U);
                ConnectionsManager.getInstance(a1Var.M).sendRequest(allowsendmessage, new q2(a1Var, (String[]) this.f42698c, b2Var, 20));
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f42697b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f42698c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 9:
                sg.j0.R((sg.j0) this.f42697b, (ArrayList) this.f42698c);
                return;
            case 13:
                ((AtomicBoolean) this.f42697b).set(true);
                ((ug.s0) this.f42698c).run();
                return;
            case 14:
                ((ug.u) this.f42697b).run((TLRPC.TL_premiumGiftCodeOption) this.f42698c);
                return;
            case 21:
                yh.n nVar = (yh.n) this.f42697b;
                b6 b6Var = (b6) this.f42698c;
                try {
                    int parseInt = Integer.parseInt(b6Var.getText().toString().trim());
                    nVar.Y(parseInt);
                    nVar.f50433c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(b6Var);
                    FileLog.e(th2);
                    return;
                }
            default:
                yh.y1 y1Var = (yh.y1) this.f42697b;
                Utilities.Callback callback = (Utilities.Callback) this.f42698c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(y1Var);
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        ((qa.a) this.f42697b).h(bVar);
        ((qa.a) this.f42698c).h(bVar);
    }

    @Override
    public Object j() {
        switch (this.f42696a) {
            case 4:
                Iterable iterable = (Iterable) this.f42698c;
                s5.g gVar = (s5.g) ((s5.d) ((ea.b) this.f42697b).f8550c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ea.b bVar = (ea.b) this.f42697b;
                for (Map.Entry entry : ((HashMap) this.f42698c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f8553i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        String valueOf;
        String str = (String) this.f42697b;
        Context context = (Context) z5Var.a(Context.class);
        switch (((k2.f0) this.f42698c).f14684a) {
            case 5:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 6:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 7:
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
    public void onCameraInit() {
        zh.w wVar = (zh.w) this.f42697b;
        ((CameraView) this.f42698c).animate().alpha(1.0f).setDuration(180L).start();
        if (!wVar.Q && !wVar.f52164b0 && !wVar.f52170f0) {
            wVar.f52164b0 = true;
            wVar.f52162a0.postDelayed(wVar.f52185s0, 150L);
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.x1 x1Var = (rg.x1) this.f42697b;
        Bitmap bitmap = (Bitmap) this.f42698c;
        x1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(13, x1Var, bitmap), 2000L);
        } else {
            x1Var.C0 = true;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        p2 p2Var = (p2) this.f42697b;
        ei.d dVar = (ei.d) this.f42698c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        p2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((f61) obj).G).gift.f20503id;
        if (p2Var.f50506b == j10) {
            p2Var.f50506b = 0L;
        } else {
            p2Var.f50506b = j10;
        }
        if (p2Var.f50506b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof so0) {
                    so0 so0Var = (so0) childAt;
                    if (p2Var.f50506b == so0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    so0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        switch (this.f42696a) {
            case 17:
                ug.f0 f0Var = (ug.f0) this.f42697b;
                String str = (String) this.f42698c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    f0Var.f24922n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                eyVar.finishFragment();
                ug.i.h(j10);
                return true;
            default:
                vg.e eVar = (vg.e) this.f42697b;
                String str2 = (String) this.f42698c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                eyVar.finishFragment();
                ug.i.h(j11);
                return true;
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
