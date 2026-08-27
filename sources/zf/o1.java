package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;

public final class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public static final List f50636w = Arrays.asList(new l1(0, 1, 20, 0), new l1(0, 2, 20, 40), new l1(1, 0, 0, 20), new l1(1, 2, 60, 40), new l1(2, 0, 40, 20), new l1(2, 1, 40, 60));

    public int f50637a;

    public final ri0 f50638b;

    public final ImageView f50639c;
    public final ImageView d;

    public final View f50640e;

    public final n1 f50641f;
    public m1 h;

    public int f50642n;

    public int f50643r;

    public int f50644s;
    public String v;

    public o1(Context context) {
        super(context);
        this.f50637a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f50640e = view;
        final int i10 = 0;
        view.setOnClickListener(new View.OnClickListener(this) {

            public final o1 f50484b;

            {
                this.f50484b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f50484b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.f50484b;
                        o1Var.d((o1Var.f50637a + 1) % 3, true);
                        break;
                    case 2:
                        this.f50484b.h.e();
                        break;
                    case 3:
                        this.f50484b.h.u();
                        break;
                    default:
                        this.f50484b.h.D();
                        break;
                }
            }
        });
        addView(view, z5.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ri0 ri0Var = new ri0(context);
        this.f50638b = ri0Var;
        ri0Var.f(R.raw.photo_text_allign, 24, 24, null);
        oi0 animatedDrawable = ri0Var.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        final int i11 = 1;
        ri0Var.setOnClickListener(new View.OnClickListener(this) {

            public final o1 f50484b;

            {
                this.f50484b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f50484b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.f50484b;
                        o1Var.d((o1Var.f50637a + 1) % 3, true);
                        break;
                    case 2:
                        this.f50484b.h.e();
                        break;
                    case 3:
                        this.f50484b.h.u();
                        break;
                    default:
                        this.f50484b.h.D();
                        break;
                }
            }
        });
        ri0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(ri0Var, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f50639c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        final int i12 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final o1 f50484b;

            {
                this.f50484b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f50484b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.f50484b;
                        o1Var.d((o1Var.f50637a + 1) % 3, true);
                        break;
                    case 2:
                        this.f50484b.h.e();
                        break;
                    case 3:
                        this.f50484b.h.u();
                        break;
                    default:
                        this.f50484b.h.D();
                        break;
                }
            }
        });
        addView(imageView, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(g6.f0(1090519039, 1, -1));
        final int i13 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final o1 f50484b;

            {
                this.f50484b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f50484b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.f50484b;
                        o1Var.d((o1Var.f50637a + 1) % 3, true);
                        break;
                    case 2:
                        this.f50484b.h.e();
                        break;
                    case 3:
                        this.f50484b.h.u();
                        break;
                    default:
                        this.f50484b.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView2, z5.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        n1 n1Var = new n1(context);
        this.f50641f = n1Var;
        n1Var.setCurrent(true);
        final int i14 = 4;
        n1Var.setOnClickListener(new View.OnClickListener(this) {

            public final o1 f50484b;

            {
                this.f50484b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f50484b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.f50484b;
                        o1Var.d((o1Var.f50637a + 1) % 3, true);
                        break;
                    case 2:
                        this.f50484b.h.e();
                        break;
                    case 3:
                        this.f50484b.h.u();
                        break;
                    default:
                        this.f50484b.h.D();
                        break;
                }
            }
        });
        addView(n1Var, z5.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f50644s != i10) {
            this.f50644s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        n1 n1Var = this.f50641f;
        rectF.set(AndroidUtilities.dp(8.0f) + n1Var.getLeft(), n1Var.getTop(), AndroidUtilities.dp(8.0f) + n1Var.getRight(), n1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f50643r + layoutParams.leftMargin;
            this.f50643r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f50643r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f50643r = layoutParams.width + layoutParams.rightMargin + this.f50643r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f50637a;
        this.f50637a = i10;
        List<l1> list = f50636w;
        ri0 ri0Var = this.f50638b;
        if (i11 == i10) {
            oi0 animatedDrawable = ri0Var.getAnimatedDrawable();
            l1 l1Var = (l1) list.get(0);
            for (l1 l1Var2 : list) {
                if (this.f50637a == l1Var2.f50544b) {
                    l1Var = l1Var2;
                    break;
                }
            }
            animatedDrawable.K(l1Var.d);
            animatedDrawable.N(l1Var.d);
            if (z10) {
                this.h.f(i10);
                return;
            }
            return;
        }
        l1 l1Var3 = (l1) list.get(0);
        for (l1 l1Var4 : list) {
            if (i11 == l1Var4.f50543a && this.f50637a == l1Var4.f50544b) {
                l1Var3 = l1Var4;
                break;
            }
        }
        oi0 animatedDrawable2 = ri0Var.getAnimatedDrawable();
        animatedDrawable2.K(l1Var3.f50545c);
        animatedDrawable2.N(l1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.f(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (str = this.v) == null) {
            return;
        }
        setTypeface(str);
        this.v = null;
    }

    public final void e(int i10, boolean z10) {
        int i11;
        if (this.f50642n == i10) {
            return;
        }
        this.f50642n = i10;
        if (i10 == 1) {
            i11 = R.drawable.msg_photo_text_framed2;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular;
        } else {
            i11 = R.drawable.msg_photo_text_framed3;
        }
        ImageView imageView = this.f50639c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.f50640e;
    }

    public mg getEmojiButton() {
        return null;
    }

    public n1 getTypefaceCell() {
        return this.f50641f;
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
        this.f50643r = getPaddingLeft();
        c(this.f50640e);
        c(this.f50638b);
        c(this.f50639c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        n1 n1Var = this.f50641f;
        n1Var.layout(measuredWidth - n1Var.getMeasuredWidth(), (getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (n1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            n1 n1Var = this.f50641f;
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
        n1 n1Var = this.f50641f;
        if (n1Var == null) {
            return;
        }
        for (yf.i0 i0Var : yf.i0.c()) {
            if (i0Var.f49948a.equals(str)) {
                n1Var.setTypeface(i0Var.d());
                String string = i0Var.f49950c;
                if (string == null) {
                    string = LocaleController.getString(i0Var.f49949b);
                }
                n1Var.setText(string);
                return;
            }
        }
    }

    public void setTypefaceListView(t1 t1Var) {
    }
}
