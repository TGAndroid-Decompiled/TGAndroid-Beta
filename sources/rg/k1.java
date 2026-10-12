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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.zb;
import org.telegram.ui.dx0;
import org.telegram.ui.eg0;
import org.telegram.ui.fc1;
import org.telegram.ui.mx0;
import org.telegram.ui.ww0;
import w7.w5;
public final class k1 extends vm0 {
    public final l1 f47523c;

    public k1(l1 l1Var) {
        this.f47523c = l1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f47523c.f47540f0;
    }

    @Override
    public final int j(int i10) {
        l1 l1Var = this.f47523c;
        if (i10 != l1Var.f47541g0) {
            if (i10 >= l1Var.f47542h0 && i10 < l1Var.f47543i0) {
                return l1Var.Y();
            }
            if (i10 >= l1Var.f47544j0 && i10 < l1Var.f47545k0) {
                return 1;
            }
            if (i10 == l1Var.f47546l0) {
                return 2;
            }
            if (i10 == l1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == l1Var.f47547n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47889a;
        l1 l1Var = this.f47523c;
        int i11 = l1Var.f47544j0;
        if (i10 >= i11 && i10 < l1Var.f47545k0) {
            ww0 ww0Var = (ww0) view;
            mx0 mx0Var = (mx0) l1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == l1Var.f47545k0 - 1) {
                z10 = false;
            }
            ww0Var.a(mx0Var, z10);
        } else if (i10 >= l1Var.f47542h0 && i10 < l1Var.f47543i0) {
            l1Var.Z(view);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        int intValue;
        c6 c6Var2;
        int i11;
        dx0 dx0Var;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        l1 l1Var = this.f47523c;
        View a02 = l1Var.a0(context, i10);
        if (a02 != null) {
            return e2.k(a02, a02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            c6Var4 = ((e3) l1Var).resourcesProvider;
                            dx0Var = new dx0(this, context, c6Var4);
                        } else {
                            c6Var3 = ((e3) l1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, c6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = h6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final k1 f47485b;

                                {
                                    this.f47485b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f47485b.f47523c.f47553t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f47485b.f47523c.f47553t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final k1 f47485b;

                                {
                                    this.f47485b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f47485b.f47523c.f47553t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f47485b.f47523c.f47553t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                    dx0Var = new j1(context, 0);
                }
            } else {
                dx0Var = new a7(context, l1Var.getThemedColor(h6.f20503a7), 0);
            }
        } else {
            fc1 fc1Var = new fc1(this, context, 17);
            l1Var.f47552s0 = fc1Var;
            fc1Var.setOrientation(1);
            View view = l1Var.B0;
            if (view == null) {
                l1Var.f47551r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = h6.Mj;
                canvas.drawColor(i0.a.d(0.5f, l1Var.getThemedColor(i13), l1Var.getThemedColor(h6.f20630h5)));
                l1Var.f47551r0.setBackgroundBitmap(createBitmap);
                sg.g gVar = l1Var.f47551r0.f48309b;
                gVar.f48293z = i13;
                gVar.A = h6.Lj;
                gVar.b();
                fc1Var.addView(l1Var.f47551r0, w5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) l1Var.B0.getParent()).removeView(l1Var.B0);
                }
                l1Var.X(fc1Var);
            }
            if (l1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                l1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = l1Var.f47554u0;
                if (num == null) {
                    intValue = l1Var.getThemedColor(h6.f20892v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                l1Var.O0 = new ia0[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    ia0[] ia0VarArr = l1Var.O0;
                    c6Var2 = ((e3) l1Var).resourcesProvider;
                    ia0VarArr[i14] = new zb(context, 4, c6Var2);
                    ia0 ia0Var = l1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    ia0Var.setVisibility(i11);
                    l1Var.O0[i14].setTextSize(1, 16.0f);
                    l1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    l1Var.O0[i14].setGravity(1);
                    l1Var.O0[i14].setTextColor(l1Var.getThemedColor(h6.G6));
                    l1Var.O0[i14].setLinkTextColor(l1Var.getThemedColor(h6.J6));
                    l1Var.N0.addView(l1Var.O0[i14], w5.d(-2.0f, -1));
                }
            }
            if (l1Var.N0.getParent() != null) {
                ((ViewGroup) l1Var.N0.getParent()).removeView(l1Var.N0);
            }
            fc1Var.addView(l1Var.N0, w5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (l1Var.P0 == null) {
                Context context2 = l1Var.getContext();
                c6Var = ((e3) l1Var).resourcesProvider;
                ia0 ia0Var2 = new ia0(context2, c6Var);
                l1Var.P0 = ia0Var2;
                ia0Var2.setTextSize(1, 14.0f);
                l1Var.P0.setGravity(1);
                l1Var.P0.setTextColor(l1Var.getThemedColor(h6.G6));
                l1Var.P0.setLinkTextColor(l1Var.getThemedColor(h6.J6));
            }
            if (l1Var.P0.getParent() != null) {
                ((ViewGroup) l1Var.P0.getParent()).removeView(l1Var.P0);
            }
            fc1Var.addView(l1Var.P0, w5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            l1Var.b0(false);
            l1Var.f47550q0 = new ei.f(context, 5);
            p0 p0Var = new p0(this, context, 2);
            p0Var.setClipChildren(false);
            p0Var.addView(l1Var.f47550q0);
            p0Var.addView(fc1Var);
            eg0 eg0Var = l1Var.f47551r0;
            dx0Var = p0Var;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(l1Var.f47550q0);
                dx0Var = p0Var;
            }
        }
        dx0Var.setLayoutParams(new s4.q0(-1, -2));
        l1Var.W(i10, dx0Var);
        return new s4.d1(dx0Var);
    }
}
