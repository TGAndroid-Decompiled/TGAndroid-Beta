package tg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.Map;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.ly;
import org.telegram.ui.mg1;
import org.telegram.ui.po0;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
import org.telegram.ui.z51;
import xh.g4;
import xh.h4;
import xh.o2;
import xh.r2;
import yh.k2;
import yh.y3;
public final class d implements a2, po0, ly, c3.r, e2.h, androidx.car.app.utils.b, q9.d, k2, Utilities.Callback5, bl0, mg1, z51 {
    public final int f43071a;
    public final Object f43072b;
    public final Object f43073c;

    public d(int i10, Object obj, Object obj2) {
        this.f43071a = i10;
        this.f43072b = obj;
        this.f43073c = obj2;
    }

    @Override
    public boolean A() {
        switch (this.f43071a) {
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        String valueOf;
        String str = (String) this.f43072b;
        Context context = (Context) cVar.a(Context.class);
        switch (((j2.e) this.f43073c).f12563a) {
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
    public boolean K(ry ryVar) {
        switch (this.f43071a) {
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f43071a) {
            case 2:
                w wVar = (w) this.f43072b;
                w wVar2 = (w) this.f43073c;
                if (i10 == 1) {
                    wVar.run(null);
                    return;
                } else if (i10 != 3) {
                    wVar2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f43072b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f43073c;
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
        a5.a aVar = (a5.a) this.f43072b;
        ((u2.j0) obj).d(aVar.f277b, (u2.f0) aVar.f278c, (u2.b0) this.f43073c);
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.f43072b;
        nr0 nr0Var = o2Var.f45999a;
        o2Var.e.f47337l.remove((TL_stars.SavedStarGift) this.f43073c);
        o2Var.f(true);
        int i10 = o2Var.f46000b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            xc a02 = xc.a0(nr0Var.f46068a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, hg.c.k(tL_starGiftUnique.num, ',', sb2)));
            O.f27314r = false;
            O.j();
        } else {
            qc O2 = xc.a0(nr0Var.f46068a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f27314r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f30829x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h4.Q((h4) this.f43072b, (g4) this.f43073c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2137a;
        ((IStartCarApp) this.f43072b).startCarApp((Intent) this.f43073c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f43072b;
        b2.s sVar = (b2.s) this.f43073c;
        if (pVar.f43391c.W(sVar)) {
            aVar = new z3.h(pVar.f43391c.x(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43071a) {
            case 15:
                ((yh.g) this.f43072b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43073c);
                return;
            default:
                ((y3) this.f43072b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43073c);
                return;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f43071a) {
            case 0:
                ((AtomicBoolean) this.f43072b).set(true);
                ((u0) this.f43073c).run();
                return;
            case 1:
                ((w) this.f43072b).run((TLRPC.TL_premiumGiftCodeOption) this.f43073c);
                return;
            case 10:
                xh.m mVar = (xh.m) this.f43072b;
                c6 c6Var = (c6) this.f43073c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f45934c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 11:
                xh.a2 a2Var = (xh.a2) this.f43072b;
                Utilities.Callback callback = (Utilities.Callback) this.f43073c;
                String obj = a2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(a2Var);
                return;
            default:
                y3 y3Var = (y3) this.f43072b;
                nf.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(17, y3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f31562b0 = dVar;
                twoStepVerificationActivity.f31560a0 = y3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new w9.v(y3Var, (n1[]) this.f43073c, g10, twoStepVerificationActivity, 11));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        r2 r2Var = (r2) this.f43072b;
        ci.d dVar = (ci.d) this.f43073c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.f18308id;
        if (r2Var.f46059b == j3) {
            r2Var.f46059b = 0L;
        } else {
            r2Var.f46059b = j3;
        }
        if (r2Var.f46059b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof cp0) {
                    cp0 cp0Var = (cp0) childAt;
                    if (r2Var.f46059b == cp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        switch (this.f43071a) {
            case 4:
                h0 h0Var = (h0) this.f43072b;
                String str = (String) this.f43073c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.f22661n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                ryVar.finishFragment();
                k.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f43072b;
                String str2 = (String) this.f43073c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                ryVar.finishFragment();
                k.h(j10);
                return true;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
