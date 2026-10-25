package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.qd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.gw0;
import org.telegram.ui.nw0;
import org.telegram.ui.ww0;
import org.telegram.ui.xa1;
public final class l1 extends lm0 {
    public final m1 f48927c;

    public l1(m1 m1Var) {
        this.f48927c = m1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48927c.f48935f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f48927c;
        if (i10 != m1Var.f48936g0) {
            if (i10 >= m1Var.f48937h0 && i10 < m1Var.f48938i0) {
                return m1Var.c0();
            }
            if (i10 >= m1Var.f48939j0 && i10 < m1Var.f48940k0) {
                return 1;
            }
            if (i10 == m1Var.f48941l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f48942n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47735a;
        m1 m1Var = this.f48927c;
        int i11 = m1Var.f48939j0;
        if (i10 >= i11 && i10 < m1Var.f48940k0) {
            gw0 gw0Var = (gw0) view;
            ww0 ww0Var = (ww0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f48940k0 - 1) {
                z10 = false;
            }
            gw0Var.a(ww0Var, z10);
        } else if (i10 >= m1Var.f48937h0 && i10 < m1Var.f48938i0) {
            m1Var.d0(view);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        int intValue;
        u6 u6Var4;
        int i11;
        u6 u6Var5;
        u6 u6Var6;
        nw0 nw0Var;
        u6 u6Var7;
        u6 u6Var8;
        u6 u6Var9;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f48927c;
        View e02 = m1Var.e0(context, i10);
        if (e02 != null) {
            return ic.a.n(e02, e02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u6Var9 = ((k3) m1Var).resourcesProvider;
                            nw0Var = new nw0(this, context, u6Var9);
                        } else {
                            u6Var8 = ((k3) m1Var).resourcesProvider;
                            xg.d0 d0Var = new xg.d0(context, u6Var8);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = y6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f48907b;

                                {
                                    this.f48907b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qf.d.r(this.f48907b.f48927c.f48948t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            qf.d.r(this.f48907b.f48927c.f48948t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f48907b;

                                {
                                    this.f48907b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qf.d.r(this.f48907b.f48927c.f48948t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            qf.d.r(this.f48907b.f48927c.f48948t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            nw0Var = d0Var;
                        }
                    } else {
                        nw0Var = new a(context);
                    }
                } else {
                    nw0Var = new k1(context, 0);
                }
            } else {
                int i13 = y6.f23297a7;
                f7 f7Var = new f7(context, m1Var.getThemedColor(i13), 0);
                u6Var7 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.i(i13, f7Var, u6Var7);
                nw0Var = f7Var;
            }
        } else {
            xa1 xa1Var = new xa1(this, context, 21);
            m1Var.f48947s0 = xa1Var;
            xa1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f48946r0 = new qd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i14 = y6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i14), m1Var.getThemedColor(y6.f23425h5)));
                m1Var.f48946r0.setBackgroundBitmap(createBitmap);
                ug.g gVar = m1Var.f48946r0.f49813b;
                gVar.f49797z = i14;
                gVar.A = y6.Lj;
                gVar.b();
                xa1Var.addView(m1Var.f48946r0, gb1.u(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.b0(xa1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f48949u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(y6.f23690v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new z90[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    z90[] z90VarArr = m1Var.O0;
                    u6Var4 = ((k3) m1Var).resourcesProvider;
                    z90VarArr[i15] = new xb(context, 4, u6Var4);
                    z90 z90Var = m1Var.O0[i15];
                    if (i15 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    z90Var.setVisibility(i11);
                    m1Var.O0[i15].setTextSize(1, 16.0f);
                    m1Var.O0[i15].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i15].setGravity(1);
                    z90 z90Var2 = m1Var.O0[i15];
                    int i16 = y6.G6;
                    u6Var5 = ((k3) m1Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(z90Var2, i16, u6Var5);
                    z90 z90Var3 = m1Var.O0[i15];
                    int i17 = y6.J6;
                    u6Var6 = ((k3) m1Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.H(z90Var3, i17, u6Var6);
                    m1Var.N0.addView(m1Var.O0[i15], gb1.g(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            xa1Var.addView(m1Var.N0, gb1.t(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                u6Var = ((k3) m1Var).resourcesProvider;
                z90 z90Var4 = new z90(context2, u6Var);
                m1Var.P0 = z90Var4;
                z90Var4.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                z90 z90Var5 = m1Var.P0;
                int i18 = y6.G6;
                u6Var2 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(z90Var5, i18, u6Var2);
                z90 z90Var6 = m1Var.P0;
                int i19 = y6.J6;
                u6Var3 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.H(z90Var6, i19, u6Var3);
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            xa1Var.addView(m1Var.P0, gb1.t(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.g0(false);
            m1Var.f48945q0 = new hi.e(context, 5);
            p5 p5Var = new p5(this, context, 7);
            p5Var.setClipChildren(false);
            p5Var.addView(m1Var.f48945q0);
            p5Var.addView(xa1Var);
            qd qdVar = m1Var.f48946r0;
            nw0Var = p5Var;
            if (qdVar != null) {
                qdVar.setStarParticlesView(m1Var.f48945q0);
                nw0Var = p5Var;
            }
        }
        nw0Var.setLayoutParams(new s4.q0(-1, -2));
        m1Var.a0(i10, nw0Var);
        return new s4.e1(nw0Var);
    }
}
