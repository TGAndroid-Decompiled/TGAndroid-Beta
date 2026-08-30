package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class qz0 extends org.telegram.ui.Components.qv0 implements r0.n {
    public final ProfileActivity A0;
    public final c5.e f37875t0;
    public final ProfileActivity f37876u0;
    public boolean f37877v0;
    public final Paint f37878w0;
    public boolean f37879x0;
    public final ArrayList f37880y0;
    public final cu f37881z0;

    public qz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.A0 = profileActivity;
        this.f37876u0 = profileActivity;
        this.f37875t0 = new Object();
        this.f37878w0 = new Paint();
        this.f37880y0 = new ArrayList();
        this.f37881z0 = new cu(8);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.sl0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f37876u0;
        if (viewGroup == profileActivity.f32028a) {
            int i14 = -1;
            if (profileActivity.G4 != -1 && profileActivity.N) {
                kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                boolean z4 = kVar.f20330k0;
                int top = profileActivity.L.getTop();
                boolean z10 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.L.getCurrentListView()) != null && (L0 = ((f2.i0) currentListView.getLayoutManager()).L0()) != -1) {
                        f2.l1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f5785a.getTop();
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
                            z10 = true;
                        }
                    }
                    if (z4) {
                        if (!z10 && top < 0) {
                            iArr[1] = i11 - Math.max(top, i11);
                        } else {
                            iArr[1] = i11;
                        }
                    }
                } else if (z4) {
                    org.telegram.ui.Components.sl0 currentListView2 = profileActivity.L.getCurrentListView();
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
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.f37876u0;
        canvas.translate(0.0f, profileActivity.f32028a.getY());
        profileActivity.L.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        ProfileActivity profileActivity = this.A0;
        org.telegram.ui.Components.i50 i50Var = profileActivity.f32168u0;
        Paint paint = profileActivity.f32121n2;
        sg.d dVar = profileActivity.f32105k6;
        ng.e eVar = profileActivity.f32098j6;
        Paint paint2 = profileActivity.f32174v0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f44314n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, profileActivity.f32181w0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.f32181w0));
        if (profileActivity.f32028a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.f32181w0);
            Paint paint3 = this.f37878w0;
            paint3.setColor(v02);
            if (profileActivity.E1) {
                paint.setAlpha((int) (profileActivity.f32028a.getAlpha() * 255.0f));
            }
            if (profileActivity.E1) {
                paint3.setAlpha((int) (profileActivity.f32028a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f32028a.getChildCount();
            ArrayList arrayList = this.f37880y0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f32028a.getChildAt(i11);
                profileActivity.f32028a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f32028a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.f37881z0);
            profileActivity.f32028a.getY();
            int size = arrayList.size();
            if (!profileActivity.D1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                if (view.getBackground() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                profileActivity.f32028a.getY();
                view.getY();
                if (z11 == z4) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z11 = z4;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (i50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f32168u0);
        }
        if (profileActivity.f32162t0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f32162t0.getLeft(), profileActivity.f32162t0.getTop());
            View view2 = profileActivity.f32162t0;
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((i50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f32162t0.getMeasuredWidth(), profileActivity.f32162t0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f32162t0.draw(canvas);
            canvas.restoreToCount(save);
        }
        gw0 gw0Var = profileActivity.R;
        float f11 = 0.0f;
        if (gw0Var != null && gw0Var.getVisibility() == 0) {
            if (profileActivity.R.getAlpha() != 1.0f) {
                if (profileActivity.R.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(profileActivity.R.getLeft(), profileActivity.R.getTop(), profileActivity.R.getRight(), profileActivity.R.getBottom(), (int) (profileActivity.R.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.R.getLeft(), profileActivity.R.getTop());
                    profileActivity.R.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.R.draw(canvas);
            }
        }
        if (!profileActivity.F0) {
            canvas.save();
            my0 my0Var = profileActivity.f32028a;
            if (my0Var != null) {
                f10 = my0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, profileActivity.f32181w0);
            int i13 = profileActivity.f32091i6;
            my0 my0Var2 = profileActivity.f32028a;
            if (my0Var2 != null) {
                f11 = my0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.qt0[] qt0VarArr;
        org.telegram.ui.Components.qt0 qt0Var;
        ProfileActivity profileActivity = this.A0;
        bz0 bz0Var = profileActivity.S4;
        if (bz0Var.f39259n) {
            return bz0Var.g(motionEvent);
        }
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null && (qt0Var = (qt0VarArr = sz0Var.f31120h0)[0]) != null && qt0Var.h.getFastScroll() != null && qt0VarArr[0].h.getFastScroll().f23713n) {
            sz0 sz0Var2 = profileActivity.L;
            if (sz0Var2.d) {
                return sz0Var2.O(motionEvent);
            }
        }
        sz0 sz0Var3 = profileActivity.L;
        if (sz0Var3 != null && sz0Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.A0;
        if (profileActivity.S4.f39259n) {
            if (view != profileActivity.W) {
                kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.v) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.R) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.f37876u0;
        try {
            if (viewGroup == profileActivity.f32028a && profileActivity.N) {
                org.telegram.ui.Components.sl0 currentListView = profileActivity.L.getCurrentListView();
                if (profileActivity.L.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new pz0(this, 1));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f37875t0.f2085a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f37876u0.G4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.A0;
        profileActivity.D0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
            if (i11 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i11];
            if (j5Var != null) {
                j5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr2 = profileActivity.E;
            if (i10 < j5VarArr2.length) {
                org.telegram.ui.Components.j5 j5Var2 = j5VarArr2[i10];
                if (j5Var2 != null) {
                    j5Var2.a();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.A0;
        int i10 = 0;
        profileActivity.D0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
            if (i11 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i11];
            if (j5Var != null) {
                j5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr2 = profileActivity.E;
            if (i10 < j5VarArr2.length) {
                org.telegram.ui.Components.j5 j5Var2 = j5VarArr2[i10];
                if (j5Var2 != null) {
                    j5Var2.b();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.A0;
        profileActivity.R5 = -1;
        profileActivity.Q4 = false;
        profileActivity.R4 = false;
        profileActivity.A3();
    }

    @Override
    public final void onMeasure(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qz0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.A0;
        tg.c.c(profileActivity.f32117m6, profileActivity.fragmentView);
        profileActivity.f32125n6.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f37877v0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f37875t0.f2085a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
