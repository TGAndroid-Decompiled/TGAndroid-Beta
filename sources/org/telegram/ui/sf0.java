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
public final class sf0 extends org.telegram.ui.Components.wv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f41250q0 = 0;
    public final TextView B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.lj0 D;
    public Bundle E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ImageView I;
    public final ImageView J;
    public final org.telegram.ui.Components.ij0 K;
    public final org.telegram.ui.Components.ij0 L;
    public final org.telegram.ui.Components.ij0 M;
    public boolean N;
    public Timer O;
    public Timer P;
    public int Q;
    public final Object R;
    public int S;
    public int T;
    public double U;
    public double V;
    public boolean W;
    public final org.telegram.ui.Components.ij0 f41251a;
    public boolean f41252a0;
    public String f41253b;
    public String f41254b0;
    public String f41255c;
    public final int f41256c0;
    public String d;
    public int f41257d0;
    public String f41258e;
    public int f41259e0;
    public final zr f41260f;
    public boolean f41261f0;
    public String f41262g0;
    public final org.telegram.ui.Components.voip.o2 h;
    public String f41263h0;
    public String f41264i0;
    public int f41265j0;
    public String f41266k0;
    public Bundle f41267l0;
    public TLRPC.TL_auth_sentCode m0;
    public final TextView f41268n;
    public boolean f41269n0;
    public final ff0 f41270o0;
    public final og0 f41271p0;
    public final TextView f41272r;
    public final org.telegram.ui.Components.lj0 f41273s;
    public final qf0 v;
    public final yd0 f41274w;
    public final qf0 f41275x;
    public final FrameLayout f41276y;

    public sf0(org.telegram.ui.og0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sf0.<init>(org.telegram.ui.og0, android.content.Context, int):void");
    }

    public static void o(sf0 sf0Var, Context context) {
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
            StringBuilder sb = new StringBuilder();
            sb.append(sf0Var.f41258e);
            sb.append(" Android Registration/Login Issue ");
            sb.append(str4);
            if (sf0Var.f41271p0.f39757e) {
                str = " #paidauth";
            } else {
                str = "";
            }
            sb.append(str);
            intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(i10);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(sf0Var.d);
            sb2.append("\n");
            sb2.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(sf0Var.getContext());
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
                                sb2.append(str5);
                                sb2.append(".Phone: ");
                                sb2.append(number);
                                sb2.append("\n");
                                sb2.append(str5);
                                sb2.append(".MCC: ");
                                sb2.append(subscriptionInfo.getMcc());
                                sb2.append("\n");
                                sb2.append(str5);
                                sb2.append(".MNC: ");
                                sb2.append(subscriptionInfo.getMnc());
                                sb2.append("\n");
                                sb2.append(str5);
                                sb2.append(".Carrier: ");
                                if (TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                                    carrierName = "unknown";
                                } else {
                                    carrierName = subscriptionInfo.getCarrierName();
                                }
                                sb2.append(carrierName);
                                sb2.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb2.append("SIM0.Phone: ");
                            sb2.append(line1Number);
                            sb2.append("\n");
                            sb2.append("SIM0.MCC: unknown\n");
                            sb2.append("SIM0.MNC: unknown\n");
                            sb2.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(context));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(context));
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(BuildVars.APP_ID);
            sb2.append("\n");
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
            sb2.append("App version: ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            if (sf0Var.f41271p0.f39757e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb2.append(str3);
            sb2.append("\n");
            if (!TextUtils.isEmpty(sf0Var.f41254b0)) {
                sb2.append("Error: ");
                sb2.append(sf0Var.f41254b0);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            sf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            sf0Var.f41271p0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.ij0 ij0Var) {
        if (ij0Var != null) {
            ij0Var.O(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            ij0Var.O(org.telegram.ui.ActionBar.k6.w0(null, i10, false), "Phone");
            ij0Var.O(org.telegram.ui.ActionBar.k6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z4) {
        float f10;
        qf0 qf0Var = this.f41275x;
        if (qf0Var != null) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (qf0Var.getAlpha() != f10) {
                qf0Var.animate().cancel();
                qf0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.ij0 ij0Var = this.K;
        if (ij0Var != null) {
            if (this.N) {
                return;
            }
            this.N = true;
            org.telegram.ui.Components.ij0 ij0Var2 = this.f41251a;
            if (ij0Var2.Y != ij0Var2.f27817e[0] - 1) {
                ij0Var2.f27833r0 = new lf0(this, i10, 0);
                return;
            }
            ij0Var.f27833r0 = new ff0(this, 3);
            org.telegram.ui.Components.lj0 lj0Var = this.f41273s;
            lj0Var.setAutoRepeat(false);
            ij0Var.L(0, false, false);
            lj0Var.setAnimation(ij0Var);
            lj0Var.d();
            return;
        }
        this.f41271p0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f41256c0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        int i10;
        og0 og0Var = this.f41271p0;
        if (og0Var.C != 0) {
            og0Var.finishFragment();
            return false;
        }
        int i11 = this.f41259e0;
        if (i11 != 0) {
            og0Var.u1(i11, true, null, true);
            return false;
        } else if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f41253b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new hf0(this, 0));
            og0Var.showDialog(d2Var);
            return false;
        } else {
            this.f41252a0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f41255c;
            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new oh.p5(13), 10);
            w();
            v();
            this.E = null;
            int i12 = this.f41256c0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.W = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f41252a0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.W) {
            zr zrVar = this.f41260f;
            if (zrVar.f43982f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    zrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f41262g0, str)) {
                        if (!this.f41262g0.equals("*")) {
                            this.f41264i0 = str;
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
        int i10 = this.f41256c0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.W = false;
        w();
        v();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f41261f0 = false;
        this.f41252a0 = false;
        if (this.f41259e0 != 0 && (bundle = this.E) != null) {
            bundle.putInt("timeout", this.S);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f41256c0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f41253b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        og0 og0Var = this.f41271p0;
        int i13 = og0Var.f39750a;
        if (i13 == 11) {
            if (this.f41252a0) {
                return;
            }
        } else if (!this.f41252a0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        zr zrVar = this.f41260f;
        if (str == null) {
            str = zrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            og0.U0(og0Var, zrVar, false);
            return;
        }
        int i15 = og0Var.f39750a;
        if (i15 < 1 || i15 > 4 || !zrVar.f43981e) {
            this.f41252a0 = true;
            int i16 = this.f41256c0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.W = false;
            int i17 = og0Var.C;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f41255c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    zrVar.f43981e = true;
                    cs[] csVarArr = zrVar.f43982f;
                    int length = csVarArr.length;
                    while (i14 < length) {
                        csVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new gf0(this, tL_auth_signIn, 0), 10));
                    og0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f41255c;
                w();
                zrVar.f43981e = true;
                cs[] csVarArr2 = zrVar.f43982f;
                int length2 = csVarArr2.length;
                while (i14 < length2) {
                    csVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new o(this, 13), 2));
                og0Var.v1(true, true);
                return;
            }
            this.d = og0Var.D;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f41255c;
            w();
            zrVar.f43981e = true;
            cs[] csVarArr3 = zrVar.f43982f;
            int length3 = csVarArr3.length;
            while (i14 < length3) {
                csVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new tb0(3, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ij0 ij0Var = this.f41251a;
        if (ij0Var != null) {
            ij0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ff0(this, 0), og0.f39749q0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb = new StringBuilder("smsview_params_");
        int i10 = this.f41256c0;
        sb.append(i10);
        Bundle bundle2 = bundle.getBundle(sb.toString());
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f41264i0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            zr zrVar = this.f41260f;
            if (zrVar.f43982f != null) {
                zrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.S = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.Q = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41260f.getCode();
        int length = code.length();
        int i10 = this.f41256c0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f41264i0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.E != null) {
            bundle.putBundle(l.d.j(i10, "smsview_params_"), this.E);
        }
        int i11 = this.S;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.Q;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f41271p0.i1()) {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextView textView = this.f41268n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        this.f41272r.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        int i12 = this.f41256c0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.k6.f22036y6;
            this.G.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            this.H.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.I.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), mode));
            this.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        }
        r(this.f41251a);
        r(this.K);
        r(this.L);
        r(this.M);
        zr zrVar = this.f41260f;
        if (zrVar != null) {
            zrVar.invalidate();
        }
        qf0 qf0Var = this.v;
        Integer num = (Integer) qf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.D6);
        }
        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f41275x.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        }
        this.B.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        cs[] csVarArr;
        boolean z4;
        super.onConfigurationChanged(configuration);
        zr zrVar = this.f41260f;
        if (zrVar != null && (csVarArr = zrVar.f43982f) != null) {
            for (cs csVar : csVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                csVar.setShowSoftInputOnFocusCompat(z4);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41270o0);
    }

    public final void q(Runnable runnable) {
        if (this.f41256c0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            zr zrVar = this.f41260f;
            cs[] csVarArr = zrVar.f43982f;
            if (i10 < csVarArr.length) {
                zrVar.postDelayed(new lf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                zrVar.postDelayed(new he0(7, this, runnable), (csVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void s() {
        if (this.P != null) {
            return;
        }
        this.T = 15000;
        int i10 = this.S;
        if (i10 > 15000) {
            this.T = i10;
        }
        this.P = new Timer();
        this.V = System.currentTimeMillis();
        this.P.schedule(new org.telegram.ui.Components.i50(this, 1), 0L, 1000L);
    }

    public final void t() {
        if (this.O != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        qf0 qf0Var = this.v;
        qf0Var.setTextColor(w02);
        qf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new rf0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.R) {
                Timer timer = this.P;
                if (timer != null) {
                    timer.cancel();
                    this.P = null;
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void w() {
        qf0 qf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.R) {
                Timer timer = this.O;
                if (timer != null) {
                    timer.cancel();
                    this.O = null;
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void x() {
        int i10;
        if (!this.f41252a0 && !this.f41261f0) {
            og0 og0Var = this.f41271p0;
            if (!og0Var.f39766l0) {
                this.f41261f0 = true;
                this.v.invalidate();
                this.f41275x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f41253b);
                bundle.putString("ephone", this.f41258e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f41256c0);
                this.f41252a0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f41255c;
                i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new kf0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f10;
        zr zrVar = this.f41260f;
        try {
            zrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            cs[] csVarArr = zrVar.f43982f;
            if (i10 >= csVarArr.length) {
                break;
            }
            csVarArr[i10].setText("");
            zrVar.f43982f[i10].i(1.0f);
            i10++;
        }
        yd0 yd0Var = this.f41274w;
        if (yd0Var.getCurrentView() != this.B) {
            yd0Var.showNext();
        }
        zrVar.f43982f[0].requestFocus();
        if (this.f41256c0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(zrVar, f10, new ff0(this, 7));
        ff0 ff0Var = this.f41270o0;
        removeCallbacks(ff0Var);
        postDelayed(ff0Var, 5000L);
        this.f41269n0 = true;
    }

    public final void z(boolean z4) {
        if (this.K != null) {
            if (!this.N) {
                return;
            }
            this.N = false;
            this.f41273s.setAutoRepeat(false);
            org.telegram.ui.Components.ij0 ij0Var = this.L;
            ij0Var.I(0);
            ij0Var.P(ij0Var.f27817e[0] - 1, new ff0(this, 1));
            return;
        }
        this.f41271p0.k1(z4, true);
    }
}
