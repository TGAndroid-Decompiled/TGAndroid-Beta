package rh;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.rv0;
public final class i0 extends org.telegram.ui.ActionBar.z2 {
    public final ec0 f47062i1;
    public final EditTextBoldCursor f47063j1;
    public final TextView f47064k1;
    public final org.telegram.ui.Components.f6 l1;
    public final vh.d f47065m1;
    public final org.telegram.ui.Components.f6 f47066n1;
    public final org.telegram.ui.Cells.u8 f47067o1;
    public final ImageView f47068p1;
    public final ImageView f47069q1;
    public final sf.a f47070r1;
    public final sf.a f47071s1;
    public final sf.a f47072t1;
    public final sf.a f47073u1;
    public sf.a f47074v1;
    public int f47075w1;

    public i0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, sf.a aVar, e3 e3Var) {
        super(1, context, p6Var, true);
        boolean z10;
        float f7;
        int i11;
        this.f21583a = i10;
        this.P0 = true;
        this.D = true;
        org.telegram.messenger.s0 s0Var = vp.r1(i10).f18957y7;
        long max = Math.max(s0Var.f17852r.f17206a.f17027c, 10000000L);
        sf.b bVar = sf.b.f48257b;
        this.f47072t1 = sf.a.i(max, bVar);
        this.f47073u1 = sf.a.i(s0Var.f17853s.f17206a.f17027c, bVar);
        sf.b bVar2 = sf.b.f48256a;
        this.f47070r1 = sf.a.g(((org.telegram.messenger.l0) s0Var.f17850p.f10700a).f16658c, bVar2);
        this.f47071s1 = sf.a.g(((org.telegram.messenger.l0) s0Var.f17851q.f10700a).f16658c, bVar2);
        Q(org.telegram.ui.ActionBar.t6.f21001h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
        linearLayout.addView(f10, w7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.l1 = f6Var;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i12, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(20.0f));
        f6Var.setGravity(8388627);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f10.addView(f6Var, w7.b6.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, null);
        this.f47062i1 = ec0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47063j1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ec0Var.b(1.0f, f7, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 6));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        linearLayout2.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f47068p1 = imageView;
        imageView.setImageResource(2131232749);
        ec0Var.addView(imageView, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47069q1 = imageView2;
        imageView2.setImageResource(2131231956);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f47066n1 = f6Var2;
        int i13 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, null);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var2.setGravity(5);
        ec0Var.addView(f6Var2, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f47064k1 = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.u8 u8Var = new org.telegram.ui.Cells.u8(context);
        this.f47067o1 = u8Var;
        u8Var.f23147c.setLayoutParams(w7.b6.d(20, 20.0f, (cd.X ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        u8Var.b(cd.L0(2131746145, null), cd.L0(2131746146, null), true, false);
        u8Var.setOnClickListener(new s(this, 2));
        linearLayout2.addView(u8Var, w7.b6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.b6.r(-1, -2, 80));
        vh.d i14 = z20.i(24, context, p6Var, true);
        this.f47065m1 = i14;
        i14.setOnClickListener(new rv0(26, this, e3Var));
        i14.i(cd.L0(2131746168, null), false, true);
        linearLayout3.addView(i14, w7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            i11 = 0;
            J0(sf.a.i(aVar.f48255b, aVar.f48254a), !aVar.k(), true, false);
        } else {
            i11 = 0;
            J0(sf.a.i(0L, bVar2), false, true, false);
        }
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new h0(this, i11));
    }

    public final sf.a I0() {
        if (this.f47074v1.f48254a == sf.b.f48257b) {
            return this.f47073u1;
        }
        return this.f47071s1;
    }

    public final void J0(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        sf.a aVar2;
        int i10;
        int i11;
        sf.a aVar3;
        boolean z16;
        float f7;
        float f10;
        double d;
        boolean z17;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        sf.a aVar4;
        sf.a aVar5 = this.f47074v1;
        int i12 = this.f47075w1;
        this.f47075w1 = 0;
        if (aVar != null) {
            this.f47074v1 = aVar;
        } else {
            this.f47074v1 = sf.a.i(0L, aVar5.f48254a);
            this.f47075w1 |= 1;
        }
        long j11 = I0().f48255b;
        sf.a aVar6 = this.f47074v1;
        if (j11 < aVar6.f48255b) {
            this.f47075w1 |= 4;
        }
        boolean k10 = aVar6.k();
        sf.a aVar7 = this.f47070r1;
        sf.a aVar8 = this.f47072t1;
        sf.b bVar = sf.b.f48257b;
        if (!k10) {
            sf.a aVar9 = this.f47074v1;
            if (aVar9.f48254a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f48255b > aVar9.f48255b) {
                this.f47075w1 |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f48254a == this.f47074v1.f48254a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f48255b == this.f47074v1.f48255b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.f47075w1) {
            z15 = false;
        } else {
            z15 = true;
        }
        ec0 ec0Var = this.f47062i1;
        if (z15) {
            if ((this.f47075w1 & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            ec0Var.a(f19);
        }
        sf.b bVar2 = sf.b.f48256a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f47063j1;
        if (z13) {
            sf.b bVar3 = this.f47074v1.f48254a;
            org.telegram.ui.Components.f6 f6Var = this.l1;
            if (bVar3 == bVar2) {
                f6Var.c(cd.L0(2131746140, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                f6Var.c(cd.L0(2131746139, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            ep epVar = this.f47067o1.f23147c;
            if (this.f47074v1.f48254a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            epVar.a(z17, z12);
            ImageView imageView = this.f47069q1;
            ImageView imageView2 = this.f47068p1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i10 = 2;
                if (this.f47074v1.f48254a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.f47074v1.f48254a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.f47074v1.f48254a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f47074v1.f48254a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.f47074v1.f48254a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.f47074v1.f48254a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                i10 = 2;
                if (this.f47074v1.f48254a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.f47074v1.f48254a == bVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
            i10 = 2;
        }
        if (z13 || z15) {
            int i13 = this.f47075w1;
            if ((i13 & 4) != 0) {
                ec0Var.setText(cd.a0(null, null, 2131746142, I0().f()));
            } else if ((i13 & 2) != 0) {
                if (this.f47074v1.f48254a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                ec0Var.setText(cd.a0(null, null, 2131746141, aVar3.f()));
            } else {
                if (this.f47074v1.f48254a == bVar2) {
                    i11 = 2131746144;
                } else {
                    i11 = 2131746143;
                }
                ec0Var.setText(cd.L0(i11, null));
            }
        }
        if (z13 || z14 || z15) {
            if (this.f47075w1 == 0 && this.f47074v1.f48255b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            vh.d dVar = this.f47065m1;
            if (dVar.f51052c0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    z20.l(animate3, f10, 180L);
                } else {
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.6f;
                    }
                    dVar.setAlpha(f7);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.s0 s0Var = vp.r1(this.f21583a).f18957y7;
            sf.a aVar10 = this.f47074v1;
            sf.b bVar4 = aVar10.f48254a;
            long j13 = aVar10.f48255b;
            TextView textView = this.f47064k1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.i0.W2(cd.G((int) sf.a.i((j13 * ((org.telegram.messenger.l0) s0Var.f17847n.f10700a).f16658c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.m5.q(null, null, 2131746149, new Object[]{sf.a.i((j13 * ((org.telegram.messenger.l0) s0Var.f17849o.f10700a).f16658c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f47074v1.f48254a == bVar) {
                d = ((org.telegram.messenger.k0) vp.r1(this.f21583a).f18957y7.f17844l.f13480b).f16499a;
            } else {
                d = vp.r1(this.f21583a).f18768d6 * 1.0E-5d;
            }
            org.telegram.messenger.u1 i14 = org.telegram.messenger.u1.i();
            long c10 = (long) (this.f47074v1.c() * d * 100.0d);
            i14.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", i10, c10, false));
            this.f47066n1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f47074v1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 12), 50L);
    }
}
