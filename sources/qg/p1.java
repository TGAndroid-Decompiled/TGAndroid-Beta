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
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mj0;
import w7.y5;
public final class p1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f41883w = Arrays.asList(new m1(0, 1, 20, 0), new m1(0, 2, 20, 40), new m1(1, 0, 0, 20), new m1(1, 2, 60, 40), new m1(2, 0, 40, 20), new m1(2, 1, 40, 60));
    public int f41884a;
    public final mj0 f41885b;
    public final ImageView f41886c;
    public final ImageView d;
    public final View e;
    public final o1 f41887f;
    public n1 h;
    public int f41888n;
    public int f41889r;
    public int f41890s;
    public String v;

    public p1(Context context) {
        super(context);
        this.f41884a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41734b;

            {
                this.f41734b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41734b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f41734b;
                        p1Var.d((p1Var.f41884a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41734b.h.f();
                        return;
                    case 3:
                        this.f41734b.h.t();
                        return;
                    default:
                        this.f41734b.h.D();
                        return;
                }
            }
        });
        addView(view, y5.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f41885b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        jj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41734b;

            {
                this.f41734b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41734b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f41734b;
                        p1Var.d((p1Var.f41884a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41734b.h.f();
                        return;
                    case 3:
                        this.f41734b.h.t();
                        return;
                    default:
                        this.f41734b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, y5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f41886c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41734b;

            {
                this.f41734b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41734b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f41734b;
                        p1Var.d((p1Var.f41884a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41734b.h.f();
                        return;
                    case 3:
                        this.f41734b.h.t();
                        return;
                    default:
                        this.f41734b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, y5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(h6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41734b;

            {
                this.f41734b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41734b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f41734b;
                        p1Var.d((p1Var.f41884a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41734b.h.f();
                        return;
                    case 3:
                        this.f41734b.h.t();
                        return;
                    default:
                        this.f41734b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, y5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        o1 o1Var = new o1(context);
        this.f41887f = o1Var;
        o1Var.setCurrent(true);
        o1Var.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41734b;

            {
                this.f41734b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f41734b.h.a();
                        return;
                    case 1:
                        p1 p1Var = this.f41734b;
                        p1Var.d((p1Var.f41884a + 1) % 3, true);
                        return;
                    case 2:
                        this.f41734b.h.f();
                        return;
                    case 3:
                        this.f41734b.h.t();
                        return;
                    default:
                        this.f41734b.h.D();
                        return;
                }
            }
        });
        addView(o1Var, y5.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f41890s != i10) {
            this.f41890s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        o1 o1Var = this.f41887f;
        rectF.set(AndroidUtilities.dp(8.0f) + o1Var.getLeft(), o1Var.getTop(), AndroidUtilities.dp(8.0f) + o1Var.getRight(), o1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f41889r + layoutParams.leftMargin;
            this.f41889r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f41889r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f41889r = layoutParams.width + layoutParams.rightMargin + this.f41889r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f41884a;
        this.f41884a = i10;
        List list = f41883w;
        mj0 mj0Var = this.f41885b;
        if (i11 == i10) {
            jj0 animatedDrawable = mj0Var.getAnimatedDrawable();
            m1 m1Var = (m1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m1 m1Var2 = (m1) it.next();
                if (this.f41884a == m1Var2.f41762b) {
                    m1Var = m1Var2;
                    break;
                }
            }
            animatedDrawable.M(m1Var.d);
            animatedDrawable.P(m1Var.d);
            if (z10) {
                this.h.g(i10);
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
            if (i11 == m1Var4.f41761a && this.f41884a == m1Var4.f41762b) {
                m1Var3 = m1Var4;
                break;
            }
        }
        jj0 animatedDrawable2 = mj0Var.getAnimatedDrawable();
        animatedDrawable2.M(m1Var3.f41763c);
        animatedDrawable2.P(m1Var3.d);
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
        if (this.f41888n == i10) {
            return;
        }
        this.f41888n = i10;
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
        ImageView imageView = this.f41886c;
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

    public o1 getTypefaceCell() {
        return this.f41887f;
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
        this.f41889r = getPaddingLeft();
        c(this.e);
        c(this.f41885b);
        c(this.f41886c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        o1 o1Var = this.f41887f;
        o1Var.layout(measuredWidth - o1Var.getMeasuredWidth(), (getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (o1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            o1 o1Var = this.f41887f;
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
        o1 o1Var = this.f41887f;
        if (o1Var != null) {
            for (pg.k0 k0Var : pg.k0.c()) {
                if (k0Var.f41156a.equals(str)) {
                    o1Var.setTypeface(k0Var.d());
                    String str2 = k0Var.f41158c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(k0Var.f41157b);
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
