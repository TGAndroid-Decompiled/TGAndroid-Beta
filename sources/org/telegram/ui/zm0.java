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
public final class zm0 extends View implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public final int f44181a;
    public final boolean f44182b;
    public final boolean f44183c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.qz0 f44184f;
    public final org.telegram.ui.ActionBar.y2 h;
    public final Paint f44185n;
    public org.telegram.ui.Components.qz0 f44186r;
    public int f44187s;
    public boolean f44188w;
    public on0 f44189x;
    public on0 f44190y;

    public zm0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.f44185n = new Paint(1);
        this.f44187s = -1;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        this.f44181a = i10;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44182b = z10;
        if (z10 && !org.telegram.messenger.w3.V(L0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44183c = z11;
        this.d = p6Var;
        Drawable f7 = i0.a.f(context, 2131231789);
        this.e = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.q6, p6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i11 = 2131752546;
            } else {
                i11 = 2131752551;
            }
        } else {
            i11 = 2131752530;
        }
        String L02 = org.telegram.messenger.cd.L0(i11, null);
        if (z10 && !z11 && org.telegram.messenger.vp.r1(i10).f7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.lp lpVar = r12.f18888r4;
            int i13 = Integer.MAX_VALUE;
            if (lpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, lpVar.e(false));
                int max = Math.max(0, r12.f18888r4.e(false));
                int min2 = Math.min(min, r12.f18888r4.f());
                int max2 = Math.max(max, r12.f18888r4.f());
                i13 = min2;
                i12 = max2;
            } else {
                i12 = 0;
            }
            int min3 = Math.min(i13, r12.f18889r5);
            int min4 = Math.min(i12, r12.f18889r5);
            org.telegram.messenger.lp lpVar2 = r12.f18898s4;
            if (lpVar2 != null) {
                int min5 = Math.min(min3, lpVar2.e(false));
                int max3 = Math.max(min4, r12.f18898s4.e(false));
                min3 = Math.min(min5, r12.f18898s4.f());
                min4 = Math.max(max3, r12.f18898s4.f());
            }
            int min6 = Math.min(min3, r12.f18899s5);
            int max4 = Math.max(min4, r12.f18899s5);
            int min7 = Math.min(min6, r12.f18908t5);
            int max5 = Math.max(max4, r12.f18908t5);
            int min8 = Math.min(min7, r12.f18917u5);
            int max6 = Math.max(max5, r12.f18917u5);
            int min9 = Math.min(min8, r12.f18926v5);
            int max7 = Math.max(max6, r12.f18926v5);
            int i14 = L0 != null ? L0.level : 0;
            if (i14 < max7) {
                this.h = new org.telegram.ui.ActionBar.y2(Math.max(i14, min9), context, p6Var, true);
            }
        }
        setContentDescription(L02);
        this.f44184f = new org.telegram.ui.Components.qz0(L02, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float L;
        int L2;
        int z10;
        int measuredWidth;
        int z11;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = org.telegram.messenger.i0.L(64.0f) / 2;
        if (org.telegram.messenger.cd.X) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.e;
        rf.o.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.i0.L(171.0f);
        int i11 = 0;
        org.telegram.ui.ActionBar.y2 y2Var = this.h;
        if (y2Var != null) {
            i10 = org.telegram.messenger.i0.L(8.0f) + y2Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.qz0 qz0Var = this.f44184f;
        qz0Var.f29784p = measuredWidth4 - i10;
        if (org.telegram.messenger.cd.X) {
            L = (getMeasuredWidth() - qz0Var.k()) - org.telegram.messenger.i0.L(71.0f);
        } else {
            L = org.telegram.messenger.i0.L(71.0f);
        }
        qz0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (y2Var != null) {
            int k10 = (int) (qz0Var.k() + L + org.telegram.messenger.i0.L(6.0f));
            y2Var.setBounds(k10, 0, k10, getHeight());
            y2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        boolean z12 = this.f44183c;
        if (z12 && this.f44190y != null) {
            if (org.telegram.messenger.cd.X) {
                measuredWidth3 = org.telegram.messenger.i0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
            }
            this.f44190y.setBounds(measuredWidth3 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f44190y.f(org.telegram.messenger.i0.N(3.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var));
            this.f44190y.draw(canvas);
        } else if (this.f44189x != null && this.f44190y != null) {
            if (org.telegram.messenger.cd.X) {
                measuredWidth2 = org.telegram.messenger.i0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
            }
            this.f44190y.setBounds(measuredWidth2 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            on0 on0Var = this.f44190y;
            float N = org.telegram.messenger.i0.N(3.0f);
            int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
            on0Var.f(N, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            this.f44190y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.i0.L(18.0f);
            this.f44189x.setBounds(L5 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f44189x.f(org.telegram.messenger.i0.N(3.0f), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            this.f44189x.draw(canvas);
        } else if (this.f44186r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.i0.L(116.0f);
            float k11 = qz0Var.k();
            if (y2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.i0.L(12.0f) + y2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.i0.L(164.0f)));
            int min2 = (int) Math.min(this.f44186r.k(), min);
            RectF rectF = org.telegram.messenger.i0.P;
            if (org.telegram.messenger.cd.X) {
                z10 = org.telegram.messenger.i0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.m5.z(33.0f, getMeasuredWidth(), min2);
            }
            float f7 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.cd.X) {
                measuredWidth = org.telegram.messenger.i0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(15.0f);
            }
            rectF.set(f7, measuredHeight, measuredWidth, (org.telegram.messenger.i0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.f44185n);
            org.telegram.ui.Components.qz0 qz0Var2 = this.f44186r;
            qz0Var2.f29784p = min;
            if (org.telegram.messenger.cd.X) {
                z11 = org.telegram.messenger.i0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.m5.z(24.0f, getMeasuredWidth(), min2);
            }
            qz0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f44188w) {
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.cd.X) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i11 = org.telegram.messenger.i0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i11, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.f44188w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        on0 on0Var;
        int w02;
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
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
        org.telegram.messenger.kp kpVar = null;
        this.f44186r = new org.telegram.ui.Components.qz0(org.telegram.messenger.k6.m(trim, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.i0.o());
        on0 on0Var2 = this.f44189x;
        if (on0Var2 != null) {
            on0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f44181a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = on0.f40307j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f44189x = new on0(i15, i15, i15, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.h20.l(user) >= 0) {
                on0Var = on0.c(i13, org.telegram.messenger.h20.l(user));
                on0Var.f40308a = org.telegram.messenger.i0.L(11.0f);
                on0Var.d();
            } else {
                on0Var = null;
            }
            this.f44189x = on0Var;
        }
        on0 on0Var3 = this.f44189x;
        if (on0Var3 != null) {
            on0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f44185n;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (p6Var != null) {
                q6 = p6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.t6.I.q();
            }
            if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
                i10 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i10 = tL_peerColorCollectible.accent_color;
            }
            if (!q6 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i11 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            if (arrayList.size() >= 3) {
                i12 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i12 = intValue;
            }
            this.f44186r.n(i10);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i10));
            on0 on0Var4 = new on0(intValue, i11, i12, tL_peerColorCollectible.gift_emoji_id);
            on0Var4.f40308a = org.telegram.messenger.i0.L(11.0f);
            on0Var4.d();
            this.f44190y = on0Var4;
            on0Var4.e(this);
            return;
        }
        int e = org.telegram.messenger.h20.e(user);
        if (e < 7) {
            int i16 = org.telegram.ui.ActionBar.t6.f21188r8[e];
            this.f44187s = i16;
            w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
        } else {
            org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18888r4;
            if (lpVar != null) {
                kpVar = lpVar.d(e);
            }
            if (kpVar != null) {
                this.f44187s = -1;
                w02 = kpVar.f();
            } else {
                int i17 = org.telegram.ui.ActionBar.t6.f21188r8[0];
                this.f44187s = i17;
                w02 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var);
            }
        }
        this.f44186r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
        on0 a2 = on0.a(i13, e);
        a2.f40308a = org.telegram.messenger.i0.L(11.0f);
        a2.d();
        this.f44190y = a2;
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z10 = this.f44182b;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.f21095m6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.q6;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        if (!this.D || this.E != w02) {
            this.D = true;
            this.E = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i11 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.q6;
        }
        this.f44184f.n(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        if (this.f44186r != null && (paint = this.f44185n) != null && (i12 = this.f44187s) != -1) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            this.f44186r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
