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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nj0;
import w7.z5;
public final class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f45282w = Arrays.asList(new l1(0, 1, 20, 0), new l1(0, 2, 20, 40), new l1(1, 0, 0, 20), new l1(1, 2, 60, 40), new l1(2, 0, 40, 20), new l1(2, 1, 40, 60));
    public int f45283a;
    public final nj0 f45284b;
    public final ImageView f45285c;
    public final ImageView d;
    public final View f45286e;
    public final n1 f45287f;
    public m1 h;
    public int f45288n;
    public int f45289r;
    public int f45290s;
    public String v;

    public o1(Context context) {
        super(context);
        this.f45283a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f45286e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f45118b;

            {
                this.f45118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f45118b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f45118b;
                        o1Var.d((o1Var.f45283a + 1) % 3, true);
                        return;
                    case 2:
                        this.f45118b.h.d();
                        return;
                    case 3:
                        this.f45118b.h.u();
                        return;
                    default:
                        this.f45118b.h.E();
                        return;
                }
            }
        });
        addView(view, z5.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f45284b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        kj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f45118b;

            {
                this.f45118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f45118b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f45118b;
                        o1Var.d((o1Var.f45283a + 1) % 3, true);
                        return;
                    case 2:
                        this.f45118b.h.d();
                        return;
                    case 3:
                        this.f45118b.h.u();
                        return;
                    default:
                        this.f45118b.h.E();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f45285c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f45118b;

            {
                this.f45118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f45118b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f45118b;
                        o1Var.d((o1Var.f45283a + 1) % 3, true);
                        return;
                    case 2:
                        this.f45118b.h.d();
                        return;
                    case 3:
                        this.f45118b.h.u();
                        return;
                    default:
                        this.f45118b.h.E();
                        return;
                }
            }
        });
        addView(imageView2, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(i6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f45118b;

            {
                this.f45118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f45118b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f45118b;
                        o1Var.d((o1Var.f45283a + 1) % 3, true);
                        return;
                    case 2:
                        this.f45118b.h.d();
                        return;
                    case 3:
                        this.f45118b.h.u();
                        return;
                    default:
                        this.f45118b.h.E();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        n1 n1Var = new n1(context);
        this.f45287f = n1Var;
        n1Var.setCurrent(true);
        n1Var.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f45118b;

            {
                this.f45118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f45118b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f45118b;
                        o1Var.d((o1Var.f45283a + 1) % 3, true);
                        return;
                    case 2:
                        this.f45118b.h.d();
                        return;
                    case 3:
                        this.f45118b.h.u();
                        return;
                    default:
                        this.f45118b.h.E();
                        return;
                }
            }
        });
        addView(n1Var, z5.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f45290s != i10) {
            this.f45290s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        n1 n1Var = this.f45287f;
        rectF.set(AndroidUtilities.dp(8.0f) + n1Var.getLeft(), n1Var.getTop(), AndroidUtilities.dp(8.0f) + n1Var.getRight(), n1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f45289r + layoutParams.leftMargin;
            this.f45289r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f45289r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f45289r = layoutParams.width + layoutParams.rightMargin + this.f45289r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f45283a;
        this.f45283a = i10;
        List list = f45282w;
        nj0 nj0Var = this.f45284b;
        if (i11 == i10) {
            kj0 animatedDrawable = nj0Var.getAnimatedDrawable();
            l1 l1Var = (l1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l1 l1Var2 = (l1) it.next();
                if (this.f45283a == l1Var2.f45147b) {
                    l1Var = l1Var2;
                    break;
                }
            }
            animatedDrawable.M(l1Var.d);
            animatedDrawable.P(l1Var.d);
            if (z10) {
                this.h.f(i10);
                return;
            }
            return;
        }
        l1 l1Var3 = (l1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            l1 l1Var4 = (l1) it2.next();
            if (i11 == l1Var4.f45146a && this.f45283a == l1Var4.f45147b) {
                l1Var3 = l1Var4;
                break;
            }
        }
        kj0 animatedDrawable2 = nj0Var.getAnimatedDrawable();
        animatedDrawable2.M(l1Var3.f45148c);
        animatedDrawable2.P(l1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.f(i10);
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
        if (this.f45288n == i10) {
            return;
        }
        this.f45288n = i10;
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
        ImageView imageView = this.f45285c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.f45286e;
    }

    public ch getEmojiButton() {
        return null;
    }

    public n1 getTypefaceCell() {
        return this.f45287f;
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
        this.f45289r = getPaddingLeft();
        c(this.f45286e);
        c(this.f45284b);
        c(this.f45285c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        n1 n1Var = this.f45287f;
        n1Var.layout(measuredWidth - n1Var.getMeasuredWidth(), (getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (n1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            n1 n1Var = this.f45287f;
            if (childAt == n1Var) {
                n1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(m1 m1Var) {
        this.h = m1Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        n1 n1Var = this.f45287f;
        if (n1Var != null) {
            for (pg.k0 k0Var : pg.k0.c()) {
                if (k0Var.f44528a.equals(str)) {
                    n1Var.setTypeface(k0Var.d());
                    String str2 = k0Var.f44530c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(k0Var.f44529b);
                    }
                    n1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(t1 t1Var) {
    }
}
