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
public final class yy implements View.OnClickListener {
    public final int f43914a;
    public final gz f43915b;

    public yy(gz gzVar, int i10) {
        this.f43914a = i10;
        this.f43915b = gzVar;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f43914a;
        gz gzVar = this.f43915b;
        switch (i10) {
            case 0:
                String str = gzVar.f36330s;
                if (str != null) {
                    org.telegram.messenger.i0.g(str);
                    org.telegram.messenger.z20.r(null, 2131748931, org.telegram.ui.Components.cc.a0(gzVar.f36329r));
                    return;
                }
                return;
            case 1:
                gz gzVar2 = this.f43915b;
                FrameLayout frameLayout = gzVar2.f36324a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    gzVar2.postDelayed(new zy(gzVar2, 0), 180L);
                }
                float[] fArr = gzVar2.D;
                if (gzVar2.f36333y == null && gzVar2.f36330s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(gzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(gzVar2.getContext(), true, false);
                    b1Var.j(org.telegram.messenger.cd.L0(2131751265, null), 2131232115, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var, w7.b6.o(-1, 48));
                    b1Var.setOnClickListener(new yy(gzVar2, 4));
                    org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(gzVar2.getContext(), false, false);
                    b1Var2.j(org.telegram.messenger.cd.L0(2131750481, null), 2131232319, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var2, w7.b6.o(-1, 48));
                    b1Var2.setOnClickListener(new yy(gzVar2, 5));
                    org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(gzVar2.getContext(), false, true);
                    b1Var3.j(org.telegram.messenger.cd.L0(2131751535, null), 2131232107, null);
                    int i11 = org.telegram.ui.ActionBar.t6.f21153p7;
                    b1Var3.c(i11, i11);
                    b1Var3.h(0.12f, i11);
                    b1Var3.setOnClickListener(new yy(gzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var3, w7.b6.o(-1, 48));
                    FrameLayout overlayContainerView = gzVar2.f36329r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        bz.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        kg.f0 f0Var = new kg.f0(gzVar2, gzVar2.getContext(), overlayContainerView, 10);
                        e7 e7Var = new e7(f0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(f0Var, w7.b6.c(-1.0f, -1));
                        f0Var.setAlpha(0.0f);
                        f0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        gzVar2.f36333y = k1Var;
                        k1Var.setOnDismissListener(new org.telegram.ui.Components.f80(gzVar2, f0Var, overlayContainerView, e7Var, 1));
                        gzVar2.f36333y.setOutsideTouchable(true);
                        gzVar2.f36333y.setFocusable(true);
                        gzVar2.f36333y.setBackgroundDrawable(new ColorDrawable(0));
                        gzVar2.f36333y.setAnimationStyle(2131755192);
                        gzVar2.f36333y.setInputMethodMode(2);
                        gzVar2.f36333y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new tt(gzVar2, 10));
                        if (org.telegram.messenger.i0.Q1()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        gzVar2.f36333y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = gzVar.f36330s;
                if (str2 != null) {
                    org.telegram.messenger.i0.g(str2);
                    org.telegram.messenger.z20.r(null, 2131748931, org.telegram.ui.Components.cc.a0(gzVar.f36329r));
                    return;
                }
                return;
            case 3:
                if (gzVar.f36330s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", gzVar.f36330s);
                        gzVar.f36329r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131749120, null)), 500);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.k1 k1Var2 = gzVar.f36333y;
                if (k1Var2 != null) {
                    k1Var2.d(true);
                }
                iz izVar = gzVar.E.f38061c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = izVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(gzVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.U(gzVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gzVar.getContext());
                    int i12 = org.telegram.ui.ActionBar.t6.H5;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.I = i12;
                    x1Var.R = org.telegram.messenger.cd.L0(2131750765, null);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new cz(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(gzVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i13 = org.telegram.ui.ActionBar.t6.f21037j5;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(izVar.f38380c.f14646b);
                    org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21222t5, null);
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i13, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new dz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new fz(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745963, null), new a7(gzVar, editTextBoldCursor, alertDialog$Builder, 13));
                    x1Var.setOnShowListener(new dq(1, editTextBoldCursor));
                    x1Var.setOnDismissListener(new ez(editTextBoldCursor, 0));
                    x1Var.show();
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.k1 k1Var3 = gzVar.f36333y;
                if (k1Var3 != null) {
                    k1Var3.d(true);
                }
                if (gzVar.f36330s != null) {
                    org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(gzVar.getContext(), org.telegram.messenger.cd.L0(2131749180, null), gzVar.f36330s, org.telegram.messenger.cd.L0(2131746521, null), false);
                    nh0Var.I0();
                    nh0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k1 k1Var4 = gzVar.f36333y;
                if (k1Var4 != null) {
                    k1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                iz izVar2 = gzVar.E.f38061c;
                tL_inputChatlistDialogFilter.filter_id = izVar2.f38380c.f14645a;
                tL_chatlists_deleteExportedInvite.slug = izVar2.f0();
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, gzVar.getContext(), null);
                x1Var2.r(180L);
                izVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.t20(9, gzVar, x1Var2));
                return;
        }
    }
}
