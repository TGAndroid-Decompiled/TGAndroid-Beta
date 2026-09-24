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
public final class tf0 extends org.telegram.ui.Components.fw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f38056t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.lj0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.ij0 N;
    public final org.telegram.ui.Components.ij0 O;
    public final org.telegram.ui.Components.ij0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.ij0 f38057a;
    public double f38058a0;
    public String f38059b;
    public double f38060b0;
    public String f38061c;
    public boolean f38062c0;
    public String d;
    public boolean f38063d0;
    public String e;
    public String f38064e0;
    public final yr f38065f;
    public final int f38066f0;
    public int f38067g0;
    public final org.telegram.ui.Components.voip.o2 h;
    public int f38068h0;
    public boolean f38069i0;
    public String f38070j0;
    public String f38071k0;
    public String f38072l0;
    public int m0;
    public final TextView f38073n;
    public String f38074n0;
    public Bundle f38075o0;
    public TLRPC.TL_auth_sentCode f38076p0;
    public boolean f38077q0;
    public final TextView f38078r;
    public final gf0 f38079r0;
    public final org.telegram.ui.Components.lj0 f38080s;
    public final qg0 f38081s0;
    public final rf0 v;
    public final zd0 f38082w;
    public final rf0 f38083x;
    public final FrameLayout f38084y;

    public tf0(org.telegram.ui.qg0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tf0.<init>(org.telegram.ui.qg0, android.content.Context, int):void");
    }

    public static void o(tf0 tf0Var, Context context) {
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
            sb2.append(tf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (tf0Var.f38081s0.e) {
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
            sb3.append(tf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(tf0Var.getContext());
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
            if (tf0Var.f38081s0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(tf0Var.f38064e0)) {
                sb3.append("Error: ");
                sb3.append(tf0Var.f38064e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            tf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            tf0Var.f38081s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.ij0 ij0Var) {
        if (ij0Var != null) {
            ij0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            ij0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, i10, false), "Phone");
            ij0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        rf0 rf0Var = this.f38083x;
        if (rf0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (rf0Var.getAlpha() != f7) {
                rf0Var.animate().cancel();
                rf0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.ij0 ij0Var = this.N;
        if (ij0Var != null) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            org.telegram.ui.Components.ij0 ij0Var2 = this.f38057a;
            if (ij0Var2.f25042a0 != ij0Var2.e[0] - 1) {
                ij0Var2.f25066t0 = new mf0(this, i10, 0);
                return;
            }
            ij0Var.f25066t0 = new gf0(this, 3);
            org.telegram.ui.Components.lj0 lj0Var = this.f38080s;
            lj0Var.setAutoRepeat(false);
            ij0Var.N(0, false, false);
            lj0Var.setAnimation(ij0Var);
            lj0Var.d();
            return;
        }
        this.f38081s0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f38066f0 != 3) {
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
        qg0 qg0Var = this.f38081s0;
        if (qg0Var.F != 0) {
            qg0Var.finishFragment();
            return false;
        }
        int i11 = this.f38068h0;
        if (i11 != 0) {
            qg0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f38059b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new if0(this, 0));
            qg0Var.showDialog(a2Var);
            return false;
        } else {
            this.f38063d0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f38061c;
            i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ai.u7(17), 10);
            w();
            v();
            this.H = null;
            int i12 = this.f38066f0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f38062c0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f38063d0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f38062c0) {
            yr yrVar = this.f38065f;
            if (yrVar.f40221f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    yrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f38070j0, str)) {
                        if (!this.f38070j0.equals("*")) {
                            this.f38072l0 = str;
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
        int i10 = this.f38066f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f38062c0 = false;
        w();
        v();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f38069i0 = false;
        this.f38063d0 = false;
        if (this.f38068h0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.V);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f38066f0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f38059b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        qg0 qg0Var = this.f38081s0;
        int i13 = qg0Var.f36870a;
        if (i13 == 11) {
            if (this.f38063d0) {
                return;
            }
        } else if (!this.f38063d0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        yr yrVar = this.f38065f;
        if (str == null) {
            str = yrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            qg0.U0(qg0Var, yrVar, false);
            return;
        }
        int i15 = qg0Var.f36870a;
        if (i15 < 1 || i15 > 4 || !yrVar.e) {
            this.f38063d0 = true;
            int i16 = this.f38066f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f38062c0 = false;
            int i17 = qg0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f38061c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    yrVar.e = true;
                    as[] asVarArr = yrVar.f40221f;
                    int length = asVarArr.length;
                    while (i14 < length) {
                        asVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new hf0(this, tL_auth_signIn, 0), 10));
                    qg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f38061c;
                w();
                yrVar.e = true;
                as[] asVarArr2 = yrVar.f40221f;
                int length2 = asVarArr2.length;
                while (i14 < length2) {
                    asVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                qg0Var.v1(true, true);
                return;
            }
            this.d = qg0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f38061c;
            w();
            yrVar.e = true;
            as[] asVarArr3 = yrVar.f40221f;
            int length3 = asVarArr3.length;
            while (i14 < length3) {
                asVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new vb0(3, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ij0 ij0Var = this.f38057a;
        if (ij0Var != null) {
            ij0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new gf0(this, 0), qg0.f36869t0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f38066f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f38072l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            yr yrVar = this.f38065f;
            if (yrVar.f40221f != null) {
                yrVar.setText(string2);
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
        String code = this.f38065f.getCode();
        int length = code.length();
        int i10 = this.f38066f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f38072l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(hg.c.h(i10, "smsview_params_"), this.H);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f38081s0.i1()) {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        TextView textView = this.f38073n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        this.f38078r.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        int i12 = this.f38066f0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.h6.f19428y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19190l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        }
        r(this.f38057a);
        r(this.N);
        r(this.O);
        r(this.P);
        yr yrVar = this.f38065f;
        if (yrVar != null) {
            yrVar.invalidate();
        }
        rf0 rf0Var = this.v;
        Integer num = (Integer) rf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.h6.D6);
        }
        rf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f38083x.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        as[] asVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        yr yrVar = this.f38065f;
        if (yrVar != null && (asVarArr = yrVar.f40221f) != null) {
            for (as asVar : asVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                asVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38079r0);
    }

    public final void q(Runnable runnable) {
        if (this.f38066f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            yr yrVar = this.f38065f;
            as[] asVarArr = yrVar.f40221f;
            if (i10 < asVarArr.length) {
                yrVar.postDelayed(new mf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                yrVar.postDelayed(new m80(26, this, runnable), (asVarArr.length * 75) + 400);
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
        this.f38060b0 = System.currentTimeMillis();
        this.S.schedule(new ci.o2(this, 3), 0L, 1000L);
    }

    public final void u() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        rf0 rf0Var = this.v;
        rf0Var.setTextColor(w02);
        rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new sf0(this), 0L, 1000L);
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
        rf0 rf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        rf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
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
        if (!this.f38063d0 && !this.f38069i0) {
            qg0 qg0Var = this.f38081s0;
            if (!qg0Var.f36888o0) {
                this.f38069i0 = true;
                this.v.invalidate();
                this.f38083x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f38059b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f38066f0);
                this.f38063d0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f38061c;
                i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new lf0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f7;
        yr yrVar = this.f38065f;
        try {
            yrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            as[] asVarArr = yrVar.f40221f;
            if (i10 >= asVarArr.length) {
                break;
            }
            asVarArr[i10].setText("");
            yrVar.f40221f[i10].i(1.0f);
            i10++;
        }
        zd0 zd0Var = this.f38082w;
        if (zd0Var.getCurrentView() != this.E) {
            zd0Var.showNext();
        }
        yrVar.f40221f[0].requestFocus();
        if (this.f38066f0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(yrVar, f7, new gf0(this, 7));
        gf0 gf0Var = this.f38079r0;
        removeCallbacks(gf0Var);
        postDelayed(gf0Var, 5000L);
        this.f38077q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N != null) {
            if (!this.Q) {
                return;
            }
            this.Q = false;
            this.f38080s.setAutoRepeat(false);
            org.telegram.ui.Components.ij0 ij0Var = this.O;
            ij0Var.K(0);
            ij0Var.S(ij0Var.e[0] - 1, new gf0(this, 1));
            return;
        }
        this.f38081s0.k1(z10, true);
    }
}
