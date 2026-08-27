package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;

public final class u70 implements View.OnClickListener {

    public final int f43150a;

    public final Object f43151b;

    public final Object f43152c;

    public u70(int i10, Object obj, Object obj2) {
        this.f43150a = i10;
        this.f43151b = obj;
        this.f43152c = obj2;
    }

    private final void a(View view) {
        z81 z81Var = (z81) this.f43151b;
        tf.f fVar = (tf.f) this.f43152c;
        int i10 = z81Var.f45106c;
        a91 a91Var = z81Var.d;
        org.telegram.ui.Components.g00 g00Var = z81Var.f45104a;
        if (g00Var.f28482c) {
            ArrayList arrayList = a91Var.f36468n;
            rf.g gVar = a91Var.f36465c;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = true;
                    break;
                } else if (i11 != i10 && ((z81) arrayList.get(i11)).f45104a.f28482c && ((z81) arrayList.get(i11)).f45104a.f28481b) {
                    break;
                } else {
                    i11++;
                }
            }
            a91Var.f();
            if (z10) {
                AndroidUtilities.shakeView(g00Var);
                return;
            }
            g00Var.setChecked(!g00Var.f28481b);
            fVar.f48206n = g00Var.f28481b;
            a91Var.f36464b.z();
            if (a91Var.f36469r.f37023c <= 0 || i10 >= gVar.d.size()) {
                return;
            }
            ((tf.f) gVar.d.get(i10)).f48206n = g00Var.f28481b;
            gVar.z();
        }
    }

    private final void b(View view) {
        tc1 tc1Var = (tc1) this.f43151b;
        Context context = (Context) this.f43152c;
        if (tc1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(tc1Var.getParentActivity(), null);
        z2Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
        linearLayout.addView(textView, h7.z5.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new kh.e(2));
        z2Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i10);
            TLRPC.TL_theme tL_theme = f6Var.B;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(f6Var);
            }
        }
        sa1 sa1Var = new sa1(context, tc1Var, arrayList, new ArrayList(), z2Var);
        linearLayout.addView(sa1Var, h7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        sa1Var.x1(tc1Var.fragmentView.getMeasuredWidth());
        tc1Var.showDialog(z2Var.f23994a);
    }

    private final void c(View view) {
        lh1 lh1Var = (lh1) this.f43151b;
        Context context = (Context) this.f43152c;
        cg.y2 y2Var = lh1Var.I;
        if (y2Var != null) {
            y2Var.dismiss();
            lh1Var.I = null;
        }
        cg.y2 y2Var2 = new cg.y2(context, lh1Var.f40089a, null, 4, new jh.h0());
        TLRPC.User user = lh1Var.f40095c;
        long j10 = user != null ? user.f22527id : 0L;
        TLRPC.User user2 = lh1Var.d;
        int i10 = 1;
        long[] jArr = {j10, user2 != null ? user2.f22527id : 0L};
        for (int i11 = 0; i11 < 2; i11++) {
            y2Var2.f2891y0.add(Long.valueOf(jArr[i11]));
        }
        y2Var2.h0(false, true);
        y2Var2.f2892z0 = new org.telegram.ui.Components.or(i10);
        lh1Var.I = y2Var2;
        y2Var2.show();
    }

    @Override
    public final void onClick(View view) {
        char c10;
        char c11;
        String string;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        int i11;
        String str;
        int i12;
        af.h hVar;
        int i13 = 17;
        int i14 = 5;
        int i15 = 2;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        int i16 = 0;
        switch (this.f43150a) {
            case 0:
                y70 y70Var = (y70) this.f43151b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f43152c;
                y70Var.M.dismiss();
                if (!y70Var.f44720b0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", y70Var.V);
                    a6 a6Var = new a6(bundle);
                    a6Var.d = y70Var.f44720b0;
                    a6Var.U();
                    n2Var.presentFragment(a6Var);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i17 = y70Var.V;
                    if (i17 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i17 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    gy gyVar = new gy(bundle2);
                    gyVar.f38621y2 = new zr(14, y70Var, gyVar);
                    n2Var.presentFragment(gyVar);
                }
                break;
            case 1:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.f43151b;
                org.telegram.ui.Cells.n4[] n4VarArr = (org.telegram.ui.Cells.n4[]) this.f43152c;
                Pattern pattern = LaunchActivity.f35496x1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.n4) view).getCurrentLocale();
                int i18 = 0;
                while (i18 < 2) {
                    n4VarArr[i18].f24718a.a(i18 == num.intValue(), true);
                    i18++;
                }
                break;
            case 2:
                org.telegram.ui.Components.y4.y((Context) this.f43152c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new va0((fb0) this.f43151b, 0));
                break;
            case 3:
                fb0 fb0Var = (fb0) this.f43151b;
                Runnable[] runnableArr = (Runnable[]) this.f43152c;
                if (fb0Var.f38057e == null) {
                    cb0 cb0Var = fb0Var.f38058f;
                    if (!cb0Var.f25003e.h) {
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        Switch r10 = p8Var.f25003e;
                        p8Var.setChecked(!r10.h);
                        fb0Var.f38060r.setVisibility(r10.h ? 0 : 8);
                        int i19 = 0;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r10.h) {
                            fb0Var.f38058f.setCheckBoxIcon(0);
                            fb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            ua0 ua0Var = new ua0(fb0Var, 1);
                            runnableArr[0] = ua0Var;
                            AndroidUtilities.runOnUIThread(ua0Var);
                        } else {
                            fb0Var.f38058f.setChecked(false);
                            fb0Var.f38058f.setCheckBoxIcon(R.drawable.permission_locked);
                            fb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            ua0 ua0Var2 = new ua0(fb0Var, i19);
                            runnableArr[0] = ua0Var2;
                            AndroidUtilities.runOnUIThread(ua0Var2, 60L);
                        }
                    } else {
                        int i20 = -fb0Var.J;
                        fb0Var.J = i20;
                        AndroidUtilities.shakeViewSpring(cb0Var, i20);
                    }
                    break;
                }
                break;
            case 4:
                tc0 tc0Var = (tc0) this.f43151b;
                tc0Var.r0((nc0) this.f43152c);
                lc0 lc0Var = tc0Var.E0;
                if (lc0Var != null) {
                    lc0Var.dismiss();
                }
                break;
            case 5:
                qc0 qc0Var = (qc0) this.f43151b;
                sc0 sc0Var = (sc0) this.f43152c;
                tc0 tc0Var2 = qc0Var.f41634b;
                tc0Var2.getClass();
                tc0Var2.B0.d(sc0Var.f42575c, tc0Var2.C0, true, 0, 0L);
                tc0Var2.finishFragment();
                break;
            case 6:
                sd0 sd0Var = (sd0) this.f43151b;
                Context context = (Context) this.f43152c;
                String string2 = sd0Var.f42590y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int iIndexOf = string2.indexOf(42);
                int iLastIndexOf = string2.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                    xz0Var.f34734a |= 256;
                    xz0Var.f34735b = iIndexOf;
                    int i21 = iLastIndexOf + 1;
                    xz0Var.f34736c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = sd0Var.C;
                int i23 = i22 / 86400;
                int i24 = i22 % 86400;
                int i25 = i24 / 3600;
                int iMax = (i24 % 3600) / 60;
                if (i23 == 0 && i25 == 0) {
                    iMax = Math.max(1, iMax);
                }
                if (i23 == 0 || i25 == 0) {
                    c10 = 0;
                    if (i25 == 0 || iMax == 0) {
                        c11 = 1;
                        string = i23 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i23, new Object[0])) : i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i23, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
                    } else {
                        c11 = 1;
                        string = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i25, new Object[0]), LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
                    }
                } else {
                    c10 = 0;
                    string = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i23, new Object[0]), LocaleController.formatPluralString("Hours", i25, new Object[0]));
                    c11 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = string;
                alertDialog$Builder.f22702a.P = AndroidUtilities.formatSpannable(spannableStringBuilderReplaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new zt(sd0Var, 17));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 7:
                be0 be0Var = (be0) this.f43151b;
                Context context2 = (Context) this.f43152c;
                ig0 ig0Var = be0Var.f36803y;
                if (ig0Var.R.getTag() == null) {
                    if (!be0Var.f36798n.has_recovery) {
                        AndroidUtilities.hideKeyboard(be0Var.f36793a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new zt(be0Var, 18));
                        alertDialog$Builder2.o();
                    } else {
                        ig0Var.n1(0, true);
                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new zd0(be0Var, 1), 10);
                    }
                    break;
                }
                break;
            case 8:
                mf0 mf0Var = (mf0) this.f43151b;
                Context context3 = (Context) this.f43152c;
                Bundle bundle3 = mf0Var.f40493k0;
                if (bundle3 != null && (tL_auth_sentCode = mf0Var.f40494l0) != null) {
                    mf0Var.f40497o0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!mf0Var.W) {
                    kf0 kf0Var = mf0Var.v;
                    if ((kf0Var == null || kf0Var.getVisibility() == 8) && !mf0Var.f40486e0) {
                        if (mf0Var.f40483c0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = mf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = mf0Var.f40482c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            mf0Var.f40497o0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, mf0Var.f40480b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new zr(28, mf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new af0(mf0Var, 1));
                            alertDialog$Builder3.o();
                            break;
                        } else if (mf0Var.f40497o0.R.getTag() == null) {
                            mf0Var.x();
                            break;
                        }
                    }
                }
                break;
            case 9:
                hg0 hg0Var = (hg0) this.f43151b;
                Context context4 = (Context) this.f43152c;
                Toast toast = hg0Var.K;
                if (toast != null) {
                    toast.cancel();
                    hg0Var.K = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (hg0Var.I <= 0 || jCurrentTimeMillis - hg0Var.J <= 1500) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    hg0Var.I = 0;
                }
                int i26 = hg0Var.I + 1;
                hg0Var.I = i26;
                hg0Var.J = jCurrentTimeMillis;
                if (i26 >= 5) {
                    hg0Var.I = i10;
                    hg0Var.J = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var.getContext());
                    alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new kv(hg0Var, 1));
                    alertDialog$Builder4.o();
                } else if (i26 > 1) {
                    Toast toastMakeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i26, new Object[0]), 0);
                    hg0Var.K = toastMakeText;
                    toastMakeText.show();
                }
                break;
            case 10:
                ti0 ti0Var = (ti0) this.f43151b;
                MessageObject messageObject = (MessageObject) this.f43152c;
                vi0 vi0Var = ti0Var.d;
                if (!vi0Var.a0(messageObject)) {
                    vi0Var.getOrCreateStoryViewer().G(vi0Var.getParentActivity(), messageObject.storyItem, jh.b7.a(vi0Var.f43472f));
                    break;
                }
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43151b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f43152c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.f35575s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.g6.f23198l6 : org.telegram.ui.ActionBar.g6.H6, false));
                break;
            case 12:
                do0.h0((do0) this.f43151b, (String) this.f43152c, view);
                break;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.f43151b;
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.f43152c;
                if (photoViewer.P4 != null) {
                    b70Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f35661i4;
                    if (n2Var2 instanceof rn) {
                        ((rn) n2Var2).J9(photoViewer.P4, false, true);
                    }
                    we.e.r(photoViewer.A, Uri.parse(photoViewer.P4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f43151b;
                Activity activity = (Activity) this.f43152c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer2.H1() && !photoViewer2.f35735r) {
                    int i27 = photoViewer2.L4;
                    if (i27 >= 0 && i27 < photoViewer2.f35608c7.size()) {
                        Object obj = photoViewer2.f35608c7.get(photoViewer2.L4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f35631f1.setPhotoState(photoEntry.isHighQuality());
                                boolean zIsHighQuality = photoEntry.isHighQuality();
                                lh.w3 w3Var = photoViewer2.f35640g1;
                                if (w3Var != null) {
                                    w3Var.e(true);
                                    photoViewer2.f35640g1 = null;
                                }
                                if (photoViewer2.A != null) {
                                    photoViewer2.f35640g1 = new lh.w3(photoViewer2.A, 3);
                                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(zIsHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    spannableStringBuilderAppend.setSpan(new org.telegram.ui.Components.cq(zIsHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.f35640g1.t(spannableStringBuilderAppend);
                                    photoViewer2.f35583a0.addView(photoViewer2.f35640g1, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f35640g1.setTranslationY(photoViewer2.L0.getTranslationY());
                                    photoViewer2.f35640g1.n(0.0f, (photoViewer2.f35631f1.getWidth() / 2.0f) + photoViewer2.f35631f1.getX() + photoViewer2.D0.getX());
                                    lh.w3 w3Var2 = photoViewer2.f35640g1;
                                    w3Var2.f16984h0 = new zg(i15, w3Var2);
                                    w3Var2.d = 3500L;
                                    w3Var2.v();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                            }
                        }
                    }
                    if (photoViewer2.f35631f1.getTag() != null) {
                        photoViewer2.Y2(true);
                        photoViewer2.p2(1);
                        break;
                    } else if (photoViewer2.f35638f8) {
                        if (photoViewer2.f35658i1 == null) {
                            ut0 ut0Var = photoViewer2.f35583a0;
                            org.telegram.ui.Components.g11 g11Var = new org.telegram.ui.Components.g11(activity);
                            g11Var.d = new org.telegram.ui.Components.up0(g11Var, 17);
                            g11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            g11Var.setTextColor(-1);
                            g11Var.setTextSize(1, 14.0f);
                            g11Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            g11Var.setGravity(16);
                            ut0Var.addView(g11Var, h7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            g11Var.setVisibility(8);
                            photoViewer2.f35658i1 = g11Var;
                        }
                        photoViewer2.f35658i1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.g11 g11Var2 = photoViewer2.f35658i1;
                        org.telegram.ui.Components.y51 y51Var = photoViewer2.f35631f1;
                        org.telegram.ui.Components.up0 up0Var = g11Var2.d;
                        if (y51Var != null) {
                            g11Var2.f28500a = y51Var;
                            g11Var2.a();
                            g11Var2.f28502c = true;
                            AndroidUtilities.cancelRunOnUIThread(up0Var);
                            AndroidUtilities.runOnUIThread(up0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = g11Var2.f28501b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                g11Var2.f28501b.cancel();
                                g11Var2.f28501b = null;
                            }
                            if (g11Var2.getVisibility() != 0) {
                                g11Var2.setAlpha(0.0f);
                                g11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = g11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                g11Var2.f28501b = listener;
                                listener.start();
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.Components.b70) this.f43151b).K((org.telegram.ui.Components.b70) this.f43152c);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43151b;
                ((AlertDialog$Builder) this.f43152c).f22702a.H0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i11 = 30;
                } else if (num2.intValue() == 1) {
                    i11 = 90;
                } else if (num2.intValue() == 2) {
                    i11 = 182;
                } else if (num2.intValue() == 3) {
                    i11 = 365;
                } else if (num2.intValue() == 4) {
                    i11 = 548;
                } else {
                    i11 = num2.intValue() == 5 ? 730 : 0;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.f22747c0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i11;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new lr0(privacySettingsActivity, b2Var, setaccountttl, i15));
                break;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.f43151b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.f43152c;
                profileActivity.getClass();
                org.telegram.ui.Components.ec.e();
                we.e.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f43151b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43152c;
                long j10 = profileActivity2.f35923a1;
                long j11 = profileActivity2.A1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.C2;
                dq dqVar = new dq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                dqVar.T0 = new jy0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                break;
            case 19:
                j11 j11Var = (j11) this.f43151b;
                Context context5 = (Context) this.f43152c;
                StringBuilder sb2 = new StringBuilder();
                String string3 = j11Var.f39223a[0].getText().toString();
                String string4 = j11Var.f39223a[3].getText().toString();
                String string5 = j11Var.f39223a[2].getText().toString();
                String string6 = j11Var.f39223a[1].getText().toString();
                String string7 = j11Var.f39223a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(string3)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(string3, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(string6)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(string6, "UTF-8"));
                    }
                    if (j11Var.v == 1) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(string7, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(string5)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(string5, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(string4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(string4, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str);
                        sbO.append(sb2.toString());
                        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(context5, LocaleController.getString(R.string.ShareQrCode), sbO.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        yh0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        j11Var.showDialog(yh0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 20:
                p41 p41Var = (p41) this.f43151b;
                Context context6 = (Context) this.f43152c;
                if (p41Var.f43618w == null) {
                    boolean[] zArr = new boolean[1];
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                    nl0 nl0Var = new nl0(i13, p41Var, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.y4.f34802a;
                    if (context6 != null) {
                        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false);
                        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false);
                        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
                        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                        int iW4 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context6, null);
                        z2Var2.a();
                        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context6, null);
                        fc0Var.setTextColor(iW0);
                        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        fc0Var.setItemCount(5);
                        org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context6, null);
                        a4Var.setItemCount(5);
                        a4Var.setTextColor(iW0);
                        a4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context6, null);
                        b4Var.setItemCount(5);
                        b4Var.setTextColor(iW0);
                        b4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(context6, fc0Var, a4Var, b4Var, 3);
                        r3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        r3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(iW0);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new kh.e(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        cg.q qVar = new cg.q(context6, 18);
                        linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                        fc0Var.setMinValue(0);
                        fc0Var.setMaxValue(365);
                        fc0Var.setWrapSelectorWheel(false);
                        int i28 = 16;
                        fc0Var.setFormatter(new fr(i28));
                        ag.l0 l0Var = new ag.l0(fc0Var, a4Var, b4Var, i28);
                        fc0Var.setOnValueChangedListener(l0Var);
                        a4Var.setMinValue(0);
                        a4Var.setMaxValue(23);
                        linearLayout.addView(a4Var, h7.z5.l(0.2f, 0, 270));
                        a4Var.setFormatter(new fr(17));
                        a4Var.setOnValueChangedListener(l0Var);
                        b4Var.setMinValue(0);
                        b4Var.setMaxValue(59);
                        b4Var.setValue(0);
                        b4Var.setFormatter(new fr(18));
                        linearLayout.addView(b4Var, h7.z5.l(0.3f, 0, 270));
                        b4Var.setOnValueChangedListener(l0Var);
                        if (jCurrentTimeMillis2 > 0 && jCurrentTimeMillis2 != 2147483646) {
                            long j12 = jCurrentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                b4Var.setValue(calendar.get(12));
                                a4Var = a4Var;
                                a4Var.setValue(calendar.get(11));
                                fc0Var.setValue(timeInMillis);
                            } else {
                                a4Var = a4Var;
                            }
                        }
                        org.telegram.ui.Components.a4 a4Var2 = a4Var;
                        org.telegram.ui.Components.y4.g(null, null, 0L, 0L, 0, fc0Var, a4Var2, b4Var);
                        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        qVar.setGravity(17);
                        qVar.setTextColor(iW2);
                        qVar.setTextSize(1, 14.0f);
                        qVar.setTypeface(AndroidUtilities.bold());
                        int iDp = AndroidUtilities.dp(8.0f);
                        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW3, iW4, iW4));
                        qVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
                        qVar.setOnClickListener(new cg.f(fc0Var, (org.telegram.ui.Components.fc0) a4Var2, (org.telegram.ui.Components.fc0) b4Var, calendar, (Object) nl0Var, z2Var2, 2));
                        z2Var3.b(r3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var3.f23994a;
                        e3Var.show();
                        e3Var.setBackgroundColor(iW1);
                        e3Var.fixNavigationBar(iW1);
                        z2Var = z2Var3;
                    }
                    z2Var.f23994a.setOnHideListener(new cg.g(12, p41Var, zArr));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f23994a;
                    e3Var2.show();
                    p41Var.f43618w = e3Var2;
                    p41Var.c(false);
                    break;
                }
                break;
            case 21:
                n61 n61Var = (n61) this.f43151b;
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.f43152c;
                if (n61Var.V.g() != 0) {
                    icVar.run(new ArrayList(n61Var.W.values()));
                    n61Var.dismiss();
                    break;
                }
                break;
            case 22:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f43151b;
                ((AlertDialog$Builder) this.f43152c).f22702a.H0.run();
                Integer num3 = (Integer) view.getTag();
                if (num3.intValue() == 0) {
                    i12 = 7;
                } else if (num3.intValue() == 1) {
                    i12 = 90;
                } else if (num3.intValue() == 2) {
                    i12 = 183;
                } else {
                    i12 = num3.intValue() == 3 ? 365 : 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i12;
                sessionsActivity.v = i12;
                j71 j71Var = sessionsActivity.f36176a;
                if (j71Var != null) {
                    j71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new jh.m5(i14));
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f43151b;
                editTextBoldCursor.setText(hh.oa.M0(((Long) this.f43152c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 24:
                v81 v81Var = (v81) this.f43151b;
                n91 n91Var = (n91) this.f43152c;
                q91 q91Var = v81Var.Z;
                q91Var.getOrCreateStoryViewer().C(q91Var.getParentActivity(), n91Var.b(), q91Var.f41577v0, jh.b7.a(q91Var.O));
                break;
            case 25:
                a(view);
                break;
            case 26:
                y91 y91Var = (y91) this.f43151b;
                gy gyVar2 = (gy) this.f43152c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gyVar2.getParentActivity());
                alertDialog$Builder5.f22702a.N = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f22702a.P = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new nl0(19, y91Var, gyVar2));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder5.f22702a;
                gyVar2.showDialog(b2Var2);
                TextView textView2 = (TextView) b2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
                break;
            case 27:
                b(view);
                break;
            case 28:
                c(view);
                break;
            default:
                lh.d dVar = (lh.d) this.f43151b;
                int[] iArr = (int[]) this.f43152c;
                if (!dVar.J && (hVar = ci1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] bArrK = hVar.k();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f3198c);
                        String str2 = (String) hVar.f276c;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        j8.i0 i0Var = new j8.i0(t0Var, str2, "/tg-wear-auth/answer", bArrK);
                        t0Var.f3353b.d(0, i0Var);
                        y5.l.n(i0Var, j8.k0.f12800a).addOnSuccessListener(new b7(hVar, dVar, iArr, 24)).addOnFailureListener(new bi1(dVar, i16));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        dVar.setLoading(false);
                    }
                }
                break;
        }
    }
}
