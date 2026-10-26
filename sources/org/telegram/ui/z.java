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
    public final int f46135a;
    public final Object f46136b;
    public final Object f46137c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i10) {
        this.f46135a = i10;
        this.f46136b = obj;
        this.f46137c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        cy cyVar;
        org.telegram.ui.ActionBar.k3 k3Var;
        int i10 = this.f46135a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f46137c;
        Object obj3 = this.f46136b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                j4Var.f40437h0.k(false);
                AndroidUtilities.hideKeyboard(j4Var.f40437h0.f45395b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.wc(m3Var.f41445f, null).k(false).k(true);
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
                c7Var.presentFragment(new un(bundle));
                h7Var.f39918f.F.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = h7Var.f39915a;
                if (o1Var != null) {
                    o1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pk0Var == null || pk0Var.f31591w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                un unVar = (un) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (unVar.getParentActivity() != null) {
                    if (unVar.f44181a1.getVisibility() != 0 || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        unVar.Y.Z(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((un) obj3).Ea((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                un.i0((un) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                un.Z0((un) obj3, (jk) obj2, (boolean[]) obj);
                return;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.r2 r2Var = fnVar.f39423a;
                r2Var.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.e));
                }
                r2Var.getMessagesController().addUserToChat(chat.f22027id, r2Var.getUserConfig().getCurrentUser(), 0, null, r2Var, new tm(fnVar, chat, 3));
                return;
            case 8:
                mo moVar = (mo) obj3;
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
                moVar.I0 = z12;
                runnable = e3Var.f22601a.dismissRunnable;
                runnable.run();
                moVar.q0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((or) obj3).f42274c.f39440a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.o81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.q81 q81Var = (org.telegram.ui.Components.q81) obj4;
                            if (q81Var.b()) {
                                document = q81Var.f31858g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.q81 q81Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.q81 q81Var3 = (org.telegram.ui.Components.q81) arrayList.get(i12);
                                if (q81Var3.f31861k < j11 && org.telegram.ui.Components.s81.Y(q81Var3.f31863m)) {
                                    j11 = q81Var3.f31861k;
                                    q81Var2 = q81Var3;
                                }
                            }
                            if (q81Var2 != null) {
                                document = q81Var2.f31858g;
                            } else {
                                document = ((org.telegram.ui.Components.q81) arrayList.get(0)).f31858g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f35825y, 1, null, null, new dr0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f35825y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, 3));
                    }
                    photoViewer.f35733o0.U(null, null);
                    return;
                }
                return;
            case 10:
                js jsVar = (js) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.g5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new bs(jsVar, user, 1), jsVar.f40737r).p();
                return;
            case 11:
                pg0 pg0Var = (pg0) obj3;
                ((org.telegram.ui.Components.k80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f19549id;
                if (pg0Var.f44135c.getCurrentPosition() == 0 && (cyVar = pg0Var.I) != null) {
                    cyVar.E4(i13);
                    return;
                }
                if (pg0Var.I == null) {
                    pg0Var.i0(null);
                }
                pg0Var.H = Integer.valueOf(i13);
                pg0Var.j0(0, true);
                pg0Var.f44135c.E(0);
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
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36143a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36143a, saveGalleryExceptions);
                saveToGallerySettingsActivity.b0();
                return;
        }
    }

    public z(org.telegram.ui.ActionBar.k3[] k3VarArr, Utilities.Callback callback, String str) {
        this.f46135a = 12;
        this.f46136b = k3VarArr;
        this.d = callback;
        this.f46137c = str;
    }
}
