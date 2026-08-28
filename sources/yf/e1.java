package yf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import java.util.ArrayList;
import kh.a8;
import kh.i9;
import kh.q6;
import kh.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.wj0;
public abstract class e1 extends j {
    public d5 A0;
    public d5 B0;
    public d5 C0;
    public d5 D0;
    public d5 E0;
    public d5 F0;
    public d5 G0;
    public d5 H0;
    public final bh.g m0;
    public final x0 f49793n0;
    public final ArrayList f49794o0;
    public final MessageObject.GroupedMessages f49795p0;
    public boolean f49796q0;
    public boolean f49797r0;
    public TextureView f49798s0;
    public boolean f49799t0;
    public int f49800u0;
    public int f49801v0;
    public boolean f49802w0;
    public boolean f49803x0;
    public final SparseIntArray f49804y0;
    public final com.google.firebase.messaging.m f49805z0;

    public e1(Context context, PointF pointF, ArrayList arrayList, ba baVar, boolean z10, q6 q6Var) {
        super(context, pointF);
        w0 w0Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f49794o0 = new ArrayList();
        this.f49800u0 = 1;
        this.f49801v0 = 1;
        this.f49802w0 = true;
        this.f49803x0 = f6.I.q();
        this.f49804y0 = new SparseIntArray();
        s5 s5Var = (s5) this;
        ?? obj = new Object();
        obj.f4164f = s5Var;
        TextPaint textPaint = new TextPaint();
        obj.f4160a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f4161b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f4162c = textPaint3;
        new Paint(3);
        obj.d = new Paint(3);
        Paint paint = new Paint(3);
        obj.f4163e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.f49805z0 = obj;
        setRotation(0.0f);
        setScale(1.0f);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = a8.D(messageObject);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i11, message, messageObject.replyMessageObject, MessagesController.getInstance(i11).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
                messageObject2.setType();
                this.f49794o0.add(messageObject2);
            }
            tL_messageService.f22401id = message2.f22401id;
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
            D = a8.D(messageObject);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = messageObject.currentAccount;
            MessageObject messageObject22 = new MessageObject(i112, message, messageObject.replyMessageObject, MessagesController.getInstance(i112).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
            messageObject22.setType();
            this.f49794o0.add(messageObject22);
        }
        this.f49795p0 = null;
        if (this.f49794o0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f49795p0 = groupedMessages;
            groupedMessages.messages.addAll(this.f49794o0);
            groupedMessages.groupId = ((MessageObject) this.f49794o0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        bh.g gVar = new bh.g(s5Var, context);
        this.m0 = gVar;
        addView(gVar, e6.c(-1.0f, -1));
        x0 x0Var = new x0(s5Var, context, this.f49805z0);
        this.f49793n0 = x0Var;
        x0Var.setAdapter(new a1(s5Var, context, baVar, q6Var, z10));
        b1 b1Var = new b1(s5Var);
        b1Var.O = new c1(s5Var);
        x0Var.setLayoutManager(b1Var);
        x0Var.i(new Object());
        gVar.addView(x0Var, e6.c(-1.0f, -1));
        if (q6Var != null && q6Var.f15884g) {
            i9 i9Var = new i9(s5Var, 22);
            w0 w0Var2 = new w0(0, s5Var);
            q6Var.f15880b = i9Var;
            q6Var.f15881c = w0Var2;
            TextureView textureView = q6Var.f15879a;
            if (textureView != null) {
                i9Var.run(textureView);
            }
            if (q6Var.d && (w0Var = q6Var.f15881c) != null) {
                w0Var.run(Integer.valueOf(q6Var.f15882e), Integer.valueOf(q6Var.f15883f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.t1 getCell() {
        x0 x0Var = this.f49793n0;
        if (x0Var != null) {
            for (int i9 = 0; i9 < x0Var.getChildCount(); i9++) {
                if (x0Var.getChildAt(i9) instanceof org.telegram.ui.Cells.t1) {
                    return (org.telegram.ui.Cells.t1) x0Var.getChildAt(i9);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.t1 q(s5 s5Var) {
        return s5Var.getCell();
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new wj0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f49797r0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e1.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y10;
        float f10;
        float f11;
        float dp;
        float f12 = 2.1474836E9f;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        float f15 = -2.1474836E9f;
        int i9 = 0;
        while (true) {
            x0 x0Var = this.f49793n0;
            if (i9 < x0Var.getChildCount()) {
                View childAt = x0Var.getChildAt(i9);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.t1;
                bh.g gVar = this.m0;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isRoundVideo() && t1Var.getPhotoImage() != null) {
                        f10 = t1Var.getPhotoImage().getImageX() + t1Var.getX() + gVar.getX();
                        f11 = t1Var.getPhotoImage().getImageX2() + t1Var.getX() + gVar.getX();
                        dp = t1Var.getPhotoImage().getImageY() + t1Var.getY() + gVar.getY();
                        float y11 = gVar.getY();
                        y10 = t1Var.getPhotoImage().getImageY2() + t1Var.getY() + y11;
                    } else {
                        float x10 = childAt.getX() + gVar.getX() + t1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f49795p0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + gVar.getX()) + t1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y12 = childAt.getY() + gVar.getY() + t1Var.getBackgroundDrawableTop();
                        y10 = ((childAt.getY() + gVar.getY()) + t1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                        f10 = x10;
                        f11 = x11;
                        dp = AndroidUtilities.dp(2.0f) + y12;
                    }
                    f12 = Math.min(Math.min(f12, f10), f11);
                    f14 = Math.max(Math.max(f14, f10), f11);
                    f13 = Math.min(Math.min(f13, dp), y10);
                    f15 = Math.max(Math.max(f15, dp), y10);
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.B0.d()) {
                        float x12 = w0Var.getX() + gVar.getX() + w0Var.getBoundsLeft();
                        float x13 = w0Var.getX() + gVar.getX() + w0Var.getBoundsRight();
                        float y13 = w0Var.getY() + gVar.getY();
                        float y14 = w0Var.getY() + gVar.getY() + w0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f14 = Math.max(Math.max(f14, x12), x13);
                        f13 = Math.min(Math.min(f13, y13), y14);
                        f15 = Math.max(Math.max(f15, y13), y14);
                    }
                }
                i9++;
            } else {
                rectF.set(f12, f13, f14, f15);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
        }
    }

    public final void s() {
        x0 x0Var = this.f49793n0;
        x0Var.invalidate();
        for (int i9 = 0; i9 < x0Var.getChildCount(); i9++) {
            x0Var.getChildAt(i9).invalidate();
        }
    }

    public void setupTheme(kh.a8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e1.setupTheme(kh.a8):void");
    }
}
