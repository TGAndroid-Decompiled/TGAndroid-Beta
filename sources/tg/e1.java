package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.pg;
public final class e1 extends FrameLayout implements is {
    public static final List f57212x = Arrays.asList(new b1(0, 1, 20, 0), new b1(0, 2, 20, 40), new b1(1, 0, 0, 20), new b1(1, 2, 60, 40), new b1(2, 0, 40, 20), new b1(2, 1, 40, 60));
    public int f57213a;
    public final fh0 f57214b;
    public final ImageView f57215c;
    public final ImageView d;
    public final View f57216e;
    public final d1 f57217f;
    public c1 h;
    public int f57218n;
    public int f57219r;
    public int f57220s;
    public String f57221w;

    public e1(Context context) {
        super(context);
        this.f57213a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f57216e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f57151b;

            {
                this.f57151b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57151b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f57151b;
                        e1Var.d((e1Var.f57213a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57151b.h.b();
                        return;
                    case 3:
                        this.f57151b.h.t();
                        return;
                    default:
                        this.f57151b.h.D();
                        return;
                }
            }
        });
        addView(view, ja.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f57214b = imageView;
        imageView.f(2131624134, 24, 24, null);
        ch0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f57151b;

            {
                this.f57151b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57151b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f57151b;
                        e1Var.d((e1Var.f57213a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57151b.h.b();
                        return;
                    case 3:
                        this.f57151b.h.t();
                        return;
                    default:
                        this.f57151b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView((View) imageView, ja.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f57215c = imageView2;
        imageView2.setImageResource(2131232400);
        imageView2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f57151b;

            {
                this.f57151b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57151b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f57151b;
                        e1Var.d((e1Var.f57213a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57151b.h.b();
                        return;
                    case 3:
                        this.f57151b.h.t();
                        return;
                    default:
                        this.f57151b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, ja.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232043);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(j6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f57151b;

            {
                this.f57151b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57151b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f57151b;
                        e1Var.d((e1Var.f57213a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57151b.h.b();
                        return;
                    case 3:
                        this.f57151b.h.t();
                        return;
                    default:
                        this.f57151b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView3, ja.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        d1 d1Var = new d1(context);
        this.f57217f = d1Var;
        d1Var.setCurrent(true);
        d1Var.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f57151b;

            {
                this.f57151b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f57151b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f57151b;
                        e1Var.d((e1Var.f57213a + 1) % 3, true);
                        return;
                    case 2:
                        this.f57151b.h.b();
                        return;
                    case 3:
                        this.f57151b.h.t();
                        return;
                    default:
                        this.f57151b.h.D();
                        return;
                }
            }
        });
        addView(d1Var, ja.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = 2131232043;
        }
        if (this.f57220s != i7) {
            this.f57220s = i7;
            org.telegram.messenger.g0.Q3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        d1 d1Var = this.f57217f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + d1Var.getLeft(), d1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + d1Var.getRight(), d1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i7 = this.f57219r + layoutParams.leftMargin;
            this.f57219r = i7;
            view.layout(i7, (getMeasuredHeight() - layoutParams.height) / 2, this.f57219r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f57219r = layoutParams.width + layoutParams.rightMargin + this.f57219r;
        }
    }

    public final void d(int i7, boolean z10) {
        int i10 = this.f57213a;
        this.f57213a = i7;
        List list = f57212x;
        fh0 fh0Var = this.f57214b;
        if (i10 == i7) {
            ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
            b1 b1Var = (b1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b1 b1Var2 = (b1) it.next();
                if (this.f57213a == b1Var2.f57155b) {
                    b1Var = b1Var2;
                    break;
                }
            }
            animatedDrawable.M(b1Var.d);
            animatedDrawable.P(b1Var.d);
            if (z10) {
                this.h.c(i7);
                return;
            }
            return;
        }
        b1 b1Var3 = (b1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b1 b1Var4 = (b1) it2.next();
            if (i10 == b1Var4.f57154a && this.f57213a == b1Var4.f57155b) {
                b1Var3 = b1Var4;
                break;
            }
        }
        ch0 animatedDrawable2 = fh0Var.getAnimatedDrawable();
        animatedDrawable2.M(b1Var3.f57156c);
        animatedDrawable2.P(b1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i7);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == ns.C5 && (str = this.f57221w) != null) {
            setTypeface(str);
            this.f57221w = null;
        }
    }

    public final void e(int i7, boolean z10) {
        int i10;
        if (this.f57218n == i7) {
            return;
        }
        this.f57218n = i7;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    i10 = 2131232288;
                } else {
                    i10 = 2131232291;
                }
            } else {
                i10 = 2131232290;
            }
        } else {
            i10 = 2131232289;
        }
        ImageView imageView = this.f57215c;
        if (z10) {
            org.telegram.messenger.g0.Q3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f57216e;
    }

    public pg getEmojiButton() {
        return null;
    }

    public d1 getTypefaceCell() {
        return this.f57217f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.e().c(this, ns.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f57219r = getPaddingLeft();
        c(this.f57216e);
        c(this.f57214b);
        c(this.f57215c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        d1 d1Var = this.f57217f;
        d1Var.layout(measuredWidth - d1Var.getMeasuredWidth(), (getMeasuredHeight() - d1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (d1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            d1 d1Var = this.f57217f;
            if (childAt == d1Var) {
                d1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(c1 c1Var) {
        this.h = c1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.f57221w = str;
        d1 d1Var = this.f57217f;
        if (d1Var != null) {
            for (sg.a0 a0Var : sg.a0.c()) {
                if (a0Var.f56580a.equals(str)) {
                    d1Var.setTypeface(a0Var.d());
                    String str2 = a0Var.f56582c;
                    if (str2 == null) {
                        str2 = hd.N0(a0Var.f56581b);
                    }
                    d1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(j1 j1Var) {
    }
}
