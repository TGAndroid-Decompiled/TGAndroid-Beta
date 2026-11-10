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
    public final int f52692a;
    public final hy f52693b;

    public zx(hy hyVar, int i7) {
        this.f52692a = i7;
        this.f52693b = hyVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f52692a;
        hy hyVar = this.f52693b;
        switch (i7) {
            case 0:
                String str = hyVar.f44839s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.camera.q.r(null, 2131748921, org.telegram.ui.Components.gc.a0(hyVar.f44838r));
                    return;
                }
                return;
            case 1:
                hy hyVar2 = this.f52693b;
                FrameLayout frameLayout = hyVar2.f44832a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    hyVar2.postDelayed(new dh(hyVar2, 29), 180L);
                }
                float[] fArr = hyVar2.D;
                if (hyVar2.f44842y == null && hyVar2.f44839s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(hyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(hyVar2.getContext(), true, false);
                    z0Var.j(org.telegram.messenger.id.M0(2131751264, null), 2131232116, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                    z0Var.setOnClickListener(new zx(hyVar2, 4));
                    org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(hyVar2.getContext(), false, false);
                    z0Var2.j(org.telegram.messenger.id.M0(2131750472, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                    z0Var2.setOnClickListener(new zx(hyVar2, 5));
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(hyVar2.getContext(), false, true);
                    z0Var3.j(org.telegram.messenger.id.M0(2131751534, null), 2131232108, null);
                    int i10 = org.telegram.ui.ActionBar.m6.f28111p7;
                    z0Var3.c(i10, i10);
                    z0Var3.h(0.12f, i10);
                    z0Var3.setOnClickListener(new zx(hyVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, c8.ha.o(-1, 48));
                    FrameLayout overlayContainerView = hyVar2.f44838r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        cy.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(hyVar2, hyVar2.getContext(), overlayContainerView, 11);
                        e7 e7Var = new e7(p5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(p5Var, c8.ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        hyVar2.f44842y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.m70(hyVar2, p5Var, overlayContainerView, e7Var, 1));
                        hyVar2.f44842y.setOutsideTouchable(true);
                        hyVar2.f44842y.setFocusable(true);
                        hyVar2.f44842y.setBackgroundDrawable(new ColorDrawable(0));
                        hyVar2.f44842y.setAnimationStyle(2131755192);
                        hyVar2.f44842y.setInputMethodMode(2);
                        hyVar2.f44842y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zr(hyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        hyVar2.f44842y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = hyVar.f44839s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.camera.q.r(null, 2131748921, org.telegram.ui.Components.gc.a0(hyVar.f44838r));
                    return;
                }
                return;
            case 3:
                if (hyVar.f44839s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", hyVar.f44839s);
                        hyVar.f44838r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = hyVar.f44842y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                jy jyVar = hyVar.E.f46769c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(hyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.U(hyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hyVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.m6.H5;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.I = i11;
                    u1Var.R = org.telegram.messenger.id.M0(2131750764, null);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new dy(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(hyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.m6.f27998j5;
                    org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(jyVar.f47095c.f26075b);
                    org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f28186t5, null);
                    org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new ey(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new gy(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745946, null), new a7(hyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    u1Var.setOnShowListener(new hp(1, editTextBoldCursor));
                    u1Var.setOnDismissListener(new fy(editTextBoldCursor, 0));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = hyVar.f44842y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (hyVar.f44839s != null) {
                    org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(hyVar.getContext(), org.telegram.messenger.id.M0(2131749170, null), hyVar.f44839s, org.telegram.messenger.id.M0(2131746506, null), false);
                    lg0Var.I0();
                    lg0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = hyVar.f44842y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                jy jyVar2 = hyVar.E.f46769c;
                tL_inputChatlistDialogFilter.filter_id = jyVar2.f47095c.f26074a;
                tL_chatlists_deleteExportedInvite.slug = jyVar2.g0();
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, hyVar.getContext(), null);
                u1Var2.r(180L);
                jyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new ld(25, hyVar, u1Var2));
                return;
        }
    }
}
