package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class rn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.messenger.kp D;
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.p6 f41249a;
    public final int f41250b;
    public final boolean f41251c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.r8 e;
    public final kl f41252f;
    public final org.telegram.ui.ActionBar.u5 h;
    public boolean f41253n;
    public final org.telegram.ui.Components.d5 f41254r;
    public final org.telegram.ui.Components.d5 f41255s;
    public final org.telegram.ui.Components.d5 f41256w;
    public final th.u5 f41257x;
    public final org.telegram.ui.Components.t5 f41258y;

    public rn0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        CharSequence p5;
        long c10;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.e = r8Var;
        this.f41256w = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 13, this, false);
        this.f41257x = new th.u5(this);
        this.f41258y = new org.telegram.ui.Components.t5(this, 320L, org.telegram.ui.Components.gr.h);
        this.F = new RectF();
        this.f41250b = i10;
        this.f41249a = p6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41251c = z10;
        kl klVar = new kl(this, context, 2);
        this.f41252f = klVar;
        this.f41254r = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), klVar);
        this.f41255s = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), klVar);
        klVar.setLeftDrawableOutside(true);
        klVar.setRightDrawableOutside(true);
        klVar.setTextColor(-1);
        klVar.setTextSize(20);
        klVar.setTypeface(org.telegram.messenger.i0.o());
        klVar.setWidthWrapContent(true);
        addView(klVar, w7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.h = u5Var;
        u5Var.setTextSize(14);
        u5Var.setTextColor(-2130706433);
        u5Var.setGravity(1);
        addView(u5Var, w7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.i0.L(96.0f));
        if (z10) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 == null) {
                p5 = "";
            } else {
                p5 = L0.title;
            }
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
            c10 = org.telegram.messenger.o5.c(L0);
            if (L0 != null) {
                j11 = org.telegram.messenger.o5.f(L0.emoji_status);
            }
        } else {
            TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
            p5 = org.telegram.messenger.h20.p(f7);
            r8Var.r(f7);
            imageReceiver.i0(f7, r8Var, null);
            c10 = org.telegram.messenger.o5.c(f7);
            if (f7 != null) {
                j11 = org.telegram.messenger.o5.f(f7.emoji_status);
            }
        }
        try {
            p5 = org.telegram.messenger.k6.m(p5, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f41252f.l(p5, false);
        this.f41254r.j(c10, false);
        this.f41252f.setLeftDrawable(this.f41254r);
        this.f41255s.j(j11, false);
        this.f41252f.i(this.f41255s);
        if (this.f41251c) {
            long j12 = -j10;
            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j12));
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j12);
            if (M0 != null && M0.participants_count > 0) {
                if (org.telegram.messenger.w3.V(L02)) {
                    this.h.l(org.telegram.messenger.cd.H(',', "Subscribers", M0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.cd.H(',', "Members", M0.participants_count), false);
                }
            } else if (L02 != null && L02.participants_count > 0) {
                if (org.telegram.messenger.w3.V(L02)) {
                    this.h.l(org.telegram.messenger.cd.H(',', "Subscribers", L02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.cd.H(',', "Members", L02.participants_count), false);
                }
            } else {
                boolean t02 = org.telegram.messenger.w3.t0(L02);
                if (org.telegram.messenger.w3.V(L02)) {
                    org.telegram.ui.ActionBar.u5 u5Var2 = this.h;
                    if (t02) {
                        i12 = 2131752318;
                    } else {
                        i12 = 2131752329;
                    }
                    u5Var2.l(org.telegram.messenger.cd.L0(i12, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.u5 u5Var3 = this.h;
                    if (t02) {
                        i11 = 2131748653;
                    } else {
                        i11 = 2131748656;
                    }
                    u5Var3.l(org.telegram.messenger.cd.L0(i11, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.cd.L0(2131747842, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int w02;
        int w03;
        org.telegram.messenger.kp kpVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f41249a;
        if (i10 >= 14) {
            org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18888r4;
            if (lpVar != null) {
                kpVar = lpVar.d(i10);
            } else {
                kpVar = null;
            }
            if (kpVar != null) {
                int f7 = kpVar.f();
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.f(f7)], p6Var);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.f(f7)], p6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.e(j10)], p6Var);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.e(j10)], p6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.e(j11)], p6Var);
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.e(j11)], p6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21004h8));
    }

    public void b(int i10, boolean z10) {
        org.telegram.messenger.kp d;
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.f41250b).f18898s4;
        if (lpVar == null) {
            d = null;
        } else {
            d = lpVar.d(i10);
        }
        c(d, z10);
    }

    public final void c(org.telegram.messenger.kp kpVar, boolean z10) {
        boolean q6;
        this.D = kpVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f41249a;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        kl klVar = this.f41252f;
        org.telegram.ui.Components.d5 d5Var = this.f41254r;
        org.telegram.ui.Components.d5 d5Var2 = this.f41255s;
        org.telegram.ui.ActionBar.u5 u5Var = this.h;
        org.telegram.ui.Components.d5 d5Var3 = this.f41256w;
        if (kpVar != null) {
            int i10 = kpVar.f16619a;
            if (i10 != 0) {
                d5Var3.k(Integer.valueOf(i10));
            } else {
                d5Var3.k(Integer.valueOf(tn0.A0(kpVar.c(q6))));
            }
            d5Var2.k(Integer.valueOf(i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
            d5Var.k(Integer.valueOf(i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
            int f7 = i0.b.f(0.5f, kpVar.m(q6), kpVar.n(q6));
            int i11 = org.telegram.ui.ActionBar.t6.f21206s8;
            if (!org.telegram.ui.ActionBar.t6.e1(org.telegram.ui.ActionBar.t6.w0(i11, p6Var))) {
                u5Var.setTextColor(f7);
            } else {
                u5Var.setTextColor(org.telegram.ui.ActionBar.t6.D(q6, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), f7, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, p6Var), f7));
            }
            klVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.f21206s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) > 0.8f) {
                d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var)));
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) < 0.2f) {
                d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var))));
            } else {
                d5Var3.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.t6.ni;
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
            u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
            klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        }
        this.E = 0;
        this.f41257x.c(kpVar, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q6;
        org.telegram.messenger.kp kpVar;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.d5 d5Var = this.f41256w;
        if (i11 == 0) {
            d5Var.g(null, z11);
        } else {
            d5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f41249a;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        org.telegram.messenger.kp kpVar2 = this.D;
        if (kpVar2 != null) {
            int i12 = kpVar2.f16619a;
            if (i12 != 0) {
                d5Var.k(Integer.valueOf(i12));
            } else {
                d5Var.k(Integer.valueOf(tn0.A0(kpVar2.c(q6))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.t6.f21206s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) > 0.8f) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var)));
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) < 0.2f) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A8, false))));
            } else {
                d5Var.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.x0(null, i13, false))));
            }
        }
        org.telegram.messenger.kp kpVar3 = this.D;
        org.telegram.ui.Components.d5 d5Var2 = this.f41255s;
        if (kpVar3 != null) {
            int e = kpVar3.e(1, p6Var);
            if (this.D.o(q6)) {
                kpVar = this.D;
                i10 = 4;
            } else {
                kpVar = this.D;
                i10 = 2;
            }
            d5Var2.k(Integer.valueOf(i0.b.f(0.5f, e, kpVar.e(i10, p6Var))));
        } else {
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.f41258y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int width = getWidth();
        RectF rectF = this.F;
        rectF.set((getWidth() - org.telegram.messenger.i0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.i0.L(168.0f), (org.telegram.messenger.i0.L(86.0f) + width) / 2.0f, getHeight() - org.telegram.messenger.i0.L(82.0f));
        rh.j0.c(canvas, this.f41256w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f41253n) {
            f7 = 18.0f;
        } else {
            f7 = 54.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.J0(L);
        imageReceiver.A0(rectF);
        imageReceiver.h(canvas, null);
        float width2 = (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(4.0f);
        if (this.f41253n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float L2 = org.telegram.messenger.i0.L(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f41257x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q6;
        int j11;
        int[] iArr;
        org.telegram.ui.Components.d5 d5Var = this.f41255s;
        d5Var.j(j10, z11);
        d5Var.m(z10, z11);
        org.telegram.ui.ActionBar.p6 p6Var = this.f41249a;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        org.telegram.messenger.kp kpVar = this.D;
        if (kpVar != null) {
            int h = kpVar.h(q6);
            if (this.D.o(q6)) {
                org.telegram.messenger.kp kpVar2 = this.D;
                if (q6) {
                    iArr = kpVar2.h;
                } else {
                    iArr = kpVar2.f16623g;
                }
                j11 = iArr[4];
            } else {
                j11 = this.D.j(q6);
            }
            d5Var.k(Integer.valueOf(i0.b.f(0.5f, h, j11)));
        } else {
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        this.E = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41256w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41256w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.f41253n != z10) {
            invalidate();
        }
        this.f41253n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.d5 d5Var;
        org.telegram.ui.Components.d5 d5Var2;
        kl klVar;
        org.telegram.ui.ActionBar.u5 u5Var;
        boolean q6;
        int j10;
        int[] iArr;
        int e;
        org.telegram.ui.Components.d5 d5Var3 = this.f41256w;
        if (d5Var3 != null && (d5Var = this.f41255s) != null && (d5Var2 = this.f41254r) != null && (klVar = this.f41252f) != null && (u5Var = this.h) != null) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f41249a;
            try {
                if (p6Var != null) {
                    q6 = p6Var.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.t6.I.q();
                }
                org.telegram.messenger.kp kpVar = this.D;
                if (kpVar != null) {
                    int i10 = kpVar.f16619a;
                    if (i10 != 0) {
                        d5Var3.k(Integer.valueOf(i10));
                    } else {
                        d5Var3.k(Integer.valueOf(tn0.A0(kpVar.c(q6))));
                    }
                    d5Var2.k(Integer.valueOf(i0.b.f(0.25f, this.D.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
                    int i11 = this.E;
                    if (i11 == 1) {
                        int e7 = this.D.e(1, p6Var);
                        if (this.D.o(q6)) {
                            e = this.D.e(4, p6Var);
                        } else {
                            e = this.D.e(2, p6Var);
                        }
                        d5Var.k(Integer.valueOf(i0.b.f(0.5f, e7, e)));
                    } else if (i11 == 2) {
                        int h = this.D.h(q6);
                        if (this.D.o(q6)) {
                            org.telegram.messenger.kp kpVar2 = this.D;
                            if (q6) {
                                iArr = kpVar2.h;
                            } else {
                                iArr = kpVar2.f16623g;
                            }
                            j10 = iArr[4];
                        } else {
                            j10 = this.D.j(q6);
                        }
                        d5Var.k(Integer.valueOf(i0.b.f(0.5f, h, j10)));
                    } else {
                        d5Var.k(Integer.valueOf(i0.b.f(0.25f, this.D.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
                    }
                    int f7 = i0.b.f(0.5f, this.D.m(q6), this.D.n(q6));
                    int i12 = org.telegram.ui.ActionBar.t6.f21206s8;
                    if (!org.telegram.ui.ActionBar.t6.e1(org.telegram.ui.ActionBar.t6.w0(i12, p6Var))) {
                        u5Var.setTextColor(f7);
                    } else {
                        u5Var.setTextColor(org.telegram.ui.ActionBar.t6.D(q6, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), f7, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, p6Var), f7));
                    }
                    klVar.setTextColor(-1);
                } else {
                    int i13 = org.telegram.ui.ActionBar.t6.f21206s8;
                    if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) > 0.8f) {
                        d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, p6Var)));
                    } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) < 0.2f) {
                        d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var))));
                    } else {
                        d5Var3.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var))));
                    }
                    int i14 = org.telegram.ui.ActionBar.t6.ni;
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i14, p6Var)));
                    d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i14, p6Var)));
                    u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
                    klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
                }
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
            }
        }
    }
}
