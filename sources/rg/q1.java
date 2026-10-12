package rg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.yj0;
import w7.a6;
public final class q1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f44508w = Arrays.asList(new n1(0, 1, 20, 0), new n1(0, 2, 20, 40), new n1(1, 0, 0, 20), new n1(1, 2, 60, 40), new n1(2, 0, 40, 20), new n1(2, 1, 40, 60));
    public int f44509a;
    public final bk0 f44510b;
    public final ImageView f44511c;
    public final ImageView d;
    public final View e;
    public final p1 f44512f;
    public o1 h;
    public int f44513n;
    public int f44514r;
    public int f44515s;
    public String v;

    public q1(Context context) {
        super(context);
        this.f44509a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44351b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f44351b;
                        q1Var.d((q1Var.f44509a + 1) % 3, true);
                        return;
                    case 2:
                        this.f44351b.h.c();
                        return;
                    case 3:
                        this.f44351b.h.t();
                        return;
                    default:
                        this.f44351b.h.D();
                        return;
                }
            }
        });
        addView(view, a6.a(24.0f, 0.0f, 0.0f, 16.0f, 0.0f, 24, 48));
        ?? imageView = new ImageView(context);
        this.f44510b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        yj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44351b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f44351b;
                        q1Var.d((q1Var.f44509a + 1) % 3, true);
                        return;
                    case 2:
                        this.f44351b.h.c();
                        return;
                    case 3:
                        this.f44351b.h.t();
                        return;
                    default:
                        this.f44351b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, a6.a(28.0f, 0.0f, 0.0f, 16.0f, 0.0f, 28, 16));
        ImageView imageView2 = new ImageView(context);
        this.f44511c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44351b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f44351b;
                        q1Var.d((q1Var.f44509a + 1) % 3, true);
                        return;
                    case 2:
                        this.f44351b.h.c();
                        return;
                    case 3:
                        this.f44351b.h.t();
                        return;
                    default:
                        this.f44351b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, a6.a(28.0f, 0.0f, 0.0f, 16.0f, 0.0f, 28, 16));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(g6.g0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44351b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f44351b;
                        q1Var.d((q1Var.f44509a + 1) % 3, true);
                        return;
                    case 2:
                        this.f44351b.h.c();
                        return;
                    case 3:
                        this.f44351b.h.t();
                        return;
                    default:
                        this.f44351b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, a6.a(28.0f, 0.0f, 0.0f, 16.0f, 0.0f, 28, 16));
        p1 p1Var = new p1(context);
        this.f44512f = p1Var;
        p1Var.setCurrent(true);
        p1Var.setOnClickListener(new View.OnClickListener(this) {
            public final q1 f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44351b.h.a();
                        return;
                    case 1:
                        q1 q1Var = this.f44351b;
                        q1Var.d((q1Var.f44509a + 1) % 3, true);
                        return;
                    case 2:
                        this.f44351b.h.c();
                        return;
                    case 3:
                        this.f44351b.h.t();
                        return;
                    default:
                        this.f44351b.h.D();
                        return;
                }
            }
        });
        addView(p1Var, a6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f44515s != i10) {
            this.f44515s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        p1 p1Var = this.f44512f;
        rectF.set(AndroidUtilities.dp(8.0f) + p1Var.getLeft(), p1Var.getTop(), AndroidUtilities.dp(8.0f) + p1Var.getRight(), p1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f44514r + layoutParams.leftMargin;
            this.f44514r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f44514r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f44514r = layoutParams.width + layoutParams.rightMargin + this.f44514r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f44509a;
        this.f44509a = i10;
        List list = f44508w;
        bk0 bk0Var = this.f44510b;
        if (i11 == i10) {
            yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
            n1 n1Var = (n1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n1 n1Var2 = (n1) it.next();
                if (this.f44509a == n1Var2.f44378b) {
                    n1Var = n1Var2;
                    break;
                }
            }
            animatedDrawable.M(n1Var.d);
            animatedDrawable.P(n1Var.d);
            if (z10) {
                this.h.e(i10);
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
            if (i11 == n1Var4.f44377a && this.f44509a == n1Var4.f44378b) {
                n1Var3 = n1Var4;
                break;
            }
        }
        yj0 animatedDrawable2 = bk0Var.getAnimatedDrawable();
        animatedDrawable2.M(n1Var3.f44379c);
        animatedDrawable2.P(n1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.e(i10);
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
        if (this.f44513n == i10) {
            return;
        }
        this.f44513n = i10;
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
        ImageView imageView = this.f44511c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public bh getEmojiButton() {
        return null;
    }

    public p1 getTypefaceCell() {
        return this.f44512f;
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
        this.f44514r = getPaddingLeft();
        c(this.e);
        c(this.f44510b);
        c(this.f44511c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        p1 p1Var = this.f44512f;
        p1Var.layout(measuredWidth - p1Var.getMeasuredWidth(), (getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (p1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            p1 p1Var = this.f44512f;
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
        p1 p1Var = this.f44512f;
        if (p1Var != null) {
            for (qg.j0 j0Var : qg.j0.c()) {
                if (j0Var.f43460a.equals(str)) {
                    p1Var.setTypeface(j0Var.d());
                    String str2 = j0Var.f43462c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(j0Var.f43461b);
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
