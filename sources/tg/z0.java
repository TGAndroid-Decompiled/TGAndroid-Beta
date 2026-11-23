package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.y2;
import c8.na;
import di.n4;
import hi.c7;
import hi.e6;
import hi.l5;
import hi.x7;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa0;
public abstract class z0 extends n {
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final SparseIntArray E0;
    public final y0 F0;
    public u4 G0;
    public u4 H0;
    public u4 I0;
    public u4 J0;
    public u4 K0;
    public u4 L0;
    public u4 M0;
    public u4 N0;
    public final n4 f58312s0;
    public final u0 f58313t0;
    public final ArrayList f58314u0;
    public final aj f58315v0;
    public boolean f58316w0;
    public boolean f58317x0;
    public TextureView f58318y0;
    public boolean f58319z0;

    public z0(Context context, PointF pointF, ArrayList arrayList, ba baVar, boolean z10, e6 e6Var) {
        super(context, pointF);
        org.telegram.ui.web.b bVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f58314u0 = new ArrayList();
        this.A0 = 1;
        this.B0 = 1;
        this.C0 = true;
        this.D0 = n6.I.q();
        this.E0 = new SparseIntArray();
        l5 l5Var = (l5) this;
        this.F0 = new y0(l5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            fj fjVar = (fj) arrayList.get(i7);
            TLRPC.Message message2 = fjVar.f24073k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = x7.D(fjVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = fjVar.K1;
                fj fjVar2 = new fj(i11, message, fjVar.C, mp.u1(i11).d, mp.u1(fjVar.K1).f25698b, null, null, true, true, 0L, true, z10, false, 0);
                fjVar2.L5();
                this.f58314u0.add(fjVar2);
            }
            tL_messageService.f28513id = message2.f28513id;
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
            D = x7.D(fjVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = fjVar.K1;
            fj fjVar22 = new fj(i112, message, fjVar.C, mp.u1(i112).d, mp.u1(fjVar.K1).f25698b, null, null, true, true, 0L, true, z10, false, 0);
            fjVar22.L5();
            this.f58314u0.add(fjVar22);
        }
        this.f58315v0 = null;
        if (this.f58314u0.size() > 1) {
            aj ajVar = new aj();
            this.f58315v0 = ajVar;
            ajVar.d.addAll(this.f58314u0);
            ajVar.f23006a = ((fj) this.f58314u0.get(0)).c1();
            ajVar.a();
        }
        n4 n4Var = new n4(l5Var, context);
        this.f58312s0 = n4Var;
        addView(n4Var, na.c(-1.0f, -1));
        u0 u0Var = new u0(l5Var, context, this.F0);
        this.f58313t0 = u0Var;
        u0Var.setAdapter(new x0(l5Var, context, baVar, e6Var, z10));
        fa0 fa0Var = new fa0(l5Var, 2);
        fa0Var.O = new y2(l5Var, 18);
        u0Var.setLayoutManager(fa0Var);
        u0Var.i(new fi.k(16));
        n4Var.addView(u0Var, na.c(-1.0f, -1));
        if (e6Var != null && e6Var.f14374g) {
            c7 c7Var = new c7(l5Var, 28);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(l5Var, 1);
            e6Var.f14370b = c7Var;
            e6Var.f14371c = bVar2;
            TextureView textureView = e6Var.f14369a;
            if (textureView != null) {
                c7Var.a(textureView);
            }
            if (e6Var.d && (bVar = e6Var.f14371c) != null) {
                bVar.a(Integer.valueOf(e6Var.f14372e), Integer.valueOf(e6Var.f14373f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.r1 getCell() {
        u0 u0Var = this.f58313t0;
        if (u0Var != null) {
            for (int i7 = 0; i7 < u0Var.getChildCount(); i7++) {
                if (u0Var.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                    return (org.telegram.ui.Cells.r1) u0Var.getChildAt(i7);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final m a() {
        return new o0(this, getContext());
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
        if (this.f58317x0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.z0.onMeasure(int, int):void");
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
            u0 u0Var = this.f58313t0;
            if (i7 < u0Var.getChildCount()) {
                View childAt = u0Var.getChildAt(i7);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.r1;
                n4 n4Var = this.f58312s0;
                if (z10) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject() != null && r1Var.getMessageObject().h4() && r1Var.getPhotoImage() != null) {
                        f10 = r1Var.getX() + n4Var.getX() + r1Var.getPhotoImage().L0;
                        f11 = r1Var.getPhotoImage().z() + r1Var.getX() + n4Var.getX();
                        L = r1Var.getY() + n4Var.getY() + r1Var.getPhotoImage().M0;
                        y10 = r1Var.getPhotoImage().B() + r1Var.getY() + n4Var.getY();
                    } else {
                        float x10 = childAt.getX() + n4Var.getX() + r1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                        if (this.f58315v0 == null) {
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
                    if (v0Var.V()) {
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
                return org.telegram.messenger.g0.L(bz.Y0);
            }
        }
    }

    public final void s() {
        u0 u0Var = this.f58313t0;
        u0Var.invalidate();
        for (int i7 = 0; i7 < u0Var.getChildCount(); i7++) {
            u0Var.getChildAt(i7).invalidate();
        }
    }

    public void setupTheme(hi.x7 r8) {
        throw new UnsupportedOperationException("Method not decompiled: tg.z0.setupTheme(hi.x7):void");
    }
}
