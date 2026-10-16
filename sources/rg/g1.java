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
import di.a6;
import di.k8;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.la;
import org.telegram.ui.x5;
import w7.z5;
public abstract class g1 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final com.google.firebase.messaging.m D0;
    public d5 E0;
    public d5 F0;
    public d5 G0;
    public d5 H0;
    public d5 I0;
    public d5 J0;
    public d5 K0;
    public d5 L0;
    public final x5 f44017q0;
    public final z0 f44018r0;
    public final ArrayList f44019s0;
    public final MessageObject.GroupedMessages f44020t0;
    public boolean f44021u0;
    public boolean f44022v0;
    public TextureView f44023w0;
    public boolean f44024x0;
    public int f44025y0;
    public int f44026z0;

    public g1(Context context, PointF pointF, ArrayList arrayList, la laVar, boolean z10, z6 z6Var) {
        super(context, pointF);
        ii.a aVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f44019s0 = new ArrayList();
        this.f44025y0 = 1;
        this.f44026z0 = 1;
        this.A0 = true;
        this.B0 = g6.I.q();
        this.C0 = new SparseIntArray();
        a6 a6Var = (a6) this;
        ?? obj = new Object();
        obj.f6197f = a6Var;
        TextPaint textPaint = new TextPaint();
        obj.f6194a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f6195b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f6196c = textPaint3;
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
                D = k8.D(messageObject);
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
                this.f44019s0.add(messageObject2);
            }
            tL_messageService.f18937id = message2.f18937id;
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
            D = k8.D(messageObject);
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
            this.f44019s0.add(messageObject22);
        }
        this.f44020t0 = null;
        if (this.f44019s0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f44020t0 = groupedMessages;
            groupedMessages.messages.addAll(this.f44019s0);
            groupedMessages.groupId = ((MessageObject) this.f44019s0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        x5 x5Var = new x5(a6Var, context);
        this.f44017q0 = x5Var;
        addView(x5Var, z5.d(-1.0f, -1));
        z0 z0Var = new z0(a6Var, context, this.D0);
        this.f44018r0 = z0Var;
        z0Var.setAdapter(new c1(a6Var, context, laVar, z6Var, z10));
        d1 d1Var = new d1(a6Var);
        d1Var.O = new e1(a6Var);
        z0Var.setLayoutManager(d1Var);
        z0Var.i(new Object());
        x5Var.addView(z0Var, z5.d(-1.0f, -1));
        if (z6Var != null && z6Var.f8189g) {
            ji.p1 p1Var = new ji.p1(a6Var, 8);
            ii.a aVar2 = new ii.a(a6Var, 7);
            z6Var.f8186b = p1Var;
            z6Var.f8187c = aVar2;
            TextureView textureView = z6Var.f8185a;
            if (textureView != null) {
                p1Var.run(textureView);
            }
            if (z6Var.d && (aVar = z6Var.f8187c) != null) {
                aVar.run(Integer.valueOf(z6Var.e), Integer.valueOf(z6Var.f8188f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.u1 getCell() {
        z0 z0Var = this.f44018r0;
        if (z0Var != null) {
            for (int i10 = 0; i10 < z0Var.getChildCount(); i10++) {
                if (z0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    return (org.telegram.ui.Cells.u1) z0Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.u1 q(a6 a6Var) {
        return a6Var.getCell();
    }

    @Override
    public final i a() {
        return new r0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new il0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f44022v0) {
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
        float f12 = -2.1474836E9f;
        int i10 = 0;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        while (true) {
            z0 z0Var = this.f44018r0;
            if (i10 < z0Var.getChildCount()) {
                View childAt = z0Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.u1;
                x5 x5Var = this.f44017q0;
                if (z10) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isRoundVideo() && u1Var.getPhotoImage() != null) {
                        f7 = u1Var.getPhotoImage().getImageX() + u1Var.getX() + x5Var.getX();
                        f10 = u1Var.getPhotoImage().getImageX2() + u1Var.getX() + x5Var.getX();
                        dp = u1Var.getPhotoImage().getImageY() + u1Var.getY() + x5Var.getY();
                        y3 = u1Var.getPhotoImage().getImageY2() + u1Var.getY() + x5Var.getY();
                    } else {
                        float x10 = childAt.getX() + x5Var.getX() + u1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f44020t0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + x5Var.getX()) + u1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y10 = childAt.getY() + x5Var.getY() + u1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + x5Var.getY()) + u1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
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
                        float x12 = w0Var.getX() + x5Var.getX() + w0Var.getBoundsLeft();
                        float x13 = w0Var.getX() + x5Var.getX() + w0Var.getBoundsRight();
                        float y11 = w0Var.getY() + x5Var.getY();
                        float y12 = w0Var.getY() + x5Var.getY() + w0Var.getMeasuredHeight();
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
        z0 z0Var = this.f44018r0;
        z0Var.invalidate();
        for (int i10 = 0; i10 < z0Var.getChildCount(); i10++) {
            z0Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(di.k8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: rg.g1.setupTheme(di.k8):void");
    }
}
