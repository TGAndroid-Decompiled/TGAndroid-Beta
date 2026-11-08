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
public final class w30 extends org.telegram.ui.Components.oj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final c40 M;
    public final Context f50847c;
    public int d;
    public int f50848e;
    public int f50849f;
    public int h;
    public int f50850n;
    public int f50851r;
    public int f50852s;
    public int f50853w;
    public int f50854x;
    public int f50855y;

    public w30(c40 c40Var, LaunchActivity launchActivity) {
        this.M = c40Var;
        this.f50847c = launchActivity;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        c40 c40Var = this.M;
        ArrayList arrayList = c40Var.f44575h2;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        if (r3Var != null && !r3Var.j() && !c40Var.f44585j2) {
            this.f50854x = -1;
            this.f50855y = -1;
            this.D = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z9 = false;
            this.F = 0;
            if (c40Var.R2.d.h(org.telegram.messenger.ij.C1(c40Var.f44621r2)) >= 0) {
                z9 = true;
            }
            this.L = z9;
            if (c40Var.r1()) {
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
            if (!arrayList.isEmpty() && c40Var.S0() && c40Var.R2.f25222b.participants_count > org.telegram.messenger.qp.s1(c40Var.f44588k1.f21765a).Z3) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.J = i12;
            }
            this.d = this.F;
            if (!c40Var.u1()) {
                this.F = c40Var.R2.f25226g.size() + this.F;
            }
            this.f50848e = this.F;
            if (!c40Var.R2.f25228j.isEmpty() && !c40Var.u1()) {
                int i13 = this.F;
                this.f50849f = i13;
                int size2 = c40Var.R2.f25228j.size() + i13;
                this.F = size2;
                this.h = size2;
            } else {
                this.f50849f = -1;
                this.h = -1;
            }
            if (!c40Var.R2.f25231m.isEmpty() && !c40Var.u1()) {
                int i14 = this.F;
                this.f50850n = i14;
                int size3 = c40Var.R2.f25231m.size() + i14;
                this.F = size3;
                this.f50851r = size3;
            } else {
                this.f50850n = -1;
                this.f50851r = -1;
            }
            if (!c40Var.R2.f25230l.isEmpty() && !c40Var.u1()) {
                int i15 = this.F;
                this.f50852s = i15;
                int size4 = c40Var.R2.f25230l.size() + i15;
                this.F = size4;
                this.f50853w = size4;
            } else {
                this.f50852s = -1;
                this.f50853w = -1;
            }
            if (c40Var.r1()) {
                int i16 = this.F;
                this.f50855y = i16;
                this.F = i16 + 2;
                this.D = i16 + 1;
            } else if (!c40Var.u1() && (((!org.telegram.messenger.t3.T(c40Var.Q2) || ((chat2 = c40Var.Q2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(c40Var.Q2)) || (org.telegram.messenger.t3.T(c40Var.Q2) && (chat = c40Var.Q2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.f50854x = i17;
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
        if (i7 != this.f50854x && i7 != this.f50855y && i7 != this.D) {
            if (i7 == this.I) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f50848e) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w30.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        l00 l00Var;
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
        c40 c40Var = this.M;
        org.telegram.messenger.c cVar = c40Var.f44588k1;
        int i16 = 3;
        Context context = this.f50847c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    l00Var = new View(context);
                                } else {
                                    if (c40Var.f44571g2 == null) {
                                        c40Var.f44571g2 = new g.b();
                                    }
                                    l00Var = new l00(context, c40Var.f44571g2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.t3.W(c40Var.Q2)) {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743452, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21765a).Z3, "Participants", new Object[0])));
                                    l00Var = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743228, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21765a).Z3, "Members", new Object[0])));
                                    l00Var = textView;
                                }
                            }
                        } else {
                            l00Var = new org.telegram.ui.Components.tm(context, 14);
                        }
                    } else {
                        l00Var = new v30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30926n = org.telegram.ui.ActionBar.k6.f27898fh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
                    frameLayout.f30924e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                    frameLayout.f30921a = l9Var;
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
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f30922b = k5Var;
                    org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27825bh, null);
                    k5Var.setTypeface(org.telegram.messenger.g0.o());
                    k5Var.setTextSize(16);
                    if (org.telegram.messenger.id.f23157a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    k5Var.setGravity(i12 | 48);
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
                    frameLayout.addView(k5Var, c8.ha.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f30923c = k5Var2;
                    k5Var2.setTextSize(15);
                    if (org.telegram.messenger.id.f23157a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    k5Var2.setGravity(i14 | 48);
                    k5Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, frameLayout.f30926n, false));
                    k5Var2.l(org.telegram.messenger.id.M0(2131749106, null), false);
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
                    frameLayout.addView(k5Var2, c8.ha.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232192);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, frameLayout.f30926n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.id.f23157a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.ha.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    l00Var = frameLayout;
                }
            } else {
                l00Var = new t30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f30969n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f30970r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            frameLayout2.f30967e = 23;
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f30964a = k5Var3;
            org.telegram.ui.ActionBar.r6.Y(k5Var3, org.telegram.ui.ActionBar.k6.G6, null);
            k5Var3.setTextSize(16);
            if (org.telegram.messenger.id.f23157a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            k5Var3.setGravity(i10);
            k5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var3);
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f30965b = k5Var4;
            org.telegram.ui.ActionBar.r6.Y(k5Var4, org.telegram.ui.ActionBar.k6.I6, null);
            k5Var4.setTextSize(16);
            if (!org.telegram.messenger.id.f23157a0) {
                i16 = 5;
            }
            k5Var4.setGravity(i16);
            k5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f30966c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f28017m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            l00Var = frameLayout2;
        }
        return jg.g.r(l00Var, l00Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7;
        int i10;
        z20 z20Var = this.M.F1;
        int i11 = d1Var.f57048f;
        View view = d1Var.f57044a;
        boolean z9 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (z20Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.k6.f27898fh;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f27806ah;
            }
            f4Var.f(i10, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            f4Var.setDrawDivider(z9);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (z20Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.k6.f27898fh;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f27806ah;
            }
            y3Var.a(i7, org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            y3Var.setDrawDivider(z9);
        }
    }
}
