package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
public final class yf0 extends org.telegram.ui.Components.vv0 {
    public final ImageView f40259a;
    public final ph.d f40260b;
    public final lh.e0[] f40261c;
    public Bundle d;
    public String e;
    public boolean f40262f;
    public String h;
    public String f40263n;
    public long f40264r;
    public int f40265s;
    public final pg0 v;

    public yf0(pg0 pg0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = pg0Var;
        this.f40261c = r3;
        this.f40265s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, k7.b6.n(-1, 200));
        eg.h hVar = new eg.h(context, 3);
        frameLayout.addView(hVar, k7.b6.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f40259a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.p2) pg0Var).resourceProvider;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 1, -1));
        frameLayout.addView(imageView, k7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        eg.i iVar = new eg.i(context, 1, 1, 4);
        iVar.setStarParticlesView(hVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false)));
        iVar.setBackgroundBitmap(createBitmap);
        fg.a aVar = iVar.f6156b;
        aVar.f6135w = i11;
        aVar.f6136x = org.telegram.ui.ActionBar.j6.Lj;
        aVar.b();
        frameLayout.addView(iVar, k7.b6.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        f6Var2 = ((org.telegram.ui.ActionBar.p2) pg0Var).resourceProvider;
        lh.e0 e0Var = new lh.e0(context, 1, f6Var2);
        e0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(r3[0], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var3 = ((org.telegram.ui.ActionBar.p2) pg0Var).resourceProvider;
        lh.e0 e0Var2 = new lh.e0(context, 1, f6Var3);
        e0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(r3[1], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var4 = ((org.telegram.ui.ActionBar.p2) pg0Var).resourceProvider;
        lh.e0 e0Var3 = new lh.e0(context, 1, f6Var4);
        lh.e0[] e0VarArr = {e0Var, e0Var2, e0Var3};
        e0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new vf0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(e0VarArr[2], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), k7.b6.o(0, 0, 1.0f, 119));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, null, true);
        this.f40260b = p10;
        p10.setLoading(true);
        addView(p10, k7.b6.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void o(yf0 yf0Var, String str, String str2, String str3) {
        String str4;
        List<SubscriptionInfo> list;
        CharSequence carrierName;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb.append("Device: ");
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb.append(i10);
            sb.append("\n");
            sb.append("Locale: ");
            sb.append(Locale.getDefault());
            sb.append("\n");
            sb.append("\n");
            sb.append("Target Phone: +");
            sb.append(str3);
            sb.append("\n");
            sb.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(yf0Var.getContext());
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
                                String str6 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb.append(str6);
                                sb.append(".Phone: ");
                                sb.append(number);
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".MCC: ");
                                sb.append(subscriptionInfo.getMcc());
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".MNC: ");
                                sb.append(subscriptionInfo.getMnc());
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".Carrier: ");
                                if (TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                                    carrierName = "unknown";
                                } else {
                                    carrierName = subscriptionInfo.getCarrierName();
                                }
                                sb.append(carrierName);
                                sb.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb.append("SIM0.Phone: ");
                            sb.append(line1Number);
                            sb.append("\n");
                            sb.append("SIM0.MCC: unknown\n");
                            sb.append("SIM0.MNC: unknown\n");
                            sb.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) yf0Var.getContext().getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) yf0Var.getContext().getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb.append("Signal: ");
                        sb.append(signalStrength.getLevel());
                        sb.append("/4\n");
                    } else {
                        sb.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            sb.append(AndroidUtilities.isWifiEnabled(yf0Var.getContext()));
            sb.append("\n");
            sb.append("Airplane Mode: ");
            sb.append(AndroidUtilities.isInAirplaneMode(yf0Var.getContext()));
            sb.append("\n");
            sb.append("\n");
            sb.append("App: ");
            sb.append(BuildVars.APP_ID);
            sb.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 != 1 && i11 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str4 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str4 = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str4 = "huawei";
                } else {
                    str4 = "universal";
                }
            } else {
                str4 = "store";
            }
            sb.append("App version: ");
            sb.append(str5);
            sb.append(" ");
            sb.append(str4);
            sb.append("\n");
            sb.append("\n");
            sb.append("Issue: ");
            sb.append("billing_issue");
            sb.append("\n");
            if (!TextUtils.isEmpty(yf0Var.e)) {
                sb.append("Error: ");
                sb.append(yf0Var.e);
                sb.append("\n");
            }
            sb.append("\n\n================================================\n");
            sb.append("WRITE YOUR COMMENT HERE:\n");
            sb.append("\n");
            sb.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            yf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            yf0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override
    public final void g() {
        int i10;
        if (this.f40265s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.f40265s, true);
            this.f40265s = -1;
        }
        this.f40262f = false;
        this.f40260b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j10;
        int i10;
        String formatPluralStringComma;
        String formatPluralStringComma2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String countryName = LocaleController.getCountryName(string);
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("product");
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("phoneFormated");
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("phoneHash");
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("support_email_email");
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("support_email_subject");
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("currency");
        }
        if (bundle == null) {
            j10 = 0;
        } else {
            j10 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i10 = 0;
        } else {
            i10 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(countryName);
        lh.e0[] e0VarArr = this.f40261c;
        if (isEmpty) {
            e0VarArr[0].f12317c.setText(LocaleController.getString(R.string.SMSFee1Text));
        } else {
            e0VarArr[0].f12317c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        lh.e0 e0Var = e0VarArr[2];
        if (i10 == 7) {
            formatPluralStringComma = LocaleController.getString(R.string.SMSFee3Text);
        } else {
            formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFee3TextDays", i10);
        }
        e0Var.setSubtitle(formatPluralStringComma);
        this.f40259a.setOnClickListener(new kh.t3(this, string5, string6, string3, 12));
        ph.d dVar = this.f40260b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (BuildVars.useInvoiceBilling()) {
            if (!TextUtils.isEmpty(string7) && j10 > 0) {
                dVar.setVisibility(0);
                dVar.setLoading(false);
                dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j10, string7)), false, true);
                if (i10 == 7) {
                    formatPluralStringComma2 = LocaleController.getString(R.string.SMSFeePurchaseText);
                } else {
                    formatPluralStringComma2 = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10);
                }
                dVar.f(formatPluralStringComma2, false);
                dVar.setOnClickListener(new lh.p0(this, string7, j10, string4, string3, i10));
                return;
            }
            dVar.setVisibility(0);
            dVar.setLoading(false);
            dVar.setEnabled(false);
            dVar.g(LocaleController.getString(R.string.Unavailable), false, true);
            return;
        }
        String str = string4;
        int i11 = i10;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(0);
        dVar.setLoading(true);
        dg.f3 f3Var = new dg.f3(this, string2, str, string3, i11, 23);
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(f3Var);
        } else {
            f3Var.run();
        }
    }

    public final void p() {
        int i10;
        if (!this.f40262f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f40264r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f40263n;
        i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
        this.f40265s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new o(this, 14), 1096);
    }
}
