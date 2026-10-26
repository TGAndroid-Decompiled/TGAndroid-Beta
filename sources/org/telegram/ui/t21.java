package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class t21 implements View.OnClickListener {
    public final int f43664a;
    public final Object f43665b;

    public t21(Object obj, int i10) {
        this.f43664a = i10;
        this.f43665b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.y1 y1Var;
        float f7;
        switch (this.f43664a) {
            case 0:
                r21 r21Var = (r21) ((bi.j5) this.f43665b).e;
                if (r21Var != null) {
                    r21Var.run();
                    return;
                }
                return;
            case 1:
                ((a31) this.f43665b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f43665b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36143a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f36145c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36143a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((m31) this.f43665b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43665b;
                MessageObject messageObject = secretMediaViewer.f36169h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.v3 v3Var = secretMediaViewer.f36188r;
                        if (v3Var.V) {
                            v3Var.e(true);
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
                m61 m61Var = (m61) this.f43665b;
                if (m61Var.f41473a0 instanceof TLRPC.User) {
                    fi.d dVar = m61Var.f41480h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        m61Var.T((TLRPC.User) m61Var.f41473a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((o71) this.f43665b).f42117f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    y9.f0(sessionsActivity.getParentActivity(), 2, new m71(sessionsActivity));
                    return;
                }
                return;
            case 7:
                ((id1) this.f43665b).c(true);
                return;
            case 8:
                ((id1) ((bi.e5) this.f43665b).f4553c).c(true);
                return;
            case 9:
                pd1 pd1Var = (pd1) this.f43665b;
                ArrayList arrayList = pd1Var.f42474f;
                HashSet hashSet = pd1Var.f42478w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = pd1Var.getMessagesController().getUser(Long.valueOf(pd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f22027id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        pd1Var.getMessagesController().putChat(chat, false);
                        pd1Var.getMessagesController().deleteParticipantFromChat(chat.f22027id, user);
                    }
                    pd1Var.finishFragment();
                    return;
                }
                return;
            default:
                ki1 ki1Var = (ki1) this.f43665b;
                ki1Var.f40952a.c(!y1Var.b(), true);
                ki1Var.f40954c.setEnabled(ki1Var.f40952a.b());
                ViewPropertyAnimator animate = ki1Var.f40954c.animate();
                if (ki1Var.f40952a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
