package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
public final class o7 implements us, org.telegram.ui.ActionBar.g2, lf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f49287x1;
    public static TL_stories.StoryItem f49289z1;
    public s0 A0;
    public g7 B0;
    public SurfaceView C0;
    public vh.s2 D0;
    public boolean E;
    public vh.s2 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public k2.t0 G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final e2.f J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public k5 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public x4 O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public TL_stories.StoryItem T0;
    public float U;
    public int U0;
    public float V;
    public boolean V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean f49291a0;
    public boolean f49292a1;
    public float f49294b0;
    public final i2 f49295b1;
    public boolean f49297c0;
    public boolean f49298c1;
    public float f49299d0;
    public b6 f49300d1;
    public float f49301e0;
    public final LongSparseIntArray f49302e1;
    public final org.telegram.ui.ActionBar.k2 f49303f;
    public boolean f49304f0;
    public boolean f49305f1;
    public boolean f49306g0;
    public boolean f49307g1;
    public int h;
    public boolean f49308h0;
    public boolean f49309h1;
    public GestureDetector f49310i0;
    public boolean f49311i1;
    public boolean f49312j0;
    public boolean f49313j1;
    public boolean f49314k0;
    public boolean f49315k1;
    public boolean f49316l0;
    public boolean l1;
    public boolean m0;
    public boolean f49317m1;
    public WindowManager f49318n;
    public e7 f49319n0;
    public sg.v f49320n1;
    public i2 f49322o1;
    public int f49323p0;
    public boolean f49324p1;
    public boolean f49325q0;
    public float f49326q1;
    public WindowManager.LayoutParams f49327r;
    public float f49328r0;
    public boolean f49329r1;
    public c7 f49330s;
    public final l7 f49331s0;
    public boolean f49332s1;
    public k7 f49333t0;
    public long f49334t1;
    public Dialog f49335u0;
    public i5 f49336u1;
    public org.telegram.ui.ActionBar.g2 f49337v0;
    public ValueAnimator f49338v1;
    public d7 f49339w;
    public boolean f49340w0;
    public boolean f49341w1;
    public f4 f49342x;
    public final ArrayList f49343x0;
    public boolean f49344y;
    public org.telegram.ui.k4 f49345y0;
    public n7 f49346z0;
    public static final ArrayList f49288y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f49290a = tz.f18135b0;
    public boolean f49293b = true;
    public boolean f49296c = false;
    public boolean d = false;
    public boolean e = true;
    public final b D = new b();
    public final RectF T = new RectF();
    public final float[] f49321o0 = new float[2];

    public o7(org.telegram.ui.ActionBar.k2 k2Var) {
        ?? obj = new Object();
        obj.f49190k = 1.0f;
        this.f49331s0 = obj;
        this.f49343x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new e2.f(null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f49295b1 = new i2(this, 4);
        this.f49302e1 = new LongSparseIntArray();
        new Paint(1);
        this.f49303f = k2Var;
    }

    public static CharSequence I(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j10 + (j10 >> 16) + (storyItem.f20031id << 16), "");
    }

    public static boolean L(jj jjVar) {
        if (f49289z1 == null || ((jjVar.D != 23 && !jjVar.Z4()) || A1 || f49289z1.messageId != jjVar.f1() || f49289z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void X(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            E1.put(j10 + (j10 >> 16) + (storyItem.f20031id << 16), editable);
        }
    }

    public static boolean u(o7 o7Var, c7 c7Var, float f7, float f10, boolean z10) {
        t1 t1Var;
        t1 t1Var2;
        if (c7Var != null) {
            if (!o7Var.X0) {
                if (o7Var.f49342x == null || o7Var.f49301e0 == 0.0f) {
                    z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f7 - o7Var.f49339w.getX()) - o7Var.f49319n0.getX()) - currentPeerView.getX(), ((f10 - o7Var.f49339w.getY()) - o7Var.f49319n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f49703e2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (t1Var2 = currentPeerView.K1) != null && t1Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.K1.getY() + currentPeerView.getY() + o7Var.f49319n0.getY() + o7Var.f49339w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (t1Var = currentPeerView.K1) != null && t1Var.t0()) || o7Var.f49336u1 != null) {
                        return true;
                    }
                    return org.telegram.messenger.i0.Y(c7Var, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void v(o7 o7Var) {
        el0 el0Var;
        mt editField;
        z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.K1 != null && (((el0Var = currentPeerView.K2) == null || el0Var.getVisibility() != 0) && (editField = currentPeerView.K1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.i0.J3(editField);
            org.telegram.messenger.i0.h3(new i2(o7Var, 6), 200L);
            return;
        }
        o7Var.y();
    }

    public static void w(o7 o7Var) {
        float l4 = Utilities.l(Math.abs(Math.max(o7Var.X, o7Var.W) / org.telegram.messenger.i0.L(80.0f)));
        if (o7Var.V != l4) {
            o7Var.V = l4;
            o7Var.B();
            z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f49711g2) {
                currentPeerView.invalidate();
            }
            s0 s0Var = o7Var.A0;
            if (s0Var != null) {
                s0Var.v((1.0f - o7Var.V) * o7Var.U);
            }
        }
        c7 c7Var = o7Var.f49330s;
        if (c7Var != null) {
            c7Var.invalidate();
        }
    }

    public final void A(boolean z10) {
        if (this.f49338v1 == null) {
            if (this.f49323p0 != 0) {
                org.telegram.messenger.i0.v1(this.f49342x);
                return;
            }
            float f7 = 0.0f;
            if (!this.f49297c0 && this.f49301e0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z10) {
                float f10 = this.f49301e0;
                f4 f4Var = this.f49342x;
                float f11 = f4Var.f48963c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f49301e0 = f12;
                    f4Var.setOffset(f12);
                }
            }
            float f13 = this.f49301e0;
            if (z10) {
                f7 = this.f49342x.f48963c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f49338v1 = ofFloat;
            ofFloat.addUpdateListener(new w6(this, 3));
            this.f49338v1.addListener(new sg.y(4, this, z10));
            if (z10) {
                this.f49338v1.setDuration(350L);
                this.f49338v1.setInterpolator(gr.h);
            } else {
                this.f49338v1.setDuration(350L);
                this.f49338v1.setInterpolator(gr.f26495f);
            }
            this.f49338v1.start();
        }
    }

    public final void B() {
        LaunchActivity launchActivity;
        if (this.f49293b && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void C() {
        if (this.f49342x == null) {
            f4 f4Var = new f4(this.f49339w.getContext(), this);
            this.f49342x = f4Var;
            this.f49339w.addView(f4Var, 0);
        }
        z2 currentPeerView = this.f49319n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f49636i.size(); i10++) {
                    arrayList.add(((jj) this.O0.f49636i.get(i10)).f16341l);
                }
                this.f49342x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f49342x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void D(boolean z10) {
        org.telegram.messenger.i0.v1(this.f49330s);
        this.H0 = true;
        this.f49309h1 = true;
        d0();
        a0(false);
        e0();
        this.J0.d();
        this.f49294b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new w6(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            l7 l7Var = this.f49331s0;
            ImageReceiver imageReceiver = l7Var.f49184b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = l7Var.f49185c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            l7Var.f49185c = null;
            l7Var.f49184b = null;
        } else {
            M();
        }
        org.telegram.messenger.i0.h3(new i2(this, 2), 16L);
        if (this.f49298c1) {
            this.f49298c1 = false;
        }
    }

    public final void E() {
        z2 z2Var;
        e7 e7Var = this.f49319n0;
        if (e7Var != null) {
            ArrayList arrayList = e7Var.P0;
            for (int i10 = 0; i10 < e7Var.getChildCount(); i10++) {
                View childAt = e7Var.getChildAt(i10);
                if ((childAt instanceof z5) && (z2Var = ((z5) childAt).f49786a) != null && !z2Var.E3) {
                    z2Var.E3 = true;
                    t1 t1Var = z2Var.K1;
                    if (t1Var != null) {
                        t1Var.z0();
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                z2 z2Var2 = (z2) arrayList.get(i11);
                if (!z2Var2.E3) {
                    z2Var2.E3 = true;
                    t1 t1Var2 = z2Var2.K1;
                    if (t1Var2 != null) {
                        t1Var2.z0();
                    }
                }
            }
        }
    }

    public final void F(KeyEvent keyEvent) {
        if (D1) {
            c0();
            return;
        }
        z2 currentPeerView = this.f49319n0.getCurrentPeerView();
        if (currentPeerView != null) {
            y2 y2Var = currentPeerView.f49776x1;
            if (!y2Var.j() && y2Var.e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f49300d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void G(Runnable runnable) {
        if (runnable != null) {
            this.f49343x0.add(runnable);
        }
    }

    public final z2 H() {
        e7 e7Var = this.f49319n0;
        if (e7Var == null) {
            return null;
        }
        return e7Var.getCurrentPeerView();
    }

    public final void J() {
        if (this.m0) {
            org.telegram.messenger.i0.v1(this.f49330s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            d0();
            this.O = 0.0f;
            this.N = 0.0f;
            l7 l7Var = this.f49331s0;
            ImageReceiver imageReceiver = l7Var.f49184b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = l7Var.f49185c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            l7Var.f49185c = null;
            l7Var.f49184b = null;
            d7 d7Var = this.f49339w;
            if (d7Var != null) {
                d7Var.a(true);
            }
            this.J0.e();
            k2.t0 t0Var = this.G0;
            if (t0Var != null) {
                t0Var.b();
            }
            W();
            if (this.f49293b) {
                org.telegram.messenger.i0.E2(this.f49330s);
            } else {
                this.f49318n.removeView(this.f49330s);
            }
            this.f49330s = null;
            E();
            this.m0 = false;
            this.d = false;
            B();
            i2 i2Var = this.f49322o1;
            if (i2Var != null) {
                i2Var.run();
                this.f49322o1 = null;
            }
        }
    }

    public final boolean K() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f49325q0 && !this.f49344y && this.f49335u0 == null && this.f49337v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f49301e0 == 0.0f && !this.f49311i1) {
            if ((!this.l1 || !this.f49290a) && !this.f49315k1 && !this.f49313j1 && !this.f49324p1 && this.V == 0.0f && this.f49336u1 == null) {
                if (!this.f49293b || (k2Var = this.f49303f) == null || k2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: th.o7.M():void");
    }

    public final void N(boolean z10) {
        int i10;
        Activity W = org.telegram.messenger.i0.W(this.f49303f.getContext());
        if (W != null) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            try {
                W.setRequestedOrientation(i10);
            } catch (Exception unused) {
            }
            if (z10) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void O(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, x4 x4Var, TL_stories.PeerStories peerStories, k7 k7Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.i0.E1(context);
        ArrayList arrayList2 = this.f49343x0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (this.m0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        n7 n7Var = this.f49346z0;
        if (n7Var != null) {
            n7Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!org.telegram.messenger.i0.Q1() && !this.f49329r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49293b = z11;
        if (tz.f18135b0 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f49290a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && x4Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f49289z1 = storyItem;
        }
        this.O0 = x4Var;
        this.Q0 = peerStories;
        this.f49333t0 = k7Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        e7 e7Var = this.f49319n0;
        if (e7Var != null) {
            e7Var.setHorizontalProgressToDismiss(0.0f);
            this.f49319n0.F0 = 0;
        }
        this.f49299d0 = 0.0f;
        this.Z = 0.0f;
        this.f49316l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f49292a1 = false;
        this.Z0 = false;
        this.f49302e1.clear();
        org.telegram.messenger.i0.r(this.f49295b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f49327r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.i0.m(layoutParams);
        this.f49327r.flags = -2147417728;
        this.H0 = false;
        this.f49298c1 = false;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (this.f49330s == null) {
            this.f49310i0 = new GestureDetector(new y6(this));
            this.f49330s = new c7(this, context, Q);
        }
        if (this.f49339w == null) {
            this.f49339w = new d7(context, this);
            e7 e7Var2 = new e7(this, this.h, context, this, this.D);
            this.f49319n0 = e7Var2;
            e7Var2.setDelegate(new f7(this, x4Var, arrayList, context));
            this.f49339w.addView(this.f49319n0, w7.b6.e(-1, -1, 1));
            this.f49345y0 = new org.telegram.ui.k4(context);
            if (this.f49290a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f49345y0.addView(this.C0);
            } else {
                g7 g7Var = new g7(context, this);
                this.B0 = g7Var;
                this.f49345y0.addView(g7Var);
            }
            vh.s2 s2Var = new vh.s2(context, this.h);
            this.D0 = s2Var;
            s2Var.setVisibility(8);
            this.f49345y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f48804a = paint;
            view.f48806c = new ew(view, 29);
            view.d = new org.telegram.ui.Components.t5((View) view);
            view.e = new org.telegram.ui.Components.t5((View) view);
            paint.setColor(-1);
            this.f49300d1 = view;
            this.f49339w.addView((View) view, w7.b6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        vh.s2 s2Var2 = this.D0;
        if (s2Var2 != null) {
            s2Var2.setAccount(this.h);
        }
        org.telegram.messenger.i0.E2(this.f49345y0);
        this.f49330s.addView(this.f49345y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.i0.E2(this.f49339w);
        this.f49330s.addView(this.f49339w);
        this.f49330s.setClipChildren(false);
        if (this.N0) {
            e0();
        }
        if (x4Var != null) {
            this.f49319n0.D(this.h, x4Var.d, x4Var.h());
        } else {
            e7 e7Var3 = this.f49319n0;
            int i13 = this.h;
            e7Var3.A0 = arrayList;
            e7Var3.f48786y0 = i13;
            e7Var3.setAdapter(null);
            e7Var3.setAdapter(e7Var3.f48787z0);
            e7Var3.setCurrentItem(i11);
            e7Var3.C0 = true;
        }
        this.f49318n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f49293b = false;
        }
        if (this.f49293b && Q != null && Q.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f49296c = z14;
        d7 d7Var = this.f49339w;
        rh.d0 d0Var = new rh.d0(this, 18);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(d7Var, d0Var);
        if (this.f49293b) {
            org.telegram.messenger.i0.E2(this.f49330s);
            this.f49330s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f49330s);
            if (!this.f49296c) {
                org.telegram.messenger.i0.Z2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f49330s.setFocusable(false);
            this.f49339w.setFocusable(false);
            this.f49339w.setSystemUiVisibility(1792);
            org.telegram.messenger.i0.x3(this.f49318n, this.f49330s, this.f49327r);
            this.f49318n.addView(this.f49330s, this.f49327r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f49330s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
            }
        }
        this.f49330s.requestLayout();
        A1 = true;
        e0();
        this.U = 0.0f;
        B();
        f49287x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f49330s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f49293b) {
            N(true);
        }
        if (!this.f49293b) {
            f49288y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.i0.v1(Q.getFragmentView());
        }
    }

    public final void P(int i10, Context context, TL_stories.StoryItem storyItem, k7 k7Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || vp.r1(i10).Z1(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && vp.r1(this.h).L0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                O(i10, context, storyItem, arrayList, 0, null, null, k7Var, false);
            }
        }
    }

    public final void Q(Context context, int i10, x4 x4Var, n5 n5Var) {
        this.h = d20.f15147s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(x4Var.d));
        this.P0 = i10;
        T(context, null, arrayList, 0, x4Var, null, n5Var, false);
    }

    public final void R(Context context, long j10, k7 k7Var) {
        this.h = d20.f15147s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        e5 O1 = vp.r1(this.h).O1();
        int i10 = O1.f48904a;
        TL_stories.PeerStories y3 = O1.y(j10);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (w5.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !O1.L(j10)) {
                O1.f48908g.remove(y3);
                O1.h.remove(y3);
                zs.f(i10).k(zs.f19709v5, new Object[0]);
            }
        }
        T(context, null, arrayList, 0, null, null, k7Var, false);
    }

    public final void S(Context context, TL_stories.PeerStories peerStories, k7 k7Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = d20.f15147s0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.o5.o(peerStories.peer)));
            T(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, k7Var, false);
            return;
        }
        this.f49343x0.clear();
    }

    public final void T(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, x4 x4Var, TL_stories.PeerStories peerStories, k7 k7Var, boolean z10) {
        O(d20.f15147s0, context, storyItem, arrayList, i10, x4Var, peerStories, k7Var, z10);
    }

    public final void U(Context context, TL_stories.StoryItem storyItem, n5 n5Var) {
        P(d20.f15147s0, context, storyItem, n5Var);
    }

    public final void V(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f49293b) {
            Q.presentFragment(k2Var);
            return;
        }
        Q.presentFragment(k2Var);
        D(false);
    }

    public final void W() {
        ArrayList arrayList;
        this.F0 = null;
        Y(false);
        x(true);
        n7 n7Var = this.f49346z0;
        if (n7Var != null) {
            n7Var.release(null);
            this.f49346z0 = null;
        }
        vh.s2 s2Var = this.D0;
        if (s2Var != null) {
            s2Var.d(0L, null);
        }
        s0 s0Var = this.A0;
        if (s0Var != null) {
            w0 w0Var = w0.Z;
            if (!w0Var.S || w0Var.f49556w != s0Var) {
                if (s0Var.f49423n) {
                    s0Var.s(null);
                } else {
                    s0Var.e();
                }
            }
        }
        this.A0 = null;
        int i10 = 0;
        while (true) {
            arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n7) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.h hVar = vp.r1(this.h).O1().f48913m;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            ((x7) hVar.n(i11)).b(false);
        }
        if (this.f49293b) {
            N(false);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f49303f;
        if (k2Var != null) {
            k2Var.removeSheet(this);
        }
        f49288y1.remove(this);
        this.f49343x0.clear();
        this.f49301e0 = 0.0f;
        f49289z1 = null;
    }

    public final void Y(boolean z10) {
        this.f49325q0 = z10;
        if (z10) {
            ew ewVar = this.f49300d1.f48806c;
            org.telegram.messenger.i0.r(ewVar);
            ewVar.run();
        }
        d0();
    }

    public final void Z(boolean z10) {
        z2 currentPeerView;
        z2 currentPeerView2;
        y2 y2Var;
        n7 n7Var;
        k2.t0 t0Var;
        if (this.f49292a1 != z10) {
            this.f49292a1 = z10;
            if (z10 && !this.f49305f1 && (currentPeerView2 = this.f49319n0.getCurrentPeerView()) != null && (y2Var = currentPeerView2.f49776x1) != null && !y2Var.f49664f && y2Var.f49662b == null) {
                if (!this.f49314k0 && !this.f49312j0 && (t0Var = this.G0) != null && ((n7) t0Var.f10768c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.t2.IMPACT_LIGHT.a();
                }
                k2.t0 t0Var2 = this.G0;
                if (t0Var2 != null && (n7Var = (n7) t0Var2.f10768c) != null && !this.f49314k0) {
                    n7Var.setSeeking(true);
                }
                this.f49314k0 = true;
            }
            d0();
            e7 e7Var = this.f49319n0;
            if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f49292a1);
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        D(true);
    }

    public final void a0(boolean z10) {
        boolean z11;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (this.f49293b && launchActivity != null) {
            if (z10) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z11 = v7.u7.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z11 = false;
                }
                this.f49340w0 = z11;
            }
            if (this.f49340w0) {
                org.telegram.messenger.i0.l3(launchActivity, !z10);
            }
        }
    }

    public final void b0() {
        org.telegram.ui.ActionBar.k2 k2Var;
        Context context;
        if (this.A0 != null && (k2Var = this.f49303f) != null && this.D0 != null) {
            Activity W = org.telegram.messenger.i0.W(k2Var.getContext());
            if (mf.b.a(W) > 0) {
                s0 s0Var = this.A0;
                w0 w0Var = w0.Z;
                if (s0Var != null && !w0Var.S) {
                    w0Var.S = true;
                    w0Var.f49556w = s0Var;
                    int i10 = s0Var.e;
                    w0Var.f49557x = i10;
                    zs.f(i10).b(w0Var, zs.G2);
                    w0Var.J = w0Var.h();
                    w0Var.K = w0Var.f();
                    w0Var.M = 1.0f;
                    w0Var.H = false;
                    o1.j jVar = new o1.j(w0Var, w0.X);
                    o1.k kVar = new o1.k();
                    kVar.a(0.75f);
                    kVar.b(650.0f);
                    jVar.f13957m = kVar;
                    w0Var.P = jVar;
                    o1.j jVar2 = new o1.j(w0Var, w0.Y);
                    o1.k kVar2 = new o1.k();
                    kVar2.a(0.75f);
                    kVar2.b(650.0f);
                    jVar2.f13957m = kVar2;
                    w0Var.Q = jVar2;
                    if (W != null) {
                        context = W;
                    } else {
                        context = org.telegram.messenger.w0.f19025b;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    w0Var.f49558y = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    w0Var.f49558y.setStylusScaleEnabled(false);
                    w0Var.D = new m2.t(context, new u0(scaledTouchSlop));
                    org.telegram.ui.Wallet.f6 f6Var = new org.telegram.ui.Wallet.f6(context, 1);
                    f6Var.f34504b = new Path();
                    w0Var.e = f6Var;
                    ?? viewGroup = new ViewGroup(context);
                    w0Var.d = viewGroup;
                    viewGroup.addView(w0Var.e, w7.b6.c(-1.0f, -1));
                    w0Var.e.setOutlineProvider(new bi.d2(24));
                    w0Var.e.setClipToOutline(true);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Ug, w0Var.e, null);
                    g9 g9Var = new g9(context);
                    w0Var.f49553n = g9Var;
                    w0Var.e.addView(g9Var, w7.b6.c(-1.0f, -1));
                    vh.s2 s2Var = new vh.s2(context, w0Var.f49557x);
                    w0Var.f49552f = s2Var;
                    s2Var.setAlpha(0.0f);
                    w0Var.e.addView(w0Var.f49552f, w7.b6.c(-1.0f, -1));
                    bn bnVar = new bn(context, 25);
                    w0Var.f49554r = bnVar;
                    w0Var.e.addView(bnVar, w7.b6.c(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    w0Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    w0Var.h.addView(view, w7.b6.c(-1.0f, -1));
                    int L = org.telegram.messenger.i0.L(8.0f);
                    ImageView e = z20.e(context, 2131232544);
                    int i11 = org.telegram.ui.ActionBar.t6.Vg;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    org.telegram.ui.ActionBar.a7.t(e, i11, null, mode);
                    int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
                    e.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1));
                    e.setPadding(L, L, L, L);
                    e.setOnClickListener(new bh.c(25));
                    float f7 = 38;
                    float f10 = 4;
                    w0Var.h.addView(e, w7.b6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131232545);
                    org.telegram.ui.ActionBar.a7.t(imageView, i11, null, mode);
                    imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1));
                    imageView.setPadding(L, L, L, L);
                    imageView.setOnClickListener(new rh.u1(4, s0Var, context));
                    w0Var.h.addView(imageView, w7.b6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
                    w0Var.e.addView(w0Var.h, w7.b6.c(-1.0f, -1));
                    w0Var.f49550b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = mf.b.b(context, false);
                    w0Var.f49551c = b10;
                    int i13 = w0Var.J;
                    b10.width = i13;
                    b10.height = w0Var.K;
                    Point point = org.telegram.messenger.i0.f16026q;
                    float L2 = (point.x - i13) - org.telegram.messenger.i0.L(16.0f);
                    w0Var.N = L2;
                    b10.x = (int) L2;
                    WindowManager.LayoutParams layoutParams = w0Var.f49551c;
                    float L3 = (point.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f);
                    w0Var.O = L3;
                    layoutParams.y = (int) L3;
                    WindowManager.LayoutParams layoutParams2 = w0Var.f49551c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    w0Var.d.setAlpha(0.0f);
                    w0Var.d.setScaleX(0.1f);
                    w0Var.d.setScaleY(0.1f);
                    org.telegram.messenger.i0.x3(w0Var.f49550b, w0Var.d, w0Var.f49551c);
                    w0Var.f49550b.addView(w0Var.d, w0Var.f49551c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(gr.f26495f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(w0Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(w0Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(w0Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new e00(1));
                    animatorSet.start();
                    w0Var.a();
                    zs.e().k(zs.F2, new Object[0]);
                    jf.f fVar = w0Var.L;
                    if (fVar != null) {
                        fVar.c();
                        w0Var.L = null;
                    }
                    if (W != null && mf.b.a(W) == 1) {
                        jf.e eVar = new jf.e(W, w0Var);
                        eVar.f9854c = "pip-live-story";
                        eVar.e = 1;
                        eVar.d = org.telegram.messenger.i0.L(10.0f);
                        eVar.f9858j = w0Var.d;
                        eVar.f9859k = w0Var.f49552f.getPlaceholderView();
                        w0Var.L = eVar.a();
                    }
                }
                D(true);
            }
        }
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        vh.s2 s2Var = this.E0;
        if (s2Var != null) {
            s2Var.setOnFirstFrameCallback(oVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f49293b) {
            org.telegram.messenger.i0.E2(this.f49330s);
        } else {
            this.f49318n.removeView(this.f49330s);
        }
        this.f49330s.invalidate();
    }

    public final void c0() {
        boolean z10 = D1;
        D1 = !z10;
        n7 n7Var = this.f49346z0;
        int i10 = 0;
        if (n7Var != null) {
            n7Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n7) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        z2 currentPeerView = this.f49319n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f49710g1.a(D1, true);
        }
        if (!D1) {
            this.f49300d1.b();
        }
    }

    @Override
    public final View d() {
        return this.f49330s;
    }

    public final void d0() {
        if (this.f49319n0 == null) {
            return;
        }
        boolean K = K();
        boolean z10 = true;
        if (this.f49293b) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f49303f;
            if (k2Var.isPaused() || !k2Var.isLastFragment()) {
                K = true;
            }
        }
        if (org.telegram.ui.h4.v().V) {
            K = true;
        }
        this.f49319n0.setPaused(K);
        n7 n7Var = this.f49346z0;
        if (n7Var != null) {
            if (K) {
                n7Var.pause();
            } else {
                n7Var.play(B1);
            }
        }
        this.f49319n0.D0 = (this.f49344y || this.H0 || this.I0 || this.f49292a1 || this.f49305f1 || this.f49301e0 != 0.0f || this.f49313j1) ? false : false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == zs.f19723x5) {
            if (this.O0 == ((x4) objArr[0])) {
                H();
                e7 e7Var = this.f49319n0;
                x4 x4Var = this.O0;
                e7Var.D(this.h, x4Var.d, x4Var.h());
                f4 f4Var = this.f49342x;
                if (f4Var != null) {
                    TL_stories.StoryItem selectedStory = f4Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f49636i.size()) {
                        if (selectedStory != null && selectedStory.f20031id == ((jj) this.O0.f49636i.get(i12)).f16341l.f20031id) {
                            i13 = i12;
                        }
                        arrayList2.add(((jj) this.O0.f49636i.get(i12)).f16341l);
                        i12++;
                    }
                    this.f49342x.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == zs.f19709v5) {
            k7 k7Var = this.f49333t0;
            if (k7Var instanceof n5) {
                n5 n5Var = (n5) k7Var;
                if (n5Var.f49264r && !n5Var.f49263n) {
                    e5 O1 = vp.r1(this.h).O1();
                    if (n5Var.f49262f) {
                        arrayList = O1.h;
                    } else {
                        arrayList = O1.f48908g;
                    }
                    ArrayList<Long> dialogIds = this.f49319n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!n5Var.h || O1.L(o10)) && !dialogIds.contains(Long.valueOf(o10))) {
                            dialogIds.add(Long.valueOf(o10));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f49319n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            f4 f4Var2 = this.f49342x;
            if (f4Var2 != null) {
                ArrayList arrayList3 = f4Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((e3) arrayList3.get(i12)).b();
                    i12++;
                }
            }
        } else {
            int i15 = zs.f19591c1;
            if (i10 != i15 && i10 != zs.f19597d1) {
                if (i10 == zs.f19716w5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f20031id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            d0();
            if (i10 == i15) {
                n7 n7Var = this.f49346z0;
                if (n7Var != null) {
                    this.f49334t1 = n7Var.currentPosition;
                    this.f49346z0.release(null);
                    this.f49346z0 = null;
                    return;
                }
                this.f49334t1 = 0L;
            } else if (!this.f49332s1 && H() != null) {
                H().d1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        D(true);
    }

    @Override
    public final int e(int i10) {
        return i0.b.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: th.o7.e0():void");
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        vh.s2 s2Var = this.E0;
        if (s2Var != null) {
            s2Var.setOnFirstFrameCallback(oVar);
        }
        if (this.f49293b) {
            org.telegram.messenger.i0.E2(this.f49330s);
            this.f49303f.getLayoutContainer().addView(this.f49330s);
        } else {
            this.f49318n.addView(this.f49330s, this.f49327r);
        }
        vh.s2 s2Var2 = this.E0;
        if (s2Var2 != null) {
            s2Var2.b();
            this.E0 = null;
        }
        this.f49330s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final void h(int i10) {
        if (this.f49323p0 != i10) {
            this.f49323p0 = i10;
            this.f49319n0.setKeyboardHeight(i10);
            this.f49319n0.requestLayout();
            f4 f4Var = this.f49342x;
            if (f4Var != null) {
                f4Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final Bitmap i() {
        vh.s2 s2Var = this.E0;
        if (s2Var != null && s2Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean j() {
        return this.K0;
    }

    @Override
    public final cc k() {
        return null;
    }

    @Override
    public final Bitmap m() {
        vh.s2 s2Var = this.D0;
        if (s2Var != null && s2Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final void p() {
        z2 currentPeerView;
        boolean z10 = false;
        if (this.f49301e0 != 0.0f) {
            f4 f4Var = this.f49342x;
            if (f4Var.f48970y > 0) {
                org.telegram.messenger.i0.v1(f4Var);
                return;
            }
            y3 currentPage = f4Var.getCurrentPage();
            if (currentPage != null) {
                g3 g3Var = currentPage.f49675r;
                o3 o3Var = currentPage.f49673f;
                if (o3Var != null && o3Var.f10472a) {
                    o3Var.a();
                    return;
                } else if (Math.abs(currentPage.f49672c.getTranslationY() - g3Var.getPaddingTop()) > org.telegram.messenger.i0.L(2.0f)) {
                    g3Var.dispatchTouchEvent(org.telegram.messenger.i0.R());
                    g3Var.y0(0);
                    return;
                }
            }
            A(false);
            return;
        }
        e7 e7Var = this.f49319n0;
        if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.q0();
        }
        if (z10) {
            return;
        }
        D(true);
    }

    @Override
    public final boolean q() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f49303f;
        if (k2Var != null && H() != null && org.telegram.messenger.i0.W(k2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final View r() {
        vh.s2 s2Var = new vh.s2(this.D0.getContext(), this.h);
        this.E0 = s2Var;
        return s2Var;
    }

    @Override
    public final boolean s() {
        return !this.H0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f49335u0 = dialog;
            dialog.setOnDismissListener(new ag.x(this, 15));
            dialog.show();
            d0();
            return true;
        } catch (Throwable th2) {
            f8.g(th2, true);
            this.f49335u0 = null;
            return false;
        }
    }

    public final void x(boolean z10) {
        boolean z11;
        boolean z12 = org.telegram.messenger.v2.f18448a;
        if (this.m0 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.e != z11) {
            this.e = z11;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            vh.s2 s2Var = this.D0;
            if (s2Var != null) {
                s2Var.setSecure(!z11);
            }
            if (this.f49293b) {
                org.telegram.ui.ActionBar.k2 k2Var = this.f49303f;
                if (k2Var.getParentActivity() != null) {
                    if (z11) {
                        k2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.i0.h2();
                        return;
                    }
                    k2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.i0.h2();
                    return;
                }
                return;
            }
            if (z11) {
                this.f49327r.flags &= -8193;
                org.telegram.messenger.i0.h2();
            } else {
                this.f49327r.flags |= 8192;
                org.telegram.messenger.i0.h2();
            }
            try {
                this.f49318n.updateViewLayout(this.f49330s, this.f49327r);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void y() {
        if (this.H == null) {
            this.f49312j0 = false;
            this.f49316l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new w6(this, 2));
            this.H.addListener(new x6(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
            this.H.start();
        }
    }

    @Override
    public final boolean z() {
        if (this.f49293b && this.f49330s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void l(Canvas canvas) {
    }

    @Override
    public final void n(Canvas canvas) {
    }

    @Override
    public final void o(Runnable runnable) {
    }
}
