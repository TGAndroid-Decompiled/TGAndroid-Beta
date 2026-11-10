package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class wv0 extends org.telegram.ui.Components.st0 implements r0.l {
    public final e2.r0 f51452f0;
    public final ProfileActivity f51453g0;
    public boolean f51454h0;
    public final Paint f51455i0;
    public boolean f51456j0;
    public final ArrayList f51457k0;
    public final xn0 f51458l0;
    public final ProfileActivity m0;

    public wv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.m0 = profileActivity;
        this.f51453g0 = profileActivity;
        this.f51452f0 = new Object();
        this.f51455i0 = new Paint();
        this.f51457k0 = new ArrayList();
        this.f51458l0 = new xn0(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z9;
        ProfileActivity profileActivity = this.m0;
        org.telegram.ui.Components.t30 t30Var = profileActivity.f41852x0;
        Paint paint = profileActivity.f41796p2;
        Paint paint2 = profileActivity.f41860y0;
        float f11 = 0.0f;
        int i7 = (profileActivity.C5 > 0.0f ? 1 : (profileActivity.C5 == 0.0f ? 0 : -1));
        Paint paint3 = this.f51455i0;
        if (i7 > 0) {
            paint3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, profileActivity.f41867z0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i10 = org.telegram.ui.ActionBar.m6.f27834a7;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0));
        if (profileActivity.f41689a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0));
            if (profileActivity.G1) {
                paint.setAlpha((int) (profileActivity.f41689a.getAlpha() * 255.0f));
            }
            if (profileActivity.G1) {
                paint3.setAlpha((int) (profileActivity.f41689a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f41689a.getChildCount();
            ArrayList arrayList = this.f51457k0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f41689a.getChildAt(i11);
                profileActivity.f41689a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f41689a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.f51458l0);
            profileActivity.f41689a.getY();
            int size = arrayList.size();
            if (!profileActivity.F1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                if (view.getBackground() != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                profileActivity.f41689a.getY();
                view.getY();
                if (z11 == z9) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z11 = z9;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (t30Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f41852x0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.f41844w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f41844w0.getLeft(), profileActivity.f41844w0.getTop());
            View view2 = profileActivity.f41844w0;
            lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((t30Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f41844w0.getMeasuredWidth(), profileActivity.f41844w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f41844w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        o00 o00Var = profileActivity.T;
        if (o00Var != null && o00Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() != 1.0f) {
                if (profileActivity.T.getAlpha() != 0.0f) {
                    canvas2.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.T.getLeft(), profileActivity.T.getTop());
                    profileActivity.T.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.T.draw(canvas);
            }
        }
        if (!profileActivity.I0) {
            canvas.save();
            tu0 tu0Var = profileActivity.f41689a;
            if (tu0Var != null) {
                f10 = tu0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, profileActivity.f41867z0);
            int i13 = profileActivity.L6;
            tu0 tu0Var2 = profileActivity.f41689a;
            if (tu0Var2 != null) {
                f11 = tu0Var2.getAlpha();
            }
            org.telegram.messenger.g0.O(canvas, this, w02, i13, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.tr0[] tr0VarArr;
        org.telegram.ui.Components.tr0 tr0Var;
        ProfileActivity profileActivity = this.m0;
        hv0 hv0Var = profileActivity.V4;
        if (hv0Var.f46737n) {
            return hv0Var.g(motionEvent);
        }
        yv0 yv0Var = profileActivity.N;
        if (yv0Var != null && (tr0Var = (tr0VarArr = yv0Var.m0)[0]) != null && tr0Var.h.getFastScroll() != null && tr0VarArr[0].h.getFastScroll().f38681n) {
            yv0 yv0Var2 = profileActivity.N;
            if (yv0Var2.d) {
                return yv0Var2.Z(motionEvent);
            }
        }
        yv0 yv0Var3 = profileActivity.N;
        if (yv0Var3 != null && yv0Var3.P(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.m0;
        if (profileActivity.V4.f46737n) {
            if (view != profileActivity.Y) {
                lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (view == lVar || view == profileActivity.f41816s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void k(int i7, View view) {
        this.f51452f0.f10538a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.f51453g0;
        try {
            if (view == profileActivity.f41689a && profileActivity.P) {
                org.telegram.ui.Components.pj0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.h3(new vv0(this, 1));
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f51453g0.J4 != -1 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.f5 f5Var = profileActivity.F;
        if (f5Var != null) {
            f5Var.a();
        }
        org.telegram.ui.Components.f5 f5Var2 = profileActivity.G;
        if (f5Var2 != null) {
            f5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.f5 f5Var = profileActivity.F;
        if (f5Var != null) {
            f5Var.b();
        }
        org.telegram.ui.Components.f5 f5Var2 = profileActivity.G;
        if (f5Var2 != null) {
            f5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        profileActivity.f41787n6 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.O3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wv0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        ih.d.c(profileActivity.M6, profileActivity.fragmentView);
        profileActivity.N6.d();
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f51452f0.f10538a = i7;
    }

    @Override
    public final void requestLayout() {
        if (this.f51454h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        int i12;
        org.telegram.ui.Components.pj0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f51453g0;
        if (view == profileActivity.f41689a) {
            int i13 = -1;
            if (profileActivity.J4 != -1 && profileActivity.P) {
                lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                boolean z9 = lVar.f27691n0;
                int top = profileActivity.N.getTop();
                boolean z10 = false;
                if (i10 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((v4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                        v4.d1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f57052a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i13 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i13 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i10);
                            z10 = true;
                        }
                    }
                    if (z9) {
                        if (!z10 && top < 0) {
                            iArr[1] = i10 - Math.max(top, i10);
                        } else {
                            iArr[1] = i10;
                        }
                    }
                } else if (z9) {
                    org.telegram.ui.Components.pj0 currentListView2 = profileActivity.N.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i12);
                    }
                }
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
