package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class v41 implements View.OnClickListener {
    public final int f40584a;
    public final Object f40585b;

    public v41(Object obj, int i10) {
        this.f40584a = i10;
        this.f40585b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f40584a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40585b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32421a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f32423c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32421a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((b51) this.f40585b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40585b;
                MessageObject messageObject = secretMediaViewer.f32447h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.d4 d4Var = secretMediaViewer.f32466r;
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
                b81 b81Var = (b81) this.f40585b;
                if (b81Var.f34233a0 instanceof TLRPC.User) {
                    di.d dVar = b81Var.f34240h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        b81Var.U((TLRPC.User) b81Var.f34233a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((b91) this.f40585b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    z9.e0(sessionsActivity.getParentActivity(), false, 2, new z81(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((re1) this.f40585b).c(true);
                return;
            case 6:
                ((re1) ((nw0) this.f40585b).f38485c).c(true);
                return;
            case 7:
                ze1 ze1Var = (ze1) this.f40585b;
                ArrayList arrayList = ze1Var.f42295f;
                HashSet hashSet = ze1Var.f42299w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ze1Var.getMessagesController().getUser(Long.valueOf(ze1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18916id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ze1Var.getMessagesController().putChat(chat, false);
                        ze1Var.getMessagesController().deleteParticipantFromChat(chat.f18916id, user);
                    }
                    ze1Var.finishFragment();
                    return;
                }
                return;
            default:
                uj1 uj1Var = (uj1) this.f40585b;
                uj1Var.f40419a.c(!a2Var.b(), true);
                uj1Var.f40421c.setEnabled(uj1Var.f40419a.b());
                ViewPropertyAnimator animate = uj1Var.f40421c.animate();
                if (uj1Var.f40419a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
