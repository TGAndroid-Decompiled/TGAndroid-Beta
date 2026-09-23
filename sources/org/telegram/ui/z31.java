package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class z31 implements View.OnClickListener {
    public final int f39955a;
    public final Object f39956b;

    public z31(Object obj, int i10) {
        this.f39955a = i10;
        this.f39956b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f39955a) {
            case 0:
                ((a41) this.f39956b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f39956b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31399a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31401c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31399a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((k41) this.f39956b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39956b;
                MessageObject messageObject = secretMediaViewer.f31425h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f31444r;
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
                j71 j71Var = (j71) this.f39956b;
                if (j71Var.f34347a0 instanceof TLRPC.User) {
                    ci.d dVar = j71Var.f34354h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        j71Var.T((TLRPC.User) j71Var.f34347a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                j81.a((j81) this.f39956b);
                return;
            case 6:
                ((de1) this.f39956b).c(true);
                return;
            case 7:
                ((de1) ((bw0) this.f39956b).f32192c).c(true);
                return;
            case 8:
                le1 le1Var = (le1) this.f39956b;
                ArrayList arrayList = le1Var.f34959f;
                HashSet hashSet = le1Var.f34963w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18083id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.f18083id, user);
                    }
                    le1Var.finishFragment();
                    return;
                }
                return;
            default:
                ej1 ej1Var = (ej1) this.f39956b;
                org.telegram.ui.Cells.z1 z1Var = ej1Var.f32959a;
                z1Var.c(!z1Var.b(), true);
                ej1Var.f32961c.setEnabled(ej1Var.f32959a.b());
                ViewPropertyAnimator animate = ej1Var.f32961c.animate();
                if (ej1Var.f32959a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
