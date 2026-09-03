package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class v31 implements View.OnClickListener {
    public final int f42004a;
    public final Object f42005b;

    public v31(Object obj, int i10) {
        this.f42004a = i10;
        this.f42005b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        switch (this.f42004a) {
            case 0:
                ((w31) this.f42005b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f42005b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34752c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((g41) this.f42005b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42005b;
                MessageObject messageObject = secretMediaViewer.f34771e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        qh.e3 e3Var = secretMediaViewer.f34797r;
                        if (e3Var.S) {
                            e3Var.e(true);
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
                h71 h71Var = (h71) this.f42005b;
                if (h71Var.X instanceof TLRPC.User) {
                    qh.d dVar = h71Var.f37246e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        h71Var.T((TLRPC.User) h71Var.X, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                i81.a((i81) this.f42005b);
                return;
            case 6:
                ((zd1) this.f42005b).c(true);
                return;
            case 7:
                ((zd1) ((hg.u) this.f42005b).f7616c).c(true);
                return;
            case 8:
                he1 he1Var = (he1) this.f42005b;
                ArrayList arrayList = he1Var.f37358f;
                HashSet hashSet = he1Var.f37362w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = he1Var.getMessagesController().getUser(Long.valueOf(he1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20845id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        he1Var.getMessagesController().putChat(chat, false);
                        he1Var.getMessagesController().deleteParticipantFromChat(chat.f20845id, user);
                    }
                    he1Var.finishFragment();
                    return;
                }
                return;
            default:
                bj1 bj1Var = (bj1) this.f42005b;
                org.telegram.ui.Cells.z1 z1Var = bj1Var.f35557a;
                z1Var.c(!z1Var.b(), true);
                bj1Var.f35559c.setEnabled(bj1Var.f35557a.b());
                ViewPropertyAnimator animate = bj1Var.f35559c.animate();
                if (bj1Var.f35557a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
