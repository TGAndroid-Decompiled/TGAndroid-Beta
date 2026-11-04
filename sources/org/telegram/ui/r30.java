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
public final class r30 extends org.telegram.ui.Components.sj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final x30 N;
    public final Context f49013c;
    public int d;
    public int f49014e;
    public int f49015f;
    public int h;
    public int f49016n;
    public int f49017r;
    public int f49018s;
    public int f49019w;
    public int f49020x;
    public int f49021y;

    public r30(x30 x30Var, LaunchActivity launchActivity) {
        this.N = x30Var;
        this.f49013c = launchActivity;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        x30 x30Var = this.N;
        ArrayList arrayList = x30Var.f51747i2;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var != null && !r3Var.j() && !x30Var.f51755k2) {
            this.f49020x = -1;
            this.f49021y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z10 = false;
            this.G = 0;
            if (x30Var.S2.d.h(org.telegram.messenger.zi.C1(x30Var.f51792s2)) >= 0) {
                z10 = true;
            }
            this.M = z10;
            if (x30Var.q1()) {
                int i3 = this.G;
                this.G = i3 + 1;
                this.L = i3;
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
            if (!arrayList.isEmpty() && x30Var.S0() && x30Var.S2.f25049b.participants_count > org.telegram.messenger.hp.s1(x30Var.f51759l1.f21919a).f22958a4) {
                int i12 = this.G;
                this.G = i12 + 1;
                this.K = i12;
            }
            this.d = this.G;
            if (!x30Var.t1()) {
                this.G = x30Var.S2.f25053g.size() + this.G;
            }
            this.f49014e = this.G;
            if (!x30Var.S2.f25055j.isEmpty() && !x30Var.t1()) {
                int i13 = this.G;
                this.f49015f = i13;
                int size2 = x30Var.S2.f25055j.size() + i13;
                this.G = size2;
                this.h = size2;
            } else {
                this.f49015f = -1;
                this.h = -1;
            }
            if (!x30Var.S2.f25058m.isEmpty() && !x30Var.t1()) {
                int i14 = this.G;
                this.f49016n = i14;
                int size3 = x30Var.S2.f25058m.size() + i14;
                this.G = size3;
                this.f49017r = size3;
            } else {
                this.f49016n = -1;
                this.f49017r = -1;
            }
            if (!x30Var.S2.f25057l.isEmpty() && !x30Var.t1()) {
                int i15 = this.G;
                this.f49018s = i15;
                int size4 = x30Var.S2.f25057l.size() + i15;
                this.G = size4;
                this.f49019w = size4;
            } else {
                this.f49018s = -1;
                this.f49019w = -1;
            }
            if (x30Var.q1()) {
                int i16 = this.G;
                this.f49021y = i16;
                this.G = i16 + 2;
                this.E = i16 + 1;
            } else if (!x30Var.t1() && (((!org.telegram.messenger.t3.T(x30Var.R2) || ((chat2 = x30Var.R2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(x30Var.R2)) || (org.telegram.messenger.t3.T(x30Var.R2) && (chat = x30Var.R2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
                int i17 = this.G;
                this.G = i17 + 1;
                this.f49020x = i17;
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
    public final int d(int i3) {
        if (i3 == this.F) {
            return 3;
        }
        if (i3 != this.f49020x && i3 != this.f49021y && i3 != this.E) {
            if (i3 == this.J) {
                return 5;
            }
            if (i3 >= this.d && i3 < this.f49014e) {
                return 1;
            }
            if (i3 >= this.H && i3 < this.I) {
                return 4;
            }
            if (i3 == this.K) {
                return 6;
            }
            if (i3 == this.L) {
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
    public final void g(int i3) {
        E();
        super.g(i3);
    }

    @Override
    public final void j(int i3, int i10) {
        E();
        super.j(i3, i10);
    }

    @Override
    public final void k(int i3, int i10) {
        E();
        super.k(i3, i10);
    }

    @Override
    public final void n(int i3, int i10, Object obj) {
        E();
        super.n(i3, i10, obj);
    }

    @Override
    public final void o(int i3, int i10) {
        E();
        super.o(i3, i10);
    }

    @Override
    public final void p(int i3, int i10) {
        E();
        super.p(i3, i10);
    }

    @Override
    public final void t(u4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r30.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        org.telegram.ui.Components.voip.r0 r0Var;
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
        x30 x30Var = this.N;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        int i16 = 3;
        Context context = this.f49013c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    r0Var = new View(context);
                                } else {
                                    if (x30Var.f51743h2 == null) {
                                        x30Var.f51743h2 = new g.b();
                                    }
                                    r0Var = new org.telegram.ui.Components.voip.r0(context, x30Var.f51743h2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.t3.W(x30Var.R2)) {
                                    textView.setText(org.telegram.messenger.bd.a0(null, null, 2131743459, org.telegram.messenger.bd.G(org.telegram.messenger.hp.s1(cVar.f21919a).f22958a4, "Participants", new Object[0])));
                                    r0Var = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.bd.a0(null, null, 2131743235, org.telegram.messenger.bd.G(org.telegram.messenger.hp.s1(cVar.f21919a).f22958a4, "Members", new Object[0])));
                                    r0Var = textView;
                                }
                            }
                        } else {
                            r0Var = new org.telegram.ui.Components.sm(context, 15);
                        }
                    } else {
                        r0Var = new q30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30986n = org.telegram.ui.ActionBar.k6.f27928fh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
                    frameLayout.f30984e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                    frameLayout.f30981a = k9Var;
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z10 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout.addView(k9Var, b8.mf.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f30982b = k5Var;
                    org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27853bh, null);
                    k5Var.setTypeface(org.telegram.messenger.g0.o());
                    k5Var.setTextSize(16);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    k5Var.setGravity(i12 | 48);
                    boolean z11 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout.addView(k5Var, b8.mf.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f30983c = k5Var2;
                    k5Var2.setTextSize(15);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    k5Var2.setGravity(i14 | 48);
                    k5Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, frameLayout.f30986n, false));
                    k5Var2.l(org.telegram.messenger.bd.M0(2131749113, null), false);
                    boolean z12 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout.addView(k5Var2, b8.mf.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232192);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, frameLayout.f30986n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.bd.f21784a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, b8.mf.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    r0Var = frameLayout;
                }
            } else {
                r0Var = new o30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f31043n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f31044r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            frameLayout2.f31041e = 23;
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f31038a = k5Var3;
            org.telegram.ui.ActionBar.r6.Y(k5Var3, org.telegram.ui.ActionBar.k6.G6, null);
            k5Var3.setTextSize(16);
            if (org.telegram.messenger.bd.f21784a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            k5Var3.setGravity(i10);
            k5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var3);
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f31039b = k5Var4;
            org.telegram.ui.ActionBar.r6.Y(k5Var4, org.telegram.ui.ActionBar.k6.I6, null);
            k5Var4.setTextSize(16);
            if (!org.telegram.messenger.bd.f21784a0) {
                i16 = 5;
            }
            k5Var4.setGravity(i16);
            k5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f31040c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f28043m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            r0Var = frameLayout2;
        }
        return k2.p1.p(r0Var, r0Var, -1, -2);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int i3;
        int i10;
        u20 u20Var = this.N.G1;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (u20Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.k6.f27928fh;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f27833ah;
            }
            f4Var.f(i10, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            if (d1Var.b() != this.G - 2) {
                z10 = true;
            }
            f4Var.setDrawDivider(z10);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (u20Var.getTag() != null) {
                i3 = org.telegram.ui.ActionBar.k6.f27928fh;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.f27833ah;
            }
            y3Var.a(i3, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            if (d1Var.b() != this.G - 2) {
                z10 = true;
            }
            y3Var.setDrawDivider(z10);
        }
    }
}
