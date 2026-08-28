package yf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;
public final class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f50046w = Arrays.asList(new l1(0, 1, 20, 0), new l1(0, 2, 20, 40), new l1(1, 0, 0, 20), new l1(1, 2, 60, 40), new l1(2, 0, 40, 20), new l1(2, 1, 40, 60));
    public int f50047a;
    public final pi0 f50048b;
    public final ImageView f50049c;
    public final ImageView d;
    public final View f50050e;
    public final n1 f50051f;
    public m1 h;
    public int f50052n;
    public int f50053r;
    public int f50054s;
    public String v;

    public o1(Context context) {
        super(context);
        this.f50047a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f50050e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f49905b;

            {
                this.f49905b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f49905b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f49905b;
                        o1Var.d((o1Var.f50047a + 1) % 3, true);
                        return;
                    case 2:
                        this.f49905b.h.e();
                        return;
                    case 3:
                        this.f49905b.h.u();
                        return;
                    default:
                        this.f49905b.h.D();
                        return;
                }
            }
        });
        addView(view, e6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f50048b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        mi0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f49905b;

            {
                this.f49905b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f49905b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f49905b;
                        o1Var.d((o1Var.f50047a + 1) % 3, true);
                        return;
                    case 2:
                        this.f49905b.h.e();
                        return;
                    case 3:
                        this.f49905b.h.u();
                        return;
                    default:
                        this.f49905b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f50049c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f49905b;

            {
                this.f49905b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f49905b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f49905b;
                        o1Var.d((o1Var.f50047a + 1) % 3, true);
                        return;
                    case 2:
                        this.f49905b.h.e();
                        return;
                    case 3:
                        this.f49905b.h.u();
                        return;
                    default:
                        this.f49905b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(f6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f49905b;

            {
                this.f49905b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f49905b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f49905b;
                        o1Var.d((o1Var.f50047a + 1) % 3, true);
                        return;
                    case 2:
                        this.f49905b.h.e();
                        return;
                    case 3:
                        this.f49905b.h.u();
                        return;
                    default:
                        this.f49905b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        n1 n1Var = new n1(context);
        this.f50051f = n1Var;
        n1Var.setCurrent(true);
        n1Var.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f49905b;

            {
                this.f49905b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f49905b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f49905b;
                        o1Var.d((o1Var.f50047a + 1) % 3, true);
                        return;
                    case 2:
                        this.f49905b.h.e();
                        return;
                    case 3:
                        this.f49905b.h.u();
                        return;
                    default:
                        this.f49905b.h.D();
                        return;
                }
            }
        });
        addView(n1Var, e6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i9) {
        if (i9 == 0) {
            i9 = R.drawable.msg_add;
        }
        if (this.f50054s != i9) {
            this.f50054s = i9;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i9);
        }
    }

    public final void b(RectF rectF) {
        n1 n1Var = this.f50051f;
        rectF.set(AndroidUtilities.dp(8.0f) + n1Var.getLeft(), n1Var.getTop(), AndroidUtilities.dp(8.0f) + n1Var.getRight(), n1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i9 = this.f50053r + layoutParams.leftMargin;
            this.f50053r = i9;
            view.layout(i9, (getMeasuredHeight() - layoutParams.height) / 2, this.f50053r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f50053r = layoutParams.width + layoutParams.rightMargin + this.f50053r;
        }
    }

    public final void d(int i9, boolean z10) {
        int i10 = this.f50047a;
        this.f50047a = i9;
        List list = f50046w;
        pi0 pi0Var = this.f50048b;
        if (i10 == i9) {
            mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
            l1 l1Var = (l1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l1 l1Var2 = (l1) it.next();
                if (this.f50047a == l1Var2.f49966b) {
                    l1Var = l1Var2;
                    break;
                }
            }
            animatedDrawable.K(l1Var.d);
            animatedDrawable.N(l1Var.d);
            if (z10) {
                this.h.f(i9);
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
            if (i10 == l1Var4.f49965a && this.f50047a == l1Var4.f49966b) {
                l1Var3 = l1Var4;
                break;
            }
        }
        mi0 animatedDrawable2 = pi0Var.getAnimatedDrawable();
        animatedDrawable2.K(l1Var3.f49967c);
        animatedDrawable2.N(l1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.f(i9);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        if (i9 == NotificationCenter.customTypefacesLoaded && (str = this.v) != null) {
            setTypeface(str);
            this.v = null;
        }
    }

    public final void e(int i9, boolean z10) {
        int i10;
        if (this.f50052n == i9) {
            return;
        }
        this.f50052n = i9;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    i10 = R.drawable.msg_photo_text_framed;
                } else {
                    i10 = R.drawable.msg_photo_text_regular;
                }
            } else {
                i10 = R.drawable.msg_photo_text_framed3;
            }
        } else {
            i10 = R.drawable.msg_photo_text_framed2;
        }
        ImageView imageView = this.f50049c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.f50050e;
    }

    public qg getEmojiButton() {
        return null;
    }

    public n1 getTypefaceCell() {
        return this.f50051f;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f50053r = getPaddingLeft();
        c(this.f50050e);
        c(this.f50048b);
        c(this.f50049c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        n1 n1Var = this.f50051f;
        n1Var.layout(measuredWidth - n1Var.getMeasuredWidth(), (getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (n1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            n1 n1Var = this.f50051f;
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

    public void setAlignment(int i9) {
        d(i9, false);
    }

    public void setDelegate(m1 m1Var) {
        this.h = m1Var;
    }

    public void setOutlineType(int i9) {
        e(i9, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        n1 n1Var = this.f50051f;
        if (n1Var != null) {
            for (xf.i0 i0Var : xf.i0.c()) {
                if (i0Var.f49240a.equals(str)) {
                    n1Var.setTypeface(i0Var.d());
                    String str2 = i0Var.f49242c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(i0Var.f49241b);
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
