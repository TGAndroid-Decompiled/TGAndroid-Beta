package s5;

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
import b2.s;
import c3.o;
import c3.r;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.n;
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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.bp0;
import org.telegram.ui.ky;
import org.telegram.ui.mg1;
import org.telegram.ui.no0;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import tg.g0;
import tg.m1;
import tg.t0;
import tg.v;
import u2.b0;
import u2.f0;
import u2.k0;
import u2.p;
import xh.g4;
import xh.h4;
import xh.m;
import xh.o2;
import xh.r2;
import yh.j2;
import yh.x3;
public final class e implements f, z1, no0, ky, r, e2.h, androidx.car.app.utils.b, q9.d, j2, Utilities.Callback5, ll0, mg1, a61 {
    public final int f43122a;
    public final Object f43123b;
    public final Object f43124c;

    public e(int i10, Object obj, Object obj2) {
        this.f43122a = i10;
        this.f43123b = obj;
        this.f43124c = obj2;
    }

    @Override
    public boolean A() {
        switch (this.f43122a) {
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        String valueOf;
        String str = (String) this.f43123b;
        Context context = (Context) cVar.a(Context.class);
        switch (((j2.e) this.f43124c).f12563a) {
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
    public boolean K(qy qyVar) {
        switch (this.f43122a) {
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f43122a) {
            case 3:
                v vVar = (v) this.f43123b;
                v vVar2 = (v) this.f43124c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f43123b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f43124c;
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
        a5.a aVar = (a5.a) this.f43123b;
        ((k0) obj).d(aVar.f277b, (f0) aVar.f278c, (b0) this.f43124c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        h hVar = (h) this.f43123b;
        l5.i iVar = (l5.i) this.f43124c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.f43117b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f14106c) {
                int size = aVar.f43117b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((b) d.get(i10)).f43119a);
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
                set.add(new g(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            long j10 = bVar.f43119a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                n c10 = bVar.f43121c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(gVar.f43125a, gVar.f43126b);
                }
                listIterator.set(new b(j10, bVar.f43120b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.f43123b;
        zr0 zr0Var = o2Var.f46313a;
        o2Var.e.f47601l.remove((TL_stars.SavedStarGift) this.f43124c);
        o2Var.f(true);
        int i10 = o2Var.f46314b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            yc a02 = yc.a0(zr0Var.f46382a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2)));
            O.f27579r = false;
            O.j();
        } else {
            qc O2 = yc.a0(zr0Var.f46382a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f27579r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31130x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h4.Q((h4) this.f43123b, (g4) this.f43124c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2137a;
        ((IStartCarApp) this.f43123b).startCarApp((Intent) this.f43124c);
    }

    @Override
    public o[] d(Uri uri, Map map) {
        o aVar;
        p pVar = (p) this.f43123b;
        s sVar = (s) this.f43124c;
        if (pVar.f43730c.W(sVar)) {
            aVar = new z3.h(pVar.f43730c.x(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new o[]{aVar};
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43122a) {
            case 16:
                ((yh.g) this.f43123b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43124c);
                return;
            default:
                ((x3) this.f43123b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43124c);
                return;
        }
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f43122a) {
            case 1:
                ((AtomicBoolean) this.f43123b).set(true);
                ((t0) this.f43124c).run();
                return;
            case 2:
                ((v) this.f43123b).run((TLRPC.TL_premiumGiftCodeOption) this.f43124c);
                return;
            case 11:
                m mVar = (m) this.f43123b;
                c6 c6Var = (c6) this.f43124c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f46248c0.setValue(parseInt);
                    a2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 12:
                xh.a2 a2Var2 = (xh.a2) this.f43123b;
                Utilities.Callback callback = (Utilities.Callback) this.f43124c;
                String obj = a2Var2.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(a2Var2);
                return;
            default:
                x3 x3Var = (x3) this.f43123b;
                nf.e g10 = a2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                e eVar = new e(18, x3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f31863b0 = eVar;
                twoStepVerificationActivity.f31861a0 = x3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new tg.r(x3Var, (m1[]) this.f43124c, g10, twoStepVerificationActivity, 14));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        r2 r2Var = (r2) this.f43123b;
        ci.d dVar = (ci.d) this.f43124c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((v51) obj).G).gift.f18546id;
        if (r2Var.f46373b == j3) {
            r2Var.f46373b = 0L;
        } else {
            r2Var.f46373b = j3;
        }
        if (r2Var.f46373b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    if (r2Var.f46373b == bp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        switch (this.f43122a) {
            case 5:
                g0 g0Var = (g0) this.f43123b;
                String str = (String) this.f43124c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.f22949n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                qyVar.finishFragment();
                tg.i.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f43123b;
                String str2 = (String) this.f43124c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                qyVar.finishFragment();
                tg.i.h(j10);
                return true;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
