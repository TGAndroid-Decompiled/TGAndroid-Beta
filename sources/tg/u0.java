package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import c8.ja;
import di.k4;
import hi.c5;
import hi.d7;
import hi.g7;
import hi.w5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.v90;
public abstract class u0 extends j {
    public int A0;
    public boolean B0;
    public boolean C0;
    public final SparseIntArray D0;
    public final t0 E0;
    public r4 F0;
    public r4 G0;
    public r4 H0;
    public r4 I0;
    public r4 J0;
    public r4 K0;
    public r4 L0;
    public r4 M0;
    public final k4 f57570r0;
    public final p0 f57571s0;
    public final ArrayList f57572t0;
    public final bj f57573u0;
    public boolean f57574v0;
    public boolean f57575w0;
    public TextureView f57576x0;
    public boolean f57577y0;
    public int f57578z0;

    public u0(Context context, PointF pointF, ArrayList arrayList, u9 u9Var, boolean z10, w5 w5Var) {
        super(context, pointF);
        org.telegram.ui.web.b bVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f57572t0 = new ArrayList();
        this.f57578z0 = 1;
        this.A0 = 1;
        this.B0 = true;
        this.C0 = j6.I.q();
        this.D0 = new SparseIntArray();
        c5 c5Var = (c5) this;
        this.E0 = new t0(c5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            gj gjVar = (gj) arrayList.get(i7);
            TLRPC.Message message2 = gjVar.f23817k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = d7.D(gjVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = gjVar.K1;
                gj gjVar2 = new gj(i11, message, gjVar.C, np.s1(i11).d, np.s1(gjVar.K1).f25234b, null, null, true, true, 0L, true, z10, false, 0);
                gjVar2.L5();
                this.f57572t0.add(gjVar2);
            }
            tL_messageService.f28072id = message2.f28072id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.flags2 = message2.flags2;
            tL_messageService.rich_message = message2.rich_message;
            tL_messageService.translatedRichMessage = message2.translatedRichMessage;
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
            D = d7.D(gjVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = gjVar.K1;
            gj gjVar22 = new gj(i112, message, gjVar.C, np.s1(i112).d, np.s1(gjVar.K1).f25234b, null, null, true, true, 0L, true, z10, false, 0);
            gjVar22.L5();
            this.f57572t0.add(gjVar22);
        }
        this.f57573u0 = null;
        if (this.f57572t0.size() > 1) {
            bj bjVar = new bj();
            this.f57573u0 = bjVar;
            bjVar.d.addAll(this.f57572t0);
            bjVar.f22707a = ((gj) this.f57572t0.get(0)).c1();
            bjVar.a();
        }
        k4 k4Var = new k4(c5Var, context);
        this.f57570r0 = k4Var;
        addView(k4Var, ja.c(-1.0f, -1));
        p0 p0Var = new p0(c5Var, context, this.E0);
        this.f57571s0 = p0Var;
        p0Var.setAdapter(new s0(c5Var, context, u9Var, w5Var, z10));
        v90 v90Var = new v90(c5Var, 2);
        v90Var.O = new bi.y1(c5Var, 18);
        p0Var.setLayoutManager(v90Var);
        p0Var.i(new fi.k(16));
        k4Var.addView(p0Var, ja.c(-1.0f, -1));
        if (w5Var != null && w5Var.f15295g) {
            g7 g7Var = new g7(c5Var, 27);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(c5Var, 1);
            w5Var.f15291b = g7Var;
            w5Var.f15292c = bVar2;
            TextureView textureView = w5Var.f15290a;
            if (textureView != null) {
                g7Var.a(textureView);
            }
            if (w5Var.d && (bVar = w5Var.f15292c) != null) {
                bVar.a(Integer.valueOf(w5Var.f15293e), Integer.valueOf(w5Var.f15294f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.q1 getCell() {
        p0 p0Var = this.f57571s0;
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
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new pi0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f57575w0) {
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
            p0 p0Var = this.f57571s0;
            if (i7 < p0Var.getChildCount()) {
                View childAt = p0Var.getChildAt(i7);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q1;
                k4 k4Var = this.f57570r0;
                if (z10) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().h4() && q1Var.getPhotoImage() != null) {
                        f10 = q1Var.getX() + k4Var.getX() + q1Var.getPhotoImage().L0;
                        f11 = q1Var.getPhotoImage().y() + q1Var.getX() + k4Var.getX();
                        L = q1Var.getY() + k4Var.getY() + q1Var.getPhotoImage().M0;
                        y10 = q1Var.getPhotoImage().A() + q1Var.getY() + k4Var.getY();
                    } else {
                        float x10 = childAt.getX() + k4Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                        if (this.f57573u0 == null) {
                            x10 += org.telegram.messenger.g0.L(8.0f);
                        }
                        float x11 = ((childAt.getX() + k4Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                        float y11 = childAt.getY() + k4Var.getY() + q1Var.getBackgroundDrawableTop();
                        y10 = ((childAt.getY() + k4Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
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
                    if (t0Var.U()) {
                        float x12 = t0Var.getX() + k4Var.getX() + t0Var.getBoundsLeft();
                        float x13 = t0Var.getX() + k4Var.getX() + t0Var.getBoundsRight();
                        float y12 = t0Var.getY() + k4Var.getY();
                        float y13 = t0Var.getY() + k4Var.getY() + t0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f15 = Math.max(Math.max(f15, x12), x13);
                        f14 = Math.min(Math.min(f14, y12), y13);
                        f13 = Math.max(Math.max(f13, y12), y13);
                    }
                }
                i7++;
            } else {
                rectF.set(f12, f14, f15, f13);
                return org.telegram.messenger.g0.L(gz.Y0);
            }
        }
    }

    public final void s() {
        p0 p0Var = this.f57571s0;
        p0Var.invalidate();
        for (int i7 = 0; i7 < p0Var.getChildCount(); i7++) {
            p0Var.getChildAt(i7).invalidate();
        }
    }

    public void setupTheme(hi.d7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: tg.u0.setupTheme(hi.d7):void");
    }
}
