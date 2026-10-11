package q9;

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
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import ci.u5;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.hp0;
import org.telegram.ui.j61;
import org.telegram.ui.my;
import org.telegram.ui.sy;
import org.telegram.ui.to0;
import org.telegram.ui.ug1;
import org.telegram.ui.web.f2;
import qg.x1;
import tg.m1;
import tg.s0;
import tg.u;
import u2.b0;
import u2.f0;
import u2.j0;
import xh.g4;
import xh.h4;
import xh.o2;
import xh.r2;
import yh.g2;
import yh.s3;
public final class p implements pa.a, OnFailureListener, t5.b, z1, s5.e, to0, my, c3.r, e2.h, androidx.car.app.utils.b, d, g2, Utilities.Callback5, gm0, ug1, j61 {
    public final int f46147a;
    public final Object f46148b;
    public final Object f46149c;

    public p(int i10, Object obj, Object obj2) {
        this.f46147a = i10;
        this.f46148b = obj;
        this.f46149c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f46147a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K(sy syVar) {
        switch (this.f46147a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f46147a) {
            case 8:
                u uVar = (u) this.f46148b;
                u uVar2 = (u) this.f46149c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f46148b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f46149c;
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
        a5.a aVar = (a5.a) this.f46148b;
        ((j0) obj).d(aVar.f299b, (f0) aVar.f300c, (b0) this.f46149c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f46148b;
        l5.i iVar = (l5.i) this.f46149c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f47959b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15452c) {
                int size = aVar.f47959b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f47962a);
            if (i10 < d.size() - 1) {
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
            long j10 = bVar.f47962a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f47964c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f47965a, fVar.f47966b);
                }
                listIterator.set(new s5.b(j10, bVar.f47963b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.f46148b;
        ss0 ss0Var = o2Var.f51556a;
        o2Var.f51559e.f52640l.remove((TL_stars.SavedStarGift) this.f46149c);
        o2Var.f(true);
        int i10 = o2Var.f51557b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            ad a02 = ad.a0(ss0Var.f51632a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            sc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2)));
            O.f30841r = false;
            O.j();
        } else {
            sc O2 = ad.a0(ss0Var.f51632a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f30841r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33883x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h4.R((h4) this.f46148b, (g4) this.f46149c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2398a;
        ((IStartCarApp) this.f46148b).startCarApp((Intent) this.f46149c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f46148b;
        b2.s sVar = (b2.s) this.f46149c;
        if (pVar.f48783c.D1(sVar)) {
            aVar = new z3.h(pVar.f48783c.s0(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46147a) {
            case 21:
                ((yh.g) this.f46148b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46149c);
                return;
            default:
                ((s3) this.f46148b).N1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46149c);
                return;
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f46147a) {
            case 4:
                rg.j0.R((rg.j0) this.f46148b, (ArrayList) this.f46149c);
                return;
            case 6:
                ((AtomicBoolean) this.f46148b).set(true);
                ((s0) this.f46149c).run();
                return;
            case 7:
                ((u) this.f46148b).run((TLRPC.TL_premiumGiftCodeOption) this.f46149c);
                return;
            case 16:
                xh.o oVar = (xh.o) this.f46148b;
                c6 c6Var = (c6) this.f46149c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    oVar.Y(parseInt);
                    oVar.f51523c0.setValue(parseInt);
                    a2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 17:
                xh.a2 a2Var2 = (xh.a2) this.f46148b;
                Utilities.Callback callback = (Utilities.Callback) this.f46149c;
                String obj = a2Var2.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(a2Var2);
                return;
            default:
                s3 s3Var = (s3) this.f46148b;
                of.e g10 = a2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                p pVar = new p(23, s3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f34635b0 = pVar;
                twoStepVerificationActivity.f34633a0 = s3Var.D1();
                g10.d();
                twoStepVerificationActivity.s0(new pi.h(s3Var, (m1[]) this.f46149c, g10, twoStepVerificationActivity, 18));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((pa.a) this.f46148b).g(bVar);
        ((pa.a) this.f46149c).g(bVar);
    }

    @Override
    public Object i() {
        switch (this.f46147a) {
            case 2:
                Iterable iterable = (Iterable) this.f46149c;
                s5.g gVar = (s5.g) ((s5.d) ((da.c) this.f46148b).f8233c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.c cVar = (da.c) this.f46148b;
                for (Map.Entry entry : ((HashMap) this.f46149c).entrySet()) {
                    ((s5.g) ((s5.c) cVar.f8237i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        x1 x1Var = (x1) this.f46148b;
        Bitmap bitmap = (Bitmap) this.f46149c;
        x1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new f2(11, x1Var, bitmap), 2000L);
        } else {
            x1Var.C0 = true;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        r2 r2Var = (r2) this.f46148b;
        ci.d dVar = (ci.d) this.f46149c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((q61) obj).G).gift.f20295id;
        if (r2Var.f51620b == j3) {
            r2Var.f51620b = 0L;
        } else {
            r2Var.f51620b = j3;
        }
        if (r2Var.f51620b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof hp0) {
                    hp0 hp0Var = (hp0) childAt;
                    if (r2Var.f51620b == hp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.f46147a) {
            case 10:
                tg.f0 f0Var = (tg.f0) this.f46148b;
                String str = (String) this.f46149c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    f0Var.f25736n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                syVar.finishFragment();
                tg.i.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f46148b;
                String str2 = (String) this.f46149c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f49044e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                syVar.finishFragment();
                tg.i.h(j10);
                return true;
        }
    }

    @Override
    public Object y0(u5 u5Var) {
        String valueOf;
        String str = (String) this.f46148b;
        Context context = (Context) u5Var.a(Context.class);
        switch (((j2.e) this.f46149c).f13688a) {
            case 9:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 10:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 11:
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
        return new xa.a(str, valueOf);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
