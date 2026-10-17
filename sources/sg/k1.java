package sg;

import ai.yd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.cast.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
import org.telegram.ui.aw0;
import org.telegram.ui.hw0;
import org.telegram.ui.qw0;
import org.telegram.ui.sa1;
import rg.n2;
import w7.z5;
public final class k1 extends hm0 {
    public final l1 f46312c;

    public k1(l1 l1Var) {
        this.f46312c = l1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45941f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46312c.f46328f0;
    }

    @Override
    public final int j(int i10) {
        l1 l1Var = this.f46312c;
        if (i10 != l1Var.f46329g0) {
            if (i10 >= l1Var.f46330h0 && i10 < l1Var.f46331i0) {
                return l1Var.Y();
            }
            if (i10 >= l1Var.f46332j0 && i10 < l1Var.f46333k0) {
                return 1;
            }
            if (i10 == l1Var.f46334l0) {
                return 2;
            }
            if (i10 == l1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == l1Var.f46335n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f45938a;
        l1 l1Var = this.f46312c;
        int i11 = l1Var.f46332j0;
        if (i10 >= i11 && i10 < l1Var.f46333k0) {
            aw0 aw0Var = (aw0) view;
            qw0 qw0Var = (qw0) l1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == l1Var.f46333k0 - 1) {
                z10 = false;
            }
            aw0Var.a(qw0Var, z10);
        } else if (i10 >= l1Var.f46330h0 && i10 < l1Var.f46331i0) {
            l1Var.Z(view);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        int intValue;
        d6 d6Var2;
        int i11;
        hw0 hw0Var;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        l1 l1Var = this.f46312c;
        View a02 = l1Var.a0(context, i10);
        if (a02 != null) {
            return a6.l(a02, a02, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            d6Var4 = ((f3) l1Var).resourcesProvider;
                            hw0Var = new hw0(this, context, d6Var4);
                        } else {
                            d6Var3 = ((f3) l1Var).resourcesProvider;
                            wg.d0 d0Var = new wg.d0(context, d6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = h6.f21045gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final k1 f46276b;

                                {
                                    this.f46276b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46276b.f46312c.f46341t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46276b.f46312c.f46341t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final k1 f46276b;

                                {
                                    this.f46276b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pf.d.r(this.f46276b.f46312c.f46341t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            pf.d.r(this.f46276b.f46312c.f46341t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            hw0Var = d0Var;
                        }
                    } else {
                        hw0Var = new a(context);
                    }
                } else {
                    hw0Var = new j1(context, 0);
                }
            } else {
                hw0Var = new z6(context, l1Var.getThemedColor(h6.f20928a7), 0);
            }
        } else {
            sa1 sa1Var = new sa1(this, context, 20);
            l1Var.f46340s0 = sa1Var;
            sa1Var.setOrientation(1);
            View view = l1Var.B0;
            if (view == null) {
                l1Var.f46339r0 = new yd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = h6.Mj;
                canvas.drawColor(i0.b.f(0.5f, l1Var.getThemedColor(i13), l1Var.getThemedColor(h6.f21057h5)));
                l1Var.f46339r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = l1Var.f46339r0.f47127b;
                gVar.f47111z = i13;
                gVar.A = h6.Lj;
                gVar.b();
                sa1Var.addView(l1Var.f46339r0, z5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) l1Var.B0.getParent()).removeView(l1Var.B0);
                }
                l1Var.X(sa1Var);
            }
            if (l1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                l1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = l1Var.f46342u0;
                if (num == null) {
                    intValue = l1Var.getThemedColor(h6.f21319v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                l1Var.O0 = new x90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    x90[] x90VarArr = l1Var.O0;
                    d6Var2 = ((f3) l1Var).resourcesProvider;
                    x90VarArr[i14] = new xb(context, 4, d6Var2);
                    x90 x90Var = l1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    x90Var.setVisibility(i11);
                    l1Var.O0[i14].setTextSize(1, 16.0f);
                    l1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    l1Var.O0[i14].setGravity(1);
                    l1Var.O0[i14].setTextColor(l1Var.getThemedColor(h6.G6));
                    l1Var.O0[i14].setLinkTextColor(l1Var.getThemedColor(h6.J6));
                    l1Var.N0.addView(l1Var.O0[i14], z5.d(-2.0f, -1));
                }
            }
            if (l1Var.N0.getParent() != null) {
                ((ViewGroup) l1Var.N0.getParent()).removeView(l1Var.N0);
            }
            sa1Var.addView(l1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (l1Var.P0 == null) {
                Context context2 = l1Var.getContext();
                d6Var = ((f3) l1Var).resourcesProvider;
                x90 x90Var2 = new x90(context2, d6Var);
                l1Var.P0 = x90Var2;
                x90Var2.setTextSize(1, 14.0f);
                l1Var.P0.setGravity(1);
                l1Var.P0.setTextColor(l1Var.getThemedColor(h6.G6));
                l1Var.P0.setLinkTextColor(l1Var.getThemedColor(h6.J6));
            }
            if (l1Var.P0.getParent() != null) {
                ((ViewGroup) l1Var.P0.getParent()).removeView(l1Var.P0);
            }
            sa1Var.addView(l1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            l1Var.b0(false);
            l1Var.f46338q0 = new gi.f(context, 5);
            n2 n2Var = new n2(this, context, 4);
            n2Var.setClipChildren(false);
            n2Var.addView(l1Var.f46338q0);
            n2Var.addView(sa1Var);
            yd ydVar = l1Var.f46339r0;
            hw0Var = n2Var;
            if (ydVar != null) {
                ydVar.setStarParticlesView(l1Var.f46338q0);
                hw0Var = n2Var;
            }
        }
        hw0Var.setLayoutParams(new s4.o0(-1, -2));
        l1Var.W(i10, hw0Var);
        return new s4.b1(hw0Var);
    }
}
