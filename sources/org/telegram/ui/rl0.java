package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class rl0 extends View implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public int F;
    public final int f51640a;
    public final boolean f51641b;
    public final boolean f51642c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Drawable f51643e;
    public final org.telegram.ui.Components.vy0 f51644f;
    public final org.telegram.ui.ActionBar.w2 h;
    public final Paint f51645n;
    public org.telegram.ui.Components.vy0 f51646r;
    public int f51647s;
    public boolean f51648w;
    public gm0 f51649x;
    public gm0 f51650y;

    public rl0(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f51645n = new Paint(1);
        this.f51647s = -1;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        this.f51640a = i7;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51641b = z10;
        if (z10 && !org.telegram.messenger.v3.V(O0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51642c = z11;
        this.d = i6Var;
        Drawable g10 = i5.c.g(context, 2131231791);
        this.f51643e = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29636q6, i6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i10 = 2131752535;
            } else {
                i10 = 2131752540;
            }
        } else {
            i10 = 2131752519;
        }
        String M0 = org.telegram.messenger.gd.M0(i10, null);
        if (z10 && !z11 && org.telegram.messenger.mp.u1(i7).h7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.cp cpVar = u12.f25769t4;
            int i12 = Integer.MAX_VALUE;
            if (cpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, cpVar.e(false));
                int max = Math.max(0, u12.f25769t4.e(false));
                int min2 = Math.min(min, u12.f25769t4.f());
                int max2 = Math.max(max, u12.f25769t4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, u12.f25770t5);
            int min4 = Math.min(i11, u12.f25770t5);
            org.telegram.messenger.cp cpVar2 = u12.f25777u4;
            if (cpVar2 != null) {
                int min5 = Math.min(min3, cpVar2.e(false));
                int max3 = Math.max(min4, u12.f25777u4.e(false));
                min3 = Math.min(min5, u12.f25777u4.f());
                min4 = Math.max(max3, u12.f25777u4.f());
            }
            int min6 = Math.min(min3, u12.f25778u5);
            int max4 = Math.max(min4, u12.f25778u5);
            int min7 = Math.min(min6, u12.f25787v5);
            int max5 = Math.max(max4, u12.f25787v5);
            int min8 = Math.min(min7, u12.f25797w5);
            int max6 = Math.max(max5, u12.f25797w5);
            int min9 = Math.min(min8, u12.f25807x5);
            int max7 = Math.max(max6, u12.f25807x5);
            int i13 = O0 != null ? O0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.w2(Math.max(i13, min9), context, i6Var, true);
            }
        }
        setContentDescription(M0);
        this.f51644f = new org.telegram.ui.Components.vy0(M0, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float L;
        int L2;
        int z10;
        int measuredWidth;
        int z11;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = org.telegram.messenger.g0.L(64.0f) / 2;
        if (org.telegram.messenger.gd.f24216a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f51643e;
        bg.t.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        int i10 = 0;
        org.telegram.ui.ActionBar.w2 w2Var = this.h;
        if (w2Var != null) {
            i7 = org.telegram.messenger.g0.L(8.0f) + w2Var.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.vy0 vy0Var = this.f51644f;
        vy0Var.f41493p = measuredWidth4 - i7;
        if (org.telegram.messenger.gd.f24216a0) {
            L = (getMeasuredWidth() - vy0Var.k()) - org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(71.0f);
        }
        vy0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (w2Var != null) {
            int k10 = (int) (vy0Var.k() + L + org.telegram.messenger.g0.L(6.0f));
            w2Var.setBounds(k10, 0, k10, getHeight());
            w2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        boolean z12 = this.f51642c;
        if (z12 && this.f51650y != null) {
            if (org.telegram.messenger.gd.f24216a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f51650y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.n10.z(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f51650y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, i6Var));
            this.f51650y.draw(canvas);
        } else if (this.f51649x != null && this.f51650y != null) {
            if (org.telegram.messenger.gd.f24216a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f51650y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.n10.z(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            gm0 gm0Var = this.f51650y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.n6.f29396d6;
            gm0Var.f(N, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            this.f51650y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f51649x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.n10.z(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f51649x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            this.f51649x.draw(canvas);
        } else if (this.f51646r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = vy0Var.k();
            if (w2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + w2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f51646r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.gd.f24216a0) {
                z10 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.f3.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.gd.f24216a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f51645n);
            org.telegram.ui.Components.vy0 vy0Var2 = this.f51646r;
            vy0Var2.f41493p = min;
            if (org.telegram.messenger.gd.f24216a0) {
                z11 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.f3.z(24.0f, getMeasuredWidth(), min2);
            }
            vy0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f51648w) {
            if (i6Var != null) {
                paint = i6Var.g("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.n6.f29519k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.gd.f24216a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24216a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f51648w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        gm0 gm0Var;
        int w02;
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        int i10;
        int i11;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        org.telegram.messenger.bp bpVar = null;
        this.f51646r = new org.telegram.ui.Components.vy0(org.telegram.messenger.j6.m(trim, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        gm0 gm0Var2 = this.f51649x;
        if (gm0Var2 != null) {
            gm0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f51640a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = gm0.f48132j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f51649x = new gm0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.o10.m(user) >= 0) {
                gm0Var = gm0.c(i12, org.telegram.messenger.o10.m(user));
                gm0Var.f48133a = org.telegram.messenger.g0.L(11.0f);
                gm0Var.d();
            } else {
                gm0Var = null;
            }
            this.f51649x = gm0Var;
        }
        gm0 gm0Var3 = this.f51649x;
        if (gm0Var3 != null) {
            gm0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f51645n;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (i6Var != null) {
                q10 = i6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i7 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i7 = tL_peerColorCollectible.accent_color;
            }
            if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i10 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i10 = intValue;
            }
            if (arrayList.size() >= 3) {
                i11 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            this.f51646r.n(i7);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, i7));
            gm0 gm0Var4 = new gm0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            gm0Var4.f48133a = org.telegram.messenger.g0.L(11.0f);
            gm0Var4.d();
            this.f51650y = gm0Var4;
            gm0Var4.e(this);
            return;
        }
        int f10 = org.telegram.messenger.o10.f(user);
        if (f10 < 7) {
            int i15 = org.telegram.ui.ActionBar.n6.f29657r8[f10];
            this.f51647s = i15;
            w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
        } else {
            org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).f25769t4;
            if (cpVar != null) {
                bpVar = cpVar.d(f10);
            }
            if (bpVar != null) {
                this.f51647s = -1;
                w02 = bpVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.n6.f29657r8[0];
                this.f51647s = i16;
                w02 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
            }
        }
        this.f51646r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
        gm0 a10 = gm0.a(i12, f10);
        a10.f48133a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f51650y = a10;
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f51641b;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.f29561m6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29636q6;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        if (!this.E || this.F != w02) {
            this.E = true;
            this.F = w02;
            this.f51643e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29636q6;
        }
        this.f51644f.n(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (this.f51646r != null && (paint = this.f51645n) != null && (i11 = this.f51647s) != -1) {
            int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            this.f51646r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
