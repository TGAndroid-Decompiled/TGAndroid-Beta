package th;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.py;
import org.telegram.ui.rh;
import org.telegram.ui.xn;
public abstract class o0 {
    public static SpannableStringBuilder a(MessageObject messageObject, String str, String str2, boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (z12) {
                if (z10) {
                    i15 = R.string.CommunityServiceMessageBotRemovedUnknown;
                } else if (z4) {
                    i15 = R.string.CommunityServiceMessageChannelRemovedUnknown;
                } else {
                    i15 = R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i15));
            }
            if (z10) {
                i14 = R.string.CommunityServiceMessageBotAddedUnknown;
            } else if (z4) {
                i14 = R.string.CommunityServiceMessageChannelAddedUnknown;
            } else {
                i14 = R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i14, str));
        } else if (messageObject.isOut()) {
            if (z12) {
                if (z10) {
                    i13 = R.string.CommunityServiceMessageBotYouRemoved;
                } else if (z4) {
                    i13 = R.string.CommunityServiceMessageChannelYouRemoved;
                } else {
                    i13 = R.string.CommunityServiceMessageGroupYouRemoved;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i13));
            }
            if (z10) {
                i12 = R.string.CommunityServiceMessageBotYouAdded;
            } else if (z4) {
                i12 = R.string.CommunityServiceMessageChannelYouAdded;
            } else {
                i12 = R.string.CommunityServiceMessageGroupYouAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i12, str));
        } else if (z12) {
            if (z10) {
                i11 = R.string.CommunityServiceMessageBotRemoved;
            } else if (z4) {
                i11 = R.string.CommunityServiceMessageChannelRemoved;
            } else {
                i11 = R.string.CommunityServiceMessageGroupRemoved;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i11, str2));
        } else {
            if (z10) {
                i10 = R.string.CommunityServiceMessageBotAdded;
            } else if (z4) {
                i10 = R.string.CommunityServiceMessageChannelAdded;
            } else {
                i10 = R.string.CommunityServiceMessageGroupAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i10, str2, str));
        }
    }

    public static int b(int i10, long j10) {
        TLRPC.Chat chat;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user2 == null) {
                return 0;
            }
            j11 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                return 0;
            }
            j11 = chat.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j11)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10) {
                    if (user != null) {
                        dialog = MessagesController.getInstance(i10).getDialog(user.f20990id);
                    }
                    return c(communityPeer2, chat, user, dialog);
                }
            }
        }
        return 0;
    }

    public static int c(TL_communities.CommunityPeer communityPeer, TLRPC.Chat chat, TLRPC.User user, TLRPC.Dialog dialog) {
        if (communityPeer == null) {
            return 0;
        }
        if (user != null) {
            if (dialog != null) {
                return 1;
            }
            return 2;
        } else if (chat == null) {
            return 0;
        } else {
            if (ChatObject.isInChat(chat)) {
                return 1;
            }
            if (!ChatObject.isPublic(chat) && !communityPeer.can_view_history) {
                if (ChatObject.isCommunityPeerHidden(communityPeer)) {
                    return 4;
                }
                return 3;
            }
            return 2;
        }
    }

    public static void d(p2 p2Var, long j10, int i10) {
        f5 f5Var;
        xn xnVar;
        int i11;
        List list = null;
        if (!AndroidUtilities.isTablet()) {
            f5Var = p2Var.getParentLayout();
            if (f5Var != null) {
                List fragmentStack = f5Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (i11 >= 0) {
                    p2 p2Var2 = (p2) fragmentStack.get(i11);
                    if (p2Var2 instanceof xn) {
                        xnVar = (xn) p2Var2;
                        if (xnVar.a() == j10) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i11--;
                }
                xnVar = null;
                list = fragmentStack;
            } else {
                xnVar = null;
            }
        } else {
            f5Var = null;
            xnVar = null;
        }
        i11 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, p2Var.getCurrentAccount());
        if (i11 != -1) {
            for (int size = list.size() - 2; size > i11; size--) {
                ((ActionBarLayout) f5Var).a0((p2) list.get(size), false);
            }
            p2Var.finishFragment();
            AndroidUtilities.runOnUIThread(new rh(i10, xnVar, isChannelAndNotMegaGroup), 250L);
            return;
        }
        if (!(p2Var instanceof py)) {
            p2Var.finishFragment();
        }
        f(qc.X(), i10, isChannelAndNotMegaGroup);
    }

    public static void e(final d2[] d2VarArr, p2 p2Var, final int i10, TLRPC.Chat chat) {
        if (d2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new mh.h0(d2VarArr, p2Var, i10, chat));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(fetchChatsToAddToCommunity, p2Var.getClassGuid());
        d2 d2Var = new d2(p2Var.getContext(), 3, null);
        d2VarArr[0] = d2Var;
        d2Var.q(500L);
        d2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(fetchChatsToAddToCommunity, true);
                d2VarArr[0] = null;
            }
        });
    }

    public static void f(qc qcVar, int i10, boolean z4) {
        int i11;
        int i12;
        String string;
        int i13;
        if (i10 == 2) {
            i11 = R.raw.timer_toast;
        } else {
            i11 = R.raw.contact_check;
        }
        if (i10 == 2) {
            i12 = 24;
        } else {
            i12 = 36;
        }
        if (i10 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i10 == 1) {
            if (z4) {
                i13 = R.string.CommunityCommunityJoinedChannel;
            } else {
                i13 = R.string.CommunityCommunityJoinedGroup;
            }
            string = LocaleController.getString(i13);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        qcVar.G(i11, i12, string).j();
    }
}
