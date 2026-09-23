package qg;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.yi0;
import w7.x5;
public final class r1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f41580w = Arrays.asList(new o1(0, 1, 20, 0), new o1(0, 2, 20, 40), new o1(1, 0, 0, 20), new o1(1, 2, 60, 40), new o1(2, 0, 40, 20), new o1(2, 1, 40, 60));
    public int f41581a;
    public final bj0 f41582b;
    public final ImageView f41583c;
    public final ImageView d;
    public final View e;
    public final q1 f41584f;
    public p1 h;
    public int f41585n;
    public int f41586r;
    public int f41587s;
    public String v;

    public r1(Context context) {
        super(context);
        this.f41581a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f41431b;

            {
                this.f41431b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41431b.h.a();
                        return;
                    case 1:
                        r1 r1Var = this.f41431b;
                        r1Var.d((r1Var.f41581a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41431b.h.f();
                        return;
                    case 3:
                        this.f41431b.h.t();
                        return;
                    default:
                        this.f41431b.h.D();
                        return;
                }
            }
        });
        addView(view, x5.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f41582b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        yi0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f41431b;

            {
                this.f41431b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41431b.h.a();
                        return;
                    case 1:
                        r1 r1Var = this.f41431b;
                        r1Var.d((r1Var.f41581a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41431b.h.f();
                        return;
                    case 3:
                        this.f41431b.h.t();
                        return;
                    default:
                        this.f41431b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, x5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f41583c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f41431b;

            {
                this.f41431b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41431b.h.a();
                        return;
                    case 1:
                        r1 r1Var = this.f41431b;
                        r1Var.d((r1Var.f41581a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41431b.h.f();
                        return;
                    case 3:
                        this.f41431b.h.t();
                        return;
                    default:
                        this.f41431b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, x5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(h6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f41431b;

            {
                this.f41431b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41431b.h.a();
                        return;
                    case 1:
                        r1 r1Var = this.f41431b;
                        r1Var.d((r1Var.f41581a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41431b.h.f();
                        return;
                    case 3:
                        this.f41431b.h.t();
                        return;
                    default:
                        this.f41431b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, x5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        q1 q1Var = new q1(context);
        this.f41584f = q1Var;
        q1Var.setCurrent(true);
        q1Var.setOnClickListener(new View.OnClickListener(this) {
            public final r1 f41431b;

            {
                this.f41431b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41431b.h.a();
                        return;
                    case 1:
                        r1 r1Var = this.f41431b;
                        r1Var.d((r1Var.f41581a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41431b.h.f();
                        return;
                    case 3:
                        this.f41431b.h.t();
                        return;
                    default:
                        this.f41431b.h.D();
                        return;
                }
            }
        });
        addView(q1Var, x5.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f41587s != i10) {
            this.f41587s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        q1 q1Var = this.f41584f;
        rectF.set(AndroidUtilities.dp(8.0f) + q1Var.getLeft(), q1Var.getTop(), AndroidUtilities.dp(8.0f) + q1Var.getRight(), q1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f41586r + layoutParams.leftMargin;
            this.f41586r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f41586r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f41586r = layoutParams.width + layoutParams.rightMargin + this.f41586r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f41581a;
        this.f41581a = i10;
        List list = f41580w;
        bj0 bj0Var = this.f41582b;
        if (i11 == i10) {
            yi0 animatedDrawable = bj0Var.getAnimatedDrawable();
            o1 o1Var = (o1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o1 o1Var2 = (o1) it.next();
                if (this.f41581a == o1Var2.f41459b) {
                    o1Var = o1Var2;
                    break;
                }
            }
            animatedDrawable.M(o1Var.d);
            animatedDrawable.P(o1Var.d);
            if (z10) {
                this.h.g(i10);
                return;
            }
            return;
        }
        o1 o1Var3 = (o1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            o1 o1Var4 = (o1) it2.next();
            if (i11 == o1Var4.f41458a && this.f41581a == o1Var4.f41459b) {
                o1Var3 = o1Var4;
                break;
            }
        }
        yi0 animatedDrawable2 = bj0Var.getAnimatedDrawable();
        animatedDrawable2.M(o1Var3.f41460c);
        animatedDrawable2.P(o1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.g(i10);
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
        if (this.f41585n == i10) {
            return;
        }
        this.f41585n = i10;
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
        ImageView imageView = this.f41583c;
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

    public q1 getTypefaceCell() {
        return this.f41584f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f41586r = getPaddingLeft();
        c(this.e);
        c(this.f41582b);
        c(this.f41583c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        q1 q1Var = this.f41584f;
        q1Var.layout(measuredWidth - q1Var.getMeasuredWidth(), (getMeasuredHeight() - q1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (q1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            q1 q1Var = this.f41584f;
            if (childAt == q1Var) {
                q1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(p1 p1Var) {
        this.h = p1Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        q1 q1Var = this.f41584f;
        if (q1Var != null) {
            for (pg.k0 k0Var : pg.k0.c()) {
                if (k0Var.f40841a.equals(str)) {
                    q1Var.setTypeface(k0Var.d());
                    String str2 = k0Var.f40843c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(k0Var.f40842b);
                    }
                    q1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(w1 w1Var) {
    }
}
