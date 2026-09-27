package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tz implements View.OnClickListener {
    public final int f38086a;
    public final zz f38087b;

    public tz(zz zzVar, int i10) {
        this.f38086a = i10;
        this.f38087b = zzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38086a) {
            case 0:
                zz zzVar = this.f38087b;
                String str = zzVar.f38387s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.qk.o(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(zzVar.f38386r));
                    return;
                }
                return;
            case 1:
                zz zzVar2 = this.f38087b;
                FrameLayout frameLayout = zzVar2.f38381a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    zzVar2.postDelayed(new cj(zzVar2, 29), 180L);
                }
                float[] fArr = zzVar2.f38390y;
                if (zzVar2.f38389x == null && zzVar2.f38387s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(zzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.y5.n(-1, 48));
                    g1Var.setOnClickListener(new tz(zzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(zzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.y5.n(-1, 48));
                    g1Var2.setOnClickListener(new tz(zzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(zzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.i6.f19278p7;
                    g1Var3.c(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new tz(zzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, w7.y5.n(-1, 48));
                    FrameLayout overlayContainerView = zzVar2.f38386r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        uz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.r6 r6Var = new ci.r6(zzVar2, zzVar2.getContext(), overlayContainerView, 10);
                        h7 h7Var = new h7(r6Var, 2);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(h7Var);
                        overlayContainerView.addView(r6Var, w7.y5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        zzVar2.f38389x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.e90(zzVar2, r6Var, overlayContainerView, h7Var, 1));
                        zzVar2.f38389x.setOutsideTouchable(true);
                        zzVar2.f38389x.setFocusable(true);
                        zzVar2.f38389x.setBackgroundDrawable(new ColorDrawable(0));
                        zzVar2.f38389x.setAnimationStyle(R.style.PopupContextAnimation);
                        zzVar2.f38389x.setInputMethodMode(2);
                        zzVar2.f38389x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new au(zzVar2, 10));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        zzVar2.f38389x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zz zzVar3 = this.f38087b;
                String str2 = zzVar3.f38387s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.qk.o(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(zzVar3.f38386r));
                    return;
                }
                return;
            case 3:
                zz zzVar4 = this.f38087b;
                if (zzVar4.f38387s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", zzVar4.f38387s);
                        zzVar4.f38386r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                zz zzVar5 = this.f38087b;
                org.telegram.ui.ActionBar.o1 o1Var2 = zzVar5.f38389x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                b00 b00Var = zzVar5.E.f31933c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = b00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(zzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.S(zzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zzVar5.getContext());
                    alertDialog$Builder.f18655a.I = org.telegram.ui.ActionBar.i6.H5;
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(zzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(b00Var.f32190c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19353t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new wz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new yz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new d7(zzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    gq gqVar = new gq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.setOnShowListener(gqVar);
                    c2Var.setOnDismissListener(new xz(0, editTextBoldCursor));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                zz zzVar6 = this.f38087b;
                org.telegram.ui.ActionBar.o1 o1Var3 = zzVar6.f38389x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (zzVar6.f38387s != null) {
                    org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(zzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), zzVar6.f38387s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    wi0Var.m(R.raw.qr_code_logo);
                    wi0Var.show();
                    return;
                }
                return;
            default:
                zz zzVar7 = this.f38087b;
                org.telegram.ui.ActionBar.o1 o1Var4 = zzVar7.f38389x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                b00 b00Var2 = zzVar7.E.f31933c;
                tL_inputChatlistDialogFilter.filter_id = b00Var2.f32190c.f15826id;
                tL_chatlists_deleteExportedInvite.slug = b00Var2.b0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(zzVar7.getContext(), 3, null);
                c2Var2.q(180L);
                b00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new mo(19, zzVar7, c2Var2));
                return;
        }
    }
}
