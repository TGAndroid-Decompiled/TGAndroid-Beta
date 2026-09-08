package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
public final class v2 extends FrameLayout {
    public final yh.e1 f52737a;
    public final FrameLayout f52738b;
    public final x9 f52739c;
    public final TextView d;
    public final FrameLayout f52740e;
    public final ImageView f52741f;
    public TL_stars.StarGift h;
    public boolean f52742n;

    public v2(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new k3(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f52738b = frameLayout2;
        yh.e1 e1Var = new yh.e1(frameLayout2, null, false);
        this.f52737a = e1Var;
        frameLayout2.setBackground(e1Var);
        e1Var.f50282s = AndroidUtilities.dp(18.0f);
        e1Var.f50284u = false;
        frameLayout.addView(frameLayout2, w7.x5.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        x9 x9Var = new x9(context);
        this.f52739c = x9Var;
        frameLayout2.addView(x9Var, w7.x5.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, w7.x5.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f52740e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.x5.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f52741f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, w7.x5.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            yh.e1 e1Var = this.f52737a;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e((TL_stars.starGiftAttributePattern) s5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            v7.Z0(this.f52739c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.j6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.j6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String G0 = fi.m.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(G0);
            textView.setBackground(new k3(AndroidUtilities.dp(10.0f), b10));
            this.f52740e.setBackground(new k3(AndroidUtilities.dp(10.0f), b10));
        }
        if (starGift != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        b(z11, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        FrameLayout frameLayout = this.f52738b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f52740e;
        frameLayout2.animate().cancel();
        float f15 = 0.6f;
        float f16 = 0.0f;
        int i12 = 0;
        if (!z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.6f;
            }
            frameLayout.setScaleX(f12);
            if (z10) {
                f15 = 1.0f;
            }
            frameLayout.setScaleY(f15);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            frameLayout.setAlpha(f13);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            if (!z10) {
                i12 = 8;
            }
            frameLayout2.setVisibility(i12);
            if (z10) {
                f16 = 1.0f;
            }
            frameLayout2.setAlpha(f16);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f7);
        if (z10) {
            f15 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f10);
        pr prVar = pr.h;
        alpha.setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final v2 f52715b;

            {
                this.f52715b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        v2 v2Var = this.f52715b;
                        if (!z12) {
                            v2Var.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        v2 v2Var2 = this.f52715b;
                        if (!z13) {
                            v2Var2.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        v2 v2Var3 = this.f52715b;
                        if (!z14) {
                            v2Var3.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        animate2.alpha(f11).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final v2 f52715b;

            {
                this.f52715b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        v2 v2Var = this.f52715b;
                        if (!z12) {
                            v2Var.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        v2 v2Var2 = this.f52715b;
                        if (!z13) {
                            v2Var2.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        v2 v2Var3 = this.f52715b;
                        if (!z14) {
                            v2Var3.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z10) {
            f16 = 1.0f;
        }
        animate3.alpha(f16).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final v2 f52715b;

            {
                this.f52715b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        v2 v2Var = this.f52715b;
                        if (!z12) {
                            v2Var.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        v2 v2Var2 = this.f52715b;
                        if (!z13) {
                            v2Var2.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        v2 v2Var3 = this.f52715b;
                        if (!z14) {
                            v2Var3.f52740e.setVisibility(8);
                            return;
                        } else {
                            v2Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
    }
}
