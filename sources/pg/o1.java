package pg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import w7.a6;
public final class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f40231w = Arrays.asList(new l1(0, 1, 20, 0), new l1(0, 2, 20, 40), new l1(1, 0, 0, 20), new l1(1, 2, 60, 40), new l1(2, 0, 40, 20), new l1(2, 1, 40, 60));
    public int f40232a;
    public final kj0 f40233b;
    public final ImageView f40234c;
    public final ImageView d;
    public final View e;
    public final n1 f40235f;
    public m1 h;
    public int f40236n;
    public int f40237r;
    public int f40238s;
    public String v;

    public o1(Context context) {
        super(context);
        this.f40232a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f40074b;

            {
                this.f40074b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f40074b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f40074b;
                        o1Var.d((o1Var.f40232a + 1) % 3, true);
                        return;
                    case 2:
                        this.f40074b.h.c();
                        return;
                    case 3:
                        this.f40074b.h.s();
                        return;
                    default:
                        this.f40074b.h.C();
                        return;
                }
            }
        });
        addView(view, a6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f40233b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        hj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f40074b;

            {
                this.f40074b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f40074b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f40074b;
                        o1Var.d((o1Var.f40232a + 1) % 3, true);
                        return;
                    case 2:
                        this.f40074b.h.c();
                        return;
                    case 3:
                        this.f40074b.h.s();
                        return;
                    default:
                        this.f40074b.h.C();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, a6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f40234c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f40074b;

            {
                this.f40074b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f40074b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f40074b;
                        o1Var.d((o1Var.f40232a + 1) % 3, true);
                        return;
                    case 2:
                        this.f40074b.h.c();
                        return;
                    case 3:
                        this.f40074b.h.s();
                        return;
                    default:
                        this.f40074b.h.C();
                        return;
                }
            }
        });
        addView(imageView2, a6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(j6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f40074b;

            {
                this.f40074b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f40074b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f40074b;
                        o1Var.d((o1Var.f40232a + 1) % 3, true);
                        return;
                    case 2:
                        this.f40074b.h.c();
                        return;
                    case 3:
                        this.f40074b.h.s();
                        return;
                    default:
                        this.f40074b.h.C();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, a6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        n1 n1Var = new n1(context);
        this.f40235f = n1Var;
        n1Var.setCurrent(true);
        n1Var.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f40074b;

            {
                this.f40074b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f40074b.h.a();
                        return;
                    case 1:
                        o1 o1Var = this.f40074b;
                        o1Var.d((o1Var.f40232a + 1) % 3, true);
                        return;
                    case 2:
                        this.f40074b.h.c();
                        return;
                    case 3:
                        this.f40074b.h.s();
                        return;
                    default:
                        this.f40074b.h.C();
                        return;
                }
            }
        });
        addView(n1Var, a6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f40238s != i10) {
            this.f40238s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        n1 n1Var = this.f40235f;
        rectF.set(AndroidUtilities.dp(8.0f) + n1Var.getLeft(), n1Var.getTop(), AndroidUtilities.dp(8.0f) + n1Var.getRight(), n1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f40237r + layoutParams.leftMargin;
            this.f40237r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f40237r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f40237r = layoutParams.width + layoutParams.rightMargin + this.f40237r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f40232a;
        this.f40232a = i10;
        List list = f40231w;
        kj0 kj0Var = this.f40233b;
        if (i11 == i10) {
            hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
            l1 l1Var = (l1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l1 l1Var2 = (l1) it.next();
                if (this.f40232a == l1Var2.f40101b) {
                    l1Var = l1Var2;
                    break;
                }
            }
            animatedDrawable.M(l1Var.d);
            animatedDrawable.P(l1Var.d);
            if (z10) {
                this.h.d(i10);
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
            if (i11 == l1Var4.f40100a && this.f40232a == l1Var4.f40101b) {
                l1Var3 = l1Var4;
                break;
            }
        }
        hj0 animatedDrawable2 = kj0Var.getAnimatedDrawable();
        animatedDrawable2.M(l1Var3.f40102c);
        animatedDrawable2.P(l1Var3.d);
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
        if (this.f40236n == i10) {
            return;
        }
        this.f40236n = i10;
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
        ImageView imageView = this.f40234c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public dh getEmojiButton() {
        return null;
    }

    public n1 getTypefaceCell() {
        return this.f40235f;
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
        this.f40237r = getPaddingLeft();
        c(this.e);
        c(this.f40233b);
        c(this.f40234c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        n1 n1Var = this.f40235f;
        n1Var.layout(measuredWidth - n1Var.getMeasuredWidth(), (getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (n1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            n1 n1Var = this.f40235f;
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
        n1 n1Var = this.f40235f;
        if (n1Var != null) {
            for (og.m0 m0Var : og.m0.c()) {
                if (m0Var.f14424a.equals(str)) {
                    n1Var.setTypeface(m0Var.d());
                    String str2 = m0Var.f14426c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(m0Var.f14425b);
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
