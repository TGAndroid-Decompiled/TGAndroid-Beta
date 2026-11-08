package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.zg0;
public final class e1 extends FrameLayout implements ls {
    public static final List f55638x = Arrays.asList(new b1(0, 1, 20, 0), new b1(0, 2, 20, 40), new b1(1, 0, 0, 20), new b1(1, 2, 60, 40), new b1(2, 0, 40, 20), new b1(2, 1, 40, 60));
    public int f55639a;
    public final ch0 f55640b;
    public final ImageView f55641c;
    public final ImageView d;
    public final View f55642e;
    public final d1 f55643f;
    public c1 h;
    public int f55644n;
    public int f55645r;
    public int f55646s;
    public String f55647w;

    public e1(Context context) {
        super(context);
        this.f55639a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f55642e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f55557b;

            {
                this.f55557b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f55557b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f55557b;
                        e1Var.d((e1Var.f55639a + 1) % 3, true);
                        return;
                    case 2:
                        this.f55557b.h.b();
                        return;
                    case 3:
                        this.f55557b.h.t();
                        return;
                    default:
                        this.f55557b.h.D();
                        return;
                }
            }
        });
        addView(view, ha.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f55640b = imageView;
        imageView.f(2131624133, 24, 24, null);
        zg0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f55557b;

            {
                this.f55557b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f55557b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f55557b;
                        e1Var.d((e1Var.f55639a + 1) % 3, true);
                        return;
                    case 2:
                        this.f55557b.h.b();
                        return;
                    case 3:
                        this.f55557b.h.t();
                        return;
                    default:
                        this.f55557b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView((View) imageView, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f55641c = imageView2;
        imageView2.setImageResource(2131232399);
        imageView2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f55557b;

            {
                this.f55557b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f55557b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f55557b;
                        e1Var.d((e1Var.f55639a + 1) % 3, true);
                        return;
                    case 2:
                        this.f55557b.h.b();
                        return;
                    case 3:
                        this.f55557b.h.t();
                        return;
                    default:
                        this.f55557b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232042);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(k6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f55557b;

            {
                this.f55557b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f55557b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f55557b;
                        e1Var.d((e1Var.f55639a + 1) % 3, true);
                        return;
                    case 2:
                        this.f55557b.h.b();
                        return;
                    case 3:
                        this.f55557b.h.t();
                        return;
                    default:
                        this.f55557b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView3, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        d1 d1Var = new d1(context);
        this.f55643f = d1Var;
        d1Var.setCurrent(true);
        d1Var.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f55557b;

            {
                this.f55557b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f55557b.h.a();
                        return;
                    case 1:
                        e1 e1Var = this.f55557b;
                        e1Var.d((e1Var.f55639a + 1) % 3, true);
                        return;
                    case 2:
                        this.f55557b.h.b();
                        return;
                    case 3:
                        this.f55557b.h.t();
                        return;
                    default:
                        this.f55557b.h.D();
                        return;
                }
            }
        });
        addView(d1Var, ha.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = 2131232042;
        }
        if (this.f55646s != i7) {
            this.f55646s = i7;
            org.telegram.messenger.g0.R3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        d1 d1Var = this.f55643f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + d1Var.getLeft(), d1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + d1Var.getRight(), d1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i7 = this.f55645r + layoutParams.leftMargin;
            this.f55645r = i7;
            view.layout(i7, (getMeasuredHeight() - layoutParams.height) / 2, this.f55645r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f55645r = layoutParams.width + layoutParams.rightMargin + this.f55645r;
        }
    }

    public final void d(int i7, boolean z9) {
        int i10 = this.f55639a;
        this.f55639a = i7;
        List list = f55638x;
        ch0 ch0Var = this.f55640b;
        if (i10 == i7) {
            zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
            b1 b1Var = (b1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b1 b1Var2 = (b1) it.next();
                if (this.f55639a == b1Var2.f55578b) {
                    b1Var = b1Var2;
                    break;
                }
            }
            animatedDrawable.M(b1Var.d);
            animatedDrawable.P(b1Var.d);
            if (z9) {
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
            if (i10 == b1Var4.f55577a && this.f55639a == b1Var4.f55578b) {
                b1Var3 = b1Var4;
                break;
            }
        }
        zg0 animatedDrawable2 = ch0Var.getAnimatedDrawable();
        animatedDrawable2.M(b1Var3.f55579c);
        animatedDrawable2.P(b1Var3.d);
        animatedDrawable2.start();
        if (z9) {
            this.h.c(i7);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == qs.C5 && (str = this.f55647w) != null) {
            setTypeface(str);
            this.f55647w = null;
        }
    }

    public final void e(int i7, boolean z9) {
        int i10;
        if (this.f55644n == i7) {
            return;
        }
        this.f55644n = i7;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
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
        ImageView imageView = this.f55641c;
        if (z9) {
            org.telegram.messenger.g0.R3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f55642e;
    }

    public jg getEmojiButton() {
        return null;
    }

    public d1 getTypefaceCell() {
        return this.f55643f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.C5);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f55645r = getPaddingLeft();
        c(this.f55642e);
        c(this.f55640b);
        c(this.f55641c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        d1 d1Var = this.f55643f;
        d1Var.layout(measuredWidth - d1Var.getMeasuredWidth(), (getMeasuredHeight() - d1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (d1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            d1 d1Var = this.f55643f;
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
        this.f55647w = str;
        d1 d1Var = this.f55643f;
        if (d1Var != null) {
            for (sg.b0 b0Var : sg.b0.c()) {
                if (b0Var.f55018a.equals(str)) {
                    d1Var.setTypeface(b0Var.d());
                    String str2 = b0Var.f55020c;
                    if (str2 == null) {
                        str2 = id.N0(b0Var.f55019b);
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
