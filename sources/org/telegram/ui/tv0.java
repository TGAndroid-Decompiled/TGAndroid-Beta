package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class tv0 extends org.telegram.ui.Components.du0 implements r0.l {
    public final e2.r0 f52397g0;
    public final ProfileActivity f52398h0;
    public boolean f52399i0;
    public final Paint f52400j0;
    public boolean f52401k0;
    public final ArrayList f52402l0;
    public final pe m0;
    public final ProfileActivity f52403n0;

    public tv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f52403n0 = profileActivity;
        this.f52398h0 = profileActivity;
        this.f52397g0 = new Object();
        this.f52400j0 = new Paint();
        this.f52402l0 = new ArrayList();
        this.m0 = new pe(29);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.f52403n0;
        org.telegram.ui.Components.h40 h40Var = profileActivity.f43724y0;
        Paint paint = profileActivity.f43675r2;
        Paint paint2 = profileActivity.f43731z0;
        float f11 = 0.0f;
        int i7 = (profileActivity.G5 > 0.0f ? 1 : (profileActivity.G5 == 0.0f ? 0 : -1));
        Paint paint3 = this.f52400j0;
        if (i7 > 0) {
            paint3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i10 = org.telegram.ui.ActionBar.m6.f29324a7;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0));
        if (profileActivity.f43553a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f43553a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f43553a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f43553a.getChildCount();
            ArrayList arrayList = this.f52402l0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f43553a.getChildAt(i11);
                profileActivity.f43553a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f43553a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.m0);
            profileActivity.f43553a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z11) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z12 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                if (view.getBackground() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                profileActivity.f43553a.getY();
                view.getY();
                if (z12 == z10) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z12 = z10;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (h40Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f43724y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.f43716x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f43716x0.getLeft(), profileActivity.f43716x0.getTop());
            View view2 = profileActivity.f43716x0;
            kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((h40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f43716x0.getMeasuredWidth(), profileActivity.f43716x0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f43716x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        uv uvVar = profileActivity.U;
        if (uvVar != null && uvVar.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() != 1.0f) {
                if (profileActivity.U.getAlpha() != 0.0f) {
                    canvas2.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                    profileActivity.U.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.U.draw(canvas);
            }
        }
        if (!profileActivity.J0) {
            canvas.save();
            qu0 qu0Var = profileActivity.f43553a;
            if (qu0Var != null) {
                f10 = qu0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, profileActivity.A0);
            int i13 = profileActivity.P6;
            qu0 qu0Var2 = profileActivity.f43553a;
            if (qu0Var2 != null) {
                f11 = qu0Var2.getAlpha();
            }
            org.telegram.messenger.g0.O(canvas, this, w02, i13, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.ds0[] ds0VarArr;
        org.telegram.ui.Components.ds0 ds0Var;
        ProfileActivity profileActivity = this.f52403n0;
        ev0 ev0Var = profileActivity.Z4;
        if (ev0Var.f47832n) {
            return ev0Var.g(motionEvent);
        }
        vv0 vv0Var = profileActivity.O;
        if (vv0Var != null && (ds0Var = (ds0VarArr = vv0Var.f36651n0)[0]) != null && ds0Var.h.getFastScroll() != null && ds0VarArr[0].h.getFastScroll().f36540n) {
            vv0 vv0Var2 = profileActivity.O;
            if (vv0Var2.d) {
                return vv0Var2.Z(motionEvent);
            }
        }
        vv0 vv0Var3 = profileActivity.O;
        if (vv0Var3 != null && vv0Var3.P(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.f52403n0;
        if (profileActivity.Z4.f47832n) {
            if (view != profileActivity.Z) {
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.f43680s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.U) {
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
        this.f52397g0.f10716a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.f52398h0;
        try {
            if (view == profileActivity.f43553a && profileActivity.Q) {
                org.telegram.ui.Components.ek0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.g3(new sv0(this, 1));
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f52398h0.N4 != -1 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.f52403n0;
        profileActivity.H0 = true;
        org.telegram.ui.Components.n5 n5Var = profileActivity.G;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = profileActivity.H;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.f52403n0;
        profileActivity.H0 = false;
        org.telegram.ui.Components.n5 n5Var = profileActivity.G;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = profileActivity.H;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        ProfileActivity profileActivity = this.f52403n0;
        profileActivity.f43679r6 = -1;
        profileActivity.X4 = false;
        profileActivity.Y4 = false;
        profileActivity.O3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tv0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        ProfileActivity profileActivity = this.f52403n0;
        ih.d.c(profileActivity.Q6, profileActivity.fragmentView);
        profileActivity.R6.d();
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f52397g0.f10716a = i7;
    }

    @Override
    public final void requestLayout() {
        if (this.f52399i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.ek0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f52398h0;
        if (view == profileActivity.f43553a) {
            int i13 = -1;
            if (profileActivity.N4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                boolean z10 = kVar.f29150o0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i10 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((v4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                        v4.f1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f59165a.getTop();
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
                            z11 = true;
                        }
                    }
                    if (z10) {
                        if (!z11 && top < 0) {
                            iArr[1] = i10 - Math.max(top, i10);
                        } else {
                            iArr[1] = i10;
                        }
                    }
                } else if (z10) {
                    org.telegram.ui.Components.ek0 currentListView2 = profileActivity.O.getCurrentListView();
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
