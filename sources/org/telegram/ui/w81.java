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
public final class w81 extends org.telegram.ui.ActionBar.h2 {
    public bn E;
    public int F;
    public h2.f G;
    public long f53009a;
    public long f53010b;
    public long f53011c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor f53012e;
    public v81 f53013f;
    public org.telegram.ui.Components.q9[] h;
    public String f53014n;
    public boolean f53015r;
    public org.telegram.ui.Components.mq f53016s;
    public org.telegram.ui.Components.kk0 f53017w;
    public TLRPC.TL_forumTopic f53018x;
    public qg.a f53019y;

    public static int c0(w81 w81Var) {
        return w81Var.currentAccount;
    }

    public static w81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? h2Var = new org.telegram.ui.ActionBar.h2(j11);
        h2Var.h = new org.telegram.ui.Components.q9[2];
        h2Var.f53014n = "";
        h2Var.G = new h2.f((int[]) null);
        return h2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.q9[] q9VarArr = this.h;
        if (this.f53018x != null) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131751205, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748059, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new s81(this));
        if (this.f53018x == null) {
            this.actionBar.t().e(1, org.telegram.messenger.gd.M0(2131751742, null));
        } else {
            this.actionBar.t().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29339a7;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.au0 au0Var = new org.telegram.ui.Components.au0(context, null);
        this.fragmentView = au0Var;
        org.telegram.ui.ActionBar.u6.h(i7, au0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        au0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f53018x;
        if (tL_forumTopic != null && tL_forumTopic.f28457id == 1) {
            n4Var.setText(org.telegram.messenger.gd.M0(2131751738, null));
        } else {
            n4Var.setText(org.telegram.messenger.gd.M0(2131751690, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f53012e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.gd.M0(2131751102, null));
        org.telegram.ui.ActionBar.u6.A(this.f53012e, org.telegram.ui.ActionBar.n6.Me, getResourceProvider());
        org.telegram.ui.ActionBar.u6.U(this.f53012e, org.telegram.ui.ActionBar.n6.Le, getResourceProvider());
        this.f53012e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f53012e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f53012e.getPaddingBottom());
        this.f53012e.setBackground(null);
        this.f53012e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f53012e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f53012e, c8.ma.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f53012e.addTextChangedListener(new m0(this, 17));
        u81 u81Var = new u81(context, 0);
        u81Var.setOnClickListener(new View.OnClickListener(this) {
            public final w81 f51174b;

            {
                this.f51174b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                w81 w81Var = this.f51174b;
                switch (i10) {
                    case 0:
                        if (w81Var.f53010b == 0 && w81Var.f53018x == null) {
                            qg.a aVar = w81Var.f53019y;
                            int i11 = aVar.f56137e + 1;
                            aVar.f56137e = i11;
                            int[] iArr = qg.a.f56132k;
                            if (i11 > 5) {
                                aVar.f56137e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f56137e];
                            aVar.f56140i = i12;
                            aVar.h = (int[]) qg.a.f56133l.get(i12);
                            if (org.telegram.ui.ActionBar.n6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            w81Var.F = iArr[aVar.f56137e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = w81Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9VarArr[i10] = q9Var;
            u81Var.addView(q9Var, c8.ma.e(28, 28, 17));
        }
        frameLayout.addView(u81Var, c8.ma.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.n6.f29396d6;
        Drawable f02 = org.telegram.ui.ActionBar.n6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.u6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ma.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f53018x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f28457id == 1) {
            ImageView e10 = org.telegram.messenger.n10.e(context, 2131232146);
            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29662rd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            u81Var.addView(e10, c8.ma.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.ma.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.n6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
            org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.u6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.gd.M0(2131751204, null), !this.f53018x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.u6.Q(q8Var2, org.telegram.ui.ActionBar.n6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.u6.M(i11), org.telegram.ui.ActionBar.u6.M(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final w81 f51174b;

                {
                    this.f51174b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    w81 w81Var = this.f51174b;
                    switch (i102) {
                        case 0:
                            if (w81Var.f53010b == 0 && w81Var.f53018x == null) {
                                qg.a aVar = w81Var.f53019y;
                                int i112 = aVar.f56137e + 1;
                                aVar.f56137e = i112;
                                int[] iArr = qg.a.f56132k;
                                if (i112 > 5) {
                                    aVar.f56137e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f56137e];
                                aVar.f56140i = i122;
                                aVar.h = (int[]) qg.a.f56133l.get(i122);
                                if (org.telegram.ui.ActionBar.n6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                w81Var.F = iArr[aVar.f56137e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.q8 q8Var3 = w81Var.d;
                            q8Var3.setChecked(true ^ q8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.ma.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.ma.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.gd.M0(2131751203, null));
            frameLayout2.addView(z8Var, c8.ma.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            v81 v81Var = new v81(this, this, getParentActivity());
            this.f53013f = v81Var;
            v81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f53013f.setClipChildren(false);
            frameLayout2.addView(this.f53013f, c8.ma.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.mq e11 = qg.c.e(this.F, "");
            this.f53019y = (qg.a) e11.f37607a;
            this.f53017w = new org.telegram.ui.Components.kk0(context);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(e11, this.f53017w, 0, 0);
            mqVar.f37616x = true;
            this.f53013f.setForumIconDrawable(mqVar);
            this.f53016s = mqVar;
            org.telegram.ui.Components.kk0 kk0Var = this.f53017w;
            org.telegram.ui.Components.q9 q9Var2 = q9VarArr[0];
            ArrayList arrayList = kk0Var.f36791n;
            if (!arrayList.contains(q9Var2)) {
                arrayList.add(q9Var2);
            }
            org.telegram.ui.Components.kk0 kk0Var2 = this.f53017w;
            org.telegram.ui.Components.q9 q9Var3 = q9VarArr[1];
            ArrayList arrayList2 = kk0Var2.f36791n;
            if (!arrayList2.contains(q9Var3)) {
                arrayList2.add(q9Var3);
            }
            q9VarArr[0].setImageDrawable(this.f53016s);
            org.telegram.messenger.g0.X3(q9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.X3(q9VarArr[1], false, 1.0f, true, false);
            this.f53019y.d.add(q9VarArr[0]);
            this.f53019y.d.add(q9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.ma.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f53018x;
        if (tL_forumTopic3 != null) {
            this.f53012e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f53018x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.q9[] q9VarArr = this.h;
        if (this.f53013f != null && this.f53017w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f53013f.setSelected(Long.valueOf(longValue));
            if (this.f53010b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.o5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.lc.b0(this).r(e10, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743627, null)), org.telegram.messenger.gd.M0(2131746840, null), new r81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f53010b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(10, this.currentAccount, longValue);
                    o5Var.setColorFilter(org.telegram.ui.ActionBar.n6.f29728v3);
                    q9VarArr[1].setAnimatedEmojiDrawable(o5Var);
                    q9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(1, null);
                    u70Var.a(this.f53014n);
                    this.f53017w.b(u70Var, false);
                    q9VarArr[1].setImageDrawable(this.f53016s);
                    q9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.q9 q9Var = q9VarArr[0];
                org.telegram.ui.Components.q9 q9Var2 = q9VarArr[1];
                q9VarArr[0] = q9Var2;
                q9VarArr[1] = q9Var;
                org.telegram.messenger.g0.X3(q9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.X3(q9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53009a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f53011c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f25771t7.f(-this.f53009a, this.f53011c);
            this.f53018x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = qg.a.f56132k[Math.abs(Utilities.f22780b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f53012e.requestFocus();
        org.telegram.messenger.g0.I3(this.f53012e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f53015r) {
            removeSelfFromStack();
        }
        this.G.e();
        v81 v81Var = this.f53013f;
        if (v81Var != null) {
            v81Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
