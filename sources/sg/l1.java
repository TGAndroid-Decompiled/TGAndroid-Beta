package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zb;
import org.telegram.ui.ax0;
import org.telegram.ui.hx0;
import org.telegram.ui.ic1;
import org.telegram.ui.jg0;
import org.telegram.ui.qx0;
import w7.a6;
public final class l1 extends lm0 {
    public final m1 f45249c;

    public l1(m1 m1Var) {
        this.f45249c = m1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f45249c.f45257f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f45249c;
        if (i10 != m1Var.f45258g0) {
            if (i10 >= m1Var.f45259h0 && i10 < m1Var.f45260i0) {
                return m1Var.Y();
            }
            if (i10 >= m1Var.f45261j0 && i10 < m1Var.f45262k0) {
                return 1;
            }
            if (i10 == m1Var.f45263l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f45264n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f44838a;
        m1 m1Var = this.f45249c;
        int i11 = m1Var.f45261j0;
        if (i10 >= i11 && i10 < m1Var.f45262k0) {
            ax0 ax0Var = (ax0) view;
            qx0 qx0Var = (qx0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f45262k0 - 1) {
                z10 = false;
            }
            ax0Var.a(qx0Var, z10);
        } else if (i10 >= m1Var.f45259h0 && i10 < m1Var.f45260i0) {
            m1Var.Z(view);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        int intValue;
        c6 c6Var2;
        int i11;
        hx0 hx0Var;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f45249c;
        View a02 = m1Var.a0(context, i10);
        if (a02 != null) {
            return k3.l(a02, a02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            c6Var4 = ((e3) m1Var).resourcesProvider;
                            hx0Var = new hx0(this, context, c6Var4);
                        } else {
                            c6Var3 = ((e3) m1Var).resourcesProvider;
                            wg.d0 d0Var = new wg.d0(context, c6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = g6.f19960gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f45229b;

                                {
                                    this.f45229b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.s(this.f45229b.f45249c.f45270t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.s(this.f45229b.f45249c.f45270t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f45229b;

                                {
                                    this.f45229b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.s(this.f45229b.f45249c.f45270t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.s(this.f45229b.f45249c.f45270t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            hx0Var = d0Var;
                        }
                    } else {
                        hx0Var = new a(context);
                    }
                } else {
                    hx0Var = new k1(context, 0);
                }
            } else {
                hx0Var = new b7(context, m1Var.getThemedColor(g6.f19843a7), 0);
            }
        } else {
            ic1 ic1Var = new ic1(this, context, 17);
            m1Var.f45269s0 = ic1Var;
            ic1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f45268r0 = new jg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = g6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i13), m1Var.getThemedColor(g6.f19972h5)));
                m1Var.f45268r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.f45268r0.f45740b;
                gVar.f45724z = i13;
                gVar.A = g6.Lj;
                gVar.b();
                ic1Var.addView(m1Var.f45268r0, a6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.X(ic1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f45271u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(g6.f20233v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new da0[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    da0[] da0VarArr = m1Var.O0;
                    c6Var2 = ((e3) m1Var).resourcesProvider;
                    da0VarArr[i14] = new zb(context, 4, c6Var2);
                    da0 da0Var = m1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    da0Var.setVisibility(i11);
                    m1Var.O0[i14].setTextSize(1, 16.0f);
                    m1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i14].setGravity(1);
                    m1Var.O0[i14].setTextColor(m1Var.getThemedColor(g6.G6));
                    m1Var.O0[i14].setLinkTextColor(m1Var.getThemedColor(g6.J6));
                    m1Var.N0.addView(m1Var.O0[i14], a6.d(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            ic1Var.addView(m1Var.N0, a6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                c6Var = ((e3) m1Var).resourcesProvider;
                da0 da0Var2 = new da0(context2, c6Var);
                m1Var.P0 = da0Var2;
                da0Var2.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(g6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(g6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            ic1Var.addView(m1Var.P0, a6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.b0(false);
            m1Var.f45267q0 = new fi.f(context, 5);
            p0 p0Var = new p0(this, context, 2);
            p0Var.setClipChildren(false);
            p0Var.addView(m1Var.f45267q0);
            p0Var.addView(ic1Var);
            jg0 jg0Var = m1Var.f45268r0;
            hx0Var = p0Var;
            if (jg0Var != null) {
                jg0Var.setStarParticlesView(m1Var.f45267q0);
                hx0Var = p0Var;
            }
        }
        hx0Var.setLayoutParams(new s4.o0(-1, -2));
        m1Var.W(i10, hx0Var);
        return new s4.b1(hx0Var);
    }
}
