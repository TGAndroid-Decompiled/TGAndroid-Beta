package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class g1 implements org.telegram.ui.ActionBar.c2, ih.a {
    public final int f48427a;
    public final a3 f48428b;

    public g1(a3 a3Var, int i10) {
        this.f48427a = i10;
        this.f48428b = a3Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f48427a;
        a3 a3Var = this.f48428b;
        switch (i11) {
            case 0:
                t1 t1Var = a3Var.f48157b2;
                if (t1Var != null) {
                    t1Var.A();
                    return;
                }
                return;
            default:
                z2 z2Var = a3Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (z2Var.f49132f && (storyItem = z2Var.f49129a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t0 t0Var = t0.W;
                        if (t0Var != null && t0Var.f(inputGroupCall)) {
                            t0.W.e();
                            if (t0.W != null) {
                                t0.W = null;
                                NotificationCenter.getInstance(a3Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z2Var.f49129a;
                if (storyItem2 instanceof r4) {
                    s4 s4Var = ((r4) storyItem2).f48830a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    s4Var.getClass();
                    s4Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    a3 a3Var2 = z2Var.f49136k;
                    i5 i5Var = a3Var2.S1;
                    long j10 = a3Var2.B1;
                    a0.i iVar = i5Var.f48504i;
                    int i12 = i5Var.f48499a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) iVar.f(j10);
                                userFull = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(j10);
                                if (userFull2 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = userFull2.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j10);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    peerStories = chatFull4.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    peerStories = chatFull5;
                                    userFull = chatFull5;
                                }
                            }
                            if (peerStories != null) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f17435id == storyItem2.f17435id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!i5Var.K(j10)) {
                                                    iVar.l(j10);
                                                    i5Var.f48503g.remove(peerStories);
                                                    i5Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, z10);
                            }
                            i13++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                        tL_stories_deleteStories.f17438id.add(Integer.valueOf(storyItem2.f17435id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new j4(i5Var, 5));
                        v5 v5Var = i5Var.f48506k;
                        v5Var.f48990b.getStorageQueue().postRunnable(new u5(v5Var, j10, storyItem2.f17435id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        i5Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    h5 h5Var = z2Var.f49130b;
                    if (h5Var != null) {
                        h5Var.a();
                    }
                }
                a3Var.j1();
                if (a3Var.K1 && a3Var.A1 == 0) {
                    ((l7) a3Var.Q1).j();
                    return;
                }
                int i15 = a3Var.J1;
                int i16 = a3Var.A1;
                if (i15 >= i16) {
                    a3Var.J1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        a3Var.J1 = 0;
                    }
                }
                a3Var.f1(z11);
                u7 u7Var = a3Var.J0;
                if (u7Var != null) {
                    u7Var.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void i(int i10) {
        if (i10 == 0) {
            this.f48428b.P0();
        }
    }
}
