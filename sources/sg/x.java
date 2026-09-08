package sg;

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
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.jp0;
import org.telegram.ui.oy;
import org.telegram.ui.ug1;
import org.telegram.ui.uy;
import org.telegram.ui.wo0;
import yh.e4;
import yh.f4;
import yh.m2;
import yh.p2;
import zh.j2;
import zh.w3;
public final class x implements org.telegram.ui.ActionBar.a2, c3.r, wo0, oy, androidx.car.app.utils.d, q9.d, j2, Utilities.Callback5, al0, ug1 {
    public final int f46345a;
    public final Object f46346b;
    public final Object f46347c;

    public x(int i10, Object obj, Object obj2) {
        this.f46345a = i10;
        this.f46346b = obj;
        this.f46347c = obj2;
    }

    @Override
    public boolean B() {
        switch (this.f46345a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object D(cf.c cVar) {
        String valueOf;
        String str = (String) this.f46346b;
        Context context = (Context) cVar.a(Context.class);
        switch (((j2.e) this.f46347c).f13201a) {
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
        switch (this.f46345a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f46345a) {
            case 4:
                ug.w wVar = (ug.w) this.f46346b;
                ug.w wVar2 = (ug.w) this.f46347c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f46346b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f46347c;
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
        m2 m2Var = (m2) this.f46346b;
        nr0 nr0Var = m2Var.f50468a;
        m2Var.f50471e.f52132l.remove((TL_stars.SavedStarGift) this.f46347c);
        m2Var.f(true);
        int i10 = m2Var.f50469b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            yc a02 = yc.a0(nr0Var.f50544a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, i2.g.k(tL_starGiftUnique.num, ',', sb2)));
            O.f29714r = false;
            O.j();
        } else {
            qc O2 = yc.a0(nr0Var.f50544a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.f29714r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33494x0.c(true);
        }
    }

    @Override
    public c3.o[] c(Uri uri, Map map) {
        c3.o aVar;
        u2.p pVar = (u2.p) this.f46346b;
        b2.s sVar = (b2.s) this.f46347c;
        if (pVar.f46806c.i0(sVar)) {
            aVar = new z3.h(pVar.f46806c.v(sVar), null);
        } else {
            aVar = new k3.a(sVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f1148a;
        ((IStartCarApp) this.f46346b).startCarApp((Intent) this.f46347c);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        f4.Q((f4) this.f46346b, (e4) this.f46347c, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46345a) {
            case 15:
                ((zh.g) this.f46346b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46347c);
                return;
            default:
                ((w3) this.f46346b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f46347c);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f46345a) {
            case 0:
                k0.Q((k0) this.f46346b, (ArrayList) this.f46347c);
                return;
            case 2:
                ((AtomicBoolean) this.f46346b).set(true);
                ((ug.u0) this.f46347c).run();
                return;
            case 3:
                ((ug.w) this.f46346b).run((TLRPC.TL_premiumGiftCodeOption) this.f46347c);
                return;
            case 10:
                yh.m mVar = (yh.m) this.f46346b;
                b6 b6Var = (b6) this.f46347c;
                try {
                    int parseInt = Integer.parseInt(b6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f50435c0.setValue(parseInt);
                    b2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(b6Var);
                    FileLog.e(th2);
                    return;
                }
            case 11:
                yh.y1 y1Var = (yh.y1) this.f46346b;
                Utilities.Callback callback = (Utilities.Callback) this.f46347c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(y1Var);
                return;
            default:
                w3 w3Var = (w3) this.f46346b;
                of.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x xVar = new x(17, w3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.f34245b0 = xVar;
                twoStepVerificationActivity.f34243a0 = w3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new wh.n(w3Var, (ug.n1[]) this.f46347c, g10, twoStepVerificationActivity, 11));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        p2 p2Var = (p2) this.f46346b;
        di.d dVar = (di.d) this.f46347c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        p2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.f20124id;
        if (p2Var.f50532b == j3) {
            p2Var.f50532b = 0L;
        } else {
            p2Var.f50532b = j3;
        }
        if (p2Var.f50532b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof jp0) {
                    jp0 jp0Var = (jp0) childAt;
                    if (p2Var.f50532b == jp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.f46345a) {
            case 6:
                ug.h0 h0Var = (ug.h0) this.f46346b;
                String str = (String) this.f46347c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.f24676n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uyVar.finishFragment();
                ug.j.h(j3);
                return true;
            default:
                vg.e eVar = (vg.e) this.f46346b;
                String str2 = (String) this.f46347c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f47834e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                uyVar.finishFragment();
                ug.j.h(j10);
                return true;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
