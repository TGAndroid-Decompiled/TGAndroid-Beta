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
public final class v81 extends org.telegram.ui.ActionBar.f2 {
    public an D;
    public int E;
    public h2.f F;
    public long f50595a;
    public long f50596b;
    public long f50597c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor f50598e;
    public u81 f50599f;
    public org.telegram.ui.Components.l9[] h;
    public String f50600n;
    public boolean f50601r;
    public org.telegram.ui.Components.xp f50602s;
    public org.telegram.ui.Components.xj0 f50603w;
    public TLRPC.TL_forumTopic f50604x;
    public qg.a f50605y;

    public static int c0(v81 v81Var) {
        return v81Var.currentAccount;
    }

    public static v81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? f2Var = new org.telegram.ui.ActionBar.f2(j11);
        f2Var.h = new org.telegram.ui.Components.l9[2];
        f2Var.f50600n = "";
        f2Var.F = new h2.f((int[]) null);
        return f2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.l9[] l9VarArr = this.h;
        if (this.f50604x != null) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748252, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new q81(this));
        if (this.f50604x == null) {
            this.actionBar.q().e(1, org.telegram.messenger.id.M0(2131751753, null));
        } else {
            this.actionBar.q().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        org.telegram.ui.ActionBar.r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        org.telegram.ui.ActionBar.r6.i(i7, rt0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        rt0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f50604x;
        if (tL_forumTopic != null && tL_forumTopic.f27008id == 1) {
            n4Var.setText(org.telegram.messenger.id.M0(2131751749, null));
        } else {
            n4Var.setText(org.telegram.messenger.id.M0(2131751702, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50598e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.id.M0(2131751114, null));
        org.telegram.ui.ActionBar.r6.B(this.f50598e, org.telegram.ui.ActionBar.k6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.r6.V(this.f50598e, org.telegram.ui.ActionBar.k6.Ie, getResourceProvider());
        this.f50598e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f50598e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f50598e.getPaddingBottom());
        this.f50598e.setBackground(null);
        this.f50598e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f50598e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f50598e, c8.ha.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f50598e.addTextChangedListener(new m0(this, 17));
        t81 t81Var = new t81(context, 0);
        t81Var.setOnClickListener(new View.OnClickListener(this) {
            public final v81 f48329b;

            {
                this.f48329b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                v81 v81Var = this.f48329b;
                switch (i10) {
                    case 0:
                        if (v81Var.f50596b == 0 && v81Var.f50604x == null) {
                            qg.a aVar = v81Var.f50605y;
                            int i11 = aVar.f54117e + 1;
                            aVar.f54117e = i11;
                            int[] iArr = qg.a.f54112k;
                            if (i11 > 5) {
                                aVar.f54117e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f54117e];
                            aVar.f54120i = i12;
                            aVar.h = (int[]) qg.a.f54113l.get(i12);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            v81Var.E = iArr[aVar.f54117e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = v81Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9VarArr[i10] = l9Var;
            t81Var.addView(l9Var, c8.ha.e(28, 28, 17));
        }
        frameLayout.addView(t81Var, c8.ha.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27852d6;
        Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f50604x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27008id == 1) {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232144);
            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f28059od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            t81Var.addView(e10, c8.ha.e(22, 22, 17));
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
            this.d.d(org.telegram.messenger.id.M0(2131751216, null), !this.f50604x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
            org.telegram.ui.ActionBar.r6.R(q8Var2, org.telegram.ui.ActionBar.k6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final v81 f48329b;

                {
                    this.f48329b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    v81 v81Var = this.f48329b;
                    switch (i102) {
                        case 0:
                            if (v81Var.f50596b == 0 && v81Var.f50604x == null) {
                                qg.a aVar = v81Var.f50605y;
                                int i112 = aVar.f54117e + 1;
                                aVar.f54117e = i112;
                                int[] iArr = qg.a.f54112k;
                                if (i112 > 5) {
                                    aVar.f54117e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f54117e];
                                aVar.f54120i = i122;
                                aVar.h = (int[]) qg.a.f54113l.get(i122);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                v81Var.E = iArr[aVar.f54117e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.q8 q8Var3 = v81Var.d;
                            q8Var3.setChecked(true ^ q8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.ha.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.ha.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751215, null));
            frameLayout2.addView(z8Var, c8.ha.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            u81 u81Var = new u81(this, this, getParentActivity());
            this.f50599f = u81Var;
            u81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f50599f.setClipChildren(false);
            frameLayout2.addView(this.f50599f, c8.ha.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = qg.d.d(this.E, "");
            this.f50605y = (qg.a) d.f40352a;
            this.f50603w = new org.telegram.ui.Components.xj0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.f50603w, 0, 0);
            xpVar.f40361x = true;
            this.f50599f.setForumIconDrawable(xpVar);
            this.f50602s = xpVar;
            org.telegram.ui.Components.xj0 xj0Var = this.f50603w;
            org.telegram.ui.Components.l9 l9Var2 = l9VarArr[0];
            ArrayList arrayList = xj0Var.f40328n;
            if (!arrayList.contains(l9Var2)) {
                arrayList.add(l9Var2);
            }
            org.telegram.ui.Components.xj0 xj0Var2 = this.f50603w;
            org.telegram.ui.Components.l9 l9Var3 = l9VarArr[1];
            ArrayList arrayList2 = xj0Var2.f40328n;
            if (!arrayList2.contains(l9Var3)) {
                arrayList2.add(l9Var3);
            }
            l9VarArr[0].setImageDrawable(this.f50602s);
            org.telegram.messenger.g0.Z3(l9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(l9VarArr[1], false, 1.0f, true, false);
            this.f50605y.d.add(l9VarArr[0]);
            this.f50605y.d.add(l9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f50604x;
        if (tL_forumTopic3 != null) {
            this.f50598e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f50604x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z9) {
        long longValue;
        org.telegram.ui.Components.l9[] l9VarArr = this.h;
        if (this.f50599f != null && this.f50603w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f50599f.setSelected(Long.valueOf(longValue));
            if (this.f50596b != longValue) {
                if (!z9 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.i5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.hc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743867, null)), org.telegram.messenger.id.M0(2131747034, null), new p81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f50596b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(10, this.currentAccount, longValue);
                    i5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28184v3);
                    l9VarArr[1].setAnimatedEmojiDrawable(i5Var);
                    l9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
                    g70Var.a(this.f50600n);
                    this.f50603w.b(g70Var, false);
                    l9VarArr[1].setImageDrawable(this.f50602s);
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
        this.f50595a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f50597c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f24877q7.f(-this.f50595a, this.f50597c);
            this.f50604x = f10;
            if (f10 == null) {
                return false;
            }
            this.E = f10.icon_color;
        } else {
            this.E = qg.a.f54112k[Math.abs(Utilities.f21334b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f50598e.requestFocus();
        org.telegram.messenger.g0.K3(this.f50598e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 && this.f50601r) {
            removeSelfFromStack();
        }
        this.F.e();
        u81 u81Var = this.f50599f;
        if (u81Var != null) {
            u81Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
