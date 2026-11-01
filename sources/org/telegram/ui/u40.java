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
public final class u40 extends org.telegram.ui.Components.tk0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final a50 M;
    public final Context f41787c;
    public int d;
    public int e;
    public int f41788f;
    public int h;
    public int f41789n;
    public int f41790r;
    public int f41791s;
    public int f41792w;
    public int f41793x;
    public int f41794y;

    public u40(a50 a50Var, LaunchActivity launchActivity) {
        this.M = a50Var;
        this.f41787c = launchActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        a50 a50Var = this.M;
        ArrayList arrayList = a50Var.f35606h2;
        org.telegram.messenger.u3 u3Var = a50Var.R2;
        if (u3Var != null && !u3Var.j() && !a50Var.f35616j2) {
            this.f41793x = -1;
            this.f41794y = -1;
            this.D = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z10 = false;
            this.F = 0;
            if (a50Var.R2.d.h(org.telegram.messenger.kj.C1(a50Var.f35653r2)) >= 0) {
                z10 = true;
            }
            this.L = z10;
            if (a50Var.q1()) {
                int i10 = this.F;
                this.F = i10 + 1;
                this.K = i10;
            }
            int i11 = this.F;
            this.G = i11;
            int size = arrayList.size() + i11;
            this.F = size;
            this.H = size;
            if (arrayList.size() > 0) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.I = i12;
            }
            if (!arrayList.isEmpty() && a50Var.S0() && a50Var.R2.f18361b.participants_count > org.telegram.messenger.wp.r1(a50Var.f35620k1.f15043a).f19090b4) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.J = i13;
            }
            this.d = this.F;
            if (!a50Var.t1()) {
                this.F = a50Var.R2.f18364g.size() + this.F;
            }
            this.e = this.F;
            if (!a50Var.R2.f18366j.isEmpty() && !a50Var.t1()) {
                int i14 = this.F;
                this.f41788f = i14;
                int size2 = a50Var.R2.f18366j.size() + i14;
                this.F = size2;
                this.h = size2;
            } else {
                this.f41788f = -1;
                this.h = -1;
            }
            if (!a50Var.R2.f18369m.isEmpty() && !a50Var.t1()) {
                int i15 = this.F;
                this.f41789n = i15;
                int size3 = a50Var.R2.f18369m.size() + i15;
                this.F = size3;
                this.f41790r = size3;
            } else {
                this.f41789n = -1;
                this.f41790r = -1;
            }
            if (!a50Var.R2.f18368l.isEmpty() && !a50Var.t1()) {
                int i16 = this.F;
                this.f41791s = i16;
                int size4 = a50Var.R2.f18368l.size() + i16;
                this.F = size4;
                this.f41792w = size4;
            } else {
                this.f41791s = -1;
                this.f41792w = -1;
            }
            if (a50Var.q1()) {
                int i17 = this.F;
                this.f41794y = i17;
                this.F = i17 + 2;
                this.D = i17 + 1;
            } else if (!a50Var.t1() && (((!org.telegram.messenger.w3.T(a50Var.Q2) || ((chat2 = a50Var.Q2) != null && chat2.megagroup)) && org.telegram.messenger.w3.B(a50Var.Q2)) || (org.telegram.messenger.w3.T(a50Var.Q2) && (chat = a50Var.Q2) != null && !chat.megagroup && org.telegram.messenger.w3.t0(chat)))) {
                int i18 = this.F;
                this.F = i18 + 1;
                this.f41793x = i18;
            }
            int i19 = this.F;
            this.F = i19 + 1;
            this.E = i19;
        }
    }

    @Override
    public final int b() {
        return this.F;
    }

    @Override
    public final int d(int i10) {
        if (i10 == this.E) {
            return 3;
        }
        if (i10 != this.f41793x && i10 != this.f41794y && i10 != this.D) {
            if (i10 == this.I) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.e) {
                return 1;
            }
            if (i10 >= this.G && i10 < this.H) {
                return 4;
            }
            if (i10 == this.J) {
                return 6;
            }
            if (i10 == this.K) {
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
    public final void g(int i10) {
        E();
        super.g(i10);
    }

    @Override
    public final void j(int i10, int i11) {
        E();
        super.j(i10, i11);
    }

    @Override
    public final void k(int i10, int i11) {
        E();
        super.k(i10, i11);
    }

    @Override
    public final void n(int i10, int i11, Object obj) {
        E();
        super.n(i10, i11, obj);
    }

    @Override
    public final void o(int i10, int i11) {
        E();
        super.o(i10, i11);
    }

    @Override
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override
    public final void t(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u40.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        bi.t0 t0Var;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        a50 a50Var = this.M;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        int i17 = 3;
        Context context = this.f41787c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    t0Var = new View(context);
                                } else {
                                    if (a50Var.f35602g2 == null) {
                                        a50Var.f35602g2 = new g.b();
                                    }
                                    t0Var = new bi.t0(context, a50Var.f35602g2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(10.0f));
                                if (org.telegram.messenger.w3.W(a50Var.Q2)) {
                                    textView.setText(org.telegram.messenger.dd.a0(null, null, 2131743475, org.telegram.messenger.dd.G(org.telegram.messenger.wp.r1(cVar.f15043a).f19090b4, "Participants", new Object[0])));
                                    t0Var = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.dd.a0(null, null, 2131743251, org.telegram.messenger.dd.G(org.telegram.messenger.wp.r1(cVar.f15043a).f19090b4, "Members", new Object[0])));
                                    t0Var = textView;
                                }
                            }
                        } else {
                            t0Var = new org.telegram.ui.Components.bn(context, 11);
                        }
                    } else {
                        t0Var = new t40(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f21672n = org.telegram.ui.ActionBar.t6.f20977fh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
                    frameLayout.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                    frameLayout.f21668a = g9Var;
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
                    boolean z10 = org.telegram.messenger.dd.X;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 11.0f;
                    }
                    if (z10) {
                        f10 = 11.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    frameLayout.addView(g9Var, w7.b6.d(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
                    org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                    frameLayout.f21669b = u5Var;
                    org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f20902bh, null);
                    u5Var.setTypeface(org.telegram.messenger.i0.o());
                    u5Var.setTextSize(16);
                    if (org.telegram.messenger.dd.X) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    u5Var.setGravity(i13 | 48);
                    boolean z11 = org.telegram.messenger.dd.X;
                    if (z11) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i19 = i14 | 48;
                    if (z11) {
                        f11 = 54.0f;
                    } else {
                        f11 = 67.0f;
                    }
                    if (z11) {
                        f12 = 67.0f;
                    } else {
                        f12 = 54.0f;
                    }
                    frameLayout.addView(u5Var, w7.b6.d(-1, 20.0f, i19, f11, 10.0f, f12, 0.0f));
                    org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
                    frameLayout.f21670c = u5Var2;
                    u5Var2.setTextSize(15);
                    if (org.telegram.messenger.dd.X) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    u5Var2.setGravity(i15 | 48);
                    u5Var2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, frameLayout.f21672n, false));
                    u5Var2.l(org.telegram.messenger.dd.L0(2131749115, null), false);
                    boolean z12 = org.telegram.messenger.dd.X;
                    if (z12) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    int i20 = i16 | 48;
                    if (z12) {
                        f13 = 54.0f;
                    } else {
                        f13 = 67.0f;
                    }
                    if (z12) {
                        f14 = 67.0f;
                    } else {
                        f14 = 54.0f;
                    }
                    frameLayout.addView(u5Var2, w7.b6.d(-1, 20.0f, i20, f13, 32.0f, f14, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232191);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, frameLayout.f21672n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.dd.X) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, w7.b6.d(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    t0Var = frameLayout;
                }
            } else {
                t0Var = new r40(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f21723n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f21724r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            frameLayout2.e = 23;
            org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
            frameLayout2.f21719a = u5Var3;
            org.telegram.ui.ActionBar.a7.Y(u5Var3, org.telegram.ui.ActionBar.t6.G6, null);
            u5Var3.setTextSize(16);
            if (org.telegram.messenger.dd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            u5Var3.setGravity(i11);
            u5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(u5Var3);
            org.telegram.ui.ActionBar.u5 u5Var4 = new org.telegram.ui.ActionBar.u5(context);
            frameLayout2.f21720b = u5Var4;
            org.telegram.ui.ActionBar.a7.Y(u5Var4, org.telegram.ui.ActionBar.t6.I6, null);
            u5Var4.setTextSize(16);
            if (!org.telegram.messenger.dd.X) {
                i17 = 5;
            }
            u5Var4.setGravity(i17);
            u5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(u5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f21721c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.f21096m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            t0Var = frameLayout2;
        }
        return sc.e.o(t0Var, t0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        x30 x30Var = this.M.F1;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (x30Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.t6.f20977fh;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f20883ah;
            }
            h4Var.f(i11, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            h4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
            if (x30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.t6.f20977fh;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f20883ah;
            }
            a4Var.a(i10, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            a4Var.setDrawDivider(z10);
        }
    }
}
