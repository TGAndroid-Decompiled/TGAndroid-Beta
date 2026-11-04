package ug;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import gi.c5;
import gi.f7;
import gi.j8;
import gi.x5;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.x9;
public abstract class t0 extends j {
    public int A0;
    public boolean B0;
    public boolean C0;
    public final SparseIntArray D0;
    public final s0 E0;
    public t4 F0;
    public t4 G0;
    public t4 H0;
    public t4 I0;
    public t4 J0;
    public t4 K0;
    public t4 L0;
    public t4 M0;
    public final ci.t4 f56263r0;
    public final o0 f56264s0;
    public final ArrayList f56265t0;
    public final ui f56266u0;
    public boolean f56267v0;
    public boolean f56268w0;
    public TextureView f56269x0;
    public boolean f56270y0;
    public int f56271z0;

    public t0(Context context, PointF pointF, ArrayList arrayList, x9 x9Var, boolean z10, x5 x5Var) {
        super(context, pointF);
        org.telegram.ui.web.b bVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f56265t0 = new ArrayList();
        this.f56271z0 = 1;
        this.A0 = 1;
        this.B0 = true;
        this.C0 = k6.I.q();
        this.D0 = new SparseIntArray();
        c5 c5Var = (c5) this;
        this.E0 = new s0(c5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zi ziVar = (zi) arrayList.get(i3);
            TLRPC.Message message2 = ziVar.f26868k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = f7.D(ziVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = ziVar.I1;
                zi ziVar2 = new zi(i11, message, ziVar.C, hp.s1(i11).d, hp.s1(ziVar.I1).f22963b, null, null, true, true, 0L, true, z10, false, 0);
                ziVar2.M5();
                this.f56265t0.add(ziVar2);
            }
            tL_messageService.f27022id = message2.f27022id;
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
            D = f7.D(ziVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = ziVar.I1;
            zi ziVar22 = new zi(i112, message, ziVar.C, hp.s1(i112).d, hp.s1(ziVar.I1).f22963b, null, null, true, true, 0L, true, z10, false, 0);
            ziVar22.M5();
            this.f56265t0.add(ziVar22);
        }
        this.f56266u0 = null;
        if (this.f56265t0.size() > 1) {
            ui uiVar = new ui();
            this.f56266u0 = uiVar;
            uiVar.d.addAll(this.f56265t0);
            uiVar.f25699a = ((zi) this.f56265t0.get(0)).d1();
            uiVar.a();
        }
        ci.t4 t4Var = new ci.t4(c5Var, context);
        this.f56263r0 = t4Var;
        addView(t4Var, mf.c(-1.0f, -1));
        o0 o0Var = new o0(c5Var, context, this.E0);
        this.f56264s0 = o0Var;
        o0Var.setAdapter(new r0(c5Var, context, x9Var, x5Var, z10));
        p90 p90Var = new p90(c5Var, 2);
        p90Var.O = new ai.g2(c5Var, 18);
        o0Var.setLayoutManager(p90Var);
        o0Var.i(new ei.l(16));
        t4Var.addView(o0Var, mf.c(-1.0f, -1));
        if (x5Var != null && x5Var.f13843g) {
            j8 j8Var = new j8(c5Var, 25);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(c5Var, 1);
            x5Var.f13839b = j8Var;
            x5Var.f13840c = bVar2;
            TextureView textureView = x5Var.f13838a;
            if (textureView != null) {
                j8Var.a(textureView);
            }
            if (x5Var.d && (bVar = x5Var.f13840c) != null) {
                bVar.a(Integer.valueOf(x5Var.f13841e), Integer.valueOf(x5Var.f13842f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.q1 getCell() {
        o0 o0Var = this.f56264s0;
        if (o0Var != null) {
            for (int i3 = 0; i3 < o0Var.getChildCount(); i3++) {
                if (o0Var.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                    return (org.telegram.ui.Cells.q1) o0Var.getChildAt(i3);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new ni0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f56268w0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: ug.t0.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y9;
        float f10;
        float f11;
        float L;
        float f12 = 2.1474836E9f;
        float f13 = -2.1474836E9f;
        int i3 = 0;
        float f14 = 2.1474836E9f;
        float f15 = -2.1474836E9f;
        while (true) {
            o0 o0Var = this.f56264s0;
            if (i3 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i3);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q1;
                ci.t4 t4Var = this.f56263r0;
                if (z10) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().i4() && q1Var.getPhotoImage() != null) {
                        f10 = q1Var.getX() + t4Var.getX() + q1Var.getPhotoImage().L0;
                        f11 = q1Var.getPhotoImage().y() + q1Var.getX() + t4Var.getX();
                        L = q1Var.getY() + t4Var.getY() + q1Var.getPhotoImage().M0;
                        y9 = q1Var.getPhotoImage().A() + q1Var.getY() + t4Var.getY();
                    } else {
                        float x10 = childAt.getX() + t4Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                        if (this.f56266u0 == null) {
                            x10 += org.telegram.messenger.g0.L(8.0f);
                        }
                        float x11 = ((childAt.getX() + t4Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                        float y10 = childAt.getY() + t4Var.getY() + q1Var.getBackgroundDrawableTop();
                        y9 = ((childAt.getY() + t4Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                        f10 = x10;
                        f11 = x11;
                        L = org.telegram.messenger.g0.L(2.0f) + y10;
                    }
                    f12 = Math.min(Math.min(f12, f10), f11);
                    f15 = Math.max(Math.max(f15, f10), f11);
                    f14 = Math.min(Math.min(f14, L), y9);
                    f13 = Math.max(Math.max(f13, L), y9);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.R()) {
                        float x12 = t0Var.getX() + t4Var.getX() + t0Var.getBoundsLeft();
                        float x13 = t0Var.getX() + t4Var.getX() + t0Var.getBoundsRight();
                        float y11 = t0Var.getY() + t4Var.getY();
                        float y12 = t0Var.getY() + t4Var.getY() + t0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f15 = Math.max(Math.max(f15, x12), x13);
                        f14 = Math.min(Math.min(f14, y11), y12);
                        f13 = Math.max(Math.max(f13, y11), y12);
                    }
                }
                i3++;
            } else {
                rectF.set(f12, f14, f15, f13);
                return org.telegram.messenger.g0.L(az.Y0);
            }
        }
    }

    public final void s() {
        o0 o0Var = this.f56264s0;
        o0Var.invalidate();
        for (int i3 = 0; i3 < o0Var.getChildCount(); i3++) {
            o0Var.getChildAt(i3).invalidate();
        }
    }

    public void setupTheme(gi.f7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: ug.t0.setupTheme(gi.f7):void");
    }
}
