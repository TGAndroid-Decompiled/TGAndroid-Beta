package rg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import di.c6;
import di.c7;
import di.o8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.t5;
import w7.x5;
public abstract class g1 extends k {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final com.google.firebase.messaging.n D0;
    public f5 E0;
    public f5 F0;
    public f5 G0;
    public f5 H0;
    public f5 I0;
    public f5 J0;
    public f5 K0;
    public f5 L0;
    public final t5 f45189q0;
    public final z0 f45190r0;
    public final ArrayList f45191s0;
    public final MessageObject.GroupedMessages f45192t0;
    public boolean f45193u0;
    public boolean f45194v0;
    public TextureView f45195w0;
    public boolean f45196x0;
    public int f45197y0;
    public int f45198z0;

    public g1(Context context, PointF pointF, ArrayList arrayList, ja jaVar, boolean z10, c7 c7Var) {
        super(context, pointF);
        ii.a aVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f45191s0 = new ArrayList();
        this.f45197y0 = 1;
        this.f45198z0 = 1;
        this.A0 = true;
        this.B0 = j6.I.q();
        this.C0 = new SparseIntArray();
        c6 c6Var = (c6) this;
        ?? obj = new Object();
        obj.f6378f = c6Var;
        TextPaint textPaint = new TextPaint();
        obj.f6374a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f6375b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f6376c = textPaint3;
        new Paint(3);
        obj.d = new Paint(3);
        Paint paint = new Paint(3);
        obj.f6377e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.D0 = obj;
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
                D = o8.D(messageObject);
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
                this.f45191s0.add(messageObject2);
            }
            tL_messageService.f19890id = message2.f19890id;
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
            D = o8.D(messageObject);
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
            this.f45191s0.add(messageObject22);
        }
        this.f45192t0 = null;
        if (this.f45191s0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f45192t0 = groupedMessages;
            groupedMessages.messages.addAll(this.f45191s0);
            groupedMessages.groupId = ((MessageObject) this.f45191s0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        t5 t5Var = new t5(c6Var, context);
        this.f45189q0 = t5Var;
        addView(t5Var, x5.c(-1.0f, -1));
        z0 z0Var = new z0(c6Var, context, this.D0);
        this.f45190r0 = z0Var;
        z0Var.setAdapter(new c1(c6Var, context, jaVar, c7Var, z10));
        d1 d1Var = new d1(c6Var);
        d1Var.O = new e1(c6Var);
        z0Var.setLayoutManager(d1Var);
        z0Var.i(new Object());
        t5Var.addView(z0Var, x5.c(-1.0f, -1));
        if (c7Var != null && c7Var.f6994g) {
            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(c6Var, 5);
            ii.a aVar2 = new ii.a(c6Var, 7);
            c7Var.f6990b = b1Var;
            c7Var.f6991c = aVar2;
            TextureView textureView = c7Var.f6989a;
            if (textureView != null) {
                b1Var.run(textureView);
            }
            if (c7Var.d && (aVar = c7Var.f6991c) != null) {
                aVar.run(Integer.valueOf(c7Var.f6992e), Integer.valueOf(c7Var.f6993f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.t1 getCell() {
        z0 z0Var = this.f45190r0;
        if (z0Var != null) {
            for (int i10 = 0; i10 < z0Var.getChildCount(); i10++) {
                if (z0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    return (org.telegram.ui.Cells.t1) z0Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.t1 q(c6 c6Var) {
        return c6Var.getCell();
    }

    @Override
    public final j a() {
        return new r0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new hk0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f45194v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: rg.g1.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y3;
        float f7;
        float f10;
        float dp;
        float f11 = 2.1474836E9f;
        float f12 = 2.1474836E9f;
        float f13 = -2.1474836E9f;
        float f14 = -2.1474836E9f;
        int i10 = 0;
        while (true) {
            z0 z0Var = this.f45190r0;
            if (i10 < z0Var.getChildCount()) {
                View childAt = z0Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.t1;
                t5 t5Var = this.f45189q0;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isRoundVideo() && t1Var.getPhotoImage() != null) {
                        f7 = t1Var.getPhotoImage().getImageX() + t1Var.getX() + t5Var.getX();
                        f10 = t1Var.getPhotoImage().getImageX2() + t1Var.getX() + t5Var.getX();
                        dp = t1Var.getPhotoImage().getImageY() + t1Var.getY() + t5Var.getY();
                        float y10 = t5Var.getY();
                        y3 = t1Var.getPhotoImage().getImageY2() + t1Var.getY() + y10;
                    } else {
                        float x10 = childAt.getX() + t5Var.getX() + t1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f45192t0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + t5Var.getX()) + t1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y11 = childAt.getY() + t5Var.getY() + t1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + t5Var.getY()) + t1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                        f7 = x10;
                        f10 = x11;
                        dp = AndroidUtilities.dp(2.0f) + y11;
                    }
                    f11 = Math.min(Math.min(f11, f7), f10);
                    f13 = Math.max(Math.max(f13, f7), f10);
                    f12 = Math.min(Math.min(f12, dp), y3);
                    f14 = Math.max(Math.max(f14, dp), y3);
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.F0.d()) {
                        float x12 = w0Var.getX() + t5Var.getX() + w0Var.getBoundsLeft();
                        float x13 = w0Var.getX() + t5Var.getX() + w0Var.getBoundsRight();
                        float y12 = w0Var.getY() + t5Var.getY();
                        float y13 = w0Var.getY() + t5Var.getY() + w0Var.getMeasuredHeight();
                        f11 = Math.min(Math.min(f11, x12), x13);
                        f13 = Math.max(Math.max(f13, x12), x13);
                        f12 = Math.min(Math.min(f12, y12), y13);
                        f14 = Math.max(Math.max(f14, y12), y13);
                    }
                }
                i10++;
            } else {
                rectF.set(f11, f12, f13, f14);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
        }
    }

    public final void s() {
        z0 z0Var = this.f45190r0;
        z0Var.invalidate();
        for (int i10 = 0; i10 < z0Var.getChildCount(); i10++) {
            z0Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(di.o8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: rg.g1.setupTheme(di.o8):void");
    }
}
