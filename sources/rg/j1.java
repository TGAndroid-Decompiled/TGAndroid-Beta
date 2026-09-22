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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.bx0;
import org.telegram.ui.dc1;
import org.telegram.ui.gg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.y5;
public final class j1 extends xl0 {
    public final k1 f42654c;

    public j1(k1 k1Var) {
        this.f42654c = k1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42654c.f42668f0;
    }

    @Override
    public final int j(int i10) {
        k1 k1Var = this.f42654c;
        if (i10 != k1Var.f42669g0) {
            if (i10 >= k1Var.f42670h0 && i10 < k1Var.f42671i0) {
                return k1Var.X();
            }
            if (i10 >= k1Var.f42672j0 && i10 < k1Var.f42673k0) {
                return 1;
            }
            if (i10 == k1Var.f42674l0) {
                return 2;
            }
            if (i10 == k1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == k1Var.f42675n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42995a;
        k1 k1Var = this.f42654c;
        int i11 = k1Var.f42672j0;
        if (i10 >= i11 && i10 < k1Var.f42673k0) {
            uw0 uw0Var = (uw0) view;
            kx0 kx0Var = (kx0) k1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == k1Var.f42673k0 - 1) {
                z10 = false;
            }
            uw0Var.a(kx0Var, z10);
        } else if (i10 >= k1Var.f42670h0 && i10 < k1Var.f42671i0) {
            k1Var.Y(view);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        int intValue;
        f6 f6Var2;
        int i11;
        bx0 bx0Var;
        f6 f6Var3;
        f6 f6Var4;
        Context context = viewGroup.getContext();
        k1 k1Var = this.f42654c;
        View Z = k1Var.Z(context, i10);
        if (Z != null) {
            return e2.k(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            f6Var4 = ((f3) k1Var).resourcesProvider;
                            bx0Var = new bx0(this, context, f6Var4);
                        } else {
                            f6Var3 = ((f3) k1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, f6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = j6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final j1 f42620b;

                                {
                                    this.f42620b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42620b.f42654c.f42681t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42620b.f42654c.f42681t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final j1 f42620b;

                                {
                                    this.f42620b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42620b.f42654c.f42681t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42620b.f42654c.f42681t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            bx0Var = d0Var;
                        }
                    } else {
                        bx0Var = new a(context);
                    }
                } else {
                    bx0Var = new i1(context, 0);
                }
            } else {
                bx0Var = new c7(context, k1Var.getThemedColor(j6.f19053a7), 0);
            }
        } else {
            dc1 dc1Var = new dc1(this, context, 17);
            k1Var.f42680s0 = dc1Var;
            dc1Var.setOrientation(1);
            View view = k1Var.B0;
            if (view == null) {
                k1Var.f42679r0 = new gg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i13), k1Var.getThemedColor(j6.f19180h5)));
                k1Var.f42679r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = k1Var.f42679r0.f43260b;
                aVar.f43248w = i13;
                aVar.f43249x = j6.Lj;
                aVar.b();
                dc1Var.addView(k1Var.f42679r0, y5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) k1Var.B0.getParent()).removeView(k1Var.B0);
                }
                k1Var.W(dc1Var);
            }
            if (k1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                k1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = k1Var.f42682u0;
                if (num == null) {
                    intValue = k1Var.getThemedColor(j6.f19440v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                k1Var.O0 = new n90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    n90[] n90VarArr = k1Var.O0;
                    f6Var2 = ((f3) k1Var).resourcesProvider;
                    n90VarArr[i14] = new wb(context, 4, f6Var2);
                    n90 n90Var = k1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    n90Var.setVisibility(i11);
                    k1Var.O0[i14].setTextSize(1, 16.0f);
                    k1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    k1Var.O0[i14].setGravity(1);
                    k1Var.O0[i14].setTextColor(k1Var.getThemedColor(j6.G6));
                    k1Var.O0[i14].setLinkTextColor(k1Var.getThemedColor(j6.J6));
                    k1Var.N0.addView(k1Var.O0[i14], y5.c(-2.0f, -1));
                }
            }
            if (k1Var.N0.getParent() != null) {
                ((ViewGroup) k1Var.N0.getParent()).removeView(k1Var.N0);
            }
            dc1Var.addView(k1Var.N0, y5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.P0 == null) {
                Context context2 = k1Var.getContext();
                f6Var = ((f3) k1Var).resourcesProvider;
                n90 n90Var2 = new n90(context2, f6Var);
                k1Var.P0 = n90Var2;
                n90Var2.setTextSize(1, 14.0f);
                k1Var.P0.setGravity(1);
                k1Var.P0.setTextColor(k1Var.getThemedColor(j6.G6));
                k1Var.P0.setLinkTextColor(k1Var.getThemedColor(j6.J6));
            }
            if (k1Var.P0.getParent() != null) {
                ((ViewGroup) k1Var.P0.getParent()).removeView(k1Var.P0);
            }
            dc1Var.addView(k1Var.P0, y5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.a0(false);
            k1Var.f42678q0 = new ei.f(context, 5);
            ai.f0 f0Var = new ai.f0(this, context, 29);
            f0Var.setClipChildren(false);
            f0Var.addView(k1Var.f42678q0);
            f0Var.addView(dc1Var);
            gg0 gg0Var = k1Var.f42679r0;
            bx0Var = f0Var;
            if (gg0Var != null) {
                gg0Var.setStarParticlesView(k1Var.f42678q0);
                bx0Var = f0Var;
            }
        }
        bx0Var.setLayoutParams(new s4.p0(-1, -2));
        k1Var.V(i10, bx0Var);
        return new s4.c1(bx0Var);
    }
}
