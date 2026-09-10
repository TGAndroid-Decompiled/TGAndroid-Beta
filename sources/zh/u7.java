package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hn0;
import org.telegram.ui.iw0;
public final class u7 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.l2, rf.a {
    public static boolean A1;
    public static boolean D1;
    public static boolean f48915x1;
    public static TL_stories.StoryItem f48917z1;
    public t0 A0;
    public m7 B0;
    public SurfaceView C0;
    public bi.f5 D0;
    public boolean E;
    public bi.f5 E0;
    public ValueAnimator F;
    public Uri F0;
    public ValueAnimator G;
    public k2.v G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public final AnimationNotificationsLocker J0;
    public float K;
    public boolean K0;
    public float L;
    public boolean L0;
    public p5 M;
    public final ArrayList M0;
    public float N;
    public boolean N0;
    public float O;
    public a5 O0;
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
    public boolean f48919a0;
    public boolean f48920a1;
    public float f48922b0;
    public final j2 f48923b1;
    public boolean f48925c0;
    public boolean f48926c1;
    public float f48927d0;
    public g6 f48928d1;
    public float f48929e0;
    public final LongSparseIntArray f48930e1;
    public final org.telegram.ui.ActionBar.p2 f48931f;
    public boolean f48932f0;
    public boolean f48933f1;
    public boolean f48934g0;
    public boolean f48935g1;
    public int h;
    public boolean f48936h0;
    public boolean f48937h1;
    public GestureDetector f48938i0;
    public boolean f48939i1;
    public boolean f48940j0;
    public boolean f48941j1;
    public boolean f48942k0;
    public boolean f48943k1;
    public boolean f48944l0;
    public boolean l1;
    public boolean m0;
    public boolean f48945m1;
    public WindowManager f48946n;
    public k7 f48947n0;
    public k5 f48948n1;
    public j2 f48950o1;
    public int f48951p0;
    public boolean f48952p1;
    public boolean f48953q0;
    public float f48954q1;
    public WindowManager.LayoutParams f48955r;
    public float f48956r0;
    public boolean f48957r1;
    public i7 f48958s;
    public final r7 f48959s0;
    public boolean f48960s1;
    public q7 f48961t0;
    public long f48962t1;
    public Dialog f48963u0;
    public n5 f48964u1;
    public j7 v;
    public org.telegram.ui.ActionBar.l2 f48965v0;
    public ValueAnimator f48966v1;
    public g4 f48967w;
    public boolean f48968w0;
    public boolean f48969w1;
    public boolean f48970x;
    public final ArrayList f48971x0;
    public org.telegram.ui.m4 f48973y0;
    public t7 f48974z0;
    public static final ArrayList f48916y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f48918a = SharedConfig.useSurfaceInStories;
    public boolean f48921b = true;
    public boolean f48924c = false;
    public boolean d = false;
    public boolean e = true;
    public final b f48972y = new b();
    public final RectF T = new RectF();
    public final float[] f48949o0 = new float[2];

    public u7(org.telegram.ui.ActionBar.p2 p2Var) {
        ?? obj = new Object();
        obj.f48848k = 1.0f;
        this.f48959s0 = obj;
        this.f48971x0 = new ArrayList();
        this.H0 = true;
        this.J0 = new AnimationNotificationsLocker();
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f48923b1 = new j2(this, 4);
        this.f48930e1 = new LongSparseIntArray();
        new Paint(1);
        this.f48931f = p2Var;
    }

    public static void J(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f17435id << 16), editable);
        }
    }

    public static boolean i(u7 u7Var, i7 i7Var, float f7, float f10, boolean z10) {
        t1 t1Var;
        t1 t1Var2;
        if (i7Var != null) {
            if (!u7Var.X0) {
                if (u7Var.f48967w == null || u7Var.f48929e0 == 0.0f) {
                    a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.G0(currentPeerView, ((f7 - u7Var.v.getX()) - u7Var.f48947n0.getX()) - currentPeerView.getX(), ((f10 - u7Var.v.getY()) - u7Var.f48947n0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f48218v2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (t1Var2 = currentPeerView.f48157b2) != null && t1Var2.getVisibility() == 0) {
                        if (f10 > currentPeerView.f48157b2.getY() + currentPeerView.getY() + u7Var.f48947n0.getY() + u7Var.v.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (t1Var = currentPeerView.f48157b2) != null && t1Var.w0()) || u7Var.f48964u1 != null) {
                        return true;
                    }
                    return AndroidUtilities.findClickableView(i7Var, f7, f10, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void j(u7 u7Var) {
        hn0 hn0Var;
        fu editField;
        a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.f48157b2 != null && (((hn0Var = currentPeerView.f48158b3) == null || hn0Var.getVisibility() != 0) && (editField = currentPeerView.f48157b2.getEditField()) != null)) {
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
            AndroidUtilities.runOnUIThread(new j2(u7Var, 6), 200L);
            return;
        }
        u7Var.m();
    }

    public static void k(u7 u7Var) {
        float clamp01 = Utilities.clamp01(Math.abs(Math.max(u7Var.X, u7Var.W) / AndroidUtilities.dp(80.0f)));
        if (u7Var.V != clamp01) {
            u7Var.V = clamp01;
            u7Var.o();
            a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f48226x2) {
                currentPeerView.invalidate();
            }
            t0 t0Var = u7Var.A0;
            if (t0Var != null) {
                t0Var.v((1.0f - u7Var.V) * u7Var.U);
            }
        }
        i7 i7Var = u7Var.f48958s;
        if (i7Var != null) {
            i7Var.invalidate();
        }
    }

    public static CharSequence u(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f17435id << 16), "");
    }

    public static boolean x(MessageObject messageObject) {
        if (f48917z1 == null || ((messageObject.type != 23 && !messageObject.isWebpage()) || A1 || f48917z1.messageId != messageObject.getId() || f48917z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public final void A(int i10, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i11, a5 a5Var, TL_stories.PeerStories peerStories, q7 q7Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean isContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.f48971x0;
        if (!isContextSafe) {
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
        t7 t7Var = this.f48974z0;
        if (t7Var != null) {
            t7Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!AndroidUtilities.isTablet() && !this.f48957r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48921b = z11;
        if (SharedConfig.useSurfaceInStories && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f48918a = z12;
        if (storyItem == null) {
            i12 = 0;
        } else {
            i12 = storyItem.messageId;
        }
        this.U0 = i12;
        if (storyItem != null && a5Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f48917z1 = storyItem;
        }
        this.O0 = a5Var;
        this.Q0 = peerStories;
        this.f48961t0 = q7Var;
        this.R0 = z10;
        this.h = i10;
        this.W = 0.0f;
        this.X = 0.0f;
        k7 k7Var = this.f48947n0;
        if (k7Var != null) {
            k7Var.setHorizontalProgressToDismiss(0.0f);
            this.f48947n0.F0 = 0;
        }
        this.f48927d0 = 0.0f;
        this.Z = 0.0f;
        this.f48944l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.f48920a1 = false;
        this.Z0 = false;
        this.f48930e1.clear();
        AndroidUtilities.cancelRunOnUIThread(this.f48923b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f48955r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.f48955r.flags = -2147417728;
        this.H0 = false;
        this.f48926c1 = false;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (this.f48958s == null) {
            this.f48938i0 = new GestureDetector(new e7(this));
            this.f48958s = new i7(this, context, R);
        }
        if (this.v == null) {
            this.v = new j7(context, this);
            k7 k7Var2 = new k7(this, this.h, context, this, this.f48972y);
            this.f48947n0 = k7Var2;
            k7Var2.setDelegate(new l7(this, a5Var, arrayList, context));
            this.v.addView(this.f48947n0, w7.a6.e(-1, -1, 1));
            this.f48973y0 = new org.telegram.ui.m4(context);
            if (this.f48918a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f48973y0.addView(this.C0);
            } else {
                m7 m7Var = new m7(context, this);
                this.B0 = m7Var;
                this.f48973y0.addView(m7Var);
            }
            bi.f5 f5Var = new bi.f5(context, this.h);
            this.D0 = f5Var;
            f5Var.setVisibility(8);
            this.f48973y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f48452a = paint;
            view.f48454c = new sg.a1(view, 12);
            view.d = new org.telegram.ui.Components.d6((View) view);
            view.e = new org.telegram.ui.Components.d6((View) view);
            paint.setColor(-1);
            this.f48928d1 = view;
            this.v.addView((View) view, w7.a6.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        bi.f5 f5Var2 = this.D0;
        if (f5Var2 != null) {
            f5Var2.setAccount(this.h);
        }
        AndroidUtilities.removeFromParent(this.f48973y0);
        this.f48958s.addView(this.f48973y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.v);
        this.f48958s.addView(this.v);
        this.f48958s.setClipChildren(false);
        if (this.N0) {
            Q();
        }
        if (a5Var != null) {
            this.f48947n0.D(this.h, a5Var.d, a5Var.h());
        } else {
            k7 k7Var3 = this.f48947n0;
            int i13 = this.h;
            k7Var3.A0 = arrayList;
            k7Var3.f48419y0 = i13;
            k7Var3.setAdapter(null);
            k7Var3.setAdapter(k7Var3.f48420z0);
            k7Var3.setCurrentItem(i11);
            k7Var3.C0 = true;
        }
        this.f48946n = (WindowManager) context.getSystemService("window");
        if (R == null || R.getLayoutContainer() == null || R.isSupportEdgeToEdge()) {
            this.f48921b = false;
        }
        if (this.f48921b && R != null && R.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f48924c = z14;
        j7 j7Var = this.v;
        th.e eVar = new th.e(this, 27);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(j7Var, eVar);
        if (this.f48921b) {
            AndroidUtilities.removeFromParent(this.f48958s);
            this.f48958s.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            R.getLayoutContainer().addView(this.f48958s);
            if (!this.f48924c) {
                AndroidUtilities.requestAdjustResize(R.getParentActivity(), R.getClassGuid());
            }
        } else {
            this.f48958s.setFocusable(false);
            this.v.setFocusable(false);
            this.v.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.f48946n, this.f48958s, this.f48955r);
            this.f48946n.addView(this.f48958s, this.f48955r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f48958s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
            }
        }
        this.f48958s.requestLayout();
        A1 = true;
        Q();
        this.U = 0.0f;
        o();
        f48915x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f48958s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f48921b) {
            z(true);
        }
        if (!this.f48921b) {
            f48916y1.add(this);
        }
        if (R != null) {
            AndroidUtilities.hideKeyboard(R.getFragmentView());
        }
    }

    public final void B(int i10, Context context, TL_stories.StoryItem storyItem, q7 q7Var) {
        if (storyItem != null) {
            this.h = i10;
            if (storyItem.dialogId <= 0 || MessagesController.getInstance(i10).getUser(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && MessagesController.getInstance(this.h).getChat(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                A(i10, context, storyItem, arrayList, 0, null, null, q7Var, false);
            }
        }
    }

    public final void C(Context context, int i10, a5 a5Var, s5 s5Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(a5Var.d));
        this.P0 = i10;
        F(context, null, arrayList, 0, a5Var, null, s5Var, false);
    }

    public final void D(Context context, long j3, q7 q7Var) {
        this.h = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        i5 storiesController = MessagesController.getInstance(this.h).getStoriesController();
        int i10 = storiesController.f48499a;
        TL_stories.PeerStories y3 = storiesController.y(j3);
        if (y3 != null) {
            int i11 = 0;
            while (i11 < y3.stories.size()) {
                if (a6.w(i10, y3.stories.get(i11))) {
                    y3.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (y3.stories.isEmpty() && !storiesController.J(j3)) {
                storiesController.f48503g.remove(y3);
                storiesController.h.remove(y3);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        F(context, null, arrayList, 0, null, null, q7Var, false);
    }

    public final void E(Context context, TL_stories.PeerStories peerStories, q7 q7Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            F(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, q7Var, false);
            return;
        }
        this.f48971x0.clear();
    }

    public final void F(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, a5 a5Var, TL_stories.PeerStories peerStories, q7 q7Var, boolean z10) {
        A(UserConfig.selectedAccount, context, storyItem, arrayList, i10, a5Var, peerStories, q7Var, z10);
    }

    public final void G(Context context, TL_stories.StoryItem storyItem, s5 s5Var) {
        B(UserConfig.selectedAccount, context, storyItem, s5Var);
    }

    public final void H(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (this.f48921b) {
            R.presentFragment(p2Var);
            return;
        }
        R.presentFragment(p2Var);
        q(false);
    }

    public final void I() {
        ArrayList arrayList;
        this.F0 = null;
        K(false);
        l(true);
        t7 t7Var = this.f48974z0;
        if (t7Var != null) {
            t7Var.release(null);
            this.f48974z0 = null;
        }
        bi.f5 f5Var = this.D0;
        if (f5Var != null) {
            f5Var.d(0L, null);
        }
        t0 t0Var = this.A0;
        if (t0Var != null) {
            x0 x0Var = x0.Z;
            if (!x0Var.S || x0Var.v != t0Var) {
                if (t0Var.f48882n) {
                    t0Var.s(null);
                } else {
                    t0Var.e();
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
            ((t7) arrayList.get(i10)).release(null);
            i10++;
        }
        arrayList.clear();
        a0.i iVar = MessagesController.getInstance(this.h).getStoriesController().f48508m;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            ((d8) iVar.n(i11)).b(false);
        }
        if (this.f48921b) {
            z(false);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f48931f;
        if (p2Var != null) {
            p2Var.removeSheet(this);
        }
        f48916y1.remove(this);
        this.f48971x0.clear();
        this.f48929e0 = 0.0f;
        f48917z1 = null;
    }

    public final void K(boolean z10) {
        this.f48953q0 = z10;
        if (z10) {
            sg.a1 a1Var = this.f48928d1.f48454c;
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            a1Var.run();
        }
        P();
    }

    public final void L(boolean z10) {
        a3 currentPeerView;
        a3 currentPeerView2;
        z2 z2Var;
        t7 t7Var;
        k2.v vVar;
        if (this.f48920a1 != z10) {
            this.f48920a1 = z10;
            if (z10 && !this.f48933f1 && (currentPeerView2 = this.f48947n0.getCurrentPeerView()) != null && (z2Var = currentPeerView2.O1) != null && !z2Var.f49132f && z2Var.f49130b == null) {
                if (!this.f48942k0 && !this.f48940j0 && (vVar = this.G0) != null && ((t7) vVar.f12226c) != null) {
                    currentPeerView2.f48160c1.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                k2.v vVar2 = this.G0;
                if (vVar2 != null && (t7Var = (t7) vVar2.f12226c) != null && !this.f48942k0) {
                    t7Var.setSeeking(true);
                }
                this.f48942k0 = true;
            }
            P();
            k7 k7Var = this.f48947n0;
            if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f48920a1);
            }
        }
    }

    public final void M(boolean z10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f48921b && launchActivity != null) {
            if (z10) {
                this.f48968w0 = AndroidUtilities.getLightNavigationBar(launchActivity.getWindow());
            }
            if (this.f48968w0) {
                AndroidUtilities.setLightNavigationBar(launchActivity, !z10);
            }
        }
    }

    public final void N() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (this.A0 != null && (p2Var = this.f48931f) != null && this.D0 != null) {
            Activity findActivity = AndroidUtilities.findActivity(p2Var.getContext());
            if (sf.c.a(findActivity) > 0) {
                x0.o(findActivity, this.A0);
                q(true);
            }
        }
    }

    public final void O() {
        boolean z10 = D1;
        D1 = !z10;
        t7 t7Var = this.f48974z0;
        int i10 = 0;
        if (t7Var != null) {
            t7Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((t7) arrayList.get(i10)).setAudioEnabled(!D1, true);
            i10++;
        }
        a3 currentPeerView = this.f48947n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f48225x1.a(D1, true);
        }
        if (!D1) {
            this.f48928d1.b();
        }
    }

    public final void P() {
        if (this.f48947n0 == null) {
            return;
        }
        boolean w10 = w();
        boolean z10 = true;
        if (this.f48921b) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f48931f;
            if (p2Var.isPaused() || !p2Var.isLastFragment()) {
                w10 = true;
            }
        }
        if (org.telegram.ui.j4.x().V) {
            w10 = true;
        }
        this.f48947n0.setPaused(w10);
        t7 t7Var = this.f48974z0;
        if (t7Var != null) {
            if (w10) {
                t7Var.pause();
            } else {
                t7Var.play(B1);
            }
        }
        this.f48947n0.D0 = (this.f48970x || this.H0 || this.I0 || this.f48920a1 || this.f48933f1 || this.f48929e0 != 0.0f || this.f48941j1) ? false : false;
    }

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: zh.u7.Q():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        bi.f5 f5Var = this.E0;
        if (f5Var != null) {
            f5Var.setOnFirstFrameCallback(pVar);
            this.A0.s(this.E0.getSink());
        }
        if (this.f48921b) {
            AndroidUtilities.removeFromParent(this.f48958s);
        } else {
            this.f48946n.removeView(this.f48958s);
        }
        this.f48958s.invalidate();
    }

    @Override
    public final boolean attachedToParent() {
        if (this.f48921b && this.f48958s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        bi.f5 f5Var = this.E0;
        if (f5Var != null) {
            f5Var.setOnFirstFrameCallback(pVar);
        }
        if (this.f48921b) {
            AndroidUtilities.removeFromParent(this.f48958s);
            this.f48931f.getLayoutContainer().addView(this.f48958s);
        } else {
            this.f48946n.addView(this.f48958s, this.f48955r);
        }
        bi.f5 f5Var2 = this.E0;
        if (f5Var2 != null) {
            f5Var2.b();
            this.E0 = null;
        }
        this.f48958s.invalidate();
        this.A0.s(this.D0.getSink());
    }

    @Override
    public final Bitmap c() {
        bi.f5 f5Var = this.E0;
        if (f5Var != null && f5Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (this.O0 == ((a5) objArr[0])) {
                t();
                k7 k7Var = this.f48947n0;
                a5 a5Var = this.O0;
                k7Var.D(this.h, a5Var.d, a5Var.h());
                g4 g4Var = this.f48967w;
                if (g4Var != null) {
                    TL_stories.StoryItem selectedStory = g4Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (i12 < this.O0.f48240i.size()) {
                        if (selectedStory != null && selectedStory.f17435id == ((MessageObject) this.O0.f48240i.get(i12)).storyItem.f17435id) {
                            i13 = i12;
                        }
                        arrayList2.add(((MessageObject) this.O0.f48240i.get(i12)).storyItem);
                        i12++;
                    }
                    this.f48967w.b(i13, this.O0.d, arrayList2);
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            q7 q7Var = this.f48961t0;
            if (q7Var instanceof s5) {
                s5 s5Var = (s5) q7Var;
                if (s5Var.f48870r && !s5Var.f48869n) {
                    i5 storiesController = MessagesController.getInstance(this.h).getStoriesController();
                    if (s5Var.f48868f) {
                        arrayList = storiesController.h;
                    } else {
                        arrayList = storiesController.f48503g;
                    }
                    ArrayList<Long> dialogIds = this.f48947n0.getDialogIds();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
                        if ((!s5Var.h || storiesController.J(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                            dialogIds.add(Long.valueOf(peerDialogId));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f48947n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            g4 g4Var2 = this.f48967w;
            if (g4Var2 != null) {
                ArrayList arrayList3 = g4Var2.h.G;
                while (i12 < arrayList3.size()) {
                    ((f3) arrayList3.get(i12)).b();
                    i12++;
                }
            }
        } else {
            int i15 = NotificationCenter.openArticle;
            if (i10 != i15 && i10 != NotificationCenter.articleClosed) {
                if (i10 == NotificationCenter.storyDeleted) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f17435id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            P();
            if (i10 == i15) {
                t7 t7Var = this.f48974z0;
                if (t7Var != null) {
                    this.f48962t1 = t7Var.currentPosition;
                    this.f48974z0.release(null);
                    this.f48974z0 = null;
                    return;
                }
                this.f48962t1 = 0L;
            } else if (!this.f48960s1 && t() != null) {
                t().f1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        q(true);
    }

    @Override
    public final Bitmap e() {
        bi.f5 f5Var = this.D0;
        if (f5Var != null && f5Var.a()) {
            return this.D0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f48931f;
        if (p2Var != null && t() != null && AndroidUtilities.findActivity(p2Var.getContext()) != null && this.A0 != null && this.D0 != null && !this.H0) {
            return true;
        }
        return false;
    }

    @Override
    public final wc getBulletinFactory() {
        return null;
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i10, -16777216);
    }

    @Override
    public final View getWindowView() {
        return this.f48958s;
    }

    @Override
    public final View h() {
        bi.f5 f5Var = new bi.f5(this.D0.getContext(), this.h);
        this.E0 = f5Var;
        return f5Var;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.K0;
    }

    @Override
    public final boolean isShown() {
        return !this.H0;
    }

    public final void l(boolean z10) {
        boolean z11;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
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
                bi.f5 f5Var = this.D0;
                if (f5Var != null) {
                    f5Var.setSecure(!z11);
                }
                if (this.f48921b) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f48931f;
                    if (p2Var.getParentActivity() != null) {
                        if (z11) {
                            p2Var.getParentActivity().getWindow().clearFlags(8192);
                            AndroidUtilities.logFlagSecure();
                            return;
                        }
                        p2Var.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                    return;
                }
                if (z11) {
                    this.f48955r.flags &= -8193;
                    AndroidUtilities.logFlagSecure();
                } else {
                    this.f48955r.flags |= 8192;
                    AndroidUtilities.logFlagSecure();
                }
                try {
                    this.f48946n.updateViewLayout(this.f48958s, this.f48955r);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f48940j0 = false;
            this.f48944l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new c7(this, 2));
            this.H.addListener(new d7(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
            this.H.start();
        }
    }

    public final void n(boolean z10) {
        if (this.f48966v1 == null) {
            if (this.f48951p0 != 0) {
                AndroidUtilities.hideKeyboard(this.f48967w);
                return;
            }
            float f7 = 0.0f;
            if (!this.f48925c0 && this.f48929e0 == 0.0f) {
                return;
            }
            this.J0.lock();
            if (!z10) {
                float f10 = this.f48929e0;
                g4 g4Var = this.f48967w;
                float f11 = g4Var.f48442c;
                if (f10 == f11) {
                    float f12 = f11 - 1.0f;
                    this.f48929e0 = f12;
                    g4Var.setOffset(f12);
                }
            }
            float f13 = this.f48929e0;
            if (z10) {
                f7 = this.f48967w.f48442c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
            this.f48966v1 = ofFloat;
            ofFloat.addUpdateListener(new c7(this, 3));
            this.f48966v1.addListener(new iw0(17, this, z10));
            if (z10) {
                this.f48966v1.setDuration(350L);
                this.f48966v1.setInterpolator(wr.h);
            } else {
                this.f48966v1.setDuration(350L);
                this.f48966v1.setInterpolator(wr.f28819f);
            }
            this.f48966v1.start();
        }
    }

    public final void o() {
        LaunchActivity launchActivity;
        if (this.f48921b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        a3 currentPeerView;
        boolean z10 = false;
        if (this.f48929e0 != 0.0f) {
            g4 g4Var = this.f48967w;
            if (g4Var.f48448x > 0) {
                AndroidUtilities.hideKeyboard(g4Var);
                return true;
            }
            z3 currentPage = g4Var.getCurrentPage();
            if (currentPage != null) {
                h3 h3Var = currentPage.f49142r;
                p3 p3Var = currentPage.f49140f;
                if (p3Var != null && p3Var.f22473b) {
                    p3Var.a();
                    return true;
                } else if (Math.abs(currentPage.f49139c.getTranslationY() - h3Var.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                    h3Var.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    h3Var.x0(0);
                    return true;
                }
            }
            n(false);
            return true;
        }
        k7 k7Var = this.f48947n0;
        if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.s0();
        }
        if (z10) {
            return true;
        }
        q(true);
        return true;
    }

    public final void p() {
        if (this.f48967w == null) {
            g4 g4Var = new g4(this.v.getContext(), this);
            this.f48967w = g4Var;
            this.v.addView(g4Var, 0);
        }
        a3 currentPeerView = this.f48947n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.O0.f48240i.size(); i10++) {
                    arrayList.add(((MessageObject) this.O0.f48240i.get(i10)).storyItem);
                }
                this.f48967w.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f48967w.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void q(boolean z10) {
        AndroidUtilities.hideKeyboard(this.f48958s);
        this.H0 = true;
        this.f48937h1 = true;
        P();
        M(false);
        Q();
        this.J0.lock();
        this.f48922b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new c7(this, 0));
        if (!z10) {
            this.O = 0.0f;
            this.N = 0.0f;
            r7 r7Var = this.f48959s0;
            ImageReceiver imageReceiver = r7Var.f48842b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = r7Var.f48843c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            r7Var.f48843c = null;
            r7Var.f48842b = null;
        } else {
            y();
        }
        AndroidUtilities.runOnUIThread(new j2(this, 2), 16L);
        if (this.f48926c1) {
            this.f48926c1 = false;
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            O();
            return;
        }
        a3 currentPeerView = this.f48947n0.getCurrentPeerView();
        if (currentPeerView != null) {
            z2 z2Var = currentPeerView.O1;
            if (!z2Var.j() && z2Var.e) {
                currentPeerView.c1(true);
                return;
            }
        }
        this.f48928d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.f48971x0.add(runnable);
        }
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
        if (this.f48951p0 != i10) {
            this.f48951p0 = i10;
            this.f48947n0.setKeyboardHeight(i10);
            this.f48947n0.requestLayout();
            g4 g4Var = this.f48967w;
            if (g4Var != null) {
                g4Var.setKeyboardHeight(i10);
            }
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.f48963u0 = dialog;
            dialog.setOnDismissListener(new gg.o(this, 14));
            dialog.show();
            P();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            this.f48963u0 = null;
            return false;
        }
    }

    public final a3 t() {
        k7 k7Var = this.f48947n0;
        if (k7Var == null) {
            return null;
        }
        return k7Var.getCurrentPeerView();
    }

    public final void v() {
        if (this.m0) {
            AndroidUtilities.hideKeyboard(this.f48958s);
            this.H0 = true;
            this.K0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            P();
            this.O = 0.0f;
            this.N = 0.0f;
            r7 r7Var = this.f48959s0;
            ImageReceiver imageReceiver = r7Var.f48842b;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = r7Var.f48843c;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            r7Var.f48843c = null;
            r7Var.f48842b = null;
            j7 j7Var = this.v;
            if (j7Var != null) {
                j7Var.a(true);
            }
            this.J0.unlock();
            k2.v vVar = this.G0;
            if (vVar != null) {
                vVar.b();
            }
            I();
            if (this.f48921b) {
                AndroidUtilities.removeFromParent(this.f48958s);
            } else {
                this.f48946n.removeView(this.f48958s);
            }
            this.f48958s = null;
            this.m0 = false;
            this.d = false;
            o();
            j2 j2Var = this.f48950o1;
            if (j2Var != null) {
                j2Var.run();
                this.f48950o1 = null;
            }
        }
    }

    public final boolean w() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f48953q0 && !this.f48970x && this.f48963u0 == null && this.f48965v0 == null && !this.H0 && !this.I0 && this.U == 1.0f && this.f48929e0 == 0.0f && !this.f48939i1) {
            if ((!this.l1 || !this.f48918a) && !this.f48943k1 && !this.f48941j1 && !this.f48952p1 && this.V == 0.0f && this.f48964u1 == null) {
                if (!this.f48921b || (p2Var = this.f48931f) == null || p2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: zh.u7.y():void");
    }

    public final void z(boolean z10) {
        int i10;
        Activity findActivity = AndroidUtilities.findActivity(this.f48931f.getContext());
        if (findActivity != null) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            try {
                findActivity.setRequestedOrientation(i10);
            } catch (Exception unused) {
            }
            if (z10) {
                findActivity.getWindow().addFlags(128);
            } else {
                findActivity.getWindow().clearFlags(128);
            }
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        q(true);
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }
}
