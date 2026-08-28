package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class w21 implements View.OnClickListener {
    public final int f43640a;
    public final Object f43641b;

    public w21(Object obj, int i9) {
        this.f43640a = i9;
        this.f43641b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        switch (this.f43640a) {
            case 0:
                u21 u21Var = (u21) ((bh.g) this.f43641b).f2029e;
                if (u21Var != null) {
                    u21Var.run();
                    return;
                }
                return;
            case 1:
                ((d31) this.f43641b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f43641b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36107a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f36109c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36107a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((n31) this.f43641b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43641b;
                MessageObject messageObject = secretMediaViewer.f36125d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        kh.x3 x3Var = secretMediaViewer.f36154r;
                        if (x3Var.R) {
                            x3Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                l61 l61Var = (l61) this.f43641b;
                if (l61Var.W instanceof TLRPC.User) {
                    kh.d dVar = l61Var.f40067d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        l61Var.S((TLRPC.User) l61Var.W, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                l71.a((l71) this.f43641b);
                return;
            case 7:
                ((dd1) this.f43641b).c(true);
                return;
            case 8:
                ((dd1) ((bg.x) this.f43641b).f1991c).c(true);
                return;
            case 9:
                kd1 kd1Var = (kd1) this.f43641b;
                ArrayList arrayList = kd1Var.f39812f;
                HashSet hashSet = kd1Var.f39816w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = kd1Var.getMessagesController().getUser(Long.valueOf(kd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i9)).f22380id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i9));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        kd1Var.getMessagesController().putChat(chat, false);
                        kd1Var.getMessagesController().deleteParticipantFromChat(chat.f22380id, user);
                    }
                    kd1Var.finishFragment();
                    return;
                }
                return;
            default:
                fi1 fi1Var = (fi1) this.f43641b;
                org.telegram.ui.Cells.z1 z1Var = fi1Var.f38298a;
                z1Var.c(!z1Var.b(), true);
                fi1Var.f38300c.setEnabled(fi1Var.f38298a.b());
                ViewPropertyAnimator animate = fi1Var.f38300c.animate();
                if (fi1Var.f38298a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
