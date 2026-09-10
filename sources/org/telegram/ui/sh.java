package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sh implements View.OnClickListener {
    public final int f36682a;
    public final Object f36683b;
    public final Object f36684c;

    public sh(int i10, Object obj, Object obj2) {
        this.f36682a = i10;
        this.f36683b = obj;
        this.f36684c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int L;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        org.telegram.ui.Components.ls lsVar;
        s4.c1 T;
        long j3;
        int i11 = this.f36682a;
        s4.c1 c1Var = null;
        Object obj = this.f36684c;
        Object obj2 = this.f36683b;
        switch (i11) {
            case 0:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 1:
                eo.z1((eo) obj2, (Context) obj);
                return;
            case 2:
                yo yoVar = (yo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
                org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.j6.f18109n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
                linearLayout.addView(f7, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.k6[] k6VarArr = new org.telegram.ui.Cells.k6[2];
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, true);
                    k6VarArr[i12] = k6Var;
                    k6Var.setTag(Integer.valueOf(i12));
                    k6VarArr[i12].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i12 == 0) {
                        k6VarArr[i12].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !yoVar.J0);
                    } else if (ChatObject.isChannel(yoVar.f39070x0)) {
                        k6VarArr[i12].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, yoVar.J0);
                    } else {
                        k6VarArr[i12].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, yoVar.J0);
                    }
                    f7.addView(k6VarArr[i12], w7.a6.n(-1, -2));
                    k6VarArr[i12].setOnClickListener(new a0(yoVar, k6VarArr, c3Var, 8));
                    i12++;
                }
                c3Var.b(linearLayout);
                yoVar.showDialog(h3Var);
                return;
            case 3:
                yo.U((yo) obj2, (FrameLayout) obj, view);
                return;
            case 4:
                rq.V((rq) obj2, (org.telegram.ui.ActionBar.c3) obj, view);
                return;
            case 5:
                new qg.a1(((org.telegram.ui.Components.g0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.f6) obj).show();
                return;
            case 6:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 7:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 8:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) obj;
                w0Var.M(null, null);
                w0Var.G(b5Var.d, false);
                w0Var.setupPopupRadialSelectors(b5Var.f21724f);
                w0Var.B(b5Var.e);
                return;
            case 9:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((bi.g2) obj).run();
                return;
            case 10:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f17528a.L0.run();
                ((nu) obj).onClick(null, intValue);
                return;
            case 11:
                runnable = ((org.telegram.ui.ActionBar.c3) obj2).f17571a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 12:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 13:
                org.telegram.ui.Components.j8.E((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.w70) obj).u();
                j8Var.t0(7);
                return;
            case 15:
                org.telegram.ui.Components.ba0 ba0Var = (org.telegram.ui.Components.ba0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ba0Var.getText().toString())) {
                    String charSequence = ba0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof wy) {
                        wy wyVar = (wy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = wyVar.getMessagesController().getTotalDialogsCount();
                        if (!wyVar.f38467l2 && (totalDialogsCount > 10 || wyVar.K)) {
                            if (!wyVar.f38459j2) {
                                wyVar.f38527x = 3;
                                wyVar.X.f24572r.setText(charSequence);
                                wyVar.X.f24572r.setSelection(charSequence.length());
                            } else {
                                wyVar.X.f24572r.setText(charSequence);
                                wyVar.X.f24572r.setSelection(charSequence.length());
                                gy gyVar = wyVar.C0;
                                if (gyVar != null && (L = gyVar.L(3)) >= 0 && wyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    wyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    wy wyVar2 = new wy(null);
                    wyVar2.f38476n2 = charSequence;
                    wyVar2.f38527x = 3;
                    launchActivity.q0(wyVar2, false, false);
                    j8Var2.dismiss();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) obj2;
                ((boolean[]) obj)[0] = true;
                d9Var.J.v1(d9Var.Y);
                d9Var.S.dismiss();
                return;
            case 17:
                org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(caVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = caVar.f22062n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) caVar.getContext(), caVar.f22062n.document)) {
                            FileLoader.getInstance(caVar.f22064s).loadFile(caVar.f22062n.document, "update", 3, 1);
                            caVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(caVar.getContext(), caVar.f22062n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 18:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.w70 w70Var = jdVar.X0;
                if (w70Var != null && w70Var.D()) {
                    jdVar.X0.u();
                    jdVar.X0 = null;
                    return;
                }
                jdVar.f24353d1.e(true);
                org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(frameLayout, new zh.b(), jdVar.V0);
                jdVar.X0 = F;
                F.f28701s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                jdVar.X0.k();
                for (int i14 : jdVar.f24352c1) {
                    if (i14 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i14 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                    }
                    jdVar.X0.c(0, formatPluralString, new bi.s(jdVar, i14, 29), false);
                    if (jdVar.f24351b1 == i14) {
                        jdVar.X0.L();
                    }
                }
                jdVar.X0.Z();
                return;
            case 19:
                org.telegram.ui.Components.il ilVar = (org.telegram.ui.Components.il) obj2;
                org.telegram.ui.Components.kl klVar = (org.telegram.ui.Components.kl) obj;
                org.telegram.ui.Components.ll llVar = ilVar.f24042b;
                org.telegram.ui.Components.yi yiVar = llVar.f26422b;
                eo eoVar = (eo) yiVar.f29366f0;
                if (eoVar.c()) {
                    parentActivity = llVar.getParentActivity();
                    org.telegram.ui.Components.d5.M(parentActivity, eoVar.a(), new oe(28, ilVar, klVar), llVar.f26421a);
                    return;
                }
                org.telegram.ui.Components.d5.a0(yiVar.J1, yiVar.j1() + 1, yiVar.n1(), new pf(13, ilVar, klVar));
                return;
            case 20:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.xn) obj2).d;
                ic1 ic1Var = znVar.f29762s;
                View F2 = ic1Var.F((org.telegram.ui.Components.wn) obj);
                if (F2 != null) {
                    c1Var = ic1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - znVar.f29764t0) >= 0 && b10 < znVar.K.length) {
                    org.telegram.ui.Components.zn.O(znVar, b10);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.jo joVar = (org.telegram.ui.Components.jo) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                eo eoVar2 = joVar.G;
                if (joVar.T) {
                    eoVar2.showDialog(org.telegram.ui.Components.d5.V(joVar.getContext(), eoVar2.h, f6Var).f17528a);
                    return;
                }
                org.telegram.ui.Components.fo foVar = joVar.e;
                if (eoVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = eoVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (joVar.f24453a.f12870f && eoVar2.getParentActivity() != null && eoVar2.fragmentView != null && eoVar2.Z7 != null) {
                            if (eoVar2.f32429o2 == null) {
                                org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(7, eoVar2.getParentActivity(), eoVar2.f32316ea, true);
                                eoVar2.f32429o2 = s40Var;
                                s40Var.setAlpha(0.0f);
                                eoVar2.f32429o2.setVisibility(4);
                                eoVar2.f32429o2.setShowingDuration(4000L);
                                eoVar2.X0.addView(eoVar2.f32429o2, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i15 = eoVar2.Z7.ttl_period;
                            if (i15 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i15 / 86400, new Object[0]);
                            } else if (i15 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            } else if (i15 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                            }
                            eoVar2.f32429o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            eoVar2.f32429o2.f(eoVar2.f32256a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = eoVar2.Z7;
                    TLRPC.UserFull userFull = eoVar2.f32262a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(joVar.getContext(), null, new org.telegram.ui.Components.go(joVar, r4), true, 0, joVar.f24459d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f25692a;
                    org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(joVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.p1[] p1VarArr = {hoVar};
                    hoVar.e = true;
                    hoVar.f18535c = 220;
                    hoVar.setOutsideTouchable(true);
                    p1VarArr[0].setClippingEnabled(true);
                    p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    p1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1VarArr[0].setInputMethodMode(2);
                    p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    p1VarArr[0].showAtLocation(foVar, 0, (int) (joVar.getX() + foVar.getX()), (int) foVar.getY());
                    eoVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.sp.n((org.telegram.ui.Components.sp) obj2, (eo) obj);
                return;
            case 23:
                org.telegram.ui.Components.sr.P((org.telegram.ui.Components.sr) obj2, (TLRPC.Peer) obj);
                return;
            case 24:
                org.telegram.ui.Components.as asVar = (org.telegram.ui.Components.as) obj2;
                String str = (String) obj;
                if (asVar.f21574b == null && (view2 = asVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        asVar.f21574b = (EditText) findFocus;
                    }
                }
                if (asVar.f21574b != null) {
                    try {
                        asVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = asVar.f21574b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = asVar.f21574b.getText();
                    if (asVar.f21574b.getSelectionEnd() == asVar.f21574b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + asVar.f21574b.getSelectionStart();
                    }
                    if (asVar.f21574b.getSelectionStart() != -1 && asVar.f21574b.getSelectionEnd() != -1) {
                        EditText editText2 = asVar.f21574b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), asVar.f21574b.getSelectionEnd(), str));
                        EditText editText3 = asVar.f21574b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        asVar.f21574b.setText(str);
                        EditText editText4 = asVar.f21574b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = asVar.f21574b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.ls lsVar2 = (org.telegram.ui.Components.ls) obj2;
                org.telegram.ui.Components.ks ksVar = (org.telegram.ui.Components.ks) obj;
                lsVar2.J();
                ksVar.f24805f = !ksVar.f24805f;
                ksVar.f24808j.X.N(true);
                lsVar2.s();
                return;
            case 26:
                ((org.telegram.ui.Components.ls) obj2).B0 = !lsVar.B0;
                ((org.telegram.ui.Components.j61) obj).N(true);
                return;
            case 27:
                ((org.telegram.ui.Components.kt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new y6());
                return;
            case 28:
                org.telegram.ui.Components.wv.o((org.telegram.ui.Components.wv) obj2, (org.telegram.ui.Components.y5) obj);
                return;
            default:
                org.telegram.ui.Components.iz izVar = (org.telegram.ui.Components.iz) obj2;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) obj;
                org.telegram.ui.Components.rz rzVar = izVar.v;
                org.telegram.ui.Components.yw ywVar = rzVar.D0;
                if (ywVar.indexOfChild(p8Var) != -1 && (T = ywVar.T(p8Var)) != null) {
                    if (T.b() == rzVar.f26815f1) {
                        if (rzVar.f26821h1 != null) {
                            org.telegram.ui.Components.sy syVar = rzVar.f26858t1;
                            if (syVar != null) {
                                syVar.y(rzVar.J1.f17196id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(rzVar.f26805c1).edit();
                        String str2 = "group_hide_stickers_" + rzVar.J1.f17196id;
                        TLRPC.StickerSet stickerSet = rzVar.J1.stickerset;
                        if (stickerSet != null) {
                            j3 = stickerSet.f17222id;
                        } else {
                            j3 = 0;
                        }
                        edit.putLong(str2, j3).apply();
                        rzVar.Z(false);
                        org.telegram.ui.Components.iz izVar2 = rzVar.f26875y0;
                        if (izVar2 != null) {
                            izVar2.l();
                            return;
                        }
                        return;
                    } else if (izVar.h.get(T.b()) == rzVar.f26827j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(izVar.f24169c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.Components.pv(izVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
