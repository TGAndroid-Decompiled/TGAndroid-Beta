package qg;

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
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fg1;
import org.telegram.ui.ip0;
import org.telegram.ui.k61;
import org.telegram.ui.ny;
import org.telegram.ui.ty;
import org.telegram.ui.uo0;
import org.telegram.ui.vg1;
import xh.g4;
import xh.h4;
import yh.s3;
public final class x1 implements OnFailureListener, t5.b, org.telegram.ui.ActionBar.a2, s5.e, uo0, ny, c3.r, e2.h, androidx.car.app.utils.b, q9.d, yh.g2, Utilities.Callback5, fm0, vg1, k61 {
    public final int f46618a;
    public final Object f46619b;
    public final Object f46620c;

    public x1(int i10, Object obj, Object obj2) {
        this.f46618a = i10;
        this.f46619b = obj;
        this.f46620c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f46618a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K(ty tyVar) {
        switch (this.f46618a) {
            case 9:
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
        switch (this.f46618a) {
            case 7:
                tg.v vVar = (tg.v) this.f46619b;
                tg.v vVar2 = (tg.v) this.f46620c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f46619b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f46620c;
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
        a5.a aVar = (a5.a) this.f46619b;
        ((u2.j0) obj).d(aVar.f299b, (u2.f0) aVar.f300c, (u2.b0) this.f46620c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f46619b;
        l5.i iVar = (l5.i) this.f46620c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f47833b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15413c) {
                int size = aVar.f47833b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f47836a);
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
            long j10 = bVar.f47836a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f47838c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f47839a, fVar.f47840b);
                }
                listIterator.set(new s5.b(j10, bVar.f47837b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        xh.o2 o2Var = (xh.o2) this.f46619b;
        rs0 rs0Var = o2Var.f51433a;
        o2Var.f51436e.f52440l.remove((TL_stars.SavedStarGift) this.f46620c);
        o2Var.f(true);
        int i10 = o2Var.f51434b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            ad a02 = ad.a0(rs0Var.f51509a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            tc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2)));
            O.f31138r = false;
            O.j();
        } else {
            tc O2 = ad.a0(rs0Var.f51509a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f31138r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33821x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h4.R((h4) this.f46619b, (g4) this.f46620c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2398a;
        ((IStartCarApp) this.f46619b).startCarApp((Intent) this.f46620c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f46619b;
        b2.s sVar = (b2.s) this.f46620c;
        if (pVar.f48679c.D1(sVar)) {
            aVar = new z3.h(pVar.f48679c.s0(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46618a) {
            case 20:
                ((yh.g) this.f46619b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46620c);
                return;
            default:
                ((s3) this.f46619b).N1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46620c);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f46618a) {
            case 3:
                rg.j0.R((rg.j0) this.f46619b, (ArrayList) this.f46620c);
                return;
            case 5:
                ((AtomicBoolean) this.f46619b).set(true);
                ((tg.t0) this.f46620c).run();
                return;
            case 6:
                ((tg.v) this.f46619b).run((TLRPC.TL_premiumGiftCodeOption) this.f46620c);
                return;
            case 15:
                xh.o oVar = (xh.o) this.f46619b;
                c6 c6Var = (c6) this.f46620c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    oVar.Y(parseInt);
                    oVar.f51400c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 16:
                xh.a2 a2Var = (xh.a2) this.f46619b;
                Utilities.Callback callback = (Utilities.Callback) this.f46620c;
                String obj = a2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(a2Var);
                return;
            default:
                s3 s3Var = (s3) this.f46619b;
                of.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x1 x1Var = new x1(22, s3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f34573b0 = x1Var;
                twoStepVerificationActivity.f34571a0 = s3Var.D1();
                g10.d();
                twoStepVerificationActivity.s0(new tg.q(s3Var, (tg.m1[]) this.f46620c, g10, twoStepVerificationActivity, 16));
                return;
        }
    }

    @Override
    public Object i() {
        switch (this.f46618a) {
            case 1:
                Iterable iterable = (Iterable) this.f46620c;
                s5.g gVar = (s5.g) ((s5.d) ((da.c) this.f46619b).f8234c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.c cVar = (da.c) this.f46619b;
                for (Map.Entry entry : ((HashMap) this.f46620c).entrySet()) {
                    ((s5.g) ((s5.c) cVar.f8238i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        y1 y1Var = (y1) this.f46619b;
        Bitmap bitmap = (Bitmap) this.f46620c;
        y1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && y1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(9, y1Var, bitmap), 2000L);
        } else {
            y1Var.C0 = true;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        xh.r2 r2Var = (xh.r2) this.f46619b;
        ci.d dVar = (ci.d) this.f46620c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((p61) obj).G).gift.f20265id;
        if (r2Var.f51497b == j3) {
            r2Var.f51497b = 0L;
        } else {
            r2Var.f51497b = j3;
        }
        if (r2Var.f51497b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ip0) {
                    ip0 ip0Var = (ip0) childAt;
                    if (r2Var.f51497b == ip0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ip0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        switch (this.f46618a) {
            case 9:
                tg.g0 g0Var = (tg.g0) this.f46619b;
                String str = (String) this.f46620c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.f26025n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                tyVar.finishFragment();
                tg.i.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f46619b;
                String str2 = (String) this.f46620c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f48921e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                tyVar.finishFragment();
                tg.i.h(j10);
                return true;
        }
    }

    @Override
    public Object y0(u5 u5Var) {
        String valueOf;
        String str = (String) this.f46619b;
        Context context = (Context) u5Var.a(Context.class);
        switch (((j2.e) this.f46620c).f13689a) {
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
