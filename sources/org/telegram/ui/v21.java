package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class v21 implements View.OnClickListener {
    public final int f44164a;
    public final Object f44165b;

    public v21(Object obj, int i10) {
        this.f44164a = i10;
        this.f44165b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.y1 y1Var;
        float f7;
        switch (this.f44164a) {
            case 0:
                t21 t21Var = (t21) ((bi.j5) this.f44165b).e;
                if (t21Var != null) {
                    t21Var.run();
                    return;
                }
                return;
            case 1:
                ((c31) this.f44165b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f44165b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36167a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f36169c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36167a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((o31) this.f44165b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44165b;
                MessageObject messageObject = secretMediaViewer.f36193h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.v3 v3Var = secretMediaViewer.f36212r;
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
                p61 p61Var = (p61) this.f44165b;
                if (p61Var.f42316a0 instanceof TLRPC.User) {
                    fi.d dVar = p61Var.f42323h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        p61Var.T((TLRPC.User) p61Var.f42316a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((q71) this.f44165b).f42630f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    y9.f0(sessionsActivity.getParentActivity(), 2, new o71(sessionsActivity));
                    return;
                }
                return;
            case 7:
                ((kd1) this.f44165b).c(true);
                return;
            case 8:
                ((kd1) ((bi.e5) this.f44165b).f4553c).c(true);
                return;
            case 9:
                rd1 rd1Var = (rd1) this.f44165b;
                ArrayList arrayList = rd1Var.f42967f;
                HashSet hashSet = rd1Var.f42971w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = rd1Var.getMessagesController().getUser(Long.valueOf(rd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f22028id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        rd1Var.getMessagesController().putChat(chat, false);
                        rd1Var.getMessagesController().deleteParticipantFromChat(chat.f22028id, user);
                    }
                    rd1Var.finishFragment();
                    return;
                }
                return;
            default:
                mi1 mi1Var = (mi1) this.f44165b;
                mi1Var.f41451a.c(!y1Var.b(), true);
                mi1Var.f41453c.setEnabled(mi1Var.f41451a.b());
                ViewPropertyAnimator animate = mi1Var.f41453c.animate();
                if (mi1Var.f41451a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
