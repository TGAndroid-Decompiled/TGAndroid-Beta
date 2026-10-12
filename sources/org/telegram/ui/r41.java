package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class r41 implements View.OnClickListener {
    public final int f41503a;
    public final Object f41504b;

    public r41(Object obj, int i10) {
        this.f41503a = i10;
        this.f41504b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f41503a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f41504b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34240a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34242c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34240a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((w41) this.f41504b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f41504b;
                MessageObject messageObject = secretMediaViewer.f34268h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.d4 d4Var = secretMediaViewer.f34287r;
                        if (d4Var.V) {
                            d4Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                x71 x71Var = (x71) this.f41504b;
                if (x71Var.f43788a0 instanceof TLRPC.User) {
                    ci.d dVar = x71Var.f43795h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        x71Var.U((TLRPC.User) x71Var.f43788a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((x81) this.f41504b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    y9.e0(sessionsActivity.getParentActivity(), false, 2, new v81(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((oe1) this.f41504b).c(true);
                return;
            case 6:
                ((oe1) ((kw0) this.f41504b).f39595c).c(true);
                return;
            case 7:
                we1 we1Var = (we1) this.f41504b;
                ArrayList arrayList = we1Var.f43149f;
                HashSet hashSet = we1Var.f43153w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = we1Var.getMessagesController().getUser(Long.valueOf(we1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19802id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        we1Var.getMessagesController().putChat(chat, false);
                        we1Var.getMessagesController().deleteParticipantFromChat(chat.f19802id, user);
                    }
                    we1Var.finishFragment();
                    return;
                }
                return;
            default:
                pj1 pj1Var = (pj1) this.f41504b;
                pj1Var.f40978a.c(!a2Var.b(), true);
                pj1Var.f40980c.setEnabled(pj1Var.f40978a.b());
                ViewPropertyAnimator animate = pj1Var.f40980c.animate();
                if (pj1Var.f40978a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
