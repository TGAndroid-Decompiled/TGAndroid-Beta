package th;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.LaunchActivity;
public class t5 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public dc H;
    public org.telegram.ui.ActionBar.p6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public o0 Q;
    public View R;
    public int f49481c;
    public TL_stories.StoryItem d;
    public boolean f49487l;
    public boolean f49488m;
    public int f49489n;
    public boolean f49490o;
    public boolean f49491p;
    public int f49492q;
    public boolean f49493r;
    public long f49494s;
    public float f49495t;
    public boolean v;
    public boolean f49497w;
    public long f49498x;
    public int f49499y;
    public int f49500z;
    public boolean f49479a = true;
    public boolean f49480b = true;
    public float e = 1.0f;
    public float f49482f = 0.0f;
    public float f49483g = 0.0f;
    public float h = 0.0f;
    public float f49484i = 0.0f;
    public float f49485j = 0.0f;
    public boolean f49486k = true;
    public float f49496u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public t5(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.E = z10;
        this.J = p6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        e5 O1 = wp.r1(e20.f15506s0).O1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f49498x > 0) {
                    user = wp.r1(e20.f15506s0).Z1(Long.valueOf(this.f49498x));
                } else {
                    chat = wp.r1(e20.f15506s0).L0(Long.valueOf(-this.f49498x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f49493r) {
                    z10 = !O1.h.isEmpty();
                } else {
                    if (this.f49498x <= 0 ? wp.r1(e20.f15506s0).O1().K(this.f49498x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : wp.r1(e20.f15506s0).O1().K(this.f49498x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f49498x != e20.i(e20.f15506s0).f15524n && z10) {
                    dc dcVar = this.H;
                    if (dcVar == null) {
                        this.H = new dc(view, 1.5f, 5.0f);
                    } else {
                        dcVar.f25460a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        o0 o0Var = this.Q;
                        if (o0Var != null) {
                            org.telegram.messenger.i0.r(o0Var);
                        }
                        o0 o0Var2 = new o0(22, this, view);
                        this.Q = o0Var2;
                        org.telegram.messenger.i0.h3(o0Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.i0.e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.i0.e) {
                dc dcVar2 = this.H;
                if (dcVar2 != null) {
                    dcVar2.f25460a = view;
                    dcVar2.c(false);
                }
                o0 o0Var3 = this.Q;
                if (o0Var3 != null) {
                    org.telegram.messenger.i0.r(o0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dc dcVar3 = this.H;
            if (dcVar3 != null) {
                dcVar3.f25460a = view;
                dcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f49498x)) {
                wp r12 = wp.r1(e20.f15506s0);
                e5 O12 = r12.O1();
                if (this.f49493r) {
                    f(0L);
                } else if (this.f49498x != e20.i(e20.f15506s0).e()) {
                    if (O12.K(this.f49498x)) {
                        f(this.f49498x);
                    } else {
                        long j10 = this.f49498x;
                        if (j10 > 0) {
                            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
                            if (Z1 != null && !Z1.stories_unavailable && (tL_recentStory2 = Z1.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new v5().a(this.f49498x, view, this);
                            }
                        } else {
                            TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
                            if (L0 != null && !L0.stories_unavailable && (tL_recentStory = L0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new v5().a(this.f49498x, view, this);
                            }
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            o0 o0Var4 = this.Q;
            if (o0Var4 != null) {
                org.telegram.messenger.i0.r(o0Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        dc dcVar = this.H;
        if (dcVar == null) {
            return 1.0f;
        }
        return dcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        n5 n5Var;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                n5Var = n5.a((uk0) parent);
            } else {
                n5Var = null;
            }
            Q.getOrCreateStoryViewer().R(Q.getContext(), j10, n5Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
