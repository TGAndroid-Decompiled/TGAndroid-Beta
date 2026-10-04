package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.cg0;
import org.telegram.ui.ex0;
import org.telegram.ui.ow0;
import org.telegram.ui.vw0;
import org.telegram.ui.xb1;
import w7.z5;
public final class l1 extends yl0 {
    public final m1 f46184c;

    public l1(m1 m1Var) {
        this.f46184c = m1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46184c.f46191f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f46184c;
        if (i10 != m1Var.f46192g0) {
            if (i10 >= m1Var.f46193h0 && i10 < m1Var.f46194i0) {
                return m1Var.W();
            }
            if (i10 >= m1Var.f46195j0 && i10 < m1Var.f46196k0) {
                return 1;
            }
            if (i10 == m1Var.f46197l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f46198n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f46524a;
        m1 m1Var = this.f46184c;
        int i11 = m1Var.f46195j0;
        if (i10 >= i11 && i10 < m1Var.f46196k0) {
            ow0 ow0Var = (ow0) view;
            ex0 ex0Var = (ex0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f46196k0 - 1) {
                z10 = false;
            }
            ow0Var.a(ex0Var, z10);
        } else if (i10 >= m1Var.f46193h0 && i10 < m1Var.f46194i0) {
            m1Var.X(view);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        int intValue;
        d6 d6Var2;
        int i11;
        vw0 vw0Var;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f46184c;
        View Y = m1Var.Y(context, i10);
        if (Y != null) {
            return e2.k(Y, Y, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            d6Var4 = ((f3) m1Var).resourcesProvider;
                            vw0Var = new vw0(this, context, d6Var4);
                        } else {
                            d6Var3 = ((f3) m1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, d6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = i6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f46129b;

                                {
                                    this.f46129b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f46129b.f46184c.f46204t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f46129b.f46184c.f46204t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f46129b;

                                {
                                    this.f46129b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f46129b.f46184c.f46204t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f46129b.f46184c.f46204t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            vw0Var = d0Var;
                        }
                    } else {
                        vw0Var = new a(context);
                    }
                } else {
                    vw0Var = new k1(context, 0);
                }
            } else {
                vw0Var = new b7(context, m1Var.getThemedColor(i6.f20762a7), 0);
            }
        } else {
            xb1 xb1Var = new xb1(this, context, 17);
            m1Var.f46203s0 = xb1Var;
            xb1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f46202r0 = new cg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = i6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i13), m1Var.getThemedColor(i6.f20890h5)));
                m1Var.f46202r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = m1Var.f46202r0.f46813b;
                aVar.f46801w = i13;
                aVar.f46802x = i6.Lj;
                aVar.b();
                xb1Var.addView(m1Var.f46202r0, z5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.U(xb1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f46205u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(i6.f21153v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new q90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    q90[] q90VarArr = m1Var.O0;
                    d6Var2 = ((f3) m1Var).resourcesProvider;
                    q90VarArr[i14] = new yb(context, 4, d6Var2);
                    q90 q90Var = m1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    q90Var.setVisibility(i11);
                    m1Var.O0[i14].setTextSize(1, 16.0f);
                    m1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i14].setGravity(1);
                    m1Var.O0[i14].setTextColor(m1Var.getThemedColor(i6.G6));
                    m1Var.O0[i14].setLinkTextColor(m1Var.getThemedColor(i6.J6));
                    m1Var.N0.addView(m1Var.O0[i14], z5.c(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            xb1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                d6Var = ((f3) m1Var).resourcesProvider;
                q90 q90Var2 = new q90(context2, d6Var);
                m1Var.P0 = q90Var2;
                q90Var2.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(i6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(i6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            xb1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.Z(false);
            m1Var.f46201q0 = new ei.g(context, 5);
            j1 j1Var = new j1(this, context, 0);
            j1Var.setClipChildren(false);
            j1Var.addView(m1Var.f46201q0);
            j1Var.addView(xb1Var);
            cg0 cg0Var = m1Var.f46202r0;
            vw0Var = j1Var;
            if (cg0Var != null) {
                cg0Var.setStarParticlesView(m1Var.f46201q0);
                vw0Var = j1Var;
            }
        }
        vw0Var.setLayoutParams(new s4.p0(-1, -2));
        m1Var.T(i10, vw0Var);
        return new s4.c1(vw0Var);
    }
}
