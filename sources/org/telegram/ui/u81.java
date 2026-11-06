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
public final class u81 extends org.telegram.ui.ActionBar.f2 {
    public an D;
    public int E;
    public h2.f F;
    public long f50337a;
    public long f50338b;
    public long f50339c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor f50340e;
    public t81 f50341f;
    public org.telegram.ui.Components.l9[] h;
    public String f50342n;
    public boolean f50343r;
    public org.telegram.ui.Components.xp f50344s;
    public org.telegram.ui.Components.xj0 f50345w;
    public TLRPC.TL_forumTopic f50346x;
    public qg.a f50347y;

    public static int c0(u81 u81Var) {
        return u81Var.currentAccount;
    }

    public static u81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? f2Var = new org.telegram.ui.ActionBar.f2(j11);
        f2Var.h = new org.telegram.ui.Components.l9[2];
        f2Var.f50342n = "";
        f2Var.F = new h2.f((int[]) null);
        return f2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.l9[] l9VarArr = this.h;
        if (this.f50346x != null) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748250, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this));
        if (this.f50346x == null) {
            this.actionBar.q().e(1, org.telegram.messenger.hd.M0(2131751753, null));
        } else {
            this.actionBar.q().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.f27793a7;
        org.telegram.ui.ActionBar.r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        org.telegram.ui.ActionBar.r6.i(i7, rt0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        rt0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f50346x;
        if (tL_forumTopic != null && tL_forumTopic.f27005id == 1) {
            n4Var.setText(org.telegram.messenger.hd.M0(2131751749, null));
        } else {
            n4Var.setText(org.telegram.messenger.hd.M0(2131751702, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50340e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.hd.M0(2131751114, null));
        org.telegram.ui.ActionBar.r6.B(this.f50340e, org.telegram.ui.ActionBar.k6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.r6.V(this.f50340e, org.telegram.ui.ActionBar.k6.Ie, getResourceProvider());
        this.f50340e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f50340e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f50340e.getPaddingBottom());
        this.f50340e.setBackground(null);
        this.f50340e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f50340e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f50340e, c8.ha.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f50340e.addTextChangedListener(new m0(this, 17));
        s81 s81Var = new s81(context, 0);
        s81Var.setOnClickListener(new View.OnClickListener(this) {
            public final u81 f47997b;

            {
                this.f47997b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                u81 u81Var = this.f47997b;
                switch (i10) {
                    case 0:
                        if (u81Var.f50338b == 0 && u81Var.f50346x == null) {
                            qg.a aVar = u81Var.f50347y;
                            int i11 = aVar.f54023e + 1;
                            aVar.f54023e = i11;
                            int[] iArr = qg.a.f54018k;
                            if (i11 > 5) {
                                aVar.f54023e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f54023e];
                            aVar.f54026i = i12;
                            aVar.h = (int[]) qg.a.f54019l.get(i12);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            u81Var.E = iArr[aVar.f54023e];
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
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9VarArr[i10] = l9Var;
            s81Var.addView(l9Var, c8.ha.e(28, 28, 17));
        }
        frameLayout.addView(s81Var, c8.ha.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27849d6;
        Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f50346x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27005id == 1) {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232144);
            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f28056od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            s81Var.addView(e10, c8.ha.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.ha.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.f6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, f03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.hd.M0(2131751216, null), !this.f50346x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f27941i6;
            org.telegram.ui.ActionBar.r6.R(q8Var2, org.telegram.ui.ActionBar.k6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final u81 f47997b;

                {
                    this.f47997b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    u81 u81Var = this.f47997b;
                    switch (i102) {
                        case 0:
                            if (u81Var.f50338b == 0 && u81Var.f50346x == null) {
                                qg.a aVar = u81Var.f50347y;
                                int i112 = aVar.f54023e + 1;
                                aVar.f54023e = i112;
                                int[] iArr = qg.a.f54018k;
                                if (i112 > 5) {
                                    aVar.f54023e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f54023e];
                                aVar.f54026i = i122;
                                aVar.h = (int[]) qg.a.f54019l.get(i122);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                u81Var.E = iArr[aVar.f54023e];
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
            frameLayout3.addView(this.d, c8.ha.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.ha.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.hd.M0(2131751215, null));
            frameLayout2.addView(z8Var, c8.ha.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            t81 t81Var = new t81(this, this, getParentActivity());
            this.f50341f = t81Var;
            t81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f50341f.setClipChildren(false);
            frameLayout2.addView(this.f50341f, c8.ha.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = qg.d.d(this.E, "");
            this.f50347y = (qg.a) d.f40331a;
            this.f50345w = new org.telegram.ui.Components.xj0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.f50345w, 0, 0);
            xpVar.f40340x = true;
            this.f50341f.setForumIconDrawable(xpVar);
            this.f50344s = xpVar;
            org.telegram.ui.Components.xj0 xj0Var = this.f50345w;
            org.telegram.ui.Components.l9 l9Var2 = l9VarArr[0];
            ArrayList arrayList = xj0Var.f40307n;
            if (!arrayList.contains(l9Var2)) {
                arrayList.add(l9Var2);
            }
            org.telegram.ui.Components.xj0 xj0Var2 = this.f50345w;
            org.telegram.ui.Components.l9 l9Var3 = l9VarArr[1];
            ArrayList arrayList2 = xj0Var2.f40307n;
            if (!arrayList2.contains(l9Var3)) {
                arrayList2.add(l9Var3);
            }
            l9VarArr[0].setImageDrawable(this.f50344s);
            org.telegram.messenger.g0.Z3(l9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(l9VarArr[1], false, 1.0f, true, false);
            this.f50347y.d.add(l9VarArr[0]);
            this.f50347y.d.add(l9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f50346x;
        if (tL_forumTopic3 != null) {
            this.f50340e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f50346x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z9) {
        long longValue;
        org.telegram.ui.Components.l9[] l9VarArr = this.h;
        if (this.f50341f != null && this.f50345w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f50341f.setSelected(Long.valueOf(longValue));
            if (this.f50338b != longValue) {
                if (!z9 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.i5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.hc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743865, null)), org.telegram.messenger.hd.M0(2131747032, null), new o81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f50338b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(10, this.currentAccount, longValue);
                    i5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28181v3);
                    l9VarArr[1].setAnimatedEmojiDrawable(i5Var);
                    l9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
                    g70Var.a(this.f50342n);
                    this.f50345w.b(g70Var, false);
                    l9VarArr[1].setImageDrawable(this.f50344s);
                    l9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.l9 l9Var = l9VarArr[0];
                org.telegram.ui.Components.l9 l9Var2 = l9VarArr[1];
                l9VarArr[0] = l9Var2;
                l9VarArr[1] = l9Var;
                org.telegram.messenger.g0.Z3(l9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(l9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f50337a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f50339c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f24870q7.f(-this.f50337a, this.f50339c);
            this.f50346x = f10;
            if (f10 == null) {
                return false;
            }
            this.E = f10.icon_color;
        } else {
            this.E = qg.a.f54018k[Math.abs(Utilities.f21331b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f50340e.requestFocus();
        org.telegram.messenger.g0.K3(this.f50340e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 && this.f50343r) {
            removeSelfFromStack();
        }
        this.F.e();
        t81 t81Var = this.f50341f;
        if (t81Var != null) {
            t81Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        if (z9) {
            this.F.d();
        }
    }
}
