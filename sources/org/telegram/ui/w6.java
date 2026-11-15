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
public final class w6 extends rg.b {
    public final int d;
    public final Context f52443e;
    public final org.telegram.ui.ActionBar.e2 f52444f;

    public w6(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = i7;
        this.f52444f = e2Var;
        this.f52443e = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7;
        switch (this.d) {
            case 0:
                y6 y6Var = (y6) this.f52444f;
                if (e1Var.b() != y6Var.K && (((i7 = e1Var.f58539f) != 2 || y6Var.H <= 0 || y6Var.L) && i7 != 5 && i7 != 7 && i7 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = e1Var.f58539f;
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
                return ((y6) this.f52444f).f53449g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f52444f).J.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f52444f).f53449g0.get(i7)).f56015a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52444f;
                if (i7 >= 0 && i7 < notificationsCustomSettingsActivity.J.size()) {
                    return ((mh0) notificationsCustomSettingsActivity.J.get(i7)).f56015a;
                }
                return 5;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        String str;
        org.telegram.ui.Cells.l8 l8Var;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = this.f52444f;
        boolean z13 = true;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) e2Var;
                ArrayList arrayList = y6Var.f53449g0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i12 = e1Var.f58539f;
                View view = e1Var.f58535a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 7) {
                                    switch (i12) {
                                        case 9:
                                            y6Var.y0();
                                            return;
                                        case 10:
                                            l6 l6Var = y6Var.Y;
                                            if (l6Var != null && !y6Var.L) {
                                                long j3 = y6Var.H;
                                                if (j3 <= 0) {
                                                    z13 = false;
                                                }
                                                long j10 = y6Var.I;
                                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j3) / ((float) j10);
                                                }
                                                long j11 = y6Var.J;
                                                if (j11 > 0 && i13 > 0) {
                                                    f11 = ((float) (j10 - j11)) / ((float) j10);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                l6Var.b(f10, f11, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                            int i14 = u6Var.f51775f;
                                            if (i14 < 0) {
                                                z10 = y6Var.t0();
                                            } else {
                                                z10 = y6Var.d[i14];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = u6Var.d;
                                            int[] iArr = y6Var.V;
                                            int i15 = u6Var.f51775f;
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
                                            spannableString.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(u6Var.f51776g, false, false);
                                            if (u6Var.f51775f >= 0 ? !u6Var.f51778j : !y6Var.M) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i17 = u6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.j6.f28979k7;
                                            org.telegram.ui.Components.fp fpVar = c2Var.f30095r;
                                            if (fpVar != null) {
                                                fpVar.b(i17, i17, i18);
                                            }
                                            if (u6Var.f51775f < 0) {
                                                bool = Boolean.valueOf(y6Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            c2Var.setCollapsed(bool);
                                            if (u6Var.f51775f == -1) {
                                                c2Var.d(new a(this, 6), new org.telegram.messenger.video.e(11, this, c2Var));
                                            } else {
                                                c2Var.d(null, null);
                                            }
                                            c2Var.setPad(u6Var.f51777i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                                org.telegram.messenger.u2 u2Var = y6Var.getMessagesController().f25395s7;
                                int i19 = u6Var.f51773c;
                                int size = u2Var.d(((u6) arrayList.get(i7)).f51773c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.u2.f(u2Var.c(i19));
                                if (((u6) arrayList.get(i7)).f51773c == 0) {
                                    l8Var = l8Var2;
                                    l8Var.r(org.telegram.messenger.hd.M0(2131746753, null), f13, true, 2131232150, -11565578, -13276952, true);
                                } else {
                                    l8Var = l8Var2;
                                    if (((u6) arrayList.get(i7)).f51773c == 1) {
                                        l8Var.r(org.telegram.messenger.hd.M0(2131749457, null), f13, true, 2131232149, -11154873, -14175180, true);
                                    } else if (((u6) arrayList.get(i7)).f51773c == 2) {
                                        l8Var.r(org.telegram.messenger.hd.M0(2131752650, null), f13, true, 2131232148, -1007845, -1996271, true);
                                    } else if (((u6) arrayList.get(i7)).f51773c == 3) {
                                        l8Var.r(org.telegram.messenger.hd.M0(2131752646, null), f13, false, 2131232155, -765355, -2148011, false);
                                    }
                                }
                                l8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                            n4Var.setText(((u6) arrayList.get(i7)).d);
                            ((u6) arrayList.get(i7)).getClass();
                            n4Var.setTopMargin(15);
                            ((u6) arrayList.get(i7)).getClass();
                            n4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) view;
                        boolean z15 = y6Var.L;
                        long j12 = y6Var.f53445e;
                        long j13 = y6Var.H;
                        long j14 = y6Var.J;
                        long j15 = y6Var.I;
                        ab.q qVar = kw0Var.J;
                        View view2 = kw0Var.f36633x;
                        TextView textView = kw0Var.f36629n;
                        TextView textView2 = kw0Var.h;
                        TextView textView3 = kw0Var.f36632w;
                        org.telegram.ui.Cells.v9 v9Var = kw0Var.E;
                        kw0Var.f36627e = z15;
                        TextView textView4 = kw0Var.f36630r;
                        textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743973, org.telegram.messenger.g0.i0(j14, false, false)));
                        TextView textView5 = kw0Var.f36631s;
                        long j16 = j15 - j14;
                        textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743972, org.telegram.messenger.g0.i0(j16, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            v9Var.setVisibility(8);
                            kw0Var.F = 0.0f;
                            kw0Var.G = 0.0f;
                            if (qVar != null) {
                                qVar.c(textView3);
                            }
                        } else {
                            if (qVar != null) {
                                qVar.x(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j13 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                v9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                v9Var.c(org.telegram.messenger.hd.M0(2131752047, null), org.telegram.messenger.g0.i0(j13, false, false), false, true);
                                textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744246, org.telegram.messenger.g0.i0(j13 + j12, false, false)));
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748769, org.telegram.messenger.g0.i0(j12, false, false)));
                                view2.setVisibility(8);
                                v9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j15;
                            float f15 = ((float) (j13 + j12)) / f14;
                            float f16 = ((float) j16) / f14;
                            if (kw0Var.F != f15) {
                                ValueAnimator valueAnimator = kw0Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(kw0Var.F, f15);
                                kw0Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                kw0 kw0Var2 = kw0Var;
                                                kw0Var2.getClass();
                                                kw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                kw0Var2.invalidate();
                                                return;
                                            default:
                                                kw0 kw0Var3 = kw0Var;
                                                kw0Var3.getClass();
                                                kw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                kw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                kw0Var.H.start();
                            }
                            if (kw0Var.G != f16) {
                                ValueAnimator valueAnimator2 = kw0Var.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(kw0Var.G, f16);
                                kw0Var.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                kw0 kw0Var2 = kw0Var;
                                                kw0Var2.getClass();
                                                kw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                kw0Var2.invalidate();
                                                return;
                                            default:
                                                kw0 kw0Var3 = kw0Var;
                                                kw0Var3.getClass();
                                                kw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                kw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                kw0Var.I.start();
                            }
                        }
                        org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
                        kw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.X2(u6Var.f51774e));
                    return;
                }
                org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                if (i7 == y6Var.K) {
                    v9Var2.c(org.telegram.messenger.hd.M0(2131748434, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) e2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    mh0 mh0Var = (mh0) arrayList2.get(i7);
                    int i20 = i7 + 1;
                    if (i20 < arrayList2.size() && ((mh0) arrayList2.get(i20)).f56015a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = e1Var.f58539f;
                    View view3 = e1Var.f58535a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(mh0Var.f49230e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.q8) view3).f("" + ((Object) mh0Var.f49230e), mh0Var.f49233i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(mh0Var.f49232g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.s8) view3).b(mh0Var.h, "" + ((Object) mh0Var.f49230e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view3;
                            if (mh0Var.f49230e == null) {
                                y8Var.setFixedSize(12);
                                y8Var.setText(null);
                                return;
                            }
                            y8Var.setFixedSize(0);
                            y8Var.setText(mh0Var.f49230e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.v9) view3).c(mh0Var.f49230e, mh0Var.f49231f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(mh0Var.f49233i);
                            h5Var.b(mh0Var.f49230e, mh0Var.f49231f, mh0Var.d, mh0Var.f49233i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view3;
                            if (mh0Var.d == 0) {
                                l8Var3.g(-1, org.telegram.ui.ActionBar.j6.f29070p7);
                                l8Var3.k("" + ((Object) mh0Var.f49230e), z12);
                                return;
                            }
                            l8Var3.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                            l8Var3.o(mh0Var.d, "" + ((Object) mh0Var.f49230e), z12);
                            return;
                        case 8:
                            lh0 lh0Var = (lh0) view3;
                            lh0Var.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                            CharSequence charSequence2 = mh0Var.f49230e;
                            if (mh0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = lh0Var.f48993a0.animate();
                            if (z13) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.i20.n(animate.rotation(f12), org.telegram.ui.Components.er.h, 340L);
                            lh0Var.k(charSequence2, z12);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.pz pzVar;
        int i10;
        v6 v6Var;
        FrameLayout h5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f52443e;
        org.telegram.ui.ActionBar.e2 e2Var = this.f52444f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) e2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f36624a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f36625b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f36626c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(220, 255);
                            frameLayout.M = nVar;
                            frameLayout.setWillNotDraw(false);
                            nVar.f40802k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.o2 o2Var = new bi.o2(29, context, frameLayout);
                            frameLayout.f36628f = o2Var;
                            frameLayout.addView(o2Var, c8.ja.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, c8.ja.c(-2.0f, -1));
                            bi.v1 v1Var = new bi.v1(context, 23);
                            linearLayout.addView(v1Var, c8.ja.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f36632w = textView;
                            int i13 = org.telegram.ui.ActionBar.j6.f29241y6;
                            org.telegram.ui.ActionBar.q6.U(textView, i13, null);
                            String M0 = org.telegram.messenger.hd.M0(2131752643, "CalculatingSize");
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
                            org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f36629n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f36630r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f36631s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView5, i13, null);
                            frameLayout.f36634y = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f36634y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f36634y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f36634y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f36634y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            v1Var.addView(textView, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView3, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView2, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView5, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView4, c8.ja.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f36633x = view;
                            linearLayout.addView(view, c8.ja.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, null);
                            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(frameLayout.getContext());
                            frameLayout.E = v9Var;
                            linearLayout.addView(v9Var, c8.ja.o(-1, -2));
                            pzVar = frameLayout;
                            break;
                        case 3:
                            pzVar = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context, null);
                            wt0Var.setCallback(new org.telegram.messenger.fd(19));
                            int i14 = org.telegram.messenger.gz.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            wt0Var.b(i10, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.M0(2131749059, null));
                            pzVar = wt0Var;
                            break;
                        case 5:
                            pzVar = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.pz pzVar2 = new org.telegram.ui.Components.pz(y6Var.getParentActivity(), null);
                            pzVar2.setIsSingleCell(true);
                            pzVar2.setItemsCount(3);
                            pzVar2.setIgnoreHeightCheck(true);
                            pzVar2.setViewType(25);
                            pzVar = pzVar2;
                            break;
                        case 7:
                            pzVar = new org.telegram.ui.Cells.l8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.it0 it0Var = y6Var.f53443c0;
                            it0Var.getClass();
                            View o2Var2 = new bi.o2(26, context, it0Var);
                            o2Var2.setTag(-33024);
                            o2Var2.setLayoutParams(new v4.p0(-1, -1));
                            pzVar = o2Var2;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.X = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            pzVar = v6Var;
                            break;
                        case 10:
                            l6 l6Var = new l6(y6Var, context);
                            y6Var.Y = l6Var;
                            l6Var.setTag(-33024);
                            v6Var = l6Var;
                            pzVar = v6Var;
                            break;
                        case 11:
                            pzVar = new org.telegram.ui.Cells.c2(this.f52443e, 4, 21, false, y6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.pz pzVar3 = new org.telegram.ui.Components.pz(y6Var.getParentActivity(), null);
                            pzVar3.setIsSingleCell(true);
                            pzVar3.setItemsCount(1);
                            pzVar3.setIgnoreHeightCheck(true);
                            pzVar3.setViewType(26);
                            pzVar = pzVar3;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Z = q6Var;
                            pzVar = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context, null);
                            float f10 = ((int) ((y6Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i15] = org.telegram.messenger.hd.M0(2131748202, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            wt0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.gz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            wt0Var2.b(indexOf2, null, strArr);
                            pzVar = wt0Var2;
                            break;
                        default:
                            pzVar = new org.telegram.ui.Cells.y8(context);
                            break;
                    }
                } else {
                    pzVar = new org.telegram.ui.Cells.v9(context);
                }
                return new v4.e1(pzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) e2Var;
                switch (i7) {
                    case 0:
                        h5Var = new org.telegram.ui.Cells.n4(context);
                        break;
                    case 1:
                        h5Var = new org.telegram.ui.Cells.q8(context);
                        break;
                    case 2:
                        h5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        h5Var = new org.telegram.ui.Cells.s8(context, null);
                        break;
                    case 4:
                        h5Var = new org.telegram.ui.Cells.y8(context);
                        break;
                    case 5:
                        h5Var = new org.telegram.ui.Cells.v9(context);
                        break;
                    case 6:
                        h5Var = new org.telegram.ui.Cells.h5(this.f52443e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.l8(context);
                        break;
                    case 8:
                        ?? l8Var = new org.telegram.ui.Cells.l8(context);
                        ImageView imageView = new ImageView(context);
                        l8Var.f48993a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29184v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232131);
                        if (org.telegram.messenger.hd.f24104a0) {
                            i12 = 3;
                        }
                        l8Var.addView(imageView, c8.ja.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = l8Var;
                        break;
                }
                return new v4.e1(h5Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        boolean B;
        mh0 mh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52444f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i7 = notificationsCustomSettingsActivity.f42678s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f42680x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f42676n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f42680x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = e1Var.b();
                    View view = e1Var.f58535a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        mh0Var = (mh0) arrayList3.get(b10);
                    } else {
                        mh0Var = null;
                    }
                    if (mh0Var == null || mh0Var.f49229c != 102) {
                        int i10 = e1Var.f58539f;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 5) {
                                        ((org.telegram.ui.Cells.v9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.s8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.q8) view).e(null, B);
                            return;
                        }
                        ((org.telegram.ui.Cells.n4) view).a(null, B);
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
