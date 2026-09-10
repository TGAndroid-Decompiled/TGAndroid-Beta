package zh;

import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class d5 implements RequestDelegate {
    public final int f48348a;
    public final h5 f48349b;

    public d5(h5 h5Var, int i10) {
        this.f48348a = i10;
        this.f48349b = h5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.ui.Components.h7 h7Var;
        TLRPC.Updates updates;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.f48348a) {
            case 0:
                h5 h5Var = this.f48349b;
                long j3 = h5Var.J;
                String str = h5Var.f48474f;
                boolean z12 = h5Var.f48472b;
                r9 r9Var = h5Var.f48473c;
                int i14 = h5Var.M.f48499a;
                if (tLObject instanceof TLRPC.Updates) {
                    h5Var.I = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (r9Var.f3563b0) {
                        MessagesController.getInstance(i14).processUpdates(updates3, false);
                        AndroidUtilities.runOnUIThread(new e5(h5Var, 1));
                        return;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i15 < updates3.updates.size()) {
                        if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                            storyItem2.attachPath = h5Var.e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z12;
                            int i17 = storyItem2.f17435id;
                            if (storyItem == null) {
                                storyItem = storyItem2;
                            } else {
                                storyItem.media = storyItem2.media;
                            }
                            i16 = i17;
                        }
                        if (updates3.updates.get(i15) instanceof TL_update.TL_updateStoryID) {
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i15);
                            if (storyItem == null) {
                                storyItem = new TL_stories.TL_storyItem();
                                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                                storyItem.date = currentTime;
                                int i18 = r9Var.I0;
                                if (i18 == Integer.MAX_VALUE) {
                                    i18 = 86400;
                                }
                                storyItem.expire_date = currentTime + i18;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = r9Var.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i19 = 0;
                                while (true) {
                                    z10 = z12;
                                    if (i19 < arrayList2.size()) {
                                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i19);
                                        if (inputPrivacyRule != null) {
                                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                                            } else {
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                    arrayList = arrayList2;
                                                    i12 = i15;
                                                    int i20 = 0;
                                                    for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; i20 < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                        i20 = com.google.android.gms.internal.vision.e2.f(tL_inputPrivacyValueDisallowUsers.users.get(i20).user_id, tL_privacyValueDisallowUsers.users, i20, 1);
                                                        i14 = i14;
                                                        updates3 = updates3;
                                                    }
                                                    updates2 = updates3;
                                                    i13 = i14;
                                                    arrayList3.add(tL_privacyValueDisallowUsers);
                                                } else {
                                                    updates2 = updates3;
                                                    arrayList = arrayList2;
                                                    i12 = i15;
                                                    i13 = i14;
                                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                        int i21 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i21 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                            i21 = com.google.android.gms.internal.vision.e2.f(tL_inputPrivacyValueAllowUsers.users.get(i21).user_id, tL_privacyValueAllowUsers.users, i21, 1);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i19++;
                                                z12 = z10;
                                                arrayList2 = arrayList;
                                                i15 = i12;
                                                i14 = i13;
                                                updates3 = updates2;
                                            }
                                        }
                                        updates2 = updates3;
                                        arrayList = arrayList2;
                                        i12 = i15;
                                        i13 = i14;
                                        i19++;
                                        z12 = z10;
                                        arrayList2 = arrayList;
                                        i15 = i12;
                                        i14 = i13;
                                        updates3 = updates2;
                                    } else {
                                        updates = updates3;
                                        i10 = i15;
                                        i11 = i14;
                                        storyItem.privacy = arrayList3;
                                        if (r9Var.I0 == Integer.MAX_VALUE) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        storyItem.pinned = z11;
                                        storyItem.dialogId = UserConfig.getInstance(i11).clientUserId;
                                        storyItem.attachPath = h5Var.e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f17435id = tL_updateStoryID.f17454id;
                                        storyItem.justUploaded = !z10;
                                        i15 = i10 + 1;
                                        z12 = z10;
                                        i14 = i11;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z10 = z12;
                        i10 = i15;
                        i11 = i14;
                        i15 = i10 + 1;
                        z12 = z10;
                        i14 = i11;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z13 = z12;
                    int i22 = i14;
                    if (h5Var.v) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i22).getInputPeer(j3);
                        tL_stories_deleteStories.peer = inputPeer;
                        if (inputPeer != null) {
                            tL_stories_deleteStories.f17438id.add(Integer.valueOf(i16));
                            ConnectionsManager.getInstance(i22).sendRequest(tL_stories_deleteStories, new d5(h5Var, 1));
                        }
                    } else {
                        if ((i16 == 0 || z13) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = MessagesController.getInstance(i22).getPeer(j3);
                            tL_updateStory.story = storyItem;
                            AndroidUtilities.runOnUIThread(new yg.q(18, h5Var, tL_updateStory));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                FileLoader.getInstance(i22).setLocalPathTo(storyItem.media.document, storyItem.attachPath);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    FileLoader.getInstance(i22).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE), storyItem.attachPath);
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new f5(h5Var, j3, storyItem, 0));
                        MessagesController.getInstance(i22).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    h5Var.L = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && r9Var.f3566c0 != null && (h7Var = r9Var.f3568d0) != null) {
                    h7Var.run(new g5(h5Var, 0));
                    r9Var.f3568d0 = null;
                    return;
                } else if (tL_error != null && !z12) {
                    AndroidUtilities.runOnUIThread(new yg.q(19, h5Var, tL_error));
                }
                AndroidUtilities.runOnUIThread(new e5(h5Var, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n4(this.f48349b.M, 2));
                return;
        }
    }
}
