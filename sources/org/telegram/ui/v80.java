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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class v80 implements View.OnClickListener {
    public final int f43404a;
    public final Object f43405b;
    public final Object f43406c;

    public v80(int i9, Object obj, Object obj2) {
        this.f43404a = i9;
        this.f43405b = obj;
        this.f43406c = obj2;
    }

    private final void a(View view) {
        tc1 tc1Var = (tc1) this.f43405b;
        Context context = (Context) this.f43406c;
        if (tc1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(tc1Var.getParentActivity(), null);
        a3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false), 1, 20.0f);
        linearLayout.addView(textView, g7.e6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new jh.d(2));
        a3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.f6.F.size();
        for (int i9 = 0; i9 < size; i9++) {
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) org.telegram.ui.ActionBar.f6.F.get(i9);
            TLRPC.TL_theme tL_theme = e6Var.B;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(e6Var);
            }
        }
        ua1 ua1Var = new ua1(context, tc1Var, arrayList, new ArrayList(), a3Var);
        linearLayout.addView(ua1Var, g7.e6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        ua1Var.x1(tc1Var.fragmentView.getMeasuredWidth());
        tc1Var.showDialog(a3Var.f22713a);
    }

    private final void b(View view) {
        long j10;
        mh1 mh1Var = (mh1) this.f43405b;
        Context context = (Context) this.f43406c;
        bg.g3 g3Var = mh1Var.I;
        if (g3Var != null) {
            g3Var.dismiss();
            mh1Var.I = null;
        }
        bg.g3 g3Var2 = new bg.g3(context, mh1Var.f40428a, null, 4, new ih.j0());
        TLRPC.User user = mh1Var.f40434c;
        long j11 = 0;
        if (user != null) {
            j10 = user.f22527id;
        } else {
            j10 = 0;
        }
        TLRPC.User user2 = mh1Var.d;
        if (user2 != null) {
            j11 = user2.f22527id;
        }
        long[] jArr = {j10, j11};
        for (int i9 = 0; i9 < 2; i9++) {
            g3Var2.f1796y0.add(Long.valueOf(jArr[i9]));
        }
        g3Var2.g0(false, true);
        g3Var2.f1797z0 = new org.telegram.ui.Components.qr(1);
        mh1Var.I = g3Var2;
        g3Var2.show();
    }

    private final void c(View view) {
        b3.b bVar;
        kh.d dVar = (kh.d) this.f43405b;
        int[] iArr = (int[]) this.f43406c;
        if (dVar.J || (bVar = di1.d) == null) {
            return;
        }
        dVar.setLoading(true);
        Context applicationContext = view.getContext().getApplicationContext();
        try {
            byte[] j10 = bVar.j();
            com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f2753c).h;
            i8.j0 j0Var = new i8.j0(t0Var, (String) bVar.f1415c, "/tg-wear-auth/answer", j10);
            t0Var.f2908b.d(0, j0Var);
            x5.l.n(j0Var, i8.l0.f11003a).addOnSuccessListener(new a7(bVar, dVar, iArr, 24)).addOnFailureListener(new ci1(dVar, 0));
        } catch (Exception e10) {
            FileLog.e(e10);
            dVar.setLoading(false);
        }
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i9;
        char c10;
        char c11;
        String formatString;
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
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        boolean z11 = false;
        switch (this.f43404a) {
            case 0:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f43406c;
                Pattern pattern = LaunchActivity.f35493x1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f43405b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i19 = 0; i19 < 2; i19++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i19];
                    if (i19 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f24900a.a(z10, true);
                }
                return;
            case 1:
                org.telegram.ui.Components.y4.y((Context) this.f43406c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ra0((bb0) this.f43405b, 0));
                return;
            case 2:
                bb0 bb0Var = (bb0) this.f43405b;
                Runnable[] runnableArr = (Runnable[]) this.f43406c;
                if (bb0Var.f36811e == null) {
                    ya0 ya0Var = bb0Var.f36812f;
                    if (ya0Var.f25711e.h) {
                        int i20 = -bb0Var.J;
                        bb0Var.J = i20;
                        AndroidUtilities.shakeViewSpring(ya0Var, i20);
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    Switch r42 = t8Var.f25711e;
                    t8Var.setChecked(!r42.h);
                    za0 za0Var = bb0Var.f36814r;
                    if (r42.h) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    za0Var.setVisibility(i9);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        bb0Var.f36812f.setChecked(false);
                        bb0Var.f36812f.setCheckBoxIcon(R.drawable.permission_locked);
                        bb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        qa0 qa0Var = new qa0(bb0Var, 0);
                        runnableArr[0] = qa0Var;
                        AndroidUtilities.runOnUIThread(qa0Var, 60L);
                        return;
                    }
                    bb0Var.f36812f.setCheckBoxIcon(0);
                    bb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    qa0 qa0Var2 = new qa0(bb0Var, 1);
                    runnableArr[0] = qa0Var2;
                    AndroidUtilities.runOnUIThread(qa0Var2);
                    return;
                }
                return;
            case 3:
                pc0 pc0Var = (pc0) this.f43405b;
                pc0Var.q0((jc0) this.f43406c);
                hc0 hc0Var = pc0Var.E0;
                if (hc0Var != null) {
                    hc0Var.dismiss();
                    return;
                }
                return;
            case 4:
                pc0 pc0Var2 = ((mc0) this.f43405b).f40391b;
                pc0Var2.getClass();
                pc0Var2.B0.d(((oc0) this.f43406c).f41055c, pc0Var2.C0, true, 0, 0L);
                pc0Var2.finishFragment();
                return;
            case 5:
                pd0 pd0Var = (pd0) this.f43405b;
                Context context = (Context) this.f43406c;
                String string = pd0Var.f41492y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f34062a |= 256;
                    obj.f34063b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f34064c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = pd0Var.C;
                int i23 = i22 / 86400;
                int i24 = i22 % 86400;
                int i25 = i24 / 3600;
                int i26 = (i24 % 3600) / 60;
                if (i23 == 0 && i25 == 0) {
                    i26 = Math.max(1, i26);
                }
                if (i23 != 0 && i25 != 0) {
                    c10 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i23, new Object[0]), LocaleController.formatPluralString("Hours", i25, new Object[0]));
                    c11 = 1;
                } else {
                    c10 = 0;
                    if (i25 != 0 && i26 != 0) {
                        c11 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i25, new Object[0]), LocaleController.formatPluralString("Minutes", i26, new Object[0]));
                    } else {
                        c11 = 1;
                        if (i23 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i23, new Object[0]));
                        } else if (i25 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i23, new Object[0]));
                        } else {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i26, new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = formatString;
                alertDialog$Builder.f22702a.P = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new wt(pd0Var, 17));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 6:
                yd0 yd0Var = (yd0) this.f43405b;
                Context context2 = (Context) this.f43406c;
                fg0 fg0Var = yd0Var.f44841y;
                if (fg0Var.R.getTag() == null) {
                    if (yd0Var.f44836n.has_recovery) {
                        fg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new wd0(yd0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(yd0Var.f44831a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new wt(yd0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 7:
                jf0 jf0Var = (jf0) this.f43405b;
                Context context3 = (Context) this.f43406c;
                Bundle bundle = jf0Var.f39484k0;
                if (bundle != null && (tL_auth_sentCode = jf0Var.f39485l0) != null) {
                    jf0Var.f39488o0.g1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!jf0Var.W) {
                    hf0 hf0Var = jf0Var.v;
                    if ((hf0Var == null || hf0Var.getVisibility() == 8) && !jf0Var.f39477e0) {
                        if (jf0Var.f39474c0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = jf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = jf0Var.f39473c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            jf0Var.f39488o0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, jf0Var.f39471b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new yr(28, jf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new xe0(jf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (jf0Var.f39488o0.R.getTag() == null) {
                            jf0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                eg0 eg0Var = (eg0) this.f43405b;
                Context context4 = (Context) this.f43406c;
                Toast toast = eg0Var.K;
                if (toast != null) {
                    toast.cancel();
                    eg0Var.K = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (eg0Var.I > 0 && currentTimeMillis - eg0Var.J > 1500) {
                    i11 = 0;
                    eg0Var.I = 0;
                } else {
                    i11 = 0;
                }
                int i27 = eg0Var.I + 1;
                eg0Var.I = i27;
                eg0Var.J = currentTimeMillis;
                if (i27 >= 5) {
                    eg0Var.I = i11;
                    eg0Var.J = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eg0Var.getContext());
                    alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i12 = R.string.DebugMenuDisableLogs;
                    } else {
                        i12 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i12), LocaleController.getString(R.string.DebugSendLogs)}, new hv(eg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i27 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i27, new Object[0]), 0);
                    eg0Var.K = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 9:
                MessageObject messageObject = (MessageObject) this.f43406c;
                ti0 ti0Var = ((ri0) this.f43405b).d;
                if (!ti0Var.Z(messageObject)) {
                    ti0Var.getOrCreateStoryViewer().F(ti0Var.getParentActivity(), messageObject.storyItem, ih.e7.a(ti0Var.f43015f));
                    return;
                }
                return;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43405b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f43406c;
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
                ImageView imageView = passcodeActivity.f35572s;
                if (atomicBoolean.get()) {
                    i14 = org.telegram.ui.ActionBar.f6.f23144l6;
                } else {
                    i14 = org.telegram.ui.ActionBar.f6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                return;
            case 11:
                co0.g0((co0) this.f43405b, (String) this.f43406c, view);
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) this.f43405b;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.f43406c;
                if (photoViewer.P4 != null) {
                    x60Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.f35658i4;
                    if (o2Var instanceof qn) {
                        ((qn) o2Var).J9(photoViewer.P4, false, true);
                    }
                    ve.e.r(photoViewer.A, Uri.parse(photoViewer.P4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f43405b;
                Activity activity = (Activity) this.f43406c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer2.H1() && !photoViewer2.f35732r) {
                    int i28 = photoViewer2.L4;
                    if (i28 >= 0 && i28 < photoViewer2.f35605c7.size()) {
                        Object obj2 = photoViewer2.f35605c7.get(photoViewer2.L4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f35628f1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                kh.x3 x3Var = photoViewer2.f35637g1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.f35637g1 = null;
                                }
                                if (photoViewer2.A != null) {
                                    photoViewer2.f35637g1 = new kh.x3(photoViewer2.A, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i15 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i15 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i15));
                                    if (isHighQuality) {
                                        i16 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i16 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.eq(i16, 0), 0, 1, 33);
                                    photoViewer2.f35637g1.t(append);
                                    photoViewer2.f35580a0.addView(photoViewer2.f35637g1, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f35637g1.setTranslationY(photoViewer2.L0.getTranslationY());
                                    photoViewer2.f35637g1.n(0.0f, (photoViewer2.f35628f1.getWidth() / 2.0f) + photoViewer2.f35628f1.getX() + photoViewer2.D0.getX());
                                    kh.x3 x3Var2 = photoViewer2.f35637g1;
                                    x3Var2.f16352h0 = new xg(2, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.v();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f35628f1.getTag() == null) {
                        if (photoViewer2.f35635f8) {
                            if (photoViewer2.f35655i1 == null) {
                                tt0 tt0Var = photoViewer2.f35580a0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.tp0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                tt0Var.addView((View) textView, g7.e6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f35655i1 = textView;
                            }
                            photoViewer2.f35655i1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.e11 e11Var = photoViewer2.f35655i1;
                            org.telegram.ui.Components.w51 w51Var = photoViewer2.f35628f1;
                            org.telegram.ui.Components.tp0 tp0Var = e11Var.d;
                            if (w51Var != null) {
                                e11Var.f27898a = w51Var;
                                e11Var.a();
                                e11Var.f27900c = true;
                                AndroidUtilities.cancelRunOnUIThread(tp0Var);
                                AndroidUtilities.runOnUIThread(tp0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = e11Var.f27899b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    e11Var.f27899b.cancel();
                                    e11Var.f27899b = null;
                                }
                                if (e11Var.getVisibility() != 0) {
                                    e11Var.setAlpha(0.0f);
                                    e11Var.setVisibility(0);
                                    ViewPropertyAnimator listener = e11Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    e11Var.f27899b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.Y2(true);
                    photoViewer2.p2(1);
                    return;
                }
                return;
            case 14:
                ((org.telegram.ui.Components.x60) this.f43405b).K((org.telegram.ui.Components.x60) this.f43406c);
                return;
            case 15:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43405b;
                ((AlertDialog$Builder) this.f43406c).f22702a.H0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i17 = 30;
                } else if (num2.intValue() == 1) {
                    i17 = 90;
                } else if (num2.intValue() == 2) {
                    i17 = 182;
                } else if (num2.intValue() == 3) {
                    i17 = 365;
                } else if (num2.intValue() == 4) {
                    i17 = 548;
                } else if (num2.intValue() == 5) {
                    i17 = 730;
                } else {
                    i17 = 0;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.f22766c0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new kr0(privacySettingsActivity, c2Var, setaccountttl, 2));
                return;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.f43405b;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                ve.e.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f43406c).url);
                return;
            case 17:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f43405b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43406c;
                long j10 = profileActivity2.f35920a1;
                long j11 = profileActivity2.A1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.C2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                bq bqVar = new bq(j10, j11, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                bqVar.T0 = new jy0(profileActivity2, chat, bqVar);
                profileActivity2.presentFragment(bqVar);
                return;
            case 18:
                k11 k11Var = (k11) this.f43405b;
                Context context5 = (Context) this.f43406c;
                StringBuilder sb2 = new StringBuilder();
                String obj3 = k11Var.f39665a[0].getText().toString();
                String obj4 = k11Var.f39665a[3].getText().toString();
                String obj5 = k11Var.f39665a[2].getText().toString();
                String obj6 = k11Var.f39665a[1].getText().toString();
                String obj7 = k11Var.f39665a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj3)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj6)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    }
                    if (k11Var.v == 1) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj7, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj5)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder n10 = e2.c.n(str);
                        n10.append(sb2.toString());
                        org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(context5, LocaleController.getString(R.string.ShareQrCode), n10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        wh0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        k11Var.showDialog(wh0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                q41 q41Var = (q41) this.f43405b;
                Context context6 = (Context) this.f43406c;
                if (q41Var.f44375w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    nl0 nl0Var = new nl0(17, q41Var, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.y4.f34847a;
                    if (context6 != null) {
                        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false);
                        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false);
                        int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context6, null);
                        a3Var2.a();
                        org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(context6, null);
                        bc0Var.setTextColor(w02);
                        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        bc0Var.setItemCount(5);
                        org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(context6, null);
                        bc0Var2.setItemCount(5);
                        bc0Var2.setTextColor(w02);
                        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.bc0 bc0Var3 = new org.telegram.ui.Components.bc0(context6, null);
                        bc0Var3.setItemCount(5);
                        bc0Var3.setTextColor(w02);
                        bc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(context6, bc0Var, bc0Var2, bc0Var3, 3);
                        r3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        r3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new jh.d(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bg.t tVar = new bg.t(context6, 18);
                        linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                        bc0Var.setMinValue(0);
                        bc0Var.setMaxValue(365);
                        bc0Var.setWrapSelectorWheel(false);
                        bc0Var.setFormatter(new tr(11));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(bc0Var, bc0Var2, bc0Var3, 16);
                        bc0Var.setOnValueChangedListener(aVar);
                        bc0Var2.setMinValue(0);
                        bc0Var2.setMaxValue(23);
                        linearLayout.addView(bc0Var2, g7.e6.l(0.2f, 0, 270));
                        bc0Var2.setFormatter(new tr(12));
                        bc0Var2.setOnValueChangedListener(aVar);
                        bc0Var3.setMinValue(0);
                        bc0Var3.setMaxValue(59);
                        bc0Var3.setValue(0);
                        bc0Var3.setFormatter(new tr(13));
                        linearLayout.addView(bc0Var3, g7.e6.l(0.3f, 0, 270));
                        bc0Var3.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                bc0Var3.setValue(calendar.get(12));
                                bc0Var2.setValue(calendar.get(11));
                                bc0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.y4.g(null, null, 0L, 0L, 0, bc0Var, bc0Var2, bc0Var3);
                        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        tVar.setGravity(17);
                        tVar.setTextColor(w04);
                        tVar.setTextSize(1, 14.0f);
                        tVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w05, w06, w06));
                        tVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                        tVar.setOnClickListener(new bg.h(bc0Var, bc0Var2, bc0Var3, calendar, (Object) nl0Var, a3Var2, 2));
                        a3Var2.b(r3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.f22713a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var2;
                    }
                    a3Var.f22713a.setOnHideListener(new bg.j(13, q41Var, zArr));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f22713a;
                    f3Var2.show();
                    q41Var.f44375w = f3Var2;
                    q41Var.c(false);
                    return;
                }
                return;
            case 20:
                o61 o61Var = (o61) this.f43405b;
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) this.f43406c;
                if (o61Var.V.g() != 0) {
                    kcVar.run(new ArrayList(o61Var.W.values()));
                    o61Var.dismiss();
                    return;
                }
                return;
            case 21:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f43405b;
                ((AlertDialog$Builder) this.f43406c).f22702a.H0.run();
                Integer num3 = (Integer) view.getTag();
                if (num3.intValue() == 0) {
                    i18 = 7;
                } else if (num3.intValue() == 1) {
                    i18 = 90;
                } else if (num3.intValue() == 2) {
                    i18 = 183;
                } else if (num3.intValue() == 3) {
                    i18 = 365;
                } else {
                    i18 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.v = i18;
                k71 k71Var = sessionsActivity.f36173a;
                if (k71Var != null) {
                    k71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ih.q5(5));
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f43405b;
                editTextBoldCursor2.setText(gh.oa.M0(((Long) this.f43406c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 23:
                s91 s91Var = ((x81) this.f43405b).Z;
                s91Var.getOrCreateStoryViewer().C(s91Var.getParentActivity(), ((p91) this.f43406c).b(), s91Var.f42634v0, ih.e7.a(s91Var.O));
                return;
            case 24:
                b91 b91Var = (b91) this.f43405b;
                sf.f fVar = (sf.f) this.f43406c;
                int i29 = b91Var.f36797c;
                c91 c91Var = b91Var.d;
                org.telegram.ui.Components.d00 d00Var = b91Var.f36795a;
                if (d00Var.f27610c) {
                    ArrayList arrayList = c91Var.f37132n;
                    qf.g gVar = c91Var.f37129c;
                    int size = arrayList.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 < size) {
                            if (i30 == i29 || !((b91) arrayList.get(i30)).f36795a.f27610c || !((b91) arrayList.get(i30)).f36795a.f27609b) {
                                i30++;
                            }
                        } else {
                            z11 = true;
                        }
                    }
                    c91Var.f();
                    if (z11) {
                        AndroidUtilities.shakeView(d00Var);
                        return;
                    }
                    d00Var.setChecked(!d00Var.f27609b);
                    fVar.f47557n = d00Var.f27609b;
                    c91Var.f37128b.z();
                    if (c91Var.f37133r.f37871c > 0 && i29 < gVar.d.size()) {
                        ((sf.f) gVar.d.get(i29)).f47557n = d00Var.f27609b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                dy dyVar = (dy) this.f43406c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(dyVar.getParentActivity());
                alertDialog$Builder5.f22702a.N = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f22702a.P = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new nl0(19, (aa1) this.f43405b, dyVar));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder5.f22702a;
                dyVar.showDialog(c2Var2);
                TextView textView3 = (TextView) c2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    return;
                }
                return;
            case 26:
                a(view);
                return;
            case 27:
                b(view);
                return;
            case 28:
                c(view);
                return;
            default:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f43405b;
                kVar.f43906b = true;
                ((z) this.f43406c).run();
                kVar.f43913w.U2.N(true);
                return;
        }
    }
}
