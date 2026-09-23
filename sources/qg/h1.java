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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.u5;
import w7.x5;
public abstract class h1 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final com.google.firebase.messaging.n D0;
    public e5 E0;
    public e5 F0;
    public e5 G0;
    public e5 H0;
    public e5 I0;
    public e5 J0;
    public e5 K0;
    public e5 L0;
    public final u5 f41322q0;
    public final a1 f41323r0;
    public final ArrayList f41324s0;
    public final MessageObject.GroupedMessages f41325t0;
    public boolean f41326u0;
    public boolean f41327v0;
    public TextureView f41328w0;
    public boolean f41329x0;
    public int f41330y0;
    public int f41331z0;

    public h1(Context context, PointF pointF, ArrayList arrayList, ja jaVar, boolean z10, a7 a7Var) {
        super(context, pointF);
        hi.a aVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f41324s0 = new ArrayList();
        this.f41330y0 = 1;
        this.f41331z0 = 1;
        this.A0 = true;
        this.B0 = h6.I.q();
        this.C0 = new SparseIntArray();
        b6 b6Var = (b6) this;
        ?? obj = new Object();
        obj.f7322f = b6Var;
        TextPaint textPaint = new TextPaint();
        obj.f7319a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f7320b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f7321c = textPaint3;
        new Paint(3);
        obj.d = new Paint(3);
        Paint paint = new Paint(3);
        obj.e = paint;
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
                this.f41324s0.add(messageObject2);
            }
            tL_messageService.f18104id = message2.f18104id;
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
            this.f41324s0.add(messageObject22);
        }
        this.f41325t0 = null;
        if (this.f41324s0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f41325t0 = groupedMessages;
            groupedMessages.messages.addAll(this.f41324s0);
            groupedMessages.groupId = ((MessageObject) this.f41324s0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        u5 u5Var = new u5(b6Var, context);
        this.f41322q0 = u5Var;
        addView(u5Var, x5.c(-1.0f, -1));
        a1 a1Var = new a1(b6Var, context, this.D0);
        this.f41323r0 = a1Var;
        a1Var.setAdapter(new d1(b6Var, context, jaVar, a7Var, z10));
        e1 e1Var = new e1(b6Var);
        e1Var.O = new f1(b6Var);
        a1Var.setLayoutManager(e1Var);
        a1Var.i(new Object());
        u5Var.addView(a1Var, x5.c(-1.0f, -1));
        if (a7Var != null && a7Var.f4349g) {
            ii.q1 q1Var = new ii.q1(b6Var, 8);
            hi.a aVar2 = new hi.a(b6Var, 7);
            a7Var.f4346b = q1Var;
            a7Var.f4347c = aVar2;
            TextureView textureView = a7Var.f4345a;
            if (textureView != null) {
                q1Var.run(textureView);
            }
            if (a7Var.d && (aVar = a7Var.f4347c) != null) {
                aVar.run(Integer.valueOf(a7Var.e), Integer.valueOf(a7Var.f4348f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.t1 getCell() {
        a1 a1Var = this.f41323r0;
        if (a1Var != null) {
            for (int i10 = 0; i10 < a1Var.getChildCount(); i10++) {
                if (a1Var.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    return (org.telegram.ui.Cells.t1) a1Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.t1 q(b6 b6Var) {
        return b6Var.getCell();
    }

    @Override
    public final i a() {
        return new s0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new ik0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f41327v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: qg.h1.onMeasure(int, int):void");
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
            a1 a1Var = this.f41323r0;
            if (i10 < a1Var.getChildCount()) {
                View childAt = a1Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.t1;
                u5 u5Var = this.f41322q0;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isRoundVideo() && t1Var.getPhotoImage() != null) {
                        f7 = t1Var.getPhotoImage().getImageX() + t1Var.getX() + u5Var.getX();
                        f10 = t1Var.getPhotoImage().getImageX2() + t1Var.getX() + u5Var.getX();
                        dp = t1Var.getPhotoImage().getImageY() + t1Var.getY() + u5Var.getY();
                        float y10 = u5Var.getY();
                        y3 = t1Var.getPhotoImage().getImageY2() + t1Var.getY() + y10;
                    } else {
                        float x10 = childAt.getX() + u5Var.getX() + t1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f41325t0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + u5Var.getX()) + t1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y11 = childAt.getY() + u5Var.getY() + t1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + u5Var.getY()) + t1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
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
                        float x12 = w0Var.getX() + u5Var.getX() + w0Var.getBoundsLeft();
                        float x13 = w0Var.getX() + u5Var.getX() + w0Var.getBoundsRight();
                        float y12 = w0Var.getY() + u5Var.getY();
                        float y13 = w0Var.getY() + u5Var.getY() + w0Var.getMeasuredHeight();
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
        a1 a1Var = this.f41323r0;
        a1Var.invalidate();
        for (int i10 = 0; i10 < a1Var.getChildCount(); i10++) {
            a1Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(ci.l8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: qg.h1.setupTheme(ci.l8):void");
    }
}
