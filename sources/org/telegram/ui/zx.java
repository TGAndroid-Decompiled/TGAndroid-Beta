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
public final class zx implements View.OnClickListener {
    public final int f54620a;
    public final iy f54621b;

    public zx(iy iyVar, int i7) {
        this.f54620a = i7;
        this.f54621b = iyVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f54620a;
        iy iyVar = this.f54621b;
        switch (i7) {
            case 0:
                String str = iyVar.f47047s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.o10.t(null, 2131748728, org.telegram.ui.Components.lc.b0(iyVar.f47046r));
                    return;
                }
                return;
            case 1:
                iy iyVar2 = this.f54621b;
                FrameLayout frameLayout = iyVar2.f47040a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    iyVar2.postDelayed(new bh(iyVar2, 29), 180L);
                }
                float[] fArr = iyVar2.E;
                if (iyVar2.f47050y == null && iyVar2.f47047s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(iyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(iyVar2.getContext(), true, false);
                    y0Var.j(org.telegram.messenger.hd.N0(2131751252, null), 2131232118, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.na.o(-1, 48));
                    y0Var.setOnClickListener(new zx(iyVar2, 4));
                    org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(iyVar2.getContext(), false, false);
                    y0Var2.j(org.telegram.messenger.hd.N0(2131750455, null), 2131232322, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.na.o(-1, 48));
                    y0Var2.setOnClickListener(new zx(iyVar2, 5));
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(iyVar2.getContext(), false, true);
                    y0Var3.j(org.telegram.messenger.hd.N0(2131751522, null), 2131232110, null);
                    int i10 = org.telegram.ui.ActionBar.m6.f29568p7;
                    y0Var3.c(i10, i10);
                    y0Var3.h(0.12f, i10);
                    y0Var3.setOnClickListener(new zx(iyVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, c8.na.o(-1, 48));
                    FrameLayout overlayContainerView = iyVar2.f47046r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        dy.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.m5 m5Var = new hi.m5(iyVar2, iyVar2.getContext(), overlayContainerView, 11);
                        d7 d7Var = new d7(m5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(d7Var);
                        overlayContainerView.addView(m5Var, c8.na.c(-1.0f, -1));
                        m5Var.setAlpha(0.0f);
                        m5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        iyVar2.f47050y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.c80(iyVar2, m5Var, overlayContainerView, d7Var, 1));
                        iyVar2.f47050y.setOutsideTouchable(true);
                        iyVar2.f47050y.setFocusable(true);
                        iyVar2.f47050y.setBackgroundDrawable(new ColorDrawable(0));
                        iyVar2.f47050y.setAnimationStyle(2131755192);
                        iyVar2.f47050y.setInputMethodMode(2);
                        iyVar2.f47050y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zr(iyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        iyVar2.f47050y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = iyVar.f47047s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.o10.t(null, 2131748728, org.telegram.ui.Components.lc.b0(iyVar.f47046r));
                    return;
                }
                return;
            case 3:
                if (iyVar.f47047s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", iyVar.f47047s);
                        iyVar.f47046r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131748917, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = iyVar.f47050y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                ky kyVar = iyVar.F.f49099c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(iyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.U(iyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iyVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.m6.H5;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.J = i11;
                    t1Var.S = org.telegram.messenger.hd.N0(2131750752, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ey(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(iyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.m6.f29455j5;
                    org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(kyVar.f49388c.f26851b);
                    org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29643t5, null);
                    org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new hy(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745750, null), new z6(iyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    t1Var.setOnShowListener(new hp(1, editTextBoldCursor));
                    t1Var.setOnDismissListener(new gy(editTextBoldCursor, 0));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = iyVar.f47050y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (iyVar.f47047s != null) {
                    org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(iyVar.getContext(), org.telegram.messenger.hd.N0(2131748977, null), iyVar.f47047s, org.telegram.messenger.hd.N0(2131746310, null), false);
                    ah0Var.J0();
                    ah0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = iyVar.f47050y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                ky kyVar2 = iyVar.F.f49099c;
                tL_inputChatlistDialogFilter.filter_id = kyVar2.f49388c.f26850a;
                tL_chatlists_deleteExportedInvite.slug = kyVar2.g0();
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, iyVar.getContext(), null);
                t1Var2.r(180L);
                kyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new u7(27, iyVar, t1Var2));
                return;
        }
    }
}
