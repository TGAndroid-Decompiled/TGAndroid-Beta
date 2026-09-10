package zh;

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
import bi.pb;
import bi.r9;
import bi.rd;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zk0;
public abstract class z3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public y3 E;
    public y3 F;
    public c5 G;
    public int H;
    public boolean I;
    public final zk0 J;
    public final u7 K;
    public final l3 L;
    public final m3 M;
    public final bi.i5 N;
    public final m3 O;
    public final q3 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f49137a;
    public final View f49138b;
    public final FrameLayout f49139c;
    public final a5.a d;
    public int e;
    public p3 f49140f;
    public final TextView h;
    public int f49141n;
    public final h3 f49142r;
    public final b f49143s;
    public final int v;
    public final v3 f49144w;
    public final wz f49145x;
    public f4 f49146y;

    public z3(u7 u7Var, Context context, m3 m3Var, bi.i5 i5Var) {
        super(context);
        this.e = 96;
        this.O = new m3();
        this.M = m3Var;
        this.N = i5Var;
        b bVar = u7Var.f48972y;
        this.f49143s = bVar;
        this.K = u7Var;
        this.v = u7Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        q3 q3Var = new q3(this, getContext());
        this.P = q3Var;
        h3 h3Var = new h3(this, context, bVar);
        this.f49142r = h3Var;
        h3Var.setClipToPadding(false);
        this.J = new zk0(h3Var, true);
        wz wzVar = new wz(h3Var, 0);
        this.f49145x = wzVar;
        h3Var.setLayoutManager(wzVar);
        h3Var.setNestedScrollingEnabled(true);
        v3 v3Var = new v3(this);
        this.f49144w = v3Var;
        h3Var.setAdapter(v3Var);
        new SparseArray();
        new HashMap();
        addView(h3Var);
        this.d = new a5.a(h3Var);
        h3Var.setOnScrollListener(new al0(this, 21));
        h3Var.setOnItemClickListener(new ai.b0(24, this, u7Var));
        h3Var.setOnItemLongClickListener(new k3(this, u7Var));
        v3Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f49139c = frameLayout;
        View view = new View(getContext());
        this.f49137a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, w7.a6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f49138b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, w7.a6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(q3Var);
        frameLayout.addView(textView);
        l3 l3Var = new l3(this, getContext(), bVar);
        this.L = l3Var;
        l3Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(l3Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(z3 z3Var) {
        new qg.a1(z3Var.K.f48931f, 14, false).show();
    }

    public static void b(z3 z3Var) {
        y3 y3Var = z3Var.E;
        if (y3Var != null) {
            y3Var.f49105r.remove(z3Var);
        }
        y3 y3Var2 = z3Var.F;
        z3Var.E = y3Var2;
        if (y3Var2 == null) {
            return;
        }
        ArrayList arrayList = y3Var2.f49105r;
        if (!arrayList.contains(z3Var)) {
            arrayList.add(z3Var);
        }
        z3Var.E.e(z3Var.O, z3Var.T, z3Var.S);
        z3Var.f49144w.E();
        z3Var.f49145x.h1(0, (int) (z3Var.getTopOffset() - z3Var.f49142r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        y3 y3Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f48518x.f(storyItem.dialogId);
            if (sparseArray == null) {
                y3Var = null;
            } else {
                y3Var = (y3) sparseArray.get(storyItem.f17435id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (y3Var != null && y3Var.f49091a == i11) {
                return;
            }
            if (y3Var != null) {
                y3Var.d();
            }
            y3 y3Var2 = new y3(i10, j3, storyItem);
            y3Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.f48518x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f17435id, y3Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f49145x.N0() > this.f49144w.f48987c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        r9 r9Var;
        pb pbVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        f4 f4Var = this.f49146y;
        if (f4Var != null) {
            TL_stories.StoryItem storyItem = f4Var.f48412a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new pb(i10, storyItem.privacy);
                }
                return this.f49146y.f48412a.parsedPrivacy.b(user);
            }
            h5 h5Var = f4Var.f48413b;
            if (h5Var != null && (r9Var = h5Var.f48473c) != null && (pbVar = r9Var.E0) != null) {
                return pbVar.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        float f7;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f49146y.f48413b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f49146y.f48413b.e)) {
                            f4 f4Var = this.f49146y;
                            f4Var.f48413b = null;
                            f4Var.f48412a = storyItem;
                            g(this.W, f4Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                h3 h3Var = this.f49142r;
                if (i12 < h3Var.getChildCount()) {
                    View childAt = h3Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.p6) && (R = RecyclerView.R(childAt)) >= 0) {
                        v3 v3Var = this.f49144w;
                        if (R < v3Var.f48987c.size()) {
                            org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                            if (d(((r3) v3Var.f48987c.get(R)).f48828b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            p6Var.a(f7, true);
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
        h3 h3Var;
        int paddingTop;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            h3Var = this.f49142r;
            if (i10 >= h3Var.getChildCount()) {
                break;
            }
            View childAt = h3Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        if (i11 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i11 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = h3Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f49139c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            c4 c4Var = (c4) this;
            int intValue = ((Integer) c4Var.getTag()).intValue();
            g4 g4Var = c4Var.f48325a0.e;
            a4 a4Var = g4Var.h;
            if (intValue == g4Var.E.getCurrentItem()) {
                a4Var.setAlpha(Utilities.clamp(f7 / g4Var.d, 1.0f, 0.0f));
                a4Var.setTranslationY((-(g4Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != h3Var.getPaddingTop()) {
                a5.a aVar = this.d;
                if (frameLayout.getTranslationY() > h3Var.getPaddingTop() / 2.0f) {
                    aVar.u((int) (-(h3Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.u((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f49142r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(y3 y3Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        v3 v3Var = this.f49144w;
        int size = v3Var.f48987c.size();
        m3 m3Var = this.O;
        if (TextUtils.isEmpty(m3Var.f48685c) && !m3Var.f48684b) {
            i();
        }
        v3Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = y3Var.f49096i;
            if (y3Var == this.E && arrayList != null && this.H < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = this.H; i10 < arrayList.size(); i10++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
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

    public final void g(long j3, f4 f4Var) {
        this.W = j3;
        this.f49146y = f4Var;
        i();
        h(false);
        if (f4Var != null && f4Var.f48412a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, f4Var.f48412a.f17435id);
        }
    }

    public float getTopOffset() {
        return this.f49139c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        m3 m3Var = this.O;
        boolean z11 = m3Var.f48684b;
        q3 q3Var = this.P;
        if (z11 != q3Var.f48813s || !z10) {
            ValueAnimator valueAnimator = q3Var.f48814w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                q3Var.f48814w.cancel();
            }
            q3Var.f48813s = z11 ? 1 : 0;
            if (!z10) {
                q3Var.f48812r = 1.0f;
                q3Var.invalidate();
            } else {
                q3Var.e.set(q3Var.f48811n);
                q3Var.f48810f = q3Var.f48809c.getAlpha();
                q3Var.h = q3Var.d.getAlpha();
                q3Var.f48812r = 0.0f;
                q3Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q3Var.f48814w = ofFloat;
                ofFloat.addUpdateListener(new qg.o(q3Var, 24));
                q3Var.f48814w.addListener(new yg.b(q3Var, 11));
                q3Var.f48814w.setDuration(250L);
                q3Var.f48814w.setInterpolator(wr.f28819f);
                q3Var.f48814w.start();
            }
        }
        boolean z12 = m3Var.f48683a;
        am0 am0Var = q3Var.v;
        if (z12) {
            y3 y3Var = this.E;
            if (y3Var != null && y3Var.f49094f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        am0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: zh.z3.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        y3 y3Var = this.E;
        if (y3Var != null) {
            ArrayList arrayList = y3Var.f49105r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f49103p.clear();
        }
        this.f49144w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        pc.a(this, new rd(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        y3 y3Var = this.E;
        if (y3Var != null) {
            y3Var.f49105r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        pc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f49139c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f49139c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        h3 h3Var = this.f49142r;
        if (f7 != h3Var.getPaddingBottom()) {
            h3Var.setPadding(0, (int) f7, 0, 0);
            h3Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
