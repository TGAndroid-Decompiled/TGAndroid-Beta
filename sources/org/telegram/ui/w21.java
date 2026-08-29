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
    public final int f43828a;
    public final Object f43829b;

    public w21(Object obj, int i10) {
        this.f43828a = i10;
        this.f43829b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f9;
        switch (this.f43828a) {
            case 0:
                u21 u21Var = (u21) ((bg.u1) this.f43829b).f2545e;
                if (u21Var != null) {
                    u21Var.run();
                    return;
                }
                return;
            case 1:
                ((d31) this.f43829b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f43829b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36172a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f36174c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36172a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((o31) this.f43829b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43829b;
                MessageObject messageObject = secretMediaViewer.f36190d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        nh.t3 t3Var = secretMediaViewer.f36219r;
                        if (t3Var.R) {
                            t3Var.e(true);
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
                n61 n61Var = (n61) this.f43829b;
                if (n61Var.W instanceof TLRPC.User) {
                    nh.d dVar = n61Var.f40729d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        n61Var.T((TLRPC.User) n61Var.W, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                o71.a((o71) this.f43829b);
                return;
            case 7:
                ((fd1) this.f43829b).c(true);
                return;
            case 8:
                ((fd1) ((eg.v) this.f43829b).f6146c).c(true);
                return;
            case 9:
                md1 md1Var = (md1) this.f43829b;
                ArrayList arrayList = md1Var.f40533f;
                HashSet hashSet = md1Var.f40537w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = md1Var.getMessagesController().getUser(Long.valueOf(md1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f22392id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        md1Var.getMessagesController().putChat(chat, false);
                        md1Var.getMessagesController().deleteParticipantFromChat(chat.f22392id, user);
                    }
                    md1Var.finishFragment();
                    return;
                }
                return;
            default:
                gi1 gi1Var = (gi1) this.f43829b;
                org.telegram.ui.Cells.y1 y1Var = gi1Var.f38597a;
                y1Var.c(!y1Var.b(), true);
                gi1Var.f38599c.setEnabled(gi1Var.f38597a.b());
                ViewPropertyAnimator animate = gi1Var.f38599c.animate();
                if (gi1Var.f38597a.b()) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.5f;
                }
                animate.alpha(f9).start();
                return;
        }
    }
}
