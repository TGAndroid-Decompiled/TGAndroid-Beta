package zf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fh.e4;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.gw0;
import org.telegram.ui.qv0;
import org.telegram.ui.ta1;
import org.telegram.ui.xv0;
import yf.q2;
public final class j1 extends vk0 {
    public final k1 f50557c;

    public j1(k1 k1Var) {
        this.f50557c = k1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f50557c.f50568b0;
    }

    @Override
    public final int j(int i9) {
        k1 k1Var = this.f50557c;
        if (i9 != k1Var.f50569c0) {
            if (i9 >= k1Var.f50570d0 && i9 < k1Var.f50571e0) {
                return k1Var.W();
            }
            if (i9 >= k1Var.f50572f0 && i9 < k1Var.f50573g0) {
                return 1;
            }
            if (i9 == k1Var.f50574h0) {
                return 2;
            }
            if (i9 == k1Var.f50575i0) {
                return 3;
            }
            if (i9 == 0) {
                return 4;
            }
            if (i9 == k1Var.f50576j0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.f5501a;
        k1 k1Var = this.f50557c;
        int i10 = k1Var.f50572f0;
        if (i9 >= i10 && i9 < k1Var.f50573g0) {
            qv0 qv0Var = (qv0) view;
            gw0 gw0Var = (gw0) k1Var.T.get(i9 - i10);
            boolean z10 = true;
            if (i9 == k1Var.f50573g0 - 1) {
                z10 = false;
            }
            qv0Var.a(gw0Var, z10);
        } else if (i9 >= k1Var.f50570d0 && i9 < k1Var.f50571e0) {
            k1Var.X(view);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        int intValue;
        b6 b6Var2;
        int i10;
        xv0 xv0Var;
        b6 b6Var3;
        b6 b6Var4;
        Context context = viewGroup.getContext();
        k1 k1Var = this.f50557c;
        View Y = k1Var.Y(context, i9);
        if (Y != null) {
            return j3.r0.s(Y, Y, -1, -2);
        }
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            b6Var4 = ((f3) k1Var).resourcesProvider;
                            xv0Var = new xv0(this, context, b6Var4);
                        } else {
                            b6Var3 = ((f3) k1Var).resourcesProvider;
                            dg.h0 h0Var = new dg.h0(context, b6Var3);
                            h0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i11 = f6.f23061gc;
                            h0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i11, 0, new Runnable(this) {
                                public final j1 f50529b;

                                {
                                    this.f50529b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ve.e.s(this.f50529b.f50557c.f50581p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            ve.e.s(this.f50529b.f50557c.f50581p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i11, 0, new Runnable(this) {
                                public final j1 f50529b;

                                {
                                    this.f50529b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ve.e.s(this.f50529b.f50557c.f50581p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            ve.e.s(this.f50529b.f50557c.f50581p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            xv0Var = h0Var;
                        }
                    } else {
                        xv0Var = new a(context);
                    }
                } else {
                    xv0Var = new b0(context, 1);
                }
            } else {
                xv0Var = new z6(context, k1Var.getThemedColor(f6.f22947a7), 0);
            }
        } else {
            ta1 ta1Var = new ta1(this, context, 20);
            k1Var.f50580o0 = ta1Var;
            ta1Var.setOrientation(1);
            View view = k1Var.f50589x0;
            if (view == null) {
                k1Var.f50579n0 = new dg.q(context, 1, 0, 4);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i12 = f6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i12), k1Var.getThemedColor(f6.f23072h5)));
                k1Var.f50579n0.setBackgroundBitmap(createBitmap);
                ag.a aVar = k1Var.f50579n0.f205b;
                aVar.f181w = i12;
                aVar.f182x = f6.Lj;
                aVar.b();
                ta1Var.addView(k1Var.f50579n0, e6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) k1Var.f50589x0.getParent()).removeView(k1Var.f50589x0);
                }
                k1Var.V(ta1Var);
            }
            if (k1Var.J0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                k1Var.J0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = k1Var.f50582q0;
                if (num == null) {
                    intValue = k1Var.getThemedColor(f6.f23319v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                k1Var.K0 = new l80[2];
                for (int i13 = 0; i13 < 2; i13++) {
                    l80[] l80VarArr = k1Var.K0;
                    b6Var2 = ((f3) k1Var).resourcesProvider;
                    l80VarArr[i13] = new e4(context, 5, b6Var2);
                    l80 l80Var = k1Var.K0[i13];
                    if (i13 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    l80Var.setVisibility(i10);
                    k1Var.K0[i13].setTextSize(1, 16.0f);
                    k1Var.K0[i13].setTypeface(AndroidUtilities.bold());
                    k1Var.K0[i13].setGravity(1);
                    k1Var.K0[i13].setTextColor(k1Var.getThemedColor(f6.G6));
                    k1Var.K0[i13].setLinkTextColor(k1Var.getThemedColor(f6.J6));
                    k1Var.J0.addView(k1Var.K0[i13], e6.c(-2.0f, -1));
                }
            }
            if (k1Var.J0.getParent() != null) {
                ((ViewGroup) k1Var.J0.getParent()).removeView(k1Var.J0);
            }
            ta1Var.addView(k1Var.J0, e6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.L0 == null) {
                Context context2 = k1Var.getContext();
                b6Var = ((f3) k1Var).resourcesProvider;
                l80 l80Var2 = new l80(context2, b6Var);
                k1Var.L0 = l80Var2;
                l80Var2.setTextSize(1, 14.0f);
                k1Var.L0.setGravity(1);
                k1Var.L0.setTextColor(k1Var.getThemedColor(f6.G6));
                k1Var.L0.setLinkTextColor(k1Var.getThemedColor(f6.J6));
            }
            if (k1Var.L0.getParent() != null) {
                ((ViewGroup) k1Var.L0.getParent()).removeView(k1Var.L0);
            }
            ta1Var.addView(k1Var.L0, e6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.Z(false);
            k1Var.m0 = new mh.f(context, 5);
            q2 q2Var = new q2(this, context, 3);
            q2Var.setClipChildren(false);
            q2Var.addView(k1Var.m0);
            q2Var.addView(ta1Var);
            dg.q qVar = k1Var.f50579n0;
            xv0Var = q2Var;
            if (qVar != null) {
                qVar.setStarParticlesView(k1Var.m0);
                xv0Var = q2Var;
            }
        }
        xv0Var.setLayoutParams(new f2.a1(-1, -2));
        k1Var.U(i9, xv0Var);
        return new f2.q1(xv0Var);
    }
}
