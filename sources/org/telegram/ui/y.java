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
    public final int f54134a;
    public final Object f54135b;
    public final Object f54136c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i7) {
        this.f54134a = i7;
        this.f54135b = obj;
        this.f54136c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        bx bxVar;
        org.telegram.ui.ActionBar.w2 w2Var;
        int i7 = this.f54134a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f54136c;
        Object obj3 = this.f54135b;
        switch (i7) {
            case 0:
                g4 g4Var = (g4) obj3;
                String str = (String) obj2;
                k3 k3Var = (k3) obj;
                g4Var.f48072i0.k(false);
                org.telegram.messenger.g0.v1(g4Var.f48072i0.f53414c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.kc(k3Var.f49291f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ei.b bVar = ((m7) obj2).d;
                long j3 = bVar.f10957b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.f10961g);
                y6Var.presentFragment(new bn(bundle));
                d7Var.f46964f.G.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.f46960a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.gi0 gi0Var = (org.telegram.ui.Components.gi0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (gi0Var == null || gi0Var.f35449x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                bn bnVar = (bn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (bnVar.getParentActivity() != null) {
                    if (bnVar.f46162d1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        bnVar.f46118a0.t0(keyboardInlineButton, fjVar, fjVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((bn) obj3).Xa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                bn.k0((bn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                bn.g1((bn) obj3, (tj) obj2, (boolean[]) obj);
                return;
            case 7:
                mm mmVar = (mm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                org.telegram.ui.ActionBar.g2 g2Var = mmVar.f50079a;
                g2Var.finishPreviewFragment();
                chat.left = false;
                if (r1Var != null && r1Var.f31698w != null) {
                    g2Var.getNotificationCenter().k(203, Long.valueOf(r1Var.f31698w.f31106e));
                }
                g2Var.getMessagesController().n(chat.f28492id, g2Var.getUserConfig().f(), null, g2Var, new xl(mmVar, chat, 3));
                return;
            case 8:
                rn rnVar = (rn) obj3;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj2;
                h6.o oVar = (h6.o) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var.a(z10);
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                rnVar.K0 = z12;
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
                rnVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj2;
                PhotoViewer photoViewer = ((vq) obj3).f53019c.f51496a;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                ArrayList arrayList = ((org.telegram.ui.Components.e61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.Components.g61 g61Var = (org.telegram.ui.Components.g61) obj4;
                            if (g61Var.b()) {
                                document = g61Var.f35338g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.g61 g61Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.g61 g61Var3 = (org.telegram.ui.Components.g61) arrayList.get(i11);
                                if (g61Var3.f35341k < j10 && org.telegram.ui.Components.h61.D0(g61Var3.f35343m)) {
                                    j10 = g61Var3.f35341k;
                                    g61Var2 = g61Var3;
                                }
                            }
                            if (g61Var2 != null) {
                                document = g61Var2.f35338g;
                            } else {
                                document = ((org.telegram.ui.Components.g61) arrayList.get(0)).f35338g;
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
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new pn0(photoViewer, 2));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        fjVar2.f24054f3 = document;
                        arrayList2.add(fjVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new na(photoViewer, 2));
                    }
                    photoViewer.f43418p0.V(null, null);
                    return;
                }
                return;
            case 10:
                qr qrVar = (qr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.b5.L((Context) obj2, org.telegram.messenger.gd.N0(2131745890, null), org.telegram.messenger.gd.a0(null, null, 2131745891, user.first_name), org.telegram.messenger.gd.N0(2131745922, null), new ir(qrVar, user, 1), qrVar.f51524r).p();
                return;
            case 11:
                le0 le0Var = (le0) obj3;
                ((org.telegram.ui.Components.x60) obj2).v();
                int i12 = ((org.telegram.messenger.ro) obj).f26773a;
                if (le0Var.f50634c.getCurrentPosition() == 0 && (bxVar = le0Var.K) != null) {
                    bxVar.Q4(i12);
                    return;
                }
                if (le0Var.K == null) {
                    le0Var.r0(null);
                }
                le0Var.J = Integer.valueOf(i12);
                le0Var.s0(0, true);
                le0Var.f50634c.C(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj3;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr[0] = null;
                    w10Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((hi.e) obj3).R && (w2Var = w2VarArr2[0]) != null) {
                    w2Var.dismiss();
                    w2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.n5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43830a);
                m10.remove(((org.telegram.messenger.kv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43830a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public y(org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.messenger.w10 w10Var, String str) {
        this.f54134a = 12;
        this.f54135b = w2VarArr;
        this.d = w10Var;
        this.f54136c = str;
    }
}
