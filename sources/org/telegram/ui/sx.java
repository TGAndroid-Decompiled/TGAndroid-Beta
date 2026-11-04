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
public final class sx implements View.OnClickListener {
    public final int f49638a;
    public final zx f49639b;

    public sx(zx zxVar, int i3) {
        this.f49638a = i3;
        this.f49639b = zxVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i3 = this.f49638a;
        zx zxVar = this.f49639b;
        switch (i3) {
            case 0:
                String str = zxVar.f50343s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.camera.q.r(null, 2131748929, org.telegram.ui.Components.fc.a0(zxVar.f50342r));
                    return;
                }
                return;
            case 1:
                zx zxVar2 = this.f49639b;
                FrameLayout frameLayout = zxVar2.f50336a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    zxVar2.postDelayed(new xg(zxVar2, 29), 180L);
                }
                float[] fArr = zxVar2.E;
                if (zxVar2.f50346y == null && zxVar2.f50343s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zxVar2.getContext(), null);
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(zxVar2.getContext(), true, false);
                    y0Var.j(org.telegram.messenger.bd.M0(2131751265, null), 2131232116, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, b8.mf.o(-1, 48));
                    y0Var.setOnClickListener(new sx(zxVar2, 4));
                    org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(zxVar2.getContext(), false, false);
                    y0Var2.j(org.telegram.messenger.bd.M0(2131750480, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, b8.mf.o(-1, 48));
                    y0Var2.setOnClickListener(new sx(zxVar2, 5));
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(zxVar2.getContext(), false, true);
                    y0Var3.j(org.telegram.messenger.bd.M0(2131751535, null), 2131232108, null);
                    int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
                    y0Var3.c(i10, i10);
                    y0Var3.h(0.12f, i10);
                    y0Var3.setOnClickListener(new sx(zxVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, b8.mf.o(-1, 48));
                    FrameLayout overlayContainerView = zxVar2.f50342r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ux.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        gi.n5 n5Var = new gi.n5(zxVar2, zxVar2.getContext(), overlayContainerView, 11);
                        f7 f7Var = new f7(n5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(f7Var);
                        overlayContainerView.addView(n5Var, b8.mf.c(-1.0f, -1));
                        n5Var.setAlpha(0.0f);
                        n5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        zxVar2.f50346y = f1Var;
                        f1Var.setOnDismissListener(new org.telegram.ui.Components.i70(zxVar2, n5Var, overlayContainerView, f7Var, 1));
                        zxVar2.f50346y.setOutsideTouchable(true);
                        zxVar2.f50346y.setFocusable(true);
                        zxVar2.f50346y.setBackgroundDrawable(new ColorDrawable(0));
                        zxVar2.f50346y.setAnimationStyle(2131755192);
                        zxVar2.f50346y.setInputMethodMode(2);
                        zxVar2.f50346y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ur(zxVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        zxVar2.f50346y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = zxVar.f50343s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.camera.q.r(null, 2131748929, org.telegram.ui.Components.fc.a0(zxVar.f50342r));
                    return;
                }
                return;
            case 3:
                if (zxVar.f50343s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", zxVar.f50343s);
                        zxVar.f50342r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131749118, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.f1 f1Var2 = zxVar.f50346y;
                if (f1Var2 != null) {
                    f1Var2.d(true);
                }
                cy cyVar = zxVar.F.f43857c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = cyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(zxVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(zxVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.k6.H5;
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.J = i11;
                    s1Var.S = org.telegram.messenger.bd.M0(2131750765, null);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new vx(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(zxVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(cyVar.f44477c.f24238b);
                    org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28176t5, null);
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new wx(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new yx(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745956, null), new b7(zxVar, editTextBoldCursor, alertDialog$Builder, 13));
                    s1Var.setOnShowListener(new dp(1, editTextBoldCursor));
                    s1Var.setOnDismissListener(new xx(editTextBoldCursor, 0));
                    s1Var.show();
                    s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.f1 f1Var3 = zxVar.f50346y;
                if (f1Var3 != null) {
                    f1Var3.d(true);
                }
                if (zxVar.f50343s != null) {
                    org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(zxVar.getContext(), org.telegram.messenger.bd.M0(2131749178, null), zxVar.f50343s, org.telegram.messenger.bd.M0(2131746514, null), false);
                    og0Var.I0();
                    og0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var4 = zxVar.f50346y;
                if (f1Var4 != null) {
                    f1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                cy cyVar2 = zxVar.F.f43857c;
                tL_inputChatlistDialogFilter.filter_id = cyVar2.f44477c.f24237a;
                tL_chatlists_deleteExportedInvite.slug = cyVar2.g0();
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, zxVar.getContext(), null);
                s1Var2.r(180L);
                cyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.ActionBar.h6(28, zxVar, s1Var2));
                return;
        }
    }
}
