package sg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.yj0;
public final class p1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f48493w = Arrays.asList(new m1(0, 1, 20, 0), new m1(0, 2, 20, 40), new m1(1, 0, 0, 20), new m1(1, 2, 60, 40), new m1(2, 0, 40, 20), new m1(2, 1, 40, 60));
    public int f48494a;
    public final bk0 f48495b;
    public final ImageView f48496c;
    public final ImageView d;
    public final View e;
    public final o1 f48497f;
    public n1 h;
    public int f48498n;
    public int f48499r;
    public int f48500s;
    public String v;

    public p1(Context context) {
        super(context);
        this.f48494a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f48338b;

            {
                this.f48338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48338b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f48338b;
                        p1Var.d((p1Var.f48494a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48338b.h.c();
                        return;
                    case 3:
                        this.f48338b.h.u();
                        return;
                    default:
                        this.f48338b.h.C();
                        return;
                }
            }
        });
        addView(view, kb1.h(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f48495b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        yj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f48338b;

            {
                this.f48338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48338b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f48338b;
                        p1Var.d((p1Var.f48494a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48338b.h.c();
                        return;
                    case 3:
                        this.f48338b.h.u();
                        return;
                    default:
                        this.f48338b.h.C();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, kb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f48496c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f48338b;

            {
                this.f48338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48338b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f48338b;
                        p1Var.d((p1Var.f48494a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48338b.h.c();
                        return;
                    case 3:
                        this.f48338b.h.u();
                        return;
                    default:
                        this.f48338b.h.C();
                        return;
                }
            }
        });
        addView(imageView2, kb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(y6.g0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f48338b;

            {
                this.f48338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48338b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f48338b;
                        p1Var.d((p1Var.f48494a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48338b.h.c();
                        return;
                    case 3:
                        this.f48338b.h.u();
                        return;
                    default:
                        this.f48338b.h.C();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, kb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        o1 o1Var = new o1(context);
        this.f48497f = o1Var;
        o1Var.setCurrent(true);
        o1Var.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f48338b;

            {
                this.f48338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48338b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f48338b;
                        p1Var.d((p1Var.f48494a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48338b.h.c();
                        return;
                    case 3:
                        this.f48338b.h.u();
                        return;
                    default:
                        this.f48338b.h.C();
                        return;
                }
            }
        });
        addView(o1Var, kb1.s(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f48500s != i10) {
            this.f48500s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        o1 o1Var = this.f48497f;
        rectF.set(AndroidUtilities.dp(8.0f) + o1Var.getLeft(), o1Var.getTop(), AndroidUtilities.dp(8.0f) + o1Var.getRight(), o1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f48499r + layoutParams.leftMargin;
            this.f48499r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f48499r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f48499r = layoutParams.width + layoutParams.rightMargin + this.f48499r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f48494a;
        this.f48494a = i10;
        List list = f48493w;
        bk0 bk0Var = this.f48495b;
        if (i11 == i10) {
            yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
            m1 m1Var = (m1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m1 m1Var2 = (m1) it.next();
                if (this.f48494a == m1Var2.f48397b) {
                    m1Var = m1Var2;
                    break;
                }
            }
            animatedDrawable.M(m1Var.d);
            animatedDrawable.P(m1Var.d);
            if (z10) {
                this.h.d(i10);
                return;
            }
            return;
        }
        m1 m1Var3 = (m1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            m1 m1Var4 = (m1) it2.next();
            if (i11 == m1Var4.f48396a && this.f48494a == m1Var4.f48397b) {
                m1Var3 = m1Var4;
                break;
            }
        }
        yj0 animatedDrawable2 = bk0Var.getAnimatedDrawable();
        animatedDrawable2.M(m1Var3.f48398c);
        animatedDrawable2.P(m1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.d(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (str = this.v) != null) {
            setTypeface(str);
            this.v = null;
        }
    }

    public final void e(int i10, boolean z10) {
        int i11;
        if (this.f48498n == i10) {
            return;
        }
        this.f48498n = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    i11 = R.drawable.msg_photo_text_framed;
                } else {
                    i11 = R.drawable.msg_photo_text_regular;
                }
            } else {
                i11 = R.drawable.msg_photo_text_framed3;
            }
        } else {
            i11 = R.drawable.msg_photo_text_framed2;
        }
        ImageView imageView = this.f48496c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public ah getEmojiButton() {
        return null;
    }

    public o1 getTypefaceCell() {
        return this.f48497f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f48499r = getPaddingLeft();
        c(this.e);
        c(this.f48495b);
        c(this.f48496c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        o1 o1Var = this.f48497f;
        o1Var.layout(measuredWidth - o1Var.getMeasuredWidth(), (getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (o1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            o1 o1Var = this.f48497f;
            if (childAt == o1Var) {
                o1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i10) {
        d(i10, false);
    }

    public void setDelegate(n1 n1Var) {
        this.h = n1Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        o1 o1Var = this.f48497f;
        if (o1Var != null) {
            for (rg.j0 j0Var : rg.j0.c()) {
                if (j0Var.f47475a.equals(str)) {
                    o1Var.setTypeface(j0Var.d());
                    String str2 = j0Var.f47477c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(j0Var.f47476b);
                    }
                    o1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(u1 u1Var) {
    }
}
