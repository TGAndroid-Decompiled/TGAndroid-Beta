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
public final class z implements View.OnClickListener {
    public final int f52154a;
    public final Object f52155b;
    public final Object f52156c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i7) {
        this.f52154a = i7;
        this.f52155b = obj;
        this.f52156c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        TLRPC.Document document;
        zw zwVar;
        org.telegram.ui.ActionBar.w2 w2Var;
        int i7 = this.f52154a;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f52156c;
        Object obj3 = this.f52155b;
        switch (i7) {
            case 0:
                g4 g4Var = (g4) obj3;
                String str = (String) obj2;
                k3 k3Var = (k3) obj;
                g4Var.f45959h0.k(false);
                org.telegram.messenger.g0.v1(g4Var.f45959h0.f51124b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.gc(k3Var.f47145f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ci.b bVar = ((m7) obj2).d;
                long j3 = bVar.f6421b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.f6425g);
                y6Var.presentFragment(new cn(bundle));
                d7Var.f44915f.F.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.f44911a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.rh0 rh0Var = (org.telegram.ui.Components.rh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (rh0Var == null || rh0Var.f37658x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                cn cnVar = (cn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (cnVar.getParentActivity() != null) {
                    if (cnVar.f44448c1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        cnVar.Z.Z(keyboardInlineButton, ijVar, ijVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((cn) obj3).Wa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                cn.k0((cn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                cn.g1((cn) obj3, (uj) obj2, (boolean[]) obj);
                return;
            case 7:
                nm nmVar = (nm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.f2 f2Var = nmVar.f48227a;
                f2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.f30063w != null) {
                    f2Var.getNotificationCenter().k(201, Long.valueOf(q1Var.f30063w.f29483e));
                }
                f2Var.getMessagesController().n(chat.f26960id, f2Var.getUserConfig().f(), null, f2Var, new yl(nmVar, chat, 3));
                return;
            case 8:
                rn rnVar = (rn) obj3;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
                if (num.intValue() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h6Var.a(z9);
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
                if (num.intValue() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var2.a(z10);
                if (num.intValue() == 1) {
                    z11 = true;
                }
                rnVar.J0 = z11;
                ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28711x0.run();
                rnVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
                PhotoViewer photoViewer = ((vq) obj3).f50780c.f48556a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                ArrayList arrayList = ((org.telegram.ui.Components.p51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) obj4;
                            if (r51Var.b()) {
                                document = r51Var.f37515g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r51 r51Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.r51 r51Var3 = (org.telegram.ui.Components.r51) arrayList.get(i11);
                                if (r51Var3.f37518k < j10 && org.telegram.ui.Components.t51.D0(r51Var3.f37520m)) {
                                    j10 = r51Var3.f37518k;
                                    r51Var2 = r51Var3;
                                }
                            }
                            if (r51Var2 != null) {
                                document = r51Var2.f37515g;
                            } else {
                                document = ((org.telegram.ui.Components.r51) arrayList.get(0)).f37515g;
                            }
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.T);
                    File J = org.telegram.messenger.w7.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.T);
                        J = org.telegram.messenger.w7.J(document, null, true, true);
                    }
                    if (J != null && J.exists()) {
                        MediaController.d0(J.toString(), photoViewer.D, 1, null, null, new mn0(photoViewer, 2));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ijVar2.f23237d3 = document;
                        arrayList2.add(ijVar2);
                        MediaController.g0(photoViewer.D, org.telegram.messenger.c.a(photoViewer.T), arrayList2, new na(photoViewer, 2));
                    }
                    photoViewer.f41468o0.U(null, null);
                    return;
                }
                return;
            case 10:
                qr qrVar = (qr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.u4.L((Context) obj2, org.telegram.messenger.id.M0(2131746086, null), org.telegram.messenger.id.a0(null, null, 2131746087, user.first_name), org.telegram.messenger.id.M0(2131746118, null), new ir(qrVar, user, 1), qrVar.f49138r).p();
                return;
            case 11:
                me0 me0Var = (me0) obj3;
                ((org.telegram.ui.Components.k60) obj2).u();
                int i12 = ((org.telegram.messenger.vo) obj).f26074a;
                if (me0Var.f49345c.getCurrentPosition() == 0 && (zwVar = me0Var.J) != null) {
                    zwVar.I4(i12);
                    return;
                }
                if (me0Var.J == null) {
                    me0Var.r0(null);
                }
                me0Var.I = Integer.valueOf(i12);
                me0Var.s0(0, true);
                me0Var.f49345c.E(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr[0] = null;
                    c20Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((fi.d) obj3).Q && (w2Var = w2VarArr2[0]) != null) {
                    w2Var.dismiss();
                    w2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.m5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41885a);
                m10.remove(((org.telegram.messenger.qv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41885a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public z(org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.messenger.c20 c20Var, String str) {
        this.f52154a = 12;
        this.f52155b = w2VarArr;
        this.d = c20Var;
        this.f52156c = str;
    }
}
