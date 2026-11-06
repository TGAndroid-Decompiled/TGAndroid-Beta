package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wx implements View.OnClickListener {
    public final int f51669a;
    public final ey f51670b;

    public wx(ey eyVar, int i7) {
        this.f51669a = i7;
        this.f51670b = eyVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f51669a;
        ey eyVar = this.f51670b;
        switch (i7) {
            case 0:
                String str = eyVar.f52362s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.camera.q.r(null, 2131748920, org.telegram.ui.Components.hc.a0(eyVar.f52361r));
                    return;
                }
                return;
            case 1:
                ey eyVar2 = this.f51670b;
                FrameLayout frameLayout = eyVar2.f52355a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    eyVar2.postDelayed(new bh(eyVar2, 29), 180L);
                }
                float[] fArr = eyVar2.D;
                if (eyVar2.f52365y == null && eyVar2.f52362s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(eyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(eyVar2.getContext(), true, false);
                    z0Var.j(org.telegram.messenger.hd.M0(2131751265, null), 2131232116, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                    z0Var.setOnClickListener(new wx(eyVar2, 4));
                    org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(eyVar2.getContext(), false, false);
                    z0Var2.j(org.telegram.messenger.hd.M0(2131750471, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                    z0Var2.setOnClickListener(new wx(eyVar2, 5));
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(eyVar2.getContext(), false, true);
                    z0Var3.j(org.telegram.messenger.hd.M0(2131751535, null), 2131232108, null);
                    int i10 = org.telegram.ui.ActionBar.k6.f28070p7;
                    z0Var3.c(i10, i10);
                    z0Var3.h(0.12f, i10);
                    z0Var3.setOnClickListener(new wx(eyVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, c8.ha.o(-1, 48));
                    FrameLayout overlayContainerView = eyVar2.f52361r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        yx.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(eyVar2, eyVar2.getContext(), overlayContainerView, 11);
                        e7 e7Var = new e7(p5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(p5Var, c8.ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        eyVar2.f52365y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.m70(eyVar2, p5Var, overlayContainerView, e7Var, 1));
                        eyVar2.f52365y.setOutsideTouchable(true);
                        eyVar2.f52365y.setFocusable(true);
                        eyVar2.f52365y.setBackgroundDrawable(new ColorDrawable(0));
                        eyVar2.f52365y.setAnimationStyle(2131755192);
                        eyVar2.f52365y.setInputMethodMode(2);
                        eyVar2.f52365y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wr(eyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        eyVar2.f52365y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = eyVar.f52362s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.camera.q.r(null, 2131748920, org.telegram.ui.Components.hc.a0(eyVar.f52361r));
                    return;
                }
                return;
            case 3:
                if (eyVar.f52362s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", eyVar.f52362s);
                        eyVar.f52361r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131749109, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = eyVar.f52365y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                gy gyVar = eyVar.E.f45743c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = gyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(eyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(eyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.k6.H5;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.I = i11;
                    u1Var.R = org.telegram.messenger.hd.M0(2131750765, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new zx(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(eyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.k6.f27957j5;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(gyVar.f46143c.f26065b);
                    org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28145t5, null);
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new ay(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new dy(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745947, null), new a7(eyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    u1Var.setOnShowListener(new fp(1, editTextBoldCursor));
                    u1Var.setOnDismissListener(new cy(editTextBoldCursor, 0));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = eyVar.f52365y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (eyVar.f52362s != null) {
                    org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(eyVar.getContext(), org.telegram.messenger.hd.M0(2131749169, null), eyVar.f52362s, org.telegram.messenger.hd.M0(2131746505, null), false);
                    lg0Var.I0();
                    lg0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = eyVar.f52365y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                gy gyVar2 = eyVar.E.f45743c;
                tL_inputChatlistDialogFilter.filter_id = gyVar2.f46143c.f26064a;
                tL_chatlists_deleteExportedInvite.slug = gyVar2.g0();
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, eyVar.getContext(), null);
                u1Var2.r(180L);
                gyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new ld(25, eyVar, u1Var2));
                return;
        }
    }
}
