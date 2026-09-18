package yh;

import ai.ga;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
public final class u4 implements Runnable {
    public final int f47879a = 1;
    public final v5 f47880b;
    public final TLObject f47881c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f47882f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f47883n;
    public final String f47884r;
    public final long f47885s;
    public final TLObject v;
    public final TLObject f47886w;

    public u4(v5 v5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47880b = v5Var;
        this.f47881c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f47882f = context;
        this.h = f6Var;
        this.f47883n = j3;
        this.f47884r = str;
        this.f47885s = j10;
        this.v = tLObject2;
        this.f47886w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        vc X;
        ib0 ib0Var;
        String str;
        vc X2;
        ib0 ib0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f47879a) {
            case 0:
                v5 v5Var = this.f47880b;
                TLObject tLObject = this.f47881c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f47882f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.f47883n;
                String str3 = this.f47884r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f47886w;
                long j10 = this.f47885s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = vc.a0(R);
                } else {
                    X = vc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(v5Var.f47923a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            v5.e0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        n7 n7Var = new n7(context, f6Var, j3, 6, str3, new ga(v5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        n7Var.setOnDismissListener(new w4(callback2, zArr, 2));
                        n7Var.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        int i10 = R.raw.error;
                        int i11 = R.string.UnknownErrorCode;
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        hg.k0.s(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new v4(v5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                v5Var.D = false;
                v5Var.E = true;
                v5Var.G = 0L;
                v5Var.V();
                v5Var.Q(j10);
                v5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v5Var.f47923a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(v5Var.f47923a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(v5Var.f47923a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (ib0Var = launchActivity.f30875x0) != null) {
                    ib0Var.c(true);
                    return;
                }
                return;
            default:
                v5 v5Var2 = this.f47880b;
                TLObject tLObject2 = this.f47881c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f47882f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.f47883n;
                String str4 = this.f47884r;
                long j12 = this.f47885s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f47886w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = vc.a0(R2);
                } else {
                    X2 = vc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(v5Var2.f47923a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            v5.e0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        n7 n7Var2 = new n7(context2, f6Var2, j11, 6, str4, new ga(v5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                        n7Var2.setOnDismissListener(new w4(callback22, zArr2, 1));
                        n7Var2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        int i12 = R.raw.error;
                        int i13 = R.string.UnknownErrorCode;
                        if (tL_error2 != null) {
                            str2 = tL_error2.text;
                        }
                        hg.k0.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new v4(v5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                v5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v5Var2.f47923a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(v5Var2.f47923a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(v5Var2.f47923a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (ib0Var2 = launchActivity2.f30875x0) != null) {
                    ib0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public u4(v5 v5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47880b = v5Var;
        this.f47881c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f47882f = context;
        this.h = f6Var;
        this.f47883n = j3;
        this.f47884r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f47886w = starGift;
        this.f47885s = j10;
    }
}
