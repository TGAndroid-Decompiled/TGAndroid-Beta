package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.cd;
import org.telegram.messenger.oj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.oe0;
import org.telegram.ui.un;
import org.telegram.ui.zd;
public final class e0 extends org.telegram.ui.ActionBar.z2 {
    public int A1;
    public boolean B1;
    public final dq[] C1;
    public final dq[] D1;
    public boolean E1;
    public final a f46772i1;
    public final boolean f46773j1;
    public final int f46774k1;
    public final t30 l1;
    public final ec0 f46775m1;
    public final EditTextBoldCursor f46776n1;
    public final TextView f46777o1;
    public final zd f46778p1;
    public final vh.d f46779q1;
    public final org.telegram.ui.Components.f6 f46780r1;
    public final ImageView f46781s1;
    public final ImageView f46782t1;
    public final sf.a f46783u1;
    public final sf.a f46784v1;
    public final sf.a f46785w1;
    public final sf.a f46786x1;
    public sf.a f46787y1;
    public long f46788z1;

    public e0(final Context context, int i10, long j10, oj ojVar, un unVar, final org.telegram.ui.ActionBar.p6 p6Var, int i11, q20 q20Var) {
        super(1, context, p6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.f46788z1 = -1L;
        this.C1 = new dq[1];
        this.D1 = new dq[1];
        this.f46774k1 = i11;
        this.D = true;
        this.P0 = true;
        boolean z13 = org.telegram.messenger.w3.z(i10, 24, j10);
        this.f46773j1 = z13;
        if (!z13 && !e6.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.s0 s0Var = vp.r1(i10).f18957y7;
        long j11 = s0Var.f17835g.f17206a.f17027c;
        sf.b bVar = sf.b.f48257b;
        this.f46785w1 = sf.a.i(j11, bVar);
        this.f46786x1 = sf.a.i(s0Var.h.f17206a.f17027c, bVar);
        sf.b bVar2 = sf.b.f48256a;
        this.f46783u1 = sf.a.g(((org.telegram.messenger.l0) s0Var.d.f10700a).f16658c, bVar2);
        this.f46784v1 = sf.a.g(((org.telegram.messenger.l0) s0Var.e.f10700a).f16658c, bVar2);
        if (!z13) {
            a aVar = new a(i10, context, p6Var);
            this.f46772i1 = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.f21589c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.e6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                public final e0 f46694b;

                {
                    this.f46694b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f46694b.f46787y1.f48254a == sf.b.f48256a) {
                                new y7(context, p6Var).show();
                                return;
                            }
                            return;
                        default:
                            e0 e0Var = this.f46694b;
                            ((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.S(context, e0Var.f46788z1, new d0(e0Var, 0), p6Var, 0).f11587b).show();
                            return;
                    }
                }
            });
        } else {
            this.f46772i1 = null;
        }
        Q(org.telegram.ui.ActionBar.t6.f21001h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
        linearLayout.addView(f10, w7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i11 == 0) {
            i12 = 2131747092;
        } else {
            i12 = 2131747099;
        }
        textView.setText(cd.L0(i12, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, w7.b6.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        int i14 = org.telegram.ui.ActionBar.t6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var, mode);
        w7.e6.a(imageView);
        boolean z14 = z10;
        imageView.setOnClickListener(new s(this, 1));
        f10.addView(imageView, w7.b6.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f46776n1 = editTextBoldCursor;
        if (z14) {
            t30 t30Var = new t30(context, p6Var);
            this.l1 = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cd.L0(2131744403, null));
            arrayList.add(cd.L0(2131744402, null));
            t30Var.b(arrayList, new x(this, 1));
            linearLayout.addView(t30Var, w7.b6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.l1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
        linearLayout.addView(f11, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, null);
        this.f46775m1 = ec0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        sf.a aVar2 = ojVar.f17275a;
        if (aVar2 != null && !aVar2.k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ec0Var.b(1.0f, f7, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 5));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        f11.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f46781s1 = imageView2;
        imageView2.setImageResource(2131232749);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f46782t1 = imageView3;
        imageView3.setImageResource(2131231956);
        ec0Var.addView(imageView3, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f46780r1 = f6Var;
        int i15 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i15, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var.setGravity(5);
        ec0Var.addView(f6Var, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f46777o1 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i15, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        zd zdVar = new zd(context, 5);
        this.f46778p1 = zdVar;
        zdVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        zdVar.setCursorWidth(1.5f);
        zdVar.setTextSize(1, 17.0f);
        zdVar.setMaxLines(1);
        zdVar.setBackground(null);
        zdVar.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(zdVar, i13, null);
        zdVar.setFocusable(false);
        zdVar.setClickable(false);
        zdVar.setEnabled(false);
        ec0 ec0Var2 = new ec0(context, null);
        ec0Var2.setText(cd.L0(2131747089, null));
        ec0Var2.e(zdVar);
        ec0Var2.addView(zdVar, w7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.e6.b(ec0Var2, 0.02f, 1.2f);
        ec0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f46694b;

            {
                this.f46694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f46694b.f46787y1.f48254a == sf.b.f48256a) {
                            new y7(context, p6Var).show();
                            return;
                        }
                        return;
                    default:
                        e0 e0Var = this.f46694b;
                        ((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.S(context, e0Var.f46788z1, new d0(e0Var, 0), p6Var, 0).f11587b).show();
                        return;
                }
            }
        });
        f11.addView(ec0Var2, w7.b6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(2131230871);
        org.telegram.ui.ActionBar.a7.t(imageView4, i14, p6Var, mode);
        ec0Var2.addView(imageView4, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView3, i15, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.L0(2131747109, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.m5.p(null, null, 2131747108, new Object[]{Long.valueOf(vp.r1(i10).f18957y7.f17838i.a(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, w7.b6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.b6.r(-1, -2, 80));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.f46779q1 = dVar;
        dVar.setOnClickListener(new oe0(this, unVar, i10, context, p6Var, j10, q20Var));
        if (i11 == 1) {
            dVar.i(cd.L0(2131747098, null), false, true);
        }
        linearLayout2.addView(dVar, w7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar2 != null) {
            z12 = false;
            M0(sf.a.i(aVar2.f48255b, aVar2.f48254a), !aVar2.k(), true, false);
        } else {
            z12 = false;
            M0(sf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = ojVar.f17276b;
        if (this.f46788z1 != j12) {
            this.f46788z1 = j12;
            zdVar.setText(K0(j12));
        }
        J0(z12);
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ag.a1(this, 29));
    }

    public static String K0(long j10) {
        if (j10 <= 0) {
            return cd.L0(2131747107, null);
        }
        String x10 = cd.x(j10, true);
        if (!x10.isEmpty()) {
            return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
        }
        return x10;
    }

    public final void I0() {
        boolean z10;
        float f7;
        boolean z11 = this.E1;
        a aVar = this.f46772i1;
        if ((z11 && !this.I && aVar != null && this.f21586b.getY() > org.telegram.messenger.i0.L(32.0f)) || this.l1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.B1 != z10) {
            this.B1 = z10;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                z20.l(scaleY, f11, 180L);
            }
        }
    }

    public final void J0(boolean z10) {
        boolean z11;
        if (this.A1 == 0 && (this.f46787y1.f48255b >= 0 || this.f46788z1 > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        vh.d dVar = this.f46779q1;
        if (dVar.f51052c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                z20.l(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final sf.a L0() {
        if (this.f46787y1.f48254a == sf.b.f48257b) {
            return this.f46786x1;
        }
        return this.f46784v1;
    }

    public final void M0(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i10;
        int i11;
        boolean z16;
        String E;
        dq[] dqVarArr;
        double d;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float f17;
        sf.a aVar2;
        sf.a aVar3 = this.f46787y1;
        int i13 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.f46787y1 = aVar;
        } else {
            this.f46787y1 = sf.a.i(0L, aVar3.f48254a);
            this.A1 |= 1;
        }
        long j10 = L0().f48255b;
        sf.a aVar4 = this.f46787y1;
        if (j10 < aVar4.f48255b) {
            this.A1 |= 4;
        }
        boolean k10 = aVar4.k();
        sf.a aVar5 = this.f46783u1;
        sf.a aVar6 = this.f46785w1;
        sf.b bVar = sf.b.f48257b;
        if (!k10) {
            sf.a aVar7 = this.f46787y1;
            if (aVar7.f48254a == bVar) {
                aVar2 = aVar6;
            } else {
                aVar2 = aVar5;
            }
            if (aVar2.f48255b > aVar7.f48255b) {
                this.A1 |= 2;
            }
        }
        if (!z11 && aVar3.f48254a == this.f46787y1.f48254a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar3.f48255b == this.f46787y1.f48255b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i13 == this.A1) {
            z15 = false;
        } else {
            z15 = true;
        }
        ec0 ec0Var = this.f46775m1;
        if (z15) {
            if ((this.A1 & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            ec0Var.a(f17);
        }
        sf.b bVar2 = sf.b.f48256a;
        EditTextBoldCursor editTextBoldCursor = this.f46776n1;
        if (z13) {
            t30 t30Var = this.l1;
            boolean z17 = false;
            if (t30Var != null) {
                if (this.f46787y1.f48254a == bVar2) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                t30Var.a(i12, z12);
            }
            sf.b bVar3 = this.f46787y1.f48254a;
            TextView textView = this.f46777o1;
            if (bVar3 == bVar2) {
                textView.setText(cd.L0(2131747095, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(cd.L0(2131747094, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.f46782t1;
            ImageView imageView2 = this.f46781s1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i10 = 2;
                if (this.f46787y1.f48254a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.f46787y1.f48254a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.f46787y1.f48254a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f46787y1.f48254a == bVar) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.f46787y1.f48254a == bVar) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.f46787y1.f48254a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                i10 = 2;
                if (this.f46787y1.f48254a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.f46787y1.f48254a == bVar) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar8 = this.f46772i1;
            r16 = z17;
            if (aVar8 != null) {
                sf.b bVar4 = this.f46787y1.f48254a;
                r16 = z17;
                if (aVar8.e != bVar4) {
                    aVar8.e = bVar4;
                    aVar8.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
            i10 = 2;
        }
        if (z13 || z15) {
            int i14 = this.A1;
            if ((i14 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[r16] = L0().f();
                ec0Var.setText(cd.a0(null, null, 2131744444, objArr));
            } else if ((i14 & 2) != 0) {
                if (this.f46787y1.f48254a == bVar) {
                    aVar5 = aVar6;
                }
                String f18 = aVar5.f();
                Object[] objArr2 = new Object[1];
                objArr2[r16] = f18;
                ec0Var.setText(cd.a0(null, null, 2131744443, objArr2));
            } else {
                if (this.f46787y1.f48254a == bVar2) {
                    i11 = 2131747091;
                } else {
                    i11 = 2131747090;
                }
                ec0Var.setText(cd.L0(i11, null));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.f46774k1;
            vh.d dVar = this.f46779q1;
            if (i15 == 0) {
                if (!this.f46787y1.k()) {
                    sf.a aVar9 = this.f46787y1;
                    if (aVar9.f48254a == bVar) {
                        z16 = true;
                    } else {
                        z16 = r16;
                    }
                    if (z16) {
                        E = aVar9.b();
                    } else {
                        E = cd.E(aVar9.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[r16] = E;
                    String a02 = cd.a0(null, null, 2131747096, objArr3);
                    if (z16) {
                        dqVarArr = this.D1;
                    } else {
                        dqVarArr = this.C1;
                    }
                    dVar.i(h8.r1(h8.X0(z16, a02, dqVarArr), z16), z12, true);
                } else {
                    dVar.i(cd.L0(2131747097, null), z12, true);
                }
            } else {
                dVar.i(cd.L0(2131747098, null), z12, true);
            }
            J0(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f46787y1.f48254a == bVar) {
                d = ((org.telegram.messenger.k0) vp.r1(this.f21583a).f18957y7.f17844l.f13480b).f16499a;
            } else {
                d = vp.r1(this.f21583a).f18768d6 * 1.0E-5d;
            }
            org.telegram.messenger.u1.i().getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", i10, (long) (this.f46787y1.c() * d * 100.0d), r16));
            this.f46780r1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f46787y1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean Y(float f7, float f10) {
        a aVar;
        if (this.B1 && (aVar = this.f46772i1) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.Y(f7, f10);
    }

    @Override
    public final void g0(float f7) {
        super.g0(f7);
        I0();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 11), 50L);
    }

    @Override
    public final void w() {
        this.E1 = true;
        I0();
    }
}
