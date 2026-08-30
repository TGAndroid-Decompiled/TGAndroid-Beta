package ph;

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
public final class s1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f42296a;
    public final FrameLayout f42297b;
    public final fn0 f42298c;
    public final kg.f d;
    public final int e;
    public r1 f42299f;
    public boolean h;
    public final ImageView f42300n;
    public boolean f42301r;
    public boolean f42302s;
    public Utilities.Callback2 v;

    public s1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f42296a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42297b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ie, f6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new gg.j1(18));
        addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fn0 fn0Var = new fn0();
        this.f42298c = fn0Var;
        fn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Je;
        fn0Var.a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        imageView.setImageDrawable(fn0Var);
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        kg.f fVar = new kg.f(this, context, 9);
        this.d = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        fVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(fVar, k7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fVar.addTextChangedListener(new dh.c(this, 16));
        ImageView imageView2 = new ImageView(context);
        this.f42300n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(f6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final s1 f42157b;

            {
                this.f42157b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42157b.b();
                        return;
                    default:
                        s1 s1Var = this.f42157b;
                        int i12 = s1Var.f42298c.f24913k;
                        if (i12 == 1) {
                            s1Var.b();
                            r1 r1Var = s1Var.f42299f;
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
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s1 f42157b;

            {
                this.f42157b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42157b.b();
                        return;
                    default:
                        s1 s1Var = this.f42157b;
                        int i12 = s1Var.f42298c.f24913k;
                        if (i12 == 1) {
                            s1Var.b();
                            r1 r1Var = s1Var.f42299f;
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
        if (this.e == i10 && this.f42299f != null) {
            return;
        }
        r1 r1Var = this.f42299f;
        FrameLayout frameLayout = this.f42297b;
        if (r1Var != null) {
            frameLayout.removeView(r1Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        r1 r1Var2 = new r1(this, context, i11, this.f42296a, z4);
        this.f42299f = r1Var2;
        kg.f fVar = this.d;
        TextPaint paint = fVar.getPaint();
        r1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fVar.getHint()) + "")));
        this.f42299f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final s1 f42200b;

            {
                this.f42200b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        s1 s1Var = this.f42200b;
                        kg.f fVar2 = s1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        s1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        s1 s1Var2 = this.f42200b;
                        r1 r1Var3 = s1Var2.f42299f;
                        if (r1Var3 != null) {
                            if (r1Var3.getSelectedCategory() == tw0Var) {
                                s1Var2.f42299f.F1(null);
                                Utilities.Callback2 callback2 = s1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            s1Var2.f42299f.F1(tw0Var);
                            String str = tw0Var.f29058a;
                            int categoryIndex = s1Var2.f42299f.getCategoryIndex();
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
        this.f42299f.setOnCategoryClick(new Utilities.Callback(this) {
            public final s1 f42200b;

            {
                this.f42200b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        s1 s1Var = this.f42200b;
                        kg.f fVar2 = s1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        s1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        s1 s1Var2 = this.f42200b;
                        r1 r1Var3 = s1Var2.f42299f;
                        if (r1Var3 != null) {
                            if (r1Var3.getSelectedCategory() == tw0Var) {
                                s1Var2.f42299f.F1(null);
                                Utilities.Callback2 callback2 = s1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            s1Var2.f42299f.F1(tw0Var);
                            String str = tw0Var.f29058a;
                            int categoryIndex = s1Var2.f42299f.getCategoryIndex();
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
        frameLayout.addView(this.f42299f, Math.max(0, frameLayout.getChildCount() - 1), k7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        r1 r1Var = this.f42299f;
        if (r1Var != null) {
            r1Var.F1(null);
        }
    }

    public final void c(boolean z4) {
        this.f42302s = z4;
        if (z4) {
            this.f42298c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z4) {
        int i10;
        r1 r1Var;
        r1 r1Var2;
        boolean z10 = this.f42302s;
        kg.f fVar = this.d;
        if (z10 && ((fVar.length() != 0 || ((r1Var2 = this.f42299f) != null && r1Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (fVar.length() <= 0 && ((r1Var = this.f42299f) == null || r1Var.f30756l3 <= 0.5f || ((r1Var == null || !r1Var.f30751g3) && r1Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f42298c.b(i10);
        this.f42302s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
