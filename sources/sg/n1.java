package sg;

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
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.bx0;
import org.telegram.ui.cc1;
import org.telegram.ui.eg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.x5;
public final class n1 extends kl0 {
    public final o1 f46213c;

    public n1(o1 o1Var) {
        this.f46213c = o1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46213c.f46227f0;
    }

    @Override
    public final int j(int i10) {
        o1 o1Var = this.f46213c;
        if (i10 != o1Var.f46228g0) {
            if (i10 >= o1Var.f46229h0 && i10 < o1Var.f46230i0) {
                return o1Var.X();
            }
            if (i10 >= o1Var.f46231j0 && i10 < o1Var.f46232k0) {
                return 1;
            }
            if (i10 == o1Var.f46233l0) {
                return 2;
            }
            if (i10 == o1Var.m0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == o1Var.f46234n0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f45766a;
        o1 o1Var = this.f46213c;
        int i11 = o1Var.f46231j0;
        if (i10 >= i11 && i10 < o1Var.f46232k0) {
            uw0 uw0Var = (uw0) view;
            kx0 kx0Var = (kx0) o1Var.X.get(i10 - i11);
            boolean z10 = true;
            if (i10 == o1Var.f46232k0 - 1) {
                z10 = false;
            }
            uw0Var.a(kx0Var, z10);
        } else if (i10 >= o1Var.f46229h0 && i10 < o1Var.f46230i0) {
            o1Var.Y(view);
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
        o1 o1Var = this.f46213c;
        View Z = o1Var.Z(context, i10);
        if (Z != null) {
            return e2.l(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            f6Var4 = ((f3) o1Var).resourcesProvider;
                            bx0Var = new bx0(this, context, f6Var4);
                        } else {
                            f6Var3 = ((f3) o1Var).resourcesProvider;
                            wg.d0 d0Var = new wg.d0(context, f6Var3);
                            d0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = j6.gc;
                            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final n1 f46184b;

                                {
                                    this.f46184b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f46184b.f46213c.f46240t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f46184b.f46213c.f46240t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final n1 f46184b;

                                {
                                    this.f46184b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            of.f.s(this.f46184b.f46213c.f46240t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            of.f.s(this.f46184b.f46213c.f46240t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                    bx0Var = new m1(context, 0);
                }
            } else {
                bx0Var = new a7(context, o1Var.getThemedColor(j6.f20634a7), 0);
            }
        } else {
            cc1 cc1Var = new cc1(this, context, 17);
            o1Var.f46239s0 = cc1Var;
            cc1Var.setOrientation(1);
            View view = o1Var.B0;
            if (view == null) {
                o1Var.f46238r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, o1Var.getThemedColor(i13), o1Var.getThemedColor(j6.f20761h5)));
                o1Var.f46238r0.setBackgroundBitmap(createBitmap);
                tg.a aVar = o1Var.f46238r0.f46547b;
                aVar.f46535w = i13;
                aVar.f46536x = j6.Lj;
                aVar.b();
                cc1Var.addView(o1Var.f46238r0, x5.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) o1Var.B0.getParent()).removeView(o1Var.B0);
                }
                o1Var.W(cc1Var);
            }
            if (o1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                o1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = o1Var.f46241u0;
                if (num == null) {
                    intValue = o1Var.getThemedColor(j6.f21017v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                o1Var.O0 = new d90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    d90[] d90VarArr = o1Var.O0;
                    f6Var2 = ((f3) o1Var).resourcesProvider;
                    d90VarArr[i14] = new xb(context, 4, f6Var2);
                    d90 d90Var = o1Var.O0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    d90Var.setVisibility(i11);
                    o1Var.O0[i14].setTextSize(1, 16.0f);
                    o1Var.O0[i14].setTypeface(AndroidUtilities.bold());
                    o1Var.O0[i14].setGravity(1);
                    o1Var.O0[i14].setTextColor(o1Var.getThemedColor(j6.G6));
                    o1Var.O0[i14].setLinkTextColor(o1Var.getThemedColor(j6.J6));
                    o1Var.N0.addView(o1Var.O0[i14], x5.c(-2.0f, -1));
                }
            }
            if (o1Var.N0.getParent() != null) {
                ((ViewGroup) o1Var.N0.getParent()).removeView(o1Var.N0);
            }
            cc1Var.addView(o1Var.N0, x5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (o1Var.P0 == null) {
                Context context2 = o1Var.getContext();
                f6Var = ((f3) o1Var).resourcesProvider;
                d90 d90Var2 = new d90(context2, f6Var);
                o1Var.P0 = d90Var2;
                d90Var2.setTextSize(1, 14.0f);
                o1Var.P0.setGravity(1);
                o1Var.P0.setTextColor(o1Var.getThemedColor(j6.G6));
                o1Var.P0.setLinkTextColor(o1Var.getThemedColor(j6.J6));
            }
            if (o1Var.P0.getParent() != null) {
                ((ViewGroup) o1Var.P0.getParent()).removeView(o1Var.P0);
            }
            cc1Var.addView(o1Var.P0, x5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            o1Var.a0(false);
            o1Var.f46237q0 = new fi.g(context, 5);
            l1 l1Var = new l1(this, context, 0);
            l1Var.setClipChildren(false);
            l1Var.addView(o1Var.f46237q0);
            l1Var.addView(cc1Var);
            eg0 eg0Var = o1Var.f46238r0;
            bx0Var = l1Var;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(o1Var.f46237q0);
                bx0Var = l1Var;
            }
        }
        bx0Var.setLayoutParams(new s4.p0(-1, -2));
        o1Var.V(i10, bx0Var);
        return new s4.c1(bx0Var);
    }
}
