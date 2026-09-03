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
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.tw0;
public final class r1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f42267a;
    public final FrameLayout f42268b;
    public final en0 f42269c;
    public final kg.f d;
    public final int e;
    public q1 f42270f;
    public boolean h;
    public final ImageView f42271n;
    public boolean f42272r;
    public boolean f42273s;
    public Utilities.Callback2 v;

    public r1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f42267a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42268b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ie, f6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new gg.j1(18));
        addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        en0 en0Var = new en0();
        this.f42269c = en0Var;
        en0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Je;
        en0Var.a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        imageView.setImageDrawable(en0Var);
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
        this.f42271n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(f6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f42091b;

            {
                this.f42091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42091b.b();
                        return;
                    default:
                        r1 r1Var = this.f42091b;
                        int i12 = r1Var.f42269c.f24646k;
                        if (i12 == 1) {
                            r1Var.b();
                            q1 q1Var = r1Var.f42270f;
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
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f42091b;

            {
                this.f42091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42091b.b();
                        return;
                    default:
                        r1 r1Var = this.f42091b;
                        int i12 = r1Var.f42269c.f24646k;
                        if (i12 == 1) {
                            r1Var.b();
                            q1 q1Var = r1Var.f42270f;
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
        if (this.e == i10 && this.f42270f != null) {
            return;
        }
        q1 q1Var = this.f42270f;
        FrameLayout frameLayout = this.f42268b;
        if (q1Var != null) {
            frameLayout.removeView(q1Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        q1 q1Var2 = new q1(this, context, i11, this.f42267a, z4);
        this.f42270f = q1Var2;
        kg.f fVar = this.d;
        TextPaint paint = fVar.getPaint();
        q1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fVar.getHint()) + "")));
        this.f42270f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final r1 f42205b;

            {
                this.f42205b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        r1 r1Var = this.f42205b;
                        kg.f fVar2 = r1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        r1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        r1 r1Var2 = this.f42205b;
                        q1 q1Var3 = r1Var2.f42270f;
                        if (q1Var3 != null) {
                            if (q1Var3.getSelectedCategory() == tw0Var) {
                                r1Var2.f42270f.E1(null);
                                Utilities.Callback2 callback2 = r1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            r1Var2.f42270f.E1(tw0Var);
                            String str = tw0Var.f29037a;
                            int categoryIndex = r1Var2.f42270f.getCategoryIndex();
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
        this.f42270f.setOnCategoryClick(new Utilities.Callback(this) {
            public final r1 f42205b;

            {
                this.f42205b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        r1 r1Var = this.f42205b;
                        kg.f fVar2 = r1Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        r1Var.d(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        r1 r1Var2 = this.f42205b;
                        q1 q1Var3 = r1Var2.f42270f;
                        if (q1Var3 != null) {
                            if (q1Var3.getSelectedCategory() == tw0Var) {
                                r1Var2.f42270f.E1(null);
                                Utilities.Callback2 callback2 = r1Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            r1Var2.f42270f.E1(tw0Var);
                            String str = tw0Var.f29037a;
                            int categoryIndex = r1Var2.f42270f.getCategoryIndex();
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
        frameLayout.addView(this.f42270f, Math.max(0, frameLayout.getChildCount() - 1), k7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        q1 q1Var = this.f42270f;
        if (q1Var != null) {
            q1Var.E1(null);
        }
    }

    public final void c(boolean z4) {
        this.f42273s = z4;
        if (z4) {
            this.f42269c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z4) {
        int i10;
        q1 q1Var;
        q1 q1Var2;
        boolean z10 = this.f42273s;
        kg.f fVar = this.d;
        if (z10 && ((fVar.length() != 0 || ((q1Var2 = this.f42270f) != null && q1Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (fVar.length() <= 0 && ((q1Var = this.f42270f) == null || q1Var.f30738l3 <= 0.5f || ((q1Var == null || !q1Var.f30733g3) && q1Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f42269c.b(i10);
        this.f42273s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
