package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class y31 implements View.OnClickListener {
    public final int f43105a;
    public final Object f43106b;

    public y31(Object obj, int i10) {
        this.f43105a = i10;
        this.f43106b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f43105a) {
            case 0:
                ((z31) this.f43106b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f43106b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34413a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34415c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34413a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((m41) this.f43106b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43106b;
                MessageObject messageObject = secretMediaViewer.f34441h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f34460r;
                        if (e4Var.V) {
                            e4Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                k71 k71Var = (k71) this.f43106b;
                if (k71Var.f37871a0 instanceof TLRPC.User) {
                    ci.d dVar = k71Var.f37878h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        k71Var.R((TLRPC.User) k71Var.f37871a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                k81.a((k81) this.f43106b);
                return;
            case 6:
                ((ee1) this.f43106b).c(true);
                return;
            case 7:
                ((ee1) ((cw0) this.f43106b).f35562c).c(true);
                return;
            case 8:
                le1 le1Var = (le1) this.f43106b;
                ArrayList arrayList = le1Var.f38301f;
                HashSet hashSet = le1Var.f38305w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20047id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.f20047id, user);
                    }
                    le1Var.finishFragment();
                    return;
                }
                return;
            default:
                cj1 cj1Var = (cj1) this.f43106b;
                org.telegram.ui.Cells.a2 a2Var = cj1Var.f35489a;
                a2Var.c(!a2Var.b(), true);
                cj1Var.f35491c.setEnabled(cj1Var.f35489a.b());
                ViewPropertyAnimator animate = cj1Var.f35491c.animate();
                if (cj1Var.f35489a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
