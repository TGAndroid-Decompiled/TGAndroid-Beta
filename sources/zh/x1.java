package zh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
public final class x1 implements wi {
    public final a3 f49035a;

    public x1(a3 a3Var) {
        this.f49035a = a3Var;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        String str;
        String str2;
        a3 a3Var = this.f49035a;
        if (a3Var.J0.m0 && (storyItem = a3Var.O1.f49129a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || a3Var.I2.f29378j0.getSelectedPhotos().isEmpty())) {
                gg.m mVar = a3Var.I2;
                if (mVar != null) {
                    mVar.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            if (i10 != 8) {
                a3Var.I2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = a3Var.I2.f29378j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = a3Var.I2.f29378j0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 0; i16 < min; i16++) {
                        int i17 = i15 + i16;
                        if (i17 < selectedPhotosOrder.size()) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            boolean z17 = photoEntry.isVideo;
                            if (!z17 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                String str3 = photoEntry.path;
                                if (str3 != null) {
                                    sendingMediaInfo.path = str3;
                                }
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.isVideo = z17;
                            CharSequence charSequence = photoEntry.caption;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            sendingMediaInfo.caption = str;
                            sendingMediaInfo.entities = photoEntry.entities;
                            sendingMediaInfo.masks = photoEntry.stickers;
                            sendingMediaInfo.ttl = photoEntry.ttl;
                            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                            sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                            sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                            arrayList.add(sendingMediaInfo);
                            photoEntry.reset();
                        }
                    }
                    if (i14 == 0) {
                        z15 = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder;
                    } else {
                        z15 = false;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = a3Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j11 = a3Var.B1;
                    if (i10 != 4 && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, null, null, storyItem, null, z16, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, a3Var.f48157b2.getSendMonoForumPeerId(), a3Var.f48157b2.getSendMessageSuggestionParams());
                    i14++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = 0;
                }
                a3Var.f48157b2.setFieldText("");
                if (j10 <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                a3Var.k0(z14);
            }
        }
    }

    @Override
    public final void K0() {
        this.f49035a.f48157b2.P();
    }

    @Override
    public final boolean R1() {
        return false;
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        a3 a3Var = this.f49035a;
        TL_stories.StoryItem storyItem = a3Var.O1.f49129a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = a3Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, a3Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            a3Var.k0(z12);
        }
    }

    @Override
    public final boolean e0() {
        return this.f49035a.N0();
    }

    @Override
    public final void y0(jh jhVar) {
        NotificationCenter.getInstance(this.f49035a.C2).doOnIdle(jhVar);
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }
}
