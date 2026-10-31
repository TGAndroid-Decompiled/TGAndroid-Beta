package vh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.xv0;
public final class p1 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f51716a;
    public final FrameLayout f51717b;
    public final ImageView f51718c;
    public final im0 d;
    public final org.telegram.ui.ActionBar.n0 e;
    public final int f51719f;
    public o1 h;
    public boolean f51720n;
    public final ImageView f51721r;
    public boolean f51722s;
    public boolean f51723w;
    public j20 f51724x;

    public p1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f51719f = -1;
        this.f51716a = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51717b = frameLayout;
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.t6.xf;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.d2(26));
        addView(frameLayout, w7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f51718c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        im0 im0Var = new im0();
        this.d = im0Var;
        im0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.t6.f21320yf;
        im0Var.a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        imageView.setImageDrawable(im0Var);
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 10);
        this.e = n0Var;
        n0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.E(n0Var, i11, p6Var);
        org.telegram.ui.ActionBar.a7.V(n0Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        n0Var.setBackgroundDrawable(null);
        n0Var.setPadding(0, 0, 0, 0);
        n0Var.setMaxLines(1);
        n0Var.setLines(1);
        n0Var.setSingleLine(true);
        n0Var.setImeOptions(268435459);
        n0Var.setHint(cd.L0(2131745853, null));
        int i12 = org.telegram.ui.ActionBar.t6.Ai;
        org.telegram.ui.ActionBar.a7.m(n0Var, 30, i12, p6Var);
        org.telegram.ui.ActionBar.a7.m(n0Var, 36, i12, p6Var);
        n0Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        n0Var.setCursorWidth(1.5f);
        n0Var.setTranslationY(org.telegram.messenger.i0.L(-2.0f));
        frameLayout2.addView(n0Var, w7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        n0Var.addTextChangedListener(new rh.h0(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.f51721r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(p6Var));
        int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f51474b;

            {
                this.f51474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51474b.b();
                        return;
                    default:
                        p1 p1Var = this.f51474b;
                        int i14 = p1Var.d.f27025k;
                        if (i14 == 1) {
                            p1Var.b();
                            o1 o1Var = p1Var.h;
                            if (o1Var != null) {
                                o1Var.G1();
                                return;
                            }
                            return;
                        } else if (i14 == 0) {
                            p1Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f51474b;

            {
                this.f51474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51474b.b();
                        return;
                    default:
                        p1 p1Var = this.f51474b;
                        int i14 = p1Var.d.f27025k;
                        if (i14 == 1) {
                            p1Var.b();
                            o1 o1Var = p1Var.h;
                            if (o1Var != null) {
                                o1Var.G1();
                                return;
                            }
                            return;
                        } else if (i14 == 0) {
                            p1Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        int i11;
        org.telegram.ui.ActionBar.n0 n0Var;
        if (this.f51719f == i10 && this.h != null) {
            return;
        }
        o1 o1Var = this.h;
        FrameLayout frameLayout = this.f51717b;
        if (o1Var != null) {
            frameLayout.removeView(o1Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        o1 o1Var2 = new o1(this, context, i11, this.f51716a, z10);
        this.h = o1Var2;
        o1Var2.setDontOccupyWidth(org.telegram.messenger.i0.L(16.0f) + ((int) this.e.getPaint().measureText(((Object) n0Var.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new q20(this) {
            public final p1 f51500b;

            {
                this.f51500b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        p1 p1Var = this.f51500b;
                        org.telegram.ui.ActionBar.n0 n0Var2 = p1Var.e;
                        n0Var2.animate().cancel();
                        n0Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        p1Var.d(false);
                        return;
                    default:
                        xv0 xv0Var = (xv0) obj;
                        p1 p1Var2 = this.f51500b;
                        o1 o1Var3 = p1Var2.h;
                        if (o1Var3 != null) {
                            if (o1Var3.getSelectedCategory() == xv0Var) {
                                p1Var2.h.I1(null);
                                j20 j20Var = p1Var2.f51724x;
                                if (j20Var != null) {
                                    j20Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            p1Var2.h.I1(xv0Var);
                            String str = xv0Var.f32548a;
                            int categoryIndex = p1Var2.h.getCategoryIndex();
                            j20 j20Var2 = p1Var2.f51724x;
                            if (j20Var2 != null) {
                                j20Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new q20(this) {
            public final p1 f51500b;

            {
                this.f51500b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        p1 p1Var = this.f51500b;
                        org.telegram.ui.ActionBar.n0 n0Var2 = p1Var.e;
                        n0Var2.animate().cancel();
                        n0Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        p1Var.d(false);
                        return;
                    default:
                        xv0 xv0Var = (xv0) obj;
                        p1 p1Var2 = this.f51500b;
                        o1 o1Var3 = p1Var2.h;
                        if (o1Var3 != null) {
                            if (o1Var3.getSelectedCategory() == xv0Var) {
                                p1Var2.h.I1(null);
                                j20 j20Var = p1Var2.f51724x;
                                if (j20Var != null) {
                                    j20Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            p1Var2.h.I1(xv0Var);
                            String str = xv0Var.f32548a;
                            int categoryIndex = p1Var2.h.getCategoryIndex();
                            j20 j20Var2 = p1Var2.f51724x;
                            if (j20Var2 != null) {
                                j20Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), w7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.e.setText("");
        j20 j20Var = this.f51724x;
        if (j20Var != null) {
            j20Var.a(null, -1);
        }
        o1 o1Var = this.h;
        if (o1Var != null) {
            o1Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f51723w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        o1 o1Var;
        o1 o1Var2;
        boolean z11 = this.f51723w;
        org.telegram.ui.ActionBar.n0 n0Var = this.e;
        if (z11 && ((n0Var.length() != 0 || ((o1Var2 = this.h) != null && o1Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (n0Var.length() <= 0 && ((o1Var = this.h) == null || o1Var.f24905v3 <= 0.5f || ((o1Var == null || !o1Var.f24900q3) && o1Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.d.b(i10);
        this.f51723w = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            im0 im0Var = this.d;
            org.telegram.ui.ActionBar.p6 p6Var = this.f51716a;
            if (im0Var != null) {
                im0Var.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21320yf, p6Var));
            }
            ImageView imageView = this.f51718c;
            if (imageView != null) {
                imageView.invalidate();
            }
            org.telegram.ui.ActionBar.n0 n0Var = this.e;
            if (n0Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ai;
                n0Var.setCursorColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
                n0Var.setHandlesColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
            ImageView imageView2 = this.f51721r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
