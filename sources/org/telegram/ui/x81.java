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
public final class x81 extends org.telegram.ui.ActionBar.f2 {
    public cn D;
    public int E;
    public h2.f F;
    public long f51632a;
    public long f51633b;
    public long f51634c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor f51635e;
    public w81 f51636f;
    public org.telegram.ui.Components.k9[] h;
    public String f51637n;
    public boolean f51638r;
    public org.telegram.ui.Components.xp f51639s;
    public org.telegram.ui.Components.xj0 f51640w;
    public TLRPC.TL_forumTopic f51641x;
    public qg.a f51642y;

    public static int c0(x81 x81Var) {
        return x81Var.currentAccount;
    }

    public static x81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? f2Var = new org.telegram.ui.ActionBar.f2(j11);
        f2Var.h = new org.telegram.ui.Components.k9[2];
        f2Var.f51637n = "";
        f2Var.F = new h2.f((int[]) null);
        return f2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f51641x != null) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751216, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748251, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new s81(this));
        if (this.f51641x == null) {
            this.actionBar.s().e(1, org.telegram.messenger.id.M0(2131751753, null));
        } else {
            this.actionBar.s().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        org.telegram.ui.ActionBar.t6.h(i7, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        org.telegram.ui.ActionBar.t6.h(i7, st0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        st0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f51641x;
        if (tL_forumTopic != null && tL_forumTopic.f27012id == 1) {
            n4Var.setText(org.telegram.messenger.id.M0(2131751749, null));
        } else {
            n4Var.setText(org.telegram.messenger.id.M0(2131751701, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51635e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.id.M0(2131751113, null));
        org.telegram.ui.ActionBar.t6.A(this.f51635e, org.telegram.ui.ActionBar.m6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.t6.U(this.f51635e, org.telegram.ui.ActionBar.m6.Ie, getResourceProvider());
        this.f51635e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f51635e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f51635e.getPaddingBottom());
        this.f51635e.setBackground(null);
        this.f51635e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f51635e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f51635e, c8.ha.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f51635e.addTextChangedListener(new m0(this, 17));
        v81 v81Var = new v81(context, 0);
        v81Var.setOnClickListener(new View.OnClickListener(this) {
            public final x81 f48995b;

            {
                this.f48995b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                x81 x81Var = this.f48995b;
                switch (i10) {
                    case 0:
                        if (x81Var.f51633b == 0 && x81Var.f51641x == null) {
                            qg.a aVar = x81Var.f51642y;
                            int i11 = aVar.f54128e + 1;
                            aVar.f54128e = i11;
                            int[] iArr = qg.a.f54123k;
                            if (i11 > 5) {
                                aVar.f54128e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f54128e];
                            aVar.f54131i = i12;
                            aVar.h = (int[]) qg.a.f54124l.get(i12);
                            if (org.telegram.ui.ActionBar.m6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            x81Var.E = iArr[aVar.f54128e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = x81Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9VarArr[i10] = k9Var;
            v81Var.addView(k9Var, c8.ha.e(28, 28, 17));
        }
        frameLayout.addView(v81Var, c8.ha.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
        Drawable f02 = org.telegram.ui.ActionBar.m6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f51641x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27012id == 1) {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232144);
            org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.f28097od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            v81Var.addView(e10, c8.ha.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.ha.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.m6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
            org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.t6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.id.M0(2131751215, null), !this.f51641x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.ActionBar.t6.Q(q8Var2, org.telegram.ui.ActionBar.m6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.t6.M(i11), org.telegram.ui.ActionBar.t6.M(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final x81 f48995b;

                {
                    this.f48995b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    x81 x81Var = this.f48995b;
                    switch (i102) {
                        case 0:
                            if (x81Var.f51633b == 0 && x81Var.f51641x == null) {
                                qg.a aVar = x81Var.f51642y;
                                int i112 = aVar.f54128e + 1;
                                aVar.f54128e = i112;
                                int[] iArr = qg.a.f54123k;
                                if (i112 > 5) {
                                    aVar.f54128e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f54128e];
                                aVar.f54131i = i122;
                                aVar.h = (int[]) qg.a.f54124l.get(i122);
                                if (org.telegram.ui.ActionBar.m6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                x81Var.E = iArr[aVar.f54128e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.q8 q8Var3 = x81Var.d;
                            q8Var3.setChecked(true ^ q8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.ha.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.ha.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751214, null));
            frameLayout2.addView(z8Var, c8.ha.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            w81 w81Var = new w81(this, this, getParentActivity());
            this.f51636f = w81Var;
            w81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f51636f.setClipChildren(false);
            frameLayout2.addView(this.f51636f, c8.ha.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = qg.d.d(this.E, "");
            this.f51642y = (qg.a) d.f40374a;
            this.f51640w = new org.telegram.ui.Components.xj0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.f51640w, 0, 0);
            xpVar.f40383x = true;
            this.f51636f.setForumIconDrawable(xpVar);
            this.f51639s = xpVar;
            org.telegram.ui.Components.xj0 xj0Var = this.f51640w;
            org.telegram.ui.Components.k9 k9Var2 = k9VarArr[0];
            ArrayList arrayList = xj0Var.f40319n;
            if (!arrayList.contains(k9Var2)) {
                arrayList.add(k9Var2);
            }
            org.telegram.ui.Components.xj0 xj0Var2 = this.f51640w;
            org.telegram.ui.Components.k9 k9Var3 = k9VarArr[1];
            ArrayList arrayList2 = xj0Var2.f40319n;
            if (!arrayList2.contains(k9Var3)) {
                arrayList2.add(k9Var3);
            }
            k9VarArr[0].setImageDrawable(this.f51639s);
            org.telegram.messenger.g0.Z3(k9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(k9VarArr[1], false, 1.0f, true, false);
            this.f51642y.d.add(k9VarArr[0]);
            this.f51642y.d.add(k9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f51641x;
        if (tL_forumTopic3 != null) {
            this.f51635e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f51641x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z9) {
        long longValue;
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f51636f != null && this.f51640w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f51636f.setSelected(Long.valueOf(longValue));
            if (this.f51633b != longValue) {
                if (!z9 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.h5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.gc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743864, null)), org.telegram.messenger.id.M0(2131747033, null), new r81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f51633b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(10, this.currentAccount, longValue);
                    h5Var.setColorFilter(org.telegram.ui.ActionBar.m6.f28222v3);
                    k9VarArr[1].setAnimatedEmojiDrawable(h5Var);
                    k9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
                    g70Var.a(this.f51637n);
                    this.f51640w.b(g70Var, false);
                    k9VarArr[1].setImageDrawable(this.f51639s);
                    k9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
                org.telegram.ui.Components.k9 k9Var2 = k9VarArr[1];
                k9VarArr[0] = k9Var2;
                k9VarArr[1] = k9Var;
                org.telegram.messenger.g0.Z3(k9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(k9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51632a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f51634c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f24881q7.f(-this.f51632a, this.f51634c);
            this.f51641x = f10;
            if (f10 == null) {
                return false;
            }
            this.E = f10.icon_color;
        } else {
            this.E = qg.a.f54123k[Math.abs(Utilities.f21339b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f51635e.requestFocus();
        org.telegram.messenger.g0.K3(this.f51635e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 && this.f51638r) {
            removeSelfFromStack();
        }
        this.F.e();
        w81 w81Var = this.f51636f;
        if (w81Var != null) {
            w81Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
