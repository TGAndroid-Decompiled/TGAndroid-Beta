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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xj0;
public final class q1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f48466w = Arrays.asList(new n1(0, 1, 20, 0), new n1(0, 2, 20, 40), new n1(1, 0, 0, 20), new n1(1, 2, 60, 40), new n1(2, 0, 40, 20), new n1(2, 1, 40, 60));
    public int f48467a;
    public final ak0 f48468b;
    public final ImageView f48469c;
    public final ImageView d;
    public final View e;
    public final p1 f48470f;
    public o1 h;
    public int f48471n;
    public int f48472r;
    public int f48473s;
    public String v;

    public q1(Context context) {
        super(context);
        this.f48467a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f48312b;

            {
                this.f48312b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48312b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f48312b;
                        q1Var.d((q1Var.f48467a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48312b.h.c();
                        return;
                    case 3:
                        this.f48312b.h.u();
                        return;
                    default:
                        this.f48312b.h.C();
                        return;
                }
            }
        });
        addView(view, gb1.h(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f48468b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        xj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f48312b;

            {
                this.f48312b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48312b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f48312b;
                        q1Var.d((q1Var.f48467a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48312b.h.c();
                        return;
                    case 3:
                        this.f48312b.h.u();
                        return;
                    default:
                        this.f48312b.h.C();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, gb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f48469c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f48312b;

            {
                this.f48312b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48312b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f48312b;
                        q1Var.d((q1Var.f48467a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48312b.h.c();
                        return;
                    case 3:
                        this.f48312b.h.u();
                        return;
                    default:
                        this.f48312b.h.C();
                        return;
                }
            }
        });
        addView(imageView2, gb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(y6.g0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f48312b;

            {
                this.f48312b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48312b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f48312b;
                        q1Var.d((q1Var.f48467a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48312b.h.c();
                        return;
                    case 3:
                        this.f48312b.h.u();
                        return;
                    default:
                        this.f48312b.h.C();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, gb1.h(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        p1 p1Var = new p1(context);
        this.f48470f = p1Var;
        p1Var.setCurrent(true);
        p1Var.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f48312b;

            {
                this.f48312b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48312b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f48312b;
                        q1Var.d((q1Var.f48467a + 1) % 3, true);
                        return;
                    case 2:
                        this.f48312b.h.c();
                        return;
                    case 3:
                        this.f48312b.h.u();
                        return;
                    default:
                        this.f48312b.h.C();
                        return;
                }
            }
        });
        addView(p1Var, gb1.s(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f48473s != i10) {
            this.f48473s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        p1 p1Var = this.f48470f;
        rectF.set(AndroidUtilities.dp(8.0f) + p1Var.getLeft(), p1Var.getTop(), AndroidUtilities.dp(8.0f) + p1Var.getRight(), p1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f48472r + layoutParams.leftMargin;
            this.f48472r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f48472r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f48472r = layoutParams.width + layoutParams.rightMargin + this.f48472r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f48467a;
        this.f48467a = i10;
        List list = f48466w;
        ak0 ak0Var = this.f48468b;
        if (i11 == i10) {
            xj0 animatedDrawable = ak0Var.getAnimatedDrawable();
            n1 n1Var = (n1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n1 n1Var2 = (n1) it.next();
                if (this.f48467a == n1Var2.f48371b) {
                    n1Var = n1Var2;
                    break;
                }
            }
            animatedDrawable.M(n1Var.d);
            animatedDrawable.P(n1Var.d);
            if (z10) {
                this.h.d(i10);
                return;
            }
            return;
        }
        n1 n1Var3 = (n1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            n1 n1Var4 = (n1) it2.next();
            if (i11 == n1Var4.f48370a && this.f48467a == n1Var4.f48371b) {
                n1Var3 = n1Var4;
                break;
            }
        }
        xj0 animatedDrawable2 = ak0Var.getAnimatedDrawable();
        animatedDrawable2.M(n1Var3.f48372c);
        animatedDrawable2.P(n1Var3.d);
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
        if (this.f48471n == i10) {
            return;
        }
        this.f48471n = i10;
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
        ImageView imageView = this.f48469c;
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

    public p1 getTypefaceCell() {
        return this.f48470f;
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
        this.f48472r = getPaddingLeft();
        c(this.e);
        c(this.f48468b);
        c(this.f48469c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        p1 p1Var = this.f48470f;
        p1Var.layout(measuredWidth - p1Var.getMeasuredWidth(), (getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (p1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            p1 p1Var = this.f48470f;
            if (childAt == p1Var) {
                p1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(o1 o1Var) {
        this.h = o1Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        p1 p1Var = this.f48470f;
        if (p1Var != null) {
            for (rg.j0 j0Var : rg.j0.c()) {
                if (j0Var.f47440a.equals(str)) {
                    p1Var.setTypeface(j0Var.d());
                    String str2 = j0Var.f47442c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(j0Var.f47441b);
                    }
                    p1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(v1 v1Var) {
    }
}
