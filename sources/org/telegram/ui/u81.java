package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u81 extends org.telegram.ui.ActionBar.g2 {
    public bn E;
    public int F;
    public h2.f G;
    public long f52583a;
    public long f52584b;
    public long f52585c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor f52586e;
    public t81 f52587f;
    public org.telegram.ui.Components.p9[] h;
    public String f52588n;
    public boolean f52589r;
    public org.telegram.ui.Components.lq f52590s;
    public org.telegram.ui.Components.mk0 f52591w;
    public TLRPC.TL_forumTopic f52592x;
    public qg.a f52593y;

    public static int c0(u81 u81Var) {
        return u81Var.currentAccount;
    }

    public static u81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? g2Var = new org.telegram.ui.ActionBar.g2(j11);
        g2Var.h = new org.telegram.ui.Components.p9[2];
        g2Var.f52588n = "";
        g2Var.G = new h2.f((int[]) null);
        return g2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.p9[] p9VarArr = this.h;
        if (this.f52592x != null) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131751204, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748058, null));
        }
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new q81(this));
        if (this.f52592x == null) {
            this.actionBar.s().e(1, org.telegram.messenger.gd.N0(2131751741, null));
        } else {
            this.actionBar.s().a(2, 2131231245);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.cu0 cu0Var = new org.telegram.ui.Components.cu0(context, null);
        this.fragmentView = cu0Var;
        org.telegram.ui.ActionBar.u6.h(i7, cu0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        cu0Var.addView(linearLayout);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f52592x;
        if (tL_forumTopic != null && tL_forumTopic.f28544id == 1) {
            o4Var.setText(org.telegram.messenger.gd.N0(2131751737, null));
        } else {
            o4Var.setText(org.telegram.messenger.gd.N0(2131751689, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52586e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.gd.N0(2131751101, null));
        org.telegram.ui.ActionBar.u6.A(this.f52586e, org.telegram.ui.ActionBar.n6.Me, getResourceProvider());
        org.telegram.ui.ActionBar.u6.U(this.f52586e, org.telegram.ui.ActionBar.n6.Le, getResourceProvider());
        this.f52586e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f52586e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f52586e.getPaddingBottom());
        this.f52586e.setBackground(null);
        this.f52586e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f52586e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f52586e, c8.na.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f52586e.addTextChangedListener(new m0(this, 17));
        s81 s81Var = new s81(context, 0);
        s81Var.setOnClickListener(new View.OnClickListener(this) {
            public final u81 f50607b;

            {
                this.f50607b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                u81 u81Var = this.f50607b;
                switch (i10) {
                    case 0:
                        if (u81Var.f52584b == 0 && u81Var.f52592x == null) {
                            qg.a aVar = u81Var.f52593y;
                            int i11 = aVar.f56260e + 1;
                            aVar.f56260e = i11;
                            int[] iArr = qg.a.f56255k;
                            if (i11 > 5) {
                                aVar.f56260e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f56260e];
                            aVar.f56263i = i12;
                            aVar.h = (int[]) qg.a.f56256l.get(i12);
                            if (org.telegram.ui.ActionBar.n6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            u81Var.F = iArr[aVar.f56260e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = u81Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9VarArr[i10] = p9Var;
            s81Var.addView(p9Var, c8.na.e(28, 28, 17));
        }
        frameLayout.addView(s81Var, c8.na.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(o4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
        Drawable f02 = org.telegram.ui.ActionBar.n6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.u6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.na.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f52592x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f28544id == 1) {
            ImageView e10 = org.telegram.messenger.m10.e(context, 2131232149);
            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29717rd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            s81Var.addView(e10, c8.na.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.na.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.n6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
            org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.u6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.gd.N0(2131751203, null), !this.f52592x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.ActionBar.u6.Q(q8Var2, org.telegram.ui.ActionBar.n6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.u6.M(i11), org.telegram.ui.ActionBar.u6.M(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final u81 f50607b;

                {
                    this.f50607b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    u81 u81Var = this.f50607b;
                    switch (i102) {
                        case 0:
                            if (u81Var.f52584b == 0 && u81Var.f52592x == null) {
                                qg.a aVar = u81Var.f52593y;
                                int i112 = aVar.f56260e + 1;
                                aVar.f56260e = i112;
                                int[] iArr = qg.a.f56255k;
                                if (i112 > 5) {
                                    aVar.f56260e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f56260e];
                                aVar.f56263i = i122;
                                aVar.h = (int[]) qg.a.f56256l.get(i122);
                                if (org.telegram.ui.ActionBar.n6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                u81Var.F = iArr[aVar.f56260e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.q8 q8Var3 = u81Var.d;
                            q8Var3.setChecked(true ^ q8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.na.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.na.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.gd.N0(2131751202, null));
            frameLayout2.addView(z8Var, c8.na.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            t81 t81Var = new t81(this, this, getParentActivity());
            this.f52587f = t81Var;
            t81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f52587f.setClipChildren(false);
            frameLayout2.addView(this.f52587f, c8.na.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.lq e11 = qg.c.e(this.F, "");
            this.f52593y = (qg.a) e11.f37195a;
            this.f52591w = new org.telegram.ui.Components.mk0(context);
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(e11, this.f52591w, 0, 0);
            lqVar.f37204x = true;
            this.f52587f.setForumIconDrawable(lqVar);
            this.f52590s = lqVar;
            org.telegram.ui.Components.mk0 mk0Var = this.f52591w;
            org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
            ArrayList arrayList = mk0Var.f37471n;
            if (!arrayList.contains(p9Var2)) {
                arrayList.add(p9Var2);
            }
            org.telegram.ui.Components.mk0 mk0Var2 = this.f52591w;
            org.telegram.ui.Components.p9 p9Var3 = p9VarArr[1];
            ArrayList arrayList2 = mk0Var2.f37471n;
            if (!arrayList2.contains(p9Var3)) {
                arrayList2.add(p9Var3);
            }
            p9VarArr[0].setImageDrawable(this.f52590s);
            org.telegram.messenger.g0.X3(p9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.X3(p9VarArr[1], false, 1.0f, true, false);
            this.f52593y.d.add(p9VarArr[0]);
            this.f52593y.d.add(p9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.na.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f52592x;
        if (tL_forumTopic3 != null) {
            this.f52586e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f52592x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.p9[] p9VarArr = this.h;
        if (this.f52587f != null && this.f52591w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f52587f.setSelected(Long.valueOf(longValue));
            if (this.f52584b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.o5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.kc.b0(this).r(e10, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743617, null)), org.telegram.messenger.gd.N0(2131746839, null), new p81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f52584b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(10, this.currentAccount, longValue);
                    o5Var.setColorFilter(org.telegram.ui.ActionBar.n6.f29783v3);
                    p9VarArr[1].setAnimatedEmojiDrawable(o5Var);
                    p9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(1, null);
                    t70Var.a(this.f52588n);
                    this.f52591w.b(t70Var, false);
                    p9VarArr[1].setImageDrawable(this.f52590s);
                    p9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.p9 p9Var = p9VarArr[0];
                org.telegram.ui.Components.p9 p9Var2 = p9VarArr[1];
                p9VarArr[0] = p9Var2;
                p9VarArr[1] = p9Var;
                org.telegram.messenger.g0.X3(p9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.X3(p9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f52583a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f52585c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f25864t7.f(-this.f52583a, this.f52585c);
            this.f52592x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = qg.a.f56255k[Math.abs(Utilities.f22875b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f52586e.requestFocus();
        org.telegram.messenger.g0.I3(this.f52586e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f52589r) {
            removeSelfFromStack();
        }
        this.G.e();
        t81 t81Var = this.f52587f;
        if (t81Var != null) {
            t81Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.G.d();
        }
    }
}
