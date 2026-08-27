package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.widget.Space;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class rf0 extends org.telegram.ui.Components.ev0 {

    public final ImageView f41918a;

    public final lh.d f41919b;

    public final hh.f0[] f41920c;
    public Bundle d;

    public String f41921e;

    public boolean f41922f;
    public String h;

    public String f41923n;

    public long f41924r;

    public int f41925s;
    public final ig0 v;

    public rf0(ig0 ig0Var, Context context) {
        super(context);
        this.v = ig0Var;
        hh.f0[] f0VarArr = {f0Var, f0Var, f0Var};
        this.f41920c = f0VarArr;
        this.f41925s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, h7.z5.n(-1, 200));
        ag.j jVar = new ag.j(context, 5);
        frameLayout.addView(jVar, h7.z5.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f41918a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, ((org.telegram.ui.ActionBar.n2) ig0Var).resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
        frameLayout.addView(imageView, h7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        ag.k kVar = new ag.k(context, 1, 1, 4);
        kVar.setStarParticlesView(jVar);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i11 = org.telegram.ui.ActionBar.g6.Mj;
        canvas.drawColor(i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false)));
        kVar.setBackgroundBitmap(bitmapCreateBitmap);
        bg.a aVar = kVar.f2129b;
        aVar.f2107w = i11;
        aVar.f2108x = org.telegram.ui.ActionBar.g6.Lj;
        aVar.b();
        frameLayout.addView(kVar, h7.z5.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        hh.f0 f0Var = new hh.f0(context, 1, ((org.telegram.ui.ActionBar.n2) ig0Var).resourceProvider);
        f0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(f0VarArr[0], h7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        hh.f0 f0Var2 = new hh.f0(context, 1, ((org.telegram.ui.ActionBar.n2) ig0Var).resourceProvider);
        f0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(f0VarArr[1], h7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        hh.f0 f0Var3 = new hh.f0(context, 1, ((org.telegram.ui.ActionBar.n2) ig0Var).resourceProvider);
        f0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new of0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(f0VarArr[2], h7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), h7.z5.o(0, 0, 1.0f, 119));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, null, true);
        this.f41919b = dVarG;
        dVarG.setLoading(true);
        addView(dVarG, h7.z5.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void o(rf0 rf0Var, String str, String str2, String str3) {
        String str4;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            }
            if (TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            }
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
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(rf0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                        completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                        completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList != null) {
                        for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str6 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb2.append(str6);
                                sb2.append(".Phone: ");
                                sb2.append(number);
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".MCC: ");
                                sb2.append(subscriptionInfo.getMcc());
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".MNC: ");
                                sb2.append(subscriptionInfo.getMnc());
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".Carrier: ");
                                sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) rf0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
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
            sb2.append(AndroidUtilities.isWifiEnabled(rf0Var.getContext()));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(rf0Var.getContext()));
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(BuildVars.APP_ID);
            sb2.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 == 1 || i11 == 2) {
                str4 = "store";
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str4 = "direct";
            } else if (ApplicationLoader.isBetaBuild()) {
                str4 = "beta";
            } else {
                str4 = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            }
            sb2.append("App version: ");
            sb2.append(str5);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append("billing_issue");
            sb2.append("\n");
            if (!TextUtils.isEmpty(rf0Var.f41921e)) {
                sb2.append("Error: ");
                sb2.append(rf0Var.f41921e);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            rf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            rf0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override
    public final void g() {
        if (this.f41925s >= 0) {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.v).currentAccount).cancelRequest(this.f41925s, true);
            this.f41925s = -1;
        }
        this.f41922f = false;
        this.f41919b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        this.d = bundle;
        String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j10 = bundle == null ? 0L : bundle.getLong("amount");
        int i10 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean zIsEmpty = TextUtils.isEmpty(countryName);
        hh.f0[] f0VarArr = this.f41920c;
        if (zIsEmpty) {
            f0VarArr[0].f9241c.setText(LocaleController.getString(R.string.SMSFee1Text));
        } else {
            f0VarArr[0].f9241c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        f0VarArr[2].setSubtitle(i10 == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i10));
        this.f41918a.setOnClickListener(new gh.a4(this, string4, string5, string2, 15));
        lh.d dVar = this.f41919b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (BuildVars.useInvoiceBilling()) {
            if (TextUtils.isEmpty(string6) || j10 <= 0) {
                dVar.setVisibility(0);
                dVar.setLoading(false);
                dVar.setEnabled(false);
                dVar.g(LocaleController.getString(R.string.Unavailable), false, true);
                return;
            }
            dVar.setVisibility(0);
            dVar.setLoading(false);
            dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j10, string6)), false, true);
            dVar.f(i10 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10), false);
            dVar.setOnClickListener(new hh.q0(this, string6, j10, string3, string2, i10));
            return;
        }
        String str = string3;
        int i11 = i10;
        if (TextUtils.isEmpty(string)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(0);
        dVar.setLoading(true);
        gh.e1 e1Var = new gh.e1(this, string, str, string2, i11, 24);
        if (BillingController.getInstance().isReady()) {
            e1Var.run();
        } else {
            BillingController.getInstance().whenSetuped(e1Var);
        }
    }

    public final void p() {
        if (this.f41922f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.f41924r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.f41923n;
            this.f41925s = ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.v).currentAccount).sendRequest(tL_checkPaidAuth, new n(this, 14), 1096);
        }
    }
}
