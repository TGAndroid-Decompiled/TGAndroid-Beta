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
public final class w30 extends org.telegram.ui.Components.tj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final c40 N;
    public final Context f52383c;
    public int d;
    public int f52384e;
    public int f52385f;
    public int h;
    public int f52386n;
    public int f52387r;
    public int f52388s;
    public int f52389w;
    public int f52390x;
    public int f52391y;

    public w30(c40 c40Var, LaunchActivity launchActivity) {
        this.N = c40Var;
        this.f52383c = launchActivity;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        c40 c40Var = this.N;
        ArrayList arrayList = c40Var.f45927l2;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        if (r3Var != null && !r3Var.j() && !c40Var.f45936n2) {
            this.f52390x = -1;
            this.f52391y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z10 = false;
            this.G = 0;
            if (c40Var.V2.d.h(org.telegram.messenger.gj.B1(c40Var.f45974v2)) >= 0) {
                z10 = true;
            }
            this.M = z10;
            if (c40Var.r1()) {
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
            if (!arrayList.isEmpty() && c40Var.S0() && c40Var.V2.f26216b.participants_count > org.telegram.messenger.np.s1(c40Var.f45940o1.f22782a).f25232a4) {
                int i12 = this.G;
                this.G = i12 + 1;
                this.K = i12;
            }
            this.d = this.G;
            if (!c40Var.u1()) {
                this.G = c40Var.V2.f26220g.size() + this.G;
            }
            this.f52384e = this.G;
            if (!c40Var.V2.f26222j.isEmpty() && !c40Var.u1()) {
                int i13 = this.G;
                this.f52385f = i13;
                int size2 = c40Var.V2.f26222j.size() + i13;
                this.G = size2;
                this.h = size2;
            } else {
                this.f52385f = -1;
                this.h = -1;
            }
            if (!c40Var.V2.f26225m.isEmpty() && !c40Var.u1()) {
                int i14 = this.G;
                this.f52386n = i14;
                int size3 = c40Var.V2.f26225m.size() + i14;
                this.G = size3;
                this.f52387r = size3;
            } else {
                this.f52386n = -1;
                this.f52387r = -1;
            }
            if (!c40Var.V2.f26224l.isEmpty() && !c40Var.u1()) {
                int i15 = this.G;
                this.f52388s = i15;
                int size4 = c40Var.V2.f26224l.size() + i15;
                this.G = size4;
                this.f52389w = size4;
            } else {
                this.f52388s = -1;
                this.f52389w = -1;
            }
            if (c40Var.r1()) {
                int i16 = this.G;
                this.f52391y = i16;
                this.G = i16 + 2;
                this.E = i16 + 1;
            } else if (!c40Var.u1() && (((!org.telegram.messenger.t3.T(c40Var.U2) || ((chat2 = c40Var.U2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(c40Var.U2)) || (org.telegram.messenger.t3.T(c40Var.U2) && (chat = c40Var.U2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
                int i17 = this.G;
                this.G = i17 + 1;
                this.f52390x = i17;
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
        if (i7 != this.f52390x && i7 != this.f52391y && i7 != this.E) {
            if (i7 == this.J) {
                return 5;
            }
            if (i7 >= this.d && i7 < this.f52384e) {
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
    public final void t(v4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w30.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        rv rvVar;
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
        c40 c40Var = this.N;
        org.telegram.messenger.c cVar = c40Var.f45940o1;
        int i16 = 3;
        Context context = this.f52383c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    rvVar = new View(context);
                                } else {
                                    if (c40Var.f45923k2 == null) {
                                        c40Var.f45923k2 = new g.b();
                                    }
                                    rvVar = new rv(context, c40Var.f45923k2);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
                                if (org.telegram.messenger.t3.W(c40Var.U2)) {
                                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743449, org.telegram.messenger.hd.G(org.telegram.messenger.np.s1(cVar.f22782a).f25232a4, "Participants", new Object[0])));
                                    rvVar = textView;
                                } else {
                                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743225, org.telegram.messenger.hd.G(org.telegram.messenger.np.s1(cVar.f22782a).f25232a4, "Members", new Object[0])));
                                    rvVar = textView;
                                }
                            }
                        } else {
                            rvVar = new org.telegram.ui.Components.bn(context, 14);
                        }
                    } else {
                        rvVar = new v30(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f32061n = org.telegram.ui.ActionBar.j6.f28950ih;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
                    frameLayout.f32059e = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                    frameLayout.f32056a = i9Var;
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
                    boolean z10 = org.telegram.messenger.hd.f24104a0;
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
                    frameLayout.addView(i9Var, c8.ja.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                    frameLayout.f32057b = j5Var;
                    org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f28878eh, null);
                    j5Var.setTypeface(org.telegram.messenger.g0.o());
                    j5Var.setTextSize(16);
                    if (org.telegram.messenger.hd.f24104a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    j5Var.setGravity(i12 | 48);
                    boolean z11 = org.telegram.messenger.hd.f24104a0;
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
                    frameLayout.addView(j5Var, c8.ja.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
                    frameLayout.f32058c = j5Var2;
                    j5Var2.setTextSize(15);
                    if (org.telegram.messenger.hd.f24104a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    j5Var2.setGravity(i14 | 48);
                    j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, frameLayout.f32061n, false));
                    j5Var2.l(org.telegram.messenger.hd.M0(2131749105, null), false);
                    boolean z12 = org.telegram.messenger.hd.f24104a0;
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
                    frameLayout.addView(j5Var2, c8.ja.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232193);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, frameLayout.f32061n, false), PorterDuff.Mode.MULTIPLY));
                    if (!org.telegram.messenger.hd.f24104a0) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, c8.ja.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    rvVar = frameLayout;
                }
            } else {
                rvVar = new t30(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f32113n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f32114r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
            frameLayout2.f32111e = 23;
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            frameLayout2.f32108a = j5Var3;
            org.telegram.ui.ActionBar.q6.X(j5Var3, org.telegram.ui.ActionBar.j6.G6, null);
            j5Var3.setTextSize(16);
            if (org.telegram.messenger.hd.f24104a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            j5Var3.setGravity(i10);
            j5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(j5Var3);
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            frameLayout2.f32109b = j5Var4;
            org.telegram.ui.ActionBar.q6.X(j5Var4, org.telegram.ui.ActionBar.j6.I6, null);
            j5Var4.setTextSize(16);
            if (!org.telegram.messenger.hd.f24104a0) {
                i16 = 5;
            }
            j5Var4.setGravity(i16);
            j5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(j5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f32110c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.f29014m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            rvVar = frameLayout2;
        }
        return i5.c.q(rvVar, rvVar, -1, -2);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7;
        int i10;
        a30 a30Var = this.N.J1;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (a30Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.j6.f28950ih;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f28859dh;
            }
            f4Var.f(i10, org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            if (e1Var.b() != this.G - 2) {
                z10 = true;
            }
            f4Var.setDrawDivider(z10);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (a30Var.getTag() != null) {
                i7 = org.telegram.ui.ActionBar.j6.f28950ih;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f28859dh;
            }
            y3Var.a(i7, org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            if (e1Var.b() != this.G - 2) {
                z10 = true;
            }
            y3Var.setDrawDivider(z10);
        }
    }
}
