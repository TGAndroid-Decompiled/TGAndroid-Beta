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
public final class s81 extends org.telegram.ui.ActionBar.e2 {
    public an E;
    public int F;
    public h2.f G;
    public long f51150a;
    public long f51151b;
    public long f51152c;
    public org.telegram.ui.Cells.p8 d;
    public EditTextBoldCursor f51153e;
    public r81 f51154f;
    public org.telegram.ui.Components.i9[] h;
    public String f51155n;
    public boolean f51156r;
    public org.telegram.ui.Components.fq f51157s;
    public org.telegram.ui.Components.ck0 f51158w;
    public TLRPC.TL_forumTopic f51159x;
    public qg.a f51160y;

    public static int c0(s81 s81Var) {
        return s81Var.currentAccount;
    }

    public static s81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        ?? e2Var = new org.telegram.ui.ActionBar.e2(j11);
        e2Var.h = new org.telegram.ui.Components.i9[2];
        e2Var.f51155n = "";
        e2Var.G = new h2.f((int[]) null);
        return e2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.i9[] i9VarArr = this.h;
        if (this.f51159x != null) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751216, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748251, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this));
        if (this.f51159x == null) {
            this.actionBar.s().e(1, org.telegram.messenger.hd.M0(2131751753, null));
        } else {
            this.actionBar.s().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        org.telegram.ui.ActionBar.q6.h(i7, st0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        st0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f51159x;
        if (tL_forumTopic != null && tL_forumTopic.f28103id == 1) {
            n4Var.setText(org.telegram.messenger.hd.M0(2131751749, null));
        } else {
            n4Var.setText(org.telegram.messenger.hd.M0(2131751701, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51153e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.hd.M0(2131751113, null));
        org.telegram.ui.ActionBar.q6.A(this.f51153e, org.telegram.ui.ActionBar.j6.Me, getResourceProvider());
        org.telegram.ui.ActionBar.q6.U(this.f51153e, org.telegram.ui.ActionBar.j6.Le, getResourceProvider());
        this.f51153e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f51153e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f51153e.getPaddingBottom());
        this.f51153e.setBackground(null);
        this.f51153e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f51153e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f51153e, c8.ja.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f51153e.addTextChangedListener(new m0(this, 17));
        q81 q81Var = new q81(context, 0);
        q81Var.setOnClickListener(new View.OnClickListener(this) {
            public final s81 f49185b;

            {
                this.f49185b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                s81 s81Var = this.f49185b;
                switch (i10) {
                    case 0:
                        if (s81Var.f51151b == 0 && s81Var.f51159x == null) {
                            qg.a aVar = s81Var.f51160y;
                            int i11 = aVar.f55563e + 1;
                            aVar.f55563e = i11;
                            int[] iArr = qg.a.f55558k;
                            if (i11 > 5) {
                                aVar.f55563e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f55563e];
                            aVar.f55566i = i12;
                            aVar.h = (int[]) qg.a.f55559l.get(i12);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ch.v(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            s81Var.F = iArr[aVar.f55563e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.p8 p8Var = s81Var.d;
                        p8Var.setChecked(true ^ p8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9VarArr[i10] = i9Var;
            q81Var.addView(i9Var, c8.ja.e(28, 28, 17));
        }
        frameLayout.addView(q81Var, c8.ja.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
        Drawable f02 = org.telegram.ui.ActionBar.j6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.q6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ja.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f51159x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f28103id == 1) {
            ImageView e10 = org.telegram.messenger.i20.e(context, 2131232145);
            org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.f29115rd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            q81Var.addView(e10, c8.ja.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.ja.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.j6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
            org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.q6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.d = p8Var;
            p8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.hd.M0(2131751215, null), !this.f51159x.hidden, false, false);
            org.telegram.ui.Cells.p8 p8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.q6.Q(p8Var2, org.telegram.ui.ActionBar.j6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.q6.M(i11), org.telegram.ui.ActionBar.q6.M(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final s81 f49185b;

                {
                    this.f49185b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    s81 s81Var = this.f49185b;
                    switch (i102) {
                        case 0:
                            if (s81Var.f51151b == 0 && s81Var.f51159x == null) {
                                qg.a aVar = s81Var.f51160y;
                                int i112 = aVar.f55563e + 1;
                                aVar.f55563e = i112;
                                int[] iArr = qg.a.f55558k;
                                if (i112 > 5) {
                                    aVar.f55563e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f55563e];
                                aVar.f55566i = i122;
                                aVar.h = (int[]) qg.a.f55559l.get(i122);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ch.v(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                s81Var.F = iArr[aVar.f55563e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.p8 p8Var3 = s81Var.d;
                            p8Var3.setChecked(true ^ p8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.ja.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, c8.ja.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.hd.M0(2131751214, null));
            frameLayout2.addView(y8Var, c8.ja.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            r81 r81Var = new r81(this, this, getParentActivity());
            this.f51154f = r81Var;
            r81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f51154f.setClipChildren(false);
            frameLayout2.addView(this.f51154f, c8.ja.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.fq d = qg.c.d(this.F, "");
            this.f51160y = (qg.a) d.f34669a;
            this.f51158w = new org.telegram.ui.Components.ck0(context);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(d, this.f51158w, 0, 0);
            fqVar.f34678x = true;
            this.f51154f.setForumIconDrawable(fqVar);
            this.f51157s = fqVar;
            org.telegram.ui.Components.ck0 ck0Var = this.f51158w;
            org.telegram.ui.Components.i9 i9Var2 = i9VarArr[0];
            ArrayList arrayList = ck0Var.f33624n;
            if (!arrayList.contains(i9Var2)) {
                arrayList.add(i9Var2);
            }
            org.telegram.ui.Components.ck0 ck0Var2 = this.f51158w;
            org.telegram.ui.Components.i9 i9Var3 = i9VarArr[1];
            ArrayList arrayList2 = ck0Var2.f33624n;
            if (!arrayList2.contains(i9Var3)) {
                arrayList2.add(i9Var3);
            }
            i9VarArr[0].setImageDrawable(this.f51157s);
            org.telegram.messenger.g0.Y3(i9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Y3(i9VarArr[1], false, 1.0f, true, false);
            this.f51160y.d.add(i9VarArr[0]);
            this.f51160y.d.add(i9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, c8.ja.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f51159x;
        if (tL_forumTopic3 != null) {
            this.f51153e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f51159x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.i9[] i9VarArr = this.h;
        if (this.f51154f != null && this.f51158w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f51154f.setSelected(Long.valueOf(longValue));
            if (this.f51151b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.g5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.cc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743864, null)), org.telegram.messenger.hd.M0(2131747033, null), new n81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f51151b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(10, this.currentAccount, longValue);
                    g5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f29181v3);
                    i9VarArr[1].setAnimatedEmojiDrawable(g5Var);
                    i9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(1, null);
                    j70Var.a(this.f51155n);
                    this.f51158w.b(j70Var, false);
                    i9VarArr[1].setImageDrawable(this.f51157s);
                    i9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.i9 i9Var = i9VarArr[0];
                org.telegram.ui.Components.i9 i9Var2 = i9VarArr[1];
                i9VarArr[0] = i9Var2;
                i9VarArr[1] = i9Var;
                org.telegram.messenger.g0.Y3(i9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.Y3(i9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51150a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f51152c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f25383r7.f(-this.f51150a, this.f51152c);
            this.f51159x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = qg.a.f55558k[Math.abs(Utilities.f22414b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f51153e.requestFocus();
        org.telegram.messenger.g0.J3(this.f51153e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f51156r) {
            removeSelfFromStack();
        }
        this.G.e();
        r81 r81Var = this.f51154f;
        if (r81Var != null) {
            r81Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
