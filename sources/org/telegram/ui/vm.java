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
public final class vm implements org.telegram.ui.Components.pg {
    public int f40729a;
    public boolean f40730b;
    public final fo f40731c;

    public vm(fo foVar) {
        this.f40731c = foVar;
    }

    @Override
    public final void A(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        fo foVar = this.f40731c;
        if (i10 != 0) {
            foVar.D4 = true;
        }
        foVar.t9();
        foVar.w9();
        foVar.Qc(false, false);
        foVar.X0.invalidate();
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
        if (scVar != null && foVar.Zb != null) {
            scVar.l();
        }
    }

    @Override
    public final boolean C0() {
        int i10;
        fo foVar = this.f40731c;
        if ((!foVar.getMessagesController().isForum(foVar.a()) || foVar.f35665h4) && (i10 = foVar.R3) != 9 && foVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(boolean z10) {
        int i10;
        int i11;
        fo foVar = this.f40731c;
        if (z10) {
            Activity parentActivity = foVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            foVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f40731c;
        if (foVar.f35672i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            final org.telegram.ui.ActionBar.y n10 = kVar.n();
            org.telegram.ui.Components.lz0 lz0Var = foVar.f35613d1;
            if (lz0Var != null) {
                lz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.x xVar = foVar.f35672i0;
                if (xVar.f20501o == null) {
                    xVar.f20501o = 1;
                    if (foVar.f35672i0.f20498l != 0) {
                        if ((foVar.R3 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId()) || (foVar.R3 == 0 && ((foVar.f35616d4 == 0 || foVar.f35665h4) && !UserObject.isReplyUser(foVar.f35636f) && !foVar.F9()))) {
                            foVar.f35672i0.f(0);
                            fo.S3(foVar);
                            org.telegram.ui.ActionBar.u0 u0Var = foVar.f35661h0;
                            if (u0Var != null) {
                                u0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar2 = foVar.f35624e0;
                            if (xVar2 != null) {
                                xVar2.f(8);
                            }
                            ls lsVar = foVar.f35612d0;
                            if (lsVar != null) {
                                lsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.es.f24465f);
                            ofFloat.addListener(new um(this, n10, 0));
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
                foVar.A4 = i10;
                foVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.x xVar3 = foVar.f35672i0;
            if (xVar3.f20501o != null) {
                xVar3.f20501o = null;
                if (xVar3.f20498l != 8) {
                    if ((foVar.R3 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId()) || (foVar.R3 == 0 && ((foVar.f35616d4 == 0 || foVar.f35665h4) && !UserObject.isReplyUser(foVar.f35636f) && !foVar.F9()))) {
                        foVar.f35672i0.f(8);
                        if (foVar.Y.i0() && TextUtils.isEmpty(foVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.u0 u0Var2 = foVar.f35661h0;
                            if (u0Var2 != null) {
                                u0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar4 = foVar.f35624e0;
                            if (xVar4 != null) {
                                xVar4.f(0);
                            }
                            ls lsVar2 = foVar.f35612d0;
                            if (lsVar2 != null) {
                                lsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = foVar.f35661h0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.x xVar5 = foVar.f35624e0;
                        if (xVar5 != null) {
                            xVar5.f(8);
                        }
                        ls lsVar3 = foVar.f35612d0;
                        if (lsVar3 != null) {
                            lsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.es.f24465f);
                    ofFloat2.addListener(new um(this, n10, 1));
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
    public final void G0() {
        fo foVar = this.f40731c;
        foVar.f35756o9 = true;
        rm rmVar = foVar.A0;
        if (rmVar != null) {
            rmVar.K(true);
        }
    }

    @Override
    public final void H() {
        this.f40731c.Zb(true, false);
    }

    @Override
    public final void I0() {
        this.f40731c.oa(0, false);
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        hg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        fo foVar = this.f40731c;
        ArrayList arrayList = foVar.f35828u6;
        if (foVar.f35875y0 != null) {
            foVar.f35585b0 = foVar.Y.getBackgroundTop();
        }
        kk kkVar = foVar.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            foVar.I1.getAdapter().f10641w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (foVar.S3 == -1) {
                foVar.S3 = 0;
            }
            if (charSequence != null) {
                foVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = foVar.f35642f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                foVar.S3 += foVar.f35642f5.forwardMessages.messages.size();
            }
            foVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = foVar.f35642f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && foVar.f35642f5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            foVar.f35642f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = foVar.getMessagesController().getPeer(foVar.T5);
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
                org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Components.pc) M.e).f27959a;
                bk0Var.setScaleX(1.8f);
                bk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(foVar.e) && !foVar.f35665h4 && (messageObject = foVar.f35739n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, foVar.f35739n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18968id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                foVar.getMediaDataController().cleanDraft(foVar.T5, j11, false);
            }
        }
        foVar.Db(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        sk skVar = foVar.Y;
        if (skVar != null && skVar.getEmojiView() != null && (f1Var = foVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.f10555a).sendTyping(f1Var.f10556b, f1Var.f10557c, 2, 0);
            }
            f1Var.f10558f = -1L;
        }
        if (!foVar.getMessagesController().premiumFeaturesBlocked() && foVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !foVar.getMessagesController().didPressTranscribeButtonEnough() && !foVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.f41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
        return this.f40731c.ha;
    }

    @Override
    public final void R0() {
        fo foVar = this.f40731c;
        int sendingMessageId = foVar.getSendMessagesHelper().getSendingMessageId(foVar.T5);
        if (sendingMessageId != 0) {
            this.f40731c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void U(float f7, int i10) {
        org.telegram.ui.Components.u60 u60Var = this.f40731c.f35588b3;
        if (u60Var != null) {
            u60Var.b(f7, i10);
        }
    }

    @Override
    public final void W1() {
        org.telegram.ui.Components.lz0 lz0Var = this.f40731c.f35613d1;
        if (lz0Var != null) {
            lz0Var.e();
        }
    }

    @Override
    public final void X() {
        boolean z10;
        fo foVar = this.f40731c;
        sk skVar = foVar.Y;
        boolean z11 = skVar.f22696z3;
        org.telegram.ui.Components.fg fgVar = skVar.U0;
        boolean z12 = false;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = foVar.f35873xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void Y0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        fo foVar = this.f40731c;
        if (foVar.f35602c3.getVisibility() != i11) {
            foVar.f35602c3.setVisibility(i11);
        }
    }

    @Override
    public final void Y1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        fo foVar = this.f40731c;
        if (i10 < currentActionBarHeight) {
            foVar.Z4 = false;
            if (foVar.f35613d1.getVisibility() == 0) {
                foVar.f35613d1.setVisibility(4);
            }
        } else {
            foVar.Z4 = true;
            if (foVar.f35613d1.getVisibility() == 4 && !foVar.isInPreviewMode()) {
                foVar.f35613d1.setVisibility(0);
            }
        }
        foVar.f35576a5 = true ^ foVar.Y.r0();
        if (foVar.Y.r0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f40729a != i12) {
            foVar.f35585b0 = 0;
        }
        this.f40729a = i12;
    }

    @Override
    public final int Z0() {
        return this.f40731c.X0.getHeight();
    }

    @Override
    public final void a0(boolean z10) {
        this.f40731c.Zb(false, z10);
    }

    @Override
    public final TL_stories.StoryItem b1() {
        return null;
    }

    @Override
    public final void b2() {
        xm xmVar;
        int indexOfChild;
        int i10;
        fo foVar = this.f40731c;
        if (foVar.getParentActivity() != null) {
            if ((foVar.e != null || foVar.f35579a8 != null) && foVar.fragmentView != null) {
                org.telegram.ui.Components.v40 v40Var = foVar.f35639f2;
                if ((v40Var == null || v40Var.getVisibility() != 0) && (indexOfChild = (xmVar = foVar.X0).indexOfChild(foVar.S)) != -1) {
                    try {
                        foVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (foVar.f35639f2 == null) {
                        org.telegram.ui.Components.v40 v40Var2 = new org.telegram.ui.Components.v40(9, foVar.getParentActivity(), foVar.f35633ea, false);
                        foVar.f35639f2 = v40Var2;
                        v40Var2.setVisibility(8);
                        xmVar.addView(foVar.f35639f2, indexOfChild + 1, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    TLRPC.UserFull userFull = foVar.f35579a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.v40 v40Var3 = foVar.f35639f2;
                        if (foVar.Y.f22565c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        v40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, foVar.f35636f.first_name)));
                    } else if (!ChatObject.canSendVoice(foVar.e) && !ChatObject.canSendRoundVideo(foVar.e)) {
                        if (!foVar.N6()) {
                            if (foVar.Y.f22565c1) {
                                foVar.f35639f2.setText(ChatObject.getRestrictedErrorText(foVar.e, 21));
                            } else {
                                foVar.f35639f2.setText(ChatObject.getRestrictedErrorText(foVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(foVar.e, 20)) {
                        foVar.f35639f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(foVar.e, 21)) {
                        foVar.f35639f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(foVar.e, 7)) {
                        foVar.f35639f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = foVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                foVar.f35639f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                foVar.f35639f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(foVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = foVar.Y.getSendButton();
                    View audioVideoButtonContainer = foVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    foVar.f35639f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final boolean c1(long j10) {
        return false;
    }

    @Override
    public final void c2(boolean z10) {
        fo foVar = this.f40731c;
        View view = foVar.f35850w2;
        if (view != null) {
            view.setVisibility(8);
        }
        foVar.f35590b5 = !z10;
    }

    @Override
    public final void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.u60 p60Var;
        fo foVar = this.f40731c;
        boolean z12 = false;
        if (foVar.f35588b3 == null && CameraView.isCameraAllowed() && foVar.getParentActivity() != null) {
            Activity parentActivity = foVar.getParentActivity();
            co coVar = foVar.f35633ea;
            int i13 = org.telegram.ui.Components.u60.e;
            si.a aVar = si.e.d;
            aVar.a();
            if (aVar.f45477c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                p60Var = new org.telegram.ui.Components.o60(parentActivity, foVar, coVar);
            } else {
                p60Var = new org.telegram.ui.Components.p60(parentActivity, foVar, coVar, true);
            }
            foVar.f35588b3 = p60Var;
            p60Var.setAnimationCallback(new xe(foVar, 0));
            foVar.f35588b3.setTrimCallback(new xe(foVar, 1));
            foVar.f35588b3.setRecordingUiFrameCallback(new wj(foVar));
            foVar.f35588b3.setClipToPadding(false);
            foVar.f35588b3.g(foVar.J, foVar.f35847w);
            int indexOfChild = foVar.X0.indexOfChild(foVar.S);
            if (indexOfChild < 0) {
                indexOfChild = foVar.X0.getChildCount();
            }
            foVar.X0.addView(foVar.f35588b3, Math.min(indexOfChild + 1, foVar.X0.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.u60 u60Var = this.f40731c.f35588b3;
        if (u60Var != null) {
            if (i10 == 0) {
                u60Var.h(false);
                this.f40731c.f35861x0.B0();
                this.f40731c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    u60Var.a(z12);
                }
            } else {
                u60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean f1() {
        org.telegram.ui.Components.u60 u60Var = this.f40731c.f35588b3;
        if (u60Var != null && u60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h() {
        this.f40731c.zc();
    }

    @Override
    public final void h1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.v40 v40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        fo foVar = this.f40731c;
        if (isEmpty && !foVar.Y.p0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        kk kkVar = foVar.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            foVar.I1.getAdapter().U(charSequence2, foVar.Y.getCursorPosition(), foVar.f35828u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        j9.u uVar = foVar.J5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            foVar.J5 = null;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            sk skVar = foVar.Y;
            if (skVar.Y2 && (!skVar.p0() || !foVar.Y.a2)) {
                if (z10) {
                    foVar.cb(charSequence2, true);
                } else {
                    foVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    foVar.J5 = uVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(uVar2, j10);
                }
            }
        }
        cl clVar = foVar.f35871xa;
        if (clVar != null) {
            ArrayList arrayList = clVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((jz) arrayList.get(i10)).f37183n = true;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f696l = true;
        }
        ah.d1 d1Var2 = ah.d1.C;
        if (d1Var2 != null) {
            d1Var2.f696l = true;
        }
        if (!z11) {
            nj njVar = foVar.f35650g2;
            if ((njVar != null && njVar.getVisibility() == 0) || ((v40Var = foVar.f35674i2) != null && v40Var.getVisibility() == 0)) {
                nj njVar2 = foVar.f35650g2;
                if (njVar2 != null) {
                    njVar2.b(true);
                }
                org.telegram.ui.Components.v40 v40Var2 = foVar.f35674i2;
                if (v40Var2 != null) {
                    v40Var2.b(true);
                    return;
                }
                return;
            }
            wf wfVar = foVar.Oa;
            if (UserObject.isUserSelf(foVar.f35636f) || ((chatFull = foVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && foVar.R3 == 0)) {
                z13 = true;
            }
            if (!foVar.f35686j2 && !foVar.f35663h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !foVar.Y.p0()) {
                AndroidUtilities.cancelRunOnUIThread(wfVar);
                AndroidUtilities.runOnUIThread(wfVar, 4000L);
            }
        }
    }

    @Override
    public final void h2() {
        fo foVar = this.f40731c;
        nj njVar = foVar.f35650g2;
        if (njVar != null) {
            njVar.b(true);
        }
        org.telegram.ui.Components.v40 v40Var = foVar.f35674i2;
        if (v40Var != null) {
            v40Var.b(true);
        }
    }

    @Override
    public final void j1() {
        org.telegram.ui.Components.u60 u60Var = this.f40731c.f35588b3;
        if (u60Var != null) {
            u60Var.i();
        }
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.lz0 lz0Var = this.f40731c.f35613d1;
        if (lz0Var != null) {
            lz0Var.f();
        }
    }

    @Override
    public final boolean k1() {
        fo foVar = this.f40731c;
        TLRPC.User user = foVar.f35636f;
        if (user != null && !UserObject.isUserSelf(user) && !foVar.f35636f.bot && foVar.h == null && foVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.lz0 lz0Var = this.f40731c.f35613d1;
        if (lz0Var != null) {
            lz0Var.f();
        }
    }

    @Override
    public final void m1() {
        int i10;
        fo foVar = this.f40731c;
        Activity parentActivity = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        long j10 = foVar.T5;
        MessageSuggestionParams messageSuggestionParams = foVar.f35653g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new zh.d0(parentActivity, i10, j10, messageSuggestionParams, foVar, foVar.getResourceProvider(), 0, new jf(foVar, 4)).show();
    }

    @Override
    public final void n1() {
        this.f40731c.K6();
    }

    @Override
    public final void o1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        fo foVar = this.f40731c;
        foVar.Z6();
        sk skVar = foVar.Y;
        boolean z12 = skVar.f22696z3;
        org.telegram.ui.Components.fg fgVar = skVar.U0;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = foVar.f35873xc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = foVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
            if (scVar != null && scVar.f28807l) {
                scVar.b();
            }
        } else {
            Activity parentActivity2 = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        kk kkVar = foVar.I1;
        float f10 = 0.0f;
        if (kkVar != null) {
            ViewPropertyAnimator animate = kkVar.animate();
            if (!z12 && !foVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.es.f24465f).start();
        }
        org.telegram.ui.Components.lz0 lz0Var = foVar.f35613d1;
        if (lz0Var != null) {
            lz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = foVar.f35613d1.animate();
            if (!z12 && !foVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.es.f24465f).withEndAction(new ah.t(21, this, z12)).start();
        }
    }

    @Override
    public final boolean p() {
        return this.f40731c.N6();
    }

    @Override
    public final un p0() {
        return this.f40731c.f35713l5;
    }

    @Override
    public final void p1(View view, CharSequence charSequence, boolean z10) {
        fo foVar = this.f40731c;
        foVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = foVar.f35661h0;
        if (u0Var != null && u0Var.getVisibility() != 0) {
            foVar.f35661h0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = foVar.f35624e0;
            if (xVar != null) {
                xVar.f(8);
            }
            ls lsVar = foVar.f35612d0;
            if (lsVar != null) {
                lsVar.b(false);
            }
        }
    }

    @Override
    public final void q2() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f40731c;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (!kVar.f20142n0) {
            org.telegram.ui.ActionBar.u0 u0Var = foVar.f35661h0;
            if (u0Var != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = foVar.f35672i0;
            if (xVar != null && !this.f40730b) {
                xVar.f(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = foVar.f35624e0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            ls lsVar = foVar.f35612d0;
            if (lsVar != null) {
                lsVar.b(false);
            }
        }
    }

    @Override
    public final void r1(CharSequence charSequence) {
        this.f40731c.cb(charSequence, true);
    }

    @Override
    public final boolean s1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f40731c.f35642f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f40731c;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (!kVar.f20142n0) {
            org.telegram.ui.ActionBar.x xVar = foVar.f35672i0;
            if (xVar != null && !this.f40730b) {
                xVar.f(8);
            }
            if (TextUtils.isEmpty(foVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.u0 u0Var = foVar.f35661h0;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.x xVar2 = foVar.f35624e0;
                if (xVar2 != null) {
                    xVar2.f(0);
                }
                ls lsVar = foVar.f35612d0;
                if (lsVar != null) {
                    lsVar.b(true);
                }
            }
        }
    }

    @Override
    public final void u2() {
        fo foVar = this.f40731c;
        bi.w3 w3Var = foVar.J1;
        if (w3Var != null) {
            w3Var.L1(null, 0);
        }
        foVar.ca();
    }

    @Override
    public final int v() {
        return this.f40731c.X0.R();
    }

    @Override
    public final void v1() {
        int i10;
        fo foVar = this.f40731c;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(foVar.T5, (int) foVar.d());
        foVar.f7(true);
    }

    @Override
    public final TLRPC.Peer y() {
        return null;
    }

    @Override
    public final void z() {
        boolean z10;
        fo foVar = this.f40731c;
        if (foVar.f35875y0 != null) {
            foVar.f35585b0 = foVar.Y.getBackgroundTop();
        }
        kk kkVar = foVar.I1;
        if (kkVar != null) {
            kkVar.getAdapter().f10622f0 = true;
        }
        if (foVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new gj(this, 7), 30L);
        }
        if (foVar.Y.r0()) {
            foVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.Y.S0(true, true, z10);
        if (foVar.f35752o5 != 0) {
            foVar.getConnectionsManager().cancelRequest(foVar.f35752o5, true);
            foVar.f35752o5 = 0;
        }
        foVar.Cc(0, true);
        foVar.lc(false);
        foVar.ad(false);
    }

    @Override
    public final void z1() {
        int i10;
        int i11;
        fo foVar = this.f40731c;
        if (!foVar.E9() && (i10 = foVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = foVar.getMessagesController();
            long j10 = foVar.T5;
            long j11 = foVar.f35616d4;
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }
}
