package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.ld;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.dx0;
import org.telegram.ui.eg0;
import org.telegram.ui.gc1;
import org.telegram.ui.mx0;
import org.telegram.ui.ww0;
import w7.a6;
public final class l1 extends ul0 {
    public final m1 f40804c;

    public l1(m1 m1Var) {
        this.f40804c = m1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40804c.f40817f0;
    }

    @Override
    public final int j(int i10) {
        m1 m1Var = this.f40804c;
        if (i10 != m1Var.f40818g0) {
            if (i10 >= m1Var.f40819h0 && i10 < m1Var.f40820i0) {
                return m1Var.X();
            }
            if (i10 >= m1Var.f40821j0 && i10 < m1Var.f40822k0) {
                return 1;
            }
            if (i10 == m1Var.f40823l0) {
                return 2;
            }
            if (i10 == m1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == m1Var.f40824n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f41610a;
        m1 m1Var = this.f40804c;
        int i11 = m1Var.f40821j0;
        if (i10 >= i11 && i10 < m1Var.f40822k0) {
            ww0 ww0Var = (ww0) view;
            mx0 mx0Var = (mx0) m1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == m1Var.f40822k0 - 1) {
                z10 = false;
            }
            ww0Var.a(mx0Var, z10);
        } else if (i10 >= m1Var.f40819h0 && i10 < m1Var.f40820i0) {
            m1Var.Y(view);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        int intValue;
        f6 f6Var2;
        int i11;
        dx0 dx0Var;
        f6 f6Var3;
        f6 f6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.f40804c;
        View Z = m1Var.Z(context, i10);
        if (Z != null) {
            return e2.j(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            f6Var4 = ((h3) m1Var).resourcesProvider;
                            dx0Var = new dx0(this, context, f6Var4);
                        } else {
                            f6Var3 = ((h3) m1Var).resourcesProvider;
                            ug.d0 d0Var = new ug.d0(context, f6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = j6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final l1 f40790b;

                                {
                                    this.f40790b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f40790b.f40804c.f40830t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f40790b.f40804c.f40830t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final l1 f40790b;

                                {
                                    this.f40790b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f40790b.f40804c.f40830t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f40790b.f40804c.f40830t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            dx0Var = d0Var;
                        }
                    } else {
                        dx0Var = new a(context);
                    }
                } else {
                    dx0Var = new qn(context, 29);
                }
            } else {
                dx0Var = new c7(context, m1Var.getThemedColor(j6.f17872a7), 0);
            }
        } else {
            gc1 gc1Var = new gc1(this, context, 17);
            m1Var.f40829s0 = gc1Var;
            gc1Var.setOrientation(1);
            View view = m1Var.B0;
            if (view == null) {
                m1Var.f40828r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i13), m1Var.getThemedColor(j6.f17998h5)));
                m1Var.f40828r0.setBackgroundBitmap(createBitmap);
                rg.a aVar = m1Var.f40828r0.f41485b;
                aVar.f41471w = i13;
                aVar.f41472x = j6.Lj;
                aVar.b();
                gc1Var.addView(m1Var.f40828r0, a6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.W(gc1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.f40831u0;
                if (num == null) {
                    intValue = m1Var.getThemedColor(j6.f18254v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new m90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    m90[] m90VarArr = m1Var.O0;
                    f6Var2 = ((h3) m1Var).resourcesProvider;
                    m90VarArr[i14] = new wb(context, 4, f6Var2);
                    m90 m90Var = m1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    m90Var.setVisibility(i11);
                    m1Var.O0[i14].setTextSize(1, 16.0f);
                    m1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i14].setGravity(1);
                    m1Var.O0[i14].setTextColor(m1Var.getThemedColor(j6.G6));
                    m1Var.O0[i14].setLinkTextColor(m1Var.getThemedColor(j6.J6));
                    m1Var.N0.addView(m1Var.O0[i14], a6.c(-2.0f, -1));
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            gc1Var.addView(m1Var.N0, a6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                f6Var = ((h3) m1Var).resourcesProvider;
                m90 m90Var2 = new m90(context2, f6Var);
                m1Var.P0 = m90Var2;
                m90Var2.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(j6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(j6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            gc1Var.addView(m1Var.P0, a6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.a0(false);
            m1Var.f40827q0 = new di.f(context, 5);
            ld ldVar = new ld(this, context, 27);
            ldVar.setClipChildren(false);
            ldVar.addView(m1Var.f40827q0);
            ldVar.addView(gc1Var);
            eg0 eg0Var = m1Var.f40828r0;
            dx0Var = ldVar;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(m1Var.f40827q0);
                dx0Var = ldVar;
            }
        }
        dx0Var.setLayoutParams(new s4.p0(-1, -2));
        m1Var.V(i10, dx0Var);
        return new s4.c1(dx0Var);
    }
}
