package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.m5;
import c8.ha;
import fi.e5;
import fi.e7;
import fi.x5;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.y9;
public abstract class u0 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final t0 D0;
    public t4 E0;
    public t4 F0;
    public t4 G0;
    public t4 H0;
    public t4 I0;
    public t4 J0;
    public t4 K0;
    public t4 L0;
    public final m5 f55845q0;
    public final p0 f55846r0;
    public final ArrayList f55847s0;
    public final dj f55848t0;
    public boolean f55849u0;
    public boolean f55850v0;
    public TextureView f55851w0;
    public boolean f55852x0;
    public int f55853y0;
    public int f55854z0;

    public u0(Context context, PointF pointF, ArrayList arrayList, y9 y9Var, boolean z9, x5 x5Var) {
        super(context, pointF);
        hi.u1 u1Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f55847s0 = new ArrayList();
        this.f55853y0 = 1;
        this.f55854z0 = 1;
        this.A0 = true;
        this.B0 = k6.I.q();
        this.C0 = new SparseIntArray();
        e5 e5Var = (e5) this;
        this.D0 = new t0(e5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ij ijVar = (ij) arrayList.get(i7);
            TLRPC.Message message2 = ijVar.f23237k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = e7.D(ijVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = ijVar.I1;
                ij ijVar2 = new ij(i11, message, ijVar.C, qp.s1(i11).d, qp.s1(ijVar.I1).f24723b, null, null, true, true, 0L, true, z9, false, 0);
                ijVar2.M5();
                this.f55847s0.add(ijVar2);
            }
            tL_messageService.f26973id = message2.f26973id;
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
            D = e7.D(ijVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = ijVar.I1;
            ij ijVar22 = new ij(i112, message, ijVar.C, qp.s1(i112).d, qp.s1(ijVar.I1).f24723b, null, null, true, true, 0L, true, z9, false, 0);
            ijVar22.M5();
            this.f55847s0.add(ijVar22);
        }
        this.f55848t0 = null;
        if (this.f55847s0.size() > 1) {
            dj djVar = new dj();
            this.f55848t0 = djVar;
            djVar.d.addAll(this.f55847s0);
            djVar.f22002a = ((ij) this.f55847s0.get(0)).d1();
            djVar.a();
        }
        m5 m5Var = new m5(e5Var, context);
        this.f55845q0 = m5Var;
        addView(m5Var, ha.c(-1.0f, -1));
        p0 p0Var = new p0(e5Var, context, this.D0);
        this.f55846r0 = p0Var;
        p0Var.setAdapter(new s0(e5Var, context, y9Var, x5Var, z9));
        u90 u90Var = new u90(e5Var, 2);
        u90Var.O = new ai.l(e5Var, 15);
        p0Var.setLayoutManager(u90Var);
        p0Var.i(new di.k(16));
        m5Var.addView(p0Var, ha.c(-1.0f, -1));
        if (x5Var != null && x5Var.f13085g) {
            ii.c cVar = new ii.c(e5Var, 22);
            hi.u1 u1Var2 = new hi.u1(e5Var, 21);
            x5Var.f13081b = cVar;
            x5Var.f13082c = u1Var2;
            TextureView textureView = x5Var.f13080a;
            if (textureView != null) {
                cVar.a(textureView);
            }
            if (x5Var.d && (u1Var = x5Var.f13082c) != null) {
                u1Var.a(Integer.valueOf(x5Var.f13083e), Integer.valueOf(x5Var.f13084f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.q1 getCell() {
        p0 p0Var = this.f55846r0;
        if (p0Var != null) {
            for (int i7 = 0; i7 < p0Var.getChildCount(); i7++) {
                if (p0Var.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                    return (org.telegram.ui.Cells.q1) p0Var.getChildAt(i7);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new ki0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f55850v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.u0.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y10;
        float f10;
        float f11;
        float L;
        float f12 = 2.1474836E9f;
        float f13 = -2.1474836E9f;
        int i7 = 0;
        float f14 = 2.1474836E9f;
        float f15 = -2.1474836E9f;
        while (true) {
            p0 p0Var = this.f55846r0;
            if (i7 < p0Var.getChildCount()) {
                View childAt = p0Var.getChildAt(i7);
                boolean z9 = childAt instanceof org.telegram.ui.Cells.q1;
                m5 m5Var = this.f55845q0;
                if (z9) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().i4() && q1Var.getPhotoImage() != null) {
                        f10 = q1Var.getX() + m5Var.getX() + q1Var.getPhotoImage().K0;
                        f11 = q1Var.getPhotoImage().y() + q1Var.getX() + m5Var.getX();
                        L = q1Var.getY() + m5Var.getY() + q1Var.getPhotoImage().L0;
                        y10 = q1Var.getPhotoImage().A() + q1Var.getY() + m5Var.getY();
                    } else {
                        float x10 = childAt.getX() + m5Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                        if (this.f55848t0 == null) {
                            x10 += org.telegram.messenger.g0.L(8.0f);
                        }
                        float x11 = ((childAt.getX() + m5Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                        float y11 = childAt.getY() + m5Var.getY() + q1Var.getBackgroundDrawableTop();
                        y10 = ((childAt.getY() + m5Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                        f10 = x10;
                        f11 = x11;
                        L = org.telegram.messenger.g0.L(2.0f) + y11;
                    }
                    f12 = Math.min(Math.min(f12, f10), f11);
                    f15 = Math.max(Math.max(f15, f10), f11);
                    f14 = Math.min(Math.min(f14, L), y10);
                    f13 = Math.max(Math.max(f13, L), y10);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.R()) {
                        float x12 = t0Var.getX() + m5Var.getX() + t0Var.getBoundsLeft();
                        float x13 = t0Var.getX() + m5Var.getX() + t0Var.getBoundsRight();
                        float y12 = t0Var.getY() + m5Var.getY();
                        float y13 = t0Var.getY() + m5Var.getY() + t0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f15 = Math.max(Math.max(f15, x12), x13);
                        f14 = Math.min(Math.min(f14, y12), y13);
                        f13 = Math.max(Math.max(f13, y12), y13);
                    }
                }
                i7++;
            } else {
                rectF.set(f12, f14, f15, f13);
                return org.telegram.messenger.g0.L(iz.Y0);
            }
        }
    }

    public final void s() {
        p0 p0Var = this.f55846r0;
        p0Var.invalidate();
        for (int i7 = 0; i7 < p0Var.getChildCount(); i7++) {
            p0Var.getChildAt(i7).invalidate();
        }
    }

    public void setupTheme(fi.e7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: tg.u0.setupTheme(fi.e7):void");
    }
}
