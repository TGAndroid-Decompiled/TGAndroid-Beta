package yh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.y01;
import w7.b6;
import w7.n7;
public final class v extends y {
    public final int h;
    public final a0 f54533n;

    public v(a0 a0Var, Context context, int i10) {
        super(a0Var, context);
        int i11;
        this.h = i10;
        switch (i10) {
            case 1:
                this.f54533n = a0Var;
                super(a0Var, context);
                u51 u51Var = new u51(context, a0Var.f21583a, 0, false, new r(a0Var, 5), new s(a0Var, 5), null, a0Var.I0);
                this.d = u51Var;
                u51Var.r1();
                u51 u51Var2 = this.d;
                u51Var2.f30819f3.f29295r = false;
                u51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16021n);
                this.d.j(new p(this, 3));
                this.f54538c.addView(this.d, 0, b6.c(-1.0f, -1));
                org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
                this.f54536a = lVar;
                lVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.l lVar2 = this.f54536a;
                int i12 = t6.G6;
                a7.m(lVar2, 5, i12, a0Var.I0);
                a7.m(this.f54536a, 3, t6.f21332z8, a0Var.I0);
                this.f54536a.setBackButtonImage(2131231241);
                a7.m(this.f54536a, 1, t6.f21313y8, a0Var.I0);
                this.f54536a.setTitle(cd.L0(2131751886, null));
                this.f54536a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.f54536a.setActionBarMenuOnItemClick(new y01(this, 25));
                this.f54538c.addView(this.f54536a, b6.e(-1, 56, 48));
                LinearLayout f7 = m5.f(context, 0);
                f7.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
                vh.d dVar = new vh.d(context, a0Var.I0, true);
                dVar.e();
                int i13 = t6.f20929d6;
                dVar.setColor(i0.b.f(0.125f, t6.w0(i13, a0Var.I0), t6.w0(i12, a0Var.I0)));
                dVar.setText(cd.L0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    p6 p6Var = a0Var.I0;
                    dVar.setBackground(background);
                    v6 p5 = a7.p(dVar, true);
                    p5.d = background;
                    p5.e = null;
                    p5.f21417f = null;
                    if (background != null) {
                        u6 u6Var = new u6();
                        p5.e = u6Var;
                        u6Var.c(i13, i12, 3, 0.125f, p6Var);
                        u6Var.f21390g = a7.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final v f54541b;

                    {
                        this.f54541b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f54541b.f54533n.D1.f(false, true);
                                return;
                            default:
                                this.f54541b.f54533n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f7.addView(dVar, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                vh.d dVar2 = new vh.d(context, a0Var.I0, true);
                dVar2.setText(cd.L0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final v f54541b;

                    {
                        this.f54541b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f54541b.f54533n.D1.f(false, true);
                                return;
                            default:
                                this.f54541b.f54533n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f7.addView(dVar2, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f54538c.addView(f7, b6.f(-2.0f, -1, 80, 0, 0, 0, i0.f16021n));
                a();
                return;
            default:
                this.f54533n = a0Var;
                i0.E2(this.f54537b);
                u51 u51Var3 = new u51(context, a0Var.f21583a, 0, false, new r(a0Var, 3), new s(a0Var, 2), null, a0Var.I0);
                this.d = u51Var3;
                u51Var3.r1();
                u51 u51Var4 = this.d;
                u51Var4.f30819f3.f29295r = false;
                u51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16021n);
                this.f54538c.addView(a0Var.f54455x1, b6.g());
                this.f54538c.addView(this.d, 0, b6.c(-1.0f, -1));
                this.f54538c.addView(a0Var.f54457z1, b6.g());
                org.telegram.ui.ActionBar.l lVar3 = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
                this.f54536a = lVar3;
                lVar3.setOccupyStatusBar(false);
                a7.m(this.f54536a, 5, t6.G6, a0Var.I0);
                a7.m(this.f54536a, 3, t6.f21332z8, a0Var.I0);
                org.telegram.ui.ActionBar.l lVar4 = this.f54536a;
                boolean z10 = a0Var.E1;
                if (z10) {
                    i11 = 2131231242;
                } else {
                    i11 = 2131231241;
                }
                lVar4.setBackButtonImage(i11);
                a7.m(this.f54536a, 1, t6.f21313y8, a0Var.I0);
                this.f54536a.setTitle(cd.L0(2131751988, null));
                this.f54536a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.f54536a.setActionBarMenuOnItemClick(new y01(this, 23));
                this.f54538c.addView(this.f54536a, b6.e(-1, 56, 48));
                this.f54538c.addView(a0Var.f54453v1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y p9 = this.f54536a.p();
                p9.setGlassMode(true);
                p9.setTranslationX(-i0.L(7.0f));
                p9.a(3, 2131232485);
                vh.d dVar3 = new vh.d(getContext(), a0Var.I0, true);
                a0Var.f54447p1 = dVar3;
                dVar3.f();
                a0Var.f54447p1.setText(cd.L0(2131747847, null));
                a0Var.f54447p1.setOnClickListener(new rh.s(this, 28));
                if (z10) {
                    a0Var.f54447p1.setVisibility(8);
                }
                this.f54538c.addView(a0Var.f54447p1, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.f16021n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.f54533n.f54442j1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f54533n.f54453v1.setTranslationY(Math.max(i0.L(8.0f) + i0.f16020m, b() + i0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
