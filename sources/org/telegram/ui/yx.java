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
    public final int f52342a;
    public final gy f52343b;

    public yx(gy gyVar, int i7) {
        this.f52342a = i7;
        this.f52343b = gyVar;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f52342a;
        gy gyVar = this.f52343b;
        switch (i7) {
            case 0:
                String str = gyVar.f43823s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.camera.q.r(null, 2131748921, org.telegram.ui.Components.hc.a0(gyVar.f43822r));
                    return;
                }
                return;
            case 1:
                gy gyVar2 = this.f52343b;
                FrameLayout frameLayout = gyVar2.f43816a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    gyVar2.postDelayed(new dh(gyVar2, 29), 180L);
                }
                float[] fArr = gyVar2.D;
                if (gyVar2.f43826y == null && gyVar2.f43823s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(gyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(gyVar2.getContext(), true, false);
                    z0Var.j(org.telegram.messenger.id.M0(2131751264, null), 2131232116, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                    z0Var.setOnClickListener(new yx(gyVar2, 4));
                    org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(gyVar2.getContext(), false, false);
                    z0Var2.j(org.telegram.messenger.id.M0(2131750472, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                    z0Var2.setOnClickListener(new yx(gyVar2, 5));
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(gyVar2.getContext(), false, true);
                    z0Var3.j(org.telegram.messenger.id.M0(2131751534, null), 2131232108, null);
                    int i10 = org.telegram.ui.ActionBar.l6.f28086p7;
                    z0Var3.c(i10, i10);
                    z0Var3.h(0.12f, i10);
                    z0Var3.setOnClickListener(new yx(gyVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, c8.ha.o(-1, 48));
                    FrameLayout overlayContainerView = gyVar2.f43822r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ay.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(gyVar2, gyVar2.getContext(), overlayContainerView, 11);
                        e7 e7Var = new e7(p5Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(p5Var, c8.ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        gyVar2.f43826y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.n70(gyVar2, p5Var, overlayContainerView, e7Var, 1));
                        gyVar2.f43826y.setOutsideTouchable(true);
                        gyVar2.f43826y.setFocusable(true);
                        gyVar2.f43826y.setBackgroundDrawable(new ColorDrawable(0));
                        gyVar2.f43826y.setAnimationStyle(2131755192);
                        gyVar2.f43826y.setInputMethodMode(2);
                        gyVar2.f43826y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new yr(gyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        gyVar2.f43826y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = gyVar.f43823s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.camera.q.r(null, 2131748921, org.telegram.ui.Components.hc.a0(gyVar.f43822r));
                    return;
                }
                return;
            case 3:
                if (gyVar.f43823s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", gyVar.f43823s);
                        gyVar.f43822r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = gyVar.f43826y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                iy iyVar = gyVar.E.f46425c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = iyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(gyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.U(gyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getContext());
                    int i11 = org.telegram.ui.ActionBar.l6.H5;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.I = i11;
                    u1Var.R = org.telegram.messenger.id.M0(2131750764, null);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new cy(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(gyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
                    org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i12, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(iyVar.f46776c.f26071b);
                    org.telegram.ui.ActionBar.s6.D(editTextBoldCursor, org.telegram.ui.ActionBar.l6.f28161t5, null);
                    org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, i12, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new dy(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new fy(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745946, null), new a7(gyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    u1Var.setOnShowListener(new hp(1, editTextBoldCursor));
                    u1Var.setOnDismissListener(new ey(editTextBoldCursor, 0));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = gyVar.f43826y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (gyVar.f43823s != null) {
                    org.telegram.ui.Components.mg0 mg0Var = new org.telegram.ui.Components.mg0(gyVar.getContext(), org.telegram.messenger.id.M0(2131749170, null), gyVar.f43823s, org.telegram.messenger.id.M0(2131746506, null), false);
                    mg0Var.I0();
                    mg0Var.show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = gyVar.f43826y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                iy iyVar2 = gyVar.E.f46425c;
                tL_inputChatlistDialogFilter.filter_id = iyVar2.f46776c.f26070a;
                tL_chatlists_deleteExportedInvite.slug = iyVar2.g0();
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, gyVar.getContext(), null);
                u1Var2.r(180L);
                iyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new ld(25, gyVar, u1Var2));
                return;
        }
    }
}
