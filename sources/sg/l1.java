package sg;

import ai.zd;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
import org.telegram.ui.fw0;
import org.telegram.ui.ow0;
import org.telegram.ui.qa1;
import org.telegram.ui.yv0;
import w7.z5;
public final class l1 extends im0 {
    public final m1 f46329c;

    public l1(m1 m1Var) {
        this.f46329c = m1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46329c.f46336f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f46329c;
        if (i10 != m1Var.f46337g0) {
            if (i10 >= m1Var.f46338h0 && i10 < m1Var.f46339i0) {
                return m1Var.Y();
            }
            if (i10 >= m1Var.f46340j0 && i10 < m1Var.f46341k0) {
                return 1;
            }
            if (i10 == m1Var.f46342l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f46343n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f45921a;
        m1 m1Var = this.f46329c;
        int i11 = m1Var.f46340j0;
        if (i10 >= i11 && i10 < m1Var.f46341k0) {
            yv0 yv0Var = (yv0) view;
            ow0 ow0Var = (ow0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f46341k0 - 1) {
                z10 = false;
            }
            yv0Var.a(ow0Var, z10);
        } else if (i10 >= m1Var.f46338h0 && i10 < m1Var.f46339i0) {
            m1Var.Z(view);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        int intValue;
        d6 d6Var2;
        int i11;
        fw0 fw0Var;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f46329c;
        View a02 = m1Var.a0(context, i10);
        if (a02 != null) {
            return k3.l(a02, a02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            d6Var4 = ((f3) m1Var).resourcesProvider;
                            fw0Var = new fw0(this, context, d6Var4);
                        } else {
                            d6Var3 = ((f3) m1Var).resourcesProvider;
                            wg.d0 d0Var = new wg.d0(context, d6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = h6.f21053gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f46284b;

                                {
                                    this.f46284b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46284b.f46329c.f46349t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46284b.f46329c.f46349t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f46284b;

                                {
                                    this.f46284b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46284b.f46329c.f46349t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46284b.f46329c.f46349t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            fw0Var = d0Var;
                        }
                    } else {
                        fw0Var = new a(context);
                    }
                } else {
                    fw0Var = new k1(context, 0);
                }
            } else {
                fw0Var = new z6(context, m1Var.getThemedColor(h6.f20936a7), 0);
            }
        } else {
            qa1 qa1Var = new qa1(this, context, 20);
            m1Var.f46348s0 = qa1Var;
            qa1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f46347r0 = new zd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = h6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i13), m1Var.getThemedColor(h6.f21065h5)));
                m1Var.f46347r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.f46347r0.f47112b;
                gVar.f47096z = i13;
                gVar.A = h6.Lj;
                gVar.b();
                qa1Var.addView(m1Var.f46347r0, z5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.X(qa1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f46350u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(h6.f21327v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new x90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    x90[] x90VarArr = m1Var.O0;
                    d6Var2 = ((f3) m1Var).resourcesProvider;
                    x90VarArr[i14] = new xb(context, 4, d6Var2);
                    x90 x90Var = m1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    x90Var.setVisibility(i11);
                    m1Var.O0[i14].setTextSize(1, 16.0f);
                    m1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i14].setGravity(1);
                    m1Var.O0[i14].setTextColor(m1Var.getThemedColor(h6.G6));
                    m1Var.O0[i14].setLinkTextColor(m1Var.getThemedColor(h6.J6));
                    m1Var.N0.addView(m1Var.O0[i14], z5.c(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            qa1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                d6Var = ((f3) m1Var).resourcesProvider;
                x90 x90Var2 = new x90(context2, d6Var);
                m1Var.P0 = x90Var2;
                x90Var2.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(h6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(h6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            qa1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.b0(false);
            m1Var.f46346q0 = new gi.f(context, 5);
            rg.x1 x1Var = new rg.x1(this, context, 5);
            x1Var.setClipChildren(false);
            x1Var.addView(m1Var.f46346q0);
            x1Var.addView(qa1Var);
            zd zdVar = m1Var.f46347r0;
            fw0Var = x1Var;
            if (zdVar != null) {
                zdVar.setStarParticlesView(m1Var.f46346q0);
                fw0Var = x1Var;
            }
        }
        fw0Var.setLayoutParams(new s4.o0(-1, -2));
        m1Var.W(i10, fw0Var);
        return new s4.b1(fw0Var);
    }
}
