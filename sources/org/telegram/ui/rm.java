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
public final class rm implements org.telegram.ui.Components.mg {
    public int f37258a;
    public boolean f37259b;
    public final bo f37260c;

    public rm(bo boVar) {
        this.f37260c = boVar;
    }

    @Override
    public final void A2() {
        bo boVar = this.f37260c;
        ai.g4 g4Var = boVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        boVar.X9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        bo boVar = this.f37260c;
        if (z10) {
            Activity parentActivity = boVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            boVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = boVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean C0() {
        int i10;
        bo boVar = this.f37260c;
        if ((!boVar.getMessagesController().isForum(boVar.a()) || boVar.f32306h4) && (i10 = boVar.R3) != 9 && boVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        this.f37260c.Vb(true, false);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f37260c;
        if (boVar.f32314i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
            final org.telegram.ui.ActionBar.a0 n10 = kVar.n();
            org.telegram.ui.Components.oy0 oy0Var = boVar.f32254d1;
            if (oy0Var != null) {
                oy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.z zVar = boVar.f32314i0;
                if (zVar.f19753o == null) {
                    zVar.f19753o = 1;
                    if (boVar.f32314i0.f19750l != 0) {
                        if ((boVar.R3 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId()) || (boVar.R3 == 0 && ((boVar.f32257d4 == 0 || boVar.f32306h4) && !UserObject.isReplyUser(boVar.f32277f) && !boVar.A9()))) {
                            boVar.f32314i0.f(0);
                            bo.J3(boVar);
                            org.telegram.ui.ActionBar.w0 w0Var = boVar.f32302h0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar2 = boVar.f32266e0;
                            if (zVar2 != null) {
                                zVar2.f(8);
                            }
                            js jsVar = boVar.f32253d0;
                            if (jsVar != null) {
                                jsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                            ofFloat.addListener(new qm(this, n10, 0));
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
                boVar.A4 = i10;
                boVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.z zVar3 = boVar.f32314i0;
            if (zVar3.f19753o != null) {
                zVar3.f19753o = null;
                if (zVar3.f19750l != 8) {
                    if ((boVar.R3 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId()) || (boVar.R3 == 0 && ((boVar.f32257d4 == 0 || boVar.f32306h4) && !UserObject.isReplyUser(boVar.f32277f) && !boVar.A9()))) {
                        boVar.f32314i0.f(8);
                        if (boVar.Y.k0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = boVar.f32302h0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar4 = boVar.f32266e0;
                            if (zVar4 != null) {
                                zVar4.f(0);
                            }
                            js jsVar2 = boVar.f32253d0;
                            if (jsVar2 != null) {
                                jsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = boVar.f32302h0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.z zVar5 = boVar.f32266e0;
                        if (zVar5 != null) {
                            zVar5.f(8);
                        }
                        js jsVar3 = boVar.f32253d0;
                        if (jsVar3 != null) {
                            jsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                    ofFloat2.addListener(new qm(this, n10, 1));
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
    public final void E1() {
        int i10;
        int i11;
        bo boVar = this.f37260c;
        if (!boVar.z9() && (i10 = boVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = boVar.getMessagesController();
            long j3 = boVar.T5;
            long j10 = boVar.f32257d4;
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void G0() {
        bo boVar = this.f37260c;
        boVar.o9 = true;
        nm nmVar = boVar.A0;
        if (nmVar != null) {
            nmVar.K(true);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        bo boVar = this.f37260c;
        ArrayList arrayList = boVar.f32469u6;
        if (boVar.f32515y0 != null) {
            boVar.f32227b0 = boVar.Y.getBackgroundTop();
        }
        gk gkVar = boVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            boVar.I1.getAdapter().f9841w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (boVar.S3 == -1) {
                boVar.S3 = 0;
            }
            if (charSequence != null) {
                boVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = boVar.f32283f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                boVar.S3 += boVar.f32283f5.forwardMessages.messages.size();
            }
            boVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = boVar.f32283f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && boVar.f32283f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            boVar.f32283f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = boVar.getMessagesController().getPeer(boVar.T5);
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
                org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Components.lc) M.e).f25887a;
                bj0Var.setScaleX(1.8f);
                bj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(boVar.e) && !boVar.f32306h4 && (messageObject = boVar.f32381n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, boVar.f32381n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18173id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                boVar.getMediaDataController().cleanDraft(boVar.T5, j10, false);
            }
        }
        boVar.yb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        nk nkVar = boVar.Y;
        if (nkVar != null && nkVar.getEmojiView() != null && (g1Var = boVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.f9740a).sendTyping(g1Var.f9741b, g1Var.f9742c, 2, 0);
            }
            g1Var.f9743f = -1L;
        }
        if (!boVar.getMessagesController().premiumFeaturesBlocked() && boVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !boVar.getMessagesController().didPressTranscribeButtonEnough() && !boVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.f31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f37260c.ha;
    }

    @Override
    public final void J0() {
        this.f37260c.ja(0, false);
    }

    @Override
    public final void K(float f7, int i10) {
        gl glVar = this.f37260c.f32230b3;
        if (glVar != null) {
            glVar.e(f7, i10);
        }
    }

    @Override
    public final void T0() {
        bo boVar = this.f37260c;
        int sendingMessageId = boVar.getSendMessagesHelper().getSendingMessageId(boVar.T5);
        if (sendingMessageId != 0) {
            this.f37260c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        bo boVar = this.f37260c;
        nk nkVar = boVar.Y;
        boolean z11 = nkVar.y3;
        org.telegram.ui.Components.cg cgVar = nkVar.U0;
        boolean z12 = false;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = boVar.xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void X(boolean z10) {
        this.f37260c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        bo boVar = this.f37260c;
        if (boVar.f32244c3.getVisibility() != i11) {
            boVar.f32244c3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f37260c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.oy0 oy0Var = this.f37260c.f32254d1;
        if (oy0Var != null) {
            oy0Var.e();
        }
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        bo boVar = this.f37260c;
        if (i10 < currentActionBarHeight) {
            boVar.Z4 = false;
            if (boVar.f32254d1.getVisibility() == 0) {
                boVar.f32254d1.setVisibility(4);
            }
        } else {
            boVar.Z4 = true;
            if (boVar.f32254d1.getVisibility() == 4 && !boVar.isInPreviewMode()) {
                boVar.f32254d1.setVisibility(0);
            }
        }
        boVar.f32218a5 = true ^ boVar.Y.t0();
        if (boVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f37258a != i12) {
            boVar.f32227b0 = 0;
        }
        this.f37258a = i12;
    }

    @Override
    public final void g() {
        this.f37260c.vc();
    }

    @Override
    public final boolean i1() {
        gl glVar = this.f37260c.f32230b3;
        if (glVar != null && !glVar.f29538e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        tm tmVar;
        int indexOfChild;
        int i10;
        bo boVar = this.f37260c;
        if (boVar.getParentActivity() != null) {
            if ((boVar.e != null || boVar.f32221a8 != null) && boVar.fragmentView != null) {
                org.telegram.ui.Components.i40 i40Var = boVar.f32280f2;
                if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (tmVar = boVar.X0).indexOfChild(boVar.S)) != -1) {
                    try {
                        boVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (boVar.f32280f2 == null) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, boVar.getParentActivity(), boVar.f32275ea, false);
                        boVar.f32280f2 = i40Var2;
                        i40Var2.setVisibility(8);
                        tmVar.addView(boVar.f32280f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = boVar.f32221a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.i40 i40Var3 = boVar.f32280f2;
                        if (boVar.Y.f21757c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        i40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, boVar.f32277f.first_name)));
                    } else if (!ChatObject.canSendVoice(boVar.e) && !ChatObject.canSendRoundVideo(boVar.e)) {
                        if (!boVar.K6()) {
                            if (boVar.Y.f21757c1) {
                                boVar.f32280f2.setText(ChatObject.getRestrictedErrorText(boVar.e, 21));
                            } else {
                                boVar.f32280f2.setText(ChatObject.getRestrictedErrorText(boVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(boVar.e, 20)) {
                        boVar.f32280f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(boVar.e, 21)) {
                        boVar.f32280f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(boVar.e, 7)) {
                        boVar.f32280f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = boVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                boVar.f32280f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                boVar.f32280f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(boVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = boVar.Y.getSendButton();
                    View audioVideoButtonContainer = boVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    boVar.f32280f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void j2(boolean z10) {
        bo boVar = this.f37260c;
        View view = boVar.f32491w2;
        if (view != null) {
            view.setVisibility(8);
        }
        boVar.f32232b5 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        bo boVar = this.f37260c;
        boolean z11 = true;
        if (boVar.f32230b3 == null && CameraView.isCameraAllowed() && boVar.getParentActivity() != null) {
            gl glVar = new gl(boVar, boVar.getParentActivity(), boVar, boVar.f32275ea);
            boVar.f32230b3 = glVar;
            glVar.setClipToPadding(false);
            gl glVar2 = boVar.f32230b3;
            ah.c cVar = boVar.J;
            kj kjVar = boVar.f32488w;
            View view = glVar2.R0;
            ch.d c10 = cVar.c(view, kjVar, false);
            c10.p(AndroidUtilities.dp(6.0f));
            c10.q(AndroidUtilities.dp(21.0f));
            view.setBackground(c10);
            int indexOfChild = boVar.X0.indexOfChild(boVar.S);
            if (indexOfChild < 0) {
                indexOfChild = boVar.X0.getChildCount();
            }
            boVar.X0.addView(boVar.f32230b3, Math.min(indexOfChild + 1, boVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        gl glVar3 = boVar.f32230b3;
        if (glVar3 != null) {
            if (i10 == 0) {
                glVar3.l(false);
                boVar.f32502x0.C0();
                boVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z11 = false;
                    }
                    glVar3.d(z11);
                }
            } else {
                glVar3.k(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.oy0 oy0Var = this.f37260c.f32254d1;
        if (oy0Var != null) {
            oy0Var.f();
        }
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        bo boVar = this.f37260c;
        if (isEmpty && !boVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        gk gkVar = boVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            boVar.I1.getAdapter().U(charSequence2, boVar.Y.getCursorPosition(), boVar.f32469u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = boVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            boVar.J5 = null;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            nk nkVar = boVar.Y;
            if (nkVar.X2 && (!nkVar.r0() || !boVar.Y.Z1)) {
                if (z10) {
                    boVar.Ya(charSequence2, true);
                } else {
                    boVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    boVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        yk ykVar = boVar.f32512xa;
        if (ykVar != null) {
            ArrayList arrayList = ykVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((hz) arrayList.get(i10)).f34392n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49098l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.f49098l = true;
        }
        if (!z11) {
            jj jjVar = boVar.f32292g2;
            if ((jjVar != null && jjVar.getVisibility() == 0) || ((i40Var = boVar.f32316i2) != null && i40Var.getVisibility() == 0)) {
                jj jjVar2 = boVar.f32292g2;
                if (jjVar2 != null) {
                    jjVar2.b(true);
                }
                org.telegram.ui.Components.i40 i40Var2 = boVar.f32316i2;
                if (i40Var2 != null) {
                    i40Var2.b(true);
                    return;
                }
                return;
            }
            sf sfVar = boVar.Na;
            if (UserObject.isUserSelf(boVar.f32277f) || ((chatFull = boVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && boVar.R3 == 0)) {
                z13 = true;
            }
            if (!boVar.f32329j2 && !boVar.f32304h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !boVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(sfVar);
                AndroidUtilities.runOnUIThread(sfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f37260c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.oy0 oy0Var = this.f37260c.f32254d1;
        if (oy0Var != null) {
            oy0Var.f();
        }
    }

    @Override
    public final void n1() {
        gl glVar = this.f37260c.f32230b3;
        if (glVar != null) {
            glVar.q();
        }
    }

    @Override
    public final boolean o1() {
        bo boVar = this.f37260c;
        TLRPC.User user = boVar.f32277f;
        if (user != null && !UserObject.isUserSelf(user) && !boVar.f32277f.bot && boVar.h == null && boVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        bo boVar = this.f37260c;
        jj jjVar = boVar.f32292g2;
        if (jjVar != null) {
            jjVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = boVar.f32316i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override
    public final rn p0() {
        return this.f37260c.f32355l5;
    }

    @Override
    public final int q() {
        return this.f37260c.X0.R();
    }

    @Override
    public final void q1() {
        int i10;
        bo boVar = this.f37260c;
        Activity parentActivity = boVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        long j3 = boVar.T5;
        MessageSuggestionParams messageSuggestionParams = boVar.f32295g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, boVar, boVar.getResourceProvider(), 0, new cf(boVar, 3)).show();
    }

    @Override
    public final void r1() {
        this.f37260c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f37260c;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (!kVar.f19304n0) {
            org.telegram.ui.ActionBar.z zVar = boVar.f32314i0;
            if (zVar != null && !this.f37259b) {
                zVar.f(8);
            }
            if (TextUtils.isEmpty(boVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = boVar.f32302h0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.z zVar2 = boVar.f32266e0;
                if (zVar2 != null) {
                    zVar2.f(0);
                }
                js jsVar = boVar.f32253d0;
                if (jsVar != null) {
                    jsVar.b(true);
                }
            }
        }
    }

    @Override
    public final void s1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        bo boVar = this.f37260c;
        boVar.W6();
        nk nkVar = boVar.Y;
        boolean z12 = nkVar.y3;
        org.telegram.ui.Components.cg cgVar = nkVar.U0;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = boVar.xc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = boVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
            if (ocVar != null && ocVar.f26704l) {
                ocVar.b();
            }
        } else {
            Activity parentActivity2 = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        gk gkVar = boVar.I1;
        float f10 = 0.0f;
        if (gkVar != null) {
            ViewPropertyAnimator animate = gkVar.animate();
            if (!z12 && !boVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
        }
        org.telegram.ui.Components.oy0 oy0Var = boVar.f32254d1;
        if (oy0Var != null) {
            oy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = boVar.f32254d1.animate();
            if (!z12 && !boVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.qr.f27380f).withEndAction(new bi.f(19, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        bo boVar = this.f37260c;
        boVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = boVar.f32302h0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            boVar.f32302h0.setVisibility(0);
            org.telegram.ui.ActionBar.z zVar = boVar.f32266e0;
            if (zVar != null) {
                zVar.f(8);
            }
            js jsVar = boVar.f32253d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f37260c.Ya(charSequence, true);
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f37260c.f32283f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f37260c;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (!kVar.f19304n0) {
            org.telegram.ui.ActionBar.w0 w0Var = boVar.f32302h0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar = boVar.f32314i0;
            if (zVar != null && !this.f37259b) {
                zVar.f(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = boVar.f32266e0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            js jsVar = boVar.f32253d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        bo boVar = this.f37260c;
        if (boVar.f32515y0 != null) {
            boVar.f32227b0 = boVar.Y.getBackgroundTop();
        }
        gk gkVar = boVar.I1;
        if (gkVar != null) {
            gkVar.getAdapter().f9822f0 = true;
        }
        if (boVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new ej(this, 6), 30L);
        }
        if (boVar.Y.t0()) {
            boVar.Y.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.Y.U0(true, true, z10);
        if (boVar.f32392o5 != 0) {
            boVar.getConnectionsManager().cancelRequest(boVar.f32392o5, true);
            boVar.f32392o5 = 0;
        }
        boVar.yc(0, true);
        boVar.hc(false);
        boVar.Wc(false);
    }

    @Override
    public final void y(float f7) {
        bo boVar = this.f37260c;
        if (f7 != 0.0f) {
            boVar.D4 = true;
        }
        boVar.o9();
        boVar.r9();
        boVar.Mc(false, false);
        boVar.X0.invalidate();
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
        if (ocVar != null && boVar.Zb != null) {
            ocVar.l();
        }
    }

    @Override
    public final void z1() {
        int i10;
        bo boVar = this.f37260c;
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(boVar.T5, (int) boVar.d());
        boVar.c7(true);
    }
}
