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
public final class zf0 extends org.telegram.ui.Components.fw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f39280t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.kj0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.hj0 N;
    public final org.telegram.ui.Components.hj0 O;
    public final org.telegram.ui.Components.hj0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.hj0 f39281a;
    public double f39282a0;
    public String f39283b;
    public double f39284b0;
    public String f39285c;
    public boolean f39286c0;
    public String d;
    public boolean f39287d0;
    public String e;
    public String f39288e0;
    public final fs f39289f;
    public final int f39290f0;
    public int f39291g0;
    public final org.telegram.ui.Components.voip.m2 h;
    public int f39292h0;
    public boolean f39293i0;
    public String f39294j0;
    public String f39295k0;
    public String f39296l0;
    public int m0;
    public final TextView f39297n;
    public String f39298n0;
    public Bundle f39299o0;
    public TLRPC.TL_auth_sentCode f39300p0;
    public boolean f39301q0;
    public final TextView f39302r;
    public final mf0 f39303r0;
    public final org.telegram.ui.Components.kj0 f39304s;
    public final xg0 f39305s0;
    public final xf0 v;
    public final fe0 f39306w;
    public final xf0 f39307x;
    public final FrameLayout f39308y;

    public zf0(org.telegram.ui.xg0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zf0.<init>(org.telegram.ui.xg0, android.content.Context, int):void");
    }

    public static void o(zf0 zf0Var, Context context) {
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
            sb2.append(zf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (zf0Var.f39305s0.e) {
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
            sb3.append(zf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(zf0Var.getContext());
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
            if (zf0Var.f39305s0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(zf0Var.f39288e0)) {
                sb3.append("Error: ");
                sb3.append(zf0Var.f39288e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            zf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            zf0Var.f39305s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.hj0 hj0Var) {
        if (hj0Var != null) {
            hj0Var.Q(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            hj0Var.Q(org.telegram.ui.ActionBar.j6.w0(null, i10, false), "Phone");
            hj0Var.Q(org.telegram.ui.ActionBar.j6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        xf0 xf0Var = this.f39307x;
        if (xf0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (xf0Var.getAlpha() != f7) {
                xf0Var.animate().cancel();
                xf0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.hj0 hj0Var = this.N;
        if (hj0Var != null) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            org.telegram.ui.Components.hj0 hj0Var2 = this.f39281a;
            if (hj0Var2.f23648b0 != hj0Var2.e[0] - 1) {
                hj0Var2.f23671u0 = new sf0(this, i10, 0);
                return;
            }
            hj0Var.f23671u0 = new mf0(this, 3);
            org.telegram.ui.Components.kj0 kj0Var = this.f39304s;
            kj0Var.setAutoRepeat(false);
            hj0Var.N(0, false, false);
            kj0Var.setAnimation(hj0Var);
            kj0Var.d();
            return;
        }
        this.f39305s0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f39290f0 != 3) {
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
        xg0 xg0Var = this.f39305s0;
        if (xg0Var.F != 0) {
            xg0Var.finishFragment();
            return false;
        }
        int i11 = this.f39292h0;
        if (i11 != 0) {
            xg0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f39283b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new of0(this, 0));
            xg0Var.showDialog(d2Var);
            return false;
        } else {
            this.f39287d0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39285c;
            i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new bi.g1(13), 10);
            w();
            v();
            this.H = null;
            int i12 = this.f39290f0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f39286c0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f39287d0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f39286c0) {
            fs fsVar = this.f39289f;
            if (fsVar.f32906f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    fsVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f39294j0, str)) {
                        if (!this.f39294j0.equals("*")) {
                            this.f39296l0 = str;
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
        int i10 = this.f39290f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f39286c0 = false;
        w();
        v();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f39293i0 = false;
        this.f39287d0 = false;
        if (this.f39292h0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.V);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f39290f0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f39283b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        xg0 xg0Var = this.f39305s0;
        int i13 = xg0Var.f38717a;
        if (i13 == 11) {
            if (this.f39287d0) {
                return;
            }
        } else if (!this.f39287d0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        fs fsVar = this.f39289f;
        if (str == null) {
            str = fsVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            xg0.U0(xg0Var, fsVar, false);
            return;
        }
        int i15 = xg0Var.f38717a;
        if (i15 < 1 || i15 > 4 || !fsVar.e) {
            this.f39287d0 = true;
            int i16 = this.f39290f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f39286c0 = false;
            int i17 = xg0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39285c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    fsVar.e = true;
                    hs[] hsVarArr = fsVar.f32906f;
                    int length = hsVarArr.length;
                    while (i14 < length) {
                        hsVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new nf0(this, tL_auth_signIn, 0), 10));
                    xg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39285c;
                w();
                fsVar.e = true;
                hs[] hsVarArr2 = fsVar.f32906f;
                int length2 = hsVarArr2.length;
                while (i14 < length2) {
                    hsVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                xg0Var.v1(true, true);
                return;
            }
            this.d = xg0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39285c;
            w();
            fsVar.e = true;
            hs[] hsVarArr3 = fsVar.f32906f;
            int length3 = hsVarArr3.length;
            while (i14 < length3) {
                hsVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new org.telegram.ui.Components.th(28, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.hj0 hj0Var = this.f39281a;
        if (hj0Var != null) {
            hj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new mf0(this, 0), xg0.f38716t0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f39290f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39296l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            fs fsVar = this.f39289f;
            if (fsVar.f32906f != null) {
                fsVar.setText(string2);
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
        String code = this.f39289f.getCode();
        int length = code.length();
        int i10 = this.f39290f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f39296l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(hc.b.j(i10, "smsview_params_"), this.H);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f39305s0.i1()) {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextView textView = this.f39297n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        this.f39302r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = this.f39290f0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.j6.f18306y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18073l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        }
        r(this.f39281a);
        r(this.N);
        r(this.O);
        r(this.P);
        fs fsVar = this.f39289f;
        if (fsVar != null) {
            fsVar.invalidate();
        }
        xf0 xf0Var = this.v;
        Integer num = (Integer) xf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.j6.D6);
        }
        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f39307x.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        hs[] hsVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        fs fsVar = this.f39289f;
        if (fsVar != null && (hsVarArr = fsVar.f32906f) != null) {
            for (hs hsVar : hsVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                hsVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39303r0);
    }

    public final void q(Runnable runnable) {
        if (this.f39290f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            fs fsVar = this.f39289f;
            hs[] hsVarArr = fsVar.f32906f;
            if (i10 < hsVarArr.length) {
                fsVar.postDelayed(new sf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                fsVar.postDelayed(new h90(23, this, runnable), (hsVarArr.length * 75) + 400);
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
        this.f39284b0 = System.currentTimeMillis();
        this.S.schedule(new bi.b3(this, 3), 0L, 1000L);
    }

    public final void u() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        xf0 xf0Var = this.v;
        xf0Var.setTextColor(w02);
        xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new yf0(this), 0L, 1000L);
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
        xf0 xf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
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
        if (!this.f39287d0 && !this.f39293i0) {
            xg0 xg0Var = this.f39305s0;
            if (!xg0Var.f38735o0) {
                this.f39293i0 = true;
                this.v.invalidate();
                this.f39307x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39283b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39290f0);
                this.f39287d0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39285c;
                i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new rf0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f7;
        fs fsVar = this.f39289f;
        try {
            fsVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            hs[] hsVarArr = fsVar.f32906f;
            if (i10 >= hsVarArr.length) {
                break;
            }
            hsVarArr[i10].setText("");
            fsVar.f32906f[i10].i(1.0f);
            i10++;
        }
        fe0 fe0Var = this.f39306w;
        if (fe0Var.getCurrentView() != this.E) {
            fe0Var.showNext();
        }
        fsVar.f32906f[0].requestFocus();
        if (this.f39290f0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(fsVar, f7, new mf0(this, 7));
        mf0 mf0Var = this.f39303r0;
        removeCallbacks(mf0Var);
        postDelayed(mf0Var, 5000L);
        this.f39301q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N != null) {
            if (!this.Q) {
                return;
            }
            this.Q = false;
            this.f39304s.setAutoRepeat(false);
            org.telegram.ui.Components.hj0 hj0Var = this.O;
            hj0Var.K(0);
            hj0Var.R(hj0Var.e[0] - 1, new mf0(this, 1));
            return;
        }
        this.f39305s0.k1(z10, true);
    }
}
