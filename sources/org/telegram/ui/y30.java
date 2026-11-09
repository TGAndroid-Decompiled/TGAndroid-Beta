package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y30 extends org.telegram.ui.Components.pj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final e40 M;
    public final Context f51837c;
    public int d;
    public int f51838e;
    public int f51839f;
    public int h;
    public int f51840n;
    public int f51841r;
    public int f51842s;
    public int f51843w;
    public int f51844x;
    public int f51845y;

    public y30(e40 e40Var, LaunchActivity launchActivity) {
        this.M = e40Var;
        this.f51837c = launchActivity;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        e40 e40Var = this.M;
        ArrayList arrayList = e40Var.f45215h2;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        if (r3Var != null && !r3Var.j() && !e40Var.f45225j2) {
            this.f51844x = -1;
            this.f51845y = -1;
            this.D = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z9 = false;
            this.F = 0;
            if (e40Var.R2.d.h(org.telegram.messenger.ij.B1(e40Var.f45261r2)) >= 0) {
                z9 = true;
            }
            this.L = z9;
            if (e40Var.r1()) {
                int i7 = this.F;
                this.F = i7 + 1;
                this.K = i7;
            }
            int i10 = this.F;
            this.G = i10;
            int size = arrayList.size() + i10;
            this.F = size;
            this.H = size;
            if (arrayList.size() > 0) {
                int i11 = this.F;
                this.F = i11 + 1;
                this.I = i11;
            }
            if (!arrayList.isEmpty() && e40Var.S0() && e40Var.R2.f25222b.participants_count > org.telegram.messenger.qp.s1(e40Var.f45228k1.f21765a).Z3) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.J = i12;
            }
            this.d = this.F;
            if (!e40Var.u1()) {
                this.F = e40Var.R2.f25226g.size() + this.F;
            }
            this.f51838e = this.F;
            if (!e40Var.R2.f25228j.isEmpty() && !e40Var.u1()) {
                int i13 = this.F;
                this.f51839f = i13;
                int size2 = e40Var.R2.f25228j.size() + i13;
                this.F = size2;
                this.h = size2;
            } else {
                this.f51839f = -1;
                this.h = -1;
            }
            if (!e40Var.R2.f25231m.isEmpty() && !e40Var.u1()) {
                int i14 = this.F;
                this.f51840n = i14;
                int size3 = e40Var.R2.f25231m.size() + i14;
                this.F = size3;
                this.f51841r = size3;
            } else {
                this.f51840n = -1;
                this.f51841r = -1;
            }
            if (!e40Var.R2.f25230l.isEmpty() && !e40Var.u1()) {
                int i15 = this.F;
                this.f51842s = i15;
                int size4 = e40Var.R2.f25230l.size() + i15;
                this.F = size4;
                this.f51843w = size4;
            } else {
                this.f51842s = -1;
                this.f51843w = -1;
            }
            if (e40Var.r1()) {
                int i16 = this.F;
                this.f51845y = i16;
                this.F = i16 + 2;
                this.D = i16 + 1;
            } else if (!e40Var.u1() && (((!org.telegram.messenger.t3.T(e40Var.Q2) || ((chat2 = e40Var.Q2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(e40Var.Q2)) || (org.telegram.messenger.t3.T(e40Var.Q2) && (chat = e40Var.Q2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.f51844x = i17;
            }
            int i18 = this.F;
            this.F = i18 + 1;
            this.E = i18;
        }
    }

    @Override
    public final int b() {
        return this.F;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.E) {
            return 3;
        }
        if (i7 != this.f51844x && i7 != this.f51845y && i7 != this.D) {
            if (i7 == this.I) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f51838e) {
                return 1;
            }
            if (i7 >= this.G && i7 < this.H) {
                return 4;
            }
            if (i7 == this.J) {
                return 6;
            }
            if (i7 == this.K) {
                return 7;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void g(int i7) {
        E();
        super.g(i7);
    }

    @Override
    public final void j(int i7, int i10) {
        E();
        super.j(i7, i10);
    }

    @Override
    public final void k(int i7, int i10) {
        E();
        super.k(i7, i10);
    }

    @Override
    public final void n(int i7, int i10, Object obj) {
        E();
        super.n(i7, i10, obj);
    }

    @Override
    public final void o(int i7, int i10) {
        E();
        super.o(i7, i10);
    }

    @Override
    public final void p(int i7, int i10) {
        E();
        super.p(i7, i10);
    }

    @Override
    public final void t(v4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y30.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        n00 n00Var;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        e40 e40Var = this.M;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        int i16 = 3;
        Context context = this.f51837c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    n00Var = new View(context);
                                } else {
                                    if (e40Var.f45211g2 == null) {
                                        e40Var.f45211g2 = new g.b();
                                    }
                                    n00Var = new n00(context, e40Var.f45211g2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.t3.W(e40Var.Q2)) {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743449, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21765a).Z3, "Participants", new Object[0])));
                                    n00Var = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743225, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21765a).Z3, "Members", new Object[0])));
                                    n00Var = textView;
                                }
                            }
                        } else {
                            n00Var = new org.telegram.ui.Components.tm(context, 14);
                        }
                    } else {
                        n00Var = new x30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30931n = org.telegram.ui.ActionBar.l6.f27911fh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
                    frameLayout.f30929e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                    frameLayout.f30926a = l9Var;
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z9 = org.telegram.messenger.id.f23157a0;
                    if (z9) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    int i17 = i11 | 48;
                    if (z9) {
                        f10 = 0.0f;
                    } else {
                        f10 = 11.0f;
                    }
                    if (z9) {
                        f11 = 11.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    frameLayout.addView(l9Var, c8.ha.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                    frameLayout.f30927b = l5Var;
                    org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f27838bh, null);
                    l5Var.setTypeface(org.telegram.messenger.g0.o());
                    l5Var.setTextSize(16);
                    if (org.telegram.messenger.id.f23157a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    l5Var.setGravity(i12 | 48);
                    boolean z10 = org.telegram.messenger.id.f23157a0;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    if (z10) {
                        f12 = 54.0f;
                    } else {
                        f12 = 67.0f;
                    }
                    if (z10) {
                        f13 = 67.0f;
                    } else {
                        f13 = 54.0f;
                    }
                    frameLayout.addView(l5Var, c8.ha.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
                    frameLayout.f30928c = l5Var2;
                    l5Var2.setTextSize(15);
                    if (org.telegram.messenger.id.f23157a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    l5Var2.setGravity(i14 | 48);
                    l5Var2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, frameLayout.f30931n, false));
                    l5Var2.l(org.telegram.messenger.id.M0(2131749105, null), false);
                    boolean z11 = org.telegram.messenger.id.f23157a0;
                    if (z11) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    int i19 = i15 | 48;
                    if (z11) {
                        f14 = 54.0f;
                    } else {
                        f14 = 67.0f;
                    }
                    if (z11) {
                        f15 = 67.0f;
                    } else {
                        f15 = 54.0f;
                    }
                    frameLayout.addView(l5Var2, c8.ha.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232192);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, frameLayout.f30931n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.id.f23157a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.ha.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    n00Var = frameLayout;
                }
            } else {
                n00Var = new v30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f30974n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f30975r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
            frameLayout2.f30972e = 23;
            org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
            frameLayout2.f30969a = l5Var3;
            org.telegram.ui.ActionBar.s6.X(l5Var3, org.telegram.ui.ActionBar.l6.G6, null);
            l5Var3.setTextSize(16);
            if (org.telegram.messenger.id.f23157a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            l5Var3.setGravity(i10);
            l5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(l5Var3);
            org.telegram.ui.ActionBar.l5 l5Var4 = new org.telegram.ui.ActionBar.l5(context);
            frameLayout2.f30970b = l5Var4;
            org.telegram.ui.ActionBar.s6.X(l5Var4, org.telegram.ui.ActionBar.l6.I6, null);
            l5Var4.setTextSize(16);
            if (!org.telegram.messenger.id.f23157a0) {
                i16 = 5;
            }
            l5Var4.setGravity(i16);
            l5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(l5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f30971c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.f28030m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            n00Var = frameLayout2;
        }
        return jg.g.r(n00Var, n00Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7;
        int i10;
        b30 b30Var = this.M.F1;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z9 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (b30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.l6.f27911fh;
            } else {
                i10 = org.telegram.ui.ActionBar.l6.f27819ah;
            }
            f4Var.f(i10, org.telegram.ui.ActionBar.l6.x0(null, i10, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            f4Var.setDrawDivider(z9);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (b30Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.l6.f27911fh;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.f27819ah;
            }
            y3Var.a(i7, org.telegram.ui.ActionBar.l6.x0(null, i7, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            y3Var.setDrawDivider(z9);
        }
    }
}
