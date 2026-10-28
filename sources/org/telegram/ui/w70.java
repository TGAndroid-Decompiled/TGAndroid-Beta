package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w70 extends FrameLayout {
    public final int f44532a = 1;
    public float f44533b;
    public final Path f44534c;
    public final Object d;
    public Object e;
    public final Object f44535f;

    public w70(y70 y70Var, Context context) {
        super(context);
        this.f44535f = y70Var;
        this.f44534c = new Path();
        this.e = new RectF();
        this.f44533b = -1.0f;
        eh.d c10 = y70Var.getBaseSimpleGlass().f19420c.c(this, null, false);
        c10.v(gh.c.m(y70Var.getResourceProvider()));
        c10.w(AndroidUtilities.dp(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(y70Var.e, org.telegram.ui.Components.kb1.g(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.u61 G;
        switch (this.f44532a) {
            case 0:
                RectF rectF = (RectF) this.e;
                eh.d dVar = (eh.d) this.d;
                float f10 = ((y70) this.f44535f).f45866a.f19333f;
                if (f10 >= 1.0f) {
                    float min = Math.min(1.0f, f10 / AndroidUtilities.dp(44.0f));
                    float dp = (1.0f - min) * AndroidUtilities.dp(24.0f);
                    rectF.set(dp, 0.0f, getWidth() - dp, f10);
                    float min2 = Math.min(f10 / 2.0f, AndroidUtilities.dp(22.0f));
                    if (Math.abs(min2 - this.f44533b) > 0.5f) {
                        this.f44533b = min2;
                        dVar.x(min2);
                    }
                    int dp2 = AndroidUtilities.dp(6.0f);
                    dVar.setBounds(((int) rectF.left) - dp2, ((int) rectF.top) - dp2, ((int) rectF.right) + dp2, ((int) rectF.bottom) + dp2);
                    dVar.setAlpha((int) (min * 255.0f));
                    dVar.draw(canvas);
                    canvas.save();
                    Path path = this.f44534c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                x21 x21Var = (x21) this.f44535f;
                View[] viewPages = x21Var.f45462b.getViewPages();
                float f11 = 0.0f;
                this.f44533b = 0.0f;
                int length = viewPages.length;
                int i12 = 0;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        w21 w21Var = (w21) view;
                        FrameLayout frameLayout = w21Var.e;
                        org.telegram.ui.Components.s71 s71Var = w21Var.f44502f;
                        float clamp = Utilities.clamp(1.0f - Math.abs(w21Var.getTranslationX() / w21Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.f44533b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i13 = 0;
                        while (true) {
                            int childCount = s71Var.getChildCount();
                            org.telegram.ui.Components.k71 k71Var = s71Var.f32504g3;
                            if (i13 < childCount) {
                                View childAt = s71Var.getChildAt(i13);
                                s71Var.f32503f3.getClass();
                                int H = s4.p0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < k71Var.f29882y.size() && (G = k71Var.G(H)) != null && G.f47075a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i13++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f44533b = (paddingTop * clamp) + f12;
                                if (w21Var.getVisibility() == 0) {
                                    bi.j5 j5Var = w21Var.h;
                                    float f13 = -j5Var.getHeight();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < s71Var.getChildCount()) {
                                            View childAt2 = s71Var.getChildAt(i14);
                                            s71Var.f32503f3.getClass();
                                            if (k71Var.G(s4.p0.H(childAt2)).f47075a == 28) {
                                                f13 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                    j5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f13));
                                }
                            }
                        }
                    }
                    i12++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.d;
                if (this.f44533b <= AndroidUtilities.statusBarHeight) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = h6Var.d(f7, false);
                float f14 = AndroidUtilities.statusBarHeight;
                float f15 = f14 * d;
                this.f44533b = Math.max(f14, this.f44533b) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF2 = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.k3) x21Var).backgroundPaddingLeft;
                float f16 = this.f44533b;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.k3) x21Var).backgroundPaddingLeft;
                rectF2.set(i10, f16, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF2, lerp, lerp, x21Var.f45463c);
                canvas.save();
                Path path2 = this.f44534c;
                path2.rewind();
                path2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f15 > AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(x21Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(x21Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(x21Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f44532a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((y70) this.f44535f).f45866a.f19333f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f44533b) {
                    ((x21) this.f44535f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f44532a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f44532a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((y70) this.f44535f).f45873w, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public w70(x21 x21Var, Context context) {
        super(context);
        this.f44535f = x21Var;
        this.d = new org.telegram.ui.Components.h6(this, 250L, org.telegram.ui.Components.ds.h);
        this.f44534c = new Path();
    }
}
