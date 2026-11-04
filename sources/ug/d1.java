package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;
public final class d1 extends FrameLayout implements cs {
    public static final List f55931x = Arrays.asList(new a1(0, 1, 20, 0), new a1(0, 2, 20, 40), new a1(1, 0, 0, 20), new a1(1, 2, 60, 40), new a1(2, 0, 40, 20), new a1(2, 1, 40, 60));
    public int f55932a;
    public final fh0 f55933b;
    public final ImageView f55934c;
    public final ImageView d;
    public final View f55935e;
    public final c1 f55936f;
    public b1 h;
    public int f55937n;
    public int f55938r;
    public int f55939s;
    public String f55940w;

    public d1(Context context) {
        super(context);
        this.f55932a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f55935e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f56319b;

            {
                this.f56319b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f56319b.h.a();
                        return;
                    case 1:
                        d1 d1Var = this.f56319b;
                        d1Var.d((d1Var.f55932a + 1) % 3, true);
                        return;
                    case 2:
                        this.f56319b.h.b();
                        return;
                    case 3:
                        this.f56319b.h.u();
                        return;
                    default:
                        this.f56319b.h.D();
                        return;
                }
            }
        });
        addView(view, mf.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f55933b = imageView;
        imageView.f(2131624133, 24, 24, null);
        ch0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f56319b;

            {
                this.f56319b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f56319b.h.a();
                        return;
                    case 1:
                        d1 d1Var = this.f56319b;
                        d1Var.d((d1Var.f55932a + 1) % 3, true);
                        return;
                    case 2:
                        this.f56319b.h.b();
                        return;
                    case 3:
                        this.f56319b.h.u();
                        return;
                    default:
                        this.f56319b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView((View) imageView, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f55934c = imageView2;
        imageView2.setImageResource(2131232399);
        imageView2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f56319b;

            {
                this.f56319b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f56319b.h.a();
                        return;
                    case 1:
                        d1 d1Var = this.f56319b;
                        d1Var.d((d1Var.f55932a + 1) % 3, true);
                        return;
                    case 2:
                        this.f56319b.h.b();
                        return;
                    case 3:
                        this.f56319b.h.u();
                        return;
                    default:
                        this.f56319b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232042);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(k6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f56319b;

            {
                this.f56319b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f56319b.h.a();
                        return;
                    case 1:
                        d1 d1Var = this.f56319b;
                        d1Var.d((d1Var.f55932a + 1) % 3, true);
                        return;
                    case 2:
                        this.f56319b.h.b();
                        return;
                    case 3:
                        this.f56319b.h.u();
                        return;
                    default:
                        this.f56319b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView3, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        c1 c1Var = new c1(context);
        this.f55936f = c1Var;
        c1Var.setCurrent(true);
        c1Var.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f56319b;

            {
                this.f56319b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f56319b.h.a();
                        return;
                    case 1:
                        d1 d1Var = this.f56319b;
                        d1Var.d((d1Var.f55932a + 1) % 3, true);
                        return;
                    case 2:
                        this.f56319b.h.b();
                        return;
                    case 3:
                        this.f56319b.h.u();
                        return;
                    default:
                        this.f56319b.h.D();
                        return;
                }
            }
        });
        addView(c1Var, mf.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i3) {
        if (i3 == 0) {
            i3 = 2131232042;
        }
        if (this.f55939s != i3) {
            this.f55939s = i3;
            org.telegram.messenger.g0.R3(this.d, i3);
        }
    }

    public final void b(RectF rectF) {
        c1 c1Var = this.f55936f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + c1Var.getLeft(), c1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + c1Var.getRight(), c1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = this.f55938r + layoutParams.leftMargin;
            this.f55938r = i3;
            view.layout(i3, (getMeasuredHeight() - layoutParams.height) / 2, this.f55938r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f55938r = layoutParams.width + layoutParams.rightMargin + this.f55938r;
        }
    }

    public final void d(int i3, boolean z10) {
        int i10 = this.f55932a;
        this.f55932a = i3;
        List list = f55931x;
        fh0 fh0Var = this.f55933b;
        if (i10 == i3) {
            ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
            a1 a1Var = (a1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a1 a1Var2 = (a1) it.next();
                if (this.f55932a == a1Var2.f55861b) {
                    a1Var = a1Var2;
                    break;
                }
            }
            animatedDrawable.M(a1Var.d);
            animatedDrawable.P(a1Var.d);
            if (z10) {
                this.h.c(i3);
                return;
            }
            return;
        }
        a1 a1Var3 = (a1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            a1 a1Var4 = (a1) it2.next();
            if (i10 == a1Var4.f55860a && this.f55932a == a1Var4.f55861b) {
                a1Var3 = a1Var4;
                break;
            }
        }
        ch0 animatedDrawable2 = fh0Var.getAnimatedDrawable();
        animatedDrawable2.M(a1Var3.f55862c);
        animatedDrawable2.P(a1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i3);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        if (i3 == hs.C5 && (str = this.f55940w) != null) {
            setTypeface(str);
            this.f55940w = null;
        }
    }

    public final void e(int i3, boolean z10) {
        int i10;
        if (this.f55937n == i3) {
            return;
        }
        this.f55937n = i3;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    i10 = 2131232287;
                } else {
                    i10 = 2131232290;
                }
            } else {
                i10 = 2131232289;
            }
        } else {
            i10 = 2131232288;
        }
        ImageView imageView = this.f55934c;
        if (z10) {
            org.telegram.messenger.g0.R3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f55935e;
    }

    public hg getEmojiButton() {
        return null;
    }

    public c1 getTypefaceCell() {
        return this.f55936f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f55938r = getPaddingLeft();
        c(this.f55935e);
        c(this.f55933b);
        c(this.f55934c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        c1 c1Var = this.f55936f;
        c1Var.layout(measuredWidth - c1Var.getMeasuredWidth(), (getMeasuredHeight() - c1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (c1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            c1 c1Var = this.f55936f;
            if (childAt == c1Var) {
                c1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i3) {
        d(i3, false);
    }

    public void setDelegate(b1 b1Var) {
        this.h = b1Var;
    }

    public void setOutlineType(int i3) {
        e(i3, false);
    }

    public void setTypeface(String str) {
        this.f55940w = str;
        c1 c1Var = this.f55936f;
        if (c1Var != null) {
            for (tg.b0 b0Var : tg.b0.c()) {
                if (b0Var.f55128a.equals(str)) {
                    c1Var.setTypeface(b0Var.d());
                    String str2 = b0Var.f55130c;
                    if (str2 == null) {
                        str2 = bd.N0(b0Var.f55129b);
                    }
                    c1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(i1 i1Var) {
    }
}
