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
    public final int f40034a;
    public final Object f40035b;

    public y31(Object obj, int i10) {
        this.f40034a = i10;
        this.f40035b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f40034a) {
            case 0:
                ((z31) this.f40035b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40035b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31700a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31702c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31700a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((l41) this.f40035b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40035b;
                MessageObject messageObject = secretMediaViewer.f31726h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f31745r;
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
                k71 k71Var = (k71) this.f40035b;
                if (k71Var.f34947a0 instanceof TLRPC.User) {
                    ci.d dVar = k71Var.f34954h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        k71Var.T((TLRPC.User) k71Var.f34947a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                l81.a((l81) this.f40035b);
                return;
            case 6:
                ((de1) this.f40035b).c(true);
                return;
            case 7:
                ((de1) ((zv0) this.f40035b).f40573c).c(true);
                return;
            case 8:
                le1 le1Var = (le1) this.f40035b;
                ArrayList arrayList = le1Var.f35310f;
                HashSet hashSet = le1Var.f35314w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18321id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.f18321id, user);
                    }
                    le1Var.finishFragment();
                    return;
                }
                return;
            default:
                ej1 ej1Var = (ej1) this.f40035b;
                org.telegram.ui.Cells.a2 a2Var = ej1Var.f33416a;
                a2Var.c(!a2Var.b(), true);
                ej1Var.f33418c.setEnabled(ej1Var.f33416a.b());
                ViewPropertyAnimator animate = ej1Var.f33418c.animate();
                if (ej1Var.f33416a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
