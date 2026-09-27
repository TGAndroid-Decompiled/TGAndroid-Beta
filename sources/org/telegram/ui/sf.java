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
public final class sf implements View.OnClickListener {
    public final int f37420a;
    public final Object f37421b;
    public final Object f37422c;

    public sf(int i10, Object obj, Object obj2) {
        this.f37420a = i10;
        this.f37421b = obj;
        this.f37422c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int M;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        org.telegram.ui.Components.hs hsVar;
        int i11 = this.f37420a;
        s4.c1 c1Var = null;
        Object obj = this.f37422c;
        Object obj2 = this.f37421b;
        switch (i11) {
            case 0:
                xn xnVar = (xn) obj2;
                if (xnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    xnVar.Q7();
                    UndoView undoView = xnVar.y3;
                    if (undoView != null) {
                        long j3 = xnVar.T5;
                        int i12 = UndoView.f22453e0;
                        undoView.j(83, j3, new l4(xnVar, 1));
                    }
                }
                xnVar.A7(true);
                return;
            case 1:
                xn.X((xn) obj2, (String) obj);
                return;
            case 2:
                xn.a1((xn) obj2, (org.telegram.ui.Components.a80) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                xn.z1((xn) obj2, (Context) obj);
                return;
            case 5:
                so soVar = (so) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, null);
                org.telegram.ui.ActionBar.g3 g3Var = b3Var.f18683a;
                g3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.i6.f19241n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
                linearLayout.addView(f7, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !soVar.J0);
                    } else if (ChatObject.isChannel(soVar.f37534x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, soVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, soVar.J0);
                    }
                    f7.addView(j6VarArr[i13], w7.y5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new b0(soVar, j6VarArr, b3Var, 8));
                    i13++;
                }
                b3Var.b(linearLayout);
                soVar.showDialog(g3Var);
                return;
            case 6:
                so.U((so) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                lq.V((lq) obj2, (org.telegram.ui.ActionBar.b3) obj, view);
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
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                w0Var.M(null, null);
                w0Var.G(c5Var.d, false);
                w0Var.setupPopupRadialSelectors(c5Var.f23225f);
                w0Var.B(c5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.s4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f18655a.L0.run();
                ((ku) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.b3) obj2).f18683a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.a80) obj).u();
                j8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ea0Var.getText().toString())) {
                    String charSequence = ea0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ty) {
                        ty tyVar = (ty) launchActivity.O().getLastFragment();
                        int totalDialogsCount = tyVar.getMessagesController().getTotalDialogsCount();
                        if (!tyVar.f38012l2 && (totalDialogsCount > 10 || tyVar.K)) {
                            if (!tyVar.f38004j2) {
                                tyVar.f38070x = 3;
                                tyVar.X.f23850r.setText(charSequence);
                                tyVar.X.f23850r.setSelection(charSequence.length());
                            } else {
                                tyVar.X.f23850r.setText(charSequence);
                                tyVar.X.f23850r.setSelection(charSequence.length());
                                ay ayVar = tyVar.C0;
                                if (ayVar != null && (M = ayVar.M(3)) >= 0 && tyVar.C0.getTabsView().getCurrentTabId() != M) {
                                    tyVar.C0.getTabsView().d(M, M);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    ty tyVar2 = new ty(null);
                    tyVar2.f38021n2 = charSequence;
                    tyVar2.f38070x = 3;
                    launchActivity.q0(tyVar2, false, false);
                    j8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.x1(e9Var.Y);
                e9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f23615n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f23615n.document)) {
                            FileLoader.getInstance(daVar.f23617s).loadFile(daVar.f23615n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(daVar.getContext(), daVar.f23615n.url);
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
                org.telegram.ui.Components.a80 a80Var = ldVar.X0;
                if (a80Var != null && a80Var.D()) {
                    ldVar.X0.u();
                    ldVar.X0 = null;
                    return;
                }
                ldVar.f26010d1.e(true);
                org.telegram.ui.Components.a80 F = org.telegram.ui.Components.a80.F(frameLayout, new ai.d(), ldVar.V0);
                ldVar.X0 = F;
                F.f22606s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                ldVar.X0.k();
                for (int i15 : ldVar.f26009c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    ldVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.kd(ldVar, i15, 0), false);
                    if (ldVar.f26008b1 == i15) {
                        ldVar.X0.L();
                    }
                }
                ldVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj2;
                org.telegram.ui.Components.hl hlVar = (org.telegram.ui.Components.hl) obj;
                org.telegram.ui.Components.il ilVar = flVar.f24307b;
                org.telegram.ui.Components.wi wiVar = ilVar.f27104b;
                xn xnVar2 = (xn) wiVar.f29962f0;
                if (xnVar2.c()) {
                    parentActivity = ilVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, xnVar2.a(), new org.telegram.ui.Components.w2(4, flVar, hlVar), ilVar.f27103a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(wiVar.J1, wiVar.h1() + 1, wiVar.l1(), new qc(20, flVar, hlVar));
                return;
            case 23:
                org.telegram.ui.Components.wn wnVar = ((org.telegram.ui.Components.un) obj2).d;
                wb1 wb1Var = wnVar.f30106s;
                View G = wb1Var.G((org.telegram.ui.Components.tn) obj);
                if (G != null) {
                    c1Var = wb1Var.U(G);
                }
                if (c1Var != null && (b10 = c1Var.b() - wnVar.f30108t0) >= 0 && b10 < wnVar.K.length) {
                    org.telegram.ui.Components.wn.O(wnVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                xn xnVar3 = goVar.G;
                if (goVar.T) {
                    xnVar3.showDialog(org.telegram.ui.Components.e5.V(goVar.getContext(), xnVar3.h, e6Var).f18655a);
                    return;
                }
                org.telegram.ui.Components.bo boVar = goVar.e;
                if (xnVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = xnVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (goVar.f24605a.f14203f && xnVar3.getParentActivity() != null && xnVar3.fragmentView != null && xnVar3.Z7 != null) {
                            if (xnVar3.f39864o2 == null) {
                                org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(7, xnVar3.getParentActivity(), xnVar3.f39750ea, true);
                                xnVar3.f39864o2 = l40Var;
                                l40Var.setAlpha(0.0f);
                                xnVar3.f39864o2.setVisibility(4);
                                xnVar3.f39864o2.setShowingDuration(4000L);
                                xnVar3.X0.addView(xnVar3.f39864o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = xnVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            xnVar3.f39864o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            xnVar3.f39864o2.f(xnVar3.f39690a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = xnVar3.Z7;
                    TLRPC.UserFull userFull = xnVar3.f39696a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(goVar.getContext(), null, new org.telegram.ui.Components.co(goVar, r4), true, 0, goVar.f24611d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f27037a;
                    org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(goVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.o1[] o1VarArr = {eoVar};
                    eoVar.e = true;
                    eoVar.f19685c = 220;
                    eoVar.setOutsideTouchable(true);
                    o1VarArr[0].setClippingEnabled(true);
                    o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    o1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1VarArr[0].setInputMethodMode(2);
                    o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    o1VarArr[0].showAtLocation(boVar, 0, (int) (goVar.getX() + boVar.getX()), (int) boVar.getY());
                    xnVar3.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.op.n((org.telegram.ui.Components.op) obj, (xn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.or.P((org.telegram.ui.Components.or) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.wr wrVar = (org.telegram.ui.Components.wr) obj2;
                String str = (String) obj;
                if (wrVar.f30165b == null && (view2 = wrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.f30165b = (EditText) findFocus;
                    }
                }
                if (wrVar.f30165b != null) {
                    try {
                        wrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = wrVar.f30165b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = wrVar.f30165b.getText();
                    if (wrVar.f30165b.getSelectionEnd() == wrVar.f30165b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + wrVar.f30165b.getSelectionStart();
                    }
                    if (wrVar.f30165b.getSelectionStart() != -1 && wrVar.f30165b.getSelectionEnd() != -1) {
                        EditText editText2 = wrVar.f30165b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), wrVar.f30165b.getSelectionEnd(), str));
                        EditText editText3 = wrVar.f30165b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        wrVar.f30165b.setText(str);
                        EditText editText4 = wrVar.f30165b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = wrVar.f30165b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.hs hsVar2 = (org.telegram.ui.Components.hs) obj2;
                org.telegram.ui.Components.gs gsVar = (org.telegram.ui.Components.gs) obj;
                hsVar2.J();
                gsVar.f24651f = !gsVar.f24651f;
                gsVar.f24654j.X.N(true);
                hsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.hs) obj2).B0 = !hsVar.B0;
                ((org.telegram.ui.Components.l61) obj).N(true);
                return;
        }
    }

    public sf(org.telegram.ui.Components.op opVar, xn xnVar) {
        this.f37420a = 25;
        this.f37422c = opVar;
        this.f37421b = xnVar;
    }
}
