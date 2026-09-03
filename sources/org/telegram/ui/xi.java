package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class xi implements org.telegram.ui.Components.jl0 {
    public final xn f43057a;

    public xi(xn xnVar) {
        this.f43057a = xnVar;
    }

    @Override
    public final boolean Y0(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z4;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        xn xnVar = this.f43057a;
        if (!xnVar.z9() && ((tL_availableReaction = xnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = xnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (xnVar.Q5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && (chatFull = xnVar.W7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z4 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z4) {
                if (view instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (!kVar.s() && !xnVar.w() && !xnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void c(float f10, float f11, int i10, View view) {
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        xn xnVar = this.f43057a;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (!z4) {
            xnVar.A4 = true;
            boolean z10 = view instanceof org.telegram.ui.Cells.v0;
            boolean z11 = false;
            if (z10) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                if (v0Var.getMessageObject().isDateObject) {
                    if (!xnVar.La) {
                        Bundle bundle = new Bundle();
                        int i11 = v0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", xnVar.Q5);
                        bundle.putLong("topic_id", xnVar.b());
                        bundle.putInt("type", 0);
                        j8 j8Var = new j8(0, i11, bundle);
                        j8Var.K = xnVar;
                        xnVar.presentFragment(j8Var);
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
                if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.Q5));
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new af.b(this, v0Var3.getMessageObject().getReplyMsgId(), 17), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    t1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        xnVar.f43381x0.m(i10);
                        return;
                    }
                    return;
                }
                xnVar.I7(view, true, false, f10, f11, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                if (xnVar.Z8.A(t1Var2.getMessageObject())) {
                    return;
                }
                z11 = !t1Var2.i3(f10);
            }
            xn.b2(xnVar, view, z11, f10, f11);
        }
    }

    @Override
    public final void r0(View view, float f10, float f11) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        xn xnVar = this.f43057a;
        if (xnVar.getParentActivity() != null && !xnVar.w() && !xnVar.c() && !xnVar.isInPreviewMode() && !xnVar.z9()) {
            if (view instanceof org.telegram.ui.Cells.t1) {
                messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
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
                TLRPC.Chat chat = xnVar.f43143e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(xnVar.f43143e, 26)) {
                    boolean z4 = false;
                    ng.m0.b(false);
                    String doubleTapReaction = xnVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (xnVar.Q5 >= 0) {
                            z4 = true;
                        }
                        if (!z4 && (chatFull2 = xnVar.W7) != null) {
                            z4 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z4) {
                            xnVar.ab(view, messageObject2, null, null, f10, f11, ng.q0.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = xnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (xnVar.Q5 >= 0) {
                            z4 = true;
                        }
                        if (!z4 && (chatFull = xnVar.W7) != null) {
                            z4 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z4) {
                            xnVar.ab(view, messageObject2, null, null, f10, f11, ng.q0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
