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
public final class x implements View.OnClickListener {
    public final int f43187a;
    public final Object f43188b;
    public final Object f43189c;
    public final Object d;

    public x(Object obj, Object obj2, Object obj3, int i10) {
        this.f43187a = i10;
        this.f43188b = obj;
        this.f43189c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        zx zxVar;
        org.telegram.ui.ActionBar.z2 z2Var;
        int i10 = this.f43187a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f43189c;
        Object obj3 = this.f43188b;
        switch (i10) {
            case 0:
                h4 h4Var = (h4) obj3;
                String str = (String) obj2;
                l3 l3Var = (l3) obj;
                h4Var.f37679h0.k(false);
                org.telegram.messenger.i0.v1(h4Var.f37679h0.f42897b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.i0.g(str);
                new org.telegram.ui.Components.cc(l3Var.f39063f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                sh.a aVar = ((m7) obj2).d;
                long j10 = aVar.f48504b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f48507g);
                y6Var.presentFragment(new un(bundle));
                d7Var.f36511f.F.dismiss();
                org.telegram.ui.ActionBar.k1 k1Var = d7Var.f36508a;
                if (k1Var != null) {
                    k1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (wi0Var == null || wi0Var.f32259x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                un unVar = (un) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                if (unVar.getParentActivity() != null) {
                    if (unVar.f42018c1.getVisibility() != 0 || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        unVar.Z.Y(keyboardInlineButton, kjVar, kjVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((un) obj3).Pa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                un.i0((un) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                un.W0((un) obj3, (ok) obj2, (boolean[]) obj);
                return;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.k2 k2Var = fnVar.f37191a;
                k2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.f22762w != null) {
                    k2Var.getNotificationCenter().k(201, Long.valueOf(q1Var.f22762w.e));
                }
                k2Var.getMessagesController().n(chat.f19794id, k2Var.getUserConfig().f(), null, k2Var, new sm(fnVar, chat, 3));
                return;
            case 8:
                oo ooVar = (oo) obj3;
                org.telegram.ui.Cells.l6[] l6VarArr = (org.telegram.ui.Cells.l6[]) obj2;
                l2.f fVar = (l2.f) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.l6 l6Var = l6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l6Var.a(z10);
                org.telegram.ui.Cells.l6 l6Var2 = l6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                ooVar.J0 = z12;
                ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21622x0.run();
                ooVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj2;
                PhotoViewer photoViewer = ((tr) obj3).f41717c.f43143a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.s61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj4;
                            if (u61Var.b()) {
                                document = u61Var.f30874g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.u61 u61Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.u61 u61Var3 = (org.telegram.ui.Components.u61) arrayList.get(i12);
                                if (u61Var3.f30877k < j11 && org.telegram.ui.Components.v61.D0(u61Var3.f30879m)) {
                                    j11 = u61Var3.f30877k;
                                    u61Var2 = u61Var3;
                                }
                            }
                            if (u61Var2 != null) {
                                document = u61Var2.f30874g;
                            } else {
                                document = ((org.telegram.ui.Components.u61) arrayList.get(0)).f30874g;
                            }
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.b8.G(photoViewer.T);
                    File K = org.telegram.messenger.b8.K(document, null, false, true);
                    if (K == null || !K.exists()) {
                        org.telegram.messenger.b8.G(photoViewer.T);
                        K = org.telegram.messenger.b8.K(document, null, true, true);
                    }
                    if (K != null && K.exists()) {
                        MediaController.d0(K.toString(), photoViewer.D, 1, null, null, new uo0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        kjVar2.f16650a3 = document;
                        arrayList2.add(kjVar2);
                        MediaController.g0(photoViewer.D, org.telegram.messenger.c.a(photoViewer.T), arrayList2, new ra(photoViewer, 3));
                    }
                    photoViewer.f33564o0.U(null, null);
                    return;
                }
                return;
            case 10:
                ns nsVar = (ns) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.s4.N((Context) obj2, org.telegram.messenger.dd.L0(2131746103, null), org.telegram.messenger.dd.a0(null, null, 2131746104, user.first_name), org.telegram.messenger.dd.L0(2131746135, null), new fs(nsVar, user, 1), nsVar.f39967r).p();
                return;
            case 11:
                of0 of0Var = (of0) obj3;
                ((org.telegram.ui.Components.z60) obj2).u();
                int i13 = ((org.telegram.messenger.bp) obj).f15000a;
                if (of0Var.f37789c.getCurrentPosition() == 0 && (zxVar = of0Var.J) != null) {
                    zxVar.I4(i13);
                    return;
                }
                if (of0Var.J == null) {
                    of0Var.r0(null);
                }
                of0Var.I = Integer.valueOf(i13);
                of0Var.s0(0, true);
                of0Var.f37789c.E(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj3;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2VarArr[0];
                if (z2Var2 != null) {
                    z2Var2.dismiss();
                    z2VarArr[0] = null;
                    r20Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((vh.d) obj3).Q && (z2Var = z2VarArr2[0]) != null) {
                    z2Var.dismiss();
                    z2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.d0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.u5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.k1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f33974a);
                m10.remove(((org.telegram.messenger.cw) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f33974a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public x(org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.messenger.r20 r20Var, String str) {
        this.f43187a = 12;
        this.f43188b = z2VarArr;
        this.d = r20Var;
        this.f43189c = str;
    }
}
