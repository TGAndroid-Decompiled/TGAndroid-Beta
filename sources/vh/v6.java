package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
public final class v6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.p6 f52055a;
    public final org.telegram.ui.Components.r8 f52056b;
    public final org.telegram.ui.Components.g9 f52057c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final ep f52058f;
    public final RadioButton h;
    public final Paint f52059n;
    public boolean f52060r;
    public boolean f52061s;
    public boolean f52062w;
    public final boolean[] f52063x;
    public long f52064y;

    public v6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f52056b = r8Var;
        this.f52059n = new Paint(1);
        this.f52060r = false;
        this.f52061s = true;
        this.f52062w = true;
        this.f52063x = new boolean[1];
        this.f52055a = p6Var;
        r8Var.f29873r = org.telegram.messenger.i0.L(40.0f);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f52057c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        addView(g9Var);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, p6Var);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        zs.i(u5Var);
        addView(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var2;
        u5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i11, p6Var);
        u5Var2.setGravity(cd.X ? 5 : 3);
        zs.i(u5Var2);
        addView(u5Var2);
        ep epVar = new ep(21, context, p6Var);
        this.f52058f = epVar;
        int i12 = org.telegram.ui.ActionBar.t6.B5;
        int i13 = org.telegram.ui.ActionBar.t6.f21039j7;
        epVar.b(i12, i13, org.telegram.ui.ActionBar.t6.C5);
        epVar.setDrawUnchecked(true);
        epVar.setDrawBackgroundAsArc(10);
        addView(epVar);
        epVar.a(false, false);
        epVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, i13, org.telegram.ui.ActionBar.t6.E5, p6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        if (charSequence == null) {
            u5Var.setTranslationY(0.0f);
            u5Var2.setVisibility(8);
            return;
        }
        u5Var.setTranslationY(org.telegram.messenger.i0.L(-9.0f));
        u5Var2.setTranslationY(org.telegram.messenger.i0.L(12.0f));
        u5Var2.l(charSequence, false);
        u5Var2.setVisibility(0);
    }

    public final void a(int i10, TLRPC.Chat chat) {
        long j10;
        float f7;
        String lowerCase;
        int i11;
        int i12;
        float f10;
        int i13;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f19793id;
        }
        this.f52064y = j10;
        org.telegram.ui.Components.r8 r8Var = this.f52056b;
        r8Var.q(chat);
        if (org.telegram.messenger.w3.c0(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        org.telegram.ui.Components.g9 g9Var = this.f52057c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.l(org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f52063x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f52060r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.w3.V(chat);
            if (i10 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = cd.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i13 = 2131751391;
                } else {
                    i13 = 2131754876;
                }
                lowerCase = cd.L0(i13, null);
            }
        } else if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
            if (i10 >= 1) {
                lowerCase = cd.H(',', "Subscribers", i10 - 1);
            } else if (!org.telegram.messenger.w3.t0(chat)) {
                lowerCase = cd.L0(2131752329, null).toLowerCase();
            } else {
                lowerCase = cd.L0(2131752318, null).toLowerCase();
            }
        } else if (i10 >= 1) {
            lowerCase = cd.H(',', "Members", i10 - 1);
        } else if (chat.has_geo) {
            lowerCase = cd.L0(2131748657, null);
        } else if (!org.telegram.messenger.w3.t0(chat)) {
            lowerCase = cd.L0(2131748656, null).toLowerCase();
        } else {
            lowerCase = cd.L0(2131748653, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i11 = org.telegram.ui.ActionBar.t6.f21114n5;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21185r5;
        }
        org.telegram.ui.ActionBar.a7.Y(this.e, i11, this.f52055a);
        if (this.f52061s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f52058f.setVisibility(i12);
        this.h.setVisibility(8);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        b(false, f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    public final void b(boolean z10, float f7) {
        RadioButton radioButton = this.h;
        ep epVar = this.f52058f;
        if (z10) {
            if (Math.abs(epVar.getAlpha() - f7) > 0.1d) {
                epVar.animate().cancel();
                epVar.animate().alpha(f7).start();
            }
            if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f7).start();
                return;
            }
            return;
        }
        epVar.animate().cancel();
        epVar.setAlpha(f7);
        radioButton.animate().cancel();
        radioButton.setAlpha(f7);
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f52058f;
        if (epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f52060r = z10;
        if (z11 != this.f52061s) {
            this.f52061s = z11;
            f();
        }
        if (!this.f52061s) {
            this.h.setVisibility(8);
            this.f52058f.setVisibility(8);
        }
        if (!this.D && (this.f52061s || !this.f52060r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, int i11, TLRPC.User user) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f52055a;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        org.telegram.ui.Components.r8 r8Var = this.f52056b;
        int i12 = 0;
        if (i10 == 4) {
            u5Var.l(cd.L0(2131744554, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(cd.a0(null, null, 2131744550, h20.p(user)), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744555, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21114n5, p6Var);
            r8Var.g(7);
            r8Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            u5Var.l(cd.L0(2131744556, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(cd.a0(null, null, 2131744550, h20.p(user)), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744555, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21114n5, p6Var);
            r8Var.g(4);
            r8Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            u5Var.l(cd.L0(2131744558, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(h20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744557, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21114n5, p6Var);
            r8Var.g(15);
            r8Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            u5Var.l(cd.L0(2131744546, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(h20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744545, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21114n5, p6Var);
            r8Var.g(6);
            r8Var.i(-18621, -618956);
        }
        this.f52058f.setVisibility(8);
        if (!this.f52061s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.g9 g9Var = this.f52057c;
        g9Var.setImageDrawable(r8Var);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
    }

    public final void f() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        int i15;
        int i16;
        int i17 = 3;
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z10 = this.f52061s;
        if (z10) {
            f7 = 53.0f;
        } else {
            f7 = 16.0f;
        }
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f52057c.setLayoutParams(w7.b6.d(40, 40.0f, i18, f7, 0.0f, f10, 0.0f));
        boolean z11 = cd.X;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 16;
        int i20 = 68;
        float f14 = 20.0f;
        if (z11) {
            f11 = 20.0f;
        } else {
            if (this.f52061s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f11 = i12;
        }
        if (z11) {
            if (this.f52061s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f12 = i16;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(w7.b6.d(-1, -2.0f, i19, f11, 0.0f, f12, 0.0f));
        boolean z12 = cd.X;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i21 = i13 | 16;
        if (z12) {
            f13 = 20.0f;
        } else {
            if (this.f52061s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f13 = i14;
        }
        if (z12) {
            if (this.f52061s) {
                i20 = 105;
            }
            f14 = i20;
        }
        this.e.setLayoutParams(w7.b6.d(-1, -2.0f, i21, f13, 0.0f, f14, 0.0f));
        if (cd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f52058f.setLayoutParams(w7.b6.d(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (cd.X) {
            i17 = 5;
        }
        this.h.setLayoutParams(w7.b6.d(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        dq dqVar = new dq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(12.0f));
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, this.f52055a);
            Paint paint2 = this.f52059n;
            paint2.setColor(w02);
            if (cd.X) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.i0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.E;
        if (path != null && (paint = this.F) != null && !this.f52061s && this.f52060r && this.f52062w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: vh.v6.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f52060r && !this.f52061s) {
            f7 = 62.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
        if (!this.f52061s && this.f52060r) {
            Path path = this.E;
            if (path == null) {
                this.E = new Path();
            } else {
                path.rewind();
            }
            if (cd.X) {
                measuredWidth = org.telegram.messenger.i0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(31.0f);
            }
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (cd.X) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            this.E.moveTo(f11, measuredHeight - org.telegram.messenger.i0.L(6.0f));
            this.E.lineTo((f10 * org.telegram.messenger.i0.L(6.0f)) + f11, measuredHeight);
            this.E.lineTo(f11, measuredHeight + org.telegram.messenger.i0.L(6.0f));
            if (this.F == null) {
                Paint paint = new Paint(1);
                this.F = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.F.setStrokeCap(Paint.Cap.ROUND);
            }
            this.F.setStrokeWidth(org.telegram.messenger.i0.N(1.86f));
            this.F.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f52055a)));
        }
    }

    public void set(Object obj) {
        int i10;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        if (z10) {
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            u5Var.setTypeface(null);
            int i11 = -org.telegram.messenger.i0.L(52.0f);
            if (cd.X) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            u5Var.setTranslationX(i11 * i10);
            u5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.D = z10;
        if (!z10 && (this.f52061s || !this.f52060r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i10;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.kk;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.B5;
        }
        this.f52058f.b(i10, org.telegram.ui.ActionBar.t6.f21039j7, org.telegram.ui.ActionBar.t6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f19942id;
        }
        this.f52064y = j10;
        org.telegram.ui.Components.r8 r8Var = this.f52056b;
        r8Var.r(user);
        int L = org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.Components.g9 g9Var = this.f52057c;
        g9Var.setRoundRadius(L);
        g9Var.e(user, r8Var);
        String p5 = h20.p(user);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        int i11 = 0;
        u5Var.l(org.telegram.messenger.k6.m(p5, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f52063x;
        zArr[0] = false;
        boolean z10 = this.f52060r;
        org.telegram.ui.ActionBar.p6 p6Var = this.f52055a;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        if (z10) {
            setSubtitle(cd.L0(2131743375, null));
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21185r5, p6Var);
        } else {
            setSubtitle(cd.d0(d20.f15147s0, user, zArr, null));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.t6.f21114n5;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f21185r5;
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, i10, p6Var);
        }
        if (!this.f52061s) {
            i11 = 8;
        }
        ep epVar = this.f52058f;
        epVar.setVisibility(i11);
        epVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f52055a)));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
