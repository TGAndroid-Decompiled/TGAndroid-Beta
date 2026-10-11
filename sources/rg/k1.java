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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.zb;
import org.telegram.ui.ax0;
import org.telegram.ui.cc1;
import org.telegram.ui.dg0;
import org.telegram.ui.jx0;
import org.telegram.ui.tw0;
import w7.x5;
public final class k1 extends rm0 {
    public final l1 f47399c;

    public k1(l1 l1Var) {
        this.f47399c = l1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f47399c.f47416f0;
    }

    @Override
    public final int j(int i10) {
        l1 l1Var = this.f47399c;
        if (i10 != l1Var.f47417g0) {
            if (i10 >= l1Var.f47418h0 && i10 < l1Var.f47419i0) {
                return l1Var.Y();
            }
            if (i10 >= l1Var.f47420j0 && i10 < l1Var.f47421k0) {
                return 1;
            }
            if (i10 == l1Var.f47422l0) {
                return 2;
            }
            if (i10 == l1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == l1Var.f47423n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47748a;
        l1 l1Var = this.f47399c;
        int i11 = l1Var.f47420j0;
        if (i10 >= i11 && i10 < l1Var.f47421k0) {
            tw0 tw0Var = (tw0) view;
            jx0 jx0Var = (jx0) l1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == l1Var.f47421k0 - 1) {
                z10 = false;
            }
            tw0Var.a(jx0Var, z10);
        } else if (i10 >= l1Var.f47418h0 && i10 < l1Var.f47419i0) {
            l1Var.Z(view);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        int intValue;
        d6 d6Var2;
        int i11;
        ax0 ax0Var;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        l1 l1Var = this.f47399c;
        View a02 = l1Var.a0(context, i10);
        if (a02 != null) {
            return e2.k(a02, a02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            d6Var4 = ((e3) l1Var).resourcesProvider;
                            ax0Var = new ax0(this, context, d6Var4);
                        } else {
                            d6Var3 = ((e3) l1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, d6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = h6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final k1 f47361b;

                                {
                                    this.f47361b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f47361b.f47399c.f47429t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f47361b.f47399c.f47429t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final k1 f47361b;

                                {
                                    this.f47361b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f47361b.f47399c.f47429t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f47361b.f47399c.f47429t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            ax0Var = d0Var;
                        }
                    } else {
                        ax0Var = new a(context);
                    }
                } else {
                    ax0Var = new j1(context, 0);
                }
            } else {
                ax0Var = new b7(context, l1Var.getThemedColor(h6.f20730a7), 0);
            }
        } else {
            cc1 cc1Var = new cc1(this, context, 17);
            l1Var.f47428s0 = cc1Var;
            cc1Var.setOrientation(1);
            View view = l1Var.B0;
            if (view == null) {
                l1Var.f47427r0 = new dg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = h6.Mj;
                canvas.drawColor(i0.a.d(0.5f, l1Var.getThemedColor(i13), l1Var.getThemedColor(h6.f20857h5)));
                l1Var.f47427r0.setBackgroundBitmap(createBitmap);
                sg.g gVar = l1Var.f47427r0.f48168b;
                gVar.f48152z = i13;
                gVar.A = h6.Lj;
                gVar.b();
                cc1Var.addView(l1Var.f47427r0, x5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) l1Var.B0.getParent()).removeView(l1Var.B0);
                }
                l1Var.X(cc1Var);
            }
            if (l1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                l1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = l1Var.f47430u0;
                if (num == null) {
                    intValue = l1Var.getThemedColor(h6.f21118v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                l1Var.O0 = new fa0[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    fa0[] fa0VarArr = l1Var.O0;
                    d6Var2 = ((e3) l1Var).resourcesProvider;
                    fa0VarArr[i14] = new zb(context, 4, d6Var2);
                    fa0 fa0Var = l1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    fa0Var.setVisibility(i11);
                    l1Var.O0[i14].setTextSize(1, 16.0f);
                    l1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    l1Var.O0[i14].setGravity(1);
                    l1Var.O0[i14].setTextColor(l1Var.getThemedColor(h6.G6));
                    l1Var.O0[i14].setLinkTextColor(l1Var.getThemedColor(h6.J6));
                    l1Var.N0.addView(l1Var.O0[i14], x5.d(-2.0f, -1));
                }
            }
            if (l1Var.N0.getParent() != null) {
                ((ViewGroup) l1Var.N0.getParent()).removeView(l1Var.N0);
            }
            cc1Var.addView(l1Var.N0, x5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (l1Var.P0 == null) {
                Context context2 = l1Var.getContext();
                d6Var = ((e3) l1Var).resourcesProvider;
                fa0 fa0Var2 = new fa0(context2, d6Var);
                l1Var.P0 = fa0Var2;
                fa0Var2.setTextSize(1, 14.0f);
                l1Var.P0.setGravity(1);
                l1Var.P0.setTextColor(l1Var.getThemedColor(h6.G6));
                l1Var.P0.setLinkTextColor(l1Var.getThemedColor(h6.J6));
            }
            if (l1Var.P0.getParent() != null) {
                ((ViewGroup) l1Var.P0.getParent()).removeView(l1Var.P0);
            }
            cc1Var.addView(l1Var.P0, x5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            l1Var.b0(false);
            l1Var.f47426q0 = new ei.f(context, 5);
            t0 t0Var = new t0(this, context, 1);
            t0Var.setClipChildren(false);
            t0Var.addView(l1Var.f47426q0);
            t0Var.addView(cc1Var);
            dg0 dg0Var = l1Var.f47427r0;
            ax0Var = t0Var;
            if (dg0Var != null) {
                dg0Var.setStarParticlesView(l1Var.f47426q0);
                ax0Var = t0Var;
            }
        }
        ax0Var.setLayoutParams(new s4.q0(-1, -2));
        l1Var.W(i10, ax0Var);
        return new s4.d1(ax0Var);
    }
}
