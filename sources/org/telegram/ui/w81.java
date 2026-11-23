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
public final class w81 extends org.telegram.ui.ActionBar.g2 {
    public bn E;
    public int F;
    public h2.f G;
    public long f52986a;
    public long f52987b;
    public long f52988c;
    public org.telegram.ui.Cells.r8 d;
    public EditTextBoldCursor f52989e;
    public v81 f52990f;
    public org.telegram.ui.Components.q9[] h;
    public String f52991n;
    public boolean f52992r;
    public org.telegram.ui.Components.oq f52993s;
    public org.telegram.ui.Components.mk0 f52994w;
    public TLRPC.TL_forumTopic f52995x;
    public qg.a f52996y;

    public static int c0(w81 w81Var) {
        return w81Var.currentAccount;
    }

    public static w81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? g2Var = new org.telegram.ui.ActionBar.g2(j11);
        g2Var.h = new org.telegram.ui.Components.q9[2];
        g2Var.f52991n = "";
        g2Var.G = new h2.f((int[]) null);
        return g2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.q9[] q9VarArr = this.h;
        if (this.f52995x != null) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131751204, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748058, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new s81(this));
        if (this.f52995x == null) {
            this.actionBar.s().e(1, org.telegram.messenger.hd.N0(2131751741, null));
        } else {
            this.actionBar.s().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f29290a7;
        org.telegram.ui.ActionBar.t6.h(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.du0 du0Var = new org.telegram.ui.Components.du0(context, null);
        this.fragmentView = du0Var;
        org.telegram.ui.ActionBar.t6.h(i7, du0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        du0Var.addView(linearLayout);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f52995x;
        if (tL_forumTopic != null && tL_forumTopic.f28450id == 1) {
            o4Var.setText(org.telegram.messenger.hd.N0(2131751737, null));
        } else {
            o4Var.setText(org.telegram.messenger.hd.N0(2131751689, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52989e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.hd.N0(2131751101, null));
        org.telegram.ui.ActionBar.t6.A(this.f52989e, org.telegram.ui.ActionBar.m6.Me, getResourceProvider());
        org.telegram.ui.ActionBar.t6.U(this.f52989e, org.telegram.ui.ActionBar.m6.Le, getResourceProvider());
        this.f52989e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f52989e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f52989e.getPaddingBottom());
        this.f52989e.setBackground(null);
        this.f52989e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f52989e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f52989e, c8.na.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f52989e.addTextChangedListener(new m0(this, 17));
        u81 u81Var = new u81(context, 0);
        u81Var.setOnClickListener(new View.OnClickListener(this) {
            public final w81 f51080b;

            {
                this.f51080b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                w81 w81Var = this.f51080b;
                switch (i10) {
                    case 0:
                        if (w81Var.f52987b == 0 && w81Var.f52995x == null) {
                            qg.a aVar = w81Var.f52996y;
                            int i11 = aVar.f56147e + 1;
                            aVar.f56147e = i11;
                            int[] iArr = qg.a.f56142k;
                            if (i11 > 5) {
                                aVar.f56147e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f56147e];
                            aVar.f56150i = i12;
                            aVar.h = (int[]) qg.a.f56143l.get(i12);
                            if (org.telegram.ui.ActionBar.m6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            w81Var.F = iArr[aVar.f56147e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.r8 r8Var = w81Var.d;
                        r8Var.setChecked(true ^ r8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9VarArr[i10] = q9Var;
            u81Var.addView(q9Var, c8.na.e(28, 28, 17));
        }
        frameLayout.addView(u81Var, c8.na.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(o4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.m6.f29347d6;
        Drawable f02 = org.telegram.ui.ActionBar.m6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.na.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f52995x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f28450id == 1) {
            ImageView e10 = org.telegram.messenger.o10.e(context, 2131232146);
            org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.f29613rd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            u81Var.addView(e10, c8.na.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.na.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.m6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
            org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.t6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.d = r8Var;
            r8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.hd.N0(2131751203, null), !this.f52995x.hidden, false, false);
            org.telegram.ui.Cells.r8 r8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.m6.f29439i6;
            org.telegram.ui.ActionBar.t6.Q(r8Var2, org.telegram.ui.ActionBar.m6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.t6.M(i11), org.telegram.ui.ActionBar.t6.M(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final w81 f51080b;

                {
                    this.f51080b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    w81 w81Var = this.f51080b;
                    switch (i102) {
                        case 0:
                            if (w81Var.f52987b == 0 && w81Var.f52995x == null) {
                                qg.a aVar = w81Var.f52996y;
                                int i112 = aVar.f56147e + 1;
                                aVar.f56147e = i112;
                                int[] iArr = qg.a.f56142k;
                                if (i112 > 5) {
                                    aVar.f56147e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f56147e];
                                aVar.f56150i = i122;
                                aVar.h = (int[]) qg.a.f56143l.get(i122);
                                if (org.telegram.ui.ActionBar.m6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ch.w(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                w81Var.F = iArr[aVar.f56147e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.r8 r8Var3 = w81Var.d;
                            r8Var3.setChecked(true ^ r8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.na.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.na.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(org.telegram.messenger.hd.N0(2131751202, null));
            frameLayout2.addView(a9Var, c8.na.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            v81 v81Var = new v81(this, this, getParentActivity());
            this.f52990f = v81Var;
            v81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f52990f.setClipChildren(false);
            frameLayout2.addView(this.f52990f, c8.na.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.oq e11 = qg.c.e(this.F, "");
            this.f52996y = (qg.a) e11.f38300a;
            this.f52994w = new org.telegram.ui.Components.mk0(context);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(e11, this.f52994w, 0, 0);
            oqVar.f38309x = true;
            this.f52990f.setForumIconDrawable(oqVar);
            this.f52993s = oqVar;
            org.telegram.ui.Components.mk0 mk0Var = this.f52994w;
            org.telegram.ui.Components.q9 q9Var2 = q9VarArr[0];
            ArrayList arrayList = mk0Var.f37502n;
            if (!arrayList.contains(q9Var2)) {
                arrayList.add(q9Var2);
            }
            org.telegram.ui.Components.mk0 mk0Var2 = this.f52994w;
            org.telegram.ui.Components.q9 q9Var3 = q9VarArr[1];
            ArrayList arrayList2 = mk0Var2.f37502n;
            if (!arrayList2.contains(q9Var3)) {
                arrayList2.add(q9Var3);
            }
            q9VarArr[0].setImageDrawable(this.f52993s);
            org.telegram.messenger.g0.X3(q9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.X3(q9VarArr[1], false, 1.0f, true, false);
            this.f52996y.d.add(q9VarArr[0]);
            this.f52996y.d.add(q9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.na.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f52995x;
        if (tL_forumTopic3 != null) {
            this.f52989e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f52995x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.q9[] q9VarArr = this.h;
        if (this.f52990f != null && this.f52994w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f52990f.setSelected(Long.valueOf(longValue));
            if (this.f52987b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.p5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.lc.b0(this).r(e10, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743621, null)), org.telegram.messenger.hd.N0(2131746839, null), new r81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f52987b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(10, this.currentAccount, longValue);
                    p5Var.setColorFilter(org.telegram.ui.ActionBar.m6.f29679v3);
                    q9VarArr[1].setAnimatedEmojiDrawable(p5Var);
                    q9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(1, null);
                    w70Var.a(this.f52991n);
                    this.f52994w.b(w70Var, false);
                    q9VarArr[1].setImageDrawable(this.f52993s);
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
        this.f52986a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f52988c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f25932t7.f(-this.f52986a, this.f52988c);
            this.f52995x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = qg.a.f56142k[Math.abs(Utilities.f22772b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f52989e.requestFocus();
        org.telegram.messenger.g0.I3(this.f52989e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f52992r) {
            removeSelfFromStack();
        }
        this.G.e();
        v81 v81Var = this.f52990f;
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
