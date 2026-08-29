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
public final class t70 implements View.OnClickListener {
    public final int f42571a;
    public final Object f42572b;
    public final Object f42573c;

    public t70(int i10, Object obj, Object obj2) {
        this.f42571a = i10;
        this.f42572b = obj;
        this.f42573c = obj2;
    }

    private final void a(View view) {
        c91 c91Var = (c91) this.f42572b;
        vf.f fVar = (vf.f) this.f42573c;
        int i10 = c91Var.f37058c;
        d91 d91Var = c91Var.d;
        org.telegram.ui.Components.o00 o00Var = c91Var.f37056a;
        if (o00Var.f31207c) {
            ArrayList arrayList = d91Var.f37429n;
            tf.g gVar = d91Var.f37426c;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (i11 != i10 && ((c91) arrayList.get(i11)).f37056a.f31207c && ((c91) arrayList.get(i11)).f37056a.f31206b) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            d91Var.f();
            if (z10) {
                AndroidUtilities.shakeView(o00Var);
                return;
            }
            o00Var.setChecked(!o00Var.f31206b);
            fVar.f49583n = o00Var.f31206b;
            d91Var.f37425b.z();
            if (d91Var.f37430r.f38071c > 0 && i10 < gVar.d.size()) {
                ((vf.f) gVar.d.get(i10)).f49583n = o00Var.f31206b;
                gVar.z();
            }
        }
    }

    private final void b(View view) {
        vc1 vc1Var = (vc1) this.f42572b;
        Context context = (Context) this.f42573c;
        if (vc1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(vc1Var.getParentActivity(), null);
        a3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
        linearLayout.addView(textView, i7.f6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new mh.d(2));
        a3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i10);
            TLRPC.TL_theme tL_theme = f6Var.B;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(f6Var);
            }
        }
        va1 va1Var = new va1(context, vc1Var, arrayList, new ArrayList(), a3Var);
        linearLayout.addView(va1Var, i7.f6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        va1Var.x1(vc1Var.fragmentView.getMeasuredWidth());
        vc1Var.showDialog(a3Var.f22729a);
    }

    private final void c(View view) {
        long j10;
        oh1 oh1Var = (oh1) this.f42572b;
        Context context = (Context) this.f42573c;
        eg.w2 w2Var = oh1Var.I;
        if (w2Var != null) {
            w2Var.dismiss();
            oh1Var.I = null;
        }
        eg.w2 w2Var2 = new eg.w2(context, oh1Var.f41136a, null, 4, new lh.h0());
        TLRPC.User user = oh1Var.f41142c;
        long j11 = 0;
        if (user != null) {
            j10 = user.f22539id;
        } else {
            j10 = 0;
        }
        TLRPC.User user2 = oh1Var.d;
        if (user2 != null) {
            j11 = user2.f22539id;
        }
        long[] jArr = {j10, j11};
        for (int i10 = 0; i10 < 2; i10++) {
            w2Var2.f6185y0.add(Long.valueOf(jArr[i10]));
        }
        w2Var2.h0(false, true);
        w2Var2.f6186z0 = new org.telegram.ui.Components.ur(1);
        oh1Var.I = w2Var2;
        w2Var2.show();
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        char c3;
        char c6;
        String formatString;
        int i11;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str;
        int i19;
        a5.j jVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        switch (this.f42571a) {
            case 0:
                x70 x70Var = (x70) this.f42572b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f42573c;
                x70Var.M.dismiss();
                if (x70Var.f44510b0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i20 = x70Var.V;
                    if (i20 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i20 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    fy fyVar = new fy(bundle);
                    fyVar.f38379y2 = new xr(14, x70Var, fyVar);
                    o2Var.presentFragment(fyVar);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", x70Var.V);
                a6 a6Var = new a6(bundle2);
                a6Var.d = x70Var.f44510b0;
                a6Var.U();
                o2Var.presentFragment(a6Var);
                return;
            case 1:
                org.telegram.ui.Cells.o4[] o4VarArr = (org.telegram.ui.Cells.o4[]) this.f42573c;
                Pattern pattern = LaunchActivity.f35560x1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f42572b)[0] = ((org.telegram.ui.Cells.o4) view).getCurrentLocale();
                for (int i21 = 0; i21 < 2; i21++) {
                    org.telegram.ui.Cells.o4 o4Var = o4VarArr[i21];
                    if (i21 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o4Var.f24799a.a(z10, true);
                }
                return;
            case 2:
                org.telegram.ui.Components.c5.y((Context) this.f42573c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ua0((eb0) this.f42572b, 0));
                return;
            case 3:
                eb0 eb0Var = (eb0) this.f42572b;
                Runnable[] runnableArr = (Runnable[]) this.f42573c;
                if (eb0Var.f37777e == null) {
                    bb0 bb0Var = eb0Var.f37778f;
                    if (bb0Var.f25083e.h) {
                        int i22 = -eb0Var.J;
                        eb0Var.J = i22;
                        AndroidUtilities.shakeViewSpring(bb0Var, i22);
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    Switch r42 = q8Var.f25083e;
                    q8Var.setChecked(!r42.h);
                    cb0 cb0Var = eb0Var.f37780r;
                    if (r42.h) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    cb0Var.setVisibility(i10);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        eb0Var.f37778f.setChecked(false);
                        eb0Var.f37778f.setCheckBoxIcon(R.drawable.permission_locked);
                        eb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        ta0 ta0Var = new ta0(eb0Var, 0);
                        runnableArr[0] = ta0Var;
                        AndroidUtilities.runOnUIThread(ta0Var, 60L);
                        return;
                    }
                    eb0Var.f37778f.setCheckBoxIcon(0);
                    eb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    ta0 ta0Var2 = new ta0(eb0Var, 1);
                    runnableArr[0] = ta0Var2;
                    AndroidUtilities.runOnUIThread(ta0Var2);
                    return;
                }
                return;
            case 4:
                rc0 rc0Var = (rc0) this.f42572b;
                rc0Var.r0((lc0) this.f42573c);
                jc0 jc0Var = rc0Var.E0;
                if (jc0Var != null) {
                    jc0Var.dismiss();
                    return;
                }
                return;
            case 5:
                rc0 rc0Var2 = ((oc0) this.f42572b).f41090b;
                rc0Var2.getClass();
                rc0Var2.B0.d(((qc0) this.f42573c).f41622c, rc0Var2.C0, true, 0, 0L);
                rc0Var2.finishFragment();
                return;
            case 6:
                pd0 pd0Var = (pd0) this.f42572b;
                Context context = (Context) this.f42573c;
                String string = pd0Var.f41381y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f29024a |= 256;
                    obj.f29025b = indexOf;
                    int i23 = lastIndexOf + 1;
                    obj.f29026c = i23;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i01(obj, 0), indexOf, i23, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i24 = pd0Var.C;
                int i25 = i24 / 86400;
                int i26 = i24 % 86400;
                int i27 = i26 / 3600;
                int i28 = (i26 % 3600) / 60;
                if (i25 == 0 && i27 == 0) {
                    i28 = Math.max(1, i28);
                }
                if (i25 != 0 && i27 != 0) {
                    c3 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i25, new Object[0]), LocaleController.formatPluralString("Hours", i27, new Object[0]));
                    c6 = 1;
                } else {
                    c3 = 0;
                    if (i27 != 0 && i28 != 0) {
                        c6 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]), LocaleController.formatPluralString("Minutes", i28, new Object[0]));
                    } else {
                        c6 = 1;
                        if (i25 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i25, new Object[0]));
                        } else if (i27 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i25, new Object[0]));
                        } else {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i28, new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c3] = spannableStringBuilder;
                charSequenceArr[c6] = formatString;
                alertDialog$Builder.f22714a.P = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new xt(pd0Var, 17));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 7:
                xd0 xd0Var = (xd0) this.f42572b;
                Context context2 = (Context) this.f42573c;
                fg0 fg0Var = xd0Var.f44568y;
                if (fg0Var.R.getTag() == null) {
                    if (xd0Var.f44563n.has_recovery) {
                        fg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_auth_requestPasswordRecovery, new vd0(xd0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(xd0Var.f44558a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new xt(xd0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 8:
                if0 if0Var = (if0) this.f42572b;
                Context context3 = (Context) this.f42573c;
                Bundle bundle3 = if0Var.f39245k0;
                if (bundle3 != null && (tL_auth_sentCode = if0Var.f39246l0) != null) {
                    if0Var.f39249o0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!if0Var.W) {
                    gf0 gf0Var = if0Var.v;
                    if ((gf0Var == null || gf0Var.getVisibility() == 8) && !if0Var.f39238e0) {
                        if (if0Var.f39235c0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = if0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = if0Var.f39234c;
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
                            if0Var.f39249o0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f22714a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, if0Var.f39232b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new xr(28, if0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new we0(if0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (if0Var.f39249o0.R.getTag() == null) {
                            if0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                eg0 eg0Var = (eg0) this.f42572b;
                Context context4 = (Context) this.f42573c;
                Toast toast = eg0Var.K;
                if (toast != null) {
                    toast.cancel();
                    eg0Var.K = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (eg0Var.I > 0 && currentTimeMillis - eg0Var.J > 1500) {
                    i12 = 0;
                    eg0Var.I = 0;
                } else {
                    i12 = 0;
                }
                int i29 = eg0Var.I + 1;
                eg0Var.I = i29;
                eg0Var.J = currentTimeMillis;
                if (i29 >= 5) {
                    eg0Var.I = i12;
                    eg0Var.J = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eg0Var.getContext());
                    alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new iv(eg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i29 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i29, new Object[0]), 0);
                    eg0Var.K = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 10:
                MessageObject messageObject = (MessageObject) this.f42573c;
                si0 si0Var = ((qi0) this.f42572b).d;
                if (!si0Var.a0(messageObject)) {
                    si0Var.getOrCreateStoryViewer().G(si0Var.getParentActivity(), messageObject.storyItem, lh.b7.a(si0Var.f42406f));
                    return;
                }
                return;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42572b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f42573c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i14 = 144;
                } else {
                    i14 = 128;
                }
                editTextBoldCursor.setInputType(i14 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f35639s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.g6.f23206l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.g6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                return;
            case 12:
                bo0.h0((bo0) this.f42572b, (String) this.f42573c, view);
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.f42572b;
                org.telegram.ui.Components.j70 j70Var = (org.telegram.ui.Components.j70) this.f42573c;
                if (photoViewer.P4 != null) {
                    j70Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer.f35724i4;
                    if (o2Var2 instanceof tn) {
                        ((tn) o2Var2).J9(photoViewer.P4, false, true);
                    }
                    ye.d.r(photoViewer.A, Uri.parse(photoViewer.P4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f42572b;
                Activity activity = (Activity) this.f42573c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer2.H1() && !photoViewer2.f35799r) {
                    int i30 = photoViewer2.L4;
                    if (i30 >= 0 && i30 < photoViewer2.f35671c7.size()) {
                        Object obj2 = photoViewer2.f35671c7.get(photoViewer2.L4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f35694f1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                nh.t3 t3Var = photoViewer2.f35703g1;
                                if (t3Var != null) {
                                    t3Var.e(true);
                                    photoViewer2.f35703g1 = null;
                                }
                                if (photoViewer2.A != null) {
                                    photoViewer2.f35703g1 = new nh.t3(photoViewer2.A, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i16 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i16 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i16));
                                    if (isHighQuality) {
                                        i17 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i17 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.iq(i17, 0), 0, 1, 33);
                                    photoViewer2.f35703g1.t(append);
                                    photoViewer2.f35647a0.addView(photoViewer2.f35703g1, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f35703g1.setTranslationY(photoViewer2.L0.getTranslationY());
                                    photoViewer2.f35703g1.n(0.0f, (photoViewer2.f35694f1.getWidth() / 2.0f) + photoViewer2.f35694f1.getX() + photoViewer2.D0.getX());
                                    nh.t3 t3Var2 = photoViewer2.f35703g1;
                                    t3Var2.f18597h0 = new wg(2, t3Var2);
                                    t3Var2.d = 3500L;
                                    t3Var2.v();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f35694f1.getTag() == null) {
                        if (photoViewer2.f35701f8) {
                            if (photoViewer2.f35721i1 == null) {
                                rt0 rt0Var = photoViewer2.f35647a0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.fq0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                rt0Var.addView((View) textView, i7.f6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f35721i1 = textView;
                            }
                            photoViewer2.f35721i1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.q11 q11Var = photoViewer2.f35721i1;
                            org.telegram.ui.Components.j61 j61Var = photoViewer2.f35694f1;
                            org.telegram.ui.Components.fq0 fq0Var = q11Var.d;
                            if (j61Var != null) {
                                q11Var.f31827a = j61Var;
                                q11Var.a();
                                q11Var.f31829c = true;
                                AndroidUtilities.cancelRunOnUIThread(fq0Var);
                                AndroidUtilities.runOnUIThread(fq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = q11Var.f31828b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    q11Var.f31828b.cancel();
                                    q11Var.f31828b = null;
                                }
                                if (q11Var.getVisibility() != 0) {
                                    q11Var.setAlpha(0.0f);
                                    q11Var.setVisibility(0);
                                    ViewPropertyAnimator listener = q11Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    q11Var.f31828b = listener;
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
            case 15:
                ((org.telegram.ui.Components.j70) this.f42572b).K((org.telegram.ui.Components.j70) this.f42573c);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f42572b;
                ((AlertDialog$Builder) this.f42573c).f22714a.H0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 30;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 182;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else if (num2.intValue() == 4) {
                    i18 = 548;
                } else if (num2.intValue() == 5) {
                    i18 = 730;
                } else {
                    i18 = 0;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.f22783c0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new jr0(privacySettingsActivity, c2Var, setaccountttl, 2));
                return;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.f42572b;
                profileActivity.getClass();
                org.telegram.ui.Components.mc.e();
                ye.d.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f42573c).url);
                return;
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f42572b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f42573c;
                long j10 = profileActivity2.f35986a1;
                long j11 = profileActivity2.A1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.C2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                dq dqVar = new dq(j10, j11, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                dqVar.T0 = new jy0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                return;
            case 19:
                l11 l11Var = (l11) this.f42572b;
                Context context5 = (Context) this.f42573c;
                StringBuilder sb2 = new StringBuilder();
                String obj3 = l11Var.f40053a[0].getText().toString();
                String obj4 = l11Var.f40053a[3].getText().toString();
                String obj5 = l11Var.f40053a[2].getText().toString();
                String obj6 = l11Var.f40053a[1].getText().toString();
                String obj7 = l11Var.f40053a[4].getText().toString();
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
                    if (l11Var.v == 1) {
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
                        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
                        n10.append(sb2.toString());
                        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context5, LocaleController.getString(R.string.ShareQrCode), n10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        gi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        l11Var.showDialog(gi0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                s41 s41Var = (s41) this.f42572b;
                Context context6 = (Context) this.f42573c;
                if (s41Var.f45082w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    kl0 kl0Var = new kl0(17, s41Var, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.c5.f27308a;
                    if (context6 != null) {
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false);
                        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false);
                        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context6, null);
                        a3Var2.a();
                        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(context6, null);
                        qc0Var.setTextColor(w02);
                        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        qc0Var.setItemCount(5);
                        org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(context6, null);
                        qc0Var2.setItemCount(5);
                        qc0Var2.setTextColor(w02);
                        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.qc0 qc0Var3 = new org.telegram.ui.Components.qc0(context6, null);
                        qc0Var3.setItemCount(5);
                        qc0Var3.setTextColor(w02);
                        qc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context6, qc0Var, qc0Var2, qc0Var3, 3);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        v3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new mh.d(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        eg.r rVar = new eg.r(context6, 16);
                        linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                        qc0Var.setMinValue(0);
                        qc0Var.setMaxValue(365);
                        qc0Var.setWrapSelectorWheel(false);
                        qc0Var.setFormatter(new org.telegram.ui.Components.n0(5));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(qc0Var, qc0Var2, qc0Var3, 14);
                        qc0Var.setOnValueChangedListener(aVar);
                        qc0Var2.setMinValue(0);
                        qc0Var2.setMaxValue(23);
                        linearLayout.addView(qc0Var2, i7.f6.l(0.2f, 0, 270));
                        qc0Var2.setFormatter(new org.telegram.ui.Components.n0(6));
                        qc0Var2.setOnValueChangedListener(aVar);
                        qc0Var3.setMinValue(0);
                        qc0Var3.setMaxValue(59);
                        qc0Var3.setValue(0);
                        qc0Var3.setFormatter(new org.telegram.ui.Components.n0(7));
                        linearLayout.addView(qc0Var3, i7.f6.l(0.3f, 0, 270));
                        qc0Var3.setOnValueChangedListener(aVar);
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
                                qc0Var3.setValue(calendar.get(12));
                                qc0Var2.setValue(calendar.get(11));
                                qc0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, qc0Var, qc0Var2, qc0Var3);
                        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        rVar.setGravity(17);
                        rVar.setTextColor(w04);
                        rVar.setTextSize(1, 14.0f);
                        rVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
                        rVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                        a3Var = a3Var2;
                        rVar.setOnClickListener(new eg.f(qc0Var, qc0Var2, qc0Var3, calendar, (Object) kl0Var, a3Var2, 2));
                        a3Var.b(v3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                    }
                    a3Var.f22729a.setOnHideListener(new eg.g(10, s41Var, zArr));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f22729a;
                    f3Var2.show();
                    s41Var.f45082w = f3Var2;
                    s41Var.c(false);
                    return;
                }
                return;
            case 21:
                q61 q61Var = (q61) this.f42572b;
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.f42573c;
                if (q61Var.V.g() != 0) {
                    pcVar.run(new ArrayList(q61Var.W.values()));
                    q61Var.dismiss();
                    return;
                }
                return;
            case 22:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f42572b;
                ((AlertDialog$Builder) this.f42573c).f22714a.H0.run();
                Integer num3 = (Integer) view.getTag();
                if (num3.intValue() == 0) {
                    i19 = 7;
                } else if (num3.intValue() == 1) {
                    i19 = 90;
                } else if (num3.intValue() == 2) {
                    i19 = 183;
                } else if (num3.intValue() == 3) {
                    i19 = 365;
                } else {
                    i19 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i19;
                sessionsActivity.v = i19;
                n71 n71Var = sessionsActivity.f36238a;
                if (n71Var != null) {
                    n71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new lh.o5(5));
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f42572b;
                editTextBoldCursor2.setText(jh.ia.M0(((Long) this.f42573c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 24:
                t91 t91Var = ((y81) this.f42572b).Z;
                t91Var.getOrCreateStoryViewer().C(t91Var.getParentActivity(), ((q91) this.f42573c).b(), t91Var.f42616v0, lh.b7.a(t91Var.O));
                return;
            case 25:
                a(view);
                return;
            case 26:
                fy fyVar2 = (fy) this.f42573c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fyVar2.getParentActivity());
                alertDialog$Builder5.f22714a.N = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f22714a.P = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new kl0(19, (ba1) this.f42572b, fyVar2));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder5.f22714a;
                fyVar2.showDialog(c2Var2);
                TextView textView3 = (TextView) c2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    return;
                }
                return;
            case 27:
                b(view);
                return;
            case 28:
                c(view);
                return;
            default:
                nh.d dVar = (nh.d) this.f42572b;
                int[] iArr = (int[]) this.f42573c;
                if (!dVar.J && (jVar = ei1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = jVar.h();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f3767c).h;
                        k8.j0 j0Var = new k8.j0(t0Var, (String) jVar.f213c, "/tg-wear-auth/answer", h);
                        t0Var.f3922b.d(0, j0Var);
                        z5.l.n(j0Var, k8.l0.f13526a).addOnSuccessListener(new z6(jVar, dVar, iArr, 24)).addOnFailureListener(new di1(dVar, 0));
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
