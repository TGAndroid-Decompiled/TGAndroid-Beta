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
    public final int f38990a;
    public final Object f38991b;

    public v31(Object obj, int i10) {
        this.f38990a = i10;
        this.f38991b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        switch (this.f38990a) {
            case 0:
                ((w31) this.f38991b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f38991b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32190a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f32192c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32190a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((g41) this.f38991b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38991b;
                MessageObject messageObject = secretMediaViewer.f32209e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ph.f3 f3Var = secretMediaViewer.f32235r;
                        if (f3Var.S) {
                            f3Var.e(true);
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
                i71 i71Var = (i71) this.f38991b;
                if (i71Var.X instanceof TLRPC.User) {
                    ph.d dVar = i71Var.f34825e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        i71Var.T((TLRPC.User) i71Var.X, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                j81.a((j81) this.f38991b);
                return;
            case 6:
                ((yd1) this.f38991b).c(true);
                return;
            case 7:
                ((yd1) ((gg.u) this.f38991b).f6748c).c(true);
                return;
            case 8:
                ge1 ge1Var = (ge1) this.f38991b;
                ArrayList arrayList = ge1Var.f34430f;
                HashSet hashSet = ge1Var.f34434w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ge1Var.getMessagesController().getUser(Long.valueOf(ge1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19159id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ge1Var.getMessagesController().putChat(chat, false);
                        ge1Var.getMessagesController().deleteParticipantFromChat(chat.f19159id, user);
                    }
                    ge1Var.finishFragment();
                    return;
                }
                return;
            default:
                aj1 aj1Var = (aj1) this.f38991b;
                org.telegram.ui.Cells.y1 y1Var = aj1Var.f32601a;
                y1Var.c(!y1Var.b(), true);
                aj1Var.f32603c.setEnabled(aj1Var.f32601a.b());
                ViewPropertyAnimator animate = aj1Var.f32603c.animate();
                if (aj1Var.f32601a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
