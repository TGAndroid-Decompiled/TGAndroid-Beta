package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wf0 extends org.telegram.ui.Components.hw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f39257t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.nj0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.kj0 N;
    public final org.telegram.ui.Components.kj0 O;
    public final org.telegram.ui.Components.kj0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.kj0 f39258a;
    public double f39259a0;
    public String f39260b;
    public double f39261b0;
    public String f39262c;
    public boolean f39263c0;
    public String d;
    public boolean f39264d0;
    public String e;
    public String f39265e0;
    public final bs f39266f;
    public final int f39267f0;
    public int f39268g0;
    public final org.telegram.ui.Components.voip.o2 h;
    public int f39269h0;
    public boolean f39270i0;
    public String f39271j0;
    public String f39272k0;
    public String f39273l0;
    public int m0;
    public final TextView f39274n;
    public String f39275n0;
    public Bundle f39276o0;
    public TLRPC.TL_auth_sentCode f39277p0;
    public boolean f39278q0;
    public final TextView f39279r;
    public final jf0 f39280r0;
    public final org.telegram.ui.Components.nj0 f39281s;
    public final tg0 f39282s0;
    public final uf0 v;
    public final ce0 f39283w;
    public final uf0 f39284x;
    public final FrameLayout f39285y;

    public wf0(org.telegram.ui.tg0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf0.<init>(org.telegram.ui.tg0, android.content.Context, int):void");
    }

    public static void o(wf0 wf0Var, Context context) {
        String str;
        String str2;
        String str3;
        List<SubscriptionInfo> list;
        CharSequence carrierName;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str4 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (wf0Var.f39282s0.e) {
                str = " #paidauth";
            } else {
                str = "";
            }
            sb2.append(str);
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(i10);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(wf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(wf0Var.getContext());
                    if (i10 >= 30) {
                        list = from.getCompleteActiveSubscriptionInfoList();
                    } else {
                        list = null;
                    }
                    if ((list == null || list.isEmpty()) && i10 >= 28) {
                        list = from.getAccessibleSubscriptionInfoList();
                    }
                    if (list == null || list.isEmpty()) {
                        list = from.getActiveSubscriptionInfoList();
                    }
                    if (list != null) {
                        for (SubscriptionInfo subscriptionInfo : list) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str5 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb3.append(str5);
                                sb3.append(".Phone: ");
                                sb3.append(number);
                                sb3.append("\n");
                                sb3.append(str5);
                                sb3.append(".MCC: ");
                                sb3.append(subscriptionInfo.getMcc());
                                sb3.append("\n");
                                sb3.append(str5);
                                sb3.append(".MNC: ");
                                sb3.append(subscriptionInfo.getMnc());
                                sb3.append("\n");
                                sb3.append(str5);
                                sb3.append(".Carrier: ");
                                if (TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                                    carrierName = "unknown";
                                } else {
                                    carrierName = subscriptionInfo.getCarrierName();
                                }
                                sb3.append(carrierName);
                                sb3.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb3.append("SIM0.Phone: ");
                            sb3.append(line1Number);
                            sb3.append("\n");
                            sb3.append("SIM0.MCC: unknown\n");
                            sb3.append("SIM0.MNC: unknown\n");
                            sb3.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb3.append("Signal: ");
                        sb3.append(signalStrength.getLevel());
                        sb3.append("/4\n");
                    } else {
                        sb3.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            sb3.append(AndroidUtilities.isWifiEnabled(context));
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            sb3.append(AndroidUtilities.isInAirplaneMode(context));
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(BuildVars.APP_ID);
            sb3.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 != 1 && i11 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str2 = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str2 = "huawei";
                } else {
                    str2 = "universal";
                }
            } else {
                str2 = "store";
            }
            sb3.append("App version: ");
            sb3.append(str4);
            sb3.append(" ");
            sb3.append(str2);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            if (wf0Var.f39282s0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(wf0Var.f39265e0)) {
                sb3.append("Error: ");
                sb3.append(wf0Var.f39265e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            wf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            wf0Var.f39282s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.kj0 kj0Var) {
        if (kj0Var != null) {
            kj0Var.Q(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            kj0Var.Q(org.telegram.ui.ActionBar.i6.w0(null, i10, false), "Phone");
            kj0Var.Q(org.telegram.ui.ActionBar.i6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        uf0 uf0Var = this.f39284x;
        if (uf0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (uf0Var.getAlpha() != f7) {
                uf0Var.animate().cancel();
                uf0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.kj0 kj0Var = this.N;
        if (kj0Var != null) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            org.telegram.ui.Components.kj0 kj0Var2 = this.f39258a;
            if (kj0Var2.f25746a0 != kj0Var2.e[0] - 1) {
                kj0Var2.f25770t0 = new pf0(this, i10, 0);
                return;
            }
            kj0Var.f25770t0 = new jf0(this, 3);
            org.telegram.ui.Components.nj0 nj0Var = this.f39281s;
            nj0Var.setAutoRepeat(false);
            kj0Var.N(0, false, false);
            nj0Var.setAnimation(kj0Var);
            nj0Var.d();
            return;
        }
        this.f39282s0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f39267f0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        int i10;
        tg0 tg0Var = this.f39282s0;
        if (tg0Var.F != 0) {
            tg0Var.finishFragment();
            return false;
        }
        int i11 = this.f39269h0;
        if (i11 != 0) {
            tg0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f39260b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new lf0(this, 0));
            tg0Var.showDialog(c2Var);
            return false;
        } else {
            this.f39264d0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39262c;
            i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ai.u7(17), 10);
            w();
            v();
            this.H = null;
            int i12 = this.f39267f0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f39263c0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f39264d0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f39263c0) {
            bs bsVar = this.f39266f;
            if (bsVar.f32431f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    bsVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f39271j0, str)) {
                        if (!this.f39271j0.equals("*")) {
                            this.f39273l0 = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        h(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.f39267f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f39263c0 = false;
        w();
        v();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f39270i0 = false;
        this.f39264d0 = false;
        if (this.f39269h0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.V);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f39267f0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f39260b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        tg0 tg0Var = this.f39282s0;
        int i13 = tg0Var.f37784a;
        if (i13 == 11) {
            if (this.f39264d0) {
                return;
            }
        } else if (!this.f39264d0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        bs bsVar = this.f39266f;
        if (str == null) {
            str = bsVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            tg0.U0(tg0Var, bsVar, false);
            return;
        }
        int i15 = tg0Var.f37784a;
        if (i15 < 1 || i15 > 4 || !bsVar.e) {
            this.f39264d0 = true;
            int i16 = this.f39267f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f39263c0 = false;
            int i17 = tg0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39262c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    bsVar.e = true;
                    ds[] dsVarArr = bsVar.f32431f;
                    int length = dsVarArr.length;
                    while (i14 < length) {
                        dsVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new kf0(this, tL_auth_signIn, 0), 10));
                    tg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39262c;
                w();
                bsVar.e = true;
                ds[] dsVarArr2 = bsVar.f32431f;
                int length2 = dsVarArr2.length;
                while (i14 < length2) {
                    dsVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                tg0Var.v1(true, true);
                return;
            }
            this.d = tg0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39262c;
            w();
            bsVar.e = true;
            ds[] dsVarArr3 = bsVar.f32431f;
            int length3 = dsVarArr3.length;
            while (i14 < length3) {
                dsVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new yb0(3, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.kj0 kj0Var = this.f39258a;
        if (kj0Var != null) {
            kj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new jf0(this, 0), tg0.f37783t0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f39267f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39273l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            bs bsVar = this.f39266f;
            if (bsVar.f32431f != null) {
                bsVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.V = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.T = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39266f.getCode();
        int length = code.length();
        int i10 = this.f39267f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f39273l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(hg.k0.h(i10, "smsview_params_"), this.H);
        }
        int i11 = this.V;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.T;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f39282s0.i1()) {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        TextView textView = this.f39274n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        this.f39279r.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = this.f39267f0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.i6.f19442y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19203l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        }
        r(this.f39258a);
        r(this.N);
        r(this.O);
        r(this.P);
        bs bsVar = this.f39266f;
        if (bsVar != null) {
            bsVar.invalidate();
        }
        uf0 uf0Var = this.v;
        Integer num = (Integer) uf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.i6.D6);
        }
        uf0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f39284x.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ds[] dsVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        bs bsVar = this.f39266f;
        if (bsVar != null && (dsVarArr = bsVar.f32431f) != null) {
            for (ds dsVar : dsVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dsVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39280r0);
    }

    public final void q(Runnable runnable) {
        if (this.f39267f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            bs bsVar = this.f39266f;
            ds[] dsVarArr = bsVar.f32431f;
            if (i10 < dsVarArr.length) {
                bsVar.postDelayed(new pf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                bsVar.postDelayed(new ea0(21, this, runnable), (dsVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void s() {
        if (this.S != null) {
            return;
        }
        this.W = 15000;
        int i10 = this.V;
        if (i10 > 15000) {
            this.W = i10;
        }
        this.S = new Timer();
        this.f39261b0 = System.currentTimeMillis();
        this.S.schedule(new ci.o2(this, 3), 0L, 1000L);
    }

    public final void u() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.D6;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        uf0 uf0Var = this.v;
        uf0Var.setTextColor(w02);
        uf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new vf0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.U) {
                Timer timer = this.S;
                if (timer != null) {
                    timer.cancel();
                    this.S = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void w() {
        uf0 uf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.i6.D6;
        uf0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.U) {
                Timer timer = this.R;
                if (timer != null) {
                    timer.cancel();
                    this.R = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x() {
        int i10;
        if (!this.f39264d0 && !this.f39270i0) {
            tg0 tg0Var = this.f39282s0;
            if (!tg0Var.f37802o0) {
                this.f39270i0 = true;
                this.v.invalidate();
                this.f39284x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39260b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39267f0);
                this.f39264d0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39262c;
                i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new of0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f7;
        bs bsVar = this.f39266f;
        try {
            bsVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            ds[] dsVarArr = bsVar.f32431f;
            if (i10 >= dsVarArr.length) {
                break;
            }
            dsVarArr[i10].setText("");
            bsVar.f32431f[i10].i(1.0f);
            i10++;
        }
        ce0 ce0Var = this.f39283w;
        if (ce0Var.getCurrentView() != this.E) {
            ce0Var.showNext();
        }
        bsVar.f32431f[0].requestFocus();
        if (this.f39267f0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(bsVar, f7, new jf0(this, 7));
        jf0 jf0Var = this.f39280r0;
        removeCallbacks(jf0Var);
        postDelayed(jf0Var, 5000L);
        this.f39278q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N != null) {
            if (!this.Q) {
                return;
            }
            this.Q = false;
            this.f39281s.setAutoRepeat(false);
            org.telegram.ui.Components.kj0 kj0Var = this.O;
            kj0Var.K(0);
            kj0Var.S(kj0Var.e[0] - 1, new jf0(this, 1));
            return;
        }
        this.f39282s0.k1(z10, true);
    }
}
