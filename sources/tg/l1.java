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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.iw0;
import org.telegram.ui.pw0;
import org.telegram.ui.yw0;
import org.telegram.ui.za1;
public final class l1 extends mm0 {
    public final m1 f48965c;

    public l1(m1 m1Var) {
        this.f48965c = m1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48965c.f48973f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f48965c;
        if (i10 != m1Var.f48974g0) {
            if (i10 >= m1Var.f48975h0 && i10 < m1Var.f48976i0) {
                return m1Var.c0();
            }
            if (i10 >= m1Var.f48977j0 && i10 < m1Var.f48978k0) {
                return 1;
            }
            if (i10 == m1Var.f48979l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f48980n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47773a;
        m1 m1Var = this.f48965c;
        int i11 = m1Var.f48977j0;
        if (i10 >= i11 && i10 < m1Var.f48978k0) {
            iw0 iw0Var = (iw0) view;
            yw0 yw0Var = (yw0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f48978k0 - 1) {
                z10 = false;
            }
            iw0Var.a(yw0Var, z10);
        } else if (i10 >= m1Var.f48975h0 && i10 < m1Var.f48976i0) {
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
        pw0 pw0Var;
        u6 u6Var7;
        u6 u6Var8;
        u6 u6Var9;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f48965c;
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
                            pw0Var = new pw0(this, context, u6Var9);
                        } else {
                            u6Var8 = ((k3) m1Var).resourcesProvider;
                            xg.d0 d0Var = new xg.d0(context, u6Var8);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = y6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f48945b;

                                {
                                    this.f48945b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qf.d.r(this.f48945b.f48965c.f48986t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            qf.d.r(this.f48945b.f48965c.f48986t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f48945b;

                                {
                                    this.f48945b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qf.d.r(this.f48945b.f48965c.f48986t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            qf.d.r(this.f48945b.f48965c.f48986t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            pw0Var = d0Var;
                        }
                    } else {
                        pw0Var = new a(context);
                    }
                } else {
                    pw0Var = new k1(context, 0);
                }
            } else {
                int i13 = y6.f23300a7;
                f7 f7Var = new f7(context, m1Var.getThemedColor(i13), 0);
                u6Var7 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.i(i13, f7Var, u6Var7);
                pw0Var = f7Var;
            }
        } else {
            za1 za1Var = new za1(this, context, 21);
            m1Var.f48985s0 = za1Var;
            za1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f48984r0 = new qd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i14 = y6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i14), m1Var.getThemedColor(y6.f23428h5)));
                m1Var.f48984r0.setBackgroundBitmap(createBitmap);
                ug.g gVar = m1Var.f48984r0.f49851b;
                gVar.f49835z = i14;
                gVar.A = y6.Lj;
                gVar.b();
                za1Var.addView(m1Var.f48984r0, kb1.u(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.b0(za1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f48987u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(y6.f23693v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new aa0[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    aa0[] aa0VarArr = m1Var.O0;
                    u6Var4 = ((k3) m1Var).resourcesProvider;
                    aa0VarArr[i15] = new xb(context, 4, u6Var4);
                    aa0 aa0Var = m1Var.O0[i15];
                    if (i15 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    aa0Var.setVisibility(i11);
                    m1Var.O0[i15].setTextSize(1, 16.0f);
                    m1Var.O0[i15].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i15].setGravity(1);
                    aa0 aa0Var2 = m1Var.O0[i15];
                    int i16 = y6.G6;
                    u6Var5 = ((k3) m1Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(aa0Var2, i16, u6Var5);
                    aa0 aa0Var3 = m1Var.O0[i15];
                    int i17 = y6.J6;
                    u6Var6 = ((k3) m1Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.H(aa0Var3, i17, u6Var6);
                    m1Var.N0.addView(m1Var.O0[i15], kb1.g(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            za1Var.addView(m1Var.N0, kb1.t(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                u6Var = ((k3) m1Var).resourcesProvider;
                aa0 aa0Var4 = new aa0(context2, u6Var);
                m1Var.P0 = aa0Var4;
                aa0Var4.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                aa0 aa0Var5 = m1Var.P0;
                int i18 = y6.G6;
                u6Var2 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(aa0Var5, i18, u6Var2);
                aa0 aa0Var6 = m1Var.P0;
                int i19 = y6.J6;
                u6Var3 = ((k3) m1Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.H(aa0Var6, i19, u6Var3);
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            za1Var.addView(m1Var.P0, kb1.t(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.g0(false);
            m1Var.f48983q0 = new hi.e(context, 5);
            p5 p5Var = new p5(this, context, 7);
            p5Var.setClipChildren(false);
            p5Var.addView(m1Var.f48983q0);
            p5Var.addView(za1Var);
            qd qdVar = m1Var.f48984r0;
            pw0Var = p5Var;
            if (qdVar != null) {
                qdVar.setStarParticlesView(m1Var.f48983q0);
                pw0Var = p5Var;
            }
        }
        pw0Var.setLayoutParams(new s4.q0(-1, -2));
        m1Var.a0(i10, pw0Var);
        return new s4.e1(pw0Var);
    }
}
