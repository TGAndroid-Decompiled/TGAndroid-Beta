package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.ui.Components.al0 {
    public final tn f42400a;

    public si(tn tnVar) {
        this.f42400a = tnVar;
    }

    @Override
    public final void b(float f9, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        tn tnVar = this.f42400a;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (!z10) {
            tnVar.f43054z4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.v0;
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                if (v0Var.getMessageObject().isDateObject) {
                    if (!tnVar.Ka) {
                        Bundle bundle = new Bundle();
                        int i11 = v0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", tnVar.P5);
                        bundle.putLong("topic_id", tnVar.b());
                        bundle.putInt("type", 0);
                        f8 f8Var = new f8(0, i11, bundle);
                        f8Var.J = tnVar;
                        tnVar.presentFragment(f8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
                if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(tnVar.P5));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, v0Var3.getMessageObject().getReplyMsgId(), 20), 16L);
                    return;
                }
            }
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    s1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        tnVar.f43013w0.m(i10);
                        return;
                    }
                    return;
                }
                tnVar.I7(view, true, false, f9, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (tnVar.Y8.A(s1Var2.getMessageObject())) {
                    return;
                }
                z12 = !s1Var2.i3(f9);
            }
            tn.b2(tnVar, view, z12, f9, f10);
        }
    }

    @Override
    public final boolean b1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.ChatFull chatFull;
        tn tnVar = this.f42400a;
        if (!tnVar.z9() && ((tL_availableReaction = tnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = tnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (tnVar.P5 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (chatFull = tnVar.V7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (!lVar.s() && !tnVar.w() && !tnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void o0(View view, float f9, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        tn tnVar = this.f42400a;
        if (tnVar.getParentActivity() != null && !tnVar.w() && !tnVar.c() && !tnVar.isInPreviewMode() && !tnVar.z9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                if (messageObject.isDateObject) {
                    return;
                }
            } else {
                return;
            }
            MessageObject messageObject2 = messageObject;
            if (!messageObject2.isSecret() && messageObject2.canSetReaction() && !messageObject2.isExpiredStory() && messageObject2.type != 27) {
                TLRPC.Chat chat = tnVar.f42787e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(tnVar.f42787e, 26)) {
                    boolean z10 = false;
                    kg.m0.b(false);
                    String doubleTapReaction = tnVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (tnVar.P5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = tnVar.V7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            tnVar.ab(view, messageObject2, null, null, f9, f10, kg.q0.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = tnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (tnVar.P5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = tnVar.V7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            tnVar.ab(view, messageObject2, null, null, f9, f10, kg.q0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
