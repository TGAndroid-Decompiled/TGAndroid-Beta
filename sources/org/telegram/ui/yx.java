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
public final class yx implements View.OnClickListener {
    public final int f54445a;
    public final hy f54446b;

    public yx(hy hyVar, int i7) {
        this.f54445a = i7;
        this.f54446b = hyVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f54445a;
        hy hyVar = this.f54446b;
        switch (i7) {
            case 0:
                String str = hyVar.f46903s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.m10.t(null, 2131748728, org.telegram.ui.Components.kc.b0(hyVar.f46902r));
                    return;
                }
                return;
            case 1:
                hy hyVar2 = this.f54446b;
                FrameLayout frameLayout = hyVar2.f46896a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    hyVar2.postDelayed(new ch(hyVar2, 29), 180L);
                }
                float[] fArr = hyVar2.E;
                if (hyVar2.f46906y == null && hyVar2.f46903s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(hyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(hyVar2.getContext(), true, false);
                    y0Var.j(org.telegram.messenger.gd.N0(2131751252, null), 2131232121, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.na.o(-1, 48));
                    y0Var.setOnClickListener(new yx(hyVar2, 4));
                    org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(hyVar2.getContext(), false, false);
                    y0Var2.j(org.telegram.messenger.gd.N0(2131750455, null), 2131232325, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.na.o(-1, 48));
                    y0Var2.setOnClickListener(new yx(hyVar2, 5));
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(hyVar2.getContext(), false, true);
                    y0Var3.j(org.telegram.messenger.gd.N0(2131751522, null), 2131232113, null);
                    int i10 = org.telegram.ui.ActionBar.n6.f29672p7;
                    y0Var3.c(i10, i10);
                    y0Var3.h(0.12f, i10);
                    y0Var3.setOnClickListener(new yx(hyVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, c8.na.o(-1, 48));
                    FrameLayout overlayContainerView = hyVar2.f46902r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        cy.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.w5 w5Var = new hi.w5(hyVar2, hyVar2.getContext(), overlayContainerView, 11);
                        e7 e7Var = new e7(w5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(w5Var, c8.na.c(-1.0f, -1));
                        w5Var.setAlpha(0.0f);
                        w5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        hyVar2.f46906y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.z70(hyVar2, w5Var, overlayContainerView, e7Var, 1));
                        hyVar2.f46906y.setOutsideTouchable(true);
                        hyVar2.f46906y.setFocusable(true);
                        hyVar2.f46906y.setBackgroundDrawable(new ColorDrawable(0));
                        hyVar2.f46906y.setAnimationStyle(2131755192);
                        hyVar2.f46906y.setInputMethodMode(2);
                        hyVar2.f46906y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zr(hyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        hyVar2.f46906y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = hyVar.f46903s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.m10.t(null, 2131748728, org.telegram.ui.Components.kc.b0(hyVar.f46902r));
                    return;
                }
                return;
            case 3:
                if (hyVar.f46903s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", hyVar.f46903s);
                        hyVar.f46902r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.N0(2131748917, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = hyVar.f46906y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                jy jyVar = hyVar.F.f48944c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(hyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.U(hyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hyVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.n6.H5;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.J = i11;
                    t1Var.S = org.telegram.messenger.gd.N0(2131750752, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new dy(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(hyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
                    org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(jyVar.f49235c.f26774b);
                    org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29747t5, null);
                    org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new ey(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new gy(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745750, null), new a7(hyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    t1Var.setOnShowListener(new hp(1, editTextBoldCursor));
                    t1Var.setOnDismissListener(new fy(editTextBoldCursor, 0));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = hyVar.f46906y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (hyVar.f46903s != null) {
                    org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(hyVar.getContext(), org.telegram.messenger.gd.N0(2131748977, null), hyVar.f46903s, org.telegram.messenger.gd.N0(2131746310, null), false);
                    zg0Var.J0();
                    zg0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = hyVar.f46906y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                jy jyVar2 = hyVar.F.f48944c;
                tL_inputChatlistDialogFilter.filter_id = jyVar2.f49235c.f26773a;
                tL_chatlists_deleteExportedInvite.slug = jyVar2.g0();
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, hyVar.getContext(), null);
                t1Var2.r(180L);
                jyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new v7(27, hyVar, t1Var2));
                return;
        }
    }
}
