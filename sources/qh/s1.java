package qh;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.uw0;
public final class s1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f46027a;
    public final FrameLayout f46028b;
    public final gn0 f46029c;
    public final lg.f d;
    public final int f46030e;
    public r1 f46031f;
    public boolean h;
    public final ImageView f46032n;
    public boolean f46033r;
    public boolean f46034s;
    public Utilities.Callback2 v;

    public s1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f46030e = -1;
        this.f46027a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46028b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ie, g6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new hg.j1(18));
        addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        gn0 gn0Var = new gn0();
        this.f46029c = gn0Var;
        gn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.Je;
        gn0Var.a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        imageView.setImageDrawable(gn0Var);
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        lg.f fVar = new lg.f(this, context, 9);
        this.d = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.k6.Mh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        fVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(fVar, k7.c6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fVar.addTextChangedListener(new eh.c(this, 16));
        ImageView imageView2 = new ImageView(context);
        this.f46032n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(g6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final s1 f45875b;

            {
                this.f45875b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45875b.b();
                        return;
                    default:
                        s1 s1Var = this.f45875b;
                        int i12 = s1Var.f46029c.f27235k;
                        if (i12 == 1) {
                            s1Var.b();
                            r1 r1Var = s1Var.f46031f;
                            if (r1Var != null) {
                                r1Var.D1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            s1Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s1 f45875b;

            {
                this.f45875b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45875b.b();
                        return;
                    default:
                        s1 s1Var = this.f45875b;
                        int i12 = s1Var.f46029c.f27235k;
                        if (i12 == 1) {
                            s1Var.b();
                            r1 r1Var = s1Var.f46031f;
                            if (r1Var != null) {
                                r1Var.D1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            s1Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i10, boolean z4) {
        int i11;
        if (this.f46030e == i10 && this.f46031f != null) {
            return;
        }
        r1 r1Var = this.f46031f;
        FrameLayout frameLayout = this.f46028b;
        if (r1Var != null) {
            frameLayout.removeView(r1Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        r1 r1Var2 = new r1(this, context, i11, this.f46027a, z4);
        this.f46031f = r1Var2;
        lg.f fVar = this.d;
        TextPaint paint = fVar.getPaint();
        r1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fVar.getHint()) + "")));
        this.f46031f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final s1 f45898b;

            {
                this.f45898b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        s1 s1Var = this.f45898b;
                        lg.f fVar2 = s1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        s1Var.d(false);
                        return;
                    default:
                        uw0 uw0Var = (uw0) obj;
                        s1 s1Var2 = this.f45898b;
                        r1 r1Var3 = s1Var2.f46031f;
                        if (r1Var3 != null) {
                            if (r1Var3.getSelectedCategory() == uw0Var) {
                                s1Var2.f46031f.F1(null);
                                Utilities.Callback2 callback2 = s1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            s1Var2.f46031f.F1(uw0Var);
                            String str = uw0Var.f31738a;
                            int categoryIndex = s1Var2.f46031f.getCategoryIndex();
                            Utilities.Callback2 callback22 = s1Var2.v;
                            if (callback22 != null) {
                                callback22.run(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f46031f.setOnCategoryClick(new Utilities.Callback(this) {
            public final s1 f45898b;

            {
                this.f45898b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        s1 s1Var = this.f45898b;
                        lg.f fVar2 = s1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        s1Var.d(false);
                        return;
                    default:
                        uw0 uw0Var = (uw0) obj;
                        s1 s1Var2 = this.f45898b;
                        r1 r1Var3 = s1Var2.f46031f;
                        if (r1Var3 != null) {
                            if (r1Var3.getSelectedCategory() == uw0Var) {
                                s1Var2.f46031f.F1(null);
                                Utilities.Callback2 callback2 = s1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            s1Var2.f46031f.F1(uw0Var);
                            String str = uw0Var.f31738a;
                            int categoryIndex = s1Var2.f46031f.getCategoryIndex();
                            Utilities.Callback2 callback22 = s1Var2.v;
                            if (callback22 != null) {
                                callback22.run(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.f46031f, Math.max(0, frameLayout.getChildCount() - 1), k7.c6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        r1 r1Var = this.f46031f;
        if (r1Var != null) {
            r1Var.F1(null);
        }
    }

    public final void c(boolean z4) {
        this.f46034s = z4;
        if (z4) {
            this.f46029c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z4) {
        int i10;
        r1 r1Var;
        r1 r1Var2;
        boolean z10 = this.f46034s;
        lg.f fVar = this.d;
        if (z10 && ((fVar.length() != 0 || ((r1Var2 = this.f46031f) != null && r1Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (fVar.length() <= 0 && ((r1Var = this.f46031f) == null || r1Var.f33604l3 <= 0.5f || ((r1Var == null || !r1Var.f33599g3) && r1Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f46029c.b(i10);
        this.f46034s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
