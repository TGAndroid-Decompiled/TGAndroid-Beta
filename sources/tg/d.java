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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.h61;
import org.telegram.ui.ip0;
import org.telegram.ui.oy;
import org.telegram.ui.ug1;
import org.telegram.ui.uy;
import org.telegram.ui.vo0;
import xh.f4;
import xh.g4;
import xh.n2;
import xh.q2;
import xh.z1;
import yh.l2;
import yh.z3;
public final class d implements a2, vo0, oy, c3.r, androidx.car.app.utils.b, q9.d, l2, Utilities.Callback5, al0, ug1, h61 {
    public final int f43116a;
    public final Object f43117b;
    public final Object f43118c;

    public d(int i10, Object obj, Object obj2) {
        this.f43116a = i10;
        this.f43117b = obj;
        this.f43118c = obj2;
    }

    @Override
    public boolean A() {
        switch (this.f43116a) {
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object G(cf.c cVar) {
        String valueOf;
        String str = (String) this.f43117b;
        Context context = (Context) cVar.a(Context.class);
        switch (((j2.e) this.f43118c).f12573a) {
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
    public boolean K(uy uyVar) {
        switch (this.f43116a) {
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f43116a) {
            case 2:
                w wVar = (w) this.f43117b;
                w wVar2 = (w) this.f43118c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f43117b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f43118c;
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
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        n2 n2Var = (n2) this.f43117b;
        nr0 nr0Var = n2Var.f46030a;
        n2Var.e.f47406l.remove((TL_stars.SavedStarGift) this.f43118c);
        n2Var.f(true);
        int i10 = n2Var.f46031b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            vc a02 = vc.a0(nr0Var.f46101a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            oc O = a02.O(document, string, LocaleController.formatString(i11, hg.c.k(tL_starGiftUnique.num, ',', sb2)));
            O.f26759r = false;
            O.j();
        } else {
            oc O2 = vc.a0(nr0Var.f46101a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f26759r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f30855x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.f43117b, (f4) this.f43118c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2142a;
        ((IStartCarApp) this.f43117b).startCarApp((Intent) this.f43118c);
    }

    @Override
    public c3.o[] d(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f43117b;
        b2.s sVar = (b2.s) this.f43118c;
        if (pVar.f43458c.W(sVar)) {
            aVar = new z3.i(pVar.f43458c.x(sVar), null);
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
        switch (this.f43116a) {
            case 14:
                ((yh.g) this.f43117b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43118c);
                return;
            default:
                ((z3) this.f43117b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43118c);
                return;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f43116a) {
            case 0:
                ((AtomicBoolean) this.f43117b).set(true);
                ((u0) this.f43118c).run();
                return;
            case 1:
                ((w) this.f43117b).run((TLRPC.TL_premiumGiftCodeOption) this.f43118c);
                return;
            case 9:
                xh.m mVar = (xh.m) this.f43117b;
                c6 c6Var = (c6) this.f43118c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f45982c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 10:
                z1 z1Var = (z1) this.f43117b;
                Utilities.Callback callback = (Utilities.Callback) this.f43118c;
                String obj = z1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(z1Var);
                return;
            default:
                z3 z3Var = (z3) this.f43117b;
                nf.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(16, z3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f31588b0 = dVar;
                twoStepVerificationActivity.f31586a0 = z3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new w9.v(z3Var, (n1[]) this.f43118c, g10, twoStepVerificationActivity, 11));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        q2 q2Var = (q2) this.f43117b;
        ci.d dVar = (ci.d) this.f43118c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        q2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((i51) obj).G).gift.f18334id;
        if (q2Var.f46092b == j3) {
            q2Var.f46092b = 0L;
        } else {
            q2Var.f46092b = j3;
        }
        if (q2Var.f46092b != 0) {
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
                    if (q2Var.f46092b == ip0Var.getGiftId()) {
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
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.f43116a) {
            case 4:
                h0 h0Var = (h0) this.f43117b;
                String str = (String) this.f43118c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.f30525n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uyVar.finishFragment();
                k.h(j3);
                return true;
            default:
                ug.e eVar = (ug.e) this.f43117b;
                String str2 = (String) this.f43118c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                uyVar.finishFragment();
                k.h(j10);
                return true;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
