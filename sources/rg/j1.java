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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.bg0;
import org.telegram.ui.ex0;
import org.telegram.ui.ow0;
import org.telegram.ui.ub1;
import org.telegram.ui.vw0;
import w7.y5;
public final class j1 extends xl0 {
    public final k1 f42664c;

    public j1(k1 k1Var) {
        this.f42664c = k1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42664c.f42678f0;
    }

    @Override
    public final int j(int i10) {
        k1 k1Var = this.f42664c;
        if (i10 != k1Var.f42679g0) {
            if (i10 >= k1Var.f42680h0 && i10 < k1Var.f42681i0) {
                return k1Var.X();
            }
            if (i10 >= k1Var.f42682j0 && i10 < k1Var.f42683k0) {
                return 1;
            }
            if (i10 == k1Var.f42684l0) {
                return 2;
            }
            if (i10 == k1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == k1Var.f42685n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f43005a;
        k1 k1Var = this.f42664c;
        int i11 = k1Var.f42682j0;
        if (i10 >= i11 && i10 < k1Var.f42683k0) {
            ow0 ow0Var = (ow0) view;
            ex0 ex0Var = (ex0) k1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == k1Var.f42683k0 - 1) {
                z10 = false;
            }
            ow0Var.a(ex0Var, z10);
        } else if (i10 >= k1Var.f42680h0 && i10 < k1Var.f42681i0) {
            k1Var.Y(view);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        int intValue;
        e6 e6Var2;
        int i11;
        vw0 vw0Var;
        e6 e6Var3;
        e6 e6Var4;
        Context context = viewGroup.getContext();
        k1 k1Var = this.f42664c;
        View Z = k1Var.Z(context, i10);
        if (Z != null) {
            return e2.k(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            e6Var4 = ((g3) k1Var).resourcesProvider;
                            vw0Var = new vw0(this, context, e6Var4);
                        } else {
                            e6Var3 = ((g3) k1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, e6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = i6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final j1 f42630b;

                                {
                                    this.f42630b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42630b.f42664c.f42691t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42630b.f42664c.f42691t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final j1 f42630b;

                                {
                                    this.f42630b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42630b.f42664c.f42691t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42630b.f42664c.f42691t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                    vw0Var = new i1(context, 0);
                }
            } else {
                vw0Var = new b7(context, k1Var.getThemedColor(i6.f19001a7), 0);
            }
        } else {
            ub1 ub1Var = new ub1(this, context, 17);
            k1Var.f42690s0 = ub1Var;
            ub1Var.setOrientation(1);
            View view = k1Var.B0;
            if (view == null) {
                k1Var.f42689r0 = new bg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = i6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i13), k1Var.getThemedColor(i6.f19128h5)));
                k1Var.f42689r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = k1Var.f42689r0.f43270b;
                aVar.f43258w = i13;
                aVar.f43259x = i6.Lj;
                aVar.b();
                ub1Var.addView(k1Var.f42689r0, y5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) k1Var.B0.getParent()).removeView(k1Var.B0);
                }
                k1Var.W(ub1Var);
            }
            if (k1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                k1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = k1Var.f42692u0;
                if (num == null) {
                    intValue = k1Var.getThemedColor(i6.f19390v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                k1Var.O0 = new p90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    p90[] p90VarArr = k1Var.O0;
                    e6Var2 = ((g3) k1Var).resourcesProvider;
                    p90VarArr[i14] = new xb(context, 4, e6Var2);
                    p90 p90Var = k1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    p90Var.setVisibility(i11);
                    k1Var.O0[i14].setTextSize(1, 16.0f);
                    k1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    k1Var.O0[i14].setGravity(1);
                    k1Var.O0[i14].setTextColor(k1Var.getThemedColor(i6.G6));
                    k1Var.O0[i14].setLinkTextColor(k1Var.getThemedColor(i6.J6));
                    k1Var.N0.addView(k1Var.O0[i14], y5.c(-2.0f, -1));
                }
            }
            if (k1Var.N0.getParent() != null) {
                ((ViewGroup) k1Var.N0.getParent()).removeView(k1Var.N0);
            }
            ub1Var.addView(k1Var.N0, y5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.P0 == null) {
                Context context2 = k1Var.getContext();
                e6Var = ((g3) k1Var).resourcesProvider;
                p90 p90Var2 = new p90(context2, e6Var);
                k1Var.P0 = p90Var2;
                p90Var2.setTextSize(1, 14.0f);
                k1Var.P0.setGravity(1);
                k1Var.P0.setTextColor(k1Var.getThemedColor(i6.G6));
                k1Var.P0.setLinkTextColor(k1Var.getThemedColor(i6.J6));
            }
            if (k1Var.P0.getParent() != null) {
                ((ViewGroup) k1Var.P0.getParent()).removeView(k1Var.P0);
            }
            ub1Var.addView(k1Var.P0, y5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.a0(false);
            k1Var.f42688q0 = new ei.f(context, 5);
            ai.f0 f0Var = new ai.f0(this, context, 29);
            f0Var.setClipChildren(false);
            f0Var.addView(k1Var.f42688q0);
            f0Var.addView(ub1Var);
            bg0 bg0Var = k1Var.f42689r0;
            vw0Var = f0Var;
            if (bg0Var != null) {
                bg0Var.setStarParticlesView(k1Var.f42688q0);
                vw0Var = f0Var;
            }
        }
        vw0Var.setLayoutParams(new s4.p0(-1, -2));
        k1Var.V(i10, vw0Var);
        return new s4.c1(vw0Var);
    }
}
