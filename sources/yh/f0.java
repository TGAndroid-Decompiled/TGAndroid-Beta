package yh;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.ml;
import org.telegram.messenger.o5;
import org.telegram.messenger.st;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.cc;
import v7.u7;
public abstract class f0 {
    public static SpannableStringBuilder a(jj jjVar, String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.Message message = jjVar.f16337k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (o5.o(message.peer_id) == o5.o(message.from_id)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            if (z13) {
                if (z11) {
                    i15 = 2131751868;
                } else if (z10) {
                    i15 = 2131751862;
                } else {
                    i15 = 2131751856;
                }
                return i0.W2(cd.L0(i15, null));
            }
            if (z11) {
                i14 = 2131751870;
            } else if (z10) {
                i14 = 2131751864;
            } else {
                i14 = 2131751858;
            }
            return i0.W2(cd.a0(null, null, i14, str));
        } else if (jjVar.N3()) {
            if (z13) {
                if (z11) {
                    i13 = 2131751866;
                } else if (z10) {
                    i13 = 2131751860;
                } else {
                    i13 = 2131751854;
                }
                return i0.W2(cd.L0(i13, null));
            }
            if (z11) {
                i12 = 2131751867;
            } else if (z10) {
                i12 = 2131751861;
            } else {
                i12 = 2131751855;
            }
            return i0.W2(cd.a0(null, null, i12, str));
        } else if (z13) {
            if (z11) {
                i11 = 2131751869;
            } else if (z10) {
                i11 = 2131751863;
            } else {
                i11 = 2131751857;
            }
            return i0.W2(cd.a0(null, null, i11, str2));
        } else {
            if (z11) {
                i10 = 2131751871;
            } else if (z10) {
                i10 = 2131751865;
            } else {
                i10 = 2131751859;
            }
            return i0.W2(cd.a0(null, null, i10, str2, str));
        }
    }

    public static int b(int i10, long j10) {
        TLRPC.Chat L0;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull M0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j10 > 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 == null) {
                return 0;
            }
            j11 = Z1.linked_community_id;
            user = Z1;
            L0 = null;
        } else {
            L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 == null) {
                return 0;
            }
            j11 = L0.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (M0 = vp.r1(i10).M0(j11)) != null && (arrayList = M0.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (o5.o(communityPeer2.peer) == j10) {
                    if (user != null) {
                        dialog = vp.r1(i10).R0(user.f19942id);
                    }
                    return c(L0, dialog, user, communityPeer2);
                }
            }
        }
        return 0;
    }

    public static int c(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        if (user != null) {
            if (dialog == null) {
                return 2;
            }
        } else if (chat != null) {
            if (!w3.j0(chat)) {
                if (!w3.t0(chat) && !communityPeer.can_view_history) {
                    if (u7.a(communityPeer.flags, 1) && !communityPeer.visible) {
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
        } else {
            return 0;
        }
        return 1;
    }

    public static void d(org.telegram.ui.ActionBar.k2 r8, long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.f0.d(org.telegram.ui.ActionBar.k2, long, int):void");
    }

    public static void e(x1[] x1VarArr, k2 k2Var, int i10, TLRPC.Chat chat) {
        if (x1VarArr[0] != null) {
            return;
        }
        vp r12 = vp.r1(i10);
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(x1VarArr, k2Var, i10, chat, 9);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = r12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new a3.b(1), new ml(r12, f0Var, 0));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequestTyped, k2Var.getClassGuid());
        x1 x1Var = new x1(3, k2Var.getContext(), null);
        x1VarArr[0] = x1Var;
        x1Var.r(500L);
        x1VarArr[0].setOnCancelListener(new st(i10, sendRequestTyped, x1VarArr, 1));
    }

    public static void f(cc ccVar, int i10, boolean z10) {
        int i11;
        int i12;
        String L0;
        int i13;
        if (i10 == 2) {
            i11 = 2131624290;
        } else {
            i11 = 2131623989;
        }
        if (i10 == 2) {
            i12 = 24;
        } else {
            i12 = 36;
        }
        if (i10 == 0) {
            L0 = cd.L0(2131751943, null);
        } else if (i10 == 1) {
            if (z10) {
                i13 = 2131751942;
            } else {
                i13 = 2131751941;
            }
            L0 = cd.L0(i13, null);
        } else {
            L0 = cd.L0(2131751940, null);
        }
        ccVar.G(i11, i12, L0).j();
    }
}
