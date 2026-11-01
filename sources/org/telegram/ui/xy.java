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
public final class xy implements View.OnClickListener {
    public final int f43480a;
    public final fz f43481b;

    public xy(fz fzVar, int i10) {
        this.f43480a = i10;
        this.f43481b = fzVar;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f43480a;
        fz fzVar = this.f43481b;
        switch (i10) {
            case 0:
                String str = fzVar.f35866s;
                if (str != null) {
                    org.telegram.messenger.i0.g(str);
                    org.telegram.messenger.a30.r(null, 2131748931, org.telegram.ui.Components.cc.a0(fzVar.f35865r));
                    return;
                }
                return;
            case 1:
                fz fzVar2 = this.f43481b;
                FrameLayout frameLayout = fzVar2.f35860a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    fzVar2.postDelayed(new yy(fzVar2, 0), 180L);
                }
                float[] fArr = fzVar2.D;
                if (fzVar2.f35869y == null && fzVar2.f35866s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(fzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), true, false);
                    b1Var.j(org.telegram.messenger.dd.L0(2131751265, null), 2131232115, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var, w7.b6.o(-1, 48));
                    b1Var.setOnClickListener(new xy(fzVar2, 4));
                    org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), false, false);
                    b1Var2.j(org.telegram.messenger.dd.L0(2131750481, null), 2131232319, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var2, w7.b6.o(-1, 48));
                    b1Var2.setOnClickListener(new xy(fzVar2, 5));
                    org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), false, true);
                    b1Var3.j(org.telegram.messenger.dd.L0(2131751535, null), 2131232107, null);
                    int i11 = org.telegram.ui.ActionBar.t6.f21154p7;
                    b1Var3.c(i11, i11);
                    b1Var3.h(0.12f, i11);
                    b1Var3.setOnClickListener(new xy(fzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var3, w7.b6.o(-1, 48));
                    FrameLayout overlayContainerView = fzVar2.f35865r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        az.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        kg.f0 f0Var = new kg.f0(fzVar2, fzVar2.getContext(), overlayContainerView, 10);
                        e7 e7Var = new e7(f0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(f0Var, w7.b6.c(-1.0f, -1));
                        f0Var.setAlpha(0.0f);
                        f0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        fzVar2.f35869y = k1Var;
                        k1Var.setOnDismissListener(new org.telegram.ui.Components.f80(fzVar2, f0Var, overlayContainerView, e7Var, 1));
                        fzVar2.f35869y.setOutsideTouchable(true);
                        fzVar2.f35869y.setFocusable(true);
                        fzVar2.f35869y.setBackgroundDrawable(new ColorDrawable(0));
                        fzVar2.f35869y.setAnimationStyle(2131755192);
                        fzVar2.f35869y.setInputMethodMode(2);
                        fzVar2.f35869y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new st(fzVar2, 10));
                        if (org.telegram.messenger.i0.Q1()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        fzVar2.f35869y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = fzVar.f35866s;
                if (str2 != null) {
                    org.telegram.messenger.i0.g(str2);
                    org.telegram.messenger.a30.r(null, 2131748931, org.telegram.ui.Components.cc.a0(fzVar.f35865r));
                    return;
                }
                return;
            case 3:
                if (fzVar.f35866s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", fzVar.f35866s);
                        fzVar.f35865r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131749120, null)), 500);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.k1 k1Var2 = fzVar.f35869y;
                if (k1Var2 != null) {
                    k1Var2.d(true);
                }
                hz hzVar = fzVar.E.f37594c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(fzVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.U(fzVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fzVar.getContext());
                    int i12 = org.telegram.ui.ActionBar.t6.H5;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.I = i12;
                    x1Var.R = org.telegram.messenger.dd.L0(2131750765, null);
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new bz(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(fzVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i13 = org.telegram.ui.ActionBar.t6.f21038j5;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(hzVar.f37898c.f15001b);
                    org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21223t5, null);
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i13, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new cz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new ez(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131745963, null), new a7(fzVar, editTextBoldCursor, alertDialog$Builder, 13));
                    x1Var.setOnShowListener(new dq(1, editTextBoldCursor));
                    x1Var.setOnDismissListener(new dz(editTextBoldCursor, 0));
                    x1Var.show();
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.k1 k1Var3 = fzVar.f35869y;
                if (k1Var3 != null) {
                    k1Var3.d(true);
                }
                if (fzVar.f35866s != null) {
                    org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(fzVar.getContext(), org.telegram.messenger.dd.L0(2131749180, null), fzVar.f35866s, org.telegram.messenger.dd.L0(2131746521, null), false);
                    oh0Var.I0();
                    oh0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k1 k1Var4 = fzVar.f35869y;
                if (k1Var4 != null) {
                    k1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                hz hzVar2 = fzVar.E.f37594c;
                tL_inputChatlistDialogFilter.filter_id = hzVar2.f37898c.f15000a;
                tL_chatlists_deleteExportedInvite.slug = hzVar2.g0();
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, fzVar.getContext(), null);
                x1Var2.r(180L);
                hzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.t20(9, fzVar, x1Var2));
                return;
        }
    }
}
