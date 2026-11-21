package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
public final class f1 extends FrameLayout implements fs {
    public static final List f57846x = Arrays.asList(new c1(0, 1, 20, 0), new c1(0, 2, 20, 40), new c1(1, 0, 0, 20), new c1(1, 2, 60, 40), new c1(2, 0, 40, 20), new c1(2, 1, 40, 60));
    public int f57847a;
    public final rh0 f57848b;
    public final ImageView f57849c;
    public final ImageView d;
    public final View f57850e;
    public final e1 f57851f;
    public d1 h;
    public int f57852n;
    public int f57853r;
    public int f57854s;
    public String f57855w;

    public f1(Context context) {
        super(context);
        this.f57847a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f57850e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57781b;

            {
                this.f57781b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57781b.h.a();
                        return;
                    case 1:
                        f1 f1Var = this.f57781b;
                        f1Var.d((f1Var.f57847a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57781b.h.b();
                        return;
                    case 3:
                        this.f57781b.h.t();
                        return;
                    default:
                        this.f57781b.h.D();
                        return;
                }
            }
        });
        addView(view, ma.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f57848b = imageView;
        imageView.f(2131624134, 24, 24, null);
        oh0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57781b;

            {
                this.f57781b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57781b.h.a();
                        return;
                    case 1:
                        f1 f1Var = this.f57781b;
                        f1Var.d((f1Var.f57847a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57781b.h.b();
                        return;
                    case 3:
                        this.f57781b.h.t();
                        return;
                    default:
                        this.f57781b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView((View) imageView, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f57849c = imageView2;
        imageView2.setImageResource(2131232401);
        imageView2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57781b;

            {
                this.f57781b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57781b.h.a();
                        return;
                    case 1:
                        f1 f1Var = this.f57781b;
                        f1Var.d((f1Var.f57847a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57781b.h.b();
                        return;
                    case 3:
                        this.f57781b.h.t();
                        return;
                    default:
                        this.f57781b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232044);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(m6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57781b;

            {
                this.f57781b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57781b.h.a();
                        return;
                    case 1:
                        f1 f1Var = this.f57781b;
                        f1Var.d((f1Var.f57847a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57781b.h.b();
                        return;
                    case 3:
                        this.f57781b.h.t();
                        return;
                    default:
                        this.f57781b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView3, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        e1 e1Var = new e1(context);
        this.f57851f = e1Var;
        e1Var.setCurrent(true);
        e1Var.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57781b;

            {
                this.f57781b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57781b.h.a();
                        return;
                    case 1:
                        f1 f1Var = this.f57781b;
                        f1Var.d((f1Var.f57847a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57781b.h.b();
                        return;
                    case 3:
                        this.f57781b.h.t();
                        return;
                    default:
                        this.f57781b.h.D();
                        return;
                }
            }
        });
        addView(e1Var, ma.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = 2131232044;
        }
        if (this.f57854s != i7) {
            this.f57854s = i7;
            org.telegram.messenger.g0.P3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        e1 e1Var = this.f57851f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + e1Var.getLeft(), e1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + e1Var.getRight(), e1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i7 = this.f57853r + layoutParams.leftMargin;
            this.f57853r = i7;
            view.layout(i7, (getMeasuredHeight() - layoutParams.height) / 2, this.f57853r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f57853r = layoutParams.width + layoutParams.rightMargin + this.f57853r;
        }
    }

    public final void d(int i7, boolean z10) {
        int i10 = this.f57847a;
        this.f57847a = i7;
        List list = f57846x;
        rh0 rh0Var = this.f57848b;
        if (i10 == i7) {
            oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
            c1 c1Var = (c1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c1 c1Var2 = (c1) it.next();
                if (this.f57847a == c1Var2.f57783b) {
                    c1Var = c1Var2;
                    break;
                }
            }
            animatedDrawable.M(c1Var.d);
            animatedDrawable.P(c1Var.d);
            if (z10) {
                this.h.c(i7);
                return;
            }
            return;
        }
        c1 c1Var3 = (c1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            c1 c1Var4 = (c1) it2.next();
            if (i10 == c1Var4.f57782a && this.f57847a == c1Var4.f57783b) {
                c1Var3 = c1Var4;
                break;
            }
        }
        oh0 animatedDrawable2 = rh0Var.getAnimatedDrawable();
        animatedDrawable2.M(c1Var3.f57784c);
        animatedDrawable2.P(c1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i7);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == ks.F5 && (str = this.f57855w) != null) {
            setTypeface(str);
            this.f57855w = null;
        }
    }

    public final void e(int i7, boolean z10) {
        int i10;
        if (this.f57852n == i7) {
            return;
        }
        this.f57852n = i7;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    i10 = 2131232289;
                } else {
                    i10 = 2131232292;
                }
            } else {
                i10 = 2131232291;
            }
        } else {
            i10 = 2131232290;
        }
        ImageView imageView = this.f57849c;
        if (z10) {
            org.telegram.messenger.g0.P3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f57850e;
    }

    public ah getEmojiButton() {
        return null;
    }

    public e1 getTypefaceCell() {
        return this.f57851f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.F5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f57853r = getPaddingLeft();
        c(this.f57850e);
        c(this.f57848b);
        c(this.f57849c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        e1 e1Var = this.f57851f;
        e1Var.layout(measuredWidth - e1Var.getMeasuredWidth(), (getMeasuredHeight() - e1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (e1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            e1 e1Var = this.f57851f;
            if (childAt == e1Var) {
                e1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i7) {
        d(i7, false);
    }

    public void setDelegate(d1 d1Var) {
        this.h = d1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.f57855w = str;
        e1 e1Var = this.f57851f;
        if (e1Var != null) {
            for (sg.a0 a0Var : sg.a0.c()) {
                if (a0Var.f57195a.equals(str)) {
                    e1Var.setTypeface(a0Var.d());
                    String str2 = a0Var.f57197c;
                    if (str2 == null) {
                        str2 = gd.O0(a0Var.f57196b);
                    }
                    e1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(k1 k1Var) {
    }
}
