package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zd0 implements View.OnClickListener {
    public final int f44076a;
    public final Object f44077b;
    public final Object f44078c;

    public zd0(int i10, Object obj, Object obj2) {
        this.f44076a = i10;
        this.f44078c = obj;
        this.f44077b = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        long j10;
        com.google.android.gms.internal.cast.z5 z5Var;
        int i19 = 8;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.b3 b3Var = null;
        int i20 = 0;
        switch (this.f44076a) {
            case 0:
                ae0 ae0Var = (ae0) this.f44078c;
                Context context = (Context) this.f44077b;
                hg0 hg0Var = ae0Var.f35746y;
                if (hg0Var.V.getTag() == null) {
                    if (ae0Var.f35741n.has_recovery) {
                        hg0Var.r1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new xd0(ae0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(ae0Var.f35737a);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new xt(ae0Var, 18));
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 1:
                lf0 lf0Var = (lf0) this.f44078c;
                Context context2 = (Context) this.f44077b;
                Bundle bundle = lf0Var.f39249q0;
                if (bundle != null && (tL_auth_sentCode = lf0Var.f39251r0) != null) {
                    lf0Var.f39255u0.k1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!lf0Var.f39238f0) {
                    jf0 jf0Var = lf0Var.v;
                    if ((jf0Var == null || jf0Var.getVisibility() == 8) && !lf0Var.f39243k0) {
                        if (lf0Var.f39241i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = lf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = lf0Var.f39233c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            lf0Var.f39255u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                            alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder2.f20679a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, lf0Var.f39231b));
                            alertDialog$Builder2.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ks(26, lf0Var, context2));
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder2.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new af0(lf0Var, 1));
                            alertDialog$Builder2.p();
                            return;
                        } else if (lf0Var.f39255u0.V.getTag() == null) {
                            lf0Var.w();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                gg0 gg0Var = (gg0) this.f44078c;
                Context context3 = (Context) this.f44077b;
                Toast toast = gg0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    gg0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (gg0Var.O > 0 && currentTimeMillis - gg0Var.P > 1500) {
                    i11 = 0;
                    gg0Var.O = 0;
                } else {
                    i11 = 0;
                }
                int i21 = gg0Var.O + 1;
                gg0Var.O = i21;
                gg0Var.P = currentTimeMillis;
                if (i21 >= 5) {
                    gg0Var.O = i11;
                    gg0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gg0Var.getContext());
                    alertDialog$Builder3.f20679a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i12 = R.string.DebugMenuDisableLogs;
                    } else {
                        i12 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder3.f(new String[]{LocaleController.getString(i12), LocaleController.getString(R.string.DebugSendLogs)}, new o4(gg0Var, 2));
                    alertDialog$Builder3.p();
                    return;
                } else if (i21 > 1) {
                    Toast makeText = Toast.makeText(context3, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i21, new Object[0]), 0);
                    gg0Var.Q = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 3:
                MessageObject messageObject = (MessageObject) this.f44077b;
                xi0 xi0Var = ((vi0) this.f44078c).d;
                if (!xi0Var.b0(messageObject)) {
                    xi0Var.getOrCreateStoryViewer().F(xi0Var.getParentActivity(), messageObject.storyItem, ci.q7.a(xi0Var.f43622f));
                    return;
                }
                return;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f44078c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f44077b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i13 = 144;
                } else {
                    i13 = 128;
                }
                editTextBoldCursor.setInputType(i13 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f33535s;
                if (atomicBoolean.get()) {
                    i14 = org.telegram.ui.ActionBar.k6.f21328l6;
                } else {
                    i14 = org.telegram.ui.ActionBar.k6.H6;
                }
                org.telegram.ui.ActionBar.r6.t(imageView, i14, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 5:
                ho0.h0((ho0) this.f44078c, (String) this.f44077b, view);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.f44078c;
                org.telegram.ui.Components.h80 h80Var = (org.telegram.ui.Components.h80) this.f44077b;
                if (photoViewer.T4 != null) {
                    h80Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.f33654m4;
                    if (o2Var instanceof sn) {
                        ((sn) o2Var).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f44078c;
                Activity activity = (Activity) this.f44077b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.J1() && !photoViewer2.f33694r) {
                    int i22 = photoViewer2.P4;
                    if (i22 >= 0 && i22 < photoViewer2.f33606g7.size()) {
                        Object obj = photoViewer2.f33606g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33627j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ei.x3 x3Var = photoViewer2.f33636k1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.f33636k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33636k1 = new ei.x3(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i15 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i15 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) LocaleController.getString(i15));
                                    if (isHighQuality) {
                                        i16 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i16 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.vq(i16, 0), 0, 1, 33);
                                    photoViewer2.f33636k1.s(append);
                                    photoViewer2.f33582e0.addView(photoViewer2.f33636k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f33636k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33636k1.m(0.0f, (photoViewer2.f33627j1.getWidth() / 2.0f) + photoViewer2.f33627j1.getX() + photoViewer2.H0.getX());
                                    ei.x3 x3Var2 = photoViewer2.f33636k1;
                                    x3Var2.f10097l0 = new dh(2, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33627j1.getTag() == null) {
                        if (photoViewer2.f33643k8) {
                            if (photoViewer2.f33651m1 == null) {
                                du0 du0Var = photoViewer2.f33582e0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.jr0(textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                du0Var.addView((View) textView, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f33651m1 = textView;
                            }
                            photoViewer2.f33651m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.y21 y21Var = photoViewer2.f33651m1;
                            org.telegram.ui.Components.v71 v71Var = photoViewer2.f33627j1;
                            org.telegram.ui.Components.jr0 jr0Var = y21Var.d;
                            if (v71Var != null) {
                                y21Var.f32794a = v71Var;
                                y21Var.a();
                                y21Var.f32796c = true;
                                AndroidUtilities.cancelRunOnUIThread(jr0Var);
                                AndroidUtilities.runOnUIThread(jr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = y21Var.f32795b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    y21Var.f32795b.cancel();
                                    y21Var.f32795b = null;
                                }
                                if (y21Var.getVisibility() != 0) {
                                    y21Var.setAlpha(0.0f);
                                    y21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = y21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    y21Var.f32795b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.a3(true);
                    photoViewer2.r2(1);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.h80) this.f44078c).K((org.telegram.ui.Components.h80) this.f44077b);
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44078c;
                ((AlertDialog$Builder) this.f44077b).f20679a.N0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i17 = 30;
                } else if (num.intValue() == 1) {
                    i17 = 90;
                } else if (num.intValue() == 2) {
                    i17 = 182;
                } else if (num.intValue() == 3) {
                    i17 = 365;
                } else if (num.intValue() == 4) {
                    i17 = 548;
                } else if (num.intValue() == 5) {
                    i17 = 730;
                } else {
                    i17 = 0;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.f20763i0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new vr0(privacySettingsActivity, c2Var, setaccountttl, 2));
                return;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.f44078c;
                profileActivity.getClass();
                org.telegram.ui.Components.oc.e();
                pf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f44077b).url);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f44078c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44077b;
                long j12 = profileActivity2.f33923f1;
                long j13 = profileActivity2.F1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                dq dqVar = new dq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                dqVar.Y0 = new ty0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                return;
            case 12:
                v11 v11Var = (v11) this.f44078c;
                Context context4 = (Context) this.f44077b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = v11Var.f42536a[0].getText().toString();
                String obj3 = v11Var.f42536a[3].getText().toString();
                String obj4 = v11Var.f42536a[2].getText().toString();
                String obj5 = v11Var.f42536a[1].getText().toString();
                String obj6 = v11Var.f42536a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (v11Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        str = "https://t.me/socks?";
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(context4, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ij0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        v11Var.showDialog(ij0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                p41 p41Var = (p41) this.f44078c;
                Context context5 = (Context) this.f44077b;
                if (p41Var.f42911w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    pl0 pl0Var = new pl0(15, p41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.d5.f25562a;
                    if (context5 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context5, null);
                        b3Var2.a();
                        org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(context5, null);
                        od0Var.setTextColor(x02);
                        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        od0Var.setItemCount(5);
                        org.telegram.ui.Components.od0 od0Var2 = new org.telegram.ui.Components.od0(context5, null);
                        od0Var2.setItemCount(5);
                        od0Var2.setTextColor(x02);
                        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.od0 od0Var3 = new org.telegram.ui.Components.od0(context5, null);
                        od0Var3.setItemCount(5);
                        od0Var3.setTextColor(x02);
                        od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context5, od0Var, od0Var2, od0Var3, 3);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        v3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context5);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(x02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new di.d(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.wd wdVar = new ai.wd(context5, 17);
                        linearLayout.addView(od0Var, w7.z5.l(0.5f, 0, 270));
                        od0Var.setMinValue(0);
                        od0Var.setMaxValue(365);
                        od0Var.setWrapSelectorWheel(false);
                        od0Var.setFormatter(new tr(15));
                        ai.u2 u2Var = new ai.u2(od0Var, od0Var2, od0Var3, 18);
                        od0Var.setOnValueChangedListener(u2Var);
                        od0Var2.setMinValue(0);
                        od0Var2.setMaxValue(23);
                        linearLayout.addView(od0Var2, w7.z5.l(0.2f, 0, 270));
                        od0Var2.setFormatter(new tr(16));
                        od0Var2.setOnValueChangedListener(u2Var);
                        od0Var3.setMinValue(0);
                        od0Var3.setMaxValue(59);
                        od0Var3.setValue(0);
                        od0Var3.setFormatter(new tr(17));
                        linearLayout.addView(od0Var3, w7.z5.l(0.3f, 0, 270));
                        od0Var3.setOnValueChangedListener(u2Var);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j14 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                od0Var3.setValue(calendar.get(12));
                                od0Var2.setValue(calendar.get(11));
                                od0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.d5.g(null, null, 0L, 0L, 0, od0Var, od0Var2, od0Var3);
                        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        wdVar.setGravity(17);
                        wdVar.setTextColor(x04);
                        wdVar.setTextSize(1, 14.0f);
                        wdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x05, x06, x06));
                        wdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(od0Var, od0Var2, od0Var3, calendar, pl0Var, b3Var2, 1);
                        b3Var = b3Var2;
                        wdVar.setOnClickListener(m0Var);
                        b3Var.b(v3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
                        h3Var.show();
                        h3Var.setBackgroundColor(x03);
                        h3Var.fixNavigationBar(x03);
                    }
                    b3Var.f20729a.setOnHideListener(new ai.z3(p41Var, zArr, 13));
                    org.telegram.ui.ActionBar.h3 h3Var2 = b3Var.f20729a;
                    h3Var2.show();
                    p41Var.f42911w = h3Var2;
                    p41Var.c(false);
                    return;
                }
                return;
            case 14:
                n61 n61Var = (n61) this.f44078c;
                ai.k4 k4Var = (ai.k4) this.f44077b;
                if (n61Var.Z.g() != 0) {
                    k4Var.run(new ArrayList(n61Var.f39745a0.values()));
                    n61Var.dismiss();
                    return;
                }
                return;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f44078c;
                ((AlertDialog$Builder) this.f44077b).f20679a.N0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 7;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 183;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else {
                    i18 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.f34153s = i18;
                k71 k71Var = sessionsActivity.f34147a;
                if (k71Var != null) {
                    k71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ci.d6(8));
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f44078c;
                editTextBoldCursor2.setText(ai.nd.N0(((Long) this.f44077b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 17:
                t91 t91Var = ((y81) this.f44078c).f43795d0;
                t91Var.getOrCreateStoryViewer().C(t91Var.getParentActivity(), ((q91) this.f44077b).b(), t91Var.f41975z0, ci.q7.a(t91Var.S));
                return;
            case 18:
                c91 c91Var = (c91) this.f44078c;
                lg.f fVar = (lg.f) this.f44077b;
                int i23 = c91Var.f36277c;
                d91 d91Var = c91Var.d;
                org.telegram.ui.Components.y00 y00Var = c91Var.f36275a;
                if (y00Var.f32766c) {
                    ArrayList arrayList = d91Var.f36543n;
                    jg.g gVar = d91Var.f36541c;
                    int size = arrayList.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            if (i24 == i23 || !((c91) arrayList.get(i24)).f36275a.f32766c || !((c91) arrayList.get(i24)).f36275a.f32765b) {
                                i24++;
                            }
                        } else {
                            i20 = 1;
                        }
                    }
                    d91Var.f();
                    if (i20 != 0) {
                        AndroidUtilities.shakeView(y00Var);
                        return;
                    }
                    y00Var.setChecked(!y00Var.f32765b);
                    fVar.f16126n = y00Var.f32765b;
                    d91Var.f36540b.z();
                    if (d91Var.f36544r.f37245c > 0 && i23 < gVar.d.size()) {
                        ((lg.f) gVar.d.get(i23)).f16126n = y00Var.f32765b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ey eyVar = (ey) this.f44077b;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eyVar.getParentActivity());
                alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.k(LocaleController.getString(R.string.CacheClear), new pl0(17, (ba1) this.f44078c, eyVar));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.f20679a;
                eyVar.showDialog(c2Var2);
                TextView textView3 = (TextView) c2Var2.d(-1);
                if (textView3 != null) {
                    org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21422q7, null);
                    return;
                }
                return;
            case 20:
                tc1 tc1Var = (tc1) this.f44078c;
                Context context6 = (Context) this.f44077b;
                if (tc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b3 b3Var3 = new org.telegram.ui.ActionBar.b3(tc1Var.getParentActivity(), null);
                    b3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context6);
                    linearLayout2.setOrientation(1);
                    TextView textView4 = new TextView(context6);
                    textView4.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.v0.q(textView4, org.telegram.ui.ActionBar.k6.f21290j5, null, 1, 20.0f);
                    linearLayout2.addView(textView4, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView4.setOnTouchListener(new di.d(2));
                    b3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i20 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i20);
                        TLRPC.TL_theme tL_theme = j6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i20++;
                    }
                    va1 va1Var = new va1(context6, tc1Var, arrayList2, new ArrayList(), b3Var3);
                    linearLayout2.addView(va1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    va1Var.D1(tc1Var.fragmentView.getMeasuredWidth());
                    tc1Var.showDialog(b3Var3.f20729a);
                    return;
                }
                return;
            case 21:
                nh1 nh1Var = (nh1) this.f44078c;
                Context context7 = (Context) this.f44077b;
                ug.l1 l1Var = nh1Var.M;
                if (l1Var != null) {
                    l1Var.dismiss();
                    nh1Var.M = null;
                }
                ug.l1 l1Var2 = new ug.l1(context7, nh1Var.f39826a, null, 4, new ci.k0());
                TLRPC.User user = nh1Var.f39832c;
                if (user != null) {
                    j10 = user.f20491id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = nh1Var.d;
                if (user2 != null) {
                    j11 = user2.f20491id;
                }
                long[] jArr = {j10, j11};
                for (int i25 = 0; i25 < 2; i25++) {
                    l1Var2.C0.add(Long.valueOf(jArr[i25]));
                }
                l1Var2.h0(false, true);
                l1Var2.D0 = new ih.b(2);
                nh1Var.M = l1Var2;
                l1Var2.show();
                return;
            case 22:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f44077b;
                if (!((ei.d) this.f44078c).Q) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f44077b;
                if (!((org.telegram.ui.Wallet.a2) this.f44078c).f34283m) {
                    i2Var.dismiss();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f44078c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f44077b;
                if (y2Var.e && !y2Var.R) {
                    org.telegram.ui.Wallet.o5.E0(y2Var.getContext(), o2Var2.getCurrentAccount(), o2Var2.getResourceProvider());
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.j4 j4Var = (org.telegram.ui.Wallet.j4) this.f44078c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f44077b;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    j4Var.dismiss();
                    org.telegram.ui.Wallet.s9 s9Var = new org.telegram.ui.Wallet.s9();
                    s9Var.i0(nftitem);
                    U.presentFragment(s9Var);
                    return;
                }
                return;
            case 26:
                ((Runnable) this.f44078c).run();
                ((org.telegram.ui.Wallet.j2[]) this.f44077b)[0].dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.o5.g0((org.telegram.ui.Wallet.o5) this.f44078c, (Context) this.f44077b, view);
                return;
            case 28:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.f44078c;
                TextView textView5 = (TextView) this.f44077b;
                z1Var.c(!z1Var.b(), true);
                if (z1Var.b()) {
                    i19 = 0;
                }
                textView5.setVisibility(i19);
                return;
            default:
                ei.d dVar = (ei.d) this.f44078c;
                int[] iArr = (int[]) this.f44077b;
                if (!dVar.Q && (z5Var = fi1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = z5Var.h();
                        com.google.android.gms.common.api.internal.s0 s0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6368c).h;
                        b8.e eVar = new b8.e(s0Var, (String) z5Var.f6892a, "/tg-wear-auth/answer", h);
                        s0Var.f6503b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f50459a).addOnSuccessListener(new e7(z5Var, dVar, iArr, 24)).addOnFailureListener(new di1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
