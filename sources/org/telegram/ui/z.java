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
    public final int f52389a;
    public final Object f52390b;
    public final Object f52391c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i7) {
        this.f52389a = i7;
        this.f52390b = obj;
        this.f52391c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        TLRPC.Document document;
        ww wwVar;
        org.telegram.ui.ActionBar.v2 v2Var;
        int i7 = this.f52389a;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f52391c;
        Object obj3 = this.f52390b;
        switch (i7) {
            case 0:
                g4 g4Var = (g4) obj3;
                String str = (String) obj2;
                k3 k3Var = (k3) obj;
                g4Var.f45807h0.k(false);
                org.telegram.messenger.g0.v1(g4Var.f45807h0.f51189b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.hc(k3Var.f47088f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ci.b bVar = ((m7) obj2).d;
                long j3 = bVar.f6418b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.f6422g);
                y6Var.presentFragment(new an(bundle));
                d7Var.f44979f.F.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.f44975a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.rh0 rh0Var = (org.telegram.ui.Components.rh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (rh0Var == null || rh0Var.f37669x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                an anVar = (an) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (anVar.getParentActivity() != null) {
                    if (anVar.f43752c1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        anVar.Z.Z(keyboardInlineButton, ijVar, ijVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((an) obj3).Ua((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                an.j0((an) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                an.Z0((an) obj3, (sj) obj2, (boolean[]) obj);
                return;
            case 7:
                lm lmVar = (lm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.f2 f2Var = lmVar.f47557a;
                f2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.f30048w != null) {
                    f2Var.getNotificationCenter().k(201, Long.valueOf(q1Var.f30048w.f29468e));
                }
                f2Var.getMessagesController().n(chat.f26956id, f2Var.getUserConfig().f(), null, f2Var, new wl(lmVar, chat, 3));
                return;
            case 8:
                pn pnVar = (pn) obj3;
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
                pnVar.J0 = z11;
                ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28655x0.run();
                pnVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
                PhotoViewer photoViewer = ((sq) obj3).f49807c.f47560a;
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
                                document = r51Var.f37526g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r51 r51Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.r51 r51Var3 = (org.telegram.ui.Components.r51) arrayList.get(i11);
                                if (r51Var3.f37529k < j10 && org.telegram.ui.Components.t51.D0(r51Var3.f37531m)) {
                                    j10 = r51Var3.f37529k;
                                    r51Var2 = r51Var3;
                                }
                            }
                            if (r51Var2 != null) {
                                document = r51Var2.f37526g;
                            } else {
                                document = ((org.telegram.ui.Components.r51) arrayList.get(0)).f37526g;
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
                        MediaController.d0(J.toString(), photoViewer.D, 1, null, null, new jn0(photoViewer, 2));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ijVar2.f23233d3 = document;
                        arrayList2.add(ijVar2);
                        MediaController.g0(photoViewer.D, org.telegram.messenger.c.a(photoViewer.T), arrayList2, new na(photoViewer, 2));
                    }
                    photoViewer.f41470o0.U(null, null);
                    return;
                }
                return;
            case 10:
                nr nrVar = (nr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.v4.L((Context) obj2, org.telegram.messenger.id.M0(2131746089, null), org.telegram.messenger.id.a0(null, null, 2131746090, user.first_name), org.telegram.messenger.id.M0(2131746121, null), new fr(nrVar, user, 1), nrVar.f48122r).p();
                return;
            case 11:
                je0 je0Var = (je0) obj3;
                ((org.telegram.ui.Components.k60) obj2).u();
                int i12 = ((org.telegram.messenger.vo) obj).f26070a;
                if (je0Var.f48363c.getCurrentPosition() == 0 && (wwVar = je0Var.J) != null) {
                    wwVar.I4(i12);
                    return;
                }
                if (je0Var.J == null) {
                    je0Var.r0(null);
                }
                je0Var.I = Integer.valueOf(i12);
                je0Var.s0(0, true);
                je0Var.f48363c.E(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2VarArr[0];
                if (v2Var2 != null) {
                    v2Var2.dismiss();
                    v2VarArr[0] = null;
                    c20Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.v2[] v2VarArr2 = (org.telegram.ui.ActionBar.v2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((fi.d) obj3).Q && (v2Var = v2VarArr2[0]) != null) {
                    v2Var.dismiss();
                    v2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.d0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41887a);
                m10.remove(((org.telegram.messenger.qv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41887a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public z(org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.messenger.c20 c20Var, String str) {
        this.f52389a = 12;
        this.f52390b = v2VarArr;
        this.d = c20Var;
        this.f52391c = str;
    }
}
