package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class tm implements org.telegram.ui.Components.qg {
    public int f36963a;
    public boolean f36964b;
    public final eo f36965c;

    public tm(eo eoVar) {
        this.f36965c = eoVar;
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        eo eoVar = this.f36965c;
        if (z10) {
            Activity parentActivity = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            eoVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean D0() {
        int i10;
        eo eoVar = this.f36965c;
        if ((!eoVar.getMessagesController().isForum(eoVar.a()) || eoVar.f32346h4) && (i10 = eoVar.R3) != 9 && eoVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D1() {
        int i10;
        int i11;
        eo eoVar = this.f36965c;
        if (!eoVar.z9() && (i10 = eoVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = eoVar.getMessagesController();
            long j3 = eoVar.T5;
            long j10 = eoVar.f32298d4;
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void F0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f36965c;
        if (eoVar.f32354i0 != null) {
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = lVar.n();
            org.telegram.ui.Components.zy0 zy0Var = eoVar.f32295d1;
            if (zy0Var != null) {
                zy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = eoVar.f32354i0;
                if (yVar.f18769o == null) {
                    yVar.f18769o = 1;
                    if (eoVar.f32354i0.f18766l != 0) {
                        if ((eoVar.R3 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId()) || (eoVar.R3 == 0 && ((eoVar.f32298d4 == 0 || eoVar.f32346h4) && !UserObject.isReplyUser(eoVar.f32318f) && !eoVar.A9()))) {
                            eoVar.f32354i0.f(0);
                            eo.J3(eoVar);
                            org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32342h0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = eoVar.f32307e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            is isVar = eoVar.f32294d0;
                            if (isVar != null) {
                                isVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                            ofFloat.addListener(new sm(this, n10, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                    }
                                }
                            });
                            ofFloat.start();
                        }
                    }
                }
                eoVar.A4 = i10;
                eoVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = eoVar.f32354i0;
            if (yVar3.f18769o != null) {
                yVar3.f18769o = null;
                if (yVar3.f18766l != 8) {
                    if ((eoVar.R3 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId()) || (eoVar.R3 == 0 && ((eoVar.f32298d4 == 0 || eoVar.f32346h4) && !UserObject.isReplyUser(eoVar.f32318f) && !eoVar.A9()))) {
                        eoVar.f32354i0.f(8);
                        if (eoVar.Y.k0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.f32342h0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = eoVar.f32307e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            is isVar2 = eoVar.f32294d0;
                            if (isVar2 != null) {
                                isVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = eoVar.f32342h0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = eoVar.f32307e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        is isVar3 = eoVar.f32294d0;
                        if (isVar3 != null) {
                            isVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    ofFloat2.addListener(new sm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                            }
                        }
                    });
                    ofFloat2.start();
                }
            }
        }
    }

    @Override
    public final void G() {
        this.f36965c.Vb(true, false);
    }

    @Override
    public final void H0() {
        eo eoVar = this.f36965c;
        eoVar.o9 = true;
        pm pmVar = eoVar.A0;
        if (pmVar != null) {
            pmVar.K(true);
        }
    }

    @Override
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        fg.h1 h1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        eo eoVar = this.f36965c;
        ArrayList arrayList = eoVar.f32509u6;
        if (eoVar.f32555y0 != null) {
            eoVar.f32268b0 = eoVar.Y.getBackgroundTop();
        }
        hk hkVar = eoVar.I1;
        if (hkVar != null && hkVar.getAdapter() != null) {
            eoVar.I1.getAdapter().f8128w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (eoVar.S3 == -1) {
                eoVar.S3 = 0;
            }
            if (charSequence != null) {
                eoVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = eoVar.f32324f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                eoVar.S3 += eoVar.f32324f5.forwardMessages.messages.size();
            }
            eoVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = eoVar.f32324f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && eoVar.f32324f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            eoVar.f32324f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = eoVar.getMessagesController().getPeer(eoVar.T5);
            int i13 = 0;
            while (true) {
                if (i13 < arrayList2.size()) {
                    MessageObject messageObject2 = arrayList2.get(i13);
                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                        break;
                    }
                    i13++;
                } else {
                    z12 = z11;
                    break;
                }
            }
            if (z12) {
                org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(eoVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Components.mc) M.e).f25215a;
                kj0Var.setScaleX(1.8f);
                kj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(eoVar.e) && !eoVar.f32346h4 && (messageObject = eoVar.f32421n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, eoVar.f32421n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f17247id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                eoVar.getMediaDataController().cleanDraft(eoVar.T5, j10, false);
            }
        }
        eoVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        ok okVar = eoVar.Y;
        if (okVar != null && okVar.getEmojiView() != null && (h1Var = eoVar.Y.getEmojiView().T0) != null) {
            if (h1Var.e) {
                MessagesController.getInstance(h1Var.f8061a).sendTyping(h1Var.f8062b, h1Var.f8063c, 2, 0);
            }
            h1Var.f8064f = -1L;
        }
        if (!eoVar.getMessagesController().premiumFeaturesBlocked() && eoVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !eoVar.getMessagesController().didPressTranscribeButtonEnough() && !eoVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.r31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f36965c.ha;
    }

    @Override
    public final void J0() {
        this.f36965c.ja(0, false);
    }

    @Override
    public final void T(float f7, int i10) {
        il ilVar = this.f36965c.f32271b3;
        if (ilVar != null) {
            ilVar.e(f7, i10);
        }
    }

    @Override
    public final void T0() {
        eo eoVar = this.f36965c;
        int sendingMessageId = eoVar.getSendMessagesHelper().getSendingMessageId(eoVar.T5);
        if (sendingMessageId != 0) {
            this.f36965c.E(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        eo eoVar = this.f36965c;
        ok okVar = eoVar.Y;
        boolean z11 = okVar.y3;
        org.telegram.ui.Components.fg fgVar = okVar.U0;
        boolean z12 = false;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = eoVar.xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void Z(boolean z10) {
        this.f36965c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        eo eoVar = this.f36965c;
        if (eoVar.f32285c3.getVisibility() != i11) {
            eoVar.f32285c3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f36965c.X0.getHeight();
    }

    @Override
    public final void b2() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36965c.f32295d1;
        if (zy0Var != null) {
            zy0Var.e();
        }
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        eo eoVar = this.f36965c;
        if (i10 < currentActionBarHeight) {
            eoVar.Z4 = false;
            if (eoVar.f32295d1.getVisibility() == 0) {
                eoVar.f32295d1.setVisibility(4);
            }
        } else {
            eoVar.Z4 = true;
            if (eoVar.f32295d1.getVisibility() == 4 && !eoVar.isInPreviewMode()) {
                eoVar.f32295d1.setVisibility(0);
            }
        }
        eoVar.f32259a5 = true ^ eoVar.Y.t0();
        if (eoVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f36963a != i12) {
            eoVar.f32268b0 = 0;
        }
        this.f36963a = i12;
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final void g2() {
        vm vmVar;
        int indexOfChild;
        int i10;
        eo eoVar = this.f36965c;
        if (eoVar.getParentActivity() != null) {
            if ((eoVar.e != null || eoVar.f32262a8 != null) && eoVar.fragmentView != null) {
                org.telegram.ui.Components.s40 s40Var = eoVar.f32321f2;
                if ((s40Var == null || s40Var.getVisibility() != 0) && (indexOfChild = (vmVar = eoVar.X0).indexOfChild(eoVar.S)) != -1) {
                    try {
                        eoVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (eoVar.f32321f2 == null) {
                        org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(9, eoVar.getParentActivity(), eoVar.f32316ea, false);
                        eoVar.f32321f2 = s40Var2;
                        s40Var2.setVisibility(8);
                        vmVar.addView(eoVar.f32321f2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = eoVar.f32262a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.s40 s40Var3 = eoVar.f32321f2;
                        if (eoVar.Y.f20832c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        s40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, eoVar.f32318f.first_name)));
                    } else if (!ChatObject.canSendVoice(eoVar.e) && !ChatObject.canSendRoundVideo(eoVar.e)) {
                        if (!eoVar.K6()) {
                            if (eoVar.Y.f20832c1) {
                                eoVar.f32321f2.setText(ChatObject.getRestrictedErrorText(eoVar.e, 21));
                            } else {
                                eoVar.f32321f2.setText(ChatObject.getRestrictedErrorText(eoVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(eoVar.e, 20)) {
                        eoVar.f32321f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.e, 21)) {
                        eoVar.f32321f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.e, 7)) {
                        eoVar.f32321f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = eoVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                eoVar.f32321f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                eoVar.f32321f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(eoVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = eoVar.Y.getSendButton();
                    View audioVideoButtonContainer = eoVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    eoVar.f32321f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void h() {
        this.f36965c.vc();
    }

    @Override
    public final boolean h1() {
        il ilVar = this.f36965c.f32271b3;
        if (ilVar != null && !ilVar.f22882e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void h2(boolean z10) {
        eo eoVar = this.f36965c;
        View view = eoVar.f32531w2;
        if (view != null) {
            view.setVisibility(8);
        }
        eoVar.f32273b5 = !z10;
    }

    @Override
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        eo eoVar = this.f36965c;
        boolean z11 = true;
        if (eoVar.f32271b3 == null && CameraView.isCameraAllowed() && eoVar.getParentActivity() != null) {
            il ilVar = new il(eoVar, eoVar.getParentActivity(), eoVar, eoVar.f32316ea);
            eoVar.f32271b3 = ilVar;
            ilVar.setClipToPadding(false);
            il ilVar2 = eoVar.f32271b3;
            zg.a aVar = eoVar.J;
            lj ljVar = eoVar.f32528w;
            View view = ilVar2.R0;
            bh.d c10 = aVar.c(view, ljVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c10);
            int indexOfChild = eoVar.X0.indexOfChild(eoVar.S);
            if (indexOfChild < 0) {
                indexOfChild = eoVar.X0.getChildCount();
            }
            eoVar.X0.addView(eoVar.f32271b3, Math.min(indexOfChild + 1, eoVar.X0.getChildCount()), w7.a6.e(-1, -1, 51));
        }
        il ilVar3 = eoVar.f32271b3;
        if (ilVar3 != null) {
            if (i10 == 0) {
                ilVar3.l(false);
                eoVar.f32542x0.B0();
                eoVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z11 = false;
                    }
                    ilVar3.d(z11);
                }
            } else {
                ilVar3.k(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36965c.f32295d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.s40 s40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        eo eoVar = this.f36965c;
        if (isEmpty && !eoVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        hk hkVar = eoVar.I1;
        if (hkVar != null && hkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            eoVar.I1.getAdapter().U(charSequence2, eoVar.Y.getCursorPosition(), eoVar.f32509u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = eoVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            eoVar.J5 = null;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ok okVar = eoVar.Y;
            if (okVar.X2 && (!okVar.r0() || !eoVar.Y.Z1)) {
                if (z10) {
                    eoVar.Ya(charSequence2, true);
                } else {
                    eoVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    eoVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        zk zkVar = eoVar.f32552xa;
        if (zkVar != null) {
            ArrayList arrayList = zkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((hz) arrayList.get(i10)).f33497n = true;
            }
        }
        yg.l0 l0Var = yg.l0.B;
        if (l0Var != null) {
            l0Var.f47049l = true;
        }
        yg.l0 l0Var2 = yg.l0.C;
        if (l0Var2 != null) {
            l0Var2.f47049l = true;
        }
        if (!z11) {
            kj kjVar = eoVar.f32333g2;
            if ((kjVar != null && kjVar.getVisibility() == 0) || ((s40Var = eoVar.f32356i2) != null && s40Var.getVisibility() == 0)) {
                kj kjVar2 = eoVar.f32333g2;
                if (kjVar2 != null) {
                    kjVar2.b(true);
                }
                org.telegram.ui.Components.s40 s40Var2 = eoVar.f32356i2;
                if (s40Var2 != null) {
                    s40Var2.b(true);
                    return;
                }
                return;
            }
            sf sfVar = eoVar.Na;
            if (UserObject.isUserSelf(eoVar.f32318f) || ((chatFull = eoVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && eoVar.R3 == 0)) {
                z13 = true;
            }
            if (!eoVar.f32369j2 && !eoVar.f32344h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !eoVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(sfVar);
                AndroidUtilities.runOnUIThread(sfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean l() {
        return this.f36965c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36965c.f32295d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override
    public final void m1() {
        il ilVar = this.f36965c.f32271b3;
        if (ilVar != null) {
            ilVar.q();
        }
    }

    @Override
    public final void m2() {
        eo eoVar = this.f36965c;
        kj kjVar = eoVar.f32333g2;
        if (kjVar != null) {
            kjVar.b(true);
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.f32356i2;
        if (s40Var != null) {
            s40Var.b(true);
        }
    }

    @Override
    public final boolean n1() {
        eo eoVar = this.f36965c;
        TLRPC.User user = eoVar.f32318f;
        if (user != null && !UserObject.isUserSelf(user) && !eoVar.f32318f.bot && eoVar.h == null && eoVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final tn p0() {
        return this.f36965c.f32395l5;
    }

    @Override
    public final void p1() {
        int i10;
        eo eoVar = this.f36965c;
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        long j3 = eoVar.T5;
        MessageSuggestionParams messageSuggestionParams = eoVar.f32336g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new xh.e0(parentActivity, i10, j3, messageSuggestionParams, eoVar, eoVar.getResourceProvider(), 0, new df(eoVar, 3)).show();
    }

    @Override
    public final void q1() {
        this.f36965c.H6();
    }

    @Override
    public final void r1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        eo eoVar = this.f36965c;
        eoVar.W6();
        ok okVar = eoVar.Y;
        boolean z12 = okVar.y3;
        org.telegram.ui.Components.fg fgVar = okVar.U0;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = eoVar.xc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            if (pcVar != null && pcVar.f26083l) {
                pcVar.b();
            }
        } else {
            Activity parentActivity2 = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        hk hkVar = eoVar.I1;
        float f10 = 0.0f;
        if (hkVar != null) {
            ViewPropertyAnimator animate = hkVar.animate();
            if (!z12 && !eoVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
        }
        org.telegram.ui.Components.zy0 zy0Var = eoVar.f32295d1;
        if (zy0Var != null) {
            zy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = eoVar.f32295d1.animate();
            if (!z12 && !eoVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.wr.f28819f).withEndAction(new ai.j(19, this, z12)).start();
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        eo eoVar = this.f36965c;
        eoVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32342h0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            eoVar.f32342h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = eoVar.f32307e0;
            if (yVar != null) {
                yVar.f(8);
            }
            is isVar = eoVar.f32294d0;
            if (isVar != null) {
                isVar.b(false);
            }
        }
    }

    @Override
    public final void t0() {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f36965c;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (!lVar.f18389n0) {
            org.telegram.ui.ActionBar.y yVar = eoVar.f32354i0;
            if (yVar != null && !this.f36964b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32342h0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = eoVar.f32307e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                is isVar = eoVar.f32294d0;
                if (isVar != null) {
                    isVar.b(true);
                }
            }
        }
    }

    @Override
    public final int u() {
        return this.f36965c.X0.R();
    }

    @Override
    public final void u1(CharSequence charSequence) {
        this.f36965c.Ya(charSequence, true);
    }

    @Override
    public final void u2() {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f36965c;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (!lVar.f18389n0) {
            org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32342h0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = eoVar.f32354i0;
            if (yVar != null && !this.f36964b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = eoVar.f32307e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            is isVar = eoVar.f32294d0;
            if (isVar != null) {
                isVar.b(false);
            }
        }
    }

    @Override
    public final boolean v1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f36965c.f32324f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.Peer w() {
        return null;
    }

    @Override
    public final void x() {
        boolean z10;
        eo eoVar = this.f36965c;
        if (eoVar.f32555y0 != null) {
            eoVar.f32268b0 = eoVar.Y.getBackgroundTop();
        }
        hk hkVar = eoVar.I1;
        if (hkVar != null) {
            hkVar.getAdapter().f8109f0 = true;
        }
        if (eoVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new fj(this, 6), 30L);
        }
        if (eoVar.Y.t0()) {
            eoVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.Y.V0(true, true, z10);
        if (eoVar.f32432o5 != 0) {
            eoVar.getConnectionsManager().cancelRequest(eoVar.f32432o5, true);
            eoVar.f32432o5 = 0;
        }
        eoVar.yc(0, true);
        eoVar.hc(false);
        eoVar.Wc(false);
    }

    @Override
    public final void y(float f7) {
        eo eoVar = this.f36965c;
        if (f7 != 0.0f) {
            eoVar.D4 = true;
        }
        eoVar.o9();
        eoVar.r9();
        eoVar.Mc(false, false);
        eoVar.X0.invalidate();
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
        if (pcVar != null && eoVar.Zb != null) {
            pcVar.l();
        }
    }

    @Override
    public final void y1() {
        int i10;
        eo eoVar = this.f36965c;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(eoVar.T5, (int) eoVar.d());
        eoVar.c7(true);
    }

    @Override
    public final void y2() {
        eo eoVar = this.f36965c;
        gg.m mVar = eoVar.J1;
        if (mVar != null) {
            mVar.I1(null, 0);
        }
        eoVar.X9();
    }
}
