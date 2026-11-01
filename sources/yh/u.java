package yh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.v51;
import org.telegram.ui.z01;
import w7.b6;
import w7.n7;
public final class u extends x {
    public final int h;
    public final z f54534n;

    public u(z zVar, Context context, int i10) {
        super(zVar, context);
        int i11;
        this.h = i10;
        switch (i10) {
            case 1:
                this.f54534n = zVar;
                super(zVar, context);
                v51 v51Var = new v51(context, zVar.f21584a, 0, false, new q(zVar, 5), new r(zVar, 5), null, zVar.I0);
                this.d = v51Var;
                v51Var.r1();
                v51 v51Var2 = this.d;
                v51Var2.f31183f3.f29638r = false;
                v51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16167n);
                this.d.j(new o(this, 3));
                this.f54539c.addView(this.d, 0, b6.c(-1.0f, -1));
                org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, zVar.I0);
                this.f54537a = lVar;
                lVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.l lVar2 = this.f54537a;
                int i12 = t6.G6;
                a7.m(lVar2, 5, i12, zVar.I0);
                a7.m(this.f54537a, 3, t6.f21333z8, zVar.I0);
                this.f54537a.setBackButtonImage(2131231241);
                a7.m(this.f54537a, 1, t6.f21314y8, zVar.I0);
                this.f54537a.setTitle(dd.L0(2131751886, null));
                this.f54537a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.f54537a.setActionBarMenuOnItemClick(new z01(this, 25));
                this.f54539c.addView(this.f54537a, b6.e(-1, 56, 48));
                LinearLayout f7 = m5.f(context, 0);
                f7.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
                vh.d dVar = new vh.d(context, zVar.I0, true);
                dVar.e();
                int i13 = t6.f20930d6;
                dVar.setColor(i0.b.f(0.125f, t6.w0(i13, zVar.I0), t6.w0(i12, zVar.I0)));
                dVar.setText(dd.L0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    p6 p6Var = zVar.I0;
                    dVar.setBackground(background);
                    v6 p5 = a7.p(dVar, true);
                    p5.d = background;
                    p5.e = null;
                    p5.f21418f = null;
                    if (background != null) {
                        u6 u6Var = new u6();
                        p5.e = u6Var;
                        u6Var.c(i13, i12, 3, 0.125f, p6Var);
                        u6Var.f21391g = a7.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final u f54542b;

                    {
                        this.f54542b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f54542b.f54534n.D1.f(false, true);
                                return;
                            default:
                                this.f54542b.f54534n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f7.addView(dVar, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                vh.d dVar2 = new vh.d(context, zVar.I0, true);
                dVar2.setText(dd.L0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final u f54542b;

                    {
                        this.f54542b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f54542b.f54534n.D1.f(false, true);
                                return;
                            default:
                                this.f54542b.f54534n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f7.addView(dVar2, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f54539c.addView(f7, b6.f(-2.0f, -1, 80, 0, 0, 0, i0.f16167n));
                a();
                return;
            default:
                this.f54534n = zVar;
                i0.E2(this.f54538b);
                v51 v51Var3 = new v51(context, zVar.f21584a, 0, false, new q(zVar, 3), new r(zVar, 2), null, zVar.I0);
                this.d = v51Var3;
                v51Var3.r1();
                v51 v51Var4 = this.d;
                v51Var4.f31183f3.f29638r = false;
                v51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16167n);
                this.f54539c.addView(zVar.f54557x1, b6.g());
                this.f54539c.addView(this.d, 0, b6.c(-1.0f, -1));
                this.f54539c.addView(zVar.f54559z1, b6.g());
                org.telegram.ui.ActionBar.l lVar3 = new org.telegram.ui.ActionBar.l(context, zVar.I0);
                this.f54537a = lVar3;
                lVar3.setOccupyStatusBar(false);
                a7.m(this.f54537a, 5, t6.G6, zVar.I0);
                a7.m(this.f54537a, 3, t6.f21333z8, zVar.I0);
                org.telegram.ui.ActionBar.l lVar4 = this.f54537a;
                boolean z10 = zVar.E1;
                if (z10) {
                    i11 = 2131231242;
                } else {
                    i11 = 2131231241;
                }
                lVar4.setBackButtonImage(i11);
                a7.m(this.f54537a, 1, t6.f21314y8, zVar.I0);
                this.f54537a.setTitle(dd.L0(2131751988, null));
                this.f54537a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.f54537a.setActionBarMenuOnItemClick(new z01(this, 23));
                this.f54539c.addView(this.f54537a, b6.e(-1, 56, 48));
                this.f54539c.addView(zVar.f54555v1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y p9 = this.f54537a.p();
                p9.setGlassMode(true);
                p9.setTranslationX(-i0.L(7.0f));
                p9.a(3, 2131232485);
                vh.d dVar3 = new vh.d(getContext(), zVar.I0, true);
                zVar.f54549p1 = dVar3;
                dVar3.f();
                zVar.f54549p1.setText(dd.L0(2131747847, null));
                zVar.f54549p1.setOnClickListener(new rh.s(this, 28));
                if (z10) {
                    zVar.f54549p1.setVisibility(8);
                }
                this.f54539c.addView(zVar.f54549p1, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.f16167n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.f54534n.f54544j1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f54534n.f54555v1.setTranslationY(Math.max(i0.L(8.0f) + i0.f16166m, b() + i0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
