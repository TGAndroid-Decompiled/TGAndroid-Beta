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
    public final int f37093a;
    public final Object f37094b;
    public final Object f37095c;

    public rf(int i10, Object obj, Object obj2) {
        this.f37093a = i10;
        this.f37094b = obj;
        this.f37095c = obj2;
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
        org.telegram.ui.Components.fs fsVar;
        int i11 = this.f37093a;
        s4.c1 c1Var = null;
        Object obj = this.f37095c;
        Object obj2 = this.f37094b;
        switch (i11) {
            case 0:
                bo boVar = (bo) obj2;
                if (boVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    boVar.Q7();
                    UndoView undoView = boVar.y3;
                    if (undoView != null) {
                        long j3 = boVar.T5;
                        int i12 = UndoView.f22228e0;
                        undoView.j(83, j3, new j4(boVar, 1));
                    }
                }
                boVar.A7(true);
                return;
            case 1:
                bo.I0((bo) obj2, (String) obj);
                return;
            case 2:
                bo.y1((bo) obj2, (org.telegram.ui.Components.n70) obj);
                return;
            case 3:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                bo.z1((bo) obj2, (Context) obj);
                return;
            case 5:
                wo woVar = (wo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18442a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, org.telegram.ui.ActionBar.i6.f19020n5, 23, 15, false, null);
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
                    i6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                    if (i13 == 0) {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !woVar.J0);
                    } else if (ChatObject.isChannel(woVar.f39300x0)) {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, woVar.J0);
                    } else {
                        i6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, woVar.J0);
                    }
                    f7.addView(i6VarArr[i13], w7.x5.n(-1, -2));
                    i6VarArr[i13].setOnClickListener(new z(woVar, i6VarArr, a3Var, 8));
                    i13++;
                }
                a3Var.b(linearLayout);
                woVar.showDialog(f3Var);
                return;
            case 6:
                wo.U((wo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                pq.V((pq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.e6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.e6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) obj;
                v0Var.M(null, null);
                v0Var.G(a5Var.d, false);
                v0Var.setupPopupRadialSelectors(a5Var.f22308f);
                v0Var.B(a5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((ai.s4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f18437a.L0.run();
                ((mu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f18442a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.h8.F((org.telegram.ui.Components.h8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) obj2;
                h8Var.getClass();
                ((org.telegram.ui.Components.n70) obj).u();
                h8Var.t0(7);
                return;
            case 18:
                org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) obj;
                org.telegram.ui.Components.h8 h8Var2 = ((org.telegram.ui.Components.y7) obj2).F;
                int h02 = org.telegram.ui.Components.h8.h0(h8Var2);
                LaunchActivity launchActivity = h8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(r90Var.getText().toString())) {
                    String charSequence = r90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.f38243l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (!uyVar.f38235j2) {
                                uyVar.f38303x = 3;
                                uyVar.X.f22573r.setText(charSequence);
                                uyVar.X.f22573r.setSelection(charSequence.length());
                            } else {
                                uyVar.X.f22573r.setText(charSequence);
                                uyVar.X.f22573r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (L = eyVar.L(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    uyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            h8Var2.dismiss();
                            return;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.f38252n2 = charSequence;
                    uyVar2.f38303x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    h8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) obj2;
                ((boolean[]) obj)[0] = true;
                c9Var.J.w1(c9Var.Y);
                c9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(baVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = baVar.f22728n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) baVar.getContext(), baVar.f22728n.document)) {
                            FileLoader.getInstance(baVar.f22730s).loadFile(baVar.f22728n.document, "update", 3, 1);
                            baVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(baVar.getContext(), baVar.f22728n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.n70 n70Var = jdVar.X0;
                if (n70Var != null && n70Var.D()) {
                    jdVar.X0.u();
                    jdVar.X0 = null;
                    return;
                }
                jdVar.f25288d1.e(true);
                org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(frameLayout, new ai.d(), jdVar.V0);
                jdVar.X0 = F;
                F.f26368s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                jdVar.X0.k();
                for (int i15 : jdVar.f25287c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    jdVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.id(jdVar, i15, 0), false);
                    if (jdVar.f25286b1 == i15) {
                        jdVar.X0.L();
                    }
                }
                jdVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.f23356b;
                org.telegram.ui.Components.vi viVar = glVar.f26462b;
                bo boVar2 = (bo) viVar.f28750f0;
                if (boVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.c5.M(parentActivity, boVar2.a(), new org.telegram.ui.Components.mf(2, dlVar, flVar), glVar.f26461a);
                    return;
                }
                org.telegram.ui.Components.c5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new nf(13, dlVar, flVar));
                return;
            case 23:
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) obj2).d;
                dc1 dc1Var = unVar.f28463s;
                View F2 = dc1Var.F((org.telegram.ui.Components.rn) obj);
                if (F2 != null) {
                    c1Var = dc1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - unVar.f28465t0) >= 0 && b10 < unVar.K.length) {
                    org.telegram.ui.Components.un.O(unVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                bo boVar3 = eoVar.G;
                if (eoVar.T) {
                    boVar3.showDialog(org.telegram.ui.Components.c5.V(eoVar.getContext(), boVar3.h, e6Var).f18437a);
                    return;
                }
                org.telegram.ui.Components.zn znVar = eoVar.e;
                if (boVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = boVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (eoVar.f23699a.f13975f && boVar3.getParentActivity() != null && boVar3.fragmentView != null && boVar3.Z7 != null) {
                            if (boVar3.f32411o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, boVar3.getParentActivity(), boVar3.f32297ea, true);
                                boVar3.f32411o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                boVar3.f32411o2.setVisibility(4);
                                boVar3.f32411o2.setShowingDuration(4000L);
                                boVar3.X0.addView(boVar3.f32411o2, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = boVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            boVar3.f32411o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            boVar3.f32411o2.f(boVar3.f32237a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = boVar3.Z7;
                    TLRPC.UserFull userFull = boVar3.f32243a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(eoVar.getContext(), null, new org.telegram.ui.Components.ao(eoVar, r4), true, 0, eoVar.f23705d0);
                    m8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m8Var.f26115a;
                    org.telegram.ui.Components.bo boVar4 = new org.telegram.ui.Components.bo(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {boVar4};
                    boVar4.e = true;
                    boVar4.f19421c = 220;
                    boVar4.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(znVar, 0, (int) (eoVar.getX() + znVar.getX()), (int) znVar.getY());
                    boVar3.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.mp.n((org.telegram.ui.Components.mp) obj, (bo) obj2);
                return;
            case 26:
                org.telegram.ui.Components.mr.P((org.telegram.ui.Components.mr) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.ur urVar = (org.telegram.ui.Components.ur) obj2;
                String str = (String) obj;
                if (urVar.f28493b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28493b = (EditText) findFocus;
                    }
                }
                if (urVar.f28493b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.f28493b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.f28493b.getText();
                    if (urVar.f28493b.getSelectionEnd() == urVar.f28493b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + urVar.f28493b.getSelectionStart();
                    }
                    if (urVar.f28493b.getSelectionStart() != -1 && urVar.f28493b.getSelectionEnd() != -1) {
                        EditText editText2 = urVar.f28493b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), urVar.f28493b.getSelectionEnd(), str));
                        EditText editText3 = urVar.f28493b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        urVar.f28493b.setText(str);
                        EditText editText4 = urVar.f28493b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = urVar.f28493b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.fs fsVar2 = (org.telegram.ui.Components.fs) obj2;
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) obj;
                fsVar2.J();
                esVar.f23746f = !esVar.f23746f;
                esVar.f23749j.X.N(true);
                fsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.fs) obj2).B0 = !fsVar.B0;
                ((org.telegram.ui.Components.w51) obj).N(true);
                return;
        }
    }

    public rf(org.telegram.ui.Components.mp mpVar, bo boVar) {
        this.f37093a = 25;
        this.f37095c = mpVar;
        this.f37094b = boVar;
    }
}
