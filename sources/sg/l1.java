package sg;

import ai.ae;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y90;
import org.telegram.ui.cw0;
import org.telegram.ui.jw0;
import org.telegram.ui.sw0;
import org.telegram.ui.va1;
import w7.z5;
public final class l1 extends lm0 {
    public final m1 f46752c;

    public l1(m1 m1Var) {
        this.f46752c = m1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46752c.f46760f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f46752c;
        if (i10 != m1Var.f46761g0) {
            if (i10 >= m1Var.f46762h0 && i10 < m1Var.f46763i0) {
                return m1Var.c0();
            }
            if (i10 >= m1Var.f46764j0 && i10 < m1Var.f46765k0) {
                return 1;
            }
            if (i10 == m1Var.f46766l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f46767n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f46343a;
        m1 m1Var = this.f46752c;
        int i11 = m1Var.f46764j0;
        if (i10 >= i11 && i10 < m1Var.f46765k0) {
            cw0 cw0Var = (cw0) view;
            sw0 sw0Var = (sw0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f46765k0 - 1) {
                z10 = false;
            }
            cw0Var.a(sw0Var, z10);
        } else if (i10 >= m1Var.f46762h0 && i10 < m1Var.f46763i0) {
            m1Var.d0(view);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        int intValue;
        g6 g6Var4;
        int i11;
        g6 g6Var5;
        g6 g6Var6;
        jw0 jw0Var;
        g6 g6Var7;
        g6 g6Var8;
        g6 g6Var9;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f46752c;
        View e02 = m1Var.e0(context, i10);
        if (e02 != null) {
            return k3.l(e02, e02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            g6Var9 = ((h3) m1Var).resourcesProvider;
                            jw0Var = new jw0(this, context, g6Var9);
                        } else {
                            g6Var8 = ((h3) m1Var).resourcesProvider;
                            wg.d0 d0Var = new wg.d0(context, g6Var8);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = k6.f21242gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f46732b;

                                {
                                    this.f46732b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46732b.f46752c.f46773t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46732b.f46752c.f46773t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f46732b;

                                {
                                    this.f46732b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46732b.f46752c.f46773t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46732b.f46752c.f46773t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            jw0Var = d0Var;
                        }
                    } else {
                        jw0Var = new a(context);
                    }
                } else {
                    jw0Var = new k1(context, 0);
                }
            } else {
                int i13 = k6.f21125a7;
                b7 b7Var = new b7(context, m1Var.getThemedColor(i13), 0);
                g6Var7 = ((h3) m1Var).resourcesProvider;
                r6.i(i13, b7Var, g6Var7);
                jw0Var = b7Var;
            }
        } else {
            va1 va1Var = new va1(this, context, 20);
            m1Var.f46772s0 = va1Var;
            va1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f46771r0 = new ae(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i14 = k6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i14), m1Var.getThemedColor(k6.f21254h5)));
                m1Var.f46771r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.f46771r0.f47547b;
                gVar.f47531z = i14;
                gVar.A = k6.Lj;
                gVar.b();
                va1Var.addView(m1Var.f46771r0, z5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.b0(va1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f46774u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(k6.f21516v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new y90[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    y90[] y90VarArr = m1Var.O0;
                    g6Var4 = ((h3) m1Var).resourcesProvider;
                    y90VarArr[i15] = new xb(context, 4, g6Var4);
                    y90 y90Var = m1Var.O0[i15];
                    if (i15 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    y90Var.setVisibility(i11);
                    m1Var.O0[i15].setTextSize(1, 16.0f);
                    m1Var.O0[i15].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i15].setGravity(1);
                    y90 y90Var2 = m1Var.O0[i15];
                    int i16 = k6.G6;
                    g6Var5 = ((h3) m1Var).resourcesProvider;
                    r6.W(y90Var2, i16, g6Var5);
                    y90 y90Var3 = m1Var.O0[i15];
                    int i17 = k6.J6;
                    g6Var6 = ((h3) m1Var).resourcesProvider;
                    r6.I(y90Var3, i17, g6Var6);
                    m1Var.N0.addView(m1Var.O0[i15], z5.c(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            va1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                g6Var = ((h3) m1Var).resourcesProvider;
                y90 y90Var4 = new y90(context2, g6Var);
                m1Var.P0 = y90Var4;
                y90Var4.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                y90 y90Var5 = m1Var.P0;
                int i18 = k6.G6;
                g6Var2 = ((h3) m1Var).resourcesProvider;
                r6.W(y90Var5, i18, g6Var2);
                y90 y90Var6 = m1Var.P0;
                int i19 = k6.J6;
                g6Var3 = ((h3) m1Var).resourcesProvider;
                r6.I(y90Var6, i19, g6Var3);
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            va1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.g0(false);
            m1Var.f46770q0 = new gi.f(context, 5);
            rg.y1 y1Var = new rg.y1(this, context, 5);
            y1Var.setClipChildren(false);
            y1Var.addView(m1Var.f46770q0);
            y1Var.addView(va1Var);
            ae aeVar = m1Var.f46771r0;
            jw0Var = y1Var;
            if (aeVar != null) {
                aeVar.setStarParticlesView(m1Var.f46770q0);
                jw0Var = y1Var;
            }
        }
        jw0Var.setLayoutParams(new s4.o0(-1, -2));
        m1Var.a0(i10, jw0Var);
        return new s4.b1(jw0Var);
    }
}
