package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc0;
public final class f4 extends FrameLayout {
    public long D;
    public final a4 E;
    public final ArrayList F;
    public final ArrayList G;
    public final l3 H;
    public float I;
    public final c4 f48975a;
    public float f48976b;
    public float f48977c;
    public float d;
    public final d4 e;
    public float f48978f;
    public final z3 h;
    public float f48979n;
    public final o7 f48980r;
    public final Drawable f48981s;
    public float f48982w;
    public boolean f48983x;
    public int f48984y;

    public f4(Context context, o7 o7Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new l3();
        b bVar = o7Var.D;
        this.f48980r = o7Var;
        z3 z3Var = new z3(getContext(), this, o7Var);
        this.h = z3Var;
        Drawable f7 = i0.a.f(context, 2131232725);
        this.f48981s = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.f21002h5, bVar, PorterDuff.Mode.MULTIPLY);
        d4 d4Var = new d4(this, context);
        this.e = d4Var;
        a4 a4Var = new a4(this, context);
        this.E = a4Var;
        a4Var.b(new hc0(2, this));
        c4 c4Var = new c4(context, this, o7Var);
        this.f48975a = c4Var;
        a4Var.setAdapter(c4Var);
        d4Var.addView(a4Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(z3Var, w7.b6.c(-1.0f, -1));
        addView(d4Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.D = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f48916a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList F = wp.r1(this.f48980r.h).f19140h0.F(e20.i(e20.f15506s0).e());
        if (F != null) {
            for (int i12 = 0; i12 < F.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f48917b = (d5) F.get(i12);
                arrayList2.add(obj2);
            }
        }
        z3 z3Var = this.h;
        ArrayList arrayList3 = z3Var.G;
        ArrayList arrayList4 = z3Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        z3Var.d();
        if (z3Var.getMeasuredHeight() > 0) {
            z3Var.c(i10, false, false);
        } else {
            z3Var.f48973x = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((e3) arrayList3.get(i13)).a(((e3) arrayList3.get(i13)).f48913b);
        }
        a4 a4Var = this.E;
        a4Var.setAdapter(null);
        c4 c4Var = this.f48975a;
        a4Var.setAdapter(c4Var);
        c4Var.g();
        a4Var.setCurrentItem(i10);
    }

    public e3 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public y3 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((y3) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (y3) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.F;
            if (closestPosition < arrayList.size()) {
                return ((e4) arrayList.get(closestPosition)).f48916a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f48980r.f49307b) {
            i12 = org.telegram.messenger.i0.f16166m;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        z3 z3Var = this.h;
        ((FrameLayout.LayoutParams) z3Var.getLayoutParams()).topMargin = i12;
        this.f48979n = z3Var.getFinalHeight();
        this.f48976b = org.telegram.messenger.i0.L(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16166m;
        float L = (((org.telegram.messenger.i0.L(20.0f) + i12) + this.f48979n) + org.telegram.messenger.i0.L(24.0f)) - org.telegram.messenger.i0.f16166m;
        this.d = L;
        this.f48977c = size - L;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((y3) arrayList.get(i13)).setListBottomPadding(this.d);
                i13++;
            } else {
                super.onMeasure(i10, i11);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        boolean z11;
        y3 currentPage;
        float f7;
        if (this.f48984y >= org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= org.telegram.messenger.i0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f10 = this.I;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            ofFloat.addUpdateListener(new qh.e0(this, 20));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f48984y = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f49689r.dispatchTouchEvent(org.telegram.messenger.i0.R());
            FrameLayout frameLayout = currentPage.f49686c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.m1.f20562w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.f48982w != f7) {
            this.f48982w = f7;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f48982w);
            float f10 = this.f48978f;
            float i12 = Utilities.i(f7 / this.f48977c, 1.0f, 0.0f);
            this.f48978f = i12;
            Utilities.i(i12 / 0.5f, 1.0f, 0.0f);
            o7 o7Var = this.f48980r;
            z2 H = o7Var.H();
            l7 l7Var = o7Var.f49345s0;
            int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            z3 z3Var = this.h;
            if (i13 == 0 && this.f48978f != 1.0f) {
                if (o7Var.O0 != null) {
                    kj kjVar = (kj) o7Var.O0.f49650i.get(Utilities.j(z3Var.getClosestPosition(), o7Var.O0.f49650i.size() - 1, 0));
                    long b10 = x4.b(kjVar);
                    ImageReceiver imageReceiver = l7Var.f49199c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        l7Var.f49199c = null;
                    }
                    e7 e7Var = o7Var.f49333n0;
                    int i14 = kjVar.f16694l.f20032id;
                    o7 o7Var2 = e7Var.N0;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= e7Var.f48799x0.size()) {
                            break;
                        } else if (b10 == x4.b(o7Var2.O0.f(((Integer) ((ArrayList) e7Var.f48799x0.get(i15)).get(0)).intValue()))) {
                            if (o7Var2.R0) {
                                i11 = (e7Var.f48799x0.size() - 1) - i15;
                            } else {
                                i11 = i15;
                            }
                            int i16 = 0;
                            while (true) {
                                if (i16 < ((ArrayList) e7Var.f48799x0.get(i15)).size()) {
                                    if (((Integer) ((ArrayList) e7Var.f48799x0.get(i15)).get(i16)).intValue() == i14) {
                                        break;
                                    }
                                    i16++;
                                } else {
                                    i16 = 0;
                                    break;
                                }
                            }
                            if (e7Var.getCurrentPeerView() != null && e7Var.getCurrentItem() == i11) {
                                z2 currentPeerView = e7Var.getCurrentPeerView();
                                if (currentPeerView.f49770s1 != i16) {
                                    currentPeerView.f49770s1 = i16;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                e7Var.x(i11, false);
                                z2 currentPeerView2 = e7Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    z5 z5Var = (z5) currentPeerView2.getParent();
                                    z5Var.a(true);
                                    if (e7Var.f48799x0 != null) {
                                        z2 z2Var = z5Var.f49800a;
                                        long j10 = z5Var.f49801b;
                                        ArrayList arrayList = z5Var.f49802c;
                                        z2Var.f49740k1 = j10;
                                        z2Var.f49732i1 = arrayList;
                                        z2Var.m0(i16);
                                    } else {
                                        z5Var.f49800a.S0(i16, z5Var.f49801b);
                                    }
                                }
                            }
                        } else {
                            i15++;
                        }
                    }
                } else if (H != null && H.f49770s1 != (closestPosition = z3Var.getClosestPosition())) {
                    H.f49770s1 = closestPosition;
                    H.d1(false);
                }
                z3Var.d.abortAnimation();
                ValueAnimator valueAnimator = z3Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z3Var.M = null;
                }
                z3Var.c(z3Var.K, false, true);
            }
            if (H != null) {
                g2 g2Var = H.L0;
                z3Var.f48965a = g2Var.getTop();
                z3Var.f48966b = g2Var.getMeasuredWidth();
                z3Var.f48967c = g2Var.getMeasuredHeight();
            }
            z3Var.setProgressToOpen(this.f48978f);
            a4 a4Var = this.E;
            if (a4Var.f48793w0 && this.f48978f != 1.0f) {
                a4Var.onTouchEvent(org.telegram.messenger.i0.R());
            }
            if (this.f48978f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f48978f != 1.0f) {
                a4Var.f48793w0 = false;
            }
        }
    }
}
