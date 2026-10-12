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
public final class wf implements View.OnClickListener {
    public final int f43506a;
    public final Object f43507b;
    public final Object f43508c;

    public wf(int i10, Object obj, Object obj2) {
        this.f43506a = i10;
        this.f43507b = obj;
        this.f43508c = obj2;
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
        org.telegram.ui.Components.xs xsVar;
        int i11 = this.f43506a;
        s4.d1 d1Var = null;
        Object obj = this.f43508c;
        Object obj2 = this.f43507b;
        switch (i11) {
            case 0:
                eo eoVar = (eo) obj2;
                if (eoVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    eoVar.T7();
                    UndoView undoView = eoVar.y3;
                    if (undoView != null) {
                        long j3 = eoVar.T5;
                        int i12 = UndoView.f24147e0;
                        undoView.j(83, j3, new k4(eoVar, 1));
                    }
                }
                eoVar.D7(true);
                return;
            case 1:
                eo.W0((eo) obj2, (String) obj);
                return;
            case 2:
                eo.S0((eo) obj2, (org.telegram.ui.Components.s80) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                eo.g1((eo) obj2, (Context) obj);
                return;
            case 5:
                xo xoVar = (xo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f21484a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.f20743n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
                linearLayout.addView(e7, w7.w5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !xoVar.J0);
                    } else if (ChatObject.isChannel(xoVar.f44079x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, xoVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, xoVar.J0);
                    }
                    e7.addView(j6VarArr[i13], w7.w5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(xoVar, j6VarArr, z2Var, 8));
                    i13++;
                }
                z2Var.b(linearLayout);
                xoVar.showDialog(e3Var);
                return;
            case 6:
                xo.U((xo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                qq.V((qq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                return;
            case 8:
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.c6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                u0Var.M(null, null);
                u0Var.G(e5Var.d, false);
                u0Var.setupPopupRadialSelectors(e5Var.f25595f);
                u0Var.B(e5Var.f25594e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.t4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20141a.L0.run();
                ((ou) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).f21484a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.l8.G((org.telegram.ui.Components.l8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) obj2;
                l8Var.getClass();
                ((org.telegram.ui.Components.s80) obj).u();
                l8Var.u0(6);
                return;
            case 18:
                org.telegram.ui.Components.xa0 xa0Var = (org.telegram.ui.Components.xa0) obj;
                org.telegram.ui.Components.l8 l8Var2 = ((org.telegram.ui.Components.c8) obj2).F;
                int i02 = org.telegram.ui.Components.l8.i0(l8Var2);
                LaunchActivity launchActivity = l8Var2.G0;
                if (MessagesController.getInstance(i02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(xa0Var.getText().toString())) {
                    String charSequence = xa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof vy) {
                        vy vyVar = (vy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = vyVar.getMessagesController().getTotalDialogsCount();
                        if (!vyVar.f42939l2 && (totalDialogsCount > 10 || vyVar.K)) {
                            if (!vyVar.f42931j2) {
                                vyVar.f42998x = 3;
                                vyVar.X.f31362r.setText(charSequence);
                                vyVar.X.f31362r.setSelection(charSequence.length());
                            } else {
                                vyVar.X.f31362r.setText(charSequence);
                                vyVar.X.f31362r.setSelection(charSequence.length());
                                fy fyVar = vyVar.C0;
                                if (fyVar != null && (L = fyVar.L(3)) >= 0 && vyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    vyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            l8Var2.dismiss();
                            return;
                        }
                    }
                    vy vyVar2 = new vy(null);
                    vyVar2.f42948n2 = charSequence;
                    vyVar2.f42998x = 3;
                    launchActivity.q0(vyVar2, false, false);
                    l8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) obj2;
                ((boolean[]) obj)[0] = true;
                g9Var.J.x1(g9Var.Y);
                g9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(faVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = faVar.f25989n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) faVar.getContext(), faVar.f25989n.document)) {
                            FileLoader.getInstance(faVar.f25991s).loadFile(faVar.f25989n.document, "update", 3, 1);
                            faVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(faVar.getContext(), faVar.f25989n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.od odVar = (org.telegram.ui.Components.od) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.s80 s80Var = odVar.X0;
                if (s80Var != null && s80Var.D()) {
                    odVar.X0.u();
                    odVar.X0 = null;
                    return;
                }
                odVar.f29144d1.e(true);
                org.telegram.ui.Components.s80 F = org.telegram.ui.Components.s80.F(frameLayout, new ai.d(), odVar.V0);
                odVar.X0 = F;
                F.f30472s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                odVar.X0.k();
                for (int i15 : odVar.f29143c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    odVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.nd(odVar, i15, 0), false);
                    if (odVar.f29142b1 == i15) {
                        odVar.X0.L();
                    }
                }
                odVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.wl wlVar = (org.telegram.ui.Components.wl) obj2;
                org.telegram.ui.Components.yl ylVar = (org.telegram.ui.Components.yl) obj;
                org.telegram.ui.Components.zl zlVar = wlVar.f32434b;
                org.telegram.ui.Components.aj ajVar = zlVar.f30574b;
                eo eoVar2 = (eo) ajVar.f24342f0;
                if (eoVar2.c()) {
                    parentActivity = zlVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, eoVar2.a(), new org.telegram.ui.Components.y2(4, wlVar, ylVar), zlVar.f30573a);
                    return;
                }
                org.telegram.ui.Components.g5.Z(ajVar.M1, ajVar.l1() + 1, ajVar.p1(), new tc(20, wlVar, ylVar));
                return;
            case 23:
                org.telegram.ui.Components.no noVar = ((org.telegram.ui.Components.lo) obj2).d;
                hc1 hc1Var = noVar.f28903s;
                View F2 = hc1Var.F((org.telegram.ui.Components.ko) obj);
                if (F2 != null) {
                    d1Var = hc1Var.T(F2);
                }
                if (d1Var != null && (b10 = d1Var.b() - noVar.f28905t0) >= 0 && b10 < noVar.K.length) {
                    org.telegram.ui.Components.no.R(noVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                eo eoVar3 = woVar.G;
                if (woVar.T) {
                    eoVar3.showDialog(org.telegram.ui.Components.g5.U(woVar.getContext(), eoVar3.h, c6Var).f20141a);
                    return;
                }
                org.telegram.ui.Components.so soVar = woVar.f32504e;
                if (eoVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = eoVar3.f37241e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (woVar.f32497a.f16088f && eoVar3.getParentActivity() != null && eoVar3.fragmentView != null && eoVar3.Z7 != null) {
                            if (eoVar3.f37364o2 == null) {
                                org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(7, eoVar3.getParentActivity(), eoVar3.f37251ea, true);
                                eoVar3.f37364o2 = c50Var;
                                c50Var.setAlpha(0.0f);
                                eoVar3.f37364o2.setVisibility(4);
                                eoVar3.f37364o2.setShowingDuration(4000L);
                                eoVar3.X0.addView(eoVar3.f37364o2, w7.w5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                            }
                            int i16 = eoVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            eoVar3.f37364o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            eoVar3.f37364o2.f(eoVar3.f37190a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = eoVar3.Z7;
                    TLRPC.UserFull userFull = eoVar3.f37196a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(woVar.getContext(), null, new org.telegram.ui.Components.to(woVar, r4), true, 0, woVar.f32503d0);
                    q8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.f29761a;
                    org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(woVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {uoVar};
                    uoVar.f21146e = true;
                    uoVar.f21145c = 220;
                    uoVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(soVar, 0, (int) (woVar.getX() + soVar.getX()), (int) soVar.getY());
                    eoVar3.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.eq.p((org.telegram.ui.Components.eq) obj, (eo) obj2);
                return;
            case 26:
                org.telegram.ui.Components.fs.Q((org.telegram.ui.Components.fs) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.ns nsVar = (org.telegram.ui.Components.ns) obj2;
                String str = (String) obj;
                if (nsVar.f28951b == null && (view2 = nsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        nsVar.f28951b = (EditText) findFocus;
                    }
                }
                if (nsVar.f28951b != null) {
                    try {
                        nsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = nsVar.f28951b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = nsVar.f28951b.getText();
                    if (nsVar.f28951b.getSelectionEnd() == nsVar.f28951b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + nsVar.f28951b.getSelectionStart();
                    }
                    if (nsVar.f28951b.getSelectionStart() != -1 && nsVar.f28951b.getSelectionEnd() != -1) {
                        EditText editText2 = nsVar.f28951b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), nsVar.f28951b.getSelectionEnd(), str));
                        EditText editText3 = nsVar.f28951b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        nsVar.f28951b.setText(str);
                        EditText editText4 = nsVar.f28951b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = nsVar.f28951b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.xs xsVar2 = (org.telegram.ui.Components.xs) obj2;
                org.telegram.ui.Components.ws wsVar = (org.telegram.ui.Components.ws) obj;
                xsVar2.K();
                wsVar.f32542f = !wsVar.f32542f;
                wsVar.f32545j.X.N(true);
                xsVar2.u();
                return;
            default:
                ((org.telegram.ui.Components.xs) obj2).B0 = !xsVar.B0;
                ((org.telegram.ui.Components.h71) obj).N(true);
                return;
        }
    }

    public wf(org.telegram.ui.Components.eq eqVar, eo eoVar) {
        this.f43506a = 25;
        this.f43508c = eqVar;
        this.f43507b = eoVar;
    }
}
