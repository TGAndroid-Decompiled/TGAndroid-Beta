package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ht;
import org.telegram.messenger.pt;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xj0;
public abstract class y3 extends FrameLayout implements org.telegram.ui.ActionBar.k6, vs {
    public e4 D;
    public x3 E;
    public x3 F;
    public z4 G;
    public int H;
    public boolean I;
    public final xj0 J;
    public final o7 K;
    public final k3 L;
    public final l3 M;
    public final ph.h1 N;
    public final l3 O;
    public final p3 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f49683a;
    public int f49684a0;
    public final View f49685b;
    public final FrameLayout f49686c;
    public final a5.a d;
    public int e;
    public o3 f49687f;
    public final TextView h;
    public int f49688n;
    public final g3 f49689r;
    public final b f49690s;
    public final int f49691w;
    public final u3 f49692x;
    public final az f49693y;

    public y3(o7 o7Var, Context context, l3 l3Var, ph.h1 h1Var) {
        super(context);
        this.e = 96;
        this.O = new l3();
        this.M = l3Var;
        this.N = h1Var;
        b bVar = o7Var.D;
        this.f49690s = bVar;
        this.K = o7Var;
        this.f49691w = o7Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(8.0f));
        p3 p3Var = new p3(this, getContext());
        this.P = p3Var;
        g3 g3Var = new g3(this, context, bVar);
        this.f49689r = g3Var;
        g3Var.setClipToPadding(false);
        this.J = new xj0(g3Var, true);
        az azVar = new az(0, g3Var);
        this.f49693y = azVar;
        g3Var.setLayoutManager(azVar);
        g3Var.setNestedScrollingEnabled(true);
        u3 u3Var = new u3(this);
        this.f49692x = u3Var;
        g3Var.setAdapter(u3Var);
        new SparseArray();
        new HashMap();
        addView(g3Var);
        this.d = new a5.a(g3Var);
        g3Var.setOnScrollListener(new cu0(this, 23));
        g3Var.setOnItemClickListener(new mg.q0(22, this, o7Var));
        g3Var.setOnItemLongClickListener(new j3(this, o7Var));
        u3Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f49686c = frameLayout;
        View view = new View(getContext());
        this.f49683a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, bVar);
        this.f49684a0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, w7.b6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f49685b = view2;
        org.telegram.ui.ActionBar.a7.i(i10, view2, bVar);
        frameLayout.addView(view2, w7.b6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(p3Var);
        frameLayout.addView(textView);
        k3 k3Var = new k3(this, getContext(), bVar);
        this.L = k3Var;
        k3Var.setHint(dd.L0(2131745853, null));
        frameLayout.addView(k3Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(y3 y3Var) {
        new kg.i1(y3Var.K.f49317f, 14, false).show();
    }

    public static void b(y3 y3Var) {
        x3 x3Var = y3Var.E;
        if (x3Var != null) {
            x3Var.f49643r.remove(y3Var);
        }
        x3 x3Var2 = y3Var.F;
        y3Var.E = x3Var2;
        if (x3Var2 == null) {
            return;
        }
        ArrayList arrayList = x3Var2.f49643r;
        if (!arrayList.contains(y3Var)) {
            arrayList.add(y3Var);
        }
        y3Var.E.e(y3Var.O, y3Var.T, y3Var.S);
        y3Var.f49692x.E();
        y3Var.f49693y.h1(0, (int) (y3Var.getTopOffset() - y3Var.f49689r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        x3 x3Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) wp.r1(i10).f19140h0.f48937x.f(storyItem.dialogId);
            if (sparseArray == null) {
                x3Var = null;
            } else {
                x3Var = (x3) sparseArray.get(storyItem.f20032id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (x3Var != null && x3Var.f49629a == i11) {
                return;
            }
            if (x3Var != null) {
                x3Var.d();
            }
            x3 x3Var2 = new x3(i10, j10, storyItem);
            x3Var2.c();
            if (sparseArray == null) {
                a0.h hVar = wp.r1(i10).f19140h0.f48937x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f20032id, x3Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f49693y.N0() > this.f49692x.f49527c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        vh.n5 n5Var;
        vh.u6 u6Var;
        if (storyView != null) {
            int i10 = this.f49691w;
            if (wp.r1(i10).O1().N(storyView) || wp.r1(i10).G0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(storyView.user_id));
            e4 e4Var = this.D;
            if (e4Var != null) {
                TL_stories.StoryItem storyItem = e4Var.f48916a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new vh.u6(i10, storyItem.privacy);
                    }
                    return this.D.f48916a.parsedPrivacy.b(Z1);
                }
                d5 d5Var = e4Var.f48917b;
                if (d5Var != null && (n5Var = d5Var.f48892c) != null && (u6Var = n5Var.E0) != null) {
                    return u6Var.b(Z1);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        float f7;
        int i12 = 0;
        if (i10 == at.f14805v5) {
            if (this.D.f48917b != null) {
                int i13 = this.f49691w;
                TL_stories.PeerStories y3 = wp.r1(i13).f19140h0.y(e20.i(i13).f15524n);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.D.f48917b.e)) {
                            e4 e4Var = this.D;
                            e4Var.f48917b = null;
                            e4Var.f48916a = storyItem;
                            g(this.W, e4Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != at.f14677a3) {
        } else {
            while (true) {
                g3 g3Var = this.f49689r;
                if (i12 < g3Var.getChildCount()) {
                    View childAt = g3Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.q6) && (R = RecyclerView.R(childAt)) >= 0) {
                        u3 u3Var = this.f49692x;
                        if (R < u3Var.f49527c.size()) {
                            org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) childAt;
                            if (d(((q3) u3Var.f49527c.get(R)).f49400b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            q6Var.a(true, f7);
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g3 g3Var;
        int paddingTop;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            g3Var = this.f49689r;
            if (i11 >= g3Var.getChildCount()) {
                break;
            }
            View childAt = g3Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S < i10 || i10 == -1) {
                view = childAt;
                i10 = S;
            }
            i11++;
        }
        if (i10 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i10 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = g3Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f49686c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            b4 b4Var = (b4) this;
            int intValue = ((Integer) b4Var.getTag()).intValue();
            f4 f4Var = b4Var.f48815b0.e;
            z3 z3Var = f4Var.h;
            if (intValue == f4Var.E.getCurrentItem()) {
                z3Var.setAlpha(Utilities.i(f7 / f4Var.d, 1.0f, 0.0f));
                z3Var.setTranslationY((-(f4Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-org.telegram.messenger.i0.L(6.0f), paddingTop, org.telegram.messenger.i0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != g3Var.getPaddingTop()) {
                int i12 = (frameLayout.getTranslationY() > (g3Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (g3Var.getPaddingTop() / 2.0f) ? 0 : -1));
                a5.a aVar = this.d;
                if (i12 > 0) {
                    aVar.y((int) (-(g3Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f49689r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.i0.L(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(x3 x3Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        u3 u3Var = this.f49692x;
        int size = u3Var.f49527c.size();
        l3 l3Var = this.O;
        if (TextUtils.isEmpty(l3Var.f49183c) && !l3Var.f49182b) {
            i();
        }
        u3Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = x3Var.f49634i;
            if (x3Var == this.E && arrayList != null && this.H < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = this.H; i10 < arrayList.size(); i10++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = org.telegram.messenger.o5.o(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.H = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.G.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j10, e4 e4Var) {
        this.W = j10;
        this.D = e4Var;
        i();
        h(false);
        if (e4Var != null && e4Var.f48916a != null) {
            pt t10 = pt.t(this.f49691w);
            int i10 = e4Var.f48916a.f20032id;
            if (j10 == t10.getUserConfig().e()) {
                pt.f17637k0.c(new ht(t10, i10, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f49686c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        l3 l3Var = this.O;
        boolean z11 = l3Var.f49182b;
        p3 p3Var = this.P;
        if (z11 != p3Var.f49378s || !z10) {
            ValueAnimator valueAnimator = p3Var.f49380x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                p3Var.f49380x.cancel();
            }
            p3Var.f49378s = z11 ? 1 : 0;
            if (!z10) {
                p3Var.f49377r = 1.0f;
                p3Var.invalidate();
            } else {
                p3Var.e.set(p3Var.f49376n);
                p3Var.f49375f = p3Var.f49374c.getAlpha();
                p3Var.h = p3Var.d.getAlpha();
                p3Var.f49377r = 0.0f;
                p3Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                p3Var.f49380x = ofFloat;
                ofFloat.addUpdateListener(new qh.e0(p3Var, 19));
                p3Var.f49380x.addListener(new sg.r(p3Var, 10));
                p3Var.f49380x.setDuration(250L);
                p3Var.f49380x.setInterpolator(gr.f26523f);
                p3Var.f49380x.start();
            }
        }
        boolean z12 = l3Var.f49181a;
        cl0 cl0Var = p3Var.f49379w;
        if (z12) {
            x3 x3Var = this.E;
            if (x3Var != null && x3Var.f49632f) {
                i10 = 2131231922;
            } else {
                i10 = 2131231917;
            }
        } else {
            i10 = 2131231920;
        }
        cl0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: th.y3.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        x3 x3Var = this.E;
        if (x3Var != null) {
            ArrayList arrayList = x3Var.f49643r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f49641p.clear();
        }
        this.f49692x.E();
        int i10 = this.f49691w;
        at.f(i10).c(this, at.f14805v5);
        at.f(i10).c(this, at.f14677a3);
        setTag(2131296351, new org.telegram.ui.Components.k7(this, 9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        x3 x3Var = this.E;
        if (x3Var != null) {
            x3Var.f49643r.remove(this);
        }
        int i10 = this.f49691w;
        at.f(i10).n(this, at.f14805v5);
        at.f(i10).n(this, at.f14677a3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f49686c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f49686c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        g3 g3Var = this.f49689r;
        if (f7 != g3Var.getPaddingBottom()) {
            g3Var.setPadding(0, (int) f7, 0, 0);
            g3Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.f49690s);
            View view = this.f49683a;
            if (view != null && w02 != this.f49684a0) {
                this.f49684a0 = w02;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, 0}));
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
