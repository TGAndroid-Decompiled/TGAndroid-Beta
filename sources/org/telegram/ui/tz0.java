package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class tz0 extends org.telegram.ui.Components.vw0 implements r0.m {
    public final b2.v0 f43953l0;
    public final ProfileActivity m0;
    public boolean f43954n0;
    public final Paint f43955o0;
    public boolean f43956p0;
    public final ArrayList f43957q0;
    public final bv f43958r0;
    public final ProfileActivity f43959s0;

    public tz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f43959s0 = profileActivity;
        this.m0 = profileActivity;
        this.f43953l0 = new Object();
        this.f43955o0 = new Paint();
        this.f43957q0 = new ArrayList();
        this.f43958r0 = new bv(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.f43959s0;
        org.telegram.ui.Components.r50 r50Var = profileActivity.f36112x0;
        Paint paint = profileActivity.f36063q2;
        hh.d dVar = profileActivity.B6;
        ch.f fVar = profileActivity.A6;
        Paint paint2 = profileActivity.f36120y0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ProfileActivity.C0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f12843r) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23299a7, profileActivity.f36126z0));
                if (SharedConfig.chatBlurEnabled()) {
                    fVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.y6.f23299a7;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.f36126z0));
        if (profileActivity.f35948a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.f36126z0);
            Paint paint3 = this.f43955o0;
            paint3.setColor(w02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f35948a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f35948a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f35948a.getChildCount();
            ArrayList arrayList = this.f43957q0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f35948a.getChildAt(i11);
                profileActivity.f35948a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f35948a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.f43958r0);
            profileActivity.f35948a.getY();
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
                profileActivity.f35948a.getY();
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
        if (r50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f36112x0);
        }
        if (profileActivity.f36104w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f36104w0.getLeft(), profileActivity.f36104w0.getTop());
            View view2 = profileActivity.f36104w0;
            kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((r50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f36104w0.getMeasuredWidth(), profileActivity.f36104w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f36104w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        z10 z10Var = profileActivity.T;
        float f10 = 0.0f;
        if (z10Var != null && z10Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() != 1.0f) {
                if (profileActivity.T.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
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
            py0 py0Var = profileActivity.f35948a;
            if (py0Var != null) {
                f7 = py0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, profileActivity.f36126z0);
            int i13 = profileActivity.f36132z6;
            py0 py0Var2 = profileActivity.f35948a;
            if (py0Var2 != null) {
                f10 = py0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.tu0[] tu0VarArr;
        org.telegram.ui.Components.tu0 tu0Var;
        ProfileActivity profileActivity = this.f43959s0;
        dz0 dz0Var = profileActivity.f35961b5;
        if (dz0Var.f38544n) {
            return dz0Var.g(motionEvent);
        }
        vz0 vz0Var = profileActivity.N;
        if (vz0Var != null && (tu0Var = (tu0VarArr = vz0Var.m0)[0]) != null && tu0Var.h.getFastScroll() != null && tu0VarArr[0].h.getFastScroll().f32640n) {
            vz0 vz0Var2 = profileActivity.N;
            if (vz0Var2.d) {
                return vz0Var2.W(motionEvent);
            }
        }
        vz0 vz0Var3 = profileActivity.N;
        if (vz0Var3 != null && vz0Var3.N(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.f43959s0;
        if (profileActivity.f35961b5.f38544n) {
            if (view != profileActivity.Y) {
                kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.f36074s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void m(int i10, View view) {
        this.f43953l0.f3511a = 0;
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.m0;
        try {
            if (view == profileActivity.f35948a && profileActivity.P) {
                org.telegram.ui.Components.mm0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new sz0(this, 1));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.f43959s0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            r5Var.a();
        }
        org.telegram.ui.Components.r5 r5Var2 = profileActivity.G;
        if (r5Var2 != null) {
            r5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.f43959s0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            r5Var.b();
        }
        org.telegram.ui.Components.r5 r5Var2 = profileActivity.G;
        if (r5Var2 != null) {
            r5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.f43959s0;
        profileActivity.f35962b6 = -1;
        profileActivity.Z4 = false;
        profileActivity.f35953a5 = false;
        profileActivity.I3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tz0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.f43959s0;
        ih.d.c(profileActivity.E6, profileActivity.fragmentView);
        profileActivity.F6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.m0.P4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f43954n0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f43953l0.f3511a = i10;
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.m0;
        if (view == profileActivity.f35948a) {
            int i14 = -1;
            if (profileActivity.P4 != -1 && profileActivity.P) {
                kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                boolean z10 = kVar.f22774n0;
                int top = profileActivity.N.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((s4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.e1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f47738a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i14 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i14 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i11);
                            z11 = true;
                        }
                    }
                    if (z10) {
                        if (!z11 && top < 0) {
                            iArr[1] = i11 - Math.max(top, i11);
                        } else {
                            iArr[1] = i11;
                        }
                    }
                } else if (z10) {
                    org.telegram.ui.Components.mm0 currentListView2 = profileActivity.N.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i13);
                    }
                }
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
