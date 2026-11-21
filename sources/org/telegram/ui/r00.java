package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r00 extends org.telegram.ui.Components.lb0 {
    public boolean m0;
    public boolean f51407n0;
    public boolean f51408o0;
    public boolean f51409p0;
    public final Paint f51410q0;
    public Boolean f51411r0;
    public final s00 f51412s0;

    public r00(s00 s00Var, Activity activity) {
        super(activity);
        this.f51412s0 = s00Var;
        new Paint(1);
        this.f51410q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f51411r0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f51412s0.fragmentView;
        this.f51411r0 = Boolean.valueOf(z10);
        org.telegram.messenger.g0.q3(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        s00 s00Var = this.f51412s0;
        Paint paint = s00Var.L;
        ah.a aVar = s00Var.E;
        if (!s00Var.f51801f) {
            if (s00Var.h) {
                float f12 = s00Var.f51802n + 0.016f;
                s00Var.f51802n = f12;
                if (f12 > 3.0f) {
                    s00Var.h = false;
                }
            } else {
                float f13 = s00Var.f51802n - 0.016f;
                s00Var.f51802n = f13;
                if (f13 < 1.0f) {
                    s00Var.h = true;
                }
            }
        }
        if (s00Var.f51799c.getLayoutManager() != null) {
            view = s00Var.f51799c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(s00Var.q0() + view.getBottom());
        }
        s00Var.f51803r = round;
        FrameLayout p02 = s00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((s00Var.f51803r - L) / (s00Var.K - L));
        s00Var.f51805w = f14;
        float f15 = 0.0f;
        s00Var.f51805w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (s00Var.f51803r < L2) {
            s00Var.f51803r = L2;
        }
        float f16 = s00Var.f51807y;
        s00Var.f51807y = 0.0f;
        if (s00Var.f51803r < org.telegram.messenger.g0.L(30.0f) + L2) {
            s00Var.f51807y = ((org.telegram.messenger.g0.L(30.0f) + L2) - s00Var.f51803r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (s00Var.I) {
            s00Var.f51807y = 1.0f;
            s00Var.f51805w = 1.0f;
        }
        if (f16 != s00Var.f51807y) {
            s00Var.f51799c.invalidate();
        }
        s00Var.t0(s00Var.f51805w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = s00Var.f51803r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) aVar.f1055c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1056e;
        TextView textView = (TextView) aVar.f1054b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - s00Var.J) - textView.getMeasuredHeight()) / 2.0f) + s00Var.J) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - s00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = s00Var.f51805w;
        float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        frameLayout2.setScaleX(z11);
        frameLayout2.setScaleY(z11);
        frameLayout2.setAlpha(f18);
        frameLayout.setAlpha(f18);
        m80Var.setAlpha(f18);
        if (s00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            m80Var.setVisibility(i10);
        }
        s00Var.f51800e.setAlpha(1.0f - s00Var.f51805w);
        s00Var.f51800e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = s00Var.f51805w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!s00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.nr.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!s00Var.f51801f) {
            invalidate();
        }
        s00Var.f51797a.d(0, (-getMeasuredWidth()) * 0.1f * s00Var.f51802n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (s00Var.N) {
            int themedColor = s00Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29321a7);
            Paint paint2 = this.f51410q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s00Var.f51797a.f58643f);
        }
        int themedColor2 = s00Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29486j5);
        if (s00Var.N) {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Kk;
        }
        int f20 = i0.a.f(f18, themedColor2, s00Var.getThemedColor(i7));
        kVar = ((org.telegram.ui.ActionBar.g2) s00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) s00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        s00Var.s0(z10);
        int i12 = org.telegram.ui.ActionBar.m6.Jk;
        h6Var = ((org.telegram.ui.ActionBar.g2) s00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), paint.getColor()));
        if (!s00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && s00Var.n0()) {
            r4Var = ((org.telegram.ui.ActionBar.g2) s00Var).parentLayout;
            ((ActionBarLayout) r4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        s00 s00Var = this.f51412s0;
        if (!s00Var.z0()) {
            kVar = ((org.telegram.ui.ActionBar.g2) s00Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) s00Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f51409p0 = true;
                        }
                    }
                    if (this.f51409p0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f51409p0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ah.a aVar = s00Var.E;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f1056e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) aVar.f1055c;
            float x11 = m80Var.getX() + x10;
            float y10 = m80Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y10, m80Var.getMeasuredWidth() + x11, m80Var.getMeasuredHeight() + y10);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.f51407n0) || s00Var.f51799c.J1 || (layout = m80Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && s00Var.f51807y < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y10);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.f51407n0 = false;
                            }
                        } else {
                            this.f51407n0 = true;
                        }
                        m80Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + aVar.getX();
            float y11 = frameLayout2.getY() + aVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !s00Var.f51799c.J1 && isClickable && s00Var.f51807y < f10) {
                motionEvent.offsetLocation(-x12, -y11);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.m0 = false;
                    }
                } else {
                    this.m0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x13 = frameLayout.getX() + aVar.getX();
            float y12 = frameLayout.getY() + aVar.getY();
            rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f51408o0) && !s00Var.f51799c.J1 && s00Var.f51807y < f10) {
                motionEvent.offsetLocation(-x13, -y12);
                if (motionEvent.getAction() == 0) {
                    this.f51408o0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f51408o0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f51408o0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s00 s00Var = this.f51412s0;
        if (view == s00Var.r0() && !s00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, s00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r00.onMeasure(int, int):void");
    }
}
