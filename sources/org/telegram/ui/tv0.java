package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class tv0 extends org.telegram.ui.Components.rt0 implements r0.l {
    public final e2.r0 f50136f0;
    public final ProfileActivity f50137g0;
    public boolean f50138h0;
    public final Paint f50139i0;
    public boolean f50140j0;
    public final ArrayList f50141k0;
    public final rv0 f50142l0;
    public final ProfileActivity m0;

    public tv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.m0 = profileActivity;
        this.f50137g0 = profileActivity;
        this.f50136f0 = new Object();
        this.f50139i0 = new Paint();
        this.f50141k0 = new ArrayList();
        this.f50142l0 = new rv0(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z9;
        ProfileActivity profileActivity = this.m0;
        org.telegram.ui.Components.t30 t30Var = profileActivity.f41826x0;
        Paint paint = profileActivity.f41770p2;
        Paint paint2 = profileActivity.f41834y0;
        float f11 = 0.0f;
        int i7 = (profileActivity.A5 > 0.0f ? 1 : (profileActivity.A5 == 0.0f ? 0 : -1));
        Paint paint3 = this.f50139i0;
        if (i7 > 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, profileActivity.f41841z0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27792a7;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.f41841z0));
        if (profileActivity.f41663a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.f41841z0));
            if (profileActivity.G1) {
                paint.setAlpha((int) (profileActivity.f41663a.getAlpha() * 255.0f));
            }
            if (profileActivity.G1) {
                paint3.setAlpha((int) (profileActivity.f41663a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f41663a.getChildCount();
            ArrayList arrayList = this.f50141k0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f41663a.getChildAt(i11);
                profileActivity.f41663a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f41663a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.f50142l0);
            profileActivity.f41663a.getY();
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
                profileActivity.f41663a.getY();
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
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f41826x0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.f41818w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f41818w0.getLeft(), profileActivity.f41818w0.getTop());
            View view2 = profileActivity.f41818w0;
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((t30Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f41818w0.getMeasuredWidth(), profileActivity.f41818w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f41818w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        l00 l00Var = profileActivity.T;
        if (l00Var != null && l00Var.getVisibility() == 0) {
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
            pu0 pu0Var = profileActivity.f41663a;
            if (pu0Var != null) {
                f10 = pu0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, profileActivity.f41841z0);
            int i13 = profileActivity.I6;
            pu0 pu0Var2 = profileActivity.f41663a;
            if (pu0Var2 != null) {
                f11 = pu0Var2.getAlpha();
            }
            org.telegram.messenger.g0.O(canvas, this, w02, i13, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.sr0[] sr0VarArr;
        org.telegram.ui.Components.sr0 sr0Var;
        ProfileActivity profileActivity = this.m0;
        dv0 dv0Var = profileActivity.V4;
        if (dv0Var.f45389n) {
            return dv0Var.g(motionEvent);
        }
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null && (sr0Var = (sr0VarArr = vv0Var.m0)[0]) != null && sr0Var.h.getFastScroll() != null && sr0VarArr[0].h.getFastScroll().f38667n) {
            vv0 vv0Var2 = profileActivity.N;
            if (vv0Var2.d) {
                return vv0Var2.Z(motionEvent);
            }
        }
        vv0 vv0Var3 = profileActivity.N;
        if (vv0Var3 != null && vv0Var3.P(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.m0;
        if (profileActivity.V4.f45389n) {
            if (view != profileActivity.Y) {
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.f41790s) {
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
        this.f50136f0.f10533a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.f50137g0;
        try {
            if (view == profileActivity.f41663a && profileActivity.P) {
                org.telegram.ui.Components.pj0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.h3(new sv0(this, 1));
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f50137g0.J4 != -1 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = profileActivity.G;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            g5Var.b();
        }
        org.telegram.ui.Components.g5 g5Var2 = profileActivity.G;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        profileActivity.f41742k6 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.O3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tv0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        ih.d.c(profileActivity.J6, profileActivity.fragmentView);
        profileActivity.K6.d();
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f50136f0.f10533a = i7;
    }

    @Override
    public final void requestLayout() {
        if (this.f50138h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.pj0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f50137g0;
        if (view == profileActivity.f41663a) {
            int i13 = -1;
            if (profileActivity.J4 != -1 && profileActivity.P) {
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                boolean z9 = kVar.f27676n0;
                int top = profileActivity.N.getTop();
                boolean z10 = false;
                if (i10 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((v4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                        v4.d1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f56927a.getTop();
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
