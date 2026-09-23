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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.dx0;
import org.telegram.ui.nw0;
import org.telegram.ui.ub1;
import org.telegram.ui.uw0;
import org.telegram.ui.zf0;
import w7.x5;
public final class j1 extends ll0 {
    public final k1 f42286c;

    public j1(k1 k1Var) {
        this.f42286c = k1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42286c.f42300f0;
    }

    @Override
    public final int j(int i10) {
        k1 k1Var = this.f42286c;
        if (i10 != k1Var.f42301g0) {
            if (i10 >= k1Var.f42302h0 && i10 < k1Var.f42303i0) {
                return k1Var.X();
            }
            if (i10 >= k1Var.f42304j0 && i10 < k1Var.f42305k0) {
                return 1;
            }
            if (i10 == k1Var.f42306l0) {
                return 2;
            }
            if (i10 == k1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == k1Var.f42307n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42627a;
        k1 k1Var = this.f42286c;
        int i11 = k1Var.f42304j0;
        if (i10 >= i11 && i10 < k1Var.f42305k0) {
            nw0 nw0Var = (nw0) view;
            dx0 dx0Var = (dx0) k1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == k1Var.f42305k0 - 1) {
                z10 = false;
            }
            nw0Var.a(dx0Var, z10);
        } else if (i10 >= k1Var.f42302h0 && i10 < k1Var.f42303i0) {
            k1Var.Y(view);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        int intValue;
        d6 d6Var2;
        int i11;
        uw0 uw0Var;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        k1 k1Var = this.f42286c;
        View Z = k1Var.Z(context, i10);
        if (Z != null) {
            return e2.k(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            d6Var4 = ((f3) k1Var).resourcesProvider;
                            uw0Var = new uw0(this, context, d6Var4);
                        } else {
                            d6Var3 = ((f3) k1Var).resourcesProvider;
                            vg.d0 d0Var = new vg.d0(context, d6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = h6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final j1 f42252b;

                                {
                                    this.f42252b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42252b.f42286c.f42313t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42252b.f42286c.f42313t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final j1 f42252b;

                                {
                                    this.f42252b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nf.f.s(this.f42252b.f42286c.f42313t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            nf.f.s(this.f42252b.f42286c.f42313t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            uw0Var = d0Var;
                        }
                    } else {
                        uw0Var = new a(context);
                    }
                } else {
                    uw0Var = new i1(context, 0);
                }
            } else {
                uw0Var = new a7(context, k1Var.getThemedColor(h6.f18733a7), 0);
            }
        } else {
            ub1 ub1Var = new ub1(this, context, 17);
            k1Var.f42312s0 = ub1Var;
            ub1Var.setOrientation(1);
            View view = k1Var.B0;
            if (view == null) {
                k1Var.f42311r0 = new zf0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = h6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i13), k1Var.getThemedColor(h6.f18859h5)));
                k1Var.f42311r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = k1Var.f42311r0.f42889b;
                aVar.f42877w = i13;
                aVar.f42878x = h6.Lj;
                aVar.b();
                ub1Var.addView(k1Var.f42311r0, x5.q(160, 160, 1));
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
                Integer num = k1Var.f42314u0;
                if (num == null) {
                    intValue = k1Var.getThemedColor(h6.f19118v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                k1Var.O0 = new d90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    d90[] d90VarArr = k1Var.O0;
                    d6Var2 = ((f3) k1Var).resourcesProvider;
                    d90VarArr[i14] = new xb(context, 4, d6Var2);
                    d90 d90Var = k1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    d90Var.setVisibility(i11);
                    k1Var.O0[i14].setTextSize(1, 16.0f);
                    k1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    k1Var.O0[i14].setGravity(1);
                    k1Var.O0[i14].setTextColor(k1Var.getThemedColor(h6.G6));
                    k1Var.O0[i14].setLinkTextColor(k1Var.getThemedColor(h6.J6));
                    k1Var.N0.addView(k1Var.O0[i14], x5.c(-2.0f, -1));
                }
            }
            if (k1Var.N0.getParent() != null) {
                ((ViewGroup) k1Var.N0.getParent()).removeView(k1Var.N0);
            }
            ub1Var.addView(k1Var.N0, x5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.P0 == null) {
                Context context2 = k1Var.getContext();
                d6Var = ((f3) k1Var).resourcesProvider;
                d90 d90Var2 = new d90(context2, d6Var);
                k1Var.P0 = d90Var2;
                d90Var2.setTextSize(1, 14.0f);
                k1Var.P0.setGravity(1);
                k1Var.P0.setTextColor(k1Var.getThemedColor(h6.G6));
                k1Var.P0.setLinkTextColor(k1Var.getThemedColor(h6.J6));
            }
            if (k1Var.P0.getParent() != null) {
                ((ViewGroup) k1Var.P0.getParent()).removeView(k1Var.P0);
            }
            ub1Var.addView(k1Var.P0, x5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.a0(false);
            k1Var.f42310q0 = new ei.f(context, 5);
            ai.f0 f0Var = new ai.f0(this, context, 29);
            f0Var.setClipChildren(false);
            f0Var.addView(k1Var.f42310q0);
            f0Var.addView(ub1Var);
            zf0 zf0Var = k1Var.f42311r0;
            uw0Var = f0Var;
            if (zf0Var != null) {
                zf0Var.setStarParticlesView(k1Var.f42310q0);
                uw0Var = f0Var;
            }
        }
        uw0Var.setLayoutParams(new s4.p0(-1, -2));
        k1Var.V(i10, uw0Var);
        return new s4.c1(uw0Var);
    }
}
