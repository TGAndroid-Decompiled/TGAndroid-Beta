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
public final class z30 extends org.telegram.ui.Components.oj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final f40 M;
    public final Context f52195c;
    public int d;
    public int f52196e;
    public int f52197f;
    public int h;
    public int f52198n;
    public int f52199r;
    public int f52200s;
    public int f52201w;
    public int f52202x;
    public int f52203y;

    public z30(f40 f40Var, LaunchActivity launchActivity) {
        this.M = f40Var;
        this.f52195c = launchActivity;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        f40 f40Var = this.M;
        ArrayList arrayList = f40Var.f45542k2;
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        if (r3Var != null && !r3Var.j() && !f40Var.f45551m2) {
            this.f52202x = -1;
            this.f52203y = -1;
            this.D = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z9 = false;
            this.F = 0;
            if (f40Var.U2.d.h(org.telegram.messenger.ij.B1(f40Var.f45588u2)) >= 0) {
                z9 = true;
            }
            this.L = z9;
            if (f40Var.r1()) {
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
            if (!arrayList.isEmpty() && f40Var.S0() && f40Var.U2.f25226b.participants_count > org.telegram.messenger.qp.s1(f40Var.n1.f21770a).Z3) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.J = i12;
            }
            this.d = this.F;
            if (!f40Var.u1()) {
                this.F = f40Var.U2.f25230g.size() + this.F;
            }
            this.f52196e = this.F;
            if (!f40Var.U2.f25232j.isEmpty() && !f40Var.u1()) {
                int i13 = this.F;
                this.f52197f = i13;
                int size2 = f40Var.U2.f25232j.size() + i13;
                this.F = size2;
                this.h = size2;
            } else {
                this.f52197f = -1;
                this.h = -1;
            }
            if (!f40Var.U2.f25235m.isEmpty() && !f40Var.u1()) {
                int i14 = this.F;
                this.f52198n = i14;
                int size3 = f40Var.U2.f25235m.size() + i14;
                this.F = size3;
                this.f52199r = size3;
            } else {
                this.f52198n = -1;
                this.f52199r = -1;
            }
            if (!f40Var.U2.f25234l.isEmpty() && !f40Var.u1()) {
                int i15 = this.F;
                this.f52200s = i15;
                int size4 = f40Var.U2.f25234l.size() + i15;
                this.F = size4;
                this.f52201w = size4;
            } else {
                this.f52200s = -1;
                this.f52201w = -1;
            }
            if (f40Var.r1()) {
                int i16 = this.F;
                this.f52203y = i16;
                this.F = i16 + 2;
                this.D = i16 + 1;
            } else if (!f40Var.u1() && (((!org.telegram.messenger.t3.T(f40Var.T2) || ((chat2 = f40Var.T2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(f40Var.T2)) || (org.telegram.messenger.t3.T(f40Var.T2) && (chat = f40Var.T2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.f52202x = i17;
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
        if (i7 != this.f52202x && i7 != this.f52203y && i7 != this.D) {
            if (i7 == this.I) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f52196e) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z30.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        o00 o00Var;
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
        f40 f40Var = this.M;
        org.telegram.messenger.c cVar = f40Var.n1;
        int i16 = 3;
        Context context = this.f52195c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    o00Var = new View(context);
                                } else {
                                    if (f40Var.f45539j2 == null) {
                                        f40Var.f45539j2 = new g.b();
                                    }
                                    o00Var = new o00(context, f40Var.f45539j2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.t3.W(f40Var.T2)) {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743449, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21770a).Z3, "Participants", new Object[0])));
                                    o00Var = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131743225, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.f21770a).Z3, "Members", new Object[0])));
                                    o00Var = textView;
                                }
                            }
                        } else {
                            o00Var = new org.telegram.ui.Components.sm(context, 14);
                        }
                    } else {
                        o00Var = new y30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30942n = org.telegram.ui.ActionBar.m6.f27936fh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
                    frameLayout.f30940e = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                    frameLayout.f30937a = k9Var;
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z9 = org.telegram.messenger.id.f23161a0;
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
                    frameLayout.addView(k9Var, c8.ha.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                    frameLayout.f30938b = m5Var;
                    org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f27863bh, null);
                    m5Var.setTypeface(org.telegram.messenger.g0.o());
                    m5Var.setTextSize(16);
                    if (org.telegram.messenger.id.f23161a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    m5Var.setGravity(i12 | 48);
                    boolean z10 = org.telegram.messenger.id.f23161a0;
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
                    frameLayout.addView(m5Var, c8.ha.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
                    frameLayout.f30939c = m5Var2;
                    m5Var2.setTextSize(15);
                    if (org.telegram.messenger.id.f23161a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    m5Var2.setGravity(i14 | 48);
                    m5Var2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, frameLayout.f30942n, false));
                    m5Var2.l(org.telegram.messenger.id.M0(2131749105, null), false);
                    boolean z11 = org.telegram.messenger.id.f23161a0;
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
                    frameLayout.addView(m5Var2, c8.ha.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232192);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, frameLayout.f30942n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.id.f23161a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.ha.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    o00Var = frameLayout;
                }
            } else {
                o00Var = new w30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f30985n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f30986r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
            frameLayout2.f30983e = 23;
            org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
            frameLayout2.f30980a = m5Var3;
            org.telegram.ui.ActionBar.t6.X(m5Var3, org.telegram.ui.ActionBar.m6.G6, null);
            m5Var3.setTextSize(16);
            if (org.telegram.messenger.id.f23161a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            m5Var3.setGravity(i10);
            m5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(m5Var3);
            org.telegram.ui.ActionBar.m5 m5Var4 = new org.telegram.ui.ActionBar.m5(context);
            frameLayout2.f30981b = m5Var4;
            org.telegram.ui.ActionBar.t6.X(m5Var4, org.telegram.ui.ActionBar.m6.I6, null);
            m5Var4.setTextSize(16);
            if (!org.telegram.messenger.id.f23161a0) {
                i16 = 5;
            }
            m5Var4.setGravity(i16);
            m5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(m5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f30982c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.f28055m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            o00Var = frameLayout2;
        }
        return jg.g.r(o00Var, o00Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7;
        int i10;
        c30 c30Var = this.M.I1;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z9 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (c30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.m6.f27936fh;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f27844ah;
            }
            f4Var.f(i10, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            f4Var.setDrawDivider(z9);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (c30Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.m6.f27936fh;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f27844ah;
            }
            y3Var.a(i7, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            if (d1Var.b() != this.F - 2) {
                z9 = true;
            }
            y3Var.setDrawDivider(z9);
        }
    }
}
