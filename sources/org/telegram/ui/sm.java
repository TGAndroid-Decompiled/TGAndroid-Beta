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
public final class sm implements org.telegram.ui.Components.og {
    public int f40471a;
    public boolean f40472b;
    public final co f40473c;

    public sm(co coVar) {
        this.f40473c = coVar;
    }

    @Override
    public final void B0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f40473c;
        if (coVar.f35285i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.my0 my0Var = coVar.f35225d1;
            if (my0Var != null) {
                my0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = coVar.f35285i0;
                if (yVar.f21535o == null) {
                    yVar.f21535o = 1;
                    if (coVar.f35285i0.f21532l != 0) {
                        if ((coVar.R3 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId()) || (coVar.R3 == 0 && ((coVar.f35228d4 == 0 || coVar.f35277h4) && !UserObject.isReplyUser(coVar.f35249f) && !coVar.A9()))) {
                            coVar.f35285i0.f(0);
                            co.J3(coVar);
                            org.telegram.ui.ActionBar.v0 v0Var = coVar.f35273h0;
                            if (v0Var != null) {
                                v0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = coVar.f35238e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            hs hsVar = coVar.f35224d0;
                            if (hsVar != null) {
                                hsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.pr.f29466f);
                            ofFloat.addListener(new rm(this, n10, 0));
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
                coVar.A4 = i10;
                coVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = coVar.f35285i0;
            if (yVar3.f21535o != null) {
                yVar3.f21535o = null;
                if (yVar3.f21532l != 8) {
                    if ((coVar.R3 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId()) || (coVar.R3 == 0 && ((coVar.f35228d4 == 0 || coVar.f35277h4) && !UserObject.isReplyUser(coVar.f35249f) && !coVar.A9()))) {
                        coVar.f35285i0.f(8);
                        if (coVar.Y.k0() && TextUtils.isEmpty(coVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.v0 v0Var2 = coVar.f35273h0;
                            if (v0Var2 != null) {
                                v0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = coVar.f35238e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            hs hsVar2 = coVar.f35224d0;
                            if (hsVar2 != null) {
                                hsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = coVar.f35273h0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = coVar.f35238e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        hs hsVar3 = coVar.f35224d0;
                        if (hsVar3 != null) {
                            hsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.pr.f29466f);
                    ofFloat2.addListener(new rm(this, n10, 1));
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
    public final void C() {
        this.f40473c.Vb(true, false);
    }

    @Override
    public final void D0() {
        co coVar = this.f40473c;
        coVar.o9 = true;
        om omVar = coVar.A0;
        if (omVar != null) {
            omVar.K(true);
        }
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        hg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        co coVar = this.f40473c;
        ArrayList arrayList = coVar.f35440u6;
        if (coVar.f35486y0 != null) {
            coVar.f35198b0 = coVar.Y.getBackgroundTop();
        }
        fk fkVar = coVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            coVar.I1.getAdapter().f11155w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (coVar.S3 == -1) {
                coVar.S3 = 0;
            }
            if (charSequence != null) {
                coVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = coVar.f35255f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                coVar.S3 += coVar.f35255f5.forwardMessages.messages.size();
            }
            coVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = coVar.f35255f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && coVar.f35255f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            coVar.f35255f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = coVar.getMessagesController().getPeer(coVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(coVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Components.nc) M.f29675e).f28723a;
                aj0Var.setScaleX(1.8f);
                aj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(coVar.f35237e) && !coVar.f35277h4 && (messageObject = coVar.f35352n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, coVar.f35352n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f19921id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                coVar.getMediaDataController().cleanDraft(coVar.T5, j10, false);
            }
        }
        coVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        mk mkVar = coVar.Y;
        if (mkVar != null && mkVar.getEmojiView() != null && (g1Var = coVar.Y.getEmojiView().T0) != null) {
            if (g1Var.f11058e) {
                MessagesController.getInstance(g1Var.f11055a).sendTyping(g1Var.f11056b, g1Var.f11057c, 2, 0);
            }
            g1Var.f11059f = -1L;
        }
        if (!coVar.getMessagesController().premiumFeaturesBlocked() && coVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !coVar.getMessagesController().didPressTranscribeButtonEnough() && !coVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.d31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final void G0() {
        this.f40473c.ja(0, false);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return this.f40473c.ha;
    }

    @Override
    public final void J(float f7, int i10) {
        gl glVar = this.f40473c.f35201b3;
        if (glVar != null) {
            glVar.e(f7, i10);
        }
    }

    @Override
    public final void P0() {
        co coVar = this.f40473c;
        int sendingMessageId = coVar.getSendMessagesHelper().getSendingMessageId(coVar.T5);
        if (sendingMessageId != 0) {
            this.f40473c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void U() {
        boolean z10;
        co coVar = this.f40473c;
        mk mkVar = coVar.Y;
        boolean z11 = mkVar.y3;
        org.telegram.ui.Components.eg egVar = mkVar.U0;
        boolean z12 = false;
        if (egVar != null && egVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = coVar.xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void V0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        co coVar = this.f40473c;
        if (coVar.f35215c3.getVisibility() != i11) {
            coVar.f35215c3.setVisibility(i11);
        }
    }

    @Override
    public final void V1() {
        org.telegram.ui.Components.my0 my0Var = this.f40473c.f35225d1;
        if (my0Var != null) {
            my0Var.e();
        }
    }

    @Override
    public final void W(boolean z10) {
        this.f40473c.Vb(false, z10);
    }

    @Override
    public final int W0() {
        return this.f40473c.X0.getHeight();
    }

    @Override
    public final void X1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        co coVar = this.f40473c;
        if (i10 < currentActionBarHeight) {
            coVar.Z4 = false;
            if (coVar.f35225d1.getVisibility() == 0) {
                coVar.f35225d1.setVisibility(4);
            }
        } else {
            coVar.Z4 = true;
            if (coVar.f35225d1.getVisibility() == 4 && !coVar.isInPreviewMode()) {
                coVar.f35225d1.setVisibility(0);
            }
        }
        coVar.f35189a5 = true ^ coVar.Y.t0();
        if (coVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f40471a != i12) {
            coVar.f35198b0 = 0;
        }
        this.f40471a = i12;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public final boolean a1(long j3) {
        return false;
    }

    @Override
    public final void a2() {
        um umVar;
        int indexOfChild;
        int i10;
        co coVar = this.f40473c;
        if (coVar.getParentActivity() != null) {
            if ((coVar.f35237e != null || coVar.f35192a8 != null) && coVar.fragmentView != null) {
                org.telegram.ui.Components.i40 i40Var = coVar.f35252f2;
                if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (umVar = coVar.X0).indexOfChild(coVar.S)) != -1) {
                    try {
                        coVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (coVar.f35252f2 == null) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, coVar.getParentActivity(), coVar.f35247ea, false);
                        coVar.f35252f2 = i40Var2;
                        i40Var2.setVisibility(8);
                        umVar.addView(coVar.f35252f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = coVar.f35192a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.i40 i40Var3 = coVar.f35252f2;
                        if (coVar.Y.f23677c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        i40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, coVar.f35249f.first_name)));
                    } else if (!ChatObject.canSendVoice(coVar.f35237e) && !ChatObject.canSendRoundVideo(coVar.f35237e)) {
                        if (!coVar.K6()) {
                            if (coVar.Y.f23677c1) {
                                coVar.f35252f2.setText(ChatObject.getRestrictedErrorText(coVar.f35237e, 21));
                            } else {
                                coVar.f35252f2.setText(ChatObject.getRestrictedErrorText(coVar.f35237e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(coVar.f35237e, 20)) {
                        coVar.f35252f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(coVar.f35237e, 21)) {
                        coVar.f35252f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(coVar.f35237e, 7)) {
                        coVar.f35252f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = coVar.f35237e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                coVar.f35252f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                coVar.f35252f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(coVar.f35237e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = coVar.Y.getSendButton();
                    View audioVideoButtonContainer = coVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    coVar.f35252f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void b2(boolean z10) {
        co coVar = this.f40473c;
        View view = coVar.f35462w2;
        if (view != null) {
            view.setVisibility(8);
        }
        coVar.f35203b5 = !z10;
    }

    @Override
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        co coVar = this.f40473c;
        boolean z11 = true;
        if (coVar.f35201b3 == null && CameraView.isCameraAllowed() && coVar.getParentActivity() != null) {
            gl glVar = new gl(coVar, coVar.getParentActivity(), coVar, coVar.f35247ea);
            coVar.f35201b3 = glVar;
            glVar.setClipToPadding(false);
            gl glVar2 = coVar.f35201b3;
            bh.b bVar = coVar.J;
            jj jjVar = coVar.f35459w;
            View view = glVar2.R0;
            dh.d c10 = bVar.c(view, jjVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c10);
            int indexOfChild = coVar.X0.indexOfChild(coVar.S);
            if (indexOfChild < 0) {
                indexOfChild = coVar.X0.getChildCount();
            }
            coVar.X0.addView(coVar.f35201b3, Math.min(indexOfChild + 1, coVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        gl glVar3 = coVar.f35201b3;
        if (glVar3 != null) {
            if (i10 == 0) {
                glVar3.l(false);
                coVar.f35473x0.B0();
                coVar.A0.T();
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
    public final boolean d1() {
        gl glVar = this.f40473c.f35201b3;
        if (glVar != null && !glVar.f32134e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        co coVar = this.f40473c;
        if (isEmpty && !coVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        fk fkVar = coVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            coVar.I1.getAdapter().U(charSequence2, coVar.Y.getCursorPosition(), coVar.f35440u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = coVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            coVar.J5 = null;
        }
        TLRPC.Chat chat = coVar.f35237e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            mk mkVar = coVar.Y;
            if (mkVar.X2 && (!mkVar.r0() || !coVar.Y.Z1)) {
                if (z10) {
                    coVar.Ya(charSequence2, true);
                } else {
                    coVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    coVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        xk xkVar = coVar.f35483xa;
        if (xkVar != null) {
            ArrayList arrayList = xkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).f36507n = true;
            }
        }
        ah.e1 e1Var = ah.e1.B;
        if (e1Var != null) {
            e1Var.f515l = true;
        }
        ah.e1 e1Var2 = ah.e1.C;
        if (e1Var2 != null) {
            e1Var2.f515l = true;
        }
        if (!z11) {
            ij ijVar = coVar.f35264g2;
            if ((ijVar != null && ijVar.getVisibility() == 0) || ((i40Var = coVar.f35287i2) != null && i40Var.getVisibility() == 0)) {
                ij ijVar2 = coVar.f35264g2;
                if (ijVar2 != null) {
                    ijVar2.b(true);
                }
                org.telegram.ui.Components.i40 i40Var2 = coVar.f35287i2;
                if (i40Var2 != null) {
                    i40Var2.b(true);
                    return;
                }
                return;
            }
            qf qfVar = coVar.Na;
            if (UserObject.isUserSelf(coVar.f35249f) || ((chatFull = coVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && coVar.R3 == 0)) {
                z13 = true;
            }
            if (!coVar.f35300j2 && !coVar.f35275h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !coVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(qfVar);
                AndroidUtilities.runOnUIThread(qfVar, 4000L);
            }
        }
    }

    @Override
    public final void g2() {
        co coVar = this.f40473c;
        ij ijVar = coVar.f35264g2;
        if (ijVar != null) {
            ijVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = coVar.f35287i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override
    public final void h() {
        this.f40473c.vc();
    }

    @Override
    public final void h1() {
        gl glVar = this.f40473c.f35201b3;
        if (glVar != null) {
            glVar.q();
        }
    }

    @Override
    public final boolean i1() {
        co coVar = this.f40473c;
        TLRPC.User user = coVar.f35249f;
        if (user != null && !UserObject.isUserSelf(user) && !coVar.f35249f.bot && coVar.h == null && coVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.my0 my0Var = this.f40473c.f35225d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override
    public final void k1() {
        int i10;
        co coVar = this.f40473c;
        Activity parentActivity = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        long j3 = coVar.T5;
        MessageSuggestionParams messageSuggestionParams = coVar.f35267g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new zh.e0(parentActivity, i10, j3, messageSuggestionParams, coVar, coVar.getResourceProvider(), 0, new bf(coVar, 3)).show();
    }

    @Override
    public final boolean l() {
        return this.f40473c.K6();
    }

    @Override
    public final void l0() {
        org.telegram.ui.Components.my0 my0Var = this.f40473c.f35225d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override
    public final void l1() {
        this.f40473c.H6();
    }

    @Override
    public final void m1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        co coVar = this.f40473c;
        coVar.W6();
        mk mkVar = coVar.Y;
        boolean z12 = mkVar.y3;
        org.telegram.ui.Components.eg egVar = mkVar.U0;
        if (egVar != null && egVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = coVar.xc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = coVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29671w;
            if (qcVar != null && qcVar.f29681l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        fk fkVar = coVar.I1;
        float f10 = 0.0f;
        if (fkVar != null) {
            ViewPropertyAnimator animate = fkVar.animate();
            if (!z12 && !coVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.pr.f29466f).start();
        }
        org.telegram.ui.Components.my0 my0Var = coVar.f35225d1;
        if (my0Var != null) {
            my0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = coVar.f35225d1.animate();
            if (!z12 && !coVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.pr.f29466f).withEndAction(new ah.u(20, this, z12)).start();
        }
    }

    @Override
    public final void n1(View view, CharSequence charSequence, boolean z10) {
        co coVar = this.f40473c;
        coVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = coVar.f35273h0;
        if (v0Var != null && v0Var.getVisibility() != 0) {
            coVar.f35273h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = coVar.f35238e0;
            if (yVar != null) {
                yVar.f(8);
            }
            hs hsVar = coVar.f35224d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
        }
    }

    @Override
    public final void n2() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f40473c;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.f21103n0) {
            org.telegram.ui.ActionBar.v0 v0Var = coVar.f35273h0;
            if (v0Var != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = coVar.f35285i0;
            if (yVar != null && !this.f40472b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = coVar.f35238e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            hs hsVar = coVar.f35224d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
        }
    }

    @Override
    public final sn o0() {
        return this.f40473c.f35326l5;
    }

    @Override
    public final int p() {
        return this.f40473c.X0.R();
    }

    @Override
    public final void p1(CharSequence charSequence) {
        this.f40473c.Ya(charSequence, true);
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean q1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f40473c.f35255f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f40473c;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.f21103n0) {
            org.telegram.ui.ActionBar.y yVar = coVar.f35285i0;
            if (yVar != null && !this.f40472b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(coVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.v0 v0Var = coVar.f35273h0;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = coVar.f35238e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                hs hsVar = coVar.f35224d0;
                if (hsVar != null) {
                    hsVar.b(true);
                }
            }
        }
    }

    @Override
    public final void r2() {
        co coVar = this.f40473c;
        bi.t3 t3Var = coVar.J1;
        if (t3Var != null) {
            t3Var.I1(null, 0);
        }
        coVar.X9();
    }

    @Override
    public final void t1() {
        int i10;
        co coVar = this.f40473c;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(coVar.T5, (int) coVar.d());
        coVar.c7(true);
    }

    @Override
    public final void v() {
        boolean z10;
        co coVar = this.f40473c;
        if (coVar.f35486y0 != null) {
            coVar.f35198b0 = coVar.Y.getBackgroundTop();
        }
        fk fkVar = coVar.I1;
        if (fkVar != null) {
            fkVar.getAdapter().f11136f0 = true;
        }
        if (coVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new dj(this, 6), 30L);
        }
        if (coVar.Y.t0()) {
            coVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.Y.V0(true, true, z10);
        if (coVar.f35363o5 != 0) {
            coVar.getConnectionsManager().cancelRequest(coVar.f35363o5, true);
            coVar.f35363o5 = 0;
        }
        coVar.yc(0, true);
        coVar.hc(false);
        coVar.Wc(false);
    }

    @Override
    public final void x(float f7) {
        co coVar = this.f40473c;
        if (f7 != 0.0f) {
            coVar.D4 = true;
        }
        coVar.o9();
        coVar.r9();
        coVar.Mc(false, false);
        coVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29671w;
        if (qcVar != null && coVar.Zb != null) {
            qcVar.l();
        }
    }

    @Override
    public final void x1() {
        int i10;
        int i11;
        co coVar = this.f40473c;
        if (!coVar.z9() && (i10 = coVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = coVar.getMessagesController();
            long j3 = coVar.T5;
            long j10 = coVar.f35228d4;
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void z(boolean z10) {
        int i10;
        int i11;
        co coVar = this.f40473c;
        if (z10) {
            Activity parentActivity = coVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            coVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean z0() {
        int i10;
        co coVar = this.f40473c;
        if ((!coVar.getMessagesController().isForum(coVar.a()) || coVar.f35277h4) && (i10 = coVar.R3) != 9 && coVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
