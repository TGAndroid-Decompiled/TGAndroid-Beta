package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

public final class v21 implements View.OnClickListener {

    public final int f43334a;

    public final Object f43335b;

    public v21(Object obj, int i10) {
        this.f43334a = i10;
        this.f43335b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43334a) {
            case 0:
                t21 t21Var = (t21) ((ag.w) this.f43335b).f687e;
                if (t21Var != null) {
                    t21Var.run();
                }
                break;
            case 1:
                ((c31) this.f43335b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f43335b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36110a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f36112c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36110a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((m31) this.f43335b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43335b;
                MessageObject messageObject = secretMediaViewer.f36128d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        lh.w3 w3Var = secretMediaViewer.f36157r;
                        if (w3Var.R) {
                            w3Var.e(true);
                        } else {
                            secretMediaViewer.l();
                        }
                    }
                }
                break;
            case 5:
                k61 k61Var = (k61) this.f43335b;
                if (k61Var.W instanceof TLRPC.User) {
                    lh.d dVar = k61Var.f39625d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        k61Var.T((TLRPC.User) k61Var.W, null, null);
                        break;
                    }
                }
                break;
            case 6:
                k71.a((k71) this.f43335b);
                break;
            case 7:
                ((dd1) this.f43335b).c(true);
                break;
            case 8:
                ((dd1) ((cg.u) this.f43335b).f2826c).c(true);
                break;
            case 9:
                ld1 ld1Var = (ld1) this.f43335b;
                ArrayList arrayList = ld1Var.f40059f;
                HashSet hashSet = ld1Var.f40063w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ld1Var.getMessagesController().getUser(Long.valueOf(ld1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f22380id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ld1Var.getMessagesController().putChat(chat, false);
                        ld1Var.getMessagesController().deleteParticipantFromChat(chat.f22380id, user);
                    }
                    ld1Var.finishFragment();
                    break;
                }
                break;
            default:
                ei1 ei1Var = (ei1) this.f43335b;
                org.telegram.ui.Cells.y1 y1Var = ei1Var.f37771a;
                y1Var.c(!y1Var.b(), true);
                ei1Var.f37773c.setEnabled(ei1Var.f37771a.b());
                ei1Var.f37773c.animate().alpha(ei1Var.f37771a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
