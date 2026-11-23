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
public final class z30 extends org.telegram.ui.Components.dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final f40 N;
    public final Context f54391c;
    public int d;
    public int f54392e;
    public int f54393f;
    public int h;
    public int f54394n;
    public int f54395r;
    public int f54396s;
    public int f54397w;
    public int f54398x;
    public int f54399y;

    public z30(f40 f40Var, LaunchActivity launchActivity) {
        this.N = f40Var;
        this.f54391c = launchActivity;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        f40 f40Var = this.N;
        ArrayList arrayList = f40Var.f47513l2;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var != null && !t3Var.j() && !f40Var.f47522n2) {
            this.f54398x = -1;
            this.f54399y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z10 = false;
            this.G = 0;
            if (f40Var.V2.d.h(org.telegram.messenger.gj.B1(f40Var.f47560v2)) >= 0) {
                z10 = true;
            }
            this.M = z10;
            if (f40Var.s1()) {
                int i7 = this.G;
                this.G = i7 + 1;
                this.L = i7;
            }
            int i10 = this.G;
            this.H = i10;
            int size = arrayList.size() + i10;
            this.G = size;
            this.I = size;
            if (arrayList.size() > 0) {
                int i11 = this.G;
                this.G = i11 + 1;
                this.J = i11;
            }
            if (!arrayList.isEmpty() && f40Var.T0() && f40Var.V2.f26950b.participants_count > org.telegram.messenger.np.u1(f40Var.f47526o1.f23202a).f25817c4) {
                int i12 = this.G;
                this.G = i12 + 1;
                this.K = i12;
            }
            this.d = this.G;
            if (!f40Var.v1()) {
                this.G = f40Var.V2.f26954g.size() + this.G;
            }
            this.f54392e = this.G;
            if (!f40Var.V2.f26956j.isEmpty() && !f40Var.v1()) {
                int i13 = this.G;
                this.f54393f = i13;
                int size2 = f40Var.V2.f26956j.size() + i13;
                this.G = size2;
                this.h = size2;
            } else {
                this.f54393f = -1;
                this.h = -1;
            }
            if (!f40Var.V2.f26959m.isEmpty() && !f40Var.v1()) {
                int i14 = this.G;
                this.f54394n = i14;
                int size3 = f40Var.V2.f26959m.size() + i14;
                this.G = size3;
                this.f54395r = size3;
            } else {
                this.f54394n = -1;
                this.f54395r = -1;
            }
            if (!f40Var.V2.f26958l.isEmpty() && !f40Var.v1()) {
                int i15 = this.G;
                this.f54396s = i15;
                int size4 = f40Var.V2.f26958l.size() + i15;
                this.G = size4;
                this.f54397w = size4;
            } else {
                this.f54396s = -1;
                this.f54397w = -1;
            }
            if (f40Var.s1()) {
                int i16 = this.G;
                this.f54399y = i16;
                this.G = i16 + 2;
                this.E = i16 + 1;
            } else if (!f40Var.v1() && (((!org.telegram.messenger.v3.T(f40Var.U2) || ((chat2 = f40Var.U2) != null && chat2.megagroup)) && org.telegram.messenger.v3.B(f40Var.U2)) || (org.telegram.messenger.v3.T(f40Var.U2) && (chat = f40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)))) {
                int i17 = this.G;
                this.G = i17 + 1;
                this.f54398x = i17;
            }
            int i18 = this.G;
            this.G = i18 + 1;
            this.F = i18;
        }
    }

    @Override
    public final int b() {
        return this.G;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.F) {
            return 3;
        }
        if (i7 != this.f54398x && i7 != this.f54399y && i7 != this.E) {
            if (i7 == this.J) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f54392e) {
                return 1;
            }
            if (i7 >= this.H && i7 < this.I) {
                return 4;
            }
            if (i7 == this.K) {
                return 6;
            }
            if (i7 == this.L) {
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
    public final void t(v4.f1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z30.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        uv uvVar;
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
        f40 f40Var = this.N;
        org.telegram.messenger.c cVar = f40Var.f47526o1;
        int i16 = 3;
        Context context = this.f54391c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    uvVar = new View(context);
                                } else {
                                    if (f40Var.f47509k2 == null) {
                                        f40Var.f47509k2 = new g.b();
                                    }
                                    uvVar = new uv(context, f40Var.f47509k2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.v3.W(f40Var.U2)) {
                                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743204, org.telegram.messenger.hd.G(org.telegram.messenger.np.u1(cVar.f23202a).f25817c4, "Participants", new Object[0])));
                                    uvVar = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131742980, org.telegram.messenger.hd.G(org.telegram.messenger.np.u1(cVar.f23202a).f25817c4, "Members", new Object[0])));
                                    uvVar = textView;
                                }
                            }
                        } else {
                            uvVar = new org.telegram.ui.Components.ln(context, 14);
                        }
                    } else {
                        uvVar = new y30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f32541n = org.telegram.ui.ActionBar.m6.f29482ih;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
                    frameLayout.f32539e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                    frameLayout.f32536a = q9Var;
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z10 = org.telegram.messenger.hd.f24444a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    int i17 = i11 | 48;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 11.0f;
                    }
                    if (z10) {
                        f11 = 11.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    frameLayout.addView(q9Var, c8.ma.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                    frameLayout.f32537b = m5Var;
                    org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29410eh, null);
                    m5Var.setTypeface(org.telegram.messenger.g0.o());
                    m5Var.setTextSize(16);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    m5Var.setGravity(i12 | 48);
                    boolean z11 = org.telegram.messenger.hd.f24444a0;
                    if (z11) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    if (z11) {
                        f12 = 54.0f;
                    } else {
                        f12 = 67.0f;
                    }
                    if (z11) {
                        f13 = 67.0f;
                    } else {
                        f13 = 54.0f;
                    }
                    frameLayout.addView(m5Var, c8.ma.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
                    frameLayout.f32538c = m5Var2;
                    m5Var2.setTextSize(15);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    m5Var2.setGravity(i14 | 48);
                    m5Var2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, frameLayout.f32541n, false));
                    m5Var2.l(org.telegram.messenger.hd.N0(2131748912, null), false);
                    boolean z12 = org.telegram.messenger.hd.f24444a0;
                    if (z12) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    int i19 = i15 | 48;
                    if (z12) {
                        f14 = 54.0f;
                    } else {
                        f14 = 67.0f;
                    }
                    if (z12) {
                        f15 = 67.0f;
                    } else {
                        f15 = 54.0f;
                    }
                    frameLayout.addView(m5Var2, c8.ma.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232194);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, frameLayout.f32541n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.hd.f24444a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.ma.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    uvVar = frameLayout;
                }
            } else {
                uvVar = new w30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f30412n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f30413r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            frameLayout2.f30410e = 23;
            org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
            frameLayout2.f30407a = m5Var3;
            org.telegram.ui.ActionBar.t6.X(m5Var3, org.telegram.ui.ActionBar.m6.G6, null);
            m5Var3.setTextSize(16);
            if (org.telegram.messenger.hd.f24444a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            m5Var3.setGravity(i10);
            m5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(m5Var3);
            org.telegram.ui.ActionBar.m5 m5Var4 = new org.telegram.ui.ActionBar.m5(context);
            frameLayout2.f30408b = m5Var4;
            org.telegram.ui.ActionBar.t6.X(m5Var4, org.telegram.ui.ActionBar.m6.I6, null);
            m5Var4.setTextSize(16);
            if (!org.telegram.messenger.hd.f24444a0) {
                i16 = 5;
            }
            m5Var4.setGravity(i16);
            m5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(m5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f30409c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.f29546m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            uvVar = frameLayout2;
        }
        return i5.c.q(uvVar, uvVar, -1, -2);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7;
        int i10;
        d30 d30Var = this.N.J1;
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        boolean z10 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (d30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.m6.f29482ih;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f29391dh;
            }
            g4Var.f(i10, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            if (f1Var.b() != this.G - 2) {
                z10 = true;
            }
            g4Var.setDrawDivider(z10);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (d30Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.m6.f29482ih;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f29391dh;
            }
            z3Var.a(i7, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            if (f1Var.b() != this.G - 2) {
                z10 = true;
            }
            z3Var.setDrawDivider(z10);
        }
    }
}
