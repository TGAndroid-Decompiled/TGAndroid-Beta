package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class uk implements org.telegram.ui.Components.vj0 {

    public final rn f43244a;

    public uk(rn rnVar) {
        this.f43244a = rnVar;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        TLRPC.Document documentF;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        boolean z13;
        MessageObject messageObject2;
        TLRPC.Message message;
        rn rnVar = this.f43244a;
        SparseArray[] sparseArrayArr = rnVar.S5;
        if (rnVar.Xa == null) {
            return;
        }
        if (rnVar.a() == rnVar.getUserConfig().getClientUserId() && !rnVar.getUserConfig().isPremium()) {
            new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 24, true).show();
            rnVar.z7(false);
            return;
        }
        boolean zContains = rnVar.Xa.getSelectedReactions().contains(q0Var);
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i13 = 0;
        while (i12 < sparseArrayArr.length) {
            boolean z16 = z14;
            boolean z17 = z15;
            int i14 = i13;
            int i15 = 0;
            while (i15 < sparseArrayArr[i12].size()) {
                MessageObject messageObjectFindPrimaryMessageObject = (MessageObject) sparseArrayArr[i12].valueAt(i15);
                if (messageObjectFindPrimaryMessageObject.hasValidGroupId()) {
                    MessageObject.GroupedMessages groupedMessagesX8 = rnVar.X8(messageObjectFindPrimaryMessageObject);
                    if (groupedMessagesX8 != null && !hashSet2.contains(Long.valueOf(groupedMessagesX8.groupId))) {
                        hashSet2.add(Long.valueOf(groupedMessagesX8.groupId));
                        messageObjectFindPrimaryMessageObject = groupedMessagesX8.findPrimaryMessageObject();
                        if (messageObjectFindPrimaryMessageObject != null) {
                            if (messageObjectFindPrimaryMessageObject.hasReaction(q0Var) == zContains) {
                                hashSet = hashSet2;
                                messageObject = messageObjectFindPrimaryMessageObject;
                                z12 = zContains;
                                i10 = i12;
                                i11 = i15;
                                rnVar.ab(rnVar.q8(messageObjectFindPrimaryMessageObject.getId(), false), messageObject, null, null, 0.0f, 0.0f, q0Var, false, false, false, true);
                                if (!z12) {
                                    i14++;
                                }
                            } else {
                                z12 = zContains;
                                hashSet = hashSet2;
                                i10 = i12;
                                i11 = i15;
                                messageObject = messageObjectFindPrimaryMessageObject;
                            }
                            if (messageObject.messageOwner != null) {
                                z13 = rnVar.f42252w0.J;
                                if (z13) {
                                    messageObject2 = (MessageObject) rnVar.f42109k6[0].get(messageObject.getId());
                                    if (messageObject2 != null) {
                                        message.reactions = messageObject.messageOwner.reactions;
                                    }
                                } else if (!z13) {
                                    z16 = true;
                                }
                            }
                            if (!rnVar.f42252w0.J) {
                            }
                        }
                    }
                    z12 = zContains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                } else {
                    if (messageObjectFindPrimaryMessageObject.hasReaction(q0Var) == zContains) {
                        hashSet = hashSet2;
                        messageObject = messageObjectFindPrimaryMessageObject;
                        z12 = zContains;
                        i10 = i12;
                        i11 = i15;
                        rnVar.ab(rnVar.q8(messageObjectFindPrimaryMessageObject.getId(), false), messageObject, null, null, 0.0f, 0.0f, q0Var, false, false, false, true);
                        if (!z12) {
                            i14++;
                        }
                    } else {
                        z12 = zContains;
                        hashSet = hashSet2;
                        i10 = i12;
                        i11 = i15;
                        messageObject = messageObjectFindPrimaryMessageObject;
                    }
                    if (messageObject.messageOwner != null) {
                        z13 = rnVar.f42252w0.J;
                        if (z13) {
                            messageObject2 = (MessageObject) rnVar.f42109k6[0].get(messageObject.getId());
                            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                message.reactions = messageObject.messageOwner.reactions;
                            }
                        } else if (!z13 && rnVar.f42128m3 != null) {
                            z16 = true;
                        }
                    }
                    if (!rnVar.f42252w0.J && !messageObject.hasReaction(rnVar.f42128m3)) {
                        MessageObject.GroupedMessages groupedMessagesX9 = rnVar.X8(messageObject);
                        if (groupedMessagesX9 != null) {
                            for (int i16 = 0; i16 < groupedMessagesX9.messages.size(); i16++) {
                                rnVar.getMediaDataController().removeMessageFromResults(groupedMessagesX9.messages.get(i16).getId());
                            }
                        } else {
                            rnVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                        }
                        pf.y0 y0Var = rnVar.I3;
                        if (y0Var != null) {
                            y0Var.l();
                        }
                        z16 = true;
                        z17 = true;
                    }
                }
                i15 = i11 + 1;
                hashSet2 = hashSet;
                zContains = z12;
                i12 = i10;
            }
            i12++;
            z14 = z16;
            z15 = z17;
            i13 = i14;
        }
        if (z14) {
            rnVar.kc(z15);
        }
        rnVar.z7(true);
        if (i13 > 0) {
            long j10 = q0Var.f11413g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f11412f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    documentF = tL_availableReaction.activate_animation;
                }
            } else {
                documentF = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
            }
            if (documentF == null) {
                return;
            }
            org.telegram.ui.Components.mc.a0(rnVar).y(i13, documentF, null).k(true);
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
