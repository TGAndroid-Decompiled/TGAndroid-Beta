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
    public final int f43247a;
    public final Object f43248b;
    public final Object f43249c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i10) {
        this.f43247a = i10;
        this.f43248b = obj;
        this.f43249c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        uy uyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f43247a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f43249c;
        Object obj3 = this.f43248b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.f37220h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.f37220h0.f42277b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.yc(m3Var.f38554f, null).k(false).k(true);
                return;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                ai.b bVar = ((m7) obj2).d;
                long j3 = bVar.f739b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.f743g);
                n2Var.presentFragment(new co(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.f35953a;
                if (n1Var != null) {
                    n1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pj0Var == null || pj0Var.f29405w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                co coVar = (co) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (coVar.getParentActivity() != null) {
                    if (coVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        coVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((co) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                co.j1((co) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                co.F0((co) obj3, (pk) obj2, (boolean[]) obj);
                return;
            case 7:
                on onVar = (on) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = onVar.f39283a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.f22383e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f19869id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new cn(onVar, chat, 3));
                return;
            case 8:
                xo xoVar = (xo) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var.a(z10);
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                xoVar.J0 = z12;
                runnable = a3Var.f20204a.dismissRunnable;
                runnable.run();
                xoVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((xr) obj3).f42879c.f39975a;
                Drawable[] drawableArr = PhotoViewer.T8;
                ArrayList arrayList = ((org.telegram.ui.Components.c71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.e71 e71Var = (org.telegram.ui.Components.e71) obj4;
                            if (e71Var.b()) {
                                document = e71Var.f25584g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.e71 e71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.e71 e71Var3 = (org.telegram.ui.Components.e71) arrayList.get(i12);
                                if (e71Var3.f25587k < j10 && org.telegram.ui.Components.g71.Y(e71Var3.f25589m)) {
                                    j10 = e71Var3.f25587k;
                                    e71Var2 = e71Var3;
                                }
                            }
                            if (e71Var2 != null) {
                                document = e71Var2.f25584g;
                            } else {
                                document = ((org.telegram.ui.Components.e71) arrayList.get(0)).f25584g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f33727y, 1, null, null, new or0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f33727y, AccountInstance.getInstance(photoViewer.T), arrayList2, new va(photoViewer, 3));
                    }
                    photoViewer.f33635o0.M(null, null);
                    return;
                }
                return;
            case 10:
                ss ssVar = (ss) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new js(ssVar, user, 1), ssVar.f40516r).o();
                return;
            case 11:
                eh0 eh0Var = (eh0) obj3;
                ((org.telegram.ui.Components.n70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f17080id;
                if (eh0Var.f34816c.getCurrentPosition() == 0 && (uyVar = eh0Var.J) != null) {
                    uyVar.w4(i13);
                    return;
                }
                if (eh0Var.J == null) {
                    eh0Var.l0(null);
                }
                eh0Var.I = Integer.valueOf(i13);
                eh0Var.m0(0, true);
                eh0Var.f34816c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((di.d) obj3).N && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34048a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34048a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public z(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f43247a = 12;
        this.f43248b = f3VarArr;
        this.d = callback;
        this.f43249c = str;
    }
}
