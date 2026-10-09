package yh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.sw0;
public final class f extends sw0 implements r0.m {
    public final b2.q0 f52478w0;
    public final g f52479x0;

    public f(g gVar, Context context) {
        super(context, null);
        this.f52479x0 = gVar;
        this.f52478w0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        int max;
        g gVar = this.f52479x0;
        if (viewGroup == gVar.f52555e && gVar.F.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
            boolean z11 = kVar.f21285n0;
            int top = (((View) gVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) gVar.F.getParent()).getBottom();
            boolean z12 = false;
            if (i11 < 0) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                if (gVar.f52555e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar2.setCastShadows(z10);
                if (gVar.f52555e.getHeight() - bottom >= 0) {
                    qm0 currentListView = gVar.F.getCurrentListView();
                    int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.d1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f47656a.getTop();
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
                            z12 = true;
                        }
                    }
                }
                if (z11) {
                    if (!z12 && top < 0) {
                        iArr[1] = i11 - Math.max(top, i11);
                    } else {
                        iArr[1] = i11;
                    }
                }
            } else if (z11) {
                qm0 currentListView2 = gVar.F.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                qm0 currentListView3 = gVar.F.getCurrentListView();
                if (gVar.f52555e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    gVar.f52555e.B0();
                }
            }
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        g gVar = this.f52479x0;
        try {
            if (viewGroup == gVar.f52555e && gVar.F.isAttachedToWindow()) {
                qm0 currentListView = gVar.F.getCurrentListView();
                int bottom = ((View) gVar.F.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                if (gVar.f52555e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar.setCastShadows(z10);
                if (gVar.f52555e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new rg.x1(this, 26));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f52478w0.f3533a = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f52478w0.f3533a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
