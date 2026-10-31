package th;

import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w8;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class a5 implements RequestDelegate {
    public final int f48782a;
    public final d5 f48783b;

    public a5(d5 d5Var, int i10) {
        this.f48782a = i10;
        this.f48783b = d5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        kg.d0 d0Var;
        TLRPC.Updates updates;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.f48782a) {
            case 0:
                d5 d5Var = this.f48783b;
                long j10 = d5Var.J;
                String str = d5Var.f48879f;
                boolean z12 = d5Var.f48877b;
                vh.n5 n5Var = d5Var.f48878c;
                int i14 = d5Var.M.f48904a;
                if (tLObject instanceof TLRPC.Updates) {
                    d5Var.I = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (n5Var.f51518b0) {
                        vp.r1(i14).L3(updates3, false);
                        org.telegram.messenger.i0.g3(new b5(d5Var, 1));
                        return;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i15 < updates3.updates.size()) {
                        if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                            storyItem2.attachPath = d5Var.e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z12;
                            int i17 = storyItem2.f20031id;
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
                                int i18 = n5Var.I0;
                                if (i18 == Integer.MAX_VALUE) {
                                    i18 = 86400;
                                }
                                storyItem.expire_date = currentTime + i18;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = n5Var.F0;
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
                                                        i20 = c3.i0.k(i20, 1, tL_inputPrivacyValueDisallowUsers.users.get(i20).user_id, tL_privacyValueDisallowUsers.users);
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
                                                            i21 = c3.i0.k(i21, 1, tL_inputPrivacyValueAllowUsers.users.get(i21).user_id, tL_privacyValueAllowUsers.users);
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
                                        if (n5Var.I0 == Integer.MAX_VALUE) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        storyItem.pinned = z11;
                                        storyItem.dialogId = d20.i(i11).f15165n;
                                        storyItem.attachPath = d5Var.e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f20031id = tL_updateStoryID.f20051id;
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
                    if (d5Var.f48883w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = vp.r1(i22).i1(j10);
                        tL_stories_deleteStories.f20034id.add(Integer.valueOf(i16));
                        ConnectionsManager.getInstance(i22).sendRequest(tL_stories_deleteStories, new a5(d5Var, 1));
                    } else {
                        if ((i16 == 0 || z13) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = vp.r1(i22).y1(j10);
                            tL_updateStory.story = storyItem;
                            org.telegram.messenger.i0.g3(new o0(10, d5Var, tL_updateStory));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                b8.G(i22).f0(storyItem.attachPath, storyItem.media.document);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    b8.G(i22).f0(storyItem.attachPath, b8.w(photo.sizes, Integer.MAX_VALUE, false, null, false));
                                }
                            }
                        }
                        org.telegram.messenger.i0.g3(new a3.i0(d5Var, j10, storyItem, 29));
                        vp.r1(i22).K3(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    d5Var.L = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && w8.r(tL_error.text) && n5Var.f51521c0 != null && (d0Var = n5Var.f51523d0) != null) {
                    d0Var.a(new c5(d5Var, 0));
                    n5Var.f51523d0 = null;
                    return;
                } else if (tL_error != null && !z12) {
                    org.telegram.messenger.i0.g3(new o0(11, d5Var, tL_error));
                }
                org.telegram.messenger.i0.g3(new b5(d5Var, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new m4(this.f48783b.M, 2));
                return;
        }
    }
}
