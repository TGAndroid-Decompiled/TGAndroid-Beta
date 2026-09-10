package xh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.vl0;
public final class g extends aw0 implements r0.m {
    public final b2.q0 f45427w0;
    public final h f45428x0;

    public g(h hVar, Context context) {
        super(context, null);
        this.f45428x0 = hVar;
        this.f45427w0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        int max;
        h hVar = this.f45428x0;
        if (viewGroup == hVar.e && hVar.F.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
            boolean z11 = lVar.f18389n0;
            int top = (((View) hVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int bottom = ((View) hVar.F.getParent()).getBottom();
            boolean z12 = false;
            if (i11 < 0) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                if (hVar.e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lVar2.setCastShadows(z10);
                if (hVar.e.getHeight() - bottom >= 0) {
                    vl0 currentListView = hVar.F.getCurrentListView();
                    int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.c1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f41610a.getTop();
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
                vl0 currentListView2 = hVar.F.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                vl0 currentListView3 = hVar.F.getCurrentListView();
                if (hVar.e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    hVar.e.B0();
                }
            }
        }
    }

    @Override
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        h hVar = this.f45428x0;
        try {
            if (viewGroup == hVar.e && hVar.F.isAttachedToWindow()) {
                vl0 currentListView = hVar.F.getCurrentListView();
                int bottom = ((View) hVar.F.getParent()).getBottom();
                lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                if (hVar.e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lVar.setCastShadows(z10);
                if (hVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new qg.q0(this, 28));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f45427w0.f1896a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final void r(View view, View view2, int i10, int i11) {
        this.f45427w0.f1896a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
