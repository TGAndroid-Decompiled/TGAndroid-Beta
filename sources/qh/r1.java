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
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.tw0;
public final class r1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f45978a;
    public final FrameLayout f45979b;
    public final fn0 f45980c;
    public final lg.f d;
    public final int f45981e;
    public q1 f45982f;
    public boolean h;
    public final ImageView f45983n;
    public boolean f45984r;
    public boolean f45985s;
    public Utilities.Callback2 v;

    public r1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f45981e = -1;
        this.f45978a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45979b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ie, g6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new hg.j1(18));
        addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fn0 fn0Var = new fn0();
        this.f45980c = fn0Var;
        fn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.Je;
        fn0Var.a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        imageView.setImageDrawable(fn0Var);
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
        this.f45983n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(g6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f45834b;

            {
                this.f45834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45834b.b();
                        return;
                    default:
                        r1 r1Var = this.f45834b;
                        int i12 = r1Var.f45980c.f26961k;
                        if (i12 == 1) {
                            r1Var.b();
                            q1 q1Var = r1Var.f45982f;
                            if (q1Var != null) {
                                q1Var.C1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            r1Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f45834b;

            {
                this.f45834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45834b.b();
                        return;
                    default:
                        r1 r1Var = this.f45834b;
                        int i12 = r1Var.f45980c.f26961k;
                        if (i12 == 1) {
                            r1Var.b();
                            q1 q1Var = r1Var.f45982f;
                            if (q1Var != null) {
                                q1Var.C1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            r1Var.d.requestFocus();
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
        if (this.f45981e == i10 && this.f45982f != null) {
            return;
        }
        q1 q1Var = this.f45982f;
        FrameLayout frameLayout = this.f45979b;
        if (q1Var != null) {
            frameLayout.removeView(q1Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        q1 q1Var2 = new q1(this, context, i11, this.f45978a, z4);
        this.f45982f = q1Var2;
        lg.f fVar = this.d;
        TextPaint paint = fVar.getPaint();
        q1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fVar.getHint()) + "")));
        this.f45982f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final r1 f45880b;

            {
                this.f45880b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        r1 r1Var = this.f45880b;
                        lg.f fVar2 = r1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        r1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        r1 r1Var2 = this.f45880b;
                        q1 q1Var3 = r1Var2.f45982f;
                        if (q1Var3 != null) {
                            if (q1Var3.getSelectedCategory() == tw0Var) {
                                r1Var2.f45982f.E1(null);
                                Utilities.Callback2 callback2 = r1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            r1Var2.f45982f.E1(tw0Var);
                            String str = tw0Var.f31422a;
                            int categoryIndex = r1Var2.f45982f.getCategoryIndex();
                            Utilities.Callback2 callback22 = r1Var2.v;
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
        this.f45982f.setOnCategoryClick(new Utilities.Callback(this) {
            public final r1 f45880b;

            {
                this.f45880b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        r1 r1Var = this.f45880b;
                        lg.f fVar2 = r1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        r1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        r1 r1Var2 = this.f45880b;
                        q1 q1Var3 = r1Var2.f45982f;
                        if (q1Var3 != null) {
                            if (q1Var3.getSelectedCategory() == tw0Var) {
                                r1Var2.f45982f.E1(null);
                                Utilities.Callback2 callback2 = r1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            r1Var2.f45982f.E1(tw0Var);
                            String str = tw0Var.f31422a;
                            int categoryIndex = r1Var2.f45982f.getCategoryIndex();
                            Utilities.Callback2 callback22 = r1Var2.v;
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
        frameLayout.addView(this.f45982f, Math.max(0, frameLayout.getChildCount() - 1), k7.c6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        q1 q1Var = this.f45982f;
        if (q1Var != null) {
            q1Var.E1(null);
        }
    }

    public final void c(boolean z4) {
        this.f45985s = z4;
        if (z4) {
            this.f45980c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z4) {
        int i10;
        q1 q1Var;
        q1 q1Var2;
        boolean z10 = this.f45985s;
        lg.f fVar = this.d;
        if (z10 && ((fVar.length() != 0 || ((q1Var2 = this.f45982f) != null && q1Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (fVar.length() <= 0 && ((q1Var = this.f45982f) == null || q1Var.f33202l3 <= 0.5f || ((q1Var == null || !q1Var.f33197g3) && q1Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f45980c.b(i10);
        this.f45985s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
