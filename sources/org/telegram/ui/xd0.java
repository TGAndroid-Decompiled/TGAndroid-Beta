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
public final class xd0 implements View.OnClickListener {
    public final int f45739a;
    public final Object f45740b;
    public final Object f45741c;

    public xd0(int i10, Object obj, Object obj2) {
        this.f45739a = i10;
        this.f45741c = obj;
        this.f45740b = obj2;
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
        a8.me meVar;
        int i19 = 8;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.e3 e3Var = null;
        int i20 = 0;
        switch (this.f45739a) {
            case 0:
                yd0 yd0Var = (yd0) this.f45741c;
                Context context = (Context) this.f45740b;
                gg0 gg0Var = yd0Var.f46044y;
                if (gg0Var.V.getTag() == null) {
                    if (yd0Var.f46039n.has_recovery) {
                        gg0Var.s1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new vd0(yd0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(yd0Var.f46035a);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new qt(yd0Var, 19));
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 1:
                jf0 jf0Var = (jf0) this.f45741c;
                Context context2 = (Context) this.f45740b;
                Bundle bundle = jf0Var.f40613q0;
                if (bundle != null && (tL_auth_sentCode = jf0Var.f40615r0) != null) {
                    jf0Var.f40619u0.l1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!jf0Var.f40602f0) {
                    hf0 hf0Var = jf0Var.v;
                    if ((hf0Var == null || hf0Var.getVisibility() == 8) && !jf0Var.f40607k0) {
                        if (jf0Var.f40605i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = jf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = jf0Var.f40597c;
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
                            jf0Var.f40619u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                            alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder2.f22368a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, jf0Var.f40595b));
                            alertDialog$Builder2.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new af0(0, jf0Var, context2));
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder2.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new ye0(jf0Var, 1));
                            alertDialog$Builder2.p();
                            return;
                        } else if (jf0Var.f40619u0.V.getTag() == null) {
                            jf0Var.w();
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
                fg0 fg0Var = (fg0) this.f45741c;
                Context context3 = (Context) this.f45740b;
                Toast toast = fg0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    fg0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (fg0Var.O > 0 && currentTimeMillis - fg0Var.P > 1500) {
                    i11 = 0;
                    fg0Var.O = 0;
                } else {
                    i11 = 0;
                }
                int i21 = fg0Var.O + 1;
                fg0Var.O = i21;
                fg0Var.P = currentTimeMillis;
                if (i21 >= 5) {
                    fg0Var.O = i11;
                    fg0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fg0Var.getContext());
                    alertDialog$Builder3.f22368a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i12 = R.string.DebugMenuDisableLogs;
                    } else {
                        i12 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder3.f(new String[]{LocaleController.getString(i12), LocaleController.getString(R.string.DebugSendLogs)}, new n4(fg0Var, 2));
                    alertDialog$Builder3.p();
                    return;
                } else if (i21 > 1) {
                    Toast makeText = Toast.makeText(context3, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i21, new Object[0]), 0);
                    fg0Var.Q = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 3:
                MessageObject messageObject = (MessageObject) this.f45740b;
                vi0 vi0Var = ((ti0) this.f45741c).d;
                if (!vi0Var.c0(messageObject)) {
                    vi0Var.getOrCreateStoryViewer().F(vi0Var.getParentActivity(), messageObject.storyItem, di.q7.a(vi0Var.f44828f));
                    return;
                }
                return;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f45741c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f45740b;
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
                ImageView imageView = passcodeActivity.f35599s;
                if (atomicBoolean.get()) {
                    i14 = org.telegram.ui.ActionBar.y6.f23502l6;
                } else {
                    i14 = org.telegram.ui.ActionBar.y6.H6;
                }
                org.telegram.ui.ActionBar.f7.t(imageView, i14, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 5:
                po0.i0((po0) this.f45741c, (String) this.f45740b, view);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.f45741c;
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.f45740b;
                if (photoViewer.T4 != null) {
                    k80Var.u();
                    org.telegram.ui.ActionBar.r2 r2Var = photoViewer.f35718m4;
                    if (r2Var instanceof un) {
                        ((un) r2Var).T9(photoViewer.T4, false, true);
                    }
                    qf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f45741c;
                Activity activity = (Activity) this.f45740b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.J1() && !photoViewer2.f35759r) {
                    int i22 = photoViewer2.P4;
                    if (i22 >= 0 && i22 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f35691j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                fi.v3 v3Var = photoViewer2.f35700k1;
                                if (v3Var != null) {
                                    v3Var.e(true);
                                    photoViewer2.f35700k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f35700k1 = new fi.v3(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.zq(i16, 0), 0, 1, 33);
                                    photoViewer2.f35700k1.s(append);
                                    photoViewer2.f35646e0.addView(photoViewer2.f35700k1, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f35700k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f35700k1.m(0.0f, (photoViewer2.f35691j1.getWidth() / 2.0f) + photoViewer2.f35691j1.getX() + photoViewer2.H0.getX());
                                    fi.v3 v3Var2 = photoViewer2.f35700k1;
                                    v3Var2.f11798l0 = new dh(3, v3Var2);
                                    v3Var2.d = 3500L;
                                    v3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f35691j1.getTag() == null) {
                        if (photoViewer2.f35707k8) {
                            if (photoViewer2.f35715m1 == null) {
                                iu0 iu0Var = photoViewer2.f35646e0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.mp0((Object) textView, 23);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                iu0Var.addView((View) textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f35715m1 = textView;
                            }
                            photoViewer2.f35715m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.i31 i31Var = photoViewer2.f35715m1;
                            org.telegram.ui.Components.f81 f81Var = photoViewer2.f35691j1;
                            org.telegram.ui.Components.mp0 mp0Var = i31Var.d;
                            if (f81Var != null) {
                                i31Var.f29179a = f81Var;
                                i31Var.a();
                                i31Var.f29181c = true;
                                AndroidUtilities.cancelRunOnUIThread(mp0Var);
                                AndroidUtilities.runOnUIThread(mp0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = i31Var.f29180b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    i31Var.f29180b.cancel();
                                    i31Var.f29180b = null;
                                }
                                if (i31Var.getVisibility() != 0) {
                                    i31Var.setAlpha(0.0f);
                                    i31Var.setVisibility(0);
                                    ViewPropertyAnimator listener = i31Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    i31Var.f29180b = listener;
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
                ((org.telegram.ui.Components.k80) this.f45741c).K((org.telegram.ui.Components.k80) this.f45740b);
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45741c;
                ((AlertDialog$Builder) this.f45740b).f22368a.N0.run();
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
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(privacySettingsActivity.getParentActivity(), 3, null);
                e2Var.f22575i0 = false;
                e2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new as0(privacySettingsActivity, e2Var, setaccountttl, 2));
                return;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.f45741c;
                int i23 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f45740b).url);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f45741c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45740b;
                long j12 = profileActivity2.f35979e1;
                long j13 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                gq gqVar = new gq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                gqVar.X0 = new xy0(profileActivity2, chat, gqVar);
                profileActivity2.presentFragment(gqVar);
                return;
            case 12:
                b21 b21Var = (b21) this.f45741c;
                Context context4 = (Context) this.f45740b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = b21Var.f37955a[0].getText().toString();
                String obj3 = b21Var.f37955a[3].getText().toString();
                String obj4 = b21Var.f37955a[2].getText().toString();
                String obj5 = b21Var.f37955a[1].getText().toString();
                String obj6 = b21Var.f37955a[4].getText().toString();
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
                    if (b21Var.v == 2) {
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
                        b21Var.showDialog(ij0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                r41 r41Var = (r41) this.f45741c;
                Context context5 = (Context) this.f45740b;
                if (r41Var.f45966w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    af0 af0Var = new af0(19, r41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.f28420a;
                    if (context5 != null) {
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23464j5, false);
                        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i6, false);
                        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context5, null);
                        e3Var2.a();
                        org.telegram.ui.Components.md0 md0Var = new org.telegram.ui.Components.md0(context5, null);
                        md0Var.setTextColor(x02);
                        md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        md0Var.setItemCount(5);
                        org.telegram.ui.Components.md0 md0Var2 = new org.telegram.ui.Components.md0(context5, null);
                        md0Var2.setItemCount(5);
                        md0Var2.setTextColor(x02);
                        md0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.md0 md0Var3 = new org.telegram.ui.Components.md0(context5, null);
                        md0Var3.setItemCount(5);
                        md0Var3.setTextColor(x02);
                        md0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context5, md0Var, md0Var2, md0Var3, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        y3Var.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context5);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(x02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new ei.d(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, org.telegram.ui.Components.gb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.md mdVar = new bi.md(context5, 17);
                        linearLayout.addView(md0Var, org.telegram.ui.Components.gb1.p(0.5f, 0, 270));
                        md0Var.setMinValue(0);
                        md0Var.setMaxValue(365);
                        md0Var.setWrapSelectorWheel(false);
                        md0Var.setFormatter(new cg(19));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(md0Var, md0Var2, md0Var3, 18);
                        md0Var.setOnValueChangedListener(aVar);
                        md0Var2.setMinValue(0);
                        md0Var2.setMaxValue(23);
                        linearLayout.addView(md0Var2, org.telegram.ui.Components.gb1.p(0.2f, 0, 270));
                        md0Var2.setFormatter(new cg(20));
                        md0Var2.setOnValueChangedListener(aVar);
                        md0Var3.setMinValue(0);
                        md0Var3.setMaxValue(59);
                        md0Var3.setValue(0);
                        md0Var3.setFormatter(new cg(21));
                        linearLayout.addView(md0Var3, org.telegram.ui.Components.gb1.p(0.3f, 0, 270));
                        md0Var3.setOnValueChangedListener(aVar);
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
                                md0Var3.setValue(calendar.get(12));
                                md0Var2.setValue(calendar.get(11));
                                md0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.g(null, null, 0L, 0L, 0, md0Var, md0Var2, md0Var3);
                        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        mdVar.setGravity(17);
                        mdVar.setTextColor(x04);
                        mdVar.setTextSize(1, 14.0f);
                        mdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x05, x06, x06));
                        mdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(mdVar, org.telegram.ui.Components.gb1.x(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(md0Var, md0Var2, md0Var3, calendar, af0Var, e3Var2, 1);
                        e3Var = e3Var2;
                        mdVar.setOnClickListener(m0Var);
                        e3Var.b(y3Var);
                        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22601a;
                        k3Var.show();
                        k3Var.setBackgroundColor(x03);
                        k3Var.fixNavigationBar(x03);
                    }
                    e3Var.f22601a.setOnHideListener(new bi.u3(r41Var, zArr, 13));
                    org.telegram.ui.ActionBar.k3 k3Var2 = e3Var.f22601a;
                    k3Var2.show();
                    r41Var.f45966w = k3Var2;
                    r41Var.c(false);
                    return;
                }
                return;
            case 14:
                p61 p61Var = (p61) this.f45741c;
                bi.f4 f4Var = (bi.f4) this.f45740b;
                if (p61Var.Z.g() != 0) {
                    f4Var.run(new ArrayList(p61Var.f42376a0.values()));
                    p61Var.dismiss();
                    return;
                }
                return;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f45741c;
                ((AlertDialog$Builder) this.f45740b).f22368a.N0.run();
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
                sessionsActivity.f36217s = i18;
                n71 n71Var = sessionsActivity.f36211a;
                if (n71Var != null) {
                    n71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new di.d6(8));
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f45741c;
                editTextBoldCursor2.setText(bi.dd.L0(((Long) this.f45740b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 17:
                w91 w91Var = ((b91) this.f45741c).f38013d0;
                w91Var.getOrCreateStoryViewer().C(w91Var.getParentActivity(), ((t91) this.f45740b).b(), w91Var.C0, di.q7.a(w91Var.S));
                return;
            case 18:
                f91 f91Var = (f91) this.f45741c;
                mg.f fVar = (mg.f) this.f45740b;
                int i24 = f91Var.f39319c;
                g91 g91Var = f91Var.d;
                org.telegram.ui.Components.a10 a10Var = f91Var.f39317a;
                if (a10Var.f26381c) {
                    ArrayList arrayList = g91Var.f39575n;
                    kg.h hVar = g91Var.f39573c;
                    int size = arrayList.size();
                    int i25 = 0;
                    while (true) {
                        if (i25 < size) {
                            if (i25 == i24 || !((f91) arrayList.get(i25)).f39317a.f26381c || !((f91) arrayList.get(i25)).f39317a.f26380b) {
                                i25++;
                            }
                        } else {
                            i20 = 1;
                        }
                    }
                    g91Var.f();
                    if (i20 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        return;
                    }
                    a10Var.setChecked(!a10Var.f26380b);
                    fVar.f18475n = a10Var.f26380b;
                    g91Var.f39572b.z();
                    if (g91Var.f39576r.f40188c > 0 && i24 < hVar.d.size()) {
                        ((mg.f) hVar.d.get(i24)).f18475n = a10Var.f26380b;
                        hVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                cy cyVar = (cy) this.f45740b;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cyVar.getParentActivity());
                alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.k(LocaleController.getString(R.string.CacheClear), new af0(21, (ea1) this.f45741c, cyVar));
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder4.f22368a;
                cyVar.showDialog(e2Var2);
                TextView textView3 = (TextView) e2Var2.d(-1);
                if (textView3 != null) {
                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23598q7, null);
                    return;
                }
                return;
            case 20:
                xc1 xc1Var = (xc1) this.f45741c;
                Context context6 = (Context) this.f45740b;
                if (xc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3Var3 = new org.telegram.ui.ActionBar.e3(xc1Var.getParentActivity(), null);
                    e3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context6);
                    linearLayout2.setOrientation(1);
                    TextView textView4 = new TextView(context6);
                    textView4.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.t.r(textView4, org.telegram.ui.ActionBar.y6.f23464j5, null, 1, 20.0f);
                    linearLayout2.addView(textView4, org.telegram.ui.Components.gb1.x(-1, -2, 51, 22, 12, 22, 4));
                    textView4.setOnTouchListener(new ei.d(2));
                    e3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.y6.F.size();
                    while (i20 < size2) {
                        org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) org.telegram.ui.ActionBar.y6.F.get(i20);
                        TLRPC.TL_theme tL_theme = x6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(x6Var);
                        }
                        i20++;
                    }
                    ya1 ya1Var = new ya1(context6, xc1Var, arrayList2, new ArrayList(), e3Var3);
                    linearLayout2.addView(ya1Var, org.telegram.ui.Components.gb1.o(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ya1Var.D1(xc1Var.fragmentView.getMeasuredWidth());
                    xc1Var.showDialog(e3Var3.f22601a);
                    return;
                }
                return;
            case 21:
                ph1 ph1Var = (ph1) this.f45741c;
                Context context7 = (Context) this.f45740b;
                vg.n1 n1Var = ph1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    ph1Var.M = null;
                }
                vg.n1 n1Var2 = new vg.n1(context7, ph1Var.f42510a, null, 4, new di.k0());
                TLRPC.User user = ph1Var.f42516c;
                if (user != null) {
                    j10 = user.f22176id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = ph1Var.d;
                if (user2 != null) {
                    j11 = user2.f22176id;
                }
                long[] jArr = {j10, j11};
                for (int i26 = 0; i26 < 2; i26++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i26]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new jh.b(2);
                ph1Var.M = n1Var2;
                n1Var2.show();
                return;
            case 22:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f45740b;
                if (!((fi.d) this.f45741c).Q) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f45740b;
                if (!((org.telegram.ui.Wallet.a2) this.f45741c).f36346m) {
                    i2Var.dismiss();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f45741c;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.f45740b;
                if (y2Var.e && !y2Var.R) {
                    org.telegram.ui.Wallet.m5.F0(y2Var.getContext(), r2Var2.getCurrentAccount(), r2Var2.getResourceProvider());
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.i4 i4Var = (org.telegram.ui.Wallet.i4) this.f45741c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f45740b;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    i4Var.dismiss();
                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9();
                    r9Var.j0(nftitem);
                    U.presentFragment(r9Var);
                    return;
                }
                return;
            case 26:
                ((Runnable) this.f45741c).run();
                ((org.telegram.ui.Wallet.j2[]) this.f45740b)[0].dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.m5.h0((org.telegram.ui.Wallet.m5) this.f45741c, (Context) this.f45740b, view);
                return;
            case 28:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f45741c;
                TextView textView5 = (TextView) this.f45740b;
                y1Var.c(!y1Var.b(), true);
                if (y1Var.b()) {
                    i19 = 0;
                }
                textView5.setVisibility(i19);
                return;
            default:
                fi.d dVar = (fi.d) this.f45741c;
                int[] iArr = (int[]) this.f45740b;
                if (!dVar.Q && (meVar = ii1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] q5 = meVar.q();
                        com.google.android.gms.common.api.internal.s0 s0Var = new a6.a(applicationContext, com.google.android.gms.common.api.i.f6478c).h;
                        c8.e eVar = new c8.e(s0Var, (String) meVar.f616c, "/tg-wear-auth/answer", q5);
                        s0Var.f6616b.d(0, eVar);
                        o6.l.n(eVar, z8.k0.f52745a).addOnSuccessListener(new e7(meVar, dVar, iArr, 24)).addOnFailureListener(new gi1(dVar, 0));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
