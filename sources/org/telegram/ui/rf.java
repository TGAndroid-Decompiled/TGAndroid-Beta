package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class rf implements View.OnClickListener {
    public final int f40188a;
    public final Object f40189b;
    public final Object f40190c;

    public rf(int i10, Object obj, Object obj2) {
        this.f40188a = i10;
        this.f40189b = obj;
        this.f40190c = obj2;
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
        org.telegram.ui.Components.es esVar;
        int i11 = this.f40188a;
        s4.c1 c1Var = null;
        Object obj = this.f40190c;
        Object obj2 = this.f40189b;
        switch (i11) {
            case 0:
                co coVar = (co) obj2;
                if (coVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    coVar.Q7();
                    UndoView undoView = coVar.y3;
                    if (undoView != null) {
                        long j3 = coVar.T5;
                        int i12 = UndoView.f24208e0;
                        undoView.j(83, j3, new k4(coVar, 1));
                    }
                }
                coVar.A7(true);
                return;
            case 1:
                co.I0((co) obj2, (String) obj);
                return;
            case 2:
                co.y1((co) obj2, (org.telegram.ui.Components.n70) obj);
                return;
            case 3:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                co.z1((co) obj2, (Context) obj);
                return;
            case 5:
                xo xoVar = (xo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20231a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, org.telegram.ui.ActionBar.j6.f20872n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
                linearLayout.addView(f7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i13] = i6Var;
                    i6Var.setTag(Integer.valueOf(i13));
                    i6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i13 == 0) {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !xoVar.J0);
                    } else if (ChatObject.isChannel(xoVar.f42826x0)) {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, xoVar.J0);
                    } else {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, xoVar.J0);
                    }
                    f7.addView(i6VarArr[i13], w7.x5.n(-1, -2));
                    i6VarArr[i13].setOnClickListener(new z(xoVar, i6VarArr, a3Var, 8));
                    i13++;
                }
                a3Var.b(linearLayout);
                xoVar.showDialog(f3Var);
                return;
            case 6:
                xo.U((xo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                qq.V((qq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 8:
                new sg.a1(((org.telegram.ui.Components.f0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.f6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                v0Var.M(null, null);
                v0Var.G(c5Var.d, false);
                v0Var.setupPopupRadialSelectors(c5Var.f24918f);
                v0Var.B(c5Var.f24917e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((bi.e4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20225a.L0.run();
                ((nu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f20231a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.k8.F((org.telegram.ui.Components.k8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj2;
                k8Var.getClass();
                ((org.telegram.ui.Components.n70) obj).u();
                k8Var.t0(7);
                return;
            case 18:
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) obj;
                org.telegram.ui.Components.k8 k8Var2 = ((org.telegram.ui.Components.b8) obj2).F;
                int h02 = org.telegram.ui.Components.k8.h0(k8Var2);
                LaunchActivity launchActivity = k8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(s90Var.getText().toString())) {
                    String charSequence = s90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.f41322l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (!uyVar.f41314j2) {
                                uyVar.f41382x = 3;
                                uyVar.X.f24549r.setText(charSequence);
                                uyVar.X.f24549r.setSelection(charSequence.length());
                            } else {
                                uyVar.X.f24549r.setText(charSequence);
                                uyVar.X.f24549r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (L = eyVar.L(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    uyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            k8Var2.dismiss();
                            return;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.f41331n2 = charSequence;
                    uyVar2.f41382x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    k8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.f9 f9Var = (org.telegram.ui.Components.f9) obj2;
                ((boolean[]) obj)[0] = true;
                f9Var.J.v1(f9Var.Y);
                f9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f25357n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f25357n.document)) {
                            FileLoader.getInstance(daVar.f25359s).loadFile(daVar.f25357n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(daVar.getContext(), daVar.f25357n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.n70 n70Var = ldVar.X0;
                if (n70Var != null && n70Var.D()) {
                    ldVar.X0.u();
                    ldVar.X0 = null;
                    return;
                }
                ldVar.f28169d1.e(true);
                org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(frameLayout, new bi.b(), ldVar.V0);
                ldVar.X0 = F;
                F.f28687s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                ldVar.X0.k();
                for (int i15 : ldVar.f28168c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    ldVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.m8(ldVar, i15, 1), false);
                    if (ldVar.f28167b1 == i15) {
                        ldVar.X0.L();
                    }
                }
                ldVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.f25446b;
                org.telegram.ui.Components.vi viVar = glVar.f28780b;
                co coVar2 = (co) viVar.f31306f0;
                if (coVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, coVar2.a(), new org.telegram.ui.Components.b3(3, dlVar, flVar), glVar.f28779a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new nf(13, dlVar, flVar));
                return;
            case 23:
                org.telegram.ui.Components.tn tnVar = ((org.telegram.ui.Components.rn) obj2).d;
                ec1 ec1Var = tnVar.f30681s;
                View F2 = ec1Var.F((org.telegram.ui.Components.qn) obj);
                if (F2 != null) {
                    c1Var = ec1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - tnVar.f30683t0) >= 0 && b10 < tnVar.K.length) {
                    org.telegram.ui.Components.tn.O(tnVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.co coVar3 = (org.telegram.ui.Components.co) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                co coVar4 = coVar3.G;
                if (coVar3.T) {
                    coVar4.showDialog(org.telegram.ui.Components.e5.V(coVar3.getContext(), coVar4.h, f6Var).f20225a);
                    return;
                }
                org.telegram.ui.Components.yn ynVar = coVar3.f25072e;
                if (coVar4.getParentActivity() != null) {
                    TLRPC.Chat chat = coVar4.f35264e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (coVar3.f25065a.f15396f && coVar4.getParentActivity() != null && coVar4.fragmentView != null && coVar4.Z7 != null) {
                            if (coVar4.f35387o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, coVar4.getParentActivity(), coVar4.f35274ea, true);
                                coVar4.f35387o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                coVar4.f35387o2.setVisibility(4);
                                coVar4.f35387o2.setShowingDuration(4000L);
                                coVar4.X0.addView(coVar4.f35387o2, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = coVar4.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            coVar4.f35387o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            coVar4.f35387o2.f(coVar4.f35213a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = coVar4.Z7;
                    TLRPC.UserFull userFull = coVar4.f35219a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(coVar3.getContext(), null, new org.telegram.ui.Components.zn(coVar3, r4), true, 0, coVar3.f25071d0);
                    q8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.f29644a;
                    org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(coVar3, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {aoVar};
                    aoVar.f21238e = true;
                    aoVar.f21237c = 220;
                    aoVar.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(ynVar, 0, (int) (coVar3.getX() + ynVar.getX()), (int) ynVar.getY());
                    coVar4.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.lp.n((org.telegram.ui.Components.lp) obj, (co) obj2);
                return;
            case 26:
                org.telegram.ui.Components.lr.P((org.telegram.ui.Components.lr) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.tr trVar = (org.telegram.ui.Components.tr) obj2;
                String str = (String) obj;
                if (trVar.f30713b == null && (view2 = trVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        trVar.f30713b = (EditText) findFocus;
                    }
                }
                if (trVar.f30713b != null) {
                    try {
                        trVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = trVar.f30713b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = trVar.f30713b.getText();
                    if (trVar.f30713b.getSelectionEnd() == trVar.f30713b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + trVar.f30713b.getSelectionStart();
                    }
                    if (trVar.f30713b.getSelectionStart() != -1 && trVar.f30713b.getSelectionEnd() != -1) {
                        EditText editText2 = trVar.f30713b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), trVar.f30713b.getSelectionEnd(), str));
                        EditText editText3 = trVar.f30713b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        trVar.f30713b.setText(str);
                        EditText editText4 = trVar.f30713b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = trVar.f30713b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.es esVar2 = (org.telegram.ui.Components.es) obj2;
                org.telegram.ui.Components.ds dsVar = (org.telegram.ui.Components.ds) obj;
                esVar2.J();
                dsVar.f25487f = !dsVar.f25487f;
                dsVar.f25490j.X.N(true);
                esVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.es) obj2).B0 = !esVar.B0;
                ((org.telegram.ui.Components.v51) obj).N(true);
                return;
        }
    }

    public rf(org.telegram.ui.Components.lp lpVar, co coVar) {
        this.f40188a = 25;
        this.f40190c = lpVar;
        this.f40189b = coVar;
    }
}
