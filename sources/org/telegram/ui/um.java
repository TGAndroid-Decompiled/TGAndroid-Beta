package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class um implements org.telegram.ui.Components.sg {
    public int f42534a;
    public boolean f42535b;
    public final eo f42536c;

    public um(eo eoVar) {
        this.f42536c = eoVar;
    }

    @Override
    public final void C(boolean z10) {
        int i10;
        int i11;
        eo eoVar = this.f42536c;
        if (z10) {
            Activity parentActivity = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            eoVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void C1(CharSequence charSequence) {
        this.f42536c.cb(charSequence, true);
    }

    @Override
    public final boolean D1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f42536c.f37259f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void D2() {
        org.telegram.ui.ActionBar.k kVar;
        eo eoVar = this.f42536c;
        kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
        if (!kVar.f21060n0) {
            org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37277h0;
            if (u0Var != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = eoVar.f37289i0;
            if (xVar != null && !this.f42535b) {
                xVar.f(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = eoVar.f37242e0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            is isVar = eoVar.f37228d0;
            if (isVar != null) {
                isVar.b(false);
            }
        }
    }

    @Override
    public final void G() {
        this.f42536c.Zb(true, false);
    }

    @Override
    public final void G1() {
        int i10;
        eo eoVar = this.f42536c;
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(eoVar.T5, (int) eoVar.d());
        eoVar.f7(true);
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        eo eoVar = this.f42536c;
        ArrayList arrayList = eoVar.f37444u6;
        if (eoVar.f37491y0 != null) {
            eoVar.f37202b0 = eoVar.Y.getBackgroundTop();
        }
        kk kkVar = eoVar.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            eoVar.I1.getAdapter().f10691w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (eoVar.S3 == -1) {
                eoVar.S3 = 0;
            }
            if (charSequence != null) {
                eoVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = eoVar.f37259f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                eoVar.S3 += eoVar.f37259f5.forwardMessages.messages.size();
            }
            eoVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = eoVar.f37259f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && eoVar.f37259f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            eoVar.f37259f5.forwardMessages.getSelectedMessages(arrayList2);
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
                org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(eoVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.ik0 ik0Var = ((org.telegram.ui.Components.pc) M.f30536e).f29480a;
                ik0Var.setScaleX(1.8f);
                ik0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(eoVar.f37241e) && !eoVar.f37281h4 && (messageObject = eoVar.f37356n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, eoVar.f37356n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f19854id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                eoVar.getMediaDataController().cleanDraft(eoVar.T5, j10, false);
            }
        }
        eoVar.Cb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        sk skVar = eoVar.Y;
        if (skVar != null && skVar.getEmojiView() != null && (f1Var = eoVar.Y.getEmojiView().T0) != null) {
            if (f1Var.f10593e) {
                MessagesController.getInstance(f1Var.f10590a).sendTyping(f1Var.f10591b, f1Var.f10592c, 2, 0);
            }
            f1Var.f10594f = -1L;
        }
        if (!eoVar.getMessagesController().premiumFeaturesBlocked() && eoVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !eoVar.getMessagesController().didPressTranscribeButtonEnough() && !eoVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.o41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final boolean H0() {
        int i10;
        eo eoVar = this.f42536c;
        if ((!eoVar.getMessagesController().isForum(eoVar.a()) || eoVar.f37281h4) && (i10 = eoVar.R3) != 9 && eoVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && eoVar.N8() == eoVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void H2() {
        eo eoVar = this.f42536c;
        ai.h4 h4Var = eoVar.J1;
        if (h4Var != null) {
            h4Var.L1(null, 0);
        }
        eoVar.ca();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f42536c.ha;
    }

    @Override
    public final void J0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        eo eoVar = this.f42536c;
        if (eoVar.f37289i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
            final org.telegram.ui.ActionBar.y p5 = kVar.p();
            org.telegram.ui.Components.uz0 uz0Var = eoVar.f37229d1;
            if (uz0Var != null) {
                uz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.x xVar = eoVar.f37289i0;
                if (xVar.f21442o == null) {
                    xVar.f21442o = 1;
                    if (eoVar.f37289i0.f21439l != 0) {
                        if ((eoVar.R3 == 3 && eoVar.N8() == eoVar.getUserConfig().getClientUserId()) || (eoVar.R3 == 0 && ((eoVar.f37232d4 == 0 || eoVar.f37281h4) && !UserObject.isReplyUser(eoVar.f37253f) && !eoVar.F9()))) {
                            eoVar.f37289i0.f(0);
                            eo.S3(eoVar);
                            org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37277h0;
                            if (u0Var != null) {
                                u0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar2 = eoVar.f37242e0;
                            if (xVar2 != null) {
                                xVar2.f(8);
                            }
                            is isVar = eoVar.f37228d0;
                            if (isVar != null) {
                                isVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.js.f27627f);
                            ofFloat.addListener(new tm(this, p5, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            p5.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            p5.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
            org.telegram.ui.ActionBar.x xVar3 = eoVar.f37289i0;
            if (xVar3.f21442o != null) {
                xVar3.f21442o = null;
                if (xVar3.f21439l != 8) {
                    if ((eoVar.R3 == 3 && eoVar.N8() == eoVar.getUserConfig().getClientUserId()) || (eoVar.R3 == 0 && ((eoVar.f37232d4 == 0 || eoVar.f37281h4) && !UserObject.isReplyUser(eoVar.f37253f) && !eoVar.F9()))) {
                        eoVar.f37289i0.f(8);
                        if (eoVar.Y.l0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.u0 u0Var2 = eoVar.f37277h0;
                            if (u0Var2 != null) {
                                u0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar4 = eoVar.f37242e0;
                            if (xVar4 != null) {
                                xVar4.f(0);
                            }
                            is isVar2 = eoVar.f37228d0;
                            if (isVar2 != null) {
                                isVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = eoVar.f37277h0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.x xVar5 = eoVar.f37242e0;
                        if (xVar5 != null) {
                            xVar5.f(8);
                        }
                        is isVar3 = eoVar.f37228d0;
                        if (isVar3 != null) {
                            isVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.js.f27627f);
                    ofFloat2.addListener(new tm(this, p5, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    p5.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    p5.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.b70 b70Var = this.f42536c.f37205b3;
        if (b70Var != null) {
            b70Var.b(f7, i10);
        }
    }

    @Override
    public final void L1() {
        int i10;
        int i11;
        eo eoVar = this.f42536c;
        if (!eoVar.E9() && (i10 = eoVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = eoVar.getMessagesController();
            long j3 = eoVar.T5;
            long j10 = eoVar.f37232d4;
            i11 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void M0() {
        eo eoVar = this.f42536c;
        eoVar.o9 = true;
        qm qmVar = eoVar.A0;
        if (qmVar != null) {
            qmVar.K(true);
        }
    }

    @Override
    public final void O0() {
        this.f42536c.oa(0, false);
    }

    @Override
    public final void X() {
        boolean z10;
        eo eoVar = this.f42536c;
        sk skVar = eoVar.Y;
        boolean z11 = skVar.f23627b4;
        org.telegram.ui.Components.ig igVar = skVar.U0;
        boolean z12 = false;
        if (igVar != null && igVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        me.b bVar = eoVar.xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void Y0() {
        eo eoVar = this.f42536c;
        int sendingMessageId = eoVar.getSendMessagesHelper().getSendingMessageId(eoVar.T5);
        if (sendingMessageId != 0) {
            this.f42536c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void Z(boolean z10) {
        this.f42536c.Zb(false, z10);
    }

    @Override
    public final void g1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        eo eoVar = this.f42536c;
        if (eoVar.f37219c3.getVisibility() != i11) {
            eoVar.f37219c3.setVisibility(i11);
        }
    }

    @Override
    public final void h() {
        this.f42536c.zc();
    }

    @Override
    public final int h1() {
        return this.f42536c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public final void j2() {
        org.telegram.ui.Components.uz0 uz0Var = this.f42536c.f37229d1;
        if (uz0Var != null) {
            uz0Var.e();
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.uz0 uz0Var = this.f42536c.f37229d1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override
    public final boolean l1(long j3) {
        return false;
    }

    @Override
    public final void l2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        eo eoVar = this.f42536c;
        if (i10 < currentActionBarHeight) {
            eoVar.Z4 = false;
            if (eoVar.f37229d1.getVisibility() == 0) {
                eoVar.f37229d1.setVisibility(4);
            }
        } else {
            eoVar.Z4 = true;
            if (eoVar.f37229d1.getVisibility() == 4 && !eoVar.isInPreviewMode()) {
                eoVar.f37229d1.setVisibility(0);
            }
        }
        eoVar.f37193a5 = true ^ eoVar.Y.u0();
        if (eoVar.Y.u0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f42534a != i12) {
            eoVar.f37202b0 = 0;
        }
        this.f42534a = i12;
    }

    @Override
    public final boolean m() {
        return this.f42536c.N6();
    }

    @Override
    public final boolean o1() {
        org.telegram.ui.Components.b70 b70Var = this.f42536c.f37205b3;
        if (b70Var != null && b70Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        wm wmVar;
        int indexOfChild;
        int i10;
        eo eoVar = this.f42536c;
        if (eoVar.getParentActivity() != null) {
            if ((eoVar.f37241e != null || eoVar.f37196a8 != null) && eoVar.fragmentView != null) {
                org.telegram.ui.Components.c50 c50Var = eoVar.f37256f2;
                if ((c50Var == null || c50Var.getVisibility() != 0) && (indexOfChild = (wmVar = eoVar.X0).indexOfChild(eoVar.S)) != -1) {
                    try {
                        eoVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (eoVar.f37256f2 == null) {
                        org.telegram.ui.Components.c50 c50Var2 = new org.telegram.ui.Components.c50(9, eoVar.getParentActivity(), eoVar.f37251ea, false);
                        eoVar.f37256f2 = c50Var2;
                        c50Var2.setVisibility(8);
                        wmVar.addView(eoVar.f37256f2, indexOfChild + 1, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    TLRPC.UserFull userFull = eoVar.f37196a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.c50 c50Var3 = eoVar.f37256f2;
                        if (eoVar.Y.f23631c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        c50Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, eoVar.f37253f.first_name)));
                    } else if (!ChatObject.canSendVoice(eoVar.f37241e) && !ChatObject.canSendRoundVideo(eoVar.f37241e)) {
                        if (!eoVar.N6()) {
                            if (eoVar.Y.f23631c1) {
                                eoVar.f37256f2.setText(ChatObject.getRestrictedErrorText(eoVar.f37241e, 21));
                            } else {
                                eoVar.f37256f2.setText(ChatObject.getRestrictedErrorText(eoVar.f37241e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(eoVar.f37241e, 20)) {
                        eoVar.f37256f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.f37241e, 21)) {
                        eoVar.f37256f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.f37241e, 7)) {
                        eoVar.f37256f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = eoVar.f37241e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                eoVar.f37256f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                eoVar.f37256f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(eoVar.f37241e.banned_rights.until_date)));
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
                    eoVar.f37256f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void p0() {
        org.telegram.ui.Components.uz0 uz0Var = this.f42536c.f37229d1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override
    public final void p2(boolean z10) {
        eo eoVar = this.f42536c;
        View view = eoVar.f37466w2;
        if (view != null) {
            view.setVisibility(8);
        }
        eoVar.f37207b5 = !z10;
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.b70 w60Var;
        eo eoVar = this.f42536c;
        boolean z12 = false;
        if (eoVar.f37205b3 == null && CameraView.isCameraAllowed() && eoVar.getParentActivity() != null) {
            Activity parentActivity = eoVar.getParentActivity();
            bo boVar = eoVar.f37251ea;
            int i13 = org.telegram.ui.Components.b70.f24575e;
            ri.a aVar = ri.e.d;
            aVar.a();
            if (aVar.f47781c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                w60Var = new org.telegram.ui.Components.v60(parentActivity, eoVar, boVar);
            } else {
                w60Var = new org.telegram.ui.Components.w60(parentActivity, eoVar, boVar, true);
            }
            eoVar.f37205b3 = w60Var;
            w60Var.setAnimationCallback(new ve(eoVar, 0));
            eoVar.f37205b3.setTrimCallback(new ve(eoVar, 1));
            eoVar.f37205b3.setRecordingUiFrameCallback(new wj(eoVar));
            eoVar.f37205b3.setClipToPadding(false);
            eoVar.f37205b3.g(eoVar.J, eoVar.f37463w);
            int indexOfChild = eoVar.X0.indexOfChild(eoVar.S);
            if (indexOfChild < 0) {
                indexOfChild = eoVar.X0.getChildCount();
            }
            eoVar.X0.addView(eoVar.f37205b3, Math.min(indexOfChild + 1, eoVar.X0.getChildCount()), w7.w5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.b70 b70Var = this.f42536c.f37205b3;
        if (b70Var != null) {
            if (i10 == 0) {
                b70Var.h(false);
                this.f42536c.f37478x0.B0();
                this.f42536c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    b70Var.a(z12);
                }
            } else {
                b70Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.c50 c50Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        eo eoVar = this.f42536c;
        if (isEmpty && !eoVar.Y.s0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        kk kkVar = eoVar.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            eoVar.I1.getAdapter().U(charSequence2, eoVar.Y.getCursorPosition(), eoVar.f37444u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = eoVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            eoVar.J5 = null;
        }
        TLRPC.Chat chat = eoVar.f37241e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            sk skVar = eoVar.Y;
            if (skVar.Y2 && (!skVar.s0() || !eoVar.Y.a2)) {
                if (z10) {
                    eoVar.cb(charSequence2, true);
                } else {
                    eoVar.P6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 22);
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
        cl clVar = eoVar.f37488xa;
        if (clVar != null) {
            ArrayList arrayList = clVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((gz) arrayList.get(i10)).f38189n = true;
            }
        }
        zg.j0 j0Var = zg.j0.B;
        if (j0Var != null) {
            j0Var.f54785l = true;
        }
        zg.j0 j0Var2 = zg.j0.C;
        if (j0Var2 != null) {
            j0Var2.f54785l = true;
        }
        if (!z11) {
            nj njVar = eoVar.f37268g2;
            if ((njVar != null && njVar.getVisibility() == 0) || ((c50Var = eoVar.f37291i2) != null && c50Var.getVisibility() == 0)) {
                nj njVar2 = eoVar.f37268g2;
                if (njVar2 != null) {
                    njVar2.b(true);
                }
                org.telegram.ui.Components.c50 c50Var2 = eoVar.f37291i2;
                if (c50Var2 != null) {
                    c50Var2.b(true);
                    return;
                }
                return;
            }
            vf vfVar = eoVar.Oa;
            if (UserObject.isUserSelf(eoVar.f37253f) || ((chatFull = eoVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && eoVar.R3 == 0)) {
                z13 = true;
            }
            if (!eoVar.f37304j2 && !eoVar.f37279h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !eoVar.Y.s0()) {
                AndroidUtilities.cancelRunOnUIThread(vfVar);
                AndroidUtilities.runOnUIThread(vfVar, 4000L);
            }
        }
    }

    @Override
    public final tn t0() {
        return this.f42536c.f37330l5;
    }

    @Override
    public final void t1() {
        org.telegram.ui.Components.b70 b70Var = this.f42536c.f37205b3;
        if (b70Var != null) {
            b70Var.i();
        }
    }

    @Override
    public final boolean u1() {
        eo eoVar = this.f42536c;
        TLRPC.User user = eoVar.f37253f;
        if (user != null && !UserObject.isUserSelf(user) && !eoVar.f37253f.bot && eoVar.h == null && eoVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void u2() {
        eo eoVar = this.f42536c;
        nj njVar = eoVar.f37268g2;
        if (njVar != null) {
            njVar.b(true);
        }
        org.telegram.ui.Components.c50 c50Var = eoVar.f37291i2;
        if (c50Var != null) {
            c50Var.b(true);
        }
    }

    @Override
    public final int v() {
        return this.f42536c.X0.R();
    }

    @Override
    public final void w1() {
        int i10;
        eo eoVar = this.f42536c;
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
        long j3 = eoVar.T5;
        MessageSuggestionParams messageSuggestionParams = eoVar.f37271g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.c0(parentActivity, i10, j3, messageSuggestionParams, eoVar, eoVar.getResourceProvider(), 0, new gf(eoVar, 4)).show();
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void x1() {
        this.f42536c.K6();
    }

    @Override
    public final void y() {
        boolean z10;
        eo eoVar = this.f42536c;
        if (eoVar.f37491y0 != null) {
            eoVar.f37202b0 = eoVar.Y.getBackgroundTop();
        }
        kk kkVar = eoVar.I1;
        if (kkVar != null) {
            kkVar.getAdapter().f10672f0 = true;
        }
        if (eoVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new gj(this, 7), 30L);
        }
        if (eoVar.Y.u0()) {
            eoVar.Y.g1();
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.Y.X0(true, true, z10);
        if (eoVar.f37367o5 != 0) {
            eoVar.getConnectionsManager().cancelRequest(eoVar.f37367o5, true);
            eoVar.f37367o5 = 0;
        }
        eoVar.Cc(0, true);
        eoVar.lc(false);
        eoVar.ad(false);
    }

    @Override
    public final void y0() {
        org.telegram.ui.ActionBar.k kVar;
        eo eoVar = this.f42536c;
        kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
        if (!kVar.f21060n0) {
            org.telegram.ui.ActionBar.x xVar = eoVar.f37289i0;
            if (xVar != null && !this.f42535b) {
                xVar.f(8);
            }
            if (TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37277h0;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.x xVar2 = eoVar.f37242e0;
                if (xVar2 != null) {
                    xVar2.f(0);
                }
                is isVar = eoVar.f37228d0;
                if (isVar != null) {
                    isVar.b(true);
                }
            }
        }
    }

    @Override
    public final void y1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        eo eoVar = this.f42536c;
        eoVar.Z6();
        sk skVar = eoVar.Y;
        boolean z12 = skVar.f23627b4;
        org.telegram.ui.Components.ig igVar = skVar.U0;
        if (igVar != null && igVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        me.b bVar = eoVar.xc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30532w;
            if (scVar != null && scVar.f30542l) {
                scVar.b();
            }
        } else {
            Activity parentActivity2 = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        kk kkVar = eoVar.I1;
        float f10 = 0.0f;
        if (kkVar != null) {
            ViewPropertyAnimator animate = kkVar.animate();
            if (!z12 && !eoVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.js.f27627f).start();
        }
        org.telegram.ui.Components.uz0 uz0Var = eoVar.f37229d1;
        if (uz0Var != null) {
            uz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = eoVar.f37229d1.animate();
            if (!z12 && !eoVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.js.f27627f).withEndAction(new bi.f(21, this, z12)).start();
        }
    }

    @Override
    public final void z(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        eo eoVar = this.f42536c;
        if (i10 != 0) {
            eoVar.D4 = true;
        }
        eoVar.t9();
        eoVar.w9();
        eoVar.Qc(false, false);
        eoVar.X0.invalidate();
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30532w;
        if (scVar != null && eoVar.Zb != null) {
            scVar.l();
        }
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
        eo eoVar = this.f42536c;
        eoVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37277h0;
        if (u0Var != null && u0Var.getVisibility() != 0) {
            eoVar.f37277h0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = eoVar.f37242e0;
            if (xVar != null) {
                xVar.f(8);
            }
            is isVar = eoVar.f37228d0;
            if (isVar != null) {
                isVar.b(false);
            }
        }
    }
}
