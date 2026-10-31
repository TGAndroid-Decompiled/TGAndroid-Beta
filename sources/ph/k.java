package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k7;
import w7.b6;
public final class k extends FrameLayout {
    public final int f45141a;
    public Object f45142b;
    public Object f45143c;

    public k(sg.b0 b0Var, Context context) {
        super(context);
        this.f45141a = 4;
        this.f45143c = b0Var;
        this.f45142b = new k7(this, 7);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f45142b;
        if (z10) {
            org.telegram.messenger.i0.Q3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f45143c).setText(charSequence);
        requestLayout();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f45141a) {
            case 4:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    sg.b0 b0Var = (sg.b0) this.f45143c;
                    if (!b0Var.f48282k) {
                        return true;
                    }
                    b0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f45141a) {
            case 4:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f7;
        switch (this.f45141a) {
            case 5:
                Path path = (Path) this.f45142b;
                vh.z3 z3Var = (vh.z3) this.f45143c;
                if (z3Var.h != null && (((z10 = z3Var.f52248f) && view == z3Var.d) || (!z10 && view == z3Var.f52247c))) {
                    if (z10) {
                        f7 = z3Var.e;
                    } else {
                        f7 = 1.0f - z3Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f45141a) {
            case 4:
                sg.b0 b0Var = (sg.b0) this.f45143c;
                float f7 = b0Var.f48292u;
                float f10 = rect.bottom;
                if (f7 != f10 && b0Var.v) {
                    b0Var.f48292u = f10;
                    k kVar = b0Var.f48277c;
                    sg.a0 a0Var = b0Var.f48275a;
                    if (!b0Var.f48288q) {
                        float f11 = b0Var.f48291t;
                        int L = org.telegram.messenger.i0.L(32.0f);
                        int i10 = b0Var.f48295y;
                        if (i10 == 1 || i10 == 2) {
                            L = org.telegram.messenger.i0.L(24.0f);
                        }
                        float f12 = L;
                        if (a0Var.getMeasuredHeight() + f11 > (kVar.getMeasuredHeight() - b0Var.f48292u) - f12) {
                            f11 = ((kVar.getMeasuredHeight() - b0Var.f48292u) - a0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        a0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new sg.u(b0Var, 1)).setInterpolator(gr.f26495f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f45141a) {
            case 3:
                super.onAttachedToWindow();
                ((sg.k) this.f45142b).c();
                return;
            case 4:
                super.onAttachedToWindow();
                setTag(2131296351, (k7) this.f45142b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f45141a) {
            case 3:
                super.onDetachedFromWindow();
                ((sg.k) this.f45142b).d();
                return;
            case 4:
                super.onDetachedFromWindow();
                setTag(2131296351, null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float f7;
        boolean z11;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float f12;
        int L;
        switch (this.f45141a) {
            case 2:
                float f13 = 8.0f;
                int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(8.0f);
                TextView textView = (TextView) this.f45143c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f14 = size;
                    if (measureText > f14) {
                        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                if (textPaint.measureText(split[i14]) > f14) {
                                    staticLayout = null;
                                    z10 = true;
                                    f12 = 12.0f;
                                    i12 = 2;
                                } else {
                                    i14++;
                                }
                            } else {
                                f12 = 12.0f;
                                z10 = true;
                                i12 = 2;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i12) {
                            i13 = i12;
                            f7 = 11.0f;
                        } else {
                            f7 = Math.max(8.0f, (f14 * f12) / measureText);
                            i13 = z10 ? 1 : 0;
                        }
                    } else {
                        z10 = true;
                        i12 = 2;
                        i13 = 1;
                        f7 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f7);
                    textView.setMaxLines(i13);
                    if (i13 == z10) {
                        z11 = z10 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    textView.setSingleLine(z11);
                    if (i13 == i12) {
                        f10 = 0.85f;
                    } else {
                        f10 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f10);
                    if (i13 == i12) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    if (i13 == i12) {
                        f11 = 29.0f;
                    } else {
                        f11 = 35.0f;
                    }
                    layoutParams.topMargin = org.telegram.messenger.i0.L(f11);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f45142b).getLayoutParams();
                    if (i13 == i12) {
                        f13 = 4.0f;
                    }
                    layoutParams2.topMargin = org.telegram.messenger.i0.L(f13);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f45142b;
                zf.d dVar = (zf.d) this.f45143c;
                if (dVar.K && dVar.J) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.i0.f16026q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16020m;
                }
                int L2 = org.telegram.messenger.i0.L(50.0f);
                int i15 = 0;
                if (dVar.f55466w != 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.i0.L(30.0f) + L2;
                }
                if (!dVar.E && !dVar.f55467x) {
                    L += L2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i15 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(sg.o oVar, Context context) {
        super(context);
        this.f45141a = 3;
        this.f45143c = oVar;
        this.f45142b = new sg.k(this, this);
    }

    public k(zf.d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f45141a = 6;
        this.f45143c = dVar;
        this.f45142b = viewGroup;
    }

    public k(Context context, p6 p6Var) {
        super(context);
        this.f45141a = 0;
        LinearLayout f7 = m5.f(context, 1);
        f6 f6Var = new f6(context, false, false, false);
        this.f45142b = f6Var;
        int i10 = t6.G6;
        a7.Z(f6Var, i10, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(17.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(f6Var, b6.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f45143c = textView;
        textView.setTextSize(1, 11.0f);
        a7.V(textView, i10, p6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.addView(textView, b6.r(-2, -2, 1));
        addView(f7, b6.e(-2, -2, 17));
    }

    public k(Context context, int i10) {
        super(context);
        this.f45141a = i10;
        switch (i10) {
            case 2:
                super(context);
                ImageView imageView = new ImageView(context);
                this.f45142b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, b6.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f45143c = textView;
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, b6.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    private final void a(boolean z10) {
    }

    public k(vh.z3 z3Var, Context context) {
        super(context);
        this.f45141a = 5;
        this.f45143c = z3Var;
        this.f45142b = new Path();
    }
}
