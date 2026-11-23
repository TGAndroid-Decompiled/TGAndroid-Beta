package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.w2;
import c8.ma;
import di.n4;
import hi.a5;
import hi.c7;
import hi.s6;
import hi.u5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.ia0;
public abstract class v0 extends j {
    public int A0;
    public boolean B0;
    public boolean C0;
    public final SparseIntArray D0;
    public final u0 E0;
    public u4 F0;
    public u4 G0;
    public u4 H0;
    public u4 I0;
    public u4 J0;
    public u4 K0;
    public u4 L0;
    public u4 M0;
    public final n4 f58200r0;
    public final q0 f58201s0;
    public final ArrayList f58202t0;
    public final bj f58203u0;
    public boolean f58204v0;
    public boolean f58205w0;
    public TextureView f58206x0;
    public boolean f58207y0;
    public int f58208z0;

    public v0(Context context, PointF pointF, ArrayList arrayList, ca caVar, boolean z10, u5 u5Var) {
        super(context, pointF);
        org.telegram.ui.web.b bVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f58202t0 = new ArrayList();
        this.f58208z0 = 1;
        this.A0 = 1;
        this.B0 = true;
        this.C0 = m6.I.q();
        this.D0 = new SparseIntArray();
        a5 a5Var = (a5) this;
        this.E0 = new u0(a5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            gj gjVar = (gj) arrayList.get(i7);
            TLRPC.Message message2 = gjVar.f24213k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = c7.D(gjVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = gjVar.K1;
                gj gjVar2 = new gj(i11, message, gjVar.C, np.u1(i11).d, np.u1(gjVar.K1).f25802b, null, null, true, true, 0L, true, z10, false, 0);
                gjVar2.L5();
                this.f58202t0.add(gjVar2);
            }
            tL_messageService.f28455id = message2.f28455id;
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
            D = c7.D(gjVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = gjVar.K1;
            gj gjVar22 = new gj(i112, message, gjVar.C, np.u1(i112).d, np.u1(gjVar.K1).f25802b, null, null, true, true, 0L, true, z10, false, 0);
            gjVar22.L5();
            this.f58202t0.add(gjVar22);
        }
        this.f58203u0 = null;
        if (this.f58202t0.size() > 1) {
            bj bjVar = new bj();
            this.f58203u0 = bjVar;
            bjVar.d.addAll(this.f58202t0);
            bjVar.f23110a = ((gj) this.f58202t0.get(0)).c1();
            bjVar.a();
        }
        n4 n4Var = new n4(a5Var, context);
        this.f58200r0 = n4Var;
        addView(n4Var, ma.c(-1.0f, -1));
        q0 q0Var = new q0(a5Var, context, this.E0);
        this.f58201s0 = q0Var;
        q0Var.setAdapter(new t0(a5Var, context, caVar, u5Var, z10));
        ia0 ia0Var = new ia0(a5Var, 2);
        ia0Var.O = new w2(a5Var, 18);
        q0Var.setLayoutManager(ia0Var);
        q0Var.i(new fi.k(16));
        n4Var.addView(q0Var, ma.c(-1.0f, -1));
        if (u5Var != null && u5Var.f15546g) {
            s6 s6Var = new s6(a5Var, 28);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(a5Var, 1);
            u5Var.f15542b = s6Var;
            u5Var.f15543c = bVar2;
            TextureView textureView = u5Var.f15541a;
            if (textureView != null) {
                s6Var.a(textureView);
            }
            if (u5Var.d && (bVar = u5Var.f15543c) != null) {
                bVar.a(Integer.valueOf(u5Var.f15544e), Integer.valueOf(u5Var.f15545f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.r1 getCell() {
        q0 q0Var = this.f58201s0;
        if (q0Var != null) {
            for (int i7 = 0; i7 < q0Var.getChildCount(); i7++) {
                if (q0Var.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                    return (org.telegram.ui.Cells.r1) q0Var.getChildAt(i7);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final i a() {
        return new k0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new aj0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f58205w0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.v0.onMeasure(int, int):void");
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
            q0 q0Var = this.f58201s0;
            if (i7 < q0Var.getChildCount()) {
                View childAt = q0Var.getChildAt(i7);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.r1;
                n4 n4Var = this.f58200r0;
                if (z10) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject() != null && r1Var.getMessageObject().h4() && r1Var.getPhotoImage() != null) {
                        f10 = r1Var.getX() + n4Var.getX() + r1Var.getPhotoImage().L0;
                        f11 = r1Var.getPhotoImage().y() + r1Var.getX() + n4Var.getX();
                        L = r1Var.getY() + n4Var.getY() + r1Var.getPhotoImage().M0;
                        y10 = r1Var.getPhotoImage().A() + r1Var.getY() + n4Var.getY();
                    } else {
                        float x10 = childAt.getX() + n4Var.getX() + r1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                        if (this.f58203u0 == null) {
                            x10 += org.telegram.messenger.g0.L(8.0f);
                        }
                        float x11 = ((childAt.getX() + n4Var.getX()) + r1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                        float y11 = childAt.getY() + n4Var.getY() + r1Var.getBackgroundDrawableTop();
                        y10 = ((childAt.getY() + n4Var.getY()) + r1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                        f10 = x10;
                        f11 = x11;
                        L = org.telegram.messenger.g0.L(2.0f) + y11;
                    }
                    f12 = Math.min(Math.min(f12, f10), f11);
                    f15 = Math.max(Math.max(f15, f10), f11);
                    f14 = Math.min(Math.min(f14, L), y10);
                    f13 = Math.max(Math.max(f13, L), y10);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.S()) {
                        float x12 = v0Var.getX() + n4Var.getX() + v0Var.getBoundsLeft();
                        float x13 = v0Var.getX() + n4Var.getX() + v0Var.getBoundsRight();
                        float y12 = v0Var.getY() + n4Var.getY();
                        float y13 = v0Var.getY() + n4Var.getY() + v0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f15 = Math.max(Math.max(f15, x12), x13);
                        f14 = Math.min(Math.min(f14, y12), y13);
                        f13 = Math.max(Math.max(f13, y12), y13);
                    }
                }
                i7++;
            } else {
                rectF.set(f12, f14, f15, f13);
                return org.telegram.messenger.g0.L(cz.Y0);
            }
        }
    }

    public final void s() {
        q0 q0Var = this.f58201s0;
        q0Var.invalidate();
        for (int i7 = 0; i7 < q0Var.getChildCount(); i7++) {
            q0Var.getChildAt(i7).invalidate();
        }
    }

    public void setupTheme(hi.c7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: tg.v0.setupTheme(hi.c7):void");
    }
}
