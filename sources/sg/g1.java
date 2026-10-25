package sg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.j5;
import fi.n6;
import fi.q5;
import fi.w7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.la;
public abstract class g1 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final f1 D0;
    public l5 E0;
    public l5 F0;
    public l5 G0;
    public l5 H0;
    public l5 I0;
    public l5 J0;
    public l5 K0;
    public l5 L0;
    public final j5 f48209q0;
    public final y0 f48210r0;
    public final ArrayList f48211s0;
    public final MessageObject.GroupedMessages f48212t0;
    public boolean f48213u0;
    public boolean f48214v0;
    public TextureView f48215w0;
    public boolean f48216x0;
    public int f48217y0;
    public int f48218z0;

    public g1(Context context, PointF pointF, ArrayList arrayList, la laVar, boolean z10, n6 n6Var) {
        super(context, pointF);
        hi.e2 e2Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f48211s0 = new ArrayList();
        this.f48217y0 = 1;
        this.f48218z0 = 1;
        this.A0 = true;
        this.B0 = y6.I.q();
        this.C0 = new SparseIntArray();
        q5 q5Var = (q5) this;
        this.D0 = new f1(q5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i11 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = w7.D(messageObject);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i12, message, messageObject.replyMessageObject, MessagesController.getInstance(i12).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
                messageObject2.setType();
                this.f48211s0.add(messageObject2);
            }
            tL_messageService.f22048id = message2.f22048id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            D = w7.D(messageObject);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i122 = messageObject.currentAccount;
            MessageObject messageObject22 = new MessageObject(i122, message, messageObject.replyMessageObject, MessagesController.getInstance(i122).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
            messageObject22.setType();
            this.f48211s0.add(messageObject22);
        }
        this.f48212t0 = null;
        if (this.f48211s0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f48212t0 = groupedMessages;
            groupedMessages.messages.addAll(this.f48211s0);
            groupedMessages.groupId = ((MessageObject) this.f48211s0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        j5 j5Var = new j5(q5Var, context);
        this.f48209q0 = j5Var;
        addView(j5Var, gb1.g(-1.0f, -1));
        y0 y0Var = new y0(q5Var, context, this.D0);
        this.f48210r0 = y0Var;
        y0Var.setAdapter(new b1(q5Var, context, laVar, n6Var, z10));
        c1 c1Var = new c1(q5Var);
        c1Var.O = new d1(q5Var);
        y0Var.setLayoutManager(c1Var);
        y0Var.i(new Object());
        j5Var.addView(y0Var, gb1.g(-1.0f, -1));
        if (n6Var != null && n6Var.f11306g) {
            ig.o oVar = new ig.o(q5Var, 18);
            hi.e2 e2Var2 = new hi.e2(q5Var, 21);
            n6Var.f11303b = oVar;
            n6Var.f11304c = e2Var2;
            TextureView textureView = n6Var.f11302a;
            if (textureView != null) {
                oVar.run(textureView);
            }
            if (n6Var.d && (e2Var = n6Var.f11304c) != null) {
                e2Var.run(Integer.valueOf(n6Var.e), Integer.valueOf(n6Var.f11305f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.s1 getCell() {
        y0 y0Var = this.f48210r0;
        if (y0Var != null) {
            for (int i10 = 0; i10 < y0Var.getChildCount(); i10++) {
                if (y0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    return (org.telegram.ui.Cells.s1) y0Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.s1 q(q5 q5Var) {
        return q5Var.getCell();
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new hl0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f48214v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: sg.g1.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y3;
        float f7;
        float f10;
        float dp;
        float f11 = 2.1474836E9f;
        float f12 = -2.1474836E9f;
        int i10 = 0;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        while (true) {
            y0 y0Var = this.f48210r0;
            if (i10 < y0Var.getChildCount()) {
                View childAt = y0Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.s1;
                j5 j5Var = this.f48209q0;
                if (z10) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isRoundVideo() && s1Var.getPhotoImage() != null) {
                        f7 = s1Var.getPhotoImage().getImageX() + s1Var.getX() + j5Var.getX();
                        f10 = s1Var.getPhotoImage().getImageX2() + s1Var.getX() + j5Var.getX();
                        dp = s1Var.getPhotoImage().getImageY() + s1Var.getY() + j5Var.getY();
                        y3 = s1Var.getPhotoImage().getImageY2() + s1Var.getY() + j5Var.getY();
                    } else {
                        float x9 = childAt.getX() + j5Var.getX() + s1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f48212t0 == null) {
                            x9 += AndroidUtilities.dp(8.0f);
                        }
                        float x10 = ((childAt.getX() + j5Var.getX()) + s1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y10 = childAt.getY() + j5Var.getY() + s1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + j5Var.getY()) + s1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                        f7 = x9;
                        f10 = x10;
                        dp = AndroidUtilities.dp(2.0f) + y10;
                    }
                    f11 = Math.min(Math.min(f11, f7), f10);
                    f14 = Math.max(Math.max(f14, f7), f10);
                    f13 = Math.min(Math.min(f13, dp), y3);
                    f12 = Math.max(Math.max(f12, dp), y3);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.K()) {
                        float x11 = v0Var.getX() + j5Var.getX() + v0Var.getBoundsLeft();
                        float x12 = v0Var.getX() + j5Var.getX() + v0Var.getBoundsRight();
                        float y11 = v0Var.getY() + j5Var.getY();
                        float y12 = v0Var.getY() + j5Var.getY() + v0Var.getMeasuredHeight();
                        f11 = Math.min(Math.min(f11, x11), x12);
                        f14 = Math.max(Math.max(f14, x11), x12);
                        f13 = Math.min(Math.min(f13, y11), y12);
                        f12 = Math.max(Math.max(f12, y11), y12);
                    }
                }
                i10++;
            } else {
                rectF.set(f11, f13, f14, f12);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
        }
    }

    public final void s() {
        y0 y0Var = this.f48210r0;
        y0Var.invalidate();
        for (int i10 = 0; i10 < y0Var.getChildCount(); i10++) {
            y0Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(fi.w7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: sg.g1.setupTheme(fi.w7):void");
    }
}
