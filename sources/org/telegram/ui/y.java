package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y implements View.OnClickListener {
    public final int f53360a;
    public final Object f53361b;
    public final Object f53362c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i7) {
        this.f53360a = i7;
        this.f53361b = obj;
        this.f53362c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        yw ywVar;
        org.telegram.ui.ActionBar.u2 u2Var;
        int i7 = this.f53360a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f53362c;
        Object obj3 = this.f53361b;
        switch (i7) {
            case 0:
                g4 g4Var = (g4) obj3;
                String str = (String) obj2;
                k3 k3Var = (k3) obj;
                g4Var.f47314i0.k(false);
                org.telegram.messenger.g0.v1(g4Var.f47314i0.f52652c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.cc(k3Var.f48506f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ei.b bVar = ((m7) obj2).d;
                long j3 = bVar.f10647b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.f10651g);
                y6Var.presentFragment(new an(bundle));
                d7Var.f46298f.G.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.f46294a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.vh0 vh0Var = (org.telegram.ui.Components.vh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (vh0Var == null || vh0Var.f40425x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                an anVar = (an) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (anVar.getParentActivity() != null) {
                    if (anVar.f45161d1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        anVar.f45117a0.i0(keyboardInlineButton, gjVar, gjVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((an) obj3).Xa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                an.k0((an) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                an.g1((an) obj3, (sj) obj2, (boolean[]) obj);
                return;
            case 7:
                lm lmVar = (lm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.e2 e2Var = lmVar.f49001a;
                e2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.f31195w != null) {
                    e2Var.getNotificationCenter().k(201, Long.valueOf(q1Var.f31195w.f30586e));
                }
                e2Var.getMessagesController().n(chat.f28051id, e2Var.getUserConfig().f(), null, e2Var, new wl(lmVar, chat, 3));
                return;
            case 8:
                qn qnVar = (qn) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.g6 g6Var = g6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g6Var.a(z10);
                org.telegram.ui.Cells.g6 g6Var2 = g6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                qnVar.K0 = z12;
                ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29724y0.run();
                qnVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
                PhotoViewer photoViewer = ((uq) obj3).f51996c.f49587a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                ArrayList arrayList = ((org.telegram.ui.Components.r51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.Components.t51 t51Var = (org.telegram.ui.Components.t51) obj4;
                            if (t51Var.b()) {
                                document = t51Var.f39548g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.t51 t51Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.t51 t51Var3 = (org.telegram.ui.Components.t51) arrayList.get(i11);
                                if (t51Var3.f39551k < j10 && org.telegram.ui.Components.u51.D0(t51Var3.f39553m)) {
                                    j10 = t51Var3.f39551k;
                                    t51Var2 = t51Var3;
                                }
                            }
                            if (t51Var2 != null) {
                                document = t51Var2.f39548g;
                            } else {
                                document = ((org.telegram.ui.Components.t51) arrayList.get(0)).f39548g;
                            }
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.U);
                    File J = org.telegram.messenger.w7.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.U);
                        J = org.telegram.messenger.w7.J(document, null, true, true);
                    }
                    if (J != null && J.exists()) {
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new ln0(photoViewer, 2));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        gjVar2.f23800f3 = document;
                        arrayList2.add(gjVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new na(photoViewer, 2));
                    }
                    photoViewer.f42847p0.V(null, null);
                    return;
                }
                return;
            case 10:
                pr prVar = (pr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.t4.L((Context) obj2, org.telegram.messenger.hd.M0(2131746086, null), org.telegram.messenger.hd.a0(null, null, 2131746087, user.first_name), org.telegram.messenger.hd.M0(2131746118, null), new hr(prVar, user, 1), prVar.f50342r).p();
                return;
            case 11:
                je0 je0Var = (je0) obj3;
                ((org.telegram.ui.Components.m60) obj2).u();
                int i12 = ((org.telegram.messenger.so) obj).f26552a;
                if (je0Var.f49201c.getCurrentPosition() == 0 && (ywVar = je0Var.K) != null) {
                    ywVar.I4(i12);
                    return;
                }
                if (je0Var.K == null) {
                    je0Var.r0(null);
                }
                je0Var.J = Integer.valueOf(i12);
                je0Var.s0(0, true);
                je0Var.f49201c.C(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj3;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2VarArr[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    u2VarArr[0] = null;
                    z10Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.u2[] u2VarArr2 = (org.telegram.ui.ActionBar.u2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((hi.d) obj3).R && (u2Var = u2VarArr2[0]) != null) {
                    u2Var.dismiss();
                    u2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43258a);
                m10.remove(((org.telegram.messenger.ov) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43258a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public y(org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.messenger.z10 z10Var, String str) {
        this.f53360a = 12;
        this.f53361b = u2VarArr;
        this.d = z10Var;
        this.f53362c = str;
    }
}
