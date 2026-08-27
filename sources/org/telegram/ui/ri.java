package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class ri implements org.telegram.ui.Components.qk0 {

    public final rn f41942a;

    public ri(rn rnVar) {
        this.f41942a = rnVar;
    }

    @Override
    public final void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        rn rnVar = this.f41942a;
        if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) {
            return;
        }
        rnVar.f42294z4 = true;
        boolean z10 = view instanceof org.telegram.ui.Cells.v0;
        boolean z11 = false;
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.getMessageObject().isDateObject) {
                if (rnVar.Ka) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = v0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", rnVar.P5);
                bundle.putLong("topic_id", rnVar.b());
                bundle.putInt("type", 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.J = rnVar;
                rnVar.presentFragment(h8Var);
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(rnVar.P5));
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new cg.w1(this, v0Var3.getMessageObject().getReplyMsgId(), 17), 16L);
                return;
            }
        }
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (rnVar.Y8.A(s1Var2.getMessageObject())) {
                    return;
                } else {
                    z11 = !s1Var2.h3(f10);
                }
            }
            rn.b2(rnVar, view, z11, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1) || (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) == null || messageObject.type != 27) {
            rnVar.I7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.s2();
        view.requestLayout();
        if (i10 >= 0) {
            rnVar.f42252w0.m(i10);
        }
    }

    @Override
    public final void c0(View view, float f10, float f11) {
        MessageObject messageObject;
        boolean zReactionIsAvailable;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        rn rnVar = this.f41942a;
        if (rnVar.getParentActivity() == null || rnVar.x() || rnVar.c() || rnVar.isInPreviewMode() || rnVar.z9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
            if (messageObject.isDateObject) {
                return;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (messageObject2.isSecret() || !messageObject2.canSetReaction() || messageObject2.isExpiredStory() || messageObject2.type == 27) {
            return;
        }
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(rnVar.f42026e, 26)) {
            ig.m0.b(false);
            String doubleTapReaction = rnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                zReactionIsAvailable = rnVar.P5 >= 0;
                if (!zReactionIsAvailable && (chatFull2 = rnVar.V7) != null) {
                    zReactionIsAvailable = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (zReactionIsAvailable) {
                    rnVar.ab(view, messageObject2, null, null, f10, f11, ig.q0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = rnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            zReactionIsAvailable = rnVar.P5 >= 0;
            if (!zReactionIsAvailable && (chatFull = rnVar.V7) != null) {
                zReactionIsAvailable = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (zReactionIsAvailable) {
                rnVar.ab(view, messageObject2, null, null, f10, f11, ig.q0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }

    @Override
    public final boolean f1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        rn rnVar = this.f41942a;
        if (!rnVar.z9() && ((tL_availableReaction = rnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = rnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean zReactionIsAvailable = rnVar.P5 >= 0;
            if (!zReactionIsAvailable && (chatFull = rnVar.V7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                zReactionIsAvailable = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (zReactionIsAvailable) {
                if (view instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing() && !((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() && !rnVar.x() && !rnVar.c() && !messageObject.isSponsored()) {
                    return true;
                }
            }
        }
        return false;
    }
}
