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
    public final int f40155a;
    public final Object f40156b;

    public y31(Object obj, int i10) {
        this.f40155a = i10;
        this.f40156b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f40155a) {
            case 0:
                ((z31) this.f40156b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40156b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31788a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31790c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31788a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((l41) this.f40156b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40156b;
                MessageObject messageObject = secretMediaViewer.f31814h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f31833r;
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
                k71 k71Var = (k71) this.f40156b;
                if (k71Var.f35050a0 instanceof TLRPC.User) {
                    ci.d dVar = k71Var.f35057h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        k71Var.T((TLRPC.User) k71Var.f35050a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                l81.a((l81) this.f40156b);
                return;
            case 6:
                ((de1) this.f40156b).c(true);
                return;
            case 7:
                ((de1) ((zv0) this.f40156b).f40686c).c(true);
                return;
            case 8:
                le1 le1Var = (le1) this.f40156b;
                ArrayList arrayList = le1Var.f35433f;
                HashSet hashSet = le1Var.f35437w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18352id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.f18352id, user);
                    }
                    le1Var.finishFragment();
                    return;
                }
                return;
            default:
                ej1 ej1Var = (ej1) this.f40156b;
                org.telegram.ui.Cells.a2 a2Var = ej1Var.f33514a;
                a2Var.c(!a2Var.b(), true);
                ej1Var.f33516c.setEnabled(ej1Var.f33514a.b());
                ViewPropertyAnimator animate = ej1Var.f33516c.animate();
                if (ej1Var.f33514a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
