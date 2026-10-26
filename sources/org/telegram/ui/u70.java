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
public final class u70 extends FrameLayout {
    public final int f44033a = 1;
    public float f44034b;
    public final Path f44035c;
    public final Object d;
    public Object e;
    public final Object f44036f;

    public u70(w70 w70Var, Context context) {
        super(context);
        this.f44036f = w70Var;
        this.f44035c = new Path();
        this.e = new RectF();
        this.f44034b = -1.0f;
        eh.d c10 = w70Var.getBaseSimpleGlass().f19421c.c(this, null, false);
        c10.v(gh.c.m(w70Var.getResourceProvider()));
        c10.w(AndroidUtilities.dp(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(w70Var.e, org.telegram.ui.Components.gb1.g(-1.0f, -1));
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
        org.telegram.ui.Components.t61 G;
        switch (this.f44033a) {
            case 0:
                RectF rectF = (RectF) this.e;
                eh.d dVar = (eh.d) this.d;
                float f10 = ((w70) this.f44036f).f44993a.f19334f;
                if (f10 >= 1.0f) {
                    float min = Math.min(1.0f, f10 / AndroidUtilities.dp(44.0f));
                    float dp = (1.0f - min) * AndroidUtilities.dp(24.0f);
                    rectF.set(dp, 0.0f, getWidth() - dp, f10);
                    float min2 = Math.min(f10 / 2.0f, AndroidUtilities.dp(22.0f));
                    if (Math.abs(min2 - this.f44034b) > 0.5f) {
                        this.f44034b = min2;
                        dVar.x(min2);
                    }
                    int dp2 = AndroidUtilities.dp(6.0f);
                    dVar.setBounds(((int) rectF.left) - dp2, ((int) rectF.top) - dp2, ((int) rectF.right) + dp2, ((int) rectF.bottom) + dp2);
                    dVar.setAlpha((int) (min * 255.0f));
                    dVar.draw(canvas);
                    canvas.save();
                    Path path = this.f44035c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                v21 v21Var = (v21) this.f44036f;
                View[] viewPages = v21Var.f44578b.getViewPages();
                float f11 = 0.0f;
                this.f44034b = 0.0f;
                int length = viewPages.length;
                int i12 = 0;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        u21 u21Var = (u21) view;
                        FrameLayout frameLayout = u21Var.e;
                        org.telegram.ui.Components.r71 r71Var = u21Var.f43987f;
                        float clamp = Utilities.clamp(1.0f - Math.abs(u21Var.getTranslationX() / u21Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.f44034b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i13 = 0;
                        while (true) {
                            int childCount = r71Var.getChildCount();
                            org.telegram.ui.Components.j71 j71Var = r71Var.f32152g3;
                            if (i13 < childCount) {
                                View childAt = r71Var.getChildAt(i13);
                                r71Var.f32151f3.getClass();
                                int H = s4.p0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < j71Var.f29511y.size() && (G = j71Var.G(H)) != null && G.f47040a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i13++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f44034b = (paddingTop * clamp) + f12;
                                if (u21Var.getVisibility() == 0) {
                                    bi.j5 j5Var = u21Var.h;
                                    float f13 = -j5Var.getHeight();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < r71Var.getChildCount()) {
                                            View childAt2 = r71Var.getChildAt(i14);
                                            r71Var.f32151f3.getClass();
                                            if (j71Var.G(s4.p0.H(childAt2)).f47040a == 28) {
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
                if (this.f44034b <= AndroidUtilities.statusBarHeight) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = h6Var.d(f7, false);
                float f14 = AndroidUtilities.statusBarHeight;
                float f15 = f14 * d;
                this.f44034b = Math.max(f14, this.f44034b) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF2 = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.k3) v21Var).backgroundPaddingLeft;
                float f16 = this.f44034b;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.k3) v21Var).backgroundPaddingLeft;
                rectF2.set(i10, f16, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF2, lerp, lerp, v21Var.f44579c);
                canvas.save();
                Path path2 = this.f44035c;
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
                    if (AndroidUtilities.computePerceivedBrightness(v21Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(v21Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23636s8), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(v21Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f44033a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((w70) this.f44036f).f44993a.f19334f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f44034b) {
                    ((v21) this.f44036f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f44033a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f44033a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((w70) this.f44036f).f45000w, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public u70(v21 v21Var, Context context) {
        super(context);
        this.f44036f = v21Var;
        this.d = new org.telegram.ui.Components.h6(this, 250L, org.telegram.ui.Components.ds.h);
        this.f44035c = new Path();
    }
}
