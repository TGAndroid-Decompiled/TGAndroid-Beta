package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class v6 extends rg.b {
    public final int d;
    public final Context f52689e;
    public final org.telegram.ui.ActionBar.h2 f52690f;

    public v6(int i7, Context context, org.telegram.ui.ActionBar.h2 h2Var) {
        this.d = i7;
        this.f52690f = h2Var;
        this.f52689e = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        switch (this.d) {
            case 0:
                x6 x6Var = (x6) this.f52690f;
                if (f1Var.b() != x6Var.K && (((i7 = f1Var.f59127f) != 2 || x6Var.H <= 0 || x6Var.L) && i7 != 5 && i7 != 7 && i7 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = f1Var.f59127f;
                if (i10 != 0 && i10 != 4) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.d) {
            case 0:
                return ((x6) this.f52690f).f53614g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f52690f).J.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((t6) ((x6) this.f52690f).f53614g0.get(i7)).f56589a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52690f;
                if (i7 >= 0 && i7 < notificationsCustomSettingsActivity.J.size()) {
                    return ((qh0) notificationsCustomSettingsActivity.J.get(i7)).f56589a;
                }
                return 5;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String str;
        org.telegram.ui.Cells.n8 n8Var;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.h2 h2Var = this.f52690f;
        boolean z13 = true;
        switch (i11) {
            case 0:
                x6 x6Var = (x6) h2Var;
                ArrayList arrayList = x6Var.f53614g0;
                t6 t6Var = (t6) arrayList.get(i7);
                int i12 = f1Var.f59127f;
                View view = f1Var.f59123a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 7) {
                                    switch (i12) {
                                        case 9:
                                            x6Var.y0();
                                            return;
                                        case 10:
                                            k6 k6Var = x6Var.Y;
                                            if (k6Var != null && !x6Var.L) {
                                                long j3 = x6Var.H;
                                                if (j3 <= 0) {
                                                    z13 = false;
                                                }
                                                long j10 = x6Var.I;
                                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j3) / ((float) j10);
                                                }
                                                long j11 = x6Var.J;
                                                if (j11 > 0 && i13 > 0) {
                                                    f11 = ((float) (j10 - j11)) / ((float) j10);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                k6Var.b(f10, f11, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                                            int i14 = t6Var.f52184f;
                                            if (i14 < 0) {
                                                z10 = x6Var.t0();
                                            } else {
                                                z10 = x6Var.d[i14];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = t6Var.d;
                                            int[] iArr = x6Var.V;
                                            int i15 = t6Var.f52184f;
                                            if (i15 < 0) {
                                                i15 = 9;
                                            }
                                            int i16 = iArr[i15];
                                            if (i16 <= 0) {
                                                format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                            } else {
                                                format = String.format("%d%%", Integer.valueOf(i16));
                                            }
                                            SpannableString spannableString = new SpannableString(format);
                                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                            spannableString.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(t6Var.f52185g, false, false);
                                            if (t6Var.f52184f >= 0 ? !t6Var.f52187j : !x6Var.M) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            d2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i17 = t6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.n6.f29524k7;
                                            org.telegram.ui.Components.mp mpVar = d2Var.f30531r;
                                            if (mpVar != null) {
                                                mpVar.b(i17, i17, i18);
                                            }
                                            if (t6Var.f52184f < 0) {
                                                bool = Boolean.valueOf(x6Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            d2Var.setCollapsed(bool);
                                            if (t6Var.f52184f == -1) {
                                                d2Var.d(new a(this, 6), new ni.b(7, this, d2Var));
                                            } else {
                                                d2Var.d(null, null);
                                            }
                                            d2Var.setPad(t6Var.f52186i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                                org.telegram.messenger.v2 v2Var = x6Var.getMessagesController().f25778u7;
                                int i19 = t6Var.f52182c;
                                int size = v2Var.d(((t6) arrayList.get(i7)).f52182c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.gd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.v2.f(v2Var.c(i19));
                                if (((t6) arrayList.get(i7)).f52182c == 0) {
                                    n8Var = n8Var2;
                                    n8Var.r(org.telegram.messenger.gd.M0(2131746560, null), f13, true, 2131232151, -11565578, -13276952, true);
                                } else {
                                    n8Var = n8Var2;
                                    if (((t6) arrayList.get(i7)).f52182c == 1) {
                                        n8Var.r(org.telegram.messenger.gd.M0(2131749265, null), f13, true, 2131232150, -11154873, -14175180, true);
                                    } else if (((t6) arrayList.get(i7)).f52182c == 2) {
                                        n8Var.r(org.telegram.messenger.gd.M0(2131752639, null), f13, true, 2131232149, -1007845, -1996271, true);
                                    } else if (((t6) arrayList.get(i7)).f52182c == 3) {
                                        n8Var.r(org.telegram.messenger.gd.M0(2131752635, null), f13, false, 2131232156, -765355, -2148011, false);
                                    }
                                }
                                n8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                            o4Var.setText(((t6) arrayList.get(i7)).d);
                            ((t6) arrayList.get(i7)).getClass();
                            o4Var.setTopMargin(15);
                            ((t6) arrayList.get(i7)).getClass();
                            o4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) view;
                        boolean z15 = x6Var.L;
                        long j12 = x6Var.f53610e;
                        long j13 = x6Var.H;
                        long j14 = x6Var.J;
                        long j15 = x6Var.I;
                        ab.q qVar = rw0Var.J;
                        View view2 = rw0Var.f39328x;
                        TextView textView = rw0Var.f39324n;
                        TextView textView2 = rw0Var.h;
                        TextView textView3 = rw0Var.f39327w;
                        org.telegram.ui.Cells.x9 x9Var = rw0Var.E;
                        rw0Var.f39322e = z15;
                        TextView textView4 = rw0Var.f39325r;
                        textView4.setText(org.telegram.messenger.gd.a0("TotalDeviceFreeSize", null, 2131743736, org.telegram.messenger.g0.i0(j14, false, false)));
                        TextView textView5 = rw0Var.f39326s;
                        long j16 = j15 - j14;
                        textView5.setText(org.telegram.messenger.gd.a0("TotalDeviceSize", null, 2131743735, org.telegram.messenger.g0.i0(j16, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            x9Var.setVisibility(8);
                            rw0Var.F = 0.0f;
                            rw0Var.G = 0.0f;
                            if (qVar != null) {
                                qVar.c(textView3);
                            }
                        } else {
                            if (qVar != null) {
                                qVar.y(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j13 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                x9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                x9Var.c(org.telegram.messenger.gd.M0(2131752036, null), org.telegram.messenger.g0.i0(j13, false, false), false, true);
                                textView2.setText(org.telegram.messenger.gd.a0("TelegramCacheSize", null, 2131744011, org.telegram.messenger.g0.i0(j13 + j12, false, false)));
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.gd.a0("LocalDatabaseSize", null, 2131748577, org.telegram.messenger.g0.i0(j12, false, false)));
                                view2.setVisibility(8);
                                x9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j15;
                            float f15 = ((float) (j13 + j12)) / f14;
                            float f16 = ((float) j16) / f14;
                            if (rw0Var.F != f15) {
                                ValueAnimator valueAnimator = rw0Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(rw0Var.F, f15);
                                rw0Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                rw0 rw0Var2 = rw0Var;
                                                rw0Var2.getClass();
                                                rw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                rw0Var2.invalidate();
                                                return;
                                            default:
                                                rw0 rw0Var3 = rw0Var;
                                                rw0Var3.getClass();
                                                rw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                rw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                rw0Var.H.start();
                            }
                            if (rw0Var.G != f16) {
                                ValueAnimator valueAnimator2 = rw0Var.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(rw0Var.G, f16);
                                rw0Var.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                rw0 rw0Var2 = rw0Var;
                                                rw0Var2.getClass();
                                                rw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                rw0Var2.invalidate();
                                                return;
                                            default:
                                                rw0 rw0Var3 = rw0Var;
                                                rw0Var3.getClass();
                                                rw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                rw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                rw0Var.I.start();
                            }
                        }
                        org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                        rw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.W2(t6Var.f52183e));
                    return;
                }
                org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                if (i7 == x6Var.K) {
                    x9Var2.c(org.telegram.messenger.gd.M0(2131748242, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) h2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    qh0 qh0Var = (qh0) arrayList2.get(i7);
                    int i20 = i7 + 1;
                    if (i20 < arrayList2.size() && ((qh0) arrayList2.get(i20)).f56589a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = f1Var.f59127f;
                    View view3 = f1Var.f59123a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.o4) view3).setText(qh0Var.f51227e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.s8) view3).f("" + ((Object) qh0Var.f51227e), qh0Var.f51230i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.ra) view3).f(qh0Var.f51229g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.u8) view3).b(qh0Var.h, "" + ((Object) qh0Var.f51227e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view3;
                            if (qh0Var.f51227e == null) {
                                a9Var.setFixedSize(12);
                                a9Var.setText(null);
                                return;
                            }
                            a9Var.setFixedSize(0);
                            a9Var.setText(qh0Var.f51227e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.x9) view3).c(qh0Var.f51227e, qh0Var.f51228f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view3;
                            j5Var.setDrawLine(true);
                            j5Var.setChecked(qh0Var.f51230i);
                            j5Var.b(qh0Var.f51227e, qh0Var.f51228f, qh0Var.d, qh0Var.f51230i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.n8 n8Var3 = (org.telegram.ui.Cells.n8) view3;
                            if (qh0Var.d == 0) {
                                n8Var3.g(-1, org.telegram.ui.ActionBar.n6.f29615p7);
                                n8Var3.k("" + ((Object) qh0Var.f51227e), z12);
                                return;
                            }
                            n8Var3.g(org.telegram.ui.ActionBar.n6.f29729v6, org.telegram.ui.ActionBar.n6.f29710u6);
                            n8Var3.o(qh0Var.d, "" + ((Object) qh0Var.f51227e), z12);
                            return;
                        case 8:
                            ph0 ph0Var = (ph0) view3;
                            ph0Var.g(org.telegram.ui.ActionBar.n6.f29729v6, org.telegram.ui.ActionBar.n6.f29710u6);
                            CharSequence charSequence2 = qh0Var.f51227e;
                            if (qh0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = ph0Var.f50837a0.animate();
                            if (z13) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.n10.o(animate.rotation(f12), org.telegram.ui.Components.lr.h, 340L);
                            ph0Var.k(charSequence2, z12);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.wz wzVar;
        int i10;
        u6 u6Var;
        FrameLayout j5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f52689e;
        org.telegram.ui.ActionBar.h2 h2Var = this.f52690f;
        switch (i11) {
            case 0:
                x6 x6Var = (x6) h2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f39319a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f39320b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f39321c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(220, 255);
                            frameLayout.M = nVar;
                            frameLayout.setWillNotDraw(false);
                            nVar.f41054k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.i3 i3Var = new bi.i3(29, context, frameLayout);
                            frameLayout.f39323f = i3Var;
                            frameLayout.addView(i3Var, c8.ma.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, c8.ma.c(-2.0f, -1));
                            bi.p2 p2Var = new bi.p2(context, 23);
                            linearLayout.addView(p2Var, c8.ma.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f39327w = textView;
                            int i13 = org.telegram.ui.ActionBar.n6.f29786y6;
                            org.telegram.ui.ActionBar.u6.U(textView, i13, null);
                            String M0 = org.telegram.messenger.gd.M0(2131752632, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                ab.q qVar = new ab.q(textView);
                                frameLayout.J = qVar;
                                qVar.F(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f39324n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f39325r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f39326s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView5, i13, null);
                            frameLayout.f39329y = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f39329y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f39329y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f39329y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f39329y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            p2Var.addView(textView, c8.ma.c(-2.0f, -2));
                            p2Var.addView(textView3, c8.ma.c(-2.0f, -2));
                            p2Var.addView(textView2, c8.ma.c(-2.0f, -2));
                            p2Var.addView(textView5, c8.ma.c(-2.0f, -2));
                            p2Var.addView(textView4, c8.ma.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f39328x = view;
                            linearLayout.addView(view, c8.ma.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, view, null);
                            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(frameLayout.getContext());
                            frameLayout.E = x9Var;
                            linearLayout.addView(x9Var, c8.ma.o(-1, -2));
                            wzVar = frameLayout;
                            break;
                        case 3:
                            wzVar = new org.telegram.ui.Cells.o4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.eu0 eu0Var = new org.telegram.ui.Components.eu0(context, null);
                            eu0Var.setCallback(new org.telegram.messenger.ed(20));
                            int i14 = org.telegram.messenger.bz.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            eu0Var.b(i10, null, org.telegram.messenger.gd.G(3, "Days", new Object[0]), org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.G(1, "Months", new Object[0]), org.telegram.messenger.gd.M0(2131748867, null));
                            wzVar = eu0Var;
                            break;
                        case 5:
                            wzVar = new w6(x6Var.getParentActivity(), x6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.wz wzVar2 = new org.telegram.ui.Components.wz(x6Var.getParentActivity(), null);
                            wzVar2.setIsSingleCell(true);
                            wzVar2.setItemsCount(3);
                            wzVar2.setIgnoreHeightCheck(true);
                            wzVar2.setViewType(25);
                            wzVar = wzVar2;
                            break;
                        case 7:
                            wzVar = new org.telegram.ui.Cells.n8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.qt0 qt0Var = x6Var.f53608c0;
                            qt0Var.getClass();
                            View i3Var2 = new bi.i3(26, context, qt0Var);
                            i3Var2.setTag(-33024);
                            i3Var2.setLayoutParams(new v4.q0(-1, -1));
                            wzVar = i3Var2;
                            break;
                        case 9:
                            u6 u6Var2 = new u6(this, context);
                            x6Var.X = u6Var2;
                            u6Var2.setTag(-33024);
                            u6Var = u6Var2;
                            wzVar = u6Var;
                            break;
                        case 10:
                            k6 k6Var = new k6(x6Var, context);
                            x6Var.Y = k6Var;
                            k6Var.setTag(-33024);
                            u6Var = k6Var;
                            wzVar = u6Var;
                            break;
                        case 11:
                            wzVar = new org.telegram.ui.Cells.d2(this.f52689e, 4, 21, false, x6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.wz wzVar3 = new org.telegram.ui.Components.wz(x6Var.getParentActivity(), null);
                            wzVar3.setIsSingleCell(true);
                            wzVar3.setItemsCount(1);
                            wzVar3.setIgnoreHeightCheck(true);
                            wzVar3.setViewType(26);
                            wzVar = wzVar3;
                            break;
                        case 13:
                            p6 p6Var = new p6(x6Var, context);
                            x6Var.Z = p6Var;
                            wzVar = p6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.eu0 eu0Var2 = new org.telegram.ui.Components.eu0(context, null);
                            float f10 = ((int) ((x6Var.I / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f10 <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f10 > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f10 > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f10 > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.MAX_VALUE);
                            String[] strArr = new String[arrayList.size()];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                if (((Integer) arrayList.get(i15)).intValue() == 1) {
                                    strArr[i15] = "300 MB";
                                } else if (((Integer) arrayList.get(i15)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i15] = org.telegram.messenger.gd.M0(2131748010, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            eu0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.bz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            eu0Var2.b(indexOf2, null, strArr);
                            wzVar = eu0Var2;
                            break;
                        default:
                            wzVar = new org.telegram.ui.Cells.a9(context);
                            break;
                    }
                } else {
                    wzVar = new org.telegram.ui.Cells.x9(context);
                }
                return new v4.f1(wzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) h2Var;
                switch (i7) {
                    case 0:
                        j5Var = new org.telegram.ui.Cells.o4(context);
                        break;
                    case 1:
                        j5Var = new org.telegram.ui.Cells.s8(context);
                        break;
                    case 2:
                        j5Var = new org.telegram.ui.Cells.ra(context, 6, 0, false);
                        break;
                    case 3:
                        j5Var = new org.telegram.ui.Cells.u8(context, null);
                        break;
                    case 4:
                        j5Var = new org.telegram.ui.Cells.a9(context);
                        break;
                    case 5:
                        j5Var = new org.telegram.ui.Cells.x9(context);
                        break;
                    case 6:
                        j5Var = new org.telegram.ui.Cells.j5(this.f52689e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        j5Var = new org.telegram.ui.Cells.n8(context);
                        break;
                    case 8:
                        ?? n8Var = new org.telegram.ui.Cells.n8(context);
                        ImageView imageView = new ImageView(context);
                        n8Var.f50837a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29729v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232132);
                        if (org.telegram.messenger.gd.f24213a0) {
                            i12 = 3;
                        }
                        n8Var.addView(imageView, c8.ma.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        j5Var = n8Var;
                        break;
                }
                return new v4.f1(j5Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        boolean B;
        qh0 qh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52690f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i7 = notificationsCustomSettingsActivity.f43123s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f43125x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f43121n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f43125x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = f1Var.b();
                    View view = f1Var.f59123a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        qh0Var = (qh0) arrayList3.get(b10);
                    } else {
                        qh0Var = null;
                    }
                    if (qh0Var == null || qh0Var.f51226c != 102) {
                        int i10 = f1Var.f59127f;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 5) {
                                        ((org.telegram.ui.Cells.x9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.u8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.s8) view).e(null, B);
                            return;
                        }
                        ((org.telegram.ui.Cells.o4) view).a(null, B);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
