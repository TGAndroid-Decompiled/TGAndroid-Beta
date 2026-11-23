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
public final class y30 extends org.telegram.ui.Components.dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final e40 N;
    public final Context f54174c;
    public int d;
    public int f54175e;
    public int f54176f;
    public int h;
    public int f54177n;
    public int f54178r;
    public int f54179s;
    public int f54180w;
    public int f54181x;
    public int f54182y;

    public y30(e40 e40Var, LaunchActivity launchActivity) {
        this.N = e40Var;
        this.f54174c = launchActivity;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        e40 e40Var = this.N;
        ArrayList arrayList = e40Var.f47363l2;
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        if (t3Var != null && !t3Var.j() && !e40Var.f47372n2) {
            this.f54181x = -1;
            this.f54182y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z10 = false;
            this.G = 0;
            if (e40Var.V2.d.h(org.telegram.messenger.fj.B1(e40Var.f47410v2)) >= 0) {
                z10 = true;
            }
            this.M = z10;
            if (e40Var.s1()) {
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
            if (!arrayList.isEmpty() && e40Var.T0() && e40Var.V2.f27034b.participants_count > org.telegram.messenger.mp.u1(e40Var.f47376o1.f23343a).f25713c4) {
                int i12 = this.G;
                this.G = i12 + 1;
                this.K = i12;
            }
            this.d = this.G;
            if (!e40Var.v1()) {
                this.G = e40Var.V2.f27038g.size() + this.G;
            }
            this.f54175e = this.G;
            if (!e40Var.V2.f27040j.isEmpty() && !e40Var.v1()) {
                int i13 = this.G;
                this.f54176f = i13;
                int size2 = e40Var.V2.f27040j.size() + i13;
                this.G = size2;
                this.h = size2;
            } else {
                this.f54176f = -1;
                this.h = -1;
            }
            if (!e40Var.V2.f27043m.isEmpty() && !e40Var.v1()) {
                int i14 = this.G;
                this.f54177n = i14;
                int size3 = e40Var.V2.f27043m.size() + i14;
                this.G = size3;
                this.f54178r = size3;
            } else {
                this.f54177n = -1;
                this.f54178r = -1;
            }
            if (!e40Var.V2.f27042l.isEmpty() && !e40Var.v1()) {
                int i15 = this.G;
                this.f54179s = i15;
                int size4 = e40Var.V2.f27042l.size() + i15;
                this.G = size4;
                this.f54180w = size4;
            } else {
                this.f54179s = -1;
                this.f54180w = -1;
            }
            if (e40Var.s1()) {
                int i16 = this.G;
                this.f54182y = i16;
                this.G = i16 + 2;
                this.E = i16 + 1;
            } else if (!e40Var.v1() && (((!org.telegram.messenger.v3.T(e40Var.U2) || ((chat2 = e40Var.U2) != null && chat2.megagroup)) && org.telegram.messenger.v3.B(e40Var.U2)) || (org.telegram.messenger.v3.T(e40Var.U2) && (chat = e40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)))) {
                int i17 = this.G;
                this.G = i17 + 1;
                this.f54181x = i17;
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
        if (i7 != this.f54181x && i7 != this.f54182y && i7 != this.E) {
            if (i7 == this.J) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f54175e) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y30.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        tv tvVar;
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
        e40 e40Var = this.N;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        int i16 = 3;
        Context context = this.f54174c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    tvVar = new View(context);
                                } else {
                                    if (e40Var.f47359k2 == null) {
                                        e40Var.f47359k2 = new g.b();
                                    }
                                    tvVar = new tv(context, e40Var.f47359k2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.v3.W(e40Var.U2)) {
                                    textView.setText(org.telegram.messenger.gd.a0(null, null, 2131743199, org.telegram.messenger.gd.G(org.telegram.messenger.mp.u1(cVar.f23343a).f25713c4, "Participants", new Object[0])));
                                    tvVar = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.gd.a0(null, null, 2131742975, org.telegram.messenger.gd.G(org.telegram.messenger.mp.u1(cVar.f23343a).f25713c4, "Members", new Object[0])));
                                    tvVar = textView;
                                }
                            }
                        } else {
                            tvVar = new org.telegram.ui.Components.in(context, 14);
                        }
                    } else {
                        tvVar = new x30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f32595n = org.telegram.ui.ActionBar.n6.f29552ih;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
                    frameLayout.f32593e = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                    frameLayout.f32590a = p9Var;
                    p9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z10 = org.telegram.messenger.gd.f24314a0;
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
                    frameLayout.addView(p9Var, c8.na.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                    frameLayout.f32591b = n5Var;
                    org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29480eh, null);
                    n5Var.setTypeface(org.telegram.messenger.g0.o());
                    n5Var.setTextSize(16);
                    if (org.telegram.messenger.gd.f24314a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    n5Var.setGravity(i12 | 48);
                    boolean z11 = org.telegram.messenger.gd.f24314a0;
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
                    frameLayout.addView(n5Var, c8.na.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
                    frameLayout.f32592c = n5Var2;
                    n5Var2.setTextSize(15);
                    if (org.telegram.messenger.gd.f24314a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    n5Var2.setGravity(i14 | 48);
                    n5Var2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, frameLayout.f32595n, false));
                    n5Var2.l(org.telegram.messenger.gd.N0(2131748912, null), false);
                    boolean z12 = org.telegram.messenger.gd.f24314a0;
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
                    frameLayout.addView(n5Var2, c8.na.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232197);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, frameLayout.f32595n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.gd.f24314a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.na.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    tvVar = frameLayout;
                }
            } else {
                tvVar = new v30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f30471n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f30472r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
            frameLayout2.f30469e = 23;
            org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
            frameLayout2.f30466a = n5Var3;
            org.telegram.ui.ActionBar.u6.X(n5Var3, org.telegram.ui.ActionBar.n6.G6, null);
            n5Var3.setTextSize(16);
            if (org.telegram.messenger.gd.f24314a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            n5Var3.setGravity(i10);
            n5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(n5Var3);
            org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(context);
            frameLayout2.f30467b = n5Var4;
            org.telegram.ui.ActionBar.u6.X(n5Var4, org.telegram.ui.ActionBar.n6.I6, null);
            n5Var4.setTextSize(16);
            if (!org.telegram.messenger.gd.f24314a0) {
                i16 = 5;
            }
            n5Var4.setGravity(i16);
            n5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(n5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f30468c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.f29616m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            tvVar = frameLayout2;
        }
        return i5.c.q(tvVar, tvVar, -1, -2);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7;
        int i10;
        c30 c30Var = this.N.J1;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (c30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.n6.f29552ih;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29461dh;
            }
            g4Var.f(i10, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            if (f1Var.b() != this.G - 2) {
                z10 = true;
            }
            g4Var.setDrawDivider(z10);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (c30Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.n6.f29552ih;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29461dh;
            }
            z3Var.a(i7, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            if (f1Var.b() != this.G - 2) {
                z10 = true;
            }
            z3Var.setDrawDivider(z10);
        }
    }
}
