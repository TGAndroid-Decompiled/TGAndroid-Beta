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
    public final int f40897a;
    public final Object f40898b;

    public v41(Object obj, int i10) {
        this.f40897a = i10;
        this.f40898b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f40897a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40898b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32719a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f32721c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32719a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((b51) this.f40898b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40898b;
                MessageObject messageObject = secretMediaViewer.f32745h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.d4 d4Var = secretMediaViewer.f32764r;
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
                b81 b81Var = (b81) this.f40898b;
                if (b81Var.f34449a0 instanceof TLRPC.User) {
                    di.d dVar = b81Var.f34456h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        b81Var.U((TLRPC.User) b81Var.f34449a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((b91) this.f40898b).d;
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
                ((se1) this.f40898b).c(true);
                return;
            case 6:
                ((se1) ((ow0) this.f40898b).f39057c).c(true);
                return;
            case 7:
                af1 af1Var = (af1) this.f40898b;
                ArrayList arrayList = af1Var.f34202f;
                HashSet hashSet = af1Var.f34206w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = af1Var.getMessagesController().getUser(Long.valueOf(af1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19216id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        af1Var.getMessagesController().putChat(chat, false);
                        af1Var.getMessagesController().deleteParticipantFromChat(chat.f19216id, user);
                    }
                    af1Var.finishFragment();
                    return;
                }
                return;
            default:
                vj1 vj1Var = (vj1) this.f40898b;
                vj1Var.f41020a.c(!a2Var.b(), true);
                vj1Var.f41022c.setEnabled(vj1Var.f41020a.b());
                ViewPropertyAnimator animate = vj1Var.f41022c.animate();
                if (vj1Var.f41020a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
