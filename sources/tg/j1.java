package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.zg;
public final class j1 extends FrameLayout implements fs {
    public static final List f57991x = Arrays.asList(new g1(0, 1, 20, 0), new g1(0, 2, 20, 40), new g1(1, 0, 0, 20), new g1(1, 2, 60, 40), new g1(2, 0, 40, 20), new g1(2, 1, 40, 60));
    public int f57992a;
    public final qh0 f57993b;
    public final ImageView f57994c;
    public final ImageView d;
    public final View f57995e;
    public final i1 f57996f;
    public h1 h;
    public int f57997n;
    public int f57998r;
    public int f57999s;
    public String f58000w;

    public j1(Context context) {
        super(context);
        this.f57992a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f57995e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final j1 f57897b;

            {
                this.f57897b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57897b.h.a();
                        return;
                    case 1:
                        j1 j1Var = this.f57897b;
                        j1Var.d((j1Var.f57992a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57897b.h.b();
                        return;
                    case 3:
                        this.f57897b.h.t();
                        return;
                    default:
                        this.f57897b.h.D();
                        return;
                }
            }
        });
        addView(view, na.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f57993b = imageView;
        imageView.f(2131624134, 24, 24, null);
        nh0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j1 f57897b;

            {
                this.f57897b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57897b.h.a();
                        return;
                    case 1:
                        j1 j1Var = this.f57897b;
                        j1Var.d((j1Var.f57992a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57897b.h.b();
                        return;
                    case 3:
                        this.f57897b.h.t();
                        return;
                    default:
                        this.f57897b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView((View) imageView, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f57994c = imageView2;
        imageView2.setImageResource(2131232404);
        imageView2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final j1 f57897b;

            {
                this.f57897b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57897b.h.a();
                        return;
                    case 1:
                        j1 j1Var = this.f57897b;
                        j1Var.d((j1Var.f57992a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57897b.h.b();
                        return;
                    case 3:
                        this.f57897b.h.t();
                        return;
                    default:
                        this.f57897b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232047);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(n6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final j1 f57897b;

            {
                this.f57897b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57897b.h.a();
                        return;
                    case 1:
                        j1 j1Var = this.f57897b;
                        j1Var.d((j1Var.f57992a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57897b.h.b();
                        return;
                    case 3:
                        this.f57897b.h.t();
                        return;
                    default:
                        this.f57897b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView3, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        i1 i1Var = new i1(context);
        this.f57996f = i1Var;
        i1Var.setCurrent(true);
        i1Var.setOnClickListener(new View.OnClickListener(this) {
            public final j1 f57897b;

            {
                this.f57897b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57897b.h.a();
                        return;
                    case 1:
                        j1 j1Var = this.f57897b;
                        j1Var.d((j1Var.f57992a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57897b.h.b();
                        return;
                    case 3:
                        this.f57897b.h.t();
                        return;
                    default:
                        this.f57897b.h.D();
                        return;
                }
            }
        });
        addView(i1Var, na.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = 2131232047;
        }
        if (this.f57999s != i7) {
            this.f57999s = i7;
            org.telegram.messenger.g0.P3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        i1 i1Var = this.f57996f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + i1Var.getLeft(), i1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + i1Var.getRight(), i1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i7 = this.f57998r + layoutParams.leftMargin;
            this.f57998r = i7;
            view.layout(i7, (getMeasuredHeight() - layoutParams.height) / 2, this.f57998r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f57998r = layoutParams.width + layoutParams.rightMargin + this.f57998r;
        }
    }

    public final void d(int i7, boolean z10) {
        int i10 = this.f57992a;
        this.f57992a = i7;
        List list = f57991x;
        qh0 qh0Var = this.f57993b;
        if (i10 == i7) {
            nh0 animatedDrawable = qh0Var.getAnimatedDrawable();
            g1 g1Var = (g1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g1 g1Var2 = (g1) it.next();
                if (this.f57992a == g1Var2.f57917b) {
                    g1Var = g1Var2;
                    break;
                }
            }
            animatedDrawable.M(g1Var.d);
            animatedDrawable.P(g1Var.d);
            if (z10) {
                this.h.c(i7);
                return;
            }
            return;
        }
        g1 g1Var3 = (g1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            g1 g1Var4 = (g1) it2.next();
            if (i10 == g1Var4.f57916a && this.f57992a == g1Var4.f57917b) {
                g1Var3 = g1Var4;
                break;
            }
        }
        nh0 animatedDrawable2 = qh0Var.getAnimatedDrawable();
        animatedDrawable2.M(g1Var3.f57918c);
        animatedDrawable2.P(g1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i7);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == ks.F5 && (str = this.f58000w) != null) {
            setTypeface(str);
            this.f58000w = null;
        }
    }

    public final void e(int i7, boolean z10) {
        int i10;
        if (this.f57997n == i7) {
            return;
        }
        this.f57997n = i7;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    i10 = 2131232292;
                } else {
                    i10 = 2131232295;
                }
            } else {
                i10 = 2131232294;
            }
        } else {
            i10 = 2131232293;
        }
        ImageView imageView = this.f57994c;
        if (z10) {
            org.telegram.messenger.g0.P3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f57995e;
    }

    public zg getEmojiButton() {
        return null;
    }

    public i1 getTypefaceCell() {
        return this.f57996f;
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
        this.f57998r = getPaddingLeft();
        c(this.f57995e);
        c(this.f57993b);
        c(this.f57994c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        i1 i1Var = this.f57996f;
        i1Var.layout(measuredWidth - i1Var.getMeasuredWidth(), (getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (i1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            i1 i1Var = this.f57996f;
            if (childAt == i1Var) {
                i1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(h1 h1Var) {
        this.h = h1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.f58000w = str;
        i1 i1Var = this.f57996f;
        if (i1Var != null) {
            for (sg.a0 a0Var : sg.a0.c()) {
                if (a0Var.f57278a.equals(str)) {
                    i1Var.setTypeface(a0Var.d());
                    String str2 = a0Var.f57280c;
                    if (str2 == null) {
                        str2 = gd.O0(a0Var.f57279b);
                    }
                    i1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(o1 o1Var) {
    }
}
