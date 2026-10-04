package rg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
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
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c61;
import org.telegram.ui.ep0;
import org.telegram.ui.og1;
import org.telegram.ui.oy;
import org.telegram.ui.ro0;
import org.telegram.ui.uy;
import org.telegram.ui.yf1;
import xh.g4;
import xh.h4;
import xh.o2;
import xh.r2;
import yh.j2;
import yh.x3;
public final class x implements org.telegram.ui.ActionBar.a2, s5.e, ro0, oy, c3.r, e2.h, androidx.car.app.utils.b, q9.d, j2, Utilities.Callback5, nl0, og1, c61 {
    public final int f46348a;
    public final Object f46349b;
    public final Object f46350c;

    public x(int i10, Object obj, Object obj2) {
        this.f46348a = i10;
        this.f46349b = obj;
        this.f46350c = obj2;
    }

    @Override
    public boolean A() {
        switch (this.f46348a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object E(cf.c cVar) {
        String valueOf;
        String str = (String) this.f46349b;
        Context context = (Context) cVar.a(Context.class);
        switch (((j2.e) this.f46350c).f13651a) {
            case 13:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 14:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 15:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
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
                break;
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
    public boolean H(uy uyVar) {
        switch (this.f46348a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f46348a) {
            case 4:
                tg.v vVar = (tg.v) this.f46349b;
                tg.v vVar2 = (tg.v) this.f46350c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f46349b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f46350c;
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
        a5.a aVar = (a5.a) this.f46349b;
        ((u2.k0) obj).d(aVar.f299b, (u2.f0) aVar.f300c, (u2.b0) this.f46350c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f46349b;
        l5.i iVar = (l5.i) this.f46350c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f46714b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15347c) {
                int size = aVar.f46714b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f46717a);
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
            long j10 = bVar.f46717a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f46719c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f46720a, fVar.f46721b);
                }
                listIterator.set(new s5.b(j10, bVar.f46718b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.f46349b;
        fs0 fs0Var = o2Var.f50143a;
        o2Var.f50146e.f51527l.remove((TL_stars.SavedStarGift) this.f46350c);
        o2Var.f(true);
        int i10 = o2Var.f50144b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            yc a02 = yc.a0(fs0Var.f50216a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            rc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2)));
            O.f30346r = false;
            O.j();
        } else {
            rc O2 = yc.a0(fs0Var.f50216a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f30346r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33811x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h4.O((h4) this.f46349b, (g4) this.f46350c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2319a;
        ((IStartCarApp) this.f46349b).startCarApp((Intent) this.f46350c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f46349b;
        b2.s sVar = (b2.s) this.f46350c;
        if (pVar.f47355c.V(sVar)) {
            aVar = new z3.i(pVar.f47355c.x(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f46348a) {
            case 0:
                k0.O((k0) this.f46349b, (ArrayList) this.f46350c);
                return;
            case 2:
                ((AtomicBoolean) this.f46349b).set(true);
                ((tg.t0) this.f46350c).run();
                return;
            case 3:
                ((tg.v) this.f46349b).run((TLRPC.TL_premiumGiftCodeOption) this.f46350c);
                return;
            case 12:
                xh.m mVar = (xh.m) this.f46349b;
                c6 c6Var = (c6) this.f46350c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.W(parseInt);
                    mVar.f50077c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 13:
                xh.a2 a2Var = (xh.a2) this.f46349b;
                Utilities.Callback callback = (Utilities.Callback) this.f46350c;
                String obj = a2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(a2Var);
                return;
            default:
                x3 x3Var = (x3) this.f46349b;
                nf.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x xVar = new x(19, x3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f34563b0 = xVar;
                twoStepVerificationActivity.f34561a0 = x3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new tg.q(x3Var, (tg.m1[]) this.f46350c, g10, twoStepVerificationActivity));
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46348a) {
            case 17:
                ((yh.g) this.f46349b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46350c);
                return;
            default:
                ((x3) this.f46349b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46350c);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        r2 r2Var = (r2) this.f46349b;
        ci.d dVar = (ci.d) this.f46350c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((g61) obj).G).gift.f20264id;
        if (r2Var.f50206b == j3) {
            r2Var.f50206b = 0L;
        } else {
            r2Var.f50206b = j3;
        }
        if (r2Var.f50206b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ep0) {
                    ep0 ep0Var = (ep0) childAt;
                    if (r2Var.f50206b == ep0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ep0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        switch (this.f46348a) {
            case 6:
                tg.g0 g0Var = (tg.g0) this.f46349b;
                String str = (String) this.f46350c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.f25303n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uyVar.finishFragment();
                tg.i.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f46349b;
                String str2 = (String) this.f46350c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f47649e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                uyVar.finishFragment();
                tg.i.h(j10);
                return true;
        }
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
