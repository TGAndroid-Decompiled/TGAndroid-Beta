package th;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.at;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f1 implements org.telegram.ui.ActionBar.u1, bh.a {
    public final int f48962a;
    public final z2 f48963b;

    public f1(z2 z2Var, int i10) {
        this.f48962a = i10;
        this.f48963b = z2Var;
    }

    @Override
    public void d(int i10) {
        if (i10 == 0) {
            this.f48963b.N0();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f48962a;
        z2 z2Var = this.f48963b;
        switch (i11) {
            case 0:
                t1 t1Var = z2Var.K1;
                if (t1Var != null) {
                    t1Var.x();
                    return;
                }
                return;
            default:
                y2 y2Var = z2Var.f49790x1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (y2Var.f49678f && (storyItem = y2Var.f49675a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        s0 s0Var = s0.W;
                        if (s0Var != null && s0Var.f(inputGroupCall)) {
                            s0.W.e();
                            if (s0.W != null) {
                                s0.W = null;
                                at.f(z2Var.f49744l2).k(176, Long.valueOf(s0.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = y2Var.f49675a;
                if (storyItem2 instanceof p4) {
                    q4 q4Var = ((p4) storyItem2).f49382a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    q4Var.getClass();
                    q4Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    z2 z2Var2 = y2Var.f49682k;
                    e5 e5Var = z2Var2.B1;
                    long j11 = z2Var2.f49740k1;
                    a0.h hVar = e5Var.f48923i;
                    int i13 = e5Var.f48918a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull a2 = wp.r1(i13).a2(j11);
                                if (a2 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = a2;
                                    peerStories = a2.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = a2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull M0 = wp.r1(i13).M0(-j11);
                                if (M0 != null) {
                                    chatFull = M0;
                                    peerStories = M0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = M0;
                                    peerStories = chatFull4;
                                    userFull = chatFull4;
                                }
                            }
                            if (peerStories != null) {
                                int i15 = i12;
                                while (true) {
                                    if (i15 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i15).f20032id == storyItem2.f20032id) {
                                            peerStories.stories.remove(i15);
                                            if (peerStories.stories.size() == 0) {
                                                if (!e5Var.M(j11)) {
                                                    hVar.l(j11);
                                                    e5Var.f48922g.remove(peerStories);
                                                    e5Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User Z1 = wp.r1(i13).Z1(Long.valueOf(j11));
                                                    if (Z1 != null) {
                                                        Z1.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat L0 = wp.r1(i13).L0(Long.valueOf(-j11));
                                                    if (L0 != null) {
                                                        L0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                is.a0(i13).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                is.a0(i13).j2(userFull, z10);
                            }
                            i14++;
                            i12 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = wp.r1(i13).i1(j11);
                        tL_stories_deleteStories.f20035id.add(Integer.valueOf(storyItem2.f20032id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new i4(e5Var, 4));
                        r5 r5Var = e5Var.f48925k;
                        r5Var.f49426b.f16331a.c(new o5(r5Var, j11, storyItem2.f20032id, 1));
                        at.f(i13).k(324, new Object[0]);
                        wp.r1(i13).D();
                        e5Var.n0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    d5 d5Var = y2Var.f49676b;
                    if (d5Var != null) {
                        d5Var.a();
                    }
                }
                z2Var.h1();
                if (z2Var.f49774t1 && z2Var.f49736j1 == 0) {
                    ((f7) z2Var.f49797z1).j();
                    return;
                }
                int i16 = z2Var.f49770s1;
                int i17 = z2Var.f49736j1;
                if (i16 >= i17) {
                    z2Var.f49770s1 = i17 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i16 < 0) {
                        z2Var.f49770s1 = 0;
                    }
                }
                z2Var.d1(z11);
                o7 o7Var = z2Var.f49769s0;
                if (o7Var != null) {
                    o7Var.C();
                    return;
                }
                return;
        }
    }
}
