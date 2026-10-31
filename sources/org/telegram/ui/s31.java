package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s31 extends org.telegram.ui.Components.ha {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final ag.d3 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final k31 U1;
    public final m31 V1;
    public final r31 W1;
    public final r31 X1;
    public final r31 Y1;
    public final vh.d Z1;
    public org.telegram.ui.Components.p51 a2;
    public Context f41368b2;

    public s31(Context context, TLRPC.Chat chat, TLRPC.User user, ag.d3 d3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2, context, p6Var, true);
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.P0 = true;
        this.P1 = chat;
        this.Q1 = user;
        this.S1 = user;
        this.R1 = d3Var;
        org.telegram.messenger.d20.i(this.f21583a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, d02, N, null, p6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232734);
        int i11 = org.telegram.ui.ActionBar.t6.P5;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.U1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.R5, p6Var);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, i11, p6Var);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(46.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-org.telegram.messenger.i0.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new ha(this, 11));
        editTextBoldCursor.addTextChangedListener(new l31(this));
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131745774, null));
        frameLayout2.addView((View) editTextBoldCursor, w7.b6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f21586b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f7 = this.f21615t0 / org.telegram.messenger.i0.f16025p;
        viewGroup.addView(frameLayout, max, w7.b6.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setImageDrawable(new org.telegram.ui.Components.bi0(2131624317, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
        frameLayout3.addView(g9Var, w7.b6.e(130, 130, 17));
        r31 r31Var = new r31(this.f21583a, chat.f19793id, new TLRPC.TL_channelParticipantsAdmins());
        r31Var.e.add(new wv0(this, 19));
        this.W1 = r31Var;
        r31 r31Var2 = new r31(this.f21583a, chat.f19793id, new TLRPC.TL_channelParticipantsRecent());
        r31Var2.e.add(new wv0(this, 19));
        this.X1 = r31Var2;
        r31 r31Var3 = new r31(this.f21583a, chat.f19793id, new TLRPC.TL_channelParticipantsSearch());
        r31Var3.e.add(new wv0(this, 19));
        this.Y1 = r31Var3;
        org.telegram.ui.Components.tk0 tk0Var = this.f26666k1;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(68.0f));
        this.f26666k1.setClipToPadding(false);
        this.f26666k1.setOnItemClickListener(new kz0(this, 3));
        n31 n31Var = new n31(this);
        n31Var.f47927m = false;
        n31Var.C = false;
        n31Var.o(org.telegram.ui.Components.gr.h);
        n31Var.n(350L);
        this.f26666k1.setItemAnimator(n31Var);
        this.f26666k1.addOnLayoutChangeListener(new o31(this));
        this.f26666k1.j(new p31(this));
        this.f21586b.addView(new q31(this, getContext()), w7.b6.e(-1, 68, 87));
        vh.d dVar = new vh.d(getContext(), p6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21187r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.f21586b;
        float f10 = (this.f21615t0 / org.telegram.messenger.i0.f16025p) + 10.0f;
        viewGroup2.addView(dVar, w7.b6.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new a01(this, 5));
        org.telegram.ui.Components.p51 p51Var = this.a2;
        if (p51Var != null) {
            p51Var.O(false);
        }
        r31Var.b();
        r31Var2.b();
    }

    public static void d1(s31 s31Var) {
        org.telegram.ui.Components.tk0 tk0Var = s31Var.f26666k1;
        float f7 = -org.telegram.messenger.i0.L(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        s31Var.T1.setTranslationY(f7);
    }

    @Override
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(tk0Var, getContext(), this.f21583a, 0, false, new z4(this, 23), this.I0);
        this.a2 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131754210, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.W1.a();
        this.X1.a();
        this.Y1.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f41368b2 = getContext();
        }
        if (this.f41368b2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.w3.T(this.P1)) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.vp.r1(this.f21583a).T(this.f41368b2, this.P1.f19793id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 16), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.w3.T(this.P1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.P1;
                tL_inputChannel.channel_id = chat.f19793id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = org.telegram.messenger.vp.r1(this.f21583a).p1(user);
            ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_channels_editCreator, new mg.z(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void f1(boolean z10) {
        int i10;
        int L;
        String str;
        if (org.telegram.messenger.w3.V(this.P1)) {
            i10 = 2131749013;
        } else {
            i10 = 2131749004;
        }
        float L2 = org.telegram.messenger.i0.L(32.0f);
        vh.d dVar = this.Z1;
        if (dVar.getWidth() > 0) {
            L = dVar.getWidth();
        } else {
            L = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.i0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.cd.L0(i10, null)));
        TLObject tLObject = this.S1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.h20.k((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        dVar.i(org.telegram.messenger.cd.a0(null, null, i10, TextUtils.ellipsize(str, dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            vh.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21187r7, this.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
