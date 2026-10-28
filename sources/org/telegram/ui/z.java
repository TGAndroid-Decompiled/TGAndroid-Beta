package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z implements View.OnClickListener {
    public final int f46115a;
    public final Object f46116b;
    public final Object f46117c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i10) {
        this.f46115a = i10;
        this.f46116b = obj;
        this.f46117c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        ey eyVar;
        org.telegram.ui.ActionBar.k3 k3Var;
        int i10 = this.f46115a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f46117c;
        Object obj3 = this.f46116b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                j4Var.f40402h0.k(false);
                AndroidUtilities.hideKeyboard(j4Var.f40402h0.f44906b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.wc(m3Var.f41314f, null).k(false).k(true);
                return;
            case 1:
                h7 h7Var = (h7) obj3;
                c7 c7Var = (c7) obj;
                Bundle bundle = new Bundle();
                ci.a aVar = ((q7) obj2).d;
                long j10 = aVar.f6365b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f6368g);
                c7Var.presentFragment(new wn(bundle));
                h7Var.f39802f.F.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = h7Var.f39799a;
                if (o1Var != null) {
                    o1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (qk0Var == null || qk0Var.f31927w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                wn wnVar = (wn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (wnVar.getParentActivity() != null) {
                    if (wnVar.f45046a1.getVisibility() != 0 || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        wnVar.Y.Y(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((wn) obj3).Ha((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                wn.i0((wn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                wn.c1((wn) obj3, (lk) obj2, (boolean[]) obj);
                return;
            case 7:
                hn hnVar = (hn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.r2 r2Var = hnVar.f39938a;
                r2Var.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.e));
                }
                r2Var.getMessagesController().addUserToChat(chat.f22028id, r2Var.getUserConfig().getCurrentUser(), 0, null, r2Var, new vm(hnVar, chat, 3));
                return;
            case 8:
                oo ooVar = (oo) obj3;
                org.telegram.ui.Cells.n6[] n6VarArr = (org.telegram.ui.Cells.n6[]) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.n6 n6Var = n6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n6Var.a(z10);
                org.telegram.ui.Cells.n6 n6Var2 = n6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                ooVar.I0 = z12;
                runnable = e3Var.f22602a.dismissRunnable;
                runnable.run();
                ooVar.q0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((qr) obj3).f42775c.f39955a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.p81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.r81 r81Var = (org.telegram.ui.Components.r81) obj4;
                            if (r81Var.b()) {
                                document = r81Var.f32176g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r81 r81Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.r81 r81Var3 = (org.telegram.ui.Components.r81) arrayList.get(i12);
                                if (r81Var3.f32179k < j11 && org.telegram.ui.Components.t81.Y(r81Var3.f32181m)) {
                                    j11 = r81Var3.f32179k;
                                    r81Var2 = r81Var3;
                                }
                            }
                            if (r81Var2 != null) {
                                document = r81Var2.f32176g;
                            } else {
                                document = ((org.telegram.ui.Components.r81) arrayList.get(0)).f32176g;
                            }
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f35849y, 1, null, null, new fr0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f35849y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, 3));
                    }
                    photoViewer.f35757o0.U(null, null);
                    return;
                }
                return;
            case 10:
                ls lsVar = (ls) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.g5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ds(lsVar, user, 1), lsVar.f41252r).p();
                return;
            case 11:
                rg0 rg0Var = (rg0) obj3;
                ((org.telegram.ui.Components.l80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f19548id;
                if (rg0Var.f45001c.getCurrentPosition() == 0 && (eyVar = rg0Var.I) != null) {
                    eyVar.E4(i13);
                    return;
                }
                if (rg0Var.I == null) {
                    rg0Var.i0(null);
                }
                rg0Var.H = Integer.valueOf(i13);
                rg0Var.j0(0, true);
                rg0Var.f45001c.E(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.k3 k3Var2 = k3VarArr[0];
                if (k3Var2 != null) {
                    k3Var2.dismiss();
                    k3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.k3[] k3VarArr2 = (org.telegram.ui.ActionBar.k3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((fi.d) obj3).Q && (k3Var = k3VarArr2[0]) != null) {
                    k3Var.dismiss();
                    k3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.n0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.b6) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36167a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36167a, saveGalleryExceptions);
                saveToGallerySettingsActivity.b0();
                return;
        }
    }

    public z(org.telegram.ui.ActionBar.k3[] k3VarArr, Utilities.Callback callback, String str) {
        this.f46115a = 12;
        this.f46116b = k3VarArr;
        this.d = callback;
        this.f46117c = str;
    }
}
