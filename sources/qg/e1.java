package qg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.b6;
import ci.l8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.t5;
import w7.x5;
public abstract class e1 extends j {
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
    public final t5 f46273q0;
    public final x0 f46274r0;
    public final ArrayList f46275s0;
    public final MessageObject.GroupedMessages f46276t0;
    public boolean f46277u0;
    public boolean f46278v0;
    public TextureView f46279w0;
    public boolean f46280x0;
    public int f46281y0;
    public int f46282z0;

    public e1(Context context, PointF pointF, ArrayList arrayList, ma maVar, boolean z10, a7 a7Var) {
        super(context, pointF);
        hi.a aVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f46275s0 = new ArrayList();
        this.f46281y0 = 1;
        this.f46282z0 = 1;
        this.A0 = true;
        this.B0 = i6.I.q();
        this.C0 = new SparseIntArray();
        b6 b6Var = (b6) this;
        ?? obj = new Object();
        obj.f7958f = b6Var;
        TextPaint textPaint = new TextPaint();
        obj.f7954a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f7955b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f7956c = textPaint3;
        new Paint(3);
        obj.d = new Paint(3);
        Paint paint = new Paint(3);
        obj.f7957e = paint;
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
                D = l8.D(messageObject);
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
                this.f46275s0.add(messageObject2);
            }
            tL_messageService.f20063id = message2.f20063id;
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
            D = l8.D(messageObject);
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
            this.f46275s0.add(messageObject22);
        }
        this.f46276t0 = null;
        if (this.f46275s0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f46276t0 = groupedMessages;
            groupedMessages.messages.addAll(this.f46275s0);
            groupedMessages.groupId = ((MessageObject) this.f46275s0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        t5 t5Var = new t5(b6Var, context);
        this.f46273q0 = t5Var;
        addView(t5Var, x5.d(-1.0f, -1));
        x0 x0Var = new x0(b6Var, context, this.D0);
        this.f46274r0 = x0Var;
        x0Var.setAdapter(new a1(b6Var, context, maVar, a7Var, z10));
        b1 b1Var = new b1(b6Var);
        b1Var.O = new c1(b6Var);
        x0Var.setLayoutManager(b1Var);
        x0Var.i(new Object());
        t5Var.addView(x0Var, x5.d(-1.0f, -1));
        if (a7Var != null && a7Var.f4727g) {
            ii.q1 q1Var = new ii.q1(b6Var, 8);
            hi.a aVar2 = new hi.a(b6Var, 7);
            a7Var.f4723b = q1Var;
            a7Var.f4724c = aVar2;
            TextureView textureView = a7Var.f4722a;
            if (textureView != null) {
                q1Var.run(textureView);
            }
            if (a7Var.d && (aVar = a7Var.f4724c) != null) {
                aVar.run(Integer.valueOf(a7Var.f4725e), Integer.valueOf(a7Var.f4726f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.u1 getCell() {
        x0 x0Var = this.f46274r0;
        if (x0Var != null) {
            for (int i10 = 0; i10 < x0Var.getChildCount(); i10++) {
                if (x0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    return (org.telegram.ui.Cells.u1) x0Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.u1 q(b6 b6Var) {
        return b6Var.getCell();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public nl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new nl0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f46278v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: qg.e1.onMeasure(int, int):void");
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
            x0 x0Var = this.f46274r0;
            if (i10 < x0Var.getChildCount()) {
                View childAt = x0Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.u1;
                t5 t5Var = this.f46273q0;
                if (z10) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isRoundVideo() && u1Var.getPhotoImage() != null) {
                        f7 = u1Var.getPhotoImage().getImageX() + u1Var.getX() + t5Var.getX();
                        f10 = u1Var.getPhotoImage().getImageX2() + u1Var.getX() + t5Var.getX();
                        dp = u1Var.getPhotoImage().getImageY() + u1Var.getY() + t5Var.getY();
                        y3 = u1Var.getPhotoImage().getImageY2() + u1Var.getY() + t5Var.getY();
                    } else {
                        float x10 = childAt.getX() + t5Var.getX() + u1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f46276t0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + t5Var.getX()) + u1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y10 = childAt.getY() + t5Var.getY() + u1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + t5Var.getY()) + u1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                        f7 = x10;
                        f10 = x11;
                        dp = AndroidUtilities.dp(2.0f) + y10;
                    }
                    f11 = Math.min(Math.min(f11, f7), f10);
                    f14 = Math.max(Math.max(f14, f7), f10);
                    f13 = Math.min(Math.min(f13, dp), y3);
                    f12 = Math.max(Math.max(f12, dp), y3);
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.L()) {
                        float x12 = w0Var.getX() + t5Var.getX() + w0Var.getBoundsLeft();
                        float x13 = w0Var.getX() + t5Var.getX() + w0Var.getBoundsRight();
                        float y11 = w0Var.getY() + t5Var.getY();
                        float y12 = w0Var.getY() + t5Var.getY() + w0Var.getMeasuredHeight();
                        f11 = Math.min(Math.min(f11, x12), x13);
                        f14 = Math.max(Math.max(f14, x12), x13);
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
        x0 x0Var = this.f46274r0;
        x0Var.invalidate();
        for (int i10 = 0; i10 < x0Var.getChildCount(); i10++) {
            x0Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(ci.l8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: qg.e1.setupTheme(ci.l8):void");
    }
}
